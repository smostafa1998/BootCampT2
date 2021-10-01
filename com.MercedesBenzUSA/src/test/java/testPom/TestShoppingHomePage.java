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
        ShoppingHomePage shopping = homepage.navigateToShopping();
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.OwnersLink, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "OwnersList", "links");
    }

    @Test(enabled = false)
    public void verifyShoppingTest2() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.estimatePayment);
        clickOnElement(shopping.budgetTab);
        addingKeyboardInput(shopping.monthlyPayment,"50000");
        buttonSelect(shopping.yearButton,shopping.year2020);
        buttonSelect(shopping.term,shopping.numOfmonths);
        addingKeyboardInput(shopping.downPayment,"10000");
        clickOnElement(shopping.submitButton);
        waitForElementToBeVisible(shopping.errorMessage);
        String actualText = shopping.errorMessage.getText();
        String expectedText = "Sorry, there are no results that match your criteria.";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyShoppingTest3() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.specialOffers);
        clickOnElement(shopping.imInterested);
        clickOnElement(shopping.classButton);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.classList, elementCopied);
        clickOnElement(shopping.CLA);
        clickOnElement(shopping.model);
        List<String> elementCopied2 = new ArrayList<>();
        getListOfElements(shopping.modelList, elementCopied2);
        clickOnElement(shopping.claCoup);

    }

    @Test(enabled = false)
    public void verifyShoppingTest4() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.vehicleAccessories);
        buttonSelect(shopping.selectYear,shopping.select2019);
        buttonSelect(shopping.selectClass,shopping.gClass);
        buttonSelect(shopping.selectModel,shopping.amgModel);
        clickOnElement(shopping.submitButtonShop);
        waitForElementToBeVisible(shopping.serviceTab);
        clickOnElement(shopping.serviceTab);
        waitForElementToBeVisible(shopping.titleVehicle);
        String actualText = shopping.titleVehicle.getText();
        String expectedText = "2019 AMG G 63 SUV Accessories";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test(enabled = false)
    public void verifyShoppingTest5() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.lifestyleAccessories);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(shopping.cookiesAcceptButton);
        clickOnElement(shopping.bagTab);
        List<String> elementCopied2 = new ArrayList<>();
        getListOfElements(shopping.bagsList, elementCopied2);
        clickOnElement(shopping.firstProduct);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyShoppingTest6() {
        Homepage homepage = getHomepage();
        ShoppingHomePage shopping = homepage.navigateToShopping();
        clickOnElement(shopping.resourcesTab);
        clickOnElement(shopping.vehicleManual);
        clickOnElement(shopping.downloadManuel);
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(shopping.typesofVehicles, elementCopied);
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
    }


}
