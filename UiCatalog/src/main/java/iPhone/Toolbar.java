package iPhone;

import common.Base;

/**
 * Created by mrahman on 1/15/17.
 */
public class Toolbar extends Base {

    public void checkToolbarPageWhole(){
        clickByXpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView");
    }
    public void checkUIBarStyle(){
        clickByXpath("/XCUIElementTypeStaticText[@name=\"UIBarStyle:\"]");
    }
    public void checkUIBarStyleDefault(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Default\"]");
    }
    public void checkUIBarStyleBlack(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Black\"]");
    }
    public void checkUIBarStyleTranslucent(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Translucent\"]");
    }
    public void checkUIBarStyleImage(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Image:\"]");
    }
    public void checkUIBarStyleImageSwitch(){
        clickByXpath("//XCUIElementTypeSwitch[@name=\"Image\"]");
    }
    public void checkUIBarStyleTinted(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Tinted:\"]");
    }
    public void checkUIBarStyleTintedSwitch(){
        clickByXpath("//XCUIElementTypeSwitch[@name=\"Tinted\"]");
    }
    public void checkUIBarButtonItemStyle(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"UIBarButtonItemStyle:\"]");
    }
    public void checkUIBarButtonSystemItem(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"UIBarButtonSystemItem:\"]");
    }
    public void checkXCUIElementTypePickerWheel(){
        clickByXpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel");
    }
    public void checkXCUIElementTypePickerWheelItem1(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Item1\"]");
    }
    public void checkXCUIElementTypePickerWheelItem2(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Item2\"]");
    }
    public void checkXCUIElementTypePickerWheelTools(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Tools\"]");
    }

}
