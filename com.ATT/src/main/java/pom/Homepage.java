package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Put all elements under here for the devices page
     */

    @FindBy(xpath="//*[@id=\"HEADBAND01\"]")
    public WebElement phoneLink;

    public DevicesHomePage navigateToDevicesHomePage(){
        waitForElementToBeVisible(phoneLink);
        clickOnElement(phoneLink);
        return new DevicesHomePage();
    }

}
