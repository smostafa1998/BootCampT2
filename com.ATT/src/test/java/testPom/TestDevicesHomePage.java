package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DevicesHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;

public class TestDevicesHomePage extends TestBase {

    @Test(enabled = false)
    public void verifyDevicesHomePage1() {
        Homepage homepage = getHomepage(); // att
        DevicesHomePage devices = homepage.navigateToDevicesHomePage(); //devices
        waitForElementToBeVisible(devices.favButton1);
        clickOnElement(devices.favButton1);
        clickOnElement(devices.favButton2);
        clickOnElement(devices.favButton3);
        waitForElementToBeVisible(devices.favList);
        clickOnElement(devices.favList);
        waitForElementToBeVisible(devices.productPicked);
        clickOnElement(devices.productPicked);
        clickOnElement(devices.videoPicked);
        clickOnElement(devices.videoButton);

        /*
        Actions action= new Actions(driver);
        action.clickAndHold(devices.slider);
        int width=devices.slider.getSize().getWidth();
        action.moveToElement(devices.slider, ((width*4)/100), 0).click();
        action.release().build();
        */

        clickOnElement(devices.closeButton);
    }


    @Test(enabled = false)
    public void verifyDevicesHomePage2() {
        Homepage homepage = getHomepage();
        DevicesHomePage devices = homepage.navigateToDevicesHomePage();
        clickOnElement(devices.prepaidPhone);
        clickOnElement(devices.filterTrayCollapseSection);
        clickOnElement(devices.feedBack);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        waitForElementToBeVisible(devices.rating4);
        clickOnElement(devices.rating4);
        dropdownSelectByVisibleText(devices.selectIssue,"Website Feedback");
        clickOnElement(devices.commentBox);
        sendKeysToInput(devices.commentBox,"This is a good website keep up work!");
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

    //stale element but works
    @Test(enabled = false)
    public void verifyDevicesHomePage3() {
        Homepage homepage = getHomepage();
        DevicesHomePage devices = homepage.navigateToDevicesHomePage();
        clickOnElement(devices.hotspotsRouter);
        clickOnElement(devices.productOne);
        clickOnElement(devices.deliveryOptions);
        clickOnElement(devices.changeZip);
        addingKeyboardInput(devices.inputNum,"11377");
        clickOnElement(devices.buttonSubmit);
        waitForElementToBeVisible(devices.textStore);
        String actualText = devices.textStore.getText();
        String expectedText = "AT&T Authorized Retailer";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test(enabled = false)
    public void verifyDevicesHomePage4() {
        Homepage homepage = getHomepage();
        DevicesHomePage devices = homepage.navigateToDevicesHomePage();
        clickOnElement(devices.tabletsAndLaptops);
        clickOnElement(devices.clickOffersOnWhat);
        addingKeyboardInput(devices.firstName,"Sabreen");
        addingKeyboardInput(devices.lastName,"Mostafa");
        addingKeyboardInput(devices.address,"blahblahblah");
        addingKeyboardInput(devices.socialsnn,"123456789");
        clickOnElement(devices.dob);
        sendKeysToInput(devices.dob,"10091998");
        addingKeyboardInput(devices.email,"smostafa1998@gmail.com");
        addingKeyboardInput(devices.phone,"7186665678");
        clickOnElement(devices.checkBox);
        clickOnElement(devices.checkNo);
        waitForElementToBeVisible(devices.dialogText);
        String actualText = devices.dialogText.getText();
        String expectedText = "See what you'll pay for your device";
        Assert.assertEquals(actualText,expectedText);
        clickOnElement(devices.cancelButton);
    }

    @Test(enabled = false)//works if i personally slide down
    public void verifyDevicesHomePage5() {
        Homepage homepage = getHomepage();
        DevicesHomePage devices = homepage.navigateToDevicesHomePage();
        clickOnElement(devices.smartphoneTab);
        fluentWaitMethod(devices.smartphoneTab);
        printOutListOfElements(devices.productNames);
        scrollJS(10000);
        clickOnElement(devices.clickSmartWatchArticle);
        printOutListOfElements(devices.healthThings);
    }

    @Test(enabled = false)
    public void verifyDevicesHomePage6() {
        Homepage homepage = getHomepage();
        DevicesHomePage devices = homepage.navigateToDevicesHomePage();
        clickOnElement(devices.product0);
        clickOnElement(devices.clickFeaturesAndSpecs);
        printOutListOfElements(devices.features);
        clickOnElement(devices.clickGuide);
        clickOnElement(devices.clickVideo);
        clickOnElement(devices.pauseButton);
        clickOnElement(devices.captions);
        clickOnElement(devices.closeVidButton);
    }




}
