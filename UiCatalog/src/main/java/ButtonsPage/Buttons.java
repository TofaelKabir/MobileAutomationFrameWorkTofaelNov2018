package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    WebElement backgroundImage;
    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    WebElement buttonWithImage;

    public void backgroundImageClick(){
        backgroundImage.click();
    }
    public void buttonWithImageClick(){
        backgroundImage.click();
    }
}
