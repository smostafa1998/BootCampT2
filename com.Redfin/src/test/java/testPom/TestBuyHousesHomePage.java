package testPom;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BuyHousesHomePage;
import pom.Homepage;
import testBase.TestBase;
import java.util.ArrayList;
import java.util.List;


public class TestBuyHousesHomePage extends TestBase {
    @Test(enabled = false)
    public void verifyBuyHousesTest1(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        homepage.doPriceRanges(houses.clickButton,houses.minPrice,houses.clickButton2,houses.maxPrice);
        clickOnElement(houses.searchButton);
        clickOnElement(houses.checkTable);
        database.insertDataFromListToSqlTable(oneDList(houses.listAdresses),"RedFinList","addresses");
    }

    @Test(enabled = false)
    public void verifyBuyHousesTest2(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        homepage.clearSearch(houses.searchButtonLocation,houses.clearButton);
        waitForElementToBeVisible(houses.sendKeysToInput);
        clearInputText(houses.sendKeysToInput);
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
        String expectedText = "";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test (enabled = false) //not perfect but will work
    public void verifyBuyHousesTest3(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        clickOnElement(houses.firstOffer);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForElementToBeVisible(houses.tourText);
        String actualText = houses.tourText.getText();
        String expectedText = "Go tour this home";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("DONE");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test (enabled = false)
    public void verifyBuyHousesTest4(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        oneDList(houses.redfinLinks);
        clickOnElement(houses.ourMission);
        clickOnElement(houses.learnMore);
        clickOnElement(houses.playButton);
        foundIframe(houses.iframeSwitch);
        clickOnElement(houses.pauseButton);

    }

    @Test (enabled = false)
    public void verifyBuyHousesTest5(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        clickOnElement(houses.blogButton);
        clickOnElement(houses.buyingHome);
        oneDhref(houses.buyingHomeArticles);
        clickOnElement(houses.HomeArticlesNumOne);
        oneDList(houses.notCovered);
    }

    /**
     * SHADOW TAB ENABLED HERE WORK ON LATER
     */
    @Test (enabled = false)
    public void verifyBuyHousesTest6(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        clickOnElement(houses.investorsTab);
    }

    @Test ()
    public void verifyBuyHousesTest7(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        clickOnElement(houses.landForSale);
        waitForElementToBeVisible(houses.sendKeysToInput);
        clearInputText(houses.sendKeysToInput);
        homepage.sendKeywordLocation(houses.sendKeysToInput,"california",houses.caliPick);
        homepage.doPriceRanges(houses.clickButton,houses.minPriceCA,houses.clickButton2,houses.maxPriceCA);
        clickOnElement(houses.searchButton);
        clickOnElement(houses.checkTable);
        oneDList(houses.caliAreas);
        clickOnElement(houses.clickSF);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(houses.checkTable);
        oneDList(houses.SFAreas);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

}
