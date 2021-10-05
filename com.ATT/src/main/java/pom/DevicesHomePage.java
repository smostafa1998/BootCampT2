package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DevicesHomePage extends BaseClass {
    public DevicesHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the devices page
     */

    @FindBy(xpath="//*[@id=\"webpage_title\"]")
    public WebElement phoneText;

    @FindBy(xpath="//*[@id=\"fav_halo_icon_0\"]")
    public WebElement favButton1;

    @FindBy(xpath="//*[@id=\"fav_halo_icon_1\"]")
    public WebElement favButton2;

    @FindBy(xpath="//*[@id=\"fav_halo_icon_2\"]")
    public WebElement favButton3;

    @FindBy(xpath="//*[@id=\"z1-wishlist\"]")
    public WebElement favList;

    @FindBy(xpath="//*[@id=\"product_card0\"]")
    public WebElement productPicked;

    @FindBy(xpath="//*[@id=\"accordion-control-gallery\"]")
    public WebElement videoPicked;

    @FindBy(xpath="//*[@id=\"5001348\"]/div/button")
    public WebElement videoButton;

    @FindBy(xpath="//*[@id=\"closeVideo\"]")
    public WebElement closeButton;

    @FindBy(xpath="//*[@id=\"filter_tray_collapse_section\"]//div[3]//div[2]//li[3]/div/div/div/div")
    public WebElement filterTrayCollapseSection;

    @FindBy(xpath="//*[@id=\"Categories-1\"]")
    public WebElement prepaidPhone;

    @FindBy(xpath="//*[@id=\"oo_tab\"]")
    public WebElement feedBack;

    @FindBy(xpath="//*[@id=\"overall_4\"]")
    public WebElement rating4;

    @FindBy(xpath="//*[contains(@id,\"answer_\")]")
    public WebElement selectIssue;

    @FindBy(xpath="//*[@id=\"comment_box\"]")
    public WebElement commentBox;

    @FindBy(xpath="//*[@id=\"Categories-4\"]")
    public WebElement hotspotsRouter;

    @FindBy(xpath="//*[@id=\"product_card0\"]")
    public WebElement productOne;

    @FindBy(xpath="//*[@id=\"deliveryOptions\"]/div[2]/div/div[2]/a")
    public WebElement deliveryOptions;

    @FindBy(xpath="//div[17]//div[2]/div[2]/div/div[1]/a")
    public WebElement changeZip;

    @FindBy(xpath="//div[17]//div[2]/div[2]/div/form/input")
    public WebElement inputNum;

    @FindBy(xpath="//div[17]//div[2]/div[2]/div/form/button")
    public WebElement buttonSubmit;

    @FindBy(xpath="//div[17]//div[2]/div[2]//p//div[1]//h3")
    public WebElement textStore;

    @FindBy(xpath="//*[@id=\"Categories-2\"]")
    public WebElement tabletsAndLaptops;

    @FindBy(xpath="//*[@id=\"prescreenbanner-wrapper\"]/div/div/a")
    public WebElement clickOffersOnWhat;

    @FindBy(xpath="//*[@id=\"psa-firstName\"]")
    public WebElement firstName;

    @FindBy(xpath="//*[@id=\"psa-lastName\"]")
    public WebElement lastName;

    @FindBy(xpath="//*[@id=\"psa-address\"]")
    public WebElement address;

    @FindBy(xpath="//*[@id=\"psa-ssn\"]")
    public WebElement socialsnn;

    @FindBy(xpath="//*[@id=\"psa-dob\"]")
    public WebElement dob;

    @FindBy(xpath="//*[@id=\"psa-email\"]")
    public WebElement email;

    @FindBy(xpath="//*[@id=\"psa-phone\"]")
    public WebElement phone;

    @FindBy(xpath="//*[@id=\"psc-modal-content\"]/div[1]/div[3]//div[7]/label/input")
    public WebElement checkBox;

    @FindBy(xpath="//*[@id=\"psa-portin\"]/div/label[2]")
    public WebElement checkNo;

    @FindBy(xpath="//*[@id=\"psc-modal-content\"]/div[1]/div[3]/div/button[2]")
    public WebElement cancelButton;

    @FindBy(xpath="//*[@id=\"dialog-heading\"]")
    public WebElement dialogText;

    @FindBy(xpath="//*[@id=\"Categories-3\"]")
    public WebElement smartphoneTab;

    @FindBy(xpath="//*[contains(@id,\"product_card\")]/div")
    public List<WebElement> productNames;

    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[2]/div[7]/div/div/div[2]/div[3]/div/div[2]/a")
    public WebElement clickSmartWatchArticle;

    @FindBy(xpath="//*[contains(@id,\"post-\")]/div/div[3]/div[1]/ul[2]/li")
    public List<WebElement> healthThings;

    @FindBy(xpath="//*[@id=\"product_card0\"]")
    public WebElement product0;

    @FindBy(xpath="//*[@id=\"accordion-control-featuresAndSpecs\"]")
    public WebElement clickFeaturesAndSpecs;

    @FindBy(xpath="//*[@id=\"accordion-content-featuresAndSpecs\"]/div/div[1]/ul/li/div")
    public List<WebElement> features;

    @FindBy(xpath="//*[@id=\"accordion-content-featuresAndSpecs\"]/div/div[2]/div/a")
    public WebElement clickGuide;

    @FindBy(xpath="//*[@id=\"video1\"]/a/div/div[1]/button")
    public WebElement clickVideo;

    @FindBy(xpath="//*[@report-title=\"Pause Button\"]")
    public WebElement pauseButton;

    @FindBy(xpath="//*[@report-title=\"Captions Toggle\"]")
    public WebElement captions;

    @FindBy(xpath="//*[@id=\"closeVideo\"]")
    public WebElement closeVidButton;






}
