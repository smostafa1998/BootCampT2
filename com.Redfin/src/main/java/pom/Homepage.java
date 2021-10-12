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

    @FindBy(xpath="//*[@id=\"header-content\"]/header[2]/div[2]/div[2]/a")
    public WebElement buyHouse;

    public BuyHousesHomePage navigateToBuy(){
        clickOnElement(buyHouse);
        System.out.println("clicked");
        return new BuyHousesHomePage();
    }

    public BuyHousesHomePage hoverToBuy(){
        hoverAction(buyHouse);
        return new BuyHousesHomePage();
    }

    public void doPriceRanges(WebElement click,WebElement minPrice,WebElement click2, WebElement maxPrice){
        clickOnElement(click);
        clickOnElement(minPrice);
        clickOnElement(click2);
        clickOnElement(maxPrice);
    }

    public void clearSearch(WebElement searchButtonLocation,WebElement clearButton){
        clickOnElement(searchButtonLocation);
        clickOnElement(clearButton);
    }

    public void sendKeywordLocation(WebElement keywordSearch,String location,WebElement firstChoice){
        sendKeysToInput(keywordSearch,location);
        clickOnElement(firstChoice);
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/RedfinTestCases.xlsx";
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