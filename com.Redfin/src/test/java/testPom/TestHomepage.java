package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BuyHousesHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToBuyHouses(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        waitForElementToBeVisible(houses.textBuyHouses);
        String actualText =houses.textBuyHouses.getText();
        String expectedText = "Houses for sale near me";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND HOUSE WEBSITE");
    }
}
