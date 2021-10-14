package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.CreditCardHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestCreditCardHomePage extends TestBase {


    /**
     * TEST CASE 1: THIS ASSERTS THE CREDIT CARD LINKS
     * @throws IOException
     */
    @Test(enabled = false)
    public void verifyCreditCardTest1() throws IOException {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        List<String> test = oneDList(credit.creditLinks);
        homepage.assertOneDList(test, "BOAT1");
    }

    /**
     * TEST CASE 2: THIS TEST IS USED TO COMPARE CREDIT CARDS AND USE A DATABASE
     * TO LOAD IN THE CARD NAMES AND CARD DESCRIPTIONS
     * WE THEN ASSERT THIS WITH A STRING
     * @throws IOException
     */
    //works but needs an extra wait
    @Test(enabled = false)
    public void verifyCreditCardTest2() throws IOException {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.btnCompareCreditCards);
        oneDList(credit.cardNames);
        oneDList(credit.cardDescriptions);
        database.insertDataFrom2ListsToSqlTable(oneDList(credit.cardNames), oneDList(credit.cardDescriptions), "cardTable", "cardName", "Description");
        waitForElementToBeVisible(credit.browseCardCategory);
        String actualText = credit.browseCardCategory.getText();
        String expectedText = "Browse card categories";
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * TEST CASE 3: CLICK ON THE CARDS FOR STUDENTS AND THEN LOOK AT THE STATIC TABLE
     * ON THAT PAGE AND GRAB A ROW. PRINT THIS ROW OUT AND USE ASSERT
     * @throws IOException
     */
    @Test(enabled = false)
    public void verifyCreditCardTest3() throws IOException {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.cardsForStudents);
        clickOnElement(credit.cardsForStudentsTC);
        ArrayList<String> windows2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows2.get(1));
        printOutListOfElements(credit.rowName);
        waitForElementToBeVisible(credit.rowNameOne);
        String actualText = credit.rowNameOne.getText();
        String expectedText = "Annual Percentage Rate (APR) for Purchases";
        Assert.assertEquals(actualText, expectedText);
        driver.close();
        driver.switchTo().window(windows2.get(0));
    }

    /**
     * TEST CASE 4: THIS CASE IS USED TO NAVIGATE TO THE LIFE SERVICES PAGE AND GO TO
     * THE POWER OF ATTORNY PAGE WITH QUESTIONS
     */
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

    /**
     * TEST CASE 5: CARD REWARDS AND THEN CLICK ON THE GLOSSARY TABLE, AND ASSERT ONE
     * OF THE DEFINITIONS
     * @throws IOException
     */
    @Test(enabled = false)
    public void verifyCreditCardTest5() throws IOException {
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.cashRewardsCards);
        clickOnElement(credit.footer_cc_glossary);
        oneDList(credit.glossaryA);
        clickOnElement(credit.indexK);
        oneDhref(credit.creditHREF);
        List<String> test = oneDhref(credit.creditHREF);
        homepage.assertOneDList(test, "BOAT2");
    }

    /**
     * TEST CASE 6: GOES TO THE POINTS REWARDS CARDS AND ENTERS INFORMATION AND THIS
     * WOULD PRODUCE A ERROR MESSAGE, THIS WILL BE ASSERTED
     */
    @Test(enabled = false)
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


}
