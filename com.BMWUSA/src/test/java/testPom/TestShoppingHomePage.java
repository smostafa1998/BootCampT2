package testPom;

import org.testng.Assert;
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
        sendKeysToInput(shopping.zipCode, "11377");
        clickOnElement(shopping.shopNew);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.pricesNewCars, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "NewCar11377", "prices");
    }

    @Test(enabled = false)
    public void verifyShoppingTest3() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.estimateButton);

        clickOnElement(shopping.series);
        dropdownSelectByIndex(shopping.series, 3);

        clickOnElement(shopping.model);
        dropdownSelectByIndex(shopping.model, 4);

        clickOnElement(shopping.inputZIP);
        clearInputText(shopping.inputZIP);
        sendKeysToInput(shopping.inputZIP, "11377");

        clickOnElement(shopping.estimatePayments);
        waitForElementToBeVisible(shopping.confirmYear);
        String actualText = shopping.confirmYear.getText();
        String expectedText = "2022";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyShoppingTest4() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.shopPartsTab);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.listAccessories, elementCopied);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyShoppingTest5() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.shopPartsTab);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(shopping.bmwApparel);
        clickOnElement(shopping.apparalTab);
        clickOnElement(shopping.kidTab);
        clickOnElement(shopping.buttonSort);
        clickOnElement(shopping.lowTohigh);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.kidItems, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "BMWKids", "items");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyShoppingTest6() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.leaseAndFinancing);

        clickOnElement(shopping.zipCodeInput);
        clearInputText(shopping.zipCodeInput);
        sendKeysToInput(shopping.zipCodeInput, "11377");

        clickOnElement(shopping.vehicleSelect);
        dropdownSelectByIndex(shopping.vehicleSelect, 4);

        clickOnElement(shopping.yearsSelect);
        dropdownSelectByIndex(shopping.yearsSelect, 2);

        clickOnElement(shopping.moreInfo);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.infoList, elementCopied);

    }

}
