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


    // decor elements

    @FindBy(xpath="//*[@id=\"TopNav\"]/div[1]/div[3]/a")
    public WebElement decorTab;

    @FindBy(xpath="//*[@id=\"TopNav\"]/div[1]/div[5]/a")
    public WebElement anotherTab;

    @FindBy(xpath="//*[@id=\"push_notifications_container\"]/div[4]/div[1]")
    public WebElement notification_no_thanks;

    @FindBy(xpath="//*[@id=\"push_notifications_container\"]/svg")
    public WebElement notification_close;

    @FindBy(xpath="//*[@id=\"notification_allow\"]")
    public WebElement notification_allow;

    /**
     * This is to navigate to the decor collections page of ebay
     * @return
     */
    public DecorHomePage navigateToDecor(){
        clickOnElement(anotherTab);
        clickOnElement(decorTab);
        System.out.println("clicked");
        return new DecorHomePage();
    }

    public DecorHomePage hoverToDecor(){
        clickOnElement(anotherTab);
        clickOnElement(decorTab);
        hoverAction(decorTab);
        return new DecorHomePage();
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
        String relPath = ABSOLUTE_PATH + "/src/test/resources/OverstockTestCases.xlsx";
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