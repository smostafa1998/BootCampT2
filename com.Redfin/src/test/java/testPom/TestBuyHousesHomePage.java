package testPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BuyHousesHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TestBuyHousesHomePage extends TestBase {
    @Test(enabled = false)
    public void verifyBuyHousesTest1() throws IOException {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        homepage.doPriceRanges(houses.clickButton, houses.minPrice, houses.clickButton2, houses.maxPrice);
        clickOnElement(houses.searchButton);
        clickOnElement(houses.checkTable);
        List<String> test = oneDList(houses.listAdresses);
        homepage.assertOneDList(test, "BuyT1");
        database.insertDataFromListToSqlTable(oneDList(houses.listAdresses), "RedFinList", "addresses");
    }

    @Test(enabled = false)
    public void verifyBuyHousesTest2() {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        homepage.clearSearch(houses.searchButtonLocation, houses.clearButton);
        waitForElementToBeVisible(houses.sendKeysToInput);
        clearInputText(houses.sendKeysToInput);
        homepage.sendKeywordLocation(houses.sendKeysToInput, "maine", houses.mainePick);
        homepage.doPriceRanges(houses.clickButton, houses.minPrice, houses.clickButton2, houses.maxPrice);
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
        Assert.assertEquals(actualText, expectedText);

    }

    @Test(enabled = false) //not perfect but will work
    public void verifyBuyHousesTest3() {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        clickOnElement(houses.firstOffer);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForElementToBeVisible(houses.tourText);
        String actualText = houses.tourText.getText();
        String expectedText = "Go tour this home";
        Assert.assertEquals(actualText, expectedText);
        System.out.println("DONE");
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyBuyHousesTest4() throws IOException {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        List<String> test = oneDList(houses.redfinLinks);
        homepage.assertOneDList(test, "BuyT4");
        clickOnElement(houses.ourMission);
        clickOnElement(houses.learnMore);
        clickOnElement(houses.playButton);
        foundIframe(houses.iframeSwitch);
        clickOnElement(houses.pauseButton);

    }

    @Test(enabled = false)
    public void verifyBuyHousesTest5() throws IOException {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        clickOnElement(houses.blogButton);
        clickOnElement(houses.buyingHome);
        printOutHrefListOfElements(houses.buyingHomeArticles);
        clickOnElement(houses.HomeArticlesNumOne);
        List<String> test = oneDList(houses.notCovered);
        homepage.assertOneDList(test, "BuyT5");
    }


    @Test(enabled = false)
    public void verifyBuyHousesTest6() throws IOException {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        clickOnElement(houses.landForSale);
        waitForElementToBeVisible(houses.sendKeysToInput);
        clearInputText(houses.sendKeysToInput);
        homepage.sendKeywordLocation(houses.sendKeysToInput, "california", houses.caliPick);
        homepage.doPriceRanges(houses.clickButton, houses.minPriceCA, houses.clickButton2, houses.maxPriceCA);
        clickOnElement(houses.searchButton);
        clickOnElement(houses.checkTable);
        oneDList(houses.caliAreas);
        clickOnElement(houses.clickSF);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(houses.checkTable);
        List<String> test = oneDList(houses.SFAreas);
        homepage.assertOneDList(test, "BuyT6");
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

    @Test(enabled = false)
    public void verifyBuyHousesTest7() throws IOException {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        hoverAction(homepage.buyHouse);
        clickOnElement(houses.buywithRedinColumn2.get(1));
        printOutListOfElements(houses.tableOfContents);
        clickOnElement(houses.tableOfContents.get(2));
        clickOnElement(houses.pickM);
        printOutListOfElements(houses.hrefForM);
        List<String> test = oneDhref(houses.hrefForM);
        homepage.assertOneDList(test, "BuyT7");
        database.insertDataFrom2ListsToSqlTable(oneDList(houses.hrefForM), oneDhref(houses.hrefForM), "GlossaryForM", "Name", "Links");
    }

    @Test(enabled = false)
    public void verifyBuyHousesTest8() throws IOException {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        hoverAction(homepage.buyHouse);
        clickOnElement(houses.buywithRedinColumn2.get(1));
        clickOnElement(houses.tableOfContents.get(1));
        printOutListOfElements(houses.homeSellingGuide);
        System.out.println("\n");
        clickOnElement(houses.homeSellingGuideLinks.get(0));
        List<String> test = oneDList(houses.checklist);
        homepage.assertOneDList(test, "BuyT8");
    }

    @Test(enabled = false)
    public void verifyBuyHousesTest9() throws IOException {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        hoverAction(homepage.buyHouse);
        clickOnElement(houses.buywithRedinColumn2.get(2));
        clickOnElement(houses.Boston);
        printOutListOfElements(houses.openBookTitles);
        clickOnElement(houses.providersLink);
        List<String> getRangeOfNames = getRangeFromList(houses.getProvidersNames, 0, 51);
        List<String> getRangeOfRedfin = getRangeFromList(houses.getProvidersRedfin, 0, 51);
        for (String name : getRangeOfRedfin) {
            System.out.println(name);
        }
        homepage.assertOneDList(getRangeOfNames, "BuyT9");
        database.insertDataFrom2ListsToSqlTable(getRangeOfNames, getRangeOfRedfin, "Providers", "Name", "Redfin");
    }

    @Test(enabled = false)
    public void verifyBuyHousesTest10() {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        hoverAction(homepage.buyHouse);
        clickOnElement(houses.buywithRedinColumn2.get(3));

        for (int i = 1; i <= 9; i++) {
            clickOnElement(houses.selectCountyBox);
            WebElement testing = driver.findElement(By.xpath("//*[@id=\"content\"]/div[11]/section/div/span/span/div/div[1]/div/div[" + i + "]"));
            clickOnElement(testing);
        }

        clickOnElement(houses.selectCountyBox);
        List<String> getRangeOfRedfin = getRangeFromList(houses.elementsNames, 1, 8);
        for (String element : getRangeOfRedfin) {
            clickOnElement(houses.selectCountyBox);
            System.out.println(element);
        }
        waitForElementToBeVisible(houses.noClasses);
        String actualText = houses.noClasses.getText();
        String expectedText = "No Upcoming Classes";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyBuyHousesTest11() throws IOException {
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();
        hoverAction(homepage.buyHouse);
        clickOnElement(houses.buywithRedinColumn2.get(4));
        clickOnElement(houses.Demand);
        printOutListOfElements(houses.housingDemandTitles);
        printOutListOfElements(houses.housingDemandPercentages);
        database.insertDataFrom2ListsToSqlTable(oneDList(houses.housingDemandTitles), oneDList(houses.housingDemandPercentages), "HousingDemand", "Titles", "Percentages");
        List<String> test = oneDList(houses.competitveTowns);
        homepage.assertOneDList(test, "BuyT11");
    }

}
