package iPhone;

import AlertsPage.Alerts;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAlerts extends Alerts {

    public Alerts alerts(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getAlerts();
        return PageFactory.initElements(ad, Alerts.class);
    }
    @Test
    public void testAlertPageWhole() throws InterruptedException {
        alerts().checkAlertPageWhole();
        sleep(2);
    }
    @Test
    public void testAlertPageUIActionSheet() throws InterruptedException {
        alerts().checkAlertPageUIActionSheet();
        sleep(2);
    }
    @Test
    public void testAlertPageShowSimple() throws InterruptedException {
        alerts().checkAlertPageShowSimple();
        sleep(2);
    }
    @Test
    public void testAlertPageDialogSimpleAction() throws InterruptedException {
        alerts().checkAlertPageDialogSimpleAction();
        sleep(2);
    }
    @Test
    public void testAlertPageShowOkCancel() throws InterruptedException {
        alerts().checkAlertPageShowOkCancel();
        sleep(2);
    }
    @Test
    public void testAlertPageDialogOkCancelAction() throws InterruptedException {
        alerts().checkAlertPageDialogOkCancelAction();
        sleep(2);
    }
    @Test
    public void testAlertPageShowCustomized() throws InterruptedException {
        alerts().checkAlertPageShowCustomized();
        sleep(2);
    }
    @Test
    public void testAlertPageDialogOtherAction() throws InterruptedException {
        alerts().checkAlertPageDialogOtherAction();
        sleep(2);
    }
    @Test
    public void testAlertPageUIAlertView() throws InterruptedException {
        alerts().checkAlertPageUIAlertView();
        sleep(2);
    }
    @Test
    public void testAlertPageUIAlertViewShowSimple() throws InterruptedException {
        alerts().checkAlertPageUIAlertViewShowSimple();
        sleep(2);
    }
    @Test
    public void testAlertPageUIAlertViewSimpleAction() throws InterruptedException {
        alerts().checkAlertPageUIAlertViewSimpleAction();
        sleep(2);
    }
}
