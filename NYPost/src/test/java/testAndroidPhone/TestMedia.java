package testAndroidPhone;

import androidPhone.Media;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMedia extends Media {
    Media media;
    @BeforeMethod
    public void initElements(){
        media = PageFactory.initElements(ad, Media.class);
    }
    @Test
    public void mediaTest1() throws InterruptedException {
        media.checkMedia();
    }
}
