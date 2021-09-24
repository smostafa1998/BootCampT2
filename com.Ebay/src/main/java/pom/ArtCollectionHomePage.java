package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ArtCollectionHomePage extends BaseClass {
    public ArtCollectionHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the art page
     */


    @FindBy(xpath="//*[@id=\"s0-15-6-0-1[1]-0\"]/div[1]/div[2]/h1")
    public WebElement artlabel;

    @FindBy (xpath = "//*[@id=\"s0-16-13-0-1[0]-0-0\"]/ul/li[1]/a")
    public WebElement teddyLabel;

    @FindBy (xpath = "//*[@id=\"mainContent\"]/section[1]//div[2]")
    public List<WebElement> dollBrands;

    @FindBy(xpath="//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]")
    public WebElement comicsLabel;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[3]-0-0-0\"]/ul/li[2]/a")
    public WebElement auctionsEndingSoon;

    @FindBy (xpath="//*[@id=\"s0-27_1-9-0-1[0]-0-1-6-5-34\"]")
    public WebElement auctionSortButton;

    @FindBy (xpath="//*[@id=\"s0-27_1-9-0-1[0]-0-1-6-5-34-7-44\"]/ul/li[8]/a/span")
    public WebElement mostBids;

    @FindBy (xpath="//*[@id=\"s0-27_1-9-0-1[0]-0-1\"]/ul//div[2]/a/h3")
    public List<WebElement> numOfResults;

    @FindBy(xpath="//*[@id=\"s0-16-13-0-1[0]-0-0\"]/ul/li[3]/a")
    public WebElement antiquesLink;

    @FindBy(xpath="//*[@id=\"mainContent\"]/section[1]/div[1]/a")
    public WebElement stylesLink;

    @FindBy(xpath="//*[@id=\"keywordSearch\"]/form/div/input")
    public WebElement keywordSearch;

    @FindBy (xpath="//*[@id=\"keywordSearch\"]/form/button")
    public WebElement keywordSearchButton;

    @FindBy(xpath="//*[@id=\"s0-27-9-0-1[0]-0-1\"]/ul//div[2]/a/h3")
    public List<WebElement> productList;


}
