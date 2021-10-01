package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.ShoppingHomePage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToShoppingHomePage(){
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        waitForElementToBeVisible(shopping.buildPrice);
        String actualText = shopping.buildPrice.getText();
        String expectedText = "Build & Price";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("FOUND SHOPPING WEBSITE");
    }
}
