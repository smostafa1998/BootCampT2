package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SoccerHomePage extends BaseClass {
    public SoccerHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the soccer page
     */

    @FindBy(xpath="//*[@id=\"Newsletter\"]/div[1]/div[1]/div/h3")
    public WebElement soccerNewsLabel;

    @FindBy(xpath="//*[@id=\"page-content\"]/div[1]/div[2]/ul/li/a/h3")
    public List<WebElement> linksArticles;


}
