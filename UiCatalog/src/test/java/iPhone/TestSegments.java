package iPhone;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSegments extends Segments{
    Segments segments;

    @BeforeMethod
    public void navigate(){
        UiCatalog ui =PageFactory.initElements(ad, UiCatalog.class);
        ui.getSegments();
        segments = PageFactory.initElements(ad, Segments.class);
    }
    @Test
    public void testUISegmentedControl(){
        segments.clickOnUISegmentedControl();
    }
    @Test
    public void testUISegmentedControlCheck(){
        segments.clickOnUISegmentedControlCheck();
    }
    @Test
    public void TestUISegmentedControlSearch(){
        segments.clickOnUISegmentedControlSearch();
    }
    @Test
    public void TestUISegmentedControlTools(){
        segments.clickOnUISegmentedControlTools();
    }
    @Test
    public void testUISegmentControlStyleBordered(){
        segments.clickOnUISegmentControlStyleBordered();
    }
    @Test
    public void testUISegmentControlStyleBorderedCheck(){
        segments.clickOnUISegmentControlStyleBorderedCheck();
    }
    @Test
    public void testUISegmentControlStyleBorderedSearch(){
        segments.clickOnUISegmentControlStyleBorderedSearch();
    }
    @Test
    public void testUISegmentControlStyleBorderedTools(){
        segments.clickOnUISegmentControlStyleBorderedTools();
    }
    @Test
    public void testUISegmentControlStyleBar(){
        segments.clickOnUISegmentControlStyleBar();
    }
    @Test
    public void testUISegmentControlStyleBarCheck(){
        segments.clickOnUISegmentControlStyleBarCheck();
    }
    @Test
    public void testUISegmentControlStyleBarSearch(){
        segments.clickOnUISegmentControlStyleBarSearch();
    }
    @Test
    public void testUISegmentControlStyleBarTools(){
        segments.clickOnUISegmentControlStyleBarTools();
    }
    @Test
    public void testUISegmentControlStyleBarTint(){
        segments.clickOnUISegmentControlStyleBarTint();
    }
    @Test
    public void testUISegmentControlStyleBarTintCheck(){
        segments.clickOnUISegmentControlStyleBarTintCheck();
    }
    @Test
    public void testUISegmentControlStyleBarTintSearch(){
        segments.clickOnUISegmentControlStyleBarTintSearch();
    }
    @Test
    public void testUISegmentControlStyleBarTintTools(){
        segments.clickOnUISegmentControlStyleBarTintTools();
    }
    @Test
    public void testUISegmentControlStyleBarImage(){
        segments.clickOnUISegmentControlStyleBarImage();
    }
    @Test
    public void testUISegmentControlStyleBarImageCheck(){
        segments.clickOnUISegmentControlStyleBarImageCheck();
    }
    @Test
    public void testUISegmentControlStyleBarImageSearch(){
        segments.clickOnUISegmentControlStyleBarImageSearch();
    }
    @Test
    public void testUISegmentControlStyleBarImageTools(){
        segments.clickOnUISegmentControlStyleBarImageTools();
    }
}


