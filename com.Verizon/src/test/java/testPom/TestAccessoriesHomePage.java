package testPom;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AccessoriesHomePage;
import pom.Homepage;
import testBase.TestBase;


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

    @Test(enabled = false) // not working
    public void verifyAccessoriesTest4() throws InterruptedException {
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
        clickOnElement(accessories.chatWithUs);
        Actions builder = new Actions(driver);
        clickOnElement(accessories.chatWithUsMove);
        int x = accessories.chatWithUsMove.getLocation().getX();
        int y = accessories.chatWithUsMove.getLocation().getY();
        Point currentDestination = accessories.chatWithUsMove.getLocation();


        System.out.println(driver.findElement(By.tagName("body")).getSize());
        System.out.println(currentDestination);
        builder.dragAndDropBy(accessories.chatWithUsMove, -295, 0).perform();
        Thread.sleep(5000);

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


}
