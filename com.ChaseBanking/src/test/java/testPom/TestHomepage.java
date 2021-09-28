package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CheckingsHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestHomepage extends TestBase {


    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void navigateToCheckingsPage(){
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        waitForElementToBeVisible(checkings.checkingText);
        String actualText = checkings.checkingText.getText();
        String expectedText = "Compare Chase checking accounts and select the one that fits your needs";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND SAVINGS WEBSITE");

    }


}
