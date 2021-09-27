package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

    public Homepage() {

        PageFactory.initElements(driver, this);
    }


    // decor elements

    @FindBy(xpath="//*[@id=\"TopNav\"]/div[1]/div[3]/a")
    public WebElement decorTab;

    /**
     * This is to navigate to the decor collections page of ebay
     * @return
     */
    public DecorHomePage navigateToDecor(){
        clickOnElement(decorTab);
        System.out.println("clicked");
        return new DecorHomePage();
    }

    public DecorHomePage hoverToDecor(){
        hoverAction(decorTab);
        clickOnElement(decorTab);
        return new DecorHomePage();
    }

    public void enterUserInfo(WebElement email, String emailName, WebElement password, String passwordName){
        waitForElementToBeVisible(email);
        clickOnElement(email);
        sendKeysToInput(email,emailName);
        waitForElementToBeVisible(password);
        clickOnElement(password);
        sendKeysToInput(password,passwordName);
    }





}