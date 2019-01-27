package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTextView extends TextView {
    TextView textView;
    @BeforeMethod
    public void setUp(){
        textView = PageFactory.initElements(ad, TextView.class);
    }
    @Test
    public void testTextView() throws InterruptedException {
        textView.checkTextView();
    }
}