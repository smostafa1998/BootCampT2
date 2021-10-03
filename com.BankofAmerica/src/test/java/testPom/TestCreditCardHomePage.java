package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CreditCardHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;

public class TestCreditCardHomePage extends TestBase {

    @Test(enabled = false)
    public void verifyCreditCardTest1() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        oneDList(credit.creditLinks);
    }

    //works but needs an extra wait
    @Test(enabled = false)
    public void verifyCreditCardTest2() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.btnCompareCreditCards);
        oneDList(credit.cardNames);
        oneDList(credit.cardDescriptions);
        database.insertDataFrom2ListsToSqlTable(oneDList(credit.cardNames), oneDList(credit.cardDescriptions), "cardTable", "cardName", "Description");
    }

    @Test(enabled = false)
    public void verifyCreditCardTest3() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.cardsForStudents);
        clickOnElement(credit.cardsForStudentsTC);
        ArrayList<String> windows2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows2.get(1));
        oneDList(credit.rowName);
        driver.close();
        driver.switchTo().window(windows2.get(0));
    }

    @Test(enabled = false)
    public void verifyCreditCardTest4() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickJScript(credit.lifeServices);
        clickOnElement(credit.powerOfAttorneyLarge);
        scrollJS(1000);
        clickOnElement(credit.powerOfAttorneyCQ);
        waitForElementToBeVisible(credit.questionTwo);
        String actualText = credit.questionTwo.getText();
        String expectedText = "Is there a fee to add a power of attorney agent to my account?";
        Assert.assertEquals(actualText, expectedText);
        oneDhref(credit.lifeServicesLabels);
    }

    @Test(enabled = false)
    public void verifyCreditCardTest5() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.cashRewardsCards);
        clickOnElement(credit.footer_cc_glossary);
        oneDList(credit.glossaryA);
        clickOnElement(credit.indexK);
        oneDhref(credit.creditHREF);
    }

    @Test()
    public void verifyCreditCardTest6() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.pointsRewardsCards);
        clickOnElement(credit.footer_cc_status);
        clickOnElement(credit.lastNameField);
        sendKeysToInput(credit.lastNameField, "Mostafa");
        clickOnElement(credit.dateOfBirth);
        sendKeysToInput(credit.dateOfBirth, "10/09/1998");
        clickOnElement(credit.lastFourSSN);
        sendKeysToInput(credit.lastFourSSN, "1111");
        clickOnElement(credit.zipCode);
        sendKeysToInput(credit.zipCode, "11377");
        clickOnElement(credit.submitButton);
        waitForElementToBeVisible(credit.errorMessage);
        String actualText = credit.errorMessage.getText();
        String expectedText = "The information you entered does not match our records";
        Assert.assertEquals(actualText, expectedText);
    }


    @Test(enabled = false)
    public void verifyCreditCardTest7() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();

    }

    @Test(enabled = false)
    public void verifyCreditCardTest8() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();

    }


    @Test(enabled = false)
    public void verifyCreditCardTest9() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();

    }

    @Test(enabled = false)
    public void verifyCreditCardTest10() {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();

    }


}
