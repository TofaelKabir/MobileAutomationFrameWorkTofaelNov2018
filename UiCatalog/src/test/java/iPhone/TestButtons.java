package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 9/5/15.
 */
public class TestButtons extends Buttons {

Buttons buttons;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
        buttons = PageFactory.initElements(ad, Buttons.class);
    }
    @Test
    public void testButtonsWholePage() throws InterruptedException {
        buttons.checkButtonsWholePage();
        sleep(2);
    }
    @Test
    public void testUIButton() throws InterruptedException {
        buttons.checkUIButton();
        sleep(2);
    }
    @Test
    public void testBackgroundImage(){
        buttons.checkBackgroundImage();
    }
    @Test
    public void testGray(){
        buttons.checkGray();
    }
    @Test
    public void testGrayButton(){
        buttons.checkGrayButton();
    }
    @Test
    public void testButtonWithImage(){
        buttons.checkButtonWithImage();
    }
    @Test
    public void testRightPointingArrow(){
        buttons.checkRightPointingArrow();
    }
    @Test
    public void testTextImageButton(){
        buttons.checkTextImageButton();
    }
    @Test
    public void testUIButtonTypeRoundedRect(){
        buttons.checkUIButtonTypeRoundedRect();
    }
    @Test
    public void testRoundedButton(){
        buttons.checkRoundedButton();
    }
    @Test
    public void testRoundedButtonType(){
        buttons.checkRoundedButtonType();
    }
}


