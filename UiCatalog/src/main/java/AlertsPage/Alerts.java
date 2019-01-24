package AlertsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alerts extends Base {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
    WebElement alertPageWhole;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Secure Text Input\"]")
    WebElement alertPageUIActionSheet;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    WebElement alertPageShowSimple;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AlertsViewController.m - dialogSimpleAction\"]")
    WebElement alertPageDialogSimpleAction;
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    WebElement alertPageShowOkCancel;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AlertsViewController.m - dialogSimpleAction\"]")
    WebElement alertPageDialogOkCancelAction;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Show Customized\"]")
    WebElement alertPageShowCustomized;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"AlertsViewController.m - dialogOtherAction\"]")
    WebElement alertPageDialogOtherAction;
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"UIAlertView\"])[1]")
    WebElement alertPageUIAlertView;
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]")
    WebElement alertPageUIAlertViewShowSimple;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"AlertsViewController.m - alertSimpleAction\"]")
    WebElement alertPageUIAlertViewSimpleAction;

    public void checkAlertPageWhole(){
        alertPageWhole.click();
    }
    public void checkAlertPageUIActionSheet(){
        alertPageUIActionSheet.click();
    }
    public void checkAlertPageShowSimple(){
        alertPageShowSimple.click();
    }
    public void checkAlertPageDialogSimpleAction(){
        alertPageDialogSimpleAction.click();
    }
    public void checkAlertPageShowOkCancel(){
        alertPageShowOkCancel.click();
    }
    public void checkAlertPageDialogOkCancelAction(){
        alertPageDialogOkCancelAction.click();
    }
    public void checkAlertPageShowCustomized(){
        alertPageShowCustomized.click();
    }
    public void checkAlertPageDialogOtherAction(){
        alertPageDialogOtherAction.click();
    }
    public void checkAlertPageUIAlertView(){
        alertPageUIAlertView.click();
    }
    public void checkAlertPageUIAlertViewShowSimple(){
        alertPageUIAlertViewShowSimple.click();
    }
    public void checkAlertPageUIAlertViewSimpleAction(){
        alertPageUIAlertViewSimpleAction.click();
    }
}
