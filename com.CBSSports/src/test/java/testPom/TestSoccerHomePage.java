package testPom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.SoccerHomePage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TestSoccerHomePage extends TestBase {

    @Test(enabled=false)
    public void verifySoccerTest1(){
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(soccer.linksArticles,elementCopied);
        database.insertDataFromListToSqlTable(elementCopied,"soccerArticles","Articles");
        clickOnElement(soccer.linksArticles.get(1));
        scrollJS(5000);
    }

    @Test(enabled=false)
    public void verifySoccerTest2(){
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        scrollJS(2000);
        waitForElementToBeVisible(soccer.emailInput);
        clickOnElement(soccer.emailInput);
        sendKeysToInput(soccer.emailInput,"smostafa1998@gmail.com");
        clickOnElement(soccer.submitButton);
        soccer.waitForElementToContainText(soccer.errorMessage,"Please check the opt-in box to acknowledge that you would like to subscribe.");
        clickOnElement(soccer.checkboxSub);
        clickOnElement(soccer.articleButton);
        waitForElementToBeVisible(soccer.headlineText);
        String actualText = soccer.headlineText.getText();
        String expectedText = "Martin Green has locked in his English Premier League picks for Brighton vs. Crystal Palace on Monday";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifySoccerTest3() throws InterruptedException {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        hoverAction(soccer.dotdotdotButton);
        waitForElementToBeVisible(soccer.shopLink);
        clickOnElement(soccer.shopLink);
        hoverAction(soccer.shopSoccer);
        clickOnElement(soccer.irishLink);
        clickOnElement(soccer.radioButton);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(soccer.listOfHats,elementCopied);
        database.insertDataFromListToSqlTable(elementCopied,"IrishProducts","Hats");
    }

}
