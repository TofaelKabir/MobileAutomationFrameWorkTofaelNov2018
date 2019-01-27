package testAndroidPhone;


import androidPhone.Sports;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSports extends Sports {
    Sports sports;

    @BeforeMethod
    public void initElements() {
        sports = PageFactory.initElements(ad, Sports.class);
    }
    @Test
    public void testSports() throws InterruptedException {
        sports.checkSports();
    }
}