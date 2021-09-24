package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DecorHomePage extends BaseClass {

    public DecorHomePage(){
        PageFactory.initElements(driver,this);
    }


    /**
     * Put all elements under here for the decor page
     */

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/h1")
    public WebElement decorLabel;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/nav/ul/li")
    public List<WebElement> featuredCategories;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/nav/ul/li[14]/a")
    public WebElement saleItems;

    @FindBy(xpath="//*[@id=\"sort-by-wrapper\"]/div/div[1]/div[2]")
    public WebElement dropDownSortBy;

    @FindBy(xpath="//*[@id=\"sort-by-wrapper\"]/div/div[2]/div/div[5]")
    public WebElement customerRating;

    @FindBy(xpath="//*[@id=\"1\"]//a/div/div[2]/div[1]/p")
    public List<WebElement> listOfProducts;

    @FindBy(xpath="//*[@id=\"sn-wrapper\"]/section[1]/nav/ul/li[1]/a")
    public WebElement indoorFireplace;

    @FindBy(xpath="//*[@id=\"rugsStoreHub\"]/div/section[2]/ul/li/div[4]/a")
    public WebElement naturalGas;

    @FindBy(xpath="//*[@id=\"priceListHeader\"]/button")
    public WebElement dropDownPrice;

    @FindBy (xpath ="//*[@id=\"price-$30-$40\"]")
    public WebElement checkBoxPrice;



}