package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.FlightsHomePage;
import pom.Homepage;
import testBase.TestBase;

/**
 * EXPEDIA TEST HOMEPAGE
 */
public class TestHomepage extends TestBase {

    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToFlightsHomePage(){
        Homepage homepage = getHomepage();
        FlightsHomePage flights = homepage.navigateToFlight();
        waitForElementToBeVisible(flights.roundtripLabel);
        String actualText = flights.roundtripLabel.getText();
        String expectedText = "Roundtrip";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("FOUND FLIGHT WEBSITE");
    }


}