package testPom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.OnlineExperiencesHomePage;
import testBase.TestBase;

public class TestHomepage extends TestBase {


    /**
     * This is NOT a counted test, simply navigation purposes
     */
    @Test
    public void testNavigateToOnlineExperiences(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperiences = homepage.navigateToOnlineExperiences();
        waitForElementToBeVisible(onlineExperiences.onlineLabel);
        String actualText = onlineExperiences.onlineLabel.getText();
        String expectedText = "Find unique activities led by one-of-a-kind hosts — all without leaving home.";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND ONLINE WEBSITE");
    }

}
