package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.MortagesHomePage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TestMortagesHomePage extends TestBase {

    @Test(enabled = false)
    public void verifyMortagesTest1() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.inputZipCode);
        sendKeysToInput(mortages.inputZipCode, "\b\b\b\b\b11377");
        clickOnElement(mortages.submitButton);
        waitForElementToBeVisible(mortages.paragraphNo);
        String actualText = mortages.paragraphNo.getText();
        String expectedText = "Trulia does not display lenders in this area. Fortunately, Trulia is part of the Zillow Group family and you can visit Zillow to see your options.";
        Assert.assertEquals(expectedText, actualText);
        clickOnElement(mortages.cancelButton);
    }

    @Test(enabled = false)
    public void verifyMortagesTest2() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        List<String> elementCopied = new ArrayList<>();
        List<String> elementCopied2 = new ArrayList<>();
        getListOfElements(mortages.loanTypes, elementCopied);
        getListOfElements(mortages.bestFors, elementCopied2);
        database.insertDataFrom2ListsToSqlTable(elementCopied, elementCopied2, "truliaTable", "LoanType", "BestFor");
    }

    @Test(enabled = false)
    public void verifyMortagesTest3() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.clickEstate);
        clickOnElement(mortages.nyEstate);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(mortages.queenCounties, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "Queens", "counties");
    }

    @Test(enabled = false)
    public void verifyMortagesTest4() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.seeMore);
        clickOnElement(mortages.lenderDirectory);
        waitForElementToBeVisible(mortages.ratingButton);
        clickOnElement(mortages.ratingButton);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(mortages.bestRated, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "Lenders", "CustomerRated");
    }

    @Test(enabled = false)
    public void verifyMortagesTest5() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.affordCalculator);

        clearInputText(mortages.annualIncomeInput);
        homepage.calculatorKeyboard(mortages.annualIncomeInput, "100000");

        clearInputText(mortages.downPaymentInput);
        homepage.calculatorKeyboard(mortages.downPaymentInput, "50000");

        clearInputText(mortages.otherMonthlyDebts);
        homepage.calculatorKeyboard(mortages.otherMonthlyDebts, "1000");

        clickOnElement(mortages.clickOnCredit);
        dropdownSelectByIndex(mortages.creditScoreInput, 1);

        clearInputText(mortages.zipCode);
        homepage.calculatorKeyboard(mortages.zipCode, "11377");
        slideAction(mortages.slider, 20, 0);
        waitForElementToBeVisible(mortages.affordHome);
        String actualText = mortages.affordHome.getText();
        String expectedText = "$281,707";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyMortagesTest6() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.mortageCalculator);

        clearInputText(mortages.HomePriceInput);
        homepage.calculatorKeyboard(mortages.HomePriceInput, "100000");

        clearInputText(mortages.DownInput);
        homepage.calculatorKeyboard(mortages.DownInput, "20000");

        dropdownSelectByIndex(mortages.LoanTypeInput, 3);

        clearInputText(mortages.ZipcodeInput);
        homepage.calculatorKeyboard(mortages.ZipcodeInput, "11377");

        waitForElementToBeVisible(mortages.perMonth);
        String actualText = mortages.perMonth.getText();
        String expectedText = "$812";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyMortagesTest7() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.homeCalculator);

        clearInputText(mortages.loanAmount);
        homepage.calculatorKeyboard(mortages.loanAmount, "500000");

        clearInputText(mortages.rate);
        homepage.calculatorKeyboard(mortages.rate, "3.14");

        clearInputText(mortages.term);
        homepage.calculatorKeyboard(mortages.term, "400");

        clearInputText(mortages.originationYear);
        homepage.calculatorKeyboard(mortages.originationYear, "2003");

        clearInputText(mortages.newLoanAmount);
        homepage.calculatorKeyboard(mortages.newLoanAmount, "300000");

        clearInputText(mortages.newRate);
        homepage.calculatorKeyboard(mortages.newRate, "4.02");

        clearInputText(mortages.newTerm);
        homepage.calculatorKeyboard(mortages.newTerm, "300");

        clearInputText(mortages.fees);
        homepage.calculatorKeyboard(mortages.fees, "3000");


        waitForElementToBeVisible(mortages.textSaveFinal);
        String actualText = mortages.textSaveFinal.getText();
        String expectedText = "$431 /month";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyMortagesTest8() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.seeMore);
        clickOnElement(mortages.todayMortageRate);

        clearInputText(mortages.zipCodeInput);
        homepage.calculatorKeyboard(mortages.zipCodeInput, "11377");

        clearInputText(mortages.purchasePrice);
        homepage.calculatorKeyboard(mortages.purchasePrice, "300000");

        clearInputText(mortages.downPaymentPercentage);
        homepage.calculatorKeyboard(mortages.downPaymentPercentage, "30");

        clickOnElement(mortages.creditScoreBox);
        dropdownSelectByIndex(mortages.selectCreditScore, 2);

        List<String> elementCopied = new ArrayList<>();
        getListOfElements(mortages.morgageOptions, elementCopied);

        clickOnElement(mortages.seeRates);

    }


}
