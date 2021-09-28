package testPom;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BuyHousesHomePage;
import pom.Homepage;
import testBase.TestBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class TestBuyHousesHomePage extends TestBase {
    @Test(enabled=false)
    public void verifyBuyHousesTest1(){
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        homepage.doPriceRanges(houses.clickButton,houses.minPrice,houses.clickButton2,houses.maxPrice);
        clickOnElement(houses.searchButton);
        clickOnElement(houses.checkTable);
        getListOfElements(houses.listAdresses,elementCopied);
        database.insertDataFromListToSqlTable(elementCopied,"RedFinList","addresses");
    }

    @Test(enabled=false)
    public void verifyBuyHousesTest2(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        homepage.clearSearch(houses.searchButtonLocation,houses.clearButton);
        waitForElementToBeVisible(houses.sendKeysToInput);
        homepage.sendKeywordLocation(houses.sendKeysToInput,"maine",houses.mainePick);
        homepage.doPriceRanges(houses.clickButton,houses.minPrice,houses.clickButton2,houses.maxPrice);
        clickOnElement(houses.searchButton);
        clickOnElement(houses.filterButton);
        clickOnElement(houses.clickHouse);
        clickOnElement(houses.stepUpBath);
        clickOnElement(houses.stepUpBathOne);
        clickJScript(houses.openHouses);
        clickOnElement(houses.anytimeRadio);
        clickOnElement(houses.applyFilter);
        waitForElementToBeVisible(houses.noResults);
        String actualText = houses.noResults.getText();
        String expectedText = "No results!";
        Assert.assertEquals(expectedText, actualText);

    }
    @Test (enabled=false) //not perfect but will work
    public void verifyBuyHousesTest3(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        String parentTab = driver.getWindowHandle();
        clickOnElement(houses.firstOffer);
        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> tabHandles = driver.getWindowHandles();
        Iterator<String> iterator = tabHandles.iterator();

        while (iterator.hasNext()) {
            String childTab = iterator.next();

            if (!(childTab.equalsIgnoreCase(parentTab))) {
                driver.switchTo().window(childTab);
                break;
            }
        }
        waitForElementToBeVisible(houses.addressText);
        String actualText = houses.addressText.getText();
        String expectedText = "$498,500";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("DONE");
        driver.switchTo().window(parentTab);
    }



}
