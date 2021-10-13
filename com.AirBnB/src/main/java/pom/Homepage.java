package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

/**
 * AIR B&B HOMEPAGE
 */

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[5]//form/div[1]/div[2]/a")
    public WebElement onlineExperience;


    /**
     * This is to navigate to the online experiences
     */

    public OnlineExperiencesHomePage navigateToOnlineExperiences(){
        clickOnElement(onlineExperience);
        System.out.println("clicked");
        return new OnlineExperiencesHomePage();
    }

    public void createDates(WebElement clickDate, WebElement startDate,WebElement endDate){
        clickOnElement(clickDate);
        clickOnElement(startDate);
        clickOnElement(endDate);
    }

    public void createAdultsGuests(WebElement clickGuests, WebElement numAdults){
        clickOnElement(clickGuests);
        clickOnElement(numAdults);
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/AirBnBTC.xlsx";
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
