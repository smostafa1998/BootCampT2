package testPom;
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
    @Test(enabled=true,description="testing List<elements>")
    public void verifyArtCollectionTest1(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection();
        waitForElementToBeVisible(artCollection.teddyLabel);
        clickOnElement(artCollection.teddyLabel);
        getListOfElements(artCollection.dollBrands);
        //remember to so assert here can use database or excel
        System.out.println("done");
    }

    /**
     * This one tests hover actions, add assert here
     */
    @Test(enabled=true)
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
        getListOfElements(artCollection.numOfResults);

    }

    /**
     * This one tests send keys. assert here tooo with database
     */
    @Test(enabled=true)
    public void verifyArtCollectionTest3(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection2();
        waitForElementToBeVisible(artCollection.antiquesLink);
        clickOnElement(artCollection.antiquesLink);
        clickOnElement(artCollection.stylesLink);
        sendKeysToInput(artCollection.keywordSearch,"carpet");
        clickOnElement(artCollection.keywordSearchButton);
        getListOfElements(artCollection.productList);
        //waitForElementToBeVisible(artCollection.artlabel);
        //String actualText = artCollection.artlabel.getText();
       // String expectedText = "Collectibles & Art";
        //Assert.assertEquals(expectedText, actualText);
        //System.out.println("");

    }

}
