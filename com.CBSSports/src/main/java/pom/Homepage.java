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
        //clickOnElement(AcceptButton);
    }

    @FindBy(xpath="/html/body/div[7]//div[1]//div[2]//button")
    public WebElement AcceptButton;

    @FindBy(xpath="//*[@id=\"cbs-site-nav\"]/div/nav/ul/li[5]/a")
    public WebElement soccerLink;



    /**
     * This is to navigate to the soccer collections page of cbsSports
     * @return
     */

    public SoccerHomePage navigateToSoccer(){
        clickOnElement(soccerLink);
        System.out.println("clicked");
        return new SoccerHomePage();
    }

    public SoccerHomePage hoverToSoccer(){
        hoverAction(soccerLink);
        return new SoccerHomePage();
    }
    public void enterUserInfo(WebElement email, String emailName, WebElement password, String passwordName){
        waitForElementToBeVisible(email);
        clickOnElement(email);
        sendKeysToInput(email,emailName);
        waitForElementToBeVisible(password);
        clickOnElement(password);
        sendKeysToInput(password,passwordName);
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/CBSTestCases.xlsx";
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