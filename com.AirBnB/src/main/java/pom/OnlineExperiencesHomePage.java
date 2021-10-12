package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OnlineExperiencesHomePage extends BaseClass {
    public OnlineExperiencesHomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Put all elements here for the online experiences page
     */

    @FindBy(xpath = "//*[@id=\"ExploreLayoutController\"]/div[1]//div[3]//div[2]/div[2]/div")
    public WebElement onlineLabel;

    @FindBy(xpath = "//*[@id=\"filter-menu-chip-group\"]/div[2]/div[1]/div[3]/button")
    public WebElement filterButton;

    @FindBy(xpath = "//*[@id=\"price_filter_min\"]")
    public WebElement priceFilterMin;

    @FindBy(xpath = "//*[@id=\"price_filter_max\"]")
    public WebElement priceFilterMax;

    @FindBy(xpath = "//div[12]//div[2]/div/div[2]//footer/a")
    public WebElement showResults;

    @FindBy(xpath = "//*[@id=\"ExploreLayoutController\"]//div[1]/div[2]//div[1]//h2/div")
    public WebElement showOffersResults;

    @FindBy(xpath = "//*[@id=\"menuItemButton-experience_group_size\"]/button")
    public WebElement groupSizeButton;

    @FindBy(xpath = "//*[@id=\"11-30 guests\"]")
    public WebElement guestsNumberButton;

    @FindBy(xpath = "//*[@id=\"filter-panel-save-button\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"menuItemButton-toggleItem-ghost-platform-quick-filters-Arts & writing-Arts & writing\"]/button")
    public WebElement artsButton;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[2]/div/div/div/div/div/div/div/div[1]/div/div/div/h2/div")
    public WebElement artsLabel;

    @FindBy(xpath="//*[@id=\"site-content\"]/div[3]//div[2]//div[1]/div[2]/a")
    public WebElement clickMore;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[2]//div[3]//a")
    public List<WebElement> hostList;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[2]//div[3]//a[1]")
    public WebElement clickFirst;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[1]/div[4]/div/div/div/div[2]/section/div[1]/div/h2")
    public WebElement randomText;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[4]//div[2]//div[2]//div[1]/div/div/div/div/div[1]/a")
    public WebElement clickBestSeller;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[1]/div[1]/div[3]//div[1]/button")
    public WebElement playButton;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[5]/div/div[2]/div/a")
    public WebElement showAll;

    @FindBy(xpath = "//*[@id=\"site-content\"]//div[2]//section/div[2]/div/div/div[2]/span/span")
    public List<WebElement> whatToBring;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div/div/div/div/div/div[1]/div/button")
    public WebElement closeButton;

    @FindBy(xpath="//div/div/div[2]/div/div[2]//footer/a")
    public WebElement filterButtonT5;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[2]//div/div/div[1]/a")
    public List<WebElement> basedOnFilters;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[2]//div[1]/div/div[1]/a")
    public WebElement clickLink;

    @FindBy(xpath = "//*[@data-testid=\"experiences-change-dates\"]/button")
    public WebElement changeDates;

    @FindBy(xpath = "//*[@data-testid=\"calendar-day-10/22/2021\"]")
    public WebElement calendarDateStart;

    @FindBy(xpath = "//*[@data-testid=\"calendar-day-10/24/2021\"]")
    public WebElement calendarDateEnd;

    @FindBy(xpath = "//*[@data-testid=\"experiences-change-guests\"]/button")
    public WebElement changeGuests;

    @FindBy(xpath = "//*[@id=\"GuestPickerModal-adults-stepper\"]/button[2]")
    public WebElement addAdults;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[1]/div[3]//div[4]/button")
    public WebElement saveButton1;

    @FindBy(xpath = "//*[@id=\"filter-menu-chip-group\"]/div[2]/div[3]/div[2]/div/div/button/span[1]")
    public List<WebElement> categoryList;

    @FindBy(xpath = "//*[@id=\"menuItemButton-toggleItem-ghost-platform-quick-filters-Arts & writing-Arts & writing\"]/button")
    public WebElement clickArts;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[2]//div[3]//div[3]/div/div[1]/a")
    public WebElement clickArtLink;

    @FindBy(xpath = "//*[contains(@id,\"review_\")]")
    public List<WebElement> reviewers;

    @FindBy(xpath="//*[@id=\"site-content\"]/div[1]/div[5]//div[2]/div/div/div/div[1]/div/div[1]/div[2]")
    public WebElement firstReview;

    @FindBy(xpath = "//*[@id=\"filter-menu-chip-group\"]//div[1]/div/label/div[1]/div[1]")
    public WebElement addGuests;

}
