package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.MortagesHomePage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToMortagesHomePage(){
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        waitForElementToBeVisible(mortages.mortageText);
        String actualText = mortages.mortageText.getText();
        String expectedText = "Try our helpful mortgage tools";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND MORTAGES WEBSITE");
    }

}
