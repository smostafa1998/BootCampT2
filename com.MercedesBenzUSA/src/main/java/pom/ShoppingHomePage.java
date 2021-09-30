package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingHomePage extends BaseClass {

    public ShoppingHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the shopping page
     */
    @FindBy(xpath="//div[1]//ul/li[2]//div[1]/ul/li[1]/div/div[1]/h2")
    public WebElement buildPrice;

    @FindBy(xpath="//div[1]//nav/ul/li[2]//div[1]/ul/li[2]//div[1]/ul/li/a")
    public List<WebElement> OwnersLink;

    @FindBy(xpath="//div[1]//ul/li[2]//div[1]/ul/li[1]//div[1]/ul/li[4]/a")
    public WebElement estimatePayment;

    @FindBy(xpath="//*[@id=\"payment-estimator-navigation-tabs__item-by-budget\"]")
    public WebElement budgetTab;

    @FindBy(xpath="//*[@id=\"monthlyPayment\"]")
    public WebElement monthlyPayment;

    @FindBy(xpath="//*[@id=\"payment-estimator__by-budget\"]/div[2]/div[1]//div[3]//button")
    public WebElement yearButton;

    @FindBy(xpath="//*[@id=\"payment-estimator__by-budget\"]/div[2]/div[1]//div[3]//ul/li[1]")
    public WebElement year2020;

    @FindBy(xpath="//*[@id=\"payment-estimator__by-budget\"]/div[2]/div[1]//div[4]//button")
    public WebElement term;

    @FindBy(xpath="//*[@id=\"payment-estimator__by-budget\"]/div[2]/div[1]//div[4]/div/ul/li[9]")
    public WebElement numOfmonths;

    @FindBy(xpath="//*[@id=\"downPayment\"]")
    public WebElement downPayment;

    @FindBy(xpath="//*[@id=\"payment-estimator__by-budget\"]/div[2]/div[2]/div/button")
    public WebElement submitButton;

    @FindBy(xpath="//*[@id=\"payment-estimator__by-budget\"]/div[3]/div/div[2]/div[1]")
    public WebElement errorMessage;

    @FindBy(xpath="//div[1]//ul/li[2]//div[1]/ul/li[1]//div[1]/ul/li[3]/a")
    public WebElement specialOffers;

    @FindBy(xpath="//*[@id=\"content\"]/section[1]/div[2]/section/div/p[2]/a")
    public WebElement imInterested;

    @FindBy(xpath="//*[@id=\"leads-form-vehicle-selector\"]/div/fieldset/div[2]//button")
    public WebElement classButton;

    @FindBy(xpath="//*[@id=\"leads-form-vehicle-selector\"]/div/fieldset/div[2]/div/ul/li")
    public List<WebElement> classList;

    @FindBy(xpath="//*[@id=\"leads-form-vehicle-selector\"]/div/fieldset/div[2]/div/ul/li[3]")
    public WebElement CLA;

    @FindBy(xpath="//*[@id=\"leads-form-vehicle-selector\"]/div/fieldset/div[3]//button")
    public WebElement model;

    @FindBy(xpath="//*[@id=\"leads-form-vehicle-selector\"]/div/fieldset/div[3]/div/ul/li")
    public List<WebElement> modelList;

    @FindBy(xpath="//*[@id=\"leads-form-vehicle-selector\"]/div/fieldset/div[3]/div/ul/li[4]")
    public WebElement claCoup;

    @FindBy(xpath="//div[1]//ul/li[2]/div/div[1]/ul/li[4]/div/div[1]/ul/li[1]/a")
    public WebElement vehicleAccessories;

    @FindBy(xpath="//*[@id=\"search-by-vehicle\"]/div[2]/section/div/fieldset/div[1]//button")
    public WebElement selectYear;

    @FindBy(xpath="//*[@id=\"search-by-vehicle\"]/div[2]//fieldset/div[1]/div/ul/li[1]")
    public WebElement select2019;

    @FindBy(xpath="//*[@id=\"search-by-vehicle\"]/div[2]/section/div/fieldset/div[2]//button")
    public WebElement selectClass;

    @FindBy(xpath="//*[@id=\"search-by-vehicle\"]/div[2]//fieldset/div[2]/div/ul/li[6]")
    public WebElement gClass;

    @FindBy(xpath="/html/body/div[1]/main/div[2]/section/div/div[2]/section/div/fieldset/div[3]//button")
    public WebElement selectModel;

    @FindBy(xpath="//*[@id=\"search-by-vehicle\"]/div[2]//fieldset/div[3]/div/ul/li[2]")
    public WebElement amgModel;

    @FindBy(xpath="//*[@id=\"search-by-vehicle\"]/div[2]//div[2]/div/button")
    public WebElement submitButtonShop;

    @FindBy(xpath="//*[@id=\"vehicle-accessories-container\"]/div[1]//div[2]//div[1]//ul/li[3]/button")
    public WebElement serviceTab;

    @FindBy(xpath="//*[@id=\"vehicle-accessories-container\"]/h1")
    public WebElement titleVehicle;

    @FindBy(xpath="/html/body/div[1]//ul/li[2]/div/div[1]/ul/li[4]//div[1]/ul/li[2]/a")
    public WebElement lifestyleAccessories;

    @FindBy(xpath="//*[@id=\"onetrust-accept-btn-handler\"]")
    public WebElement cookiesAcceptButton;

    @FindBy(xpath="//*[@id=\"L2_C2_All_NewBags__btn0\"]")
    public WebElement bagTab;

    @FindBy(xpath="//*[@id=\"pg_category_list\"]/div[2]/div[1]/ol/li")
    public List<WebElement> bagsList;

    @FindBy(xpath="//*[@data-title=\"Samsonite Mobile Solution Convertible Backpack\"]")
    public WebElement firstProduct;

    @FindBy(xpath="//div[1]//ul/li[2]/div/div[1]/ul/li[2]//div[1]/ul/li[4]/a")
    public WebElement resourcesTab;

    @FindBy(xpath="//*[@id=\"resources\"]/div[2]//div[1]/div/button/div[2]/span")
    public WebElement vehicleManual;

    @FindBy(xpath="//*[@id=\"tabbed-module-accordionItem0\"]/div[1]//div[1]/section/ul/li[1]/a")
    public WebElement downloadManuel;

    @FindBy(xpath="//*[@id=\"tabbed-module-accordionItem0\"]/div/section/div/h3")
    public List<WebElement> typesofVehicles;

    @FindBy(xpath="//*[@id=\"resources\"]/div[2]/section/div/div[2]/div/button/div[2]/span")
    public WebElement videoTab;

    @FindBy(xpath="//*[@class=\"youtube-trigger\"]")
    public WebElement playButton;

    @FindBy(xpath="//*[@class=\"youtube-container-iframe\"]")
    public WebElement iframeContainer;

    @FindBy(xpath="//*[@title=\"Pause (k)\"]")
    public WebElement pause;

    @FindBy(xpath="//*[@class=\"ytp-subtitles-button ytp-button\"]")
    public WebElement subtitlesButton;
}
