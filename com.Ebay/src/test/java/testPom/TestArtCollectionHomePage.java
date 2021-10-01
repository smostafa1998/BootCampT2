package testPom;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.ArtCollectionHomePage;
import pom.Homepage;
import testBase.TestBase;

/**
 * This is for ebay tests
 */

public class TestArtCollectionHomePage extends TestBase {


    /**
     * This one tests basic buttons and will either test
     * dataabase or excel (NOT COMPLETLY DONE)
     */
    @Test(enabled=false)
    public void verifyArtCollectionTest1(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection();
        waitForElementToBeVisible(artCollection.teddyLabel);
        clickOnElement(artCollection.teddyLabel);
        database.insertDataFromListToSqlTable(oneDList(artCollection.dollBrands),"dollList","Brands");
        System.out.println("done");
    }

    /**
     * This one tests hover actions, add assert here
     */
    @Test(enabled=false)
    public void verifyArtCollectionTest2(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        waitForElementToBeVisible(artCollection.comicsLabel);
        clickOnElement(artCollection.comicsLabel);
        waitForElementToBeVisible(artCollection.auctionsEndingSoon);
        clickOnElement(artCollection.auctionsEndingSoon);
        hoverAction(artCollection.auctionSortButton);
        hoverAction(artCollection.mostBids);
        clickOnElement(artCollection.mostBids);
        oneDList(artCollection.numOfResults);
        database.insertDataFromListToSqlTable(oneDList(artCollection.numOfResults),"EbayList","itemsBid");

    }

    /**
     * This one tests send keys. assert here tooo with database
     * loading into the database as actual
     * using microsoft excel for expected or another database
     */
    @Test(enabled=false)
    public void verifyArtCollectionTest3() {
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        waitForElementToBeVisible(artCollection.antiquesLink);
        clickOnElement(artCollection.antiquesLink);
        clickOnElement(artCollection.stylesLink);
        sendKeysToInput(artCollection.keywordSearch,"carpet");
        clickOnElement(artCollection.keywordSearchButton);
        database.insertDataFromListToSqlTable(oneDList(artCollection.productList),"EbayListProducts","productList");

        //String relPath = ABSOLUTE_PATH+"/src/main/resources/blah.xlsx";
        //dataReader.fileReaderIntegerXSSF(relPath,"sheet0");
        //dataReader.writeBackIntegerXSSF(1,relPath);
        //dataReader.writeBackListXSSF(elementCopied,relPath);
        //String relPath = "/src/test/resources/testData/HomepageTestData.xlsx";
        //String sheetName = "testNFLDropdownMenuItems";

        //SoftAssert softAssert = new SoftAssert();

        //String[] expectedText = dataReader.fileReaderStringXSSF(ABSOLUTE_PATH + relPath, sheetName);
        //int length = elementCopied.size();

       // for (int i=0;i<length;i++){
           // System.out.println("EXPECTED: " + expectedText[i] + "\nACTUAL: " + actualTextWebElementList.get(i));
           // softAssert.assertEquals(actualTextWebElementList.get(i), expectedText[i]);
       // }
    }

    @Test(enabled=false)
    public void verifyArtCollectionTest4(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        clickOnElement(artCollection.categoryBox);
        dropdownSelectByValue(artCollection.selectCategory,"220");
        sendKeysToInput(artCollection.searchBox,"shang chi");
        clickOnElement(artCollection.searchButton);
        clickOnElement(artCollection.DisneyCheckbox);
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
    public void verifyArtCollectionTest6(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        clickOnElement(artCollection.sellSomething);
        clickOnElement(artCollection.popularFeaturedButton);
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


}
