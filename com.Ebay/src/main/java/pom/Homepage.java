package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * EBAY HOMEPAGE
 */
public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")
    public WebElement artCollection;




}