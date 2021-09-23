package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OnlineExperiencesHomePage extends BaseClass {
    public OnlineExperiencesHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements here for the online experiences page
     */

    @FindBy(xpath="//*[@id=\"ExploreLayoutController\"]/div[1]//div[3]//div[2]/div[2]/div")
    public WebElement onlineLabel;

    @FindBy(xpath="//*[@id=\"menuItemButton-dynamicMoreFilters\"]")
    public WebElement filterButton;

    @FindBy(xpath="//*[@id=\"price_filter_min\"]")
    public WebElement priceFilterMin;

    @FindBy(xpath="//*[@id=\"price_filter_max\"]")
    public WebElement priceFilterMax;

    @FindBy(xpath="/html/body/div[13]//div[2]//footer/button")
    public WebElement showResults;

    @FindBy(xpath="//*[@id=\"ExploreLayoutController\"]//div[1]/div[2]//div[1]//h2/div")
    public WebElement showOffersResults;

    @FindBy(id="menuItemButton-experience_group_size")
    public WebElement groupSizeButton;

    @FindBy(xpath="//*[@id=\"11-30 guests\"]")
    public WebElement guestsNumberButton;

    @FindBy(xpath="//*[@id=\"filter-panel-save-button\"]")
    public WebElement saveButton;

    @FindBy(id="menuItemButton-toggleItem-taxonomy-Arts & writing-Arts & writing")
    public WebElement artsButton;

    @FindBy(xpath="//*[@id=\"ExploreLayoutController\"]//div[1]/div[2]//div[3]//div[1]//div[1]/a")
    public WebElement firstResult;

    @FindBy(xpath="//*[@id=\"site-content\"]//div[2]//section//span[5]/span/span/a/span")
    public WebElement location;

}
