package testPom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.OnlineExperiencesHomePage;
import testBase.TestBase;

public class TestOnlineExperiencesHomePage extends TestBase {

    @Test(enabled=true)
    public void verifyOnlineExperiencesTest1(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        waitForElementToBeVisible(onlineExperience.filterButton);
        clickOnElement(onlineExperience.filterButton);
        clickOnElement(onlineExperience.priceFilterMin);
        sendKeysToInput(onlineExperience.priceFilterMin,"\b\b\b\b 50");
        clickOnElement(onlineExperience.priceFilterMax);
        sendKeysToInput(onlineExperience.priceFilterMax,"\b\b\b\b 300");
        waitForElementToBeVisible(onlineExperience.showResults);
        clickOnElement(onlineExperience.showResults);
        waitForElementToBeVisible(onlineExperience.showOffersResults);
        String actualText = onlineExperience.showOffersResults.getText();
        String expectedText = "83 results based on your filters";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("FOUND RESULTS OF SOMETHING");
    }

    @Test(enabled=true)
    public void verifyOnlineExperiencesTest2(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        clickOnElement(onlineExperience.groupSizeButton);
        clickOnElement(onlineExperience.guestsNumberButton);
        clickOnElement(onlineExperience.saveButton);
        clickOnElement(onlineExperience.artsButton);
        waitForElementToBeVisible(onlineExperience.firstResult);
    }

    @Test(enabled=false)
    public void verifyOnlineExperiencesTest3(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
    }

}
