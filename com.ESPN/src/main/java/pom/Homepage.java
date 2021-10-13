package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class Homepage extends BaseClass {
    /**
     * ESPN HOMEPAGE
     */
    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * this is to navigate to the NFL page
     */
    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[1]/a/span/span[1]")
    public WebElement nfl;

    @FindBy(xpath = "//*[@id=\"global-nav\"]/ul/li[1]/div/ul[1]/li[1]/a")
    public WebElement nfl2;


    public NFLHomePage navigateToNFLHomePage() {
        waitForElementToBeVisible(nfl);
        clickOnElement(nfl);
        clickOnElement(nfl2);
        return new NFLHomePage();
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/NFLTestCases.xlsx";
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