package testAndroidPhone;

import androidPhone.Metro;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMetro extends Metro {
    Metro metro;
    @BeforeMethod
    public void initElements(){
        metro = PageFactory.initElements(ad, Metro.class);
    }
    @Test
    public void testMetro() throws InterruptedException {
        metro.checkMetro();
    }
}
