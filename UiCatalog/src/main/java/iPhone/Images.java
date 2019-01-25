package iPhone;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Images extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    WebElement imagesPageWhole;
    public void checkImagesPageWhole(){
        imagesPageWhole.click();
    }
    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"Images\"]")
    WebElement images;
    public void checkImages(){
        images.click();
    }
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Duration\"]")
    WebElement durationSymbol;
    public void checkDurationSymbol(){
        durationSymbol.click();
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Duration\"]")
    WebElement durationText;
    public void checkDurationText(){
        durationText.click();
    }
}
