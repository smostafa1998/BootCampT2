package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"gnav20-Shop-L1\"]")
    public WebElement shopTab;

    @FindBy(xpath = "//*[@id=\"gnav20-Shop-L2-4\"]")
    public WebElement accessoriesTab;

    @FindBy(xpath = "//*[@id=\"gnav20-Shop-L3-48\"]")
    public WebElement shopAllAccessories;

    public AccessoriesHomePage navigateToAccessories(){
        clickOnElement(shopTab);
        clickOnElement(accessoriesTab);
        clickOnElement(shopAllAccessories);
        return new AccessoriesHomePage();
    }

    public AccessoriesHomePage navigateToAccessories2(){
        clickOnElement(shopTab);
        clickOnElement(accessoriesTab);
        return new AccessoriesHomePage();
    }
}