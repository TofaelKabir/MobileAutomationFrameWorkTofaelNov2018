package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPicker extends Picker {
    Picker picker;

    @BeforeMethod
    public void setUp() {
        picker = PageFactory.initElements(ad, Picker.class);
    }
    @Test
    public void testPicker1() throws InterruptedException {
        picker.showDate();
    }
    @Test
    public void testPicker2() throws InterruptedException {
        picker.showUI();
    }
    @Test
    public void testPicker3() throws InterruptedException {
        picker.showCustom1();
    }
}