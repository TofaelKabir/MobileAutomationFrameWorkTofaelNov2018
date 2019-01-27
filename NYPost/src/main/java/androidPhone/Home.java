package androidPhone;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[1]")
    public static WebElement logo;
    public void checkLogo(){
        logo.click();
    }
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    public void checkMenu(){
        menu.click();
    }
    @FindBy(id = "br.com.golmobile.nypost:id/turn_on_notifications_item")
    public static WebElement notification;
    public void checkNotification(){
        notification.click();
    }
}
