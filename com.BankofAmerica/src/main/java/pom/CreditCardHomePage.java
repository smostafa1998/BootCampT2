package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreditCardHomePage extends BaseClass {
    public CreditCardHomePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Put all elements under here for the credit page
     */

    @FindBy(xpath="//*[@id=\"navCreditCardsContent\"]/div[2]//div/p")
    public WebElement creditInfo;

    @FindBy(xpath="//*[@id=\"navCreditCardsContent\"]/div[2]/div[1]//div[2]/ul/li")
    public List<WebElement> creditLinks;

    @FindBy(xpath="//*[@id=\"btnCompareCreditCards\"]")
    public WebElement btnCompareCreditCards;

    @FindBy(xpath="//*[@id=\"popularCards\"]/div/div//h2")
    public List<WebElement> cardNames;

    @FindBy(xpath="//*[@id=\"popularCards\"]//div[2]/h3")
    public List<WebElement> cardDescriptions;

    @FindBy(xpath="//*[@id=\"cardsForStudents\"]")
    public WebElement cardsForStudents;

    @FindBy(xpath="//*[@id=\"terms_and_conditions_4051863~3D~en_US\"]")
    public WebElement cardsForStudentsTC;

    @FindBy(xpath="//*[@id=\"termsAndConditions\"]/div[4]/div/div[1]/b")
    public List<WebElement> rowName;



}
