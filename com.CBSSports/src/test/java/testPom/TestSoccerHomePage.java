package testPom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.SoccerHomePage;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestSoccerHomePage extends TestBase {

    @Test(enabled = false)
    public void verifySoccerTest1() throws IOException {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        database.insertDataFromListToSqlTable(oneDList(soccer.linksArticles), "soccerArticles", "Articles");
        List<String> test = oneDList(soccer.linksArticles);
        homepage.assertOneDList(test, "CBST1");
        clickOnElement(soccer.linksArticles.get(1));
        scrollJS(5000);
    }

    @Test(enabled = false)
    public void verifySoccerTest2() {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        scrollJS(2000);
        waitForElementToBeVisible(soccer.emailInput);
        clickOnElement(soccer.emailInput);
        sendKeysToInput(soccer.emailInput, "smostafa1998@gmail.com");
        clickOnElement(soccer.submitButton);
        soccer.waitForElementToContainText(soccer.errorMessage, "Please check the opt-in box to acknowledge that you would like to subscribe.");
        clickOnElement(soccer.checkboxSub);
        clickOnElement(soccer.articleButton);
        waitForElementToBeVisible(soccer.headlineText);
        String actualText = soccer.headlineText.getText();
        String expectedText = "Martin Green has locked in his English Premier League picks for Brighton vs. Crystal Palace on Monday";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifySoccerTest3() throws IOException {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        hoverAction(soccer.dotdotdotButton);
        waitForElementToBeVisible(soccer.shopLink);
        clickOnElement(soccer.shopLink);
        hoverAction(soccer.shopSoccer);
        clickOnElement(soccer.irishLink);
        clickOnElement(soccer.radioButton);
        database.insertDataFromListToSqlTable(oneDList(soccer.listOfHats), "IrishProducts", "Hats");
        List<String> test = oneDList(soccer.listOfHats);
        homepage.assertOneDList(test, "CBST3");
    }


    @Test(enabled = false)
    public void verifySoccerTest4() throws IOException {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        clickOnElement(soccer.championsLeague);
        buttonSelect(soccer.dropDownSelect, soccer.nationalWomen);
        clickOnElement(soccer.standings);
        oneDList(soccer.teamNames);
        List<String> test = oneDList(soccer.teamNames);
        homepage.assertOneDList(test, "CBST4");
    }


    @Test(enabled = false)
    public void verifySoccerTest5() {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        clickOnElement(soccer.loginButton);
        homepage.enterUserInfo(soccer.login_username, "smostafa1998@gmail.com", soccer.login_password, "testing123");
        clickOnElement(soccer.submit);
        waitForElementToBeVisible(soccer.app_error);
        String actualText = soccer.app_error.getText();
        String expectedText = "Sorry, you entered an incorrect email address or password.\n" +
                "Please try again.";
        Assert.assertEquals(actualText, expectedText);
    }


    @Test(enabled = true)
    public void verifySoccerTest6() throws IOException {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        hoverAction(soccer.dotdotdotButton);
        clickOnElement(soccer.world_cup);
        List<String> test = oneDList(soccer.schedule);
        homepage.assertOneDList(test, "CBST6");
    }

    @Test(enabled = false)
    public void verifySoccerTest7() {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
    }


    @Test(enabled = false)
    public void verifySoccerTest8() {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
    }

    @Test(enabled = false)
    public void verifySoccerTest9() {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
    }

    @Test(enabled = false)
    public void verifySoccerTest10() {
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
    }

}
