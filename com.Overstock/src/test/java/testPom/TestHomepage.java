package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DecorHomePage;
import pom.Homepage;
import testBase.TestBase;

/**
 * Overstock Test Homepage
 */
public class TestHomepage extends TestBase {


    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToDecorPage(){
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        waitForElementToBeVisible(decor.decorLabel);
        String actualText = decor.decorLabel.getText();
        String expectedText = "Home Decor";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("FOUND DECOR WEBSITE");
    }


}
