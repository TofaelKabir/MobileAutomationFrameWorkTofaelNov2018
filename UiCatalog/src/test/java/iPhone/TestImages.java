package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestImages extends Images {
    Images images;
    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getImages();
        images = PageFactory.initElements(ad, Images.class);
    }
    @Test
    public void testImagesWholePage() throws InterruptedException {
        images.checkImagesPageWhole();
        sleep(2);
    }
    @Test
    public void testImages() throws InterruptedException {
        images.checkImages();
        sleep(2);
    }
    @Test
    public void testDurationSymbol() throws InterruptedException {
        images.checkDurationSymbol();
        sleep(2);
    }
    @Test
    public void testDurationText() throws InterruptedException {
        images.checkDurationText();
        sleep(2);
    }
}
