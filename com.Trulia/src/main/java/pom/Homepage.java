package pom;

import base.BaseClass;
import org.openqa.selenium.ElementNotVisibleException;
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

    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/header/nav/ul/li[3]/a")
    public WebElement mortageTab;

    public MortagesHomePage navigateToMortagesPage(){
        clickOnElement(mortageTab);
        System.out.println("clicked");
        return new MortagesHomePage();
    }

    public void calculatorKeyboard(WebElement keyWord, String input){
        clickOnElement(keyWord);
        sendKeysToInput(keyWord,input);
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/TruliaTestCases.xlsx";
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