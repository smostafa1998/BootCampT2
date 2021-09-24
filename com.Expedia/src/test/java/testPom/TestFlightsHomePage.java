package testPom;
import org.testng.annotations.Test;
import pom.FlightsHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.time.Duration;

public class TestFlightsHomePage extends TestBase {
    /**
     *
     */
    @Test
    public void verifyFlightsTest1() {
        Homepage homepage = getHomepage();
        FlightsHomePage flights = homepage.navigateToFlight();
        waitForElementToBeVisible(flights.roundtripLabel);
        homepage.setUpLocations(flights.originLocation,flights.originLocationText,"nyc",flights.firstResult);
        homepage.setUpLocations(flights.destinationLocation,flights.destinationLocationText,"norway",flights.firstResult2);
        clickOnElement(flights.searchButton);
        waitForElementToBeVisible(flights.testing);
        clickOnElement(flights.testing);
        scrollJS(500);
    }


    /**
     *
     */
    @Test(enabled=false)
    public void verifyFlightsTest2() {
    }

    /**
     *
     */
    @Test(enabled=false)
    public void verifyFlightsTest3() {
    }


}
