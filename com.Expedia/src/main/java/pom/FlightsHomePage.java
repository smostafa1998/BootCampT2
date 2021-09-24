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

    @FindBy(xpath = "//*[@id=\"stops-1\"]")
    public WebElement confirmWEBElement;

    @FindBy(xpath = "//*[@id=\"departure-airport-JFK\"]")
    public WebElement departureAirportJFKInput;

    @FindBy(xpath = "//*[@id=\"arrival-airport-OSL\"]")
    public WebElement arrivalAirportOSLInput;

    @FindBy(xpath = "//*[@id=\"departure-time-AFTERNOON\"]")
    public WebElement testing;






}
