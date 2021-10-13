package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckingsHomePage extends BaseClass {
    public CheckingsHomePage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Put all elements under here for the checking page
     */

    @FindBy(xpath = "//*[@id=\"compare\"]/div/div/div[1]/h1")
    public WebElement checkingText;

    @FindBy(xpath = "//*[@id=\"ChartEveryday\"]/div[2]/div[2]/div[2]/div[1]/button")
    public WebElement modalWindow;

    @FindBy(xpath = "//*[@id=\"MainCtrl1_ClearSimpleGuideTotalModal\"]")
    public WebElement modalPDF;

    @FindBy(xpath = "//*[@id=\"modal-1\"]/div/div/div[1]/button")
    public WebElement modalWindowButton;

    @FindBy(xpath = "//*[@id=\"nav-bar\"]/div/div[3]/div[1]/button")
    public WebElement checkingLink;

    @FindBy(xpath = "//*[@id=\"StudentsToggle\"]")
    public WebElement clickStudent;

    @FindBy(xpath = "//*[@id=\"MainCtrl1_firstCheckingLearnMore\"]")
    public WebElement learnMore;

    @FindBy(xpath = "//*[@id=\"benefits-section\"]/div[2]/div/div/a")
    public WebElement pressPlay;

    @FindBy(xpath = "//*[@id=\"video_html5_api\"]")
    public WebElement playButton;

    @FindBy(xpath = "//*[@id=\"cancel\"]")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[@id=\"cfb_heading\"]/div/div/h1")
    public WebElement headerText;

    @FindBy(xpath = "//*[@id=\"compare\"]//div[2]/div[2]//div[1]/h2")
    public WebElement messageKids;

    @FindBy(xpath = "//*[@id=\"nav-bar\"]/div/div[3]/div[2]/button")
    public WebElement CDTab;

    @FindBy(xpath = "//*[@id=\"HeaderCtrl1_HeaderMain_NavSavingsCDsDesktop\"]")
    public WebElement CDLink;

    @FindBy(xpath = "//*[@id=\"prePopulated\"]")
    public WebElement inputZipCode;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[4]/div[5]/button")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"dynamicContentDropZone0\"]//div[6]//div[3]/div[2]//table/thead/tr/th")
    public List<WebElement> columnsCD;

    @FindBy(xpath = "//*[@id=\"MainCtrl1_nearestBranch\"]")
    public WebElement nearestBranch;

    @FindBy(xpath = "//*[@id=\"q\"]")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//*[@id=\"HeroSearchBarSearch\"]/button")
    public WebElement submit;

    @FindBy(xpath = "//*[contains(@id,\"js-yl-\")]//div[1]/h3/a/span/span[2]")
    public List<WebElement> locations;

    @FindBy(xpath = "//*[@id=\"HeaderCtrl1_HeaderMain_NavCheckingPrivateClientCheckingDesktop\"]")
    public WebElement privateAccount;

    @FindBy(xpath = "//*[@id=\"left-nav\"]/div[2]/ul/li[2]/ul/li[2]/a")
    public WebElement lendingLink;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]/section[1]/div//div[1]/a")
    public WebElement homeLoan;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]/section[2]/div//div[1]/ul/li")
    public List<WebElement> homeLoanBenefits;

    @FindBy(xpath = "//*[@id=\"left-nav\"]/div[2]/ul/li[4]//li[1]/a")
    public WebElement planningBenefits;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]/div[3]//div[1]/div/div[2]/div[2]//button")
    public WebElement closeButton;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]//section/div[1]/div/div/div/button/span")
    public List<WebElement> buttonEvents;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]//section/div[1]/div/div[1]/div/button")
    public WebElement marketVolitality;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]//section/div[1]/div/div[3]/div/button")
    public WebElement marriage;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]//section/div[1]/div/div[4]/div/button")
    public WebElement extraExpences;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]/div[3]/div/div[2]/div[1]/div/h3")
    public WebElement eventText;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]//section/div[1]/div/div[1]/div/button/span")
    public WebElement marketVolitalityTX;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]//section/div[1]/div/div[3]/div/button/span")
    public WebElement marriageTX;

    @FindBy(xpath = "//*[@id=\"main-content-area\"]//section/div[1]/div/div[4]/div/button/span")
    public WebElement extraExpencesTX;

    @FindBy(xpath="//*[@id=\"modal-1\"]/div/div/div[2]/div/h4")
    public WebElement modalTitle;


}
