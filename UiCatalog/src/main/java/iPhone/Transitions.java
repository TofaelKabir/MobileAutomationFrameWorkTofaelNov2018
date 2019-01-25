package iPhone;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Transitions extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    WebElement transitionsPageWhole;
    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Images\"]")
    WebElement transitionsPageImages;
    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Images\"]")
    WebElement transitionsPageFlipImages;
    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Images\"]")
    WebElement transitionsPageCurlImages;

    public void checkTransitionsPageWhole(){
        transitionsPageWhole.click();
    }
    public void checkTransitionsPageImages(){
        transitionsPageImages.click();
    }
    public void checkTransitionsPageFlipImages(){
        transitionsPageFlipImages.click();
    }
    public void checkTransitionsPageCurlImages(){
        transitionsPageCurlImages.click();
    }

}
