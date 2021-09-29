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
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        waitForElementToBeVisible(shopping.shoppingText);
        String actualText = shopping.shoppingText.getText();
        String expectedText = "Shopping Tools";
        Assert.assertEquals(actualText, expectedText);
        System.out.println("FOUND MORTAGES WEBSITE");
    }
}
