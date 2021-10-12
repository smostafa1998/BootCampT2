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

    @FindBy(xpath = "//*[@id=\"gnav20-Shop-L1\"]")
    public WebElement shopTab;

    @FindBy(xpath = "//*[@id=\"gnav20-Shop-L2-4\"]")
    public WebElement accessoriesTab;

    @FindBy(xpath = "//*[@id=\"gnav20-Shop-L3-46\"]")
    public WebElement shopAllAccessories;

    @FindBy(xpath = "//*[@id=\"gnav20-eyebrow-link-Business\"]")
    public WebElement buisnessLink;

    public AccessoriesHomePage navigateToAccessories(){
        clickOnElement(shopTab);
        clickOnElement(accessoriesTab);
        clickOnElement(shopAllAccessories);
        return new AccessoriesHomePage();
    }

    public AccessoriesHomePage navigateToAccessories2(){
        clickOnElement(shopTab);
        clickOnElement(accessoriesTab);
        return new AccessoriesHomePage();
    }

    /**
     * For compatibility page for TEST 6
     * @param radioButton
     * @param continueButton
     */

    public void pageOne(WebElement radioButton, WebElement continueButton){
        clickOnElement(radioButton);
        clickOnElement(continueButton);
    }

    public void pageTwo(WebElement model,String s,WebElement pickModel,WebElement carrier, String s2,WebElement continueButton){
        clickOnElement(model);
        sendKeysToInput(model,s);
        clickOnElement(pickModel);
        dropdownSelectByValue(carrier,s2);
        clickOnElement(continueButton);

    }

    public void pageThree(WebElement zipCode,String zip,WebElement continueButton){
        clickOnElement(zipCode);
        sendKeysToInput(zipCode,zip);
        clickOnElement(continueButton);
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/VerizonTestCases.xlsx";
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