package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTransitions extends Transitions {
    Transitions transitions;
    @BeforeMethod
    public void navigate(){
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getTransitions();
        transitions = PageFactory.initElements(ad, Transitions.class);
    }
    @Test
    public void testTransitionsPageWhole(){
        transitions.checkTransitionsPageWhole();
    }
    @Test
    public void testTransitionsPageImage(){
        transitions.checkTransitionsPageImages();
    }
    @Test
    public void testTransitionsPageFlipImage(){
        transitions.checkTransitionsPageFlipImages();
    }
    @Test
    public void testTransitionsPageCurlImage(){
        transitions.checkTransitionsPageCurlImages();
    }
}
