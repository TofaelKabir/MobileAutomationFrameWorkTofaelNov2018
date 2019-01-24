package iPhone;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
    public static WebElement buttonsWholePage;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contact Add\"]")
    public static WebElement uIButton;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Background Image\"]")
    WebElement backgroundImage;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    public static WebElement gray;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ButtonsViewController.m: (UIButton *)grayButton\"]\n")
    public static WebElement grayButton;
    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    public static WebElement buttonWithImage;
    @FindBy (xpath = "xpath\t//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    public static WebElement rightPointingArrow;
    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    public static WebElement textImageButton;
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"UIButtonTypeRoundedRect\"])[1]")
    public static WebElement uIButtonTypeRoundedRect;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Rounded Button\"]")
    public static WebElement roundedButton;
    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Rounded\"]")
    public static WebElement roundedSymbol;
    @FindBy(xpath = "/XCUIElementTypeStaticText[@name=\"ButtonsViewController.m: (UIButton *)roundedButtonType\"]")
    public static WebElement roundedButtonType;

    public void checkButtonsWholePage(){
        buttonsWholePage.click();
    }
    public void checkUIButton(){
        uIButton.click();
    }
    public void checkBackgroundImage(){
        backgroundImage.click();
    }
    public void checkGray(){
        gray.click();
    }
    public void checkGrayButton(){
        grayButton.click();
    }
    public void checkButtonWithImage(){
        buttonWithImage.click();
    }
    public void checkRightPointingArrow(){
        rightPointingArrow.click();
    }
    public void checkTextImageButton(){
        textImageButton.click();
    }
    public void checkUIButtonTypeRoundedRect(){
        uIButtonTypeRoundedRect.click();
    }
    public void checkRoundedButton(){
        roundedButton.click();
    }
    public void checkRoundedSymbol(){
        roundedSymbol.click();
    }
    public void checkRoundedButtonType(){
        roundedButtonType.click();
    }

}
