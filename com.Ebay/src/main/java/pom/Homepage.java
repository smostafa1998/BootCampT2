package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

/**
 * EBAY HOMEPAGE
 */
public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")
    public WebElement artCollection;

    //////these go together///////////

    @FindBy (xpath = "//*[@id=\"gh-shop-a\"]")
    public WebElement categoryButton;

    @FindBy (xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[1]/a")
    public WebElement artCollection2;

    //////////these go together///////

    @FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/ul/li[6]")
    public WebElement hoverArtCollection;



    /**
     * This is to navigate to the art collections page of ebay
     * @return
     */
    public ArtCollectionHomePage navigateToArtCollection(){
        clickOnElement(artCollection);
        System.out.println("clicked");
        return new ArtCollectionHomePage();
    }

    public ArtCollectionHomePage navigateToArtCollection2(){
        clickOnElement(categoryButton);
        clickOnElement(artCollection2);
        return new ArtCollectionHomePage();
    }

    public ArtCollectionHomePage hoverToArt(){
        hoverAction(hoverArtCollection);
        return new ArtCollectionHomePage();
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/EbayTestCases.xlsx";
        SoftAssert softAssert = new SoftAssert();
        String[] expectedText = dataReader.fileReaderStringXSSF(relPath, sheetname);
        int length = tested.size();
        for (int i = 0; i < length; i++) {
            System.out.println("EXPECTED: " + expectedText[i] + "\nACTUAL: " + tested.get(i));
            softAssert.assertEquals(tested.get(i), expectedText[i]);
        }
        softAssert.assertAll();
    }

}