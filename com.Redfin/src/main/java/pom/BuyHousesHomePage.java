package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuyHousesHomePage extends BaseClass {

    public BuyHousesHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the redfin page
     */

    @FindBy(xpath="//*[@id=\"right-container\"]//div[1]/div[1]//div[1]//h1")
    public WebElement textBuyHouses;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[1]//div[2]/div/span[1]/span/span")
    public WebElement clickButton;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[2]//span[1]//div[1]//div[4]")
    public WebElement minPrice;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[2]//span[2]/span/span")
    public WebElement clickButton2;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[1]//div[2]//span[2]/span/span//div[8]")
    public WebElement maxPrice;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[2]//div[3]/button")
    public WebElement searchButton;

    @FindBy(xpath="//*[@id=\"sidepane-header\"]/div/div[3]/button[2]")
    public WebElement checkTable;

    @FindBy(xpath="//*[contains(@id,\"ReactDataTableRow_\")]/td[2]/div/a")
    public List<WebElement> listAdresses;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[2]//div[1]//form/div[1]/div")
    public WebElement searchButtonLocation;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[1]//div[1]//form/div[1]/div/div/input")
    public WebElement clearButton;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[2]//div/form/div[1]/div/input")
    public WebElement sendKeysToInput;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[1]/div[2]//div[1]//form/div[3]/div[1]//div[2]")
    public WebElement mainePick;

    @FindBy(xpath="//*[@id=\"wideSidepaneFilterButtonContainer\"]")
    public WebElement filterButton;

    @FindBy(xpath="//*[@id=\"propertyTypeFilterDesktop\"]/div/button[1]")
    public WebElement clickHouse;

    @FindBy(xpath="//*[@id=\"filterContent\"]//div[2]/div[2]/span/span/span[2]")
    public WebElement stepUpBath;

    @FindBy(xpath="//*[@id=\"filterContent\"]//div[2]//span[2]/div/div//div[2]")
    public WebElement stepUpBathOne;

    @FindBy(xpath="//*[@id=\"filterContent\"]/div/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span/label/span[1]")
    public WebElement openHouses;

    @FindBy(xpath="//*[@id=\"filterContent\"]//div[5]//div[2]/div[1]/div[1]//div[2]")
    public WebElement anytimeRadio;

    @FindBy(xpath="//*[@id=\"searchForm\"]/form/div[2]/div/div/button")
    public WebElement applyFilter;

    @FindBy(xpath="//*[@id=\"results-display\"]/div[4]/div/div/div[1]//div[2]")
    public WebElement noResults;

    @FindBy(xpath="//*[@id=\"MapHomeCard_0\"]/div/div/div[2]/a")
    public WebElement firstOffer;

    @FindBy(xpath="//*[@id=\"sideBarContent\"]/div/div/div/div[1]/div[1]/div[1]")
    public WebElement tourText;

    @FindBy(xpath="//*[@id=\"content\"]/div[20]/div/div/div[2]/div/a")
    public List<WebElement> redfinLinks;

    @FindBy(xpath="//*[@id=\"content\"]/div[20]/div/div/div[2]/div[1]/a")
    public WebElement ourMission;

    @FindBy(xpath="//*[@id=\"content\"]/div[12]//div[2]//div[3]/a")
    public WebElement learnMore;

    @FindBy(xpath="//*[@class = \"SvgIcon play-circle\"]")
    public WebElement playButton;

    @FindBy(xpath="//*[@id=\"wNCOKhnysMk\"]")
    public WebElement iframeSwitch;

    @FindBy(xpath="//*[@title=\"Pause (k)\"]")
    public WebElement pauseButton;

    @FindBy(xpath="//*[@id=\"content\"]/div[20]/div/div/div[2]/div[4]/a")
    public WebElement blogButton;

    @FindBy(xpath="//*[@id=\"menu-item-70572\"]/a")
    public WebElement buyingHome;

    @FindBy(xpath="//*[contains(@id,\"post-\")]//section[2]//div[1]//div[2]//article//h3/a")
    public List<WebElement> buyingHomeArticles;

    @FindBy(xpath="//*[contains(@id,\"post-\")]//section[2]//div[1]//div[2]//article[1]//h3/a")
    public WebElement HomeArticlesNumOne;

    @FindBy(xpath="//*[contains(@id,\"post-\")]/div[1]/div/ul[2]/li/span")
    public List<WebElement> notCovered;

    @FindBy(xpath="//*[@id=\"content\"]/div[20]/div/div/div[2]/div[3]/a")
    public WebElement investorsTab;

    @FindBy(xpath="//*[@id=\"right-container\"]/div/div[1]/div[5]/div/a[2]")
    public WebElement landForSale;

    @FindBy(xpath="//*[@id=\"right-container\"]/div/div[1]//div[1]/div//div[3]/div[1]/div/div[2]/a")
    public WebElement caliPick;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[2]//div[2]//span[1]//div[1]//div[12]")
    public WebElement minPriceCA;

    @FindBy(xpath="//*[@id=\"right-container\"]//div[1]//div[2]//span[2]//div[1]//div[24]")
    public WebElement maxPriceCA;

    @FindBy(xpath="//*[@id=\"results-display\"]/div[3]//li//a/div/div")
    public List<WebElement> caliAreas;

    @FindBy(xpath="//*[@id=\"results-display\"]/div[3]//ul/li[3]/div/a")
    public WebElement clickSF;

    @FindBy(xpath="//*[contains(@id,\"ReactDataTableRow_\")]/td[2]/div/a")
    public List<WebElement> SFAreas;






}
