package testAndroidPhone;

import androidPhone.Business;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBusiness extends Business {
    Business business;
    @BeforeMethod
    public void initElements(){
        business = PageFactory.initElements(ad, Business.class);
    }
    @Test
    public void testBusinessNews() throws InterruptedException {
        business.businessNews();
    }

}
