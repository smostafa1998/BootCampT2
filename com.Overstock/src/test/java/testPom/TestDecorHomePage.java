package testPom;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DecorHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;


public class TestDecorHomePage extends TestBase {


    @Test()
    public void verifyDecorTest1() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        database.insertDataFromListToSqlTable(oneDList(decor.featuredCategories), "FurnitureList", "Items");
        waitForElementToBeVisible(decor.saleItems);
        clickOnElement(decor.saleItems);
        clickOnElement(decor.dropDownSortBy);
        waitForElementToBeVisible(decor.customerRating);
        clickOnElement(decor.customerRating);
        database.insertDataFromListToSqlTable(oneDList(decor.listOfProducts), "ProductList", "Items");
    }

    @Test(enabled = false)
    public void verifyDecorTest2() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.indoorFireplace);
        waitForElementToBeVisible(decor.naturalGas);
        clickOnElement(decor.naturalGas);
        clickOnElement(decor.dropDownPrice);
        clickJScript(decor.checkBoxPrice);
        waitForElementToBeVisible(decor.checkBoxPriceConfirm);
        database.insertDataFromListToSqlTable(oneDList(decor.listOfFireplace), "fireplaceList", "Items");
    }

    @Test(enabled = false)
    public void verifyDecorTest3() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        waitForElementToBeVisible(decor.throwPillows);
        clickOnElement(decor.throwPillows);
        waitForElementToBeVisible(decor.pillowClick);
        clickOnElement(decor.pillowClick);
        waitForElementToBeVisible(decor.textProduct);
        clickOnElement(decor.textProduct);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForElementToBeVisible(decor.productName);
        String actualText = decor.productName.getText();
        String expectedText = "nuLOOM Textured Moroccan Ottoman Pouf";
        Assert.assertEquals(actualText, expectedText);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(enabled = false)
    public void verifyDecorTest4() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.mirrorTab);
        clickOnElement(decor.mirrorOnSales);
        clickOnElement(decor.mirrorProduct);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(decor.mirrorSize);
        clickOnElement(decor.mirrorColor);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        clickOnElement(decor.inputAccount);
        foundIframe(decor.loginIframe);
        waitForElementToBeVisible(decor.registerTitle);
        String actualText = decor.registerTitle.getText();
        String expectedText = "User AddCreate Account";
        Assert.assertEquals(actualText, expectedText);
        homepage.enterUserInfo(decor.inputEmail, "smostafa1998@gmail.com", decor.inputPassword, "testing123");
    }

    @Test(enabled = false)
    public void verifyDecorTest5() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.hoverToDecor();
        clickOnElement(decor.DecorAdvice);
        sendKeysToInput(decor.searchInput, "carpet");
        clickOnElement(decor.buttonSubmit);
        printOutListOfElements(decor.listOfArticles);
        clickOnElement(decor.pickArticle);
        waitForElementToBeVisible(decor.authorInfo);
        String actualText = decor.authorInfo.getText();
        String expectedText = "by Christina Rodgers";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyDecorTest6() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.halloweenPic);
        clickOnElement(decor.sortBy);
        clickOnElement(decor.lowToHigh);
        clickOnElement(decor.brandsButton);
        oneDList(decor.listOfBrands);
        oneDhref(decor.listOfWebsites);
        clickOnElement(decor.firstBrand);
        clickOnElement(decor.clickArrow);
        waitForElementToBeVisible(decor.description);
        String actualText = decor.description.getText();
        String expectedText = "Be afraid. Be very afraid of Haunted Hill Farm's Lawn of the Dead Collection. These blood curdling creatures are sure to terrify any trick-or-treaters, co-workers, or customers.";
        Assert.assertEquals(actualText, expectedText);

    }

    @Test(enabled = false)
    public void verifyDecorTest7() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.clickArticle);
        oneDList(decor.listOfSteps);
        scrollJS(5500);
        foundIframe(decor.videoIframe);
        clickOnElement(decor.playButton);
        clickOnElement(decor.pauseButton);
    }

    @Test(enabled = false)
    public void verifyDecorTest8() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        printOutListOfElements(decor.companyInformation);
        clickOnElement(decor.newsRoom);
        printOutListOfElements(decor.teamPositions);
        database.insertDataFromListToSqlTable(oneDList(decor.teamNames),"overstockTeam","Names");
        //database.insertDataFrom2ListsToSqlTable(oneDList(decor.teamNames),oneDList(decor.teamPositions),"Overstock Team","Names","Positions");
        waitForElementToBeVisible(decor.textForZIP);
        String actualText = decor.textForZIP.getText();
        String expectedText = "Download our press kit for logos and proper usage guidelines";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyDecorTest9() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.hoverToDecor();
        clickOnElement(decor.clocks);
        scrollJS(10000);
        database.insertDataFrom2ListsToSqlTable(oneDList(decor.clockTypes),oneDhref(decor.clockTypesHREF),"ClockTypes","Names","Links");
        //List<String> elementCopied = new ArrayList<>();
        for (WebElement element : decor.feedBack) {
            System.out.println(element.getAttribute("aria-label"));
            //elementCopied.add(element.getAttribute("aria-label"));
        }
    }

    @Test(enabled = false)
    public void verifyDecorTest10() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.lightningTab);
        printOutListOfElements(decor.lighningList);
        clickOnElement(decor.clickReadMore);
        printOutListOfElements(decor.lighningStyles);
        database.insertDataFromListToSqlTable(oneDList(decor.lighningStyles),"overstockLightning","Steps");
    }


}
