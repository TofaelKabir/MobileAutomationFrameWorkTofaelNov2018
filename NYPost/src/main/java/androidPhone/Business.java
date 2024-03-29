package androidPhone;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;

public class Business extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]")
    public static WebElement business;

    public void businessNews() throws InterruptedException {
        menu.click();
        sleep(2);
        business.click();
        scrollAndClickByName("Jeff Bezos gives a pitiful amount of his $160B fortune to charity");
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "Jeff Bezos gives a pitiful amount of his $160B fortune to charity";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
        String actual = ad.findElement(By.linkText("January 26, 2019 | 1:25pm")).getText();
        String expected = "January 26, 2019 | 1:25pm";
        Assert.assertEquals(actual,expected);
        System.out.println(actual);
    }
}
