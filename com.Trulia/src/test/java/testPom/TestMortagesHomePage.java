package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.MortagesHomePage;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestMortagesHomePage extends TestBase {

    @Test(enabled = false)
    public void verifyMortagesTest1() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        addingKeyboardInput(mortages.inputZipCode,"11377");
        clickOnElement(mortages.submitButton);
        waitForElementToBeVisible(mortages.paragraphNo);
        String actualText = mortages.paragraphNo.getText();
        String expectedText = "Trulia does not display lenders in this area. Fortunately, Trulia is part of the Zillow Group family and you can visit Zillow to see your options.";
        Assert.assertEquals(actualText, expectedText);
        clickOnElement(mortages.cancelButton);
    }

    @Test(enabled = false)
    public void verifyMortagesTest2() throws IOException {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        printOutListOfElements(mortages.loanTypes);
        List<String> test = oneDList(mortages.bestFors);
        homepage.assertOneDList(test,"MortagesT2");
        database.insertDataFrom2ListsToSqlTable(oneDList(mortages.loanTypes),oneDList(mortages.bestFors), "truliaTable", "LoanType", "BestFor");
    }

    @Test(enabled = false)
    public void verifyMortagesTest3() throws IOException {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.clickEstate);
        clickOnElement(mortages.nyEstate);
        List<String> test = oneDList(mortages.queenCounties);
        homepage.assertOneDList(test,"MortagesT3");
        database.insertDataFromListToSqlTable(oneDList(mortages.queenCounties), "Queens", "counties");
    }

    @Test(enabled = true)
    public void verifyMortagesTest4() throws IOException {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.seeMore);
        clickOnElement(mortages.lenderDirectory);
        waitForElementToBeVisible(mortages.ratingButton);
        clickOnElement(mortages.ratingButton);
        List<String> test = oneDList(mortages.bestRated);
        homepage.assertOneDList(test,"MortagesT4");
        database.insertDataFromListToSqlTable(oneDList(mortages.bestRated), "Lenders", "CustomerRated");
    }

    @Test(enabled = false)
    public void verifyMortagesTest5() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.affordCalculator);
        addingKeyboardInput(mortages.annualIncomeInput,"100000");
        addingKeyboardInput(mortages.downPaymentInput, "50000");
        addingKeyboardInput(mortages.otherMonthlyDebts, "1000");
        addingKeyboardInput(mortages.zipCode, "11377");
        slideAction(mortages.slider, 20, 0);
        waitForElementToBeVisible(mortages.affordHome);
        String actualText = mortages.affordHome.getText();
        String expectedText = "$279,768";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyMortagesTest6() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.mortageCalculator);
        addingKeyboardInput(mortages.HomePriceInput,"100000");
        addingKeyboardInput(mortages.DownInput,"20000");
        addingKeyboardInput(mortages.ZipcodeInput,"11377");
        waitForElementToBeVisible(mortages.perMonth);
        String actualText = mortages.perMonth.getText();
        String expectedText = "$589";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyMortagesTest7() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.homeCalculator);
        addingKeyboardInput(mortages.loanAmount, "500000");
        addingKeyboardInput(mortages.rate, "3.14");
        addingKeyboardInput(mortages.term, "400");
        addingKeyboardInput(mortages.originationYear, "2003");
        addingKeyboardInput(mortages.newLoanAmount, "300000");
        addingKeyboardInput(mortages.newRate, "4.02");
        addingKeyboardInput(mortages.newTerm, "300");
        addingKeyboardInput(mortages.fees, "3000");
        waitForElementToBeVisible(mortages.textSaveFinal);
        String actualText = mortages.textSaveFinal.getText();
        String expectedText = "$431 /month";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyMortagesTest8() throws IOException {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.seeMore);
        clickOnElement(mortages.todayMortageRate);
        addingKeyboardInput(mortages.zipCodeInput,"11377");
        addingKeyboardInput(mortages.purchasePrice,"300000");
        addingKeyboardInput(mortages.downPaymentPercentage,"30");
        List<String> test = oneDList(mortages.morgageOptions);
        homepage.assertOneDList(test,"MortagesT8");
        clickOnElement(mortages.seeRates);
    }

    @Test(enabled = false)
    public void verifyMortagesTest9() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.popularCounties);
        database.insertDataFromListToSqlTable(oneDList(mortages.Top100),"Top100","counties");
        clickOnElement(mortages.Hamilton);
        clickOnElement(mortages.otherButton);
        clickOnElement(mortages.clickSort);
        dropdownSelectByValue(mortages.selectSort,"Price (Lo-Hi)");
        clickOnElement(mortages.favoriteButton);
        clickOnElement(mortages.clickSubmit);
        clickOnElement(mortages.email);
        sendKeysToInput(mortages.email,"smostafa1998@gmail.com");
        waitForElementToBeVisible(mortages.saveText);
        String actualText = mortages.saveText.getText();
        String expectedText = "Save this Home";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyMortagesTest10() {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        printOutListOfElements(mortages.truliaArticles);
        clickOnElement(mortages.firstArticle);
        printOutListOfElements(mortages.canIAfford);
        waitForElementToBeVisible(mortages.nextArticleTitle);
        String actualText = mortages.nextArticleTitle.getText();
        String expectedText = "How to know when to buy a house";
        Assert.assertEquals(actualText, expectedText);
        clickOnElement(mortages.nextArticle);
    }

    @Test(enabled = false)
    public void verifyMortagesTest11() throws IOException {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        hoverAction(mortages.rentTab);
        clickOnElement(mortages.postRental);
        addingKeyboardInput(mortages.postRentalEmail,"smostafa1998@gmail.com");
        List<String> test = oneDList(mortages.rentalQuestions);
        homepage.assertOneDList(test, "RentT11");
    }

    @Test(enabled = false)
    public void verifyMortagesTest12() throws IOException {
        Homepage homepage = getHomepage();
        MortagesHomePage mortages = homepage.navigateToMortagesPage();
        clickOnElement(mortages.buyTab);
        hoverAction(mortages.buyTab);
        clickOnElement(mortages.openHouses);
        buttonSelect(mortages.resultsBox,mortages.mortage);
        waitForElementsToBeVisible(mortages.roomSpace);
        List<String> test = oneDList(mortages.roomSpace);
        homepage.assertOneDList(test, "BuyT12");
    }


}
