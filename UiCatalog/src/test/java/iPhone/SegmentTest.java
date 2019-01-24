package iPhone;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SegmentTest extends Base {
    Segments segments;

    @BeforeMethod
    public void navigate(){
        UiCatalog ui =PageFactory.initElements(ad, UiCatalog.class);
        ui.getSegments();
        segments = PageFactory.initElements(ad, Segments.class);
    }
    @Test
    public void uISegementedControlButtonClick(){
        segments.clickOnUISegementedControlButton();
    }
    @Test
    public void uISegementControlStyleBorderedClick(){
        segments.clickOnUISegementControlStyleBordered();
    }
    @Test
    public void cuISegementControlStyleBarClick(){
        segments.clickOnUISegementControlStyleBar();
    }
    @Test
    public void uISegementControlStyleBarTintClick(){
        segments.clickOnUISegementControlStyleBarTint();
    }
    @Test
    public void uISegementControlStyleBarImageClick(){
        segments.clickOnUISegementControlStyleBarImage();
    }
}


