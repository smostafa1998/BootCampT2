package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.ArtCollectionHomePage;
import pom.Homepage;
import testBase.TestBase;

/**
 * EBAY TEST HOMEPAGE
 */
public class TestHomepage extends TestBase {


    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToArtCollection(){
        Homepage homepage = getHomepage();
        ArtCollectionHomePage artCollection = homepage.navigateToArtCollection();
        waitForElementToBeVisible(artCollection.artlabel);
        String actualText = artCollection.artlabel.getText();
        String expectedText = "Collectibles & Art";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND ART WEBSITE");
    }

}
