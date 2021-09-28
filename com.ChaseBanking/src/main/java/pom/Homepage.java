package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[4]//section[2]/section[3]//nav/ul/li[1]/a")
    public WebElement checkingTab;

    @FindBy(xpath="//*[@id=\"product-1\"]/ul/li[1]/a")
    public WebElement checkingLink;

    public CheckingsHomePage navigateToCheckingsPage(){
        clickOnElement(checkingTab);
        clickOnElement(checkingLink);
        System.out.println("clicked");
        return new CheckingsHomePage();
    }

}