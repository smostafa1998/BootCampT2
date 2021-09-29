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
    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[2]/nav[1]/div")
    public WebElement shoppingText;

    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[2]/nav[1]/ul/li/a")
    public List<WebElement> shoppingLinks;

    @FindBy(xpath="//*[@id=\"zip_code\"]")
    public WebElement zipCode;

    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[1]/form/button[1]")
    public WebElement shopNew;

    @FindBy(xpath="//*[@id=\"scroll-top-target\"]/div[2]/div/div[2]/div[4]/div[1]")
    public List<WebElement> pricesNewCars;

    @FindBy(xpath="//div[1]//div[5]/div[2]//div[2]/div[2]/nav[1]/ul/li[2]/a")
    public WebElement estimateButton;

    @FindBy(xpath="//*[@id=\"series\"]")
    public WebElement series;

    @FindBy(xpath="//div[2]/div[1]//div[1]//div[1]/div[2]/div[2]/label[2]/div[3]/select")
    public WebElement model;

    @FindBy(xpath="//div[2]/div[1]//div[1]//div[1]/div[2]/div[2]/label[3]/div[3]/input")
    public WebElement inputZIP;

    @FindBy(xpath="//div[2]/div[1]//div[1]//div[2]/div[2]/div[2]/button")
    public WebElement estimatePayments;

    @FindBy(xpath="//div[2]/div[1]//div[1]//div[1]/div[3]/div[2]/div[3]/p")
    public WebElement confirmPrice;





}
