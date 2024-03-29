package testPom;

import base.MySQLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.NFLHomePage;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestNFLHomePage extends TestBase {

    //warning this one has a glitch work on it later
    @Test(enabled = false)
    public void verifyNFLHomePage1(){
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        hoverAction(homepage.nfl);
        clickOnElement(homepage.nfl);
        hoverAction(nflHomePage.scoresLabel);
        clickOnElement(nflHomePage.scoresLabel);
        hoverAction(nflHomePage.yearDropdown);
        clickOnElement(nflHomePage.yearDropdownSelect);
        hoverAction(nflHomePage.weekDropdown);
        clickOnElement(nflHomePage.weekDropdownSelect);
        try {
            waitForElementToContainText(nflHomePage.dateHallofFame,"Thursday, August 1st");
        }catch(StaleElementReferenceException e){
            e.printStackTrace();
        }
        String actualText = nflHomePage.dateHallofFame.getText();
        String expectedText = "Thursday, August 1st";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("FOUND HALL OF FAME");

    }

    // database or excel
    @Test(enabled = false)
    public void verifyNFLHomePage2() throws IOException {
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        hoverAction(homepage.nfl);
        List<String> test = oneDList(nflHomePage.listOfNFLTeams);
        homepage.assertOneDList(test,"NFLT2");
        database.insertDataFromListToSqlTable(oneDList(nflHomePage.listOfNFLTeams),"NFLPage","Teams");
    }

    @Test(enabled = false)
    public void verifyNFLHomePage3() throws InterruptedException {
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        clickOnElement(nflHomePage.fantasyFootball);
        clickOnElement(nflHomePage.createLeague);
        clickOnElement(nflHomePage.inputTitle);
        clearInputText(nflHomePage.inputTitle);
        sendKeysToInput(nflHomePage.inputTitle,"Sabreen's Team 2 2021");
        clickOnElement(nflHomePage.groupNum);
        clickOnElement(nflHomePage.scoringType);
        clickOnElement(nflHomePage.signUp);
        clickOnElement(nflHomePage.joinLeague);
        waitForElementToBeVisible(nflHomePage.experienceText);
        String actualText = nflHomePage.experienceText.getText();
        String expectedText = "Your Experience Level";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test(enabled = false)
    public void verifyNFLHomePage4() {
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        oneDList(nflHomePage.listOfNFLHeadlines);
        clickOnElement(nflHomePage.firstResult);
        waitForElementToBeVisible(nflHomePage.authorsBio);
        String actualText = nflHomePage.authorsBio.getText();
        String expectedText = "Michael DiRocco\n" +
                "ESPN Staff Writer";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test(enabled = false)
    public void verifyNFLHomePage5() throws IOException {
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        clickOnElement(nflHomePage.depthCharts);
        oneDhref(nflHomePage.hrefLinks);
        clickOnElement(nflHomePage.buffaloBills);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        List<String> test = oneDList(nflHomePage.listOfGlossary);
        homepage.assertOneDList(test,"NFLT5");
        database.insertDataFromListToSqlTable(oneDList(nflHomePage.listOfGlossary),"GlossaryTable","Terms");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyNFLHomePage6() throws IOException {
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        clickOnElement(nflHomePage.teamLink);
        clickOnElement(nflHomePage.newEnglandPatriots);
        List<String> test = oneDList(nflHomePage.rosterNE);
        homepage.assertOneDList(test,"NFLT6");
        clickOnElement(nflHomePage.injuries);
        database.insertDataFrom2ListsToSqlTable(oneDList(nflHomePage.rosterNamesNE),oneDList(nflHomePage.rosterStatusNE),"InjuriesNFL","Names","Status");
    }

}
