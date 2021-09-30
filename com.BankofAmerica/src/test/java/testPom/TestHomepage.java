package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CreditCardHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToCreditCardPage(){
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        waitForElementToBeVisible(credit.creditInfo);
        String actualText = credit.creditInfo.getText();
        String expectedText = "Find the perfect credit card from among our most popular options";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND CREDIT WEBSITE");
    }
}
