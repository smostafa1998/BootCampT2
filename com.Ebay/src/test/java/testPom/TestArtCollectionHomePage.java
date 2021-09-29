package testPom;
import org.testng.annotations.Test;
import pom.ArtCollectionHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This is for ebay tests
 */

public class TestArtCollectionHomePage extends TestBase {


    /**
     * This one tests basic buttons and will either test
     * dataabase or excel (NOT COMPLETLY DONE)
     */
    @Test(enabled=true)
    public void verifyArtCollectionTest1(){
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection();
        waitForElementToBeVisible(artCollection.teddyLabel);
        clickOnElement(artCollection.teddyLabel);
        getListOfElements(artCollection.dollBrands,elementCopied);
        database.insertDataFromListToSqlTable(elementCopied,"dollList","Brands");
        //remember to so assert here can use database or excel
        System.out.println("done");
    }

    /**
     * This one tests hover actions, add assert here
     */
    @Test(enabled=false)
    public void verifyArtCollectionTest2(){
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        waitForElementToBeVisible(artCollection.comicsLabel);
        clickOnElement(artCollection.comicsLabel);
        waitForElementToBeVisible(artCollection.auctionsEndingSoon);
        clickOnElement(artCollection.auctionsEndingSoon);
        hoverAction(artCollection.auctionSortButton);
        hoverAction(artCollection.mostBids);
        clickOnElement(artCollection.mostBids);
        getListOfElements(artCollection.numOfResults,elementCopied);
        database.insertDataFromListToSqlTable(elementCopied,"EbayList","itemsBid");

    }

    /**
     * This one tests send keys. assert here tooo with database
     */
    @Test(enabled=false)
    public void verifyArtCollectionTest3() throws IOException {
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        waitForElementToBeVisible(artCollection.antiquesLink);
        clickOnElement(artCollection.antiquesLink);
        clickOnElement(artCollection.stylesLink);
        sendKeysToInput(artCollection.keywordSearch,"carpet");
        clickOnElement(artCollection.keywordSearchButton);
        getListOfElements(artCollection.productList,elementCopied);
        //loading into the database as actual
        //using microsoft excel for expected or another database
        database.insertDataFromListToSqlTable(elementCopied,"EbayListProducts","productList");






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

}
