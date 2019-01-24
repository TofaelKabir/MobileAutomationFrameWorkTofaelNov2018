package iPhone;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Segments extends Base {
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    WebElement uISegementedControlButton;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[2]") WebElement uISegementControlStyleBordered;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]") WebElement uISegementControlStyleBar;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[4]") WebElement uISegementControlStyleBarTint;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[5]") WebElement uISegementControlStyleBarImage;

    public void clickOnUISegementedControlButton(){
        uISegementedControlButton.click();
    }
    public void clickOnUISegementControlStyleBordered(){
        uISegementControlStyleBordered.click();
    }
    public void clickOnUISegementControlStyleBar(){
        uISegementControlStyleBar.click();
    }
    public void clickOnUISegementControlStyleBarTint(){
        uISegementControlStyleBarTint.click();
    }
    public void clickOnUISegementControlStyleBarImage(){
        uISegementControlStyleBarImage.click();
    }
}
