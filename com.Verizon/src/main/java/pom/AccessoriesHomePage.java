package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessoriesHomePage extends BaseClass {
    public AccessoriesHomePage(){
        PageFactory.initElements(driver,this);
    }


    /**
     * Put all elements under here for the acessories page
     */

    @FindBy(xpath = "//*[@id=\"gear\"]/div/div/div[1]/h2")
    public WebElement textAccessories;

    @FindBy(xpath="//*[@id=\"accordionOnePanel\"]/ul/li[5]/a")
    public WebElement exploreAll;

    @FindBy(xpath="//*[@id=\"gear-up-new-samsung\"]/div/div[2]//div[1]/div/div//h3/a")
    public List<WebElement> allProducts;

    @FindBy(xpath = "//*[@id=\"gnav20-Shop-L3-56\"]")
    public WebElement deals;

    @FindBy(xpath = "//*[@data-analyticstrack=\"tab-kate spade new york\"]")
    public WebElement kateSpade;

    @FindBy(xpath="//*[@id=\"header-container\"]/section/div[2]/button")
    public WebElement filterButton;

    @FindBy(xpath="//*[contains(@id,\"accordionHeader\")]/button/span[1]")
    public List<WebElement> filterOptions;

    @FindBy(xpath="//*[@id=\"sby\"]/span/span/div")
    public WebElement selectClick;

    @FindBy(xpath="//*[@data-analyticstrack=\"gridwall-filter-dropdown\"]")
    public WebElement dropdownPick;

    @FindBy(xpath="//*[@id=\"filters\"]/div[2]/div[2]/p")
    public WebElement resultCount;

    @FindBy(xpath="//*[@id=\"gnav20-Shop-L3-52\"]")
    public WebElement gamerTab;

    @FindBy(xpath="//*[@id=\"section\"]//div[2]//div[1]/div/ul/li[1]/a")
    public WebElement mobileGaming;

    @FindBy(xpath="//*[@id=\"gridwall-wrapper\"]/section/div[1]/div[4]/a")
    public WebElement pickProduct;

    @FindBy(xpath="//*[@data-analyticstrack=\"tab-Features & Specs\"]")
    public WebElement featuresTab;

    @FindBy(xpath="//*[@id=\"tabContent\"]/div[1]/div[2]//div[1]/p[1]//ul/li")
    public List<WebElement> detailsList;

    @FindBy(xpath="//*[contains(@id,\"LPMcontainer-\")]")
    public WebElement chatWithUs;

    @FindBy(xpath="//*[@id=\"lpChat\"]/div[2]/div[1]/div")
    public WebElement chatWithUsMove;

    @FindBy(xpath="//*[@id=\"nebula_div_btn\"]")
    public WebElement feedbackButton;

    @FindBy(xpath="//*[@id=\"kampyleForm1098\"]")
    public WebElement iframe;

    @FindBy(xpath="//*[@id=\"liveForm\"]/div/div[2]//div[2]//p/p")
    public WebElement textFeedback;

    @FindBy(xpath="//*[contains(@id,\"wrapper_\")]/div/neb-rating//span[10]")
    public WebElement rating10;

    @FindBy(xpath="//*[@id=\"Page 13\"]")
    public WebElement textBox;

    @FindBy(xpath="//*[@id=\"liveForm\"]//div[5]/div/div/select")
    public WebElement selectOption;

    @FindBy(xpath="//div[2]/neb-form-footer//div[1]//button[1]")
    public WebElement buttonClose;

    @FindBy(xpath="//*[@id=\"vz-gh20\"]//div[1]/span/span/a")
    public WebElement bringPhoneLink;

    @FindBy(xpath="//*[@id=\"hero\"]//div[3]/span[1]/a")
    public WebElement checkCompatiblity;

    @FindBy(xpath="//*[@id=\"device_options\"]/div/div/p")
    public List<WebElement> deviceOptions;

    @FindBy(xpath="//*[@id=\"page\"]//div[2]/div/div[1]/div[1]/div/div/div/div[1]")
    public WebElement smartphoneRadio;

    @FindBy(xpath="//*[@aria-label=\"Continue\"]")
    public WebElement continueButton;

    @FindBy(xpath="//*[@name=\"makemodel\"]")
    public WebElement makemodel;

    @FindBy(xpath="//*[@id=\"rbt-menu-item-1\"]/a")
    public WebElement iphone6Plus;

    @FindBy(xpath="//*[@id=\"carrier\"]")
    public WebElement carrier;

    @FindBy(xpath="//*[@id=\"page\"]/div//span/b")
    public WebElement compatibilityText;

    @FindBy(xpath="//*[contains(@id,\"input-\")]/span/span/span/div")
    public WebElement clickZipCode;

    @FindBy(xpath="//*[contains(@id,\"input-\")]/span/span/span/div/input")
    public WebElement zipCode;


}
