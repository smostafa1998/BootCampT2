package testPom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.OnlineExperiencesHomePage;
import testBase.TestBase;

public class TestOnlineExperiencesHomePage extends TestBase {

    @Test(enabled=false)
    public void verifyOnlineExperiencesTest1(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        waitForElementToBeVisible(onlineExperience.filterButton);
        clickOnElement(onlineExperience.filterButton);
        addingKeyboardInput(onlineExperience.priceFilterMin,"50");
        addingKeyboardInput(onlineExperience.priceFilterMax,"300");
        waitForElementToBeVisible(onlineExperience.showResults);
        clickOnElement(onlineExperience.showResults);
        waitForElementToBeVisible(onlineExperience.showOffersResults);
        String actualText = onlineExperience.showOffersResults.getText();
        String expectedText = "83 results based on your filters";
        Assert.assertEquals(actualText,expectedText);
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

    @Test()
    public void verifyOnlineExperiencesTest3(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
        clickOnElement(onlineExperience.showMore);
        printOutListOfElements(onlineExperience.hostList);
    }

    @Test(enabled=false)
    public void verifyOnlineExperiencesTest4(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
    }

    @Test(enabled=false)
    public void verifyOnlineExperiencesTest5(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
    }

    @Test(enabled=false)
    public void verifyOnlineExperiencesTest6(){
        Homepage homepage = getHomepage();
        OnlineExperiencesHomePage onlineExperience = homepage.navigateToOnlineExperiences();
    }

}
