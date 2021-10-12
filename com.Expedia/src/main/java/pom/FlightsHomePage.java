package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightsHomePage extends BaseClass {
    public FlightsHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the flight page
     */

    @FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[1]/a/span")
    public WebElement roundtripLabel;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button[1]")
    public WebElement originLocation;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin\"]")
    public WebElement originLocationText;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button")
    public WebElement firstResult;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")
    public WebElement destinationLocation;

    @FindBy(xpath="//*[@id=\"location-field-leg1-destination\"]")
    public WebElement destinationLocationText;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li[1]/button")
    public WebElement firstResult2;

    @FindBy(xpath = "//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
    public WebElement searchButton;


    /////second test

    @FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[3]/a")
    public WebElement multiCity;


    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button")
    public WebElement originLocationMT;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin\"]")
    public WebElement originLocationTextMT;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button")
    public WebElement originLocationResultMT;


    @FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")
    public WebElement destinationLocationMT;

    @FindBy(xpath="//*[@id=\"location-field-leg1-destination\"]")
    public WebElement destinationLocationTextMT;

    @FindBy(xpath="//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li[1]/button")
    public WebElement destinationLocationResultMT;


    @FindBy(xpath="//*[@id=\"location-field-leg2-destination-menu\"]/div[1]/button")
    public WebElement destinationLocation2MT;

    @FindBy(xpath="//*[@id=\"location-field-leg2-destination\"]")
    public WebElement destinationLocation2TextMT;

    @FindBy(xpath="//*[@id=\"location-field-leg2-destination-menu\"]/div[2]/ul/li[1]/button")
    public WebElement destinationLocationResult2MT;

    @FindBy(xpath="//*[@id=\"wizard-flight-tab-multicity\"]/div[2]/div[1]/fieldset[2]/div/div[3]//button[1]")
    public WebElement date2;

    @FindBy(xpath="//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
    public WebElement searchButtonMT;

    @FindBy(xpath="//*[@id=\"adaptive-menu\"]")
    public WebElement travelersNum;

    @FindBy(xpath="//*[@id=\"adaptive-menu\"]/div/div/section/div[1]/div[1]/div/button[2]")
    public WebElement travelersNumButton;

    @FindBy(xpath="//*[@id=\"preferred-class-input-trigger\"]")
    public WebElement classType;

    @FindBy(xpath="//*[@id=\"preferred-class-input\"]/div/div/a[4]")
    public WebElement classTypeFirst;

    @FindBy(xpath="//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]//div[2]/div[2]/div[1]")
    public WebElement leftSideOfCalendar;

    @FindBy(xpath="//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]//div[2]/div[2]/div[2]")
    public WebElement rightSideOfCalendar;

    @FindBy(xpath="//*[@aria-label=\"Oct 20, 2021\"]")
    public WebElement pickOctTwenty;

    @FindBy(xpath="//*[@aria-label=\"Oct 31, 2021\"]")
    public WebElement pickOctThirdyOne;

    @FindBy(xpath="//*[@id=\"d1-btn\"]")
    public WebElement dateButton;

    @FindBy(xpath="//*[@data-stid=\"apply-date-picker\"]")
    public WebElement doneButton;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]//fieldset[2]/div[2]/div[1]/div[1]")
    public WebElement nonStop;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]//fieldset/fieldset[4]/div/div[2]")
    public WebElement afternoonSelector;

    @FindBy(xpath="//*[@data-test-id=\"offer-listing\"]/div/div/div/div/div/div/div/div/div/span")
    public List<WebElement> arrivalTimes;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div/div[3]/div[1]/aside/fieldset/div/legend")
    public WebElement confirmWEBElement;

    @FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[2]/a")
    public WebElement oneWay;

    @FindBy(xpath="//*[@aria-label=\"Nov 12, 2021\"]")
    public WebElement pickNovTwelve;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]/div[2]/div[3]//div[5]/a")
    public WebElement sendFeedback;

    @FindBy(xpath="//*[@id=\"required_box_page_rating\"]/div/div[5]")
    public WebElement ratingFive;

    @FindBy(xpath="//*[@id=\"survey\"]/fieldset[2]/div/div[11]")
    public WebElement clickTen;

    @FindBy(xpath="//*[@id=\"verbatim\"]")
    public WebElement clickTextBox;

    @FindBy(xpath="//*[@id=\"email_address\"]")
    public WebElement email_address;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]//fieldset[3]/div[2]/div/div[2]/button")
    public WebElement clickAirlines;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]//aside/fieldset/fieldset[3]//div/label/span/div")
    public List<WebElement> listOfAirlines;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]/div[2]/div[3]/div/aside/fieldset/fieldset[3]/div[2]/div/div/div[1]/div/div[2]")
    public List<WebElement> startingPricesOfAirlines;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]/div[2]/div[3]/div[1]/section/main/ul/li/div/div/div/div/div[1]/div/div/div/div/span[1]")
    public List<WebElement> TimesOfAirlines;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]/div[2]/div[3]/div[1]/section/main/ul/li/div/div/div/div/div[1]/div/div/div/div[2]")
    public List<WebElement> LocationsOfAirlines;

    @FindBy(xpath="//*[@id=\"app-layer-base\"]/div[2]/div[3]/div/section/main/div[2]/div/h2")
    public WebElement errorMessage;

    @FindBy(xpath="//*[@id=\"survey-header\"]/p[1]")
    public WebElement feedbackText;

}
