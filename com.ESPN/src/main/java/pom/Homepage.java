package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
    /**
     * ESPN HOMEPAGE
     */
    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * this is to navigate to the NFL page
     */
    @FindBy(xpath="//*[@id=\"global-nav\"]/ul/li[1]/a/span/span[1]")
    public WebElement nfl;


    public NFLHomePage navigateToNFLHomePage() {
        waitForElementToBeVisible(nfl);
        clickOnElement(nfl);
        return new NFLHomePage();
    }



}