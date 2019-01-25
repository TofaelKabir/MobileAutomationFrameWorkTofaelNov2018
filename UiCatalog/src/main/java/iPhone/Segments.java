package iPhone;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Segments extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentedControl:\"]")
    WebElement uISegmentedControl;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[1]")
    WebElement uISegmentedControlCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    WebElement uISegmentedControlSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[1]")
    WebElement uISegmentedControlTools;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBordered:\"]")
    WebElement uISegmentControlStyleBordered;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[2]")
    WebElement uISegmentControlStyleBorderedCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[2]")
    WebElement uISegmentControlStyleBorderedSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[2]")
    WebElement uISegmentControlStyleBorderedTools;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBar:\"]")
    WebElement uISegmentControlStyleBar;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[3]")
    WebElement uISegmentControlStyleBarCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]")
    WebElement uISegmentControlStyleBarSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[3]")
    WebElement uISegmentControlStyleBarTools;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBar: tint\"]")
    WebElement uISegmentControlStyleBarTint;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[4]")
    WebElement uISegmentControlStyleBarTintCheck;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"])[4]")
    WebElement uISegmentControlStyleBarTintSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[4]")
    WebElement uISegmentControlStyleBarTintTools;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UISegmentControlStyleBar: image\"]")
    WebElement uISegmentControlStyleBarImage;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[5]")
    WebElement uISegmentControlStyleBarImageCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[5]")
    WebElement uISegmentControlStyleBarImageSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[5]")
    WebElement uISegmentControlStyleBarImageTools;

    public void clickOnUISegmentedControl(){
        uISegmentedControl.click();
    }
    public void clickOnUISegmentedControlCheck(){
        uISegmentedControlCheck.click();
    }
    public void clickOnUISegmentedControlSearch(){
        uISegmentedControlSearch.click();
    }
    public void clickOnUISegmentedControlTools(){
        uISegmentedControlTools.click();
    }
    public void clickOnUISegmentControlStyleBordered(){
        uISegmentControlStyleBordered.click();
    }
    public void clickOnUISegmentControlStyleBorderedCheck(){
        uISegmentControlStyleBorderedCheck.click();
    }
    public void clickOnUISegmentControlStyleBorderedSearch(){
        uISegmentControlStyleBorderedSearch.click();
    }
    public void clickOnUISegmentControlStyleBorderedTools(){
        uISegmentControlStyleBorderedTools.click();
    }
    public void clickOnUISegmentControlStyleBar(){
        uISegmentControlStyleBar.click();
    }
    public void clickOnUISegmentControlStyleBarCheck(){
        uISegmentControlStyleBarCheck.click();
    }
    public void clickOnUISegmentControlStyleBarSearch(){
        uISegmentControlStyleBarSearch.click();
    }
    public void clickOnUISegmentControlStyleBarTools(){
        uISegmentControlStyleBarTools.click();
    }
    public void clickOnUISegmentControlStyleBarTint(){
        uISegmentControlStyleBarTint.click();
    }
    public void clickOnUISegmentControlStyleBarTintCheck(){
        uISegmentControlStyleBarTintCheck.click();
    }
    public void clickOnUISegmentControlStyleBarTintSearch(){
        uISegmentControlStyleBarTintSearch.click();
    }
    public void clickOnUISegmentControlStyleBarTintTools(){
        uISegmentControlStyleBarTintTools.click();
    }
    public void clickOnUISegmentControlStyleBarImage(){
        uISegmentControlStyleBarImage.click();
    }
    public void clickOnUISegmentControlStyleBarImageCheck(){
        uISegmentControlStyleBarImageCheck.click();
    }
    public void clickOnUISegmentControlStyleBarImageSearch(){
        uISegmentControlStyleBarImageSearch.click();
    }
    public void clickOnUISegmentControlStyleBarImageTools(){
        uISegmentControlStyleBarImageTools.click();
    }
}
