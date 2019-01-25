package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestToolbar extends Toolbar {
    Toolbar toolbar;
    @BeforeMethod
    public void navigate(){
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getToolbar();
        toolbar = PageFactory.initElements(ad, Toolbar.class);
    }
    @Test
    public void testToolbarPageWhole(){
        toolbar.checkToolbarPageWhole();
    }
    @Test
    public void testUIBarStyle(){
        toolbar.checkUIBarStyle();
    }
    @Test
    public void testUIBarStyleDefault(){
        toolbar.checkUIBarStyleDefault();
    }
    @Test
    public void testUIBarStyleBlack(){
        toolbar.checkUIBarStyleBlack();
    }
    @Test
    public void testUIBarStyleTranslucent(){
        toolbar.checkUIBarStyleTranslucent();
    }
    @Test
    public void testUIBarStyleImage(){
        toolbar.checkUIBarStyleImage();
    }
    @Test
    public void testUIBarStyleImageSwitch(){
        toolbar.checkUIBarStyleImageSwitch();
    }
    @Test
    public void testUIBarStyleTinted(){
        toolbar.checkUIBarStyleTinted();
    }
    @Test
    public void testUIBarStyleTintedSwitch(){
        toolbar.checkUIBarStyleTintedSwitch();
    }
    @Test
    public void testUIBarButtonItemStyle(){
        toolbar.checkUIBarButtonItemStyle();
    }
    @Test
    public void testUIBarButtonSystemItem(){
        toolbar.checkUIBarButtonSystemItem();
    }
    @Test
    public void testXCUIElementTypePickerWheel(){
        toolbar.checkXCUIElementTypePickerWheel();
    }
    @Test
    public void testXCUIElementTypePickerWheelItem1(){
        toolbar.checkXCUIElementTypePickerWheelItem1();
    }
    @Test
    public void testXCUIElementTypePickerWheelItem2(){
        toolbar.checkXCUIElementTypePickerWheelItem2();
    }
    @Test
    public void testXCUIElementTypePickerWheelTools(){
        toolbar.checkXCUIElementTypePickerWheelTools();
    }

}
