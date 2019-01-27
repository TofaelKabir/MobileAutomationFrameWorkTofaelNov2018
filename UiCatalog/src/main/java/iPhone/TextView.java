package iPhone;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextView extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TextView\"]")
    public static WebElement textView;
    public void checkTextView(){
        textView.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView")).getAttribute("value");
        String Expected = "Hello!";
        System.out.println(Actual);
    }
}