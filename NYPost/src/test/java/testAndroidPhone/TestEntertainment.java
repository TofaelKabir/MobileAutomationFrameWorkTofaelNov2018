package testAndroidPhone;

import androidPhone.Entertainment;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEntertainment extends Entertainment {
    Entertainment entertainment;
    @BeforeMethod
    public void initElements(){
        entertainment = PageFactory.initElements(ad, Entertainment.class);
    }
    @Test
    public void testEntertainment() throws InterruptedException {
        entertainment.checkEntertainment();
    }
}
