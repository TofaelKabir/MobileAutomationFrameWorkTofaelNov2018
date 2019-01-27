package testAndroidPhone;

import androidPhone.RealEstate;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRealEstate extends RealEstate {
    RealEstate realEstate;
    @BeforeMethod
    public void initElements(){
        realEstate = PageFactory.initElements(ad,RealEstate.class);
    }
    @Test
    public void testRealEstate() throws InterruptedException {
        realEstate.checkRealEstate();
    }
}
