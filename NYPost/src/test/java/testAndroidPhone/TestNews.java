package testAndroidPhone;

import androidPhone.News;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNews extends News {
    News news;
    @BeforeMethod
    public void initElements(){
        news = PageFactory.initElements(ad, News.class);
    }
    @Test
    public void testNews() throws InterruptedException {
        news.checkNews();
    }
}
