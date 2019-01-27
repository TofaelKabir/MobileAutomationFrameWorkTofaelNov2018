package testAndroidPhone;

import androidPhone.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends Home {
    Home home;
    @BeforeMethod
    public void navigate() throws InterruptedException {
        home = PageFactory.initElements(ad, Home.class);
    }
    @Test
    public void testLogo() {
        home.checkLogo();
    }
    @Test
    public void testMenu() {
        home.checkMenu();
    }
    @Test
    public void testNotification() {
        home.checkNotification();
    }
}
