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

    /**
     * TEST CASE 1: NAVIGATE TO THE SHOPPING PAGE AND ASSERT THE LINKS THERE
     * @throws IOException
     */
    @Test(enabled = false)
    public void verifyShoppingTest1() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        List<String> test = oneDList(shopping.shoppingLinks);
        homepage.assertOneDList(test, "BMWT1");
    }

    /**
     * TEST CASE 2: ENTERS IN THE ZIP CODE AND LOOKS FOR THE NEW CARS, AND THE PRICES OF
     * NEW CARS, THE FIRST PRICE OF THE NEW CAR IS THEN ASSERTED AND I LOAD THE DATABASE
     * WITH ALL THE PRICES
     * @throws IOException
     */
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

    /**
     * TEST CASE 3: THIS CLICKS ON THE ESTIMATE PAYMENTS BUTTON AND ENTERS INFORMATION
     * ABOUT THE CAR AND MODEL IN QUESTION
     */
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

    /**
     * TEST CASE 4: THIS CLICKS ON THE SHOP PARTS TAB AND THEN GOES TO ANOTHER
     * TAB, AND THEN CLICK ON THE ACCESSORIES TAB AND ASSERT A LIST THERE.
     * @throws IOException
     */
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

    /**
     * TEST CASE 5 : THIS GOES TO THE ACCESSORIES PAGE AND GOES TO THE APPAREL PAGE AND CLICKS ON THE FILTERS
     * AND OBTAIN A LIST OF ALL THE KID ELEMENTS AND PUT IT IN A DATABASE. ALSO ASSERT THIS LIST
     * @throws IOException
     */
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
        List<String> test = oneDList(shopping.kidItems);
        homepage.assertOneDList(test, "BMWT3");
        database.insertDataFromListToSqlTable(oneDList(shopping.kidItems), "BMWKids", "items");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    /**
     *
     * @throws IOException
     */

    @Test(enabled = false)
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
    public void verifyShoppingTest7() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.shopOnline);
        addingKeyboardInput(shopping.inputZip,"11377");
        clickOnElement(shopping.searchButton);
        clickOnElement(shopping.showMore);
        waitForElementsToBeVisible(shopping.Locations);
        List<String> test = oneDList(shopping.Locations);
        homepage.assertOneDList(test, "BMWT7");
    }

    @Test(enabled = false)
    public void verifyShoppingTest8() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.shopPartsTab);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(shopping.holiday);
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
        foundIframe(shopping.iframe);
        clickOnElement(shopping.download);
        driver.switchTo().window(tabs3.get(1));
        waitForElementToBeVisible(shopping.holidayText);
        String actualText = shopping.holidayText.getText();
        String expectedText = "2021 Holiday Catalog.";
        Assert.assertEquals(actualText, expectedText);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyShoppingTest9() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.shopPartsTab);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(shopping.learnRewards);
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
        waitForElementsToBeVisible(shopping.rewardList);
        printOutListOfElements(shopping.rewardList);
        String actualText = shopping.rewardList.get(0).getText();
        String expectedText = "$70 credit\n" +
                "annually at BMW Centers 1";
        Assert.assertEquals(actualText, expectedText);
        driver.switchTo().window(tabs3.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyShoppingTest10() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShoppingPage();
        clickOnElement(shopping.shopPartsTab);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForElementsToBeVisible(shopping.mustHaves);
        List<String> test = oneDhref(shopping.mustHaves);
        homepage.assertOneDList(test, "BMWT10");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }


}
