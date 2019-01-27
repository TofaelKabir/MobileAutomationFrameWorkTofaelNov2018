package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestControls extends Controls {
    Controls controls;

    @BeforeMethod
    public void setUp(){
        controls = PageFactory.initElements(ad, Controls.class);
    }
    @Test
    public void testUISwitch() throws InterruptedException {
        controls.checkUISwitch();
    }
    @Test
    public void testUISlider() throws InterruptedException {
        controls.checkUISlider();
    }
    @Test
    public void testUIPageControl() throws InterruptedException {
        controls.checkUIPageControl();
    }
}
