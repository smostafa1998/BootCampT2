package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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















    //IGNORE WACK

    @FindBy(xpath= "//*[@id=\"listings-sort\"]")
    public WebElement dropDown;

    @FindBy(xpath = "//*[@id=\"stops-1\"]")
    public WebElement confirmWEBElement;

    @FindBy(xpath = "//*[@id=\"departure-airport-JFK\"]")
    public WebElement departureAirportJFKInput;

    @FindBy(xpath = "//*[@id=\"arrival-airport-OSL\"]")
    public WebElement arrivalAirportOSLInput;

    @FindBy(xpath = "//*[@id=\"departure-time-AFTERNOON\"]")
    public WebElement afternoonSelector;

    @FindBy(xpath = "//*[@id=\"AQr-AgroAnY1LXNvcy02ZTI1Njg5ODVmMjJkNTY3MjI1Mzk1ZGIyNjA3OWMwYi02LTctMX4yLlN-QVFvQ0NBRVNCd2pVQkJBQkdBRW9BbGdDY0FBfkFRcFpDaXNJMUtBQkVnTXlNRElZeEkwQklJdVNBU2pEdHZrQk1OMjUtUUU0UzBBQVdBRnFDRVJKVTBOUFZVNVVDaW9JMUtBQkVnTTNOaklZaTVJQklNNWNLS2k2LVFFd21MejVBVGhMUUFGWUFXb0lSRWxUUTA5VlRsUUtXUW9xQ05TZ0FSSUROell4R001Y0lJdVNBU2pLdlBrQk1MLS0tUUU0VlVBQVdBRnFDRVJKVTBOUFZVNVVDaXNJMUtBQkVnTXlNRGNZaTVJQklNU05BU2phdl9rQk1MckQtUUU0VlVBQldBRnFDRVJKVTBOUFZVNVVFZ29JQVJBQkdBRXFBbFJRR0FFaUJBZ0JFQUVvQWlnREtBUXdBURE9CtejcDeJQCIBASoFEgMKATESPwoWCgoyMDIxLTEwLTA4EgNOWUMaA09TTAoWCgoyMDIxLTEwLTA5EgNPU0waA05ZQxIHEgVDT0FDSBoCEAEgAhoMCAESCBoEKgIIAiIA\"]//button")
    public WebElement firstFlight;

    @FindBy(xpath = "//*[@id=\"app-layer-base\"]//div[1]//div[2]//h2/span")
    public WebElement textTime;

}
