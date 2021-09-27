package testPom;
import org.testng.annotations.Test;
import pom.FlightsHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestFlightsHomePage extends TestBase {
    /**
     * make sure to add a fluent wait for these  cases, add assertions later
     */
    @Test(enabled=false)
    public void verifyFlightsTest1() {
        Homepage homepage = getHomepage();
        FlightsHomePage flights = homepage.navigateToFlight();
        waitForElementToBeVisible(flights.roundtripLabel);
        homepage.setUpLocations(flights.originLocation,flights.originLocationText,"nyc",flights.firstResult);
        homepage.setUpLocations(flights.destinationLocation,flights.destinationLocationText,"norway",flights.firstResult2);
        clickOnElement(flights.searchButton);
        waitForElementToBeVisible(flights.confirmWEBElement);
        //dropdownSelectByVisibleText(flights.dropDown,"Duration (Longest)");
        //5:55pm - 12:00pm (1 stop)
        scrollJS(500);
    }


    /**
     *
     */
    @Test(enabled=false)
    public void verifyFlightsTest2() {
        Homepage homepage = getHomepage();
        FlightsHomePage flights = homepage.navigateToFlight();
        waitForElementToBeVisible(flights.multiCity);
        clickOnElement(flights.multiCity);
        homepage.setUpLocations(flights.originLocationMT,flights.originLocationTextMT,"nyc",flights.originLocationResultMT);
        homepage.setUpLocations(flights.destinationLocationMT,flights.destinationLocationTextMT,"london",flights.destinationLocationResultMT);
        homepage.setUpLocations(flights.destinationLocation2MT,flights.destinationLocation2TextMT,"ireland",flights.destinationLocationResult2MT);
        clickOnElement(flights.searchButtonMT);
        scrollJS(700);
    }

    /**
     *
     */
    @Test(enabled=false)
    public void verifyFlightsTest3() {
        Homepage homepage = getHomepage();
        FlightsHomePage flights = homepage.navigateToFlight();
        waitForElementToBeVisible(flights.roundtripLabel);
        waitForElementToBeVisible(flights.travelersNum);
        clickOnElement(flights.travelersNumButton);
        clickOnElement(flights.travelersNumButton);
        clickOnElement(flights.classType);
        clickOnElement(flights.classTypeFirst);
        homepage.setUpLocations(flights.originLocation,flights.originLocationText,"nyc",flights.firstResult);
        homepage.setUpLocations(flights.destinationLocation,flights.destinationLocationText,"amsterdam",flights.firstResult2);
        clickOnElement(flights.searchButton);
    }


}
