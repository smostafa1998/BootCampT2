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
        ShoppingHomePage shopping = homepage.navigateToShopping();
        List<String> test = oneDList(shopping.OwnersLink);
        homepage.assertOneDList(test, "MercedesT1");
        database.insertDataFromListToSqlTable(oneDList(shopping.OwnersLink), "OwnersList", "links");
    }

    @Test(enabled = false)
    public void verifyShoppingTest2() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.estimatePayment);
        clickOnElement(shopping.budgetTab);
        addingKeyboardInput(shopping.monthlyPayment, "50000");
        buttonSelect(shopping.yearButton, shopping.year2020);
        buttonSelect(shopping.term, shopping.numOfmonths);
        addingKeyboardInput(shopping.downPayment, "10000");
        clickOnElement(shopping.submitButton);
        waitForElementToBeVisible(shopping.errorMessage);
        String actualText = shopping.errorMessage.getText();
        String expectedText = "Sorry, there are no results that match your criteria.";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyShoppingTest3() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.specialOffers);
        clickOnElement(shopping.imInterested);
        clickOnElement(shopping.classButton);
        printOutListOfElements(shopping.classList);
        clickOnElement(shopping.CLA);
        clickOnElement(shopping.model);
        List<String> test = oneDList(shopping.modelList);
        homepage.assertOneDList(test, "MercedesT3");
        clickOnElement(shopping.claCoup);
    }

    @Test(enabled = false)
    public void verifyShoppingTest4() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.vehicleAccessories);
        buttonSelect(shopping.selectYear, shopping.select2019);
        buttonSelect(shopping.selectClass, shopping.gClass);
        buttonSelect(shopping.selectModel, shopping.amgModel);
        clickOnElement(shopping.submitButtonShop);
        waitForElementToBeVisible(shopping.serviceTab);
        clickOnElement(shopping.serviceTab);
        waitForElementToBeVisible(shopping.titleVehicle);
        String actualText = shopping.titleVehicle.getText();
        String expectedText = "2019 AMG G 63 SUV Accessories";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyShoppingTest5() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.lifestyleAccessories);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(shopping.cookiesAcceptButton);
        clickOnElement(shopping.bagTab);
        List<String> test = oneDList(shopping.bagsList);
        homepage.assertOneDList(test, "MercedesT5");
        clickOnElement(shopping.firstProduct);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyShoppingTest6() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.resourcesTab);
        clickOnElement(shopping.vehicleManual);
        clickOnElement(shopping.downloadManuel);
        List<String> test = oneDList(shopping.typesofVehicles);
        homepage.assertOneDList(test, "MercedesT6");
    }

    @Test(enabled = false)
    public void verifyShoppingTest7() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.resourcesTab);
        clickOnElement(shopping.videoTab);
        clickOnElement(shopping.playButton);
        foundIframe(shopping.iframeContainer);
        clickOnElement(shopping.subtitlesButton);
        clickOnElement(shopping.pause);
        waitForElementToBeVisible(shopping.vidText);
        String actualText = shopping.vidText.getText();
        String expectedText = "Discover all of the helpful features within the free Mercedes me owners app.";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyShoppingTest8() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.tires);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        printOutListOfElements(shopping.reasonsForMercedes);

        dropdownSelectByValue(shopping.vehicleYear, "2020");
        dropdownSelectByIndex(shopping.vehicleMake, 0);
        dropdownSelectByValue(shopping.vehicleModel, "AMG C 63 Coupe");
        dropdownSelectByValue(shopping.vehicleTrim, "V8 biturbo");
        dropdownSelectByValue(shopping.vehicleOption, "Standard");
        clickOnElement(shopping.submitButtonVeh);

        addingKeyboardInput(shopping.zipCode, "11377");
        clickOnElement(shopping.searchZip);
        List<String> test = oneDhref(shopping.linksToShops);
        homepage.assertOneDList(test, "MercedesT8");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyShoppingTest9() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.tires);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(shopping.bySize);
        dropdownSelectByIndex(shopping.makes, 0);
        buttonSelect(shopping.width, shopping.pickedWidth);
        dropdownSelectByValue(shopping.ratios, "60");
        dropdownSelectByValue(shopping.diameters, "16");
        clickOnElement(shopping.submitButtonVehSize);
        addingKeyboardInput(shopping.zipCode, "11794");
        clickOnElement(shopping.searchZip);
        List<String> test = oneDList(shopping.ameneties);
        homepage.assertOneDList(test, "MercedesT9");
        clickOnElement(shopping.choose);
        addingKeyboardInput(shopping.firstName, "Sabreen");
        addingKeyboardInput(shopping.lastName, "Mostafa");
        addingKeyboardInput(shopping.email, "smostafa199*@gmail.com");
        addingKeyboardInput(shopping.tel, "1234569885");
        addingKeyboardInput(shopping.comments, "testing blah blah blah");

        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }


    //work on this later
    @Test(enabled = true)
    public void verifyShoppingTest10() throws IOException {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.financialServices);
        clickOnElement(shopping.getBrochures);
        printOutListOfElements(shopping.getVehicleTitles);
        List<String> test = oneDhref(shopping.downloadPDFs);
        homepage.assertOneDList(test, "MercedesT10");
    }


}
