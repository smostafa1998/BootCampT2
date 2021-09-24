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
            //waitForElementToBeVisible(nflHomePage.dateHallofFame);
        }catch(StaleElementReferenceException e){
            e.printStackTrace();
        }
        String actualText = nflHomePage.dateHallofFame.getText();
        String expectedText = "Thursday, August 1st";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND HALL OF FAME");
        //dropdownSelectByVisibleText(nflHomePage.yearDropdown,"2019");
        //dropdownSelectByVisibleText(nflHomePage.weekDropdown,"Hall of Fame Weekend");
    }

    // database or excel
    @Test(enabled = true)
    public void verifyNFLHomePage2(){
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        hoverAction(homepage.nfl);
        getListOfElements(nflHomePage.listOfNFLTeams,elementCopied);
        database.insertDataFromListToSqlTable(elementCopied,"NFLPage","Teams");
        for(String s:elementCopied){
            System.out.println(s);
        }
        System.out.println("done");
        //List<WebElement>

    }

    //gitch work on this
    @Test(enabled = false)
    public void verifyNFLHomePage3() throws InterruptedException {
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        waitForElementToBeVisible(nflHomePage.playVideoFeed);
        clickOnElement(nflHomePage.playVideoFeed);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"vjs_video_3\"]/div[6]/button[3]")));
        //Thread.sleep(2000);
        waitForElementToBeVisible(nflHomePage.skipForwardsVideo);
        clickOnElement(nflHomePage.skipForwardsVideo);
        waitForElementToBeVisible(nflHomePage.pauseVideo);
        clickOnElement(nflHomePage.pauseVideo);
    }
}
