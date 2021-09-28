package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DecorHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestDecorHomePage extends TestBase {


    @Test(enabled = false)
    public void verifyDecorTest1() {
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        List<String> elementCopied2 = new ArrayList<>();
        DecorHomePage decor = homepage.navigateToDecor();
        getListOfElements(decor.featuredCategories, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "FurnitureList", "Items");
        waitForElementToBeVisible(decor.saleItems);
        clickOnElement(decor.saleItems);
        clickOnElement(decor.dropDownSortBy);
        waitForElementToBeVisible(decor.customerRating);
        clickOnElement(decor.customerRating);
        getListOfElements(decor.listOfProducts, elementCopied2);
        database.insertDataFromListToSqlTable(elementCopied, "ProductList", "Items");
    }

    @Test(enabled = false)
    public void verifyDecorTest2() {
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.indoorFireplace);
        waitForElementToBeVisible(decor.naturalGas);
        clickOnElement(decor.naturalGas);
        clickOnElement(decor.dropDownPrice);
        clickJScript(decor.checkBoxPrice);
        waitForElementToBeVisible(decor.checkBoxPriceConfirm);
        getListOfElements(decor.listOfFireplace, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "fireplaceList", "Items");
    }

    @Test()
    public void verifyDecorTest3() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        waitForElementToBeVisible(decor.throwPillows);
        clickOnElement(decor.throwPillows);
        waitForElementToBeVisible(decor.pillowClick);
        clickOnElement(decor.pillowClick);
        waitForElementToBeVisible(decor.textProduct);
        clickOnElement(decor.textProduct);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForElementToBeVisible(decor.productName);
        String actualText = decor.productName.getText();
        String expectedText = "nuLOOM Textured Moroccan Ottoman Pouf";
        Assert.assertEquals(expectedText, actualText);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyDecorTest4(){
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.inputAccount);
        foundIframe(decor.loginIframe);
        homepage.enterUserInfo(decor.inputEmail,"smostafa1998@gmail.com",decor.inputPassword,"testing123");
    }


}
