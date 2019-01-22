package iPhone;

import AlertsPage.Alerts;
import ButtonsPage.Buttons;
import UiCatalogPage.UiCatalog;
import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 9/5/15.
 */
public class ButtonTest extends Buttons {

Buttons buttons;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
    }
    @Test
    public void testUIButton() throws InterruptedException {
        buttons.checkUIButton();
        sleep(2);
    }

}
