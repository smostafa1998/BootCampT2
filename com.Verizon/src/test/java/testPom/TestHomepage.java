package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AccessoriesHomePage;
import pom.Homepage;
import testBase.TestBase;

public class TestHomepage extends TestBase {

    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToAccessoriesHomePage(){
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories= homepage.navigateToAccessories();
        waitForElementToBeVisible(accessories.textAccessories);
        String actualText = accessories.textAccessories.getText();
        String expectedText = "Get the gear you\n" +
                "need. Here and now.";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND ACCESSORIES WEBSITE");
    }

}
