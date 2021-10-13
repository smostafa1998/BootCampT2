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

    @Test(enabled = true)
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
