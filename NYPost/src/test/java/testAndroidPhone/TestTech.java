package testAndroidPhone;

import androidPhone.Tech;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTech extends Tech {
    Tech tech = null;
    @BeforeMethod
    public void initElements() {
        tech = PageFactory.initElements(ad,Tech.class);
    }
    @Test
    public void techTech()throws Exception{
        tech.checkTech();
    }
}
