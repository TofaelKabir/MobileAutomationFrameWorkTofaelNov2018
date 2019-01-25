package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWeb extends Web {
    Web web;
    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getWeb();
        web = PageFactory.initElements(ad, Web.class);
    }
    @Test
    public void testWebPageWhole() throws InterruptedException {
        web.checkWebPageWhole();
        sleep(2);
    }
    @Test
    public void testMenuBar() throws InterruptedException {
        web.checkMenuBar();
        sleep(2);
    }
    @Test
    public void testAppleLogo() throws InterruptedException {
        web.checkAppleLogo();
        sleep(2);
    }
    @Test
    public void testShoppingBag() throws InterruptedException {
        web.checkShoppingBag();
        sleep(2);
    }
    @Test
    public void testLimitedTime() throws InterruptedException {
        web.checkLimitedTime();
        sleep(2);
    }
    @Test
    public void testIPhoneXRPrice() throws InterruptedException {
        web.checkIPhoneXRPrice();
        sleep(2);
    }
    @Test
    public void testIPhoneXSPrice() throws InterruptedException {
        web.checkIPhoneXSPrice();
        sleep(2);
    }
    @Test
    public void testTradingIPhone() throws InterruptedException {
        web.checkTradingIPhone();
        sleep(2);
    }
    @Test
    public void testBuyWithTradingIPhone() throws InterruptedException {
        web.checkBuyWithTradingIPhone();
        sleep(2);
    }
    @Test
    public void testIPhoneXR() throws InterruptedException {
        web.checkIPhoneXR();
        sleep(2);
    }
    @Test
    public void testTextIPhoneXR() throws InterruptedException {
        web.checkTextIPhoneXR();
        sleep(2);
    }
    @Test
    public void testLearnMore() throws InterruptedException {
        web.checkLearnMore();
        sleep(2);
    }
    @Test
    public void testBuyIPhoneXR() throws InterruptedException {
        web.checkBuyIPhoneXR();
        sleep(2);
    }

}
