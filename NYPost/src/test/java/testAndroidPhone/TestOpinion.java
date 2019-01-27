package testAndroidPhone;

import androidPhone.Opinion;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOpinion extends Opinion {
    Opinion opinion ;
    @BeforeMethod
    public void initElements(){
        opinion= PageFactory.initElements(ad, Opinion.class);
    }
    @Test
    public void TestOpinion() throws InterruptedException {
        opinion.checkOpinion();
    }
}