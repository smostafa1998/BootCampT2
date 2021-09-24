package testPom;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pom.DecorHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TestDecorHomePage extends TestBase {


    @Test(enabled=false)
    public void verifyDecorTest1(){
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        List<String> elementCopied2 = new ArrayList<>();
        DecorHomePage decor = homepage.navigateToDecor();
        getListOfElements(decor.featuredCategories,elementCopied);
        database.insertDataFromListToSqlTable(elementCopied,"FurnitureList","Items");
        waitForElementToBeVisible(decor.saleItems);
        clickOnElement(decor.saleItems);
        clickOnElement(decor.dropDownSortBy);
        waitForElementToBeVisible(decor.customerRating);
        clickOnElement(decor.customerRating);
        getListOfElements(decor.listOfProducts,elementCopied2);
        database.insertDataFromListToSqlTable(elementCopied,"ProductList","Items");
    }

    @Test(enabled=true)
    public void verifyDecorTest2(){
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.indoorFireplace);
        waitForElementToBeVisible(decor.naturalGas);
        clickOnElement(decor.naturalGas);
        clickOnElement(decor.dropDownPrice);
        clickJScript(decor.checkBoxPrice);
       // clickOnElement(decor.checkBoxPrice);
        //webDriverWait.until(ExpectedConditions.elementSelectionStateToBe(decor.checkBoxPrice, true));
// stfu sabreen i hope you have a good coding session - from kenny
    }

    @Test(enabled=false)
    public void verifyDecorTest3(){
        Homepage homepage = getHomepage();
    }


}
