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
        return new DecorHomePage();
    }





}