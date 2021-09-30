package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesHomePage extends BaseClass {
    public AccessoriesHomePage(){
        PageFactory.initElements(driver,this);
    }


    /**
     * Put all elements under here for the acessories page
     */

    @FindBy(xpath = "//*[@id=\"gear\"]/div/div/div[1]/h2")
    public WebElement textAccessories;




}
