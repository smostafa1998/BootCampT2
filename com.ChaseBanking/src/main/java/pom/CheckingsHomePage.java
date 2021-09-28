package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingsHomePage extends BaseClass {
    public  CheckingsHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the checking page
     */

    @FindBy(xpath="//*[@id=\"compare\"]/div/div/div[1]/h1")
    public WebElement checkingText;

    @FindBy(xpath="//*[@id=\"ChartEveryday\"]/div[2]/div[2]/div[2]/div[1]/button")
    public WebElement modalWindow;

    @FindBy(xpath="//*[@id=\"MainCtrl1_ClearSimpleGuideTotalModal\"]")
    public WebElement modalPDF;

    @FindBy(xpath="//*[@id=\"modal-1\"]/div/div/div[1]/button")
    public WebElement modalWindowButton;

    @FindBy(xpath="//*[@id=\"icon\"]/iron-icon")
    public WebElement downloadFile;

    @FindBy(xpath="//*[@id=\"viewer\"]")
    public WebElement firstRoot;

    @FindBy(xpath="//*[@id=\"downloads\"]")
    public WebElement secondRoot;

    @FindBy(xpath="//*[@id=\"download\"]")
    public WebElement thirdRoot;

    @FindBy(xpath="//*[@id=\"StudentsToggle\"]")
    public WebElement clickStudent;

    @FindBy(xpath="//*[@id=\"MainCtrl1_firstCheckingLearnMore\"]")
    public WebElement learnMore;

    @FindBy(xpath="//*[@id=\"benefits-section\"]/div[2]/div/div/a")
    public WebElement pressPlay;

    @FindBy(xpath="//*[@id=\"video_html5_api\"]")
    public WebElement playButton;

    @FindBy(xpath="//*[@id=\"cancel\"]")
    public WebElement cancelButton;

    @FindBy(xpath="//*[@id=\"tabs-text\"]/h3")
    public WebElement messageKids;


}
