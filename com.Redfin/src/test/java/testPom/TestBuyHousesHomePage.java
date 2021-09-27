package testPom;

import org.testng.annotations.Test;
import pom.BuyHousesHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;


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

    @Test
    public void verifyBuyHousesTest2(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.hoverToBuy();

    }

    @Test(enabled= false)
    public void verifyBuyHousesTest3(){
        Homepage homepage = getHomepage();
        BuyHousesHomePage houses = homepage.navigateToBuy();

    }
}
