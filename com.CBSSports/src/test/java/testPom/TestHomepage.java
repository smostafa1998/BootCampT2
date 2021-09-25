package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.SoccerHomePage;
import testBase.TestBase;

/**
 * SOCCER TEST HOMEPAGE
 */
public class TestHomepage extends TestBase {

    /**
     * This IS not a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToSoccerPage(){
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        waitForElementToBeVisible(soccer.soccerNewsLabel);
        String expectedText = "CBS Sports HQ Newsletter";
        String actualText = soccer.soccerNewsLabel.getText();
        Assert.assertEquals(actualText,expectedText);
        System.out.println("FOUND SOCCER WEBSITE");
    }

}
