package testPom;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom.FlightsHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;

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

    @Test(enabled = false)
    public void verifyFlightsTest4() {
        Homepage homepage = getHomepage();
        FlightsHomePage flights = homepage.navigateToFlight();
        clickOnElement(flights.dateButton);
        clickOnElement(flights.pickOctTwenty);
        clickOnElement(flights.pickOctThirdyOne);
        clickOnElement(flights.doneButton);
        homepage.setUpLocations(flights.originLocation,flights.originLocationText,"nyc",flights.firstResult);
        homepage.setUpLocations(flights.destinationLocation,flights.destinationLocationText,"boston",flights.firstResult2);
        clickOnElement(flights.searchButton);
        clickOnElement(flights.nonStop);
        clickOnElement(flights.afternoonSelector);
        printOutListOfElements(flights.arrivalTimes);
    }


    //a little botched
    @Test(enabled = false)
    public void verifyFlightsTest5() {
        Homepage homepage = getHomepage();
        FlightsHomePage flights = homepage.navigateToFlight();
        clickOnElement(flights.oneWay);
        homepage.setUpLocations(flights.originLocation,flights.originLocationText,"nyc",flights.firstResult);
        homepage.setUpLocations(flights.destinationLocation,flights.destinationLocationText,"maine",flights.firstResult2);
        clickOnElement(flights.dateButton);
        clickOnElement(flights.pickNovTwelve);
        clickOnElement(flights.doneButton);
        clickOnElement(flights.searchButton);
        scrollJS(1000);
        clickOnElement(flights.sendFeedback);
        ArrayList<String> windows2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows2.get(1));
        clickOnElement(flights.ratingFive);
        clickOnElement(flights.clickTen);
        clickOnElement(flights.clickTextBox);
        sendKeysToInput(flights.clickTextBox,"WElcome to chicfila may i get ur order");
        clickOnElement(flights.email_address);
        sendKeysToInput(flights.email_address,"smostafa1998@gmail.com");
        driver.close();
        driver.switchTo().window(windows2.get(0));
    }

    @Test()
    public void verifyFlightsTest6() {
        Homepage homepage = getHomepage();
        FlightsHomePage flights = homepage.navigateToFlight();
        clickOnElement(flights.oneWay);
        homepage.setUpLocations(flights.originLocation,flights.originLocationText,"nyc",flights.firstResult);
        homepage.setUpLocations(flights.destinationLocation,flights.destinationLocationText,"ireland",flights.firstResult2);
        clickOnElement(flights.dateButton);
        clickOnElement(flights.pickNovTwelve);
        clickOnElement(flights.doneButton);
        clickOnElement(flights.searchButton);
        clickOnElement(flights.clickAirlines);
        printOutListOfElements(flights.listOfAirlines);
        printOutListOfElements(flights.startingPricesOfAirlines);
        database.insertDataFrom2ListsToSqlTable(oneDList(flights.listOfAirlines),oneDList(flights.startingPricesOfAirlines),"Airlines","Name","Prices");
    }



}
