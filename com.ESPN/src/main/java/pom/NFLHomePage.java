package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy (xpath = "//*[@id=\"global-nav\"]/ul/li[1]//ul[2]//a")
    public List<WebElement> listOfNFLTeams;

    @FindBy (xpath = "//*[@id=\"news-feed\"]/section[4]/section[2]/figure/picture/span")
    public WebElement playVideoFeed;

    @FindBy (xpath = "//*[@id=\"vjs_video_3\"]/div[6]/button[3]")
    public WebElement skipForwardsVideo;

    @FindBy (xpath = "//*[@id=\"vjs_video_3\"]/div[6]/button[1]")
    public WebElement pauseVideo;

}
