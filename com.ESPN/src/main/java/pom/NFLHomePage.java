package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NFLHomePage extends BaseClass {
    public NFLHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the soccerpage
     */

    @FindBy (xpath = "//*[@id=\"global-nav-secondary\"]/div/ul/li[1]/span/a/span[2]")
    public WebElement nflLabel;

    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[1]/div/ul[1]/li[2]/a")
    public WebElement scoresLabel;

    @FindBy (xpath = "//*[@id=\"scoreboard-page\"]/div[2]/div[1]/button")
    public WebElement yearDropdown;

    @FindBy (xpath = "//*[@id=\"scoreboard-page\"]/div[2]/div[1]/ul/li[3]/a")
    public WebElement yearDropdownSelect;

    @FindBy (xpath = "//*[@id=\"scoreboard-page\"]/div[2]/div[2]/button")
    public WebElement weekDropdown;

    @FindBy (xpath ="//*[@id=\"scoreboard-page\"]/div[2]/div[2]/ul/li[1]/a")
    public WebElement weekDropdownSelect;

    @FindBy (xpath = "//*[@id=\"events\"]/div/h2")
    public WebElement dateHallofFame;



}
