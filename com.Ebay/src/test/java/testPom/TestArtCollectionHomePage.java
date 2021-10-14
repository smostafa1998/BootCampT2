package testPom;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.ArtCollectionHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.io.IOException;
import java.util.List;

/**
 * This is for ebay tests
 */

public class TestArtCollectionHomePage extends TestBase {


    /**
     * This one tests basic buttons and will either test
     * dataabase or excel (NOT COMPLETLY DONE)
     */
    @Test(enabled = false)
    public void verifyArtCollectionTest1() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection();
        waitForElementToBeVisible(artCollection.teddyLabel);
        clickOnElement(artCollection.teddyLabel);
        List<String> test = oneDList(artCollection.dollBrands);
        homepage.assertOneDList(test,"EbayT1");
        database.insertDataFromListToSqlTable(oneDList(artCollection.dollBrands),"dollList","Brands");
    }

    /**
     * This one tests hover actions, add assert here
     */
    @Test(enabled=false)
    public void verifyArtCollectionTest2() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        waitForElementToBeVisible(artCollection.comicsLabel);
        clickOnElement(artCollection.comicsLabel);
        waitForElementToBeVisible(artCollection.auctionsEndingSoon);
        clickOnElement(artCollection.auctionsEndingSoon);
        clickOnElement(artCollection.auctionSortButton);
        hoverAction(artCollection.mostBids);
        clickOnElement(artCollection.mostBids);
        waitForElementToBeVisible(artCollection.firstResult);
        String actualText = artCollection.firstResult.getText();
        String expectedText = "Star Wars: The Clone Wars (2008) #1 - Ahsoka First Appearance - Good Condition!";
        Assert.assertEquals(actualText,expectedText);
        database.insertDataFromListToSqlTable(oneDList(artCollection.numOfResults),"EbayList","itemsBid");

    }

    /**
     * This one tests send keys. assert here tooo with database
     * loading into the database as actual
     * using microsoft excel for expected or another database
     */
    @Test(enabled=false)
    public void verifyArtCollectionTest3() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        waitForElementToBeVisible(artCollection.antiquesLink);
        clickOnElement(artCollection.antiquesLink);
        clickOnElement(artCollection.stylesLink);
        sendKeysToInput(artCollection.keywordSearch,"carpet");
        clickOnElement(artCollection.keywordSearchButton);
        List<String> test = oneDList(artCollection.productList);
        homepage.assertOneDList(test,"EbayT3");
        database.insertDataFromListToSqlTable(oneDList(artCollection.productList),"EbayListProducts","productList");
    }

    @Test(enabled=false)
    public void verifyArtCollectionTest4() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        clickOnElement(artCollection.categoryBox);
        dropdownSelectByValue(artCollection.selectCategory,"220");
        sendKeysToInput(artCollection.searchBox,"shang chi");
        clickOnElement(artCollection.searchButton);
        clickOnElement(artCollection.DisneyCheckbox);
        List<String> test = oneDList(artCollection.disneySCList);
        homepage.assertOneDList(test,"EbayT4");
        oneDList(artCollection.disneySCList);
    }


    @Test(enabled = false)
    public void verifyArtCollectionTest5(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        clickOnElement(artCollection.vintageAntiqueCategory);
        clickOnElement(artCollection.AGI);
        buttonSelect(artCollection.buttonBrand,artCollection.newBox);
        oneDList(artCollection.jewleryList);
        waitForElementToBeVisible(artCollection.numofJewleryResults);
        String actualText = artCollection.numofJewleryResults.getText();
        String expectedText = "22 Results";
        Assert.assertEquals(actualText,expectedText);
    }


    @Test(enabled = false)
    public void verifyArtCollectionTest6() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        clickOnElement(artCollection.sellSomething);
        clickOnElement(artCollection.popularFeaturedButton);
        List<String> test = oneDList(artCollection.categoryList);
        homepage.assertOneDList(test,"EbayT6");
        database.insertDataFromListToSqlTable(oneDList(artCollection.categoryList),"CategoryList","Category");
    }

    @Test(enabled = false)
    public void verifyArtCollectionTest7(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        clickOnElement(artCollection.sellSomething);
        clickOnElement(artCollection.popularFeaturedButton);
        clickOnElement(artCollection.videoAndGame);
        buttonSelect(artCollection.conditionBox,artCollection.condition);
        buttonSelect(artCollection.brandBox,artCollection.brand);
        buttonSelect(artCollection.modelBox,artCollection.model);
        buttonSelect(artCollection.platformBox,artCollection.platform);
        buttonSelect(artCollection.regionBox,artCollection.region);
        waitForElementToBeVisible(artCollection.avgPrice);
        String actualText = artCollection.avgPrice.getText();
        String expectedText = "$95-$305";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test(enabled = false)
    public void verifyArtCollectionTest8() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        clickOnElement(artCollection.caseBreaks);
        clickOnElement(artCollection.buttonSports);
        waitForElementToBeVisible(artCollection.firstTeam);
        String actualText = artCollection.firstTeam.getText();
        String expectedText = "A.S. Junior Pallacanestro Casale\n" +
                "(11) Items";
        Assert.assertEquals(actualText,expectedText);
        clickOnElement(artCollection.firstCheckBox);
        clickOnElement(artCollection.secondCheckbox);
        clickOnElement(artCollection.closeButton);
    }

    @Test(enabled = false)
    public void verifyArtCollectionTest9(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.hoverToArt();
        clickOnElement(artCollection.bullionButton);
        clickOnElement(artCollection.bullionGlossary);
        clickOnElement(artCollection.sLetter);
        waitForElementToBeVisible(artCollection.firstSWord);
        String actualText = artCollection.firstSWord.getText();
        String expectedText = "SHORT SALE :";
        Assert.assertEquals(actualText,expectedText);
        database.insertDataFromListToSqlTable(getRangeFromList(artCollection.glossaryList,145,156),"Definitions","words");
    }

    @Test(enabled = false)
    public void verifyArtCollectionTest10(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.hoverToArt();
        clickOnElement(artCollection.consigmentButton);
        waitForElementToBeVisible(artCollection.videoText);
        String actualText = artCollection.videoText.getText();
        String expectedText = "See how Ciara brought her business from a dorm room to a warehouse in one year.";
        Assert.assertEquals(actualText,expectedText);
        clickOnElement(artCollection.videoButton);
        foundIframe(artCollection.iframe);
        clickOnElement(artCollection.playButton);
        clickOnElement(artCollection.pauseButton);
    }

    @Test(enabled = false)
    public void verifyArtCollectionTest11() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.hoverToArt();
        clickOnElement(artCollection.funkoLink);
        clickOnElement(artCollection.seeAll);
        clickOnElement(artCollection.topRated);
        waitForElementsToBeVisible(artCollection.topRatedList);
        List<String> test = oneDhref(artCollection.topRatedList);
        homepage.assertOneDList(test,"EbayT11");
    }

    @Test(enabled = false)
    public void verifyArtCollectionTest12() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.hoverToArt();
        clickOnElement(artCollection.urbanLink);
        waitForElementsToBeVisible(artCollection.urbanBrandList);
        List<String> test = oneDList(artCollection.urbanBrandList);
        homepage.assertOneDList(test,"EbayT12");
    }

    @Test(enabled = false)
    public void verifyArtCollectionTest13() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.hoverToArt();
        clickOnElement(artCollection.memorabelia);
        clickOnElement(artCollection.shopEvents);
        waitForElementToBeVisible(artCollection.goFlow);
        clickOnElement(artCollection.goFlow);
        addingKeyboardInput(artCollection.airInput,"AC");
        clickOnElement(artCollection.submit);
        waitForElementToBeVisible(artCollection.itemAC);
        String actualText = artCollection.itemAC.getText();
        String expectedText = "GermGuardian® AC4900CA Factory Reconditioned 4-in-1 Air Purifying System";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test(enabled = false)
    public void verifyArtCollectionTest14() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.hoverToArt();
        clickOnElement(artCollection.militaria);
        clickOnElement(artCollection.clickOnSecondProduct);
        waitForElementToBeVisible(artCollection.reviewsButton);
        clickOnElement(artCollection.reviewsButton);
        List<String> test = oneDhref(artCollection.reviewsLink);
        homepage.assertOneDList(test,"EbayT14");
    }

    @Test(enabled = false)
    public void verifyArtCollectionTest15() throws IOException {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.hoverToArt();
        clickOnElement(artCollection.potteryLink);
        clickOnElement(artCollection.royalCopen);
        waitForElementsToBeVisible(artCollection.royalCopenMore);
        List<String> test = oneDList(artCollection.royalCopenMore);
        homepage.assertOneDList(test,"EbayT15");
    }

}
