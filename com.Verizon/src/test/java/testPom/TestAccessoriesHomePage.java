package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AccessoriesHomePage;
import pom.Homepage;
import testBase.TestBase;


public class TestAccessoriesHomePage extends TestBase {


    @Test(enabled = false)
    public void verifyAccessoriesTest1(){
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
        clickOnElement(accessories.exploreAll);
        oneDList(accessories.allProducts);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest2(){
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories2();
        clickOnElement(accessories.deals);
        clickOnElement(accessories.kateSpade);
        clickOnElement(accessories.filterButton);
        oneDList(accessories.filterOptions);
        clickOnElement(accessories.filterButton);
        clickOnElement(accessories.selectClick);
        dropdownSelectByIndex(accessories.dropdownPick,2);
        waitForElementToBeVisible(accessories.resultCount);
        String actualText = accessories.resultCount.getText();
        String expectedText = "96 results";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest3(){
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories2();
        clickOnElement(accessories.gamerTab);
        clickOnElement(accessories.mobileGaming);
        clickOnElement(accessories.pickProduct);
        clickOnElement(accessories.featuresTab);
        oneDList(accessories.detailsList);
    }
}
