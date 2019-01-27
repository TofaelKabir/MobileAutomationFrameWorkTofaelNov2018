package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTextFields extends TextFields {

    public TextFields textFields() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getTextFields();
        return PageFactory.initElements(ad, TextFields.class);
    }

    @Test
    public void testTextFieldsWholePage() throws InterruptedException {
        textFields().checkTextFieldsWholePage();
        sleep(2);
    }
    @Test
    public void testUiTextField() throws InterruptedException {
        textFields().checkUiTextField();
        sleep(2);
    }
    @Test
    public void testUiTextBox() throws InterruptedException {
        textFields().checkUiTextBox();
        sleep(2);
    }
    @Test
    public void testRoundedTextField() throws InterruptedException {
        textFields().checkRoundedTextField();
        sleep(2);
    }
    @Test
    public void testRoundedTextBox() throws InterruptedException {
        textFields().checkRoundedTextBox();
        sleep(2);
    }
    @Test
    public void testSecureTextField() throws InterruptedException {
        textFields().checkSecureTextField();
        sleep(2);
    }
    @Test
    public void testSecureTextBox() throws InterruptedException {
        textFields().checkSecureTextBox();
        sleep(2);
    }
    @Test
    public void testUiTextFieldWithLeftView() throws InterruptedException {
        textFields().checkUiTextFieldWithLeftView();
        sleep(2);
    }
    @Test
    public void testUiTextFieldWithLeftViewTextBox() throws InterruptedException {
        textFields().checkUiTextFieldWithLeftViewTextBox();
        sleep(2);
    }
}