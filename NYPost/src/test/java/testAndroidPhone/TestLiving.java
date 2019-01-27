package testAndroidPhone;

import androidPhone.Living;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLiving extends Living {
    Living living;
    @BeforeMethod
    public void initElements(){
        living = PageFactory.initElements(ad, Living.class);
    }
    @Test
    public void testLiving() throws InterruptedException {
        living.checkLiving();
    }
}
