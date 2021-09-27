package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DevicesHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    @Test
    public void testNavigatoDevicesPage(){
        Homepage homepage = getHomepage();
        DevicesHomePage devices = homepage.navigateToDevicesHomePage();
        waitForElementToBeVisible(devices.phoneText);
        String actualText = devices.phoneText.getText();
        String expectedText = "Pick your phones";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND DEVICES SITE");
    }
}
