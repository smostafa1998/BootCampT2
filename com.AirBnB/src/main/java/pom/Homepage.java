package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * AIR B&B HOMEPAGE
 */

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//header/div/div[2]/div[2]/div/div/form/div[1]/div[2]/a")
    public WebElement onlineExperience;


    /**
     * This is to navigate to the online experiences
     */

    public OnlineExperiencesHomePage navigateToOnlineExperiences(){
        clickOnElement(onlineExperience);
        System.out.println("clicked");
        return new OnlineExperiencesHomePage();
    }

}
