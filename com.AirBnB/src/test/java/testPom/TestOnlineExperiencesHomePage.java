package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.OnlineExperiencesHomePage;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestOnlineExperiencesHomePage extends TestBase {

    /**
     * TEST CASE 1 : THIS TEST CASE USES THE FILTER BUTTON AND ADDS A MIN AND A MAX AND BASED
     * ON THE FILTER IT WILL GIVE US RESULTS OF THE EXPERIENCES THAT ARE WITHIN THAT PRICE
     * RANGE, I ASSERT BY USING THE NUMBER OF RESULTS ON PAGE
     */
    @Test(enabled = false)
    public void verifyOnlineExperiencesTest1() {
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        waitForElementToBeVisible(onlineExperience.filterButton);
        clickOnElement(onlineExperience.filterButton);
        addingKeyboardInput(onlineExperience.priceFilterMin, "50");
        addingKeyboardInput(onlineExperience.priceFilterMax, "300");
        waitForElementToBeVisible(onlineExperience.showResults);
        clickOnElement(onlineExperience.showResults);
        waitForElementToBeVisible(onlineExperience.showOffersResults);
        String actualText = onlineExperience.showOffersResults.getText();
        String expectedText = "78 results based on your filters";
        Assert.assertEquals(actualText, expectedText);
        System.out.println("FOUND RESULTS OF SOMETHING");
    }

    /**
     * TEST CASE 2: THIS TEST CASE USES THE GROUP SIZE BUTTON FOR THE AMOUNT OF PEOPLE
     * FOR THE EVENT AND THE GUESTS NUMBER BUTTON. AND THEN THIS UPDATES THE RESULTS,
     * AND I WANT TO FILTER AGAIN BY CLICKING ON THE ARTS BUTTON WHICH WILL SHOW ME
     * ART RELATED EXPERIENCES
     */

    @Test(enabled = false)
    public void verifyOnlineExperiencesTest2() {
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        clickOnElement(onlineExperience.groupSizeButton);
        clickOnElement(onlineExperience.guestsNumberButton);
        clickOnElement(onlineExperience.saveButton);
        clickOnElement(onlineExperience.artsButton);
        waitForElementToBeVisible(onlineExperience.artsLabel);
        String actualText = onlineExperience.artsLabel.getText();
        String expectedText = "Arts & writing";
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * TEST CASE 3: THIS WILL CLICK ON THE CLICK MORE BUTTON ON THE EXPERIENCES PAGE AND I ALSO
     * PRINT OUT THE HOST LIST LINKS CAUSE WHY NOT. AND THEN I CLICK ON THE FIRST ONLINE
     * EXPERIENCE LINK AND IT TAKES ME TO ANOTHER TAB AND I ASSERT THIS
     */
    @Test(enabled = false)
    public void verifyOnlineExperiencesTest3() {
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        clickOnElement(onlineExperience.clickMore);
        printOutHrefListOfElements(onlineExperience.hostList);
        clickOnElement(onlineExperience.clickFirst);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForElementToBeVisible(onlineExperience.randomText);
        String actualText = onlineExperience.randomText.getText();
        String expectedText = "Airbnb Online Experiences";
        Assert.assertEquals(actualText, expectedText);
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

    /**
     * TEST CASE 4: WE CLICK ON ONE OF THE BEST SELLER EXPERIENCES AND IT TAKES US TO
     * ANOTHER TAB AND WE START BY PLAYING THE VIDEO ON THE PAGE AND THEN CLICK ON THE
     * SHOW ALL FOR "WHAT ITEMS TO BRING" AND THIS WILL SHOW US ALL THE ITEMS NEEDED.
     * I THEN STORE THESE INTO THE DATA BASE AND I REMMEMBER TO CLOSE THE BUTTON TO THIS
     * LIST AND REMEMBER TO PAUSE THE VIDEO. I ASSERT THIS WITH THE WHAT TO BRING LIST,
     * USING EXCEL
     *
     * @throws IOException
     */
    @Test(enabled = false)
    public void verifyOnlineExperiencesTest4() throws IOException {
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        clickOnElement(onlineExperience.clickBestSeller);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(onlineExperience.playButton);
        clickOnElement(onlineExperience.showAll);
        List<String> tested = oneDList(onlineExperience.whatToBring);
        database.insertDataFromListToSqlTable(oneDList(onlineExperience.whatToBring), "WhatToBring", "Items");
        clickOnElement(onlineExperience.closeButton);
        clickOnElement(onlineExperience.playButton);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        homepage.assertOneDList(tested, "AirBnBT4");
    }

    /**
     * TEST CASE 5: THIS ALTERS THE PRICE RANGE SIMILAR TO THE FIRST CASE AND THEN I CLICK
     * ON ONE OF THE ONLINE EVENTS LINKS WHICH TAKE ME TO ANOTHER PAGE, AND THEN WE CHANGE THE
     * DATES OF THE CALENDER AND CHANGE THE NUMBER OF GUESTS. I SAVE THIS AND LEAVE THIS TAB.
     * WE ASSERT WITH THE ONLINE EXPERIENCES ATTRIBUTES
     *
     * @throws IOException
     */

    @Test(enabled = false)
    public void verifyOnlineExperiencesTest5() throws IOException {
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        waitForElementToBeVisible(onlineExperience.filterButton);
        clickOnElement(onlineExperience.filterButton);

        addingKeyboardInput(onlineExperience.priceFilterMin, "100");
        addingKeyboardInput(onlineExperience.priceFilterMax, "200");
        clickOnElement(onlineExperience.filterButtonT5);
        clickOnElement(onlineExperience.clickLink);

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        homepage.createDates(onlineExperience.changeDates, onlineExperience.calendarDateStart, onlineExperience.calendarDateEnd);
        homepage.createAdultsGuests(onlineExperience.changeGuests, onlineExperience.addAdults);
        clickOnElement(onlineExperience.saveButton1);

        driver.close();
        driver.switchTo().window(tabs2.get(0));
        List<String> test = oneDAttributes(onlineExperience.basedOnFilters);
        homepage.assertOneDList(test, "AirBnBT5");
    }

    /**
     * TEST CASE 6: THIS TEST CASE WILL PRINT OUT THE LIST OF CATEGORIES ON THE AIR BNB PAGE
     * AND THEN CLICKS ON THE ART BUTTON, CLICKS ON ONE OF THE ART LINKS, GOES TO ANOTHER
     * TAB AND THEN IT WAITS FOR THE FIRST REVIEW TO BE VISIBLE AND THEN IT ASSERTS ON THAT.
     *
     * @throws IOException
     */
    @Test(enabled = false)
    public void verifyOnlineExperiencesTest6() throws IOException {
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        printOutListOfElements(onlineExperience.categoryList);
        clickOnElement(onlineExperience.clickArts);
        clickOnElement(onlineExperience.clickArtLink);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForElementToBeVisible(onlineExperience.firstReview);
        String actualText = onlineExperience.firstReview.getText();
        String expectedText = "Chris\n" +
                "October 2021";
        Assert.assertEquals(actualText, expectedText);
        printOutListOfElements(onlineExperience.reviewers);
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }
}
