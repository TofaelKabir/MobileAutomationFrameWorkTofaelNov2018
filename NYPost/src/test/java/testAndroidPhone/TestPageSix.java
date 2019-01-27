package testAndroidPhone;

import androidPhone.PageSix;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPageSix extends PageSix {
    PageSix pageSix;
    @BeforeMethod
    public void initElements(){
        pageSix = PageFactory.initElements(ad, PageSix.class);
    }
    @Test
    public void testPageSix() throws InterruptedException {
        pageSix.checkPageSix();
    }
}
