package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.ShoppingHomePage;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestShoppingHomePage extends TestBase {

    @Test(enabled = false)
    public void verifyShoppingTest1() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        List<String> test = oneDList(shopping.shoppingLinks);
        homepage.assertOneDList(test, "BMWT1");
    }

    @Test(enabled = false)
    public void verifyShoppingTest2() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        addingKeyboardInput(shopping.zipCode, "11377");
        clickOnElement(shopping.shopNew);
        printOutListOfElements(shopping.pricesNewCars);
        waitForElementToBeVisible(shopping.firstPrice);
        String actualText = shopping.firstPrice.getText();
        String expectedText = "$42,010";
        Assert.assertEquals(actualText, expectedText);
        database.insertDataFromListToSqlTable(oneDList(shopping.pricesNewCars), "NewCar11377", "prices");
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
        addingKeyboardInput(shopping.inputZIP, "11377");
        clickOnElement(shopping.estimatePayments);
        waitForElementToBeVisible(shopping.confirmYear);
        String actualText = shopping.confirmYear.getText();
        String expectedText = "2022";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyShoppingTest4() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.shopPartsTab);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        printOutListOfElements(shopping.listAccessories);
        List<String> test = oneDList(shopping.listAccessories);
        homepage.assertOneDList(test, "BMWTEST2");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyShoppingTest5() throws IOException {
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
        //printOutListOfElements(shopping.kidItems);
        List<String> test = oneDList(shopping.kidItems);
        homepage.assertOneDList(test, "BMWT3");
        database.insertDataFromListToSqlTable(oneDList(shopping.kidItems), "BMWKids", "items");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = true)
    public void verifyShoppingTest6() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.leaseAndFinancing);

        addingKeyboardInput(shopping.zipCodeInput, "11377");

        clickOnElement(shopping.vehicleSelect);
        dropdownSelectByIndex(shopping.vehicleSelect, 4);

        clickOnElement(shopping.yearsSelect);
        dropdownSelectByIndex(shopping.yearsSelect, 1);

        addingKeyboardInput(shopping.zipInpit, "11377");
        clickOnElement(shopping.zipButton);
        clickOnElement(shopping.moreInfo);
        List<String> test = oneDList(shopping.infoList);
        homepage.assertOneDList(test, "BMWT6");
    }

    @Test(enabled = false)
    public void verifyShoppingTest7() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();

    }

    @Test(enabled = false)
    public void verifyShoppingTest8() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
    }

    @Test(enabled = false)
    public void verifyShoppingTest9() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
    }

    @Test(enabled = false)
    public void verifyShoppingTest10() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
    }


}
