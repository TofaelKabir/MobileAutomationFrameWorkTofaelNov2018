package TextFieldsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFields extends Base{
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Normal\"]")
    WebElement UiTextField;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Rounded\"]") WebElement UiTextFieldRounded;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Secure\"]") WebElement UiTextFieldSecure;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Check\"]") WebElement UiTextFieldLeftView;

    public void clickOnUiTextField(){
        UiTextField.click();
    }
    public void clickOnUiTextFieldRounded(){
        UiTextFieldRounded.click();
    }
    public void clickOnUiTextFieldSecure(){
        UiTextFieldSecure.click();
    }
    public void clickOnUiTextFieldLeftView(){
        UiTextFieldLeftView.click();
    }

    public void inputDataOnUiTextField(){
        UiTextField.sendKeys("Hello");
    }
    public void inputDataOnUiTextFieldRounded(){
        UiTextFieldRounded.sendKeys("Love you Bangladesh");
    }
    public void inputDataOnUiTextFieldSecure(){
        UiTextFieldSecure.sendKeys("Love you America");
    }
    public void inputDataOnUiTextFieldLeftView(){
        UiTextFieldLeftView.sendKeys("Welcome");
    }

    public void inputDataOnAllField(){
        inputDataOnUiTextField();
        inputDataOnUiTextFieldRounded();
        inputDataOnUiTextFieldSecure();
        inputDataOnUiTextFieldLeftView();
    }
}