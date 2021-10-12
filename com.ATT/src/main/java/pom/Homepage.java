package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Put all elements under here for the devices page
     * Att.com -> devices page
     */

    @FindBy(xpath="//*[@id=\"HEADBAND01\"]")
    public WebElement phoneLink;

    public DevicesHomePage navigateToDevicesHomePage(){
        waitForElementToBeVisible(phoneLink);
        clickOnElement(phoneLink);
        return new DevicesHomePage();
    }


    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/ATTTestCases.xlsx";
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
