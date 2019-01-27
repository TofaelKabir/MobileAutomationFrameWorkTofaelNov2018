package testAndroidPhone;

import androidPhone.LatestStories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLatestStories extends LatestStories {
    LatestStories latestStories;
    @BeforeMethod
    public void initElements() {
        latestStories = PageFactory.initElements(ad, LatestStories.class);
    }
    @Test
    public void testLatestStories() {
        latestStories.checkLatestStories();
    }
}
