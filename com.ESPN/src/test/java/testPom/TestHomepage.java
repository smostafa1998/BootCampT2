package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.NFLHomePage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToNFLPage() {
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        waitForElementToBeVisible(nflHomePage.nflLabel);
        String actualText = nflHomePage.nflLabel.getText();
        String expectedText = "NFL";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND NFL WEBSITE");
    }

}
