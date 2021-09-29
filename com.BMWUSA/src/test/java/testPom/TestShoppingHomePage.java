package testPom;

import org.testng.annotations.Test;
import pom.Homepage;
import pom.ShoppingHomePage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TestShoppingHomePage extends TestBase {

    @Test(enabled = false)
    public void verifyShoppingTest1() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.shoppingLinks, elementCopied);
    }

    @Test(enabled = false)
    public void verifyShoppingTest2() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.zipCode);
        clearInputText(shopping.zipCode);
        sendKeysToInput(shopping.zipCode,"11377");
        clickOnElement(shopping.shopNew);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.pricesNewCars, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "NewCar11377","prices");
    }

    @Test()
    public void verifyShoppingTest3() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.estimateButton);

        clickOnElement(shopping.series);
        dropdownSelectByIndex(shopping.series,3);

        clickOnElement(shopping.model);
        dropdownSelectByIndex(shopping.model,4);

        clickOnElement(shopping.inputZIP);
        clearInputText(shopping.inputZIP);
        sendKeysToInput(shopping.inputZIP,"11377");

        clickOnElement(shopping.estimatePayments);
        waitForElementToBeVisible(shopping.confirmPrice);

        /*
        clickOnElement(shopping.downPaymentInput);
        clearInputText(shopping.downPaymentInput);
        sendKeysToInput(shopping.downPaymentInput,"3000");

        clickOnElement(shopping.termSelect);
        dropdownSelectByIndex(shopping.termSelect,2);
        */

    }

}
