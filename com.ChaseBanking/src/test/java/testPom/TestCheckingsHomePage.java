package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CheckingsHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;


public class TestCheckingsHomePage extends TestBase {

    // remember to add something here
    @Test(enabled = false)
    public void verifyCheckingsTest1() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        clickOnElement(checkings.modalWindow);
        clickOnElement(checkings.modalWindowButton);
        clickOnElement(checkings.modalWindow);
        clickOnElement(checkings.modalPDF);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        clickOnElement(checkings.modalWindowButton);
    }


    @Test(enabled = false)
    public void verifyCheckingsTest2() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        clickOnElement(checkings.clickStudent);
        clickOnElement(checkings.learnMore);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(checkings.pressPlay);
        clickOnElement(checkings.playButton);
        clickOnElement(checkings.cancelButton);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        waitForElementToBeVisible(checkings.messageKids);

    }

    //has a glitch thats annoying gotta work at
    @Test(enabled = false)
    public void verifyCheckingsTest3() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        clickOnElement(checkings.CDTab);
        clickOnElement(checkings.CDLink);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(checkings.inputZipCode);
        sendKeysToInput(checkings.inputZipCode, "11377");
        clickOnElement(checkings.submitButton);
        database.insertDataFromListToSqlTable(oneDList(checkings.columnsCD), "ChaseBank", "columsCD");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyCheckingsTest4() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        clickOnElement(checkings.nearestBranch);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sendKeysToInput(checkings.zipCodeInput, "11377");
        clickOnElement(checkings.submit);
        oneDList(checkings.locations);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyCheckingsTest5() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        clickOnElement(checkings.checkingLink);
        clickOnElement(checkings.privateAccount);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(checkings.lendingLink);
        clickOnElement(checkings.homeLoan);
        oneDList(checkings.homeLoanBenefits);
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

    @Test()
    public void verifyCheckingsTest6() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        clickJScript(checkings.checkingLink);
        clickOnElement(checkings.privateAccount);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(checkings.planningBenefits);
        scrollJS(2000);
        clickOnElement(checkings.closeButton);
        clickOnElement(checkings.marketVolitality);
        clickOnElement(checkings.marriage);
        clickOnElement(checkings.extraExpences);
        waitForElementToBeVisible(checkings.eventText);
        String actualText = checkings.eventText.getText();
        String expectedText = "Events to consider as you plan";
        Assert.assertEquals(actualText, expectedText);
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

    @Test(enabled = false)
    public void verifyCheckingsTest7() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();

    }

    @Test(enabled = false)
    public void verifyCheckingsTest8() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
    }

    @Test(enabled = false)
    public void verifyCheckingsTest9() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
    }

    @Test(enabled = false)
    public void verifyCheckingsTest10() {
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
    }


}
