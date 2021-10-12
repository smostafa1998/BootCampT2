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

    @FindBy(xpath="//div[5]/div/div/header/section[2]/section[3]/section/nav/ul/li[1]/a")
    public WebElement checkingTab;

    @FindBy(xpath="//*[@id=\"product-1\"]/ul/li[1]/a")
    public WebElement checkingLink;

    public CheckingsHomePage navigateToCheckingsPage(){
        clickOnElement(checkingTab);
        clickOnElement(checkingLink);
        System.out.println("clicked");
        return new CheckingsHomePage();
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/ChaseTestCases.xlsx";
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