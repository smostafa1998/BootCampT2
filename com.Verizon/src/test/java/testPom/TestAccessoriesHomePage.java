package testPom;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AccessoriesHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.List;


public class TestAccessoriesHomePage extends TestBase {


    @Test(enabled = false)
    public void verifyAccessoriesTest1() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
        clickOnElement(accessories.exploreAll);
        oneDList(accessories.allProducts);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest2() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories2();
        clickOnElement(accessories.deals);
        clickOnElement(accessories.kateSpade);
        clickOnElement(accessories.filterButton);
        oneDList(accessories.filterOptions);
        clickOnElement(accessories.filterButton);
        clickOnElement(accessories.selectClick);
        dropdownSelectByIndex(accessories.dropdownPick, 2);
        waitForElementToBeVisible(accessories.resultCount);
        String actualText = accessories.resultCount.getText();
        String expectedText = "96 results";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest3() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories2();
        clickOnElement(accessories.gamerTab);
        clickOnElement(accessories.mobileGaming);
        clickOnElement(accessories.pickProduct);
        clickOnElement(accessories.featuresTab);
        oneDList(accessories.detailsList);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest4() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
        clickOnElement(accessories.chatWithUs);
        hoverAction(accessories.chatWithUsMove);
        waitForElementToBeVisible(accessories.grabChatBoxText);
        slideAction(accessories.chatWithUsMove, -200, 0);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest5() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories2();
        clickOnElement(accessories.feedbackButton);
        foundIframe(accessories.iframe);
        hoverAction(accessories.rating10);
        clickOnElement(accessories.rating10);
        clickOnElement(accessories.textBox);
        sendKeysToInput(accessories.textBox, "LIke this website very nice");
        dropdownSelectByValue(accessories.selectOption, "string:15");
        waitForElementToBeVisible(accessories.textFeedback);
        String actualText = accessories.textFeedback.getText();
        String expectedText = "Thank you for sharing your comments. We will use your input to make the website experience better.";
        Assert.assertEquals(actualText, expectedText);
        clickOnElement(accessories.buttonClose);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest6() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories2();
        clickOnElement(accessories.bringPhoneLink);
        clickOnElement(accessories.checkCompatiblity);
        System.out.println("What type of device");
        printOutListOfElements(accessories.deviceOptions);
        homepage.pageOne(accessories.smartphoneRadio, accessories.continueButton);
        homepage.pageTwo(accessories.makemodel, "iphone 6", accessories.iphone6Plus, accessories.carrier, "VERIZON", accessories.continueButton);
        homepage.pageThree(accessories.zipCode, "11377", accessories.continueButton);
        waitForElementToBeVisible(accessories.compatibilityText);
        String actualText = accessories.compatibilityText.getText();
        String expectedText = "It looks like your device is compatible.";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest7() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
        clickOnElement(accessories.getNews);
        clickOnElement(accessories.getParentLink);
        List<WebElement> elementVisible = getListOfUnhiddenArributes(accessories.twitterTweets);
        printOutListOfElements(elementVisible);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest8() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
        clickOnElement(accessories.consumerEducation);
        printOutHrefListOfElements(accessories.whatIs);
        clickOnElement(accessories.whatIs.get(4));
        printOutListOfElements(accessories.TermsSecurity);
        printOutListOfElements(accessories.TermsDefinedSecurity);
    }

    @Test(enabled = false)
    public void verifyAccessoriesTest9() {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories2();
        clickOnElement(accessories.clickTablets);
        clickOnElement(accessories.clickStylus);
        clickOnElement(accessories.clickFirstCompare);
        clickOnElement(accessories.clickSecondCompare);
        clickOnElement(accessories.compareButton);
        dropdownSelectByIndex(accessories.selectBrand, 2);
        dropdownSelectByIndex(accessories.selectDevice, 1);
        clickOnElement(accessories.pickAPhone);
        sendKeysToInput(accessories.userID, "smostafa1998");
        sendKeysToInput(accessories.password, "testing123");
        clickOnElement(accessories.loginButton);
        waitForElementToBeVisible(accessories.challengequestion);
        String actualText = accessories.challengequestion.getText();
        String expectedText = "Secret Question";
        Assert.assertEquals(actualText, expectedText);
    }


}
