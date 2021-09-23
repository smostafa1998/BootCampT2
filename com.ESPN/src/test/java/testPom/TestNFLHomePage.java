package testPom;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.NFLHomePage;
import testBase.TestBase;

public class TestNFLHomePage extends TestBase {

    //warning this one has a glitch work on it later
    @Test(enabled = true)
    public void verifyNFLHomePage1(){
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
        hoverAction(homepage.nfl);
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

    @Test(enabled = false)
    public void verifyNFLHomePage2(){
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();

    }

    @Test(enabled = false)
    public void verifyNFLHomePage3(){
        Homepage homepage = getHomepage();
        NFLHomePage nflHomePage = homepage.navigateToNFLHomePage();
    }

}
