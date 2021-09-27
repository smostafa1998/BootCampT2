package testPom;

import org.testng.annotations.Test;
import pom.DecorHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestDecorHomePage extends TestBase {


    @Test(enabled = false)
    public void verifyDecorTest1() {
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        List<String> elementCopied2 = new ArrayList<>();
        DecorHomePage decor = homepage.navigateToDecor();
        getListOfElements(decor.featuredCategories, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "FurnitureList", "Items");
        waitForElementToBeVisible(decor.saleItems);
        clickOnElement(decor.saleItems);
        clickOnElement(decor.dropDownSortBy);
        waitForElementToBeVisible(decor.customerRating);
        clickOnElement(decor.customerRating);
        getListOfElements(decor.listOfProducts, elementCopied2);
        database.insertDataFromListToSqlTable(elementCopied, "ProductList", "Items");
    }

    @Test(enabled = false)
    public void verifyDecorTest2() {
        Homepage homepage = getHomepage();
        List<String> elementCopied = new ArrayList<>();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.indoorFireplace);
        waitForElementToBeVisible(decor.naturalGas);
        clickOnElement(decor.naturalGas);
        clickOnElement(decor.dropDownPrice);
        clickJScript(decor.checkBoxPrice);
        waitForElementToBeVisible(decor.checkBoxPriceConfirm);
        getListOfElements(decor.listOfFireplace, elementCopied);
        database.insertDataFromListToSqlTable(elementCopied, "fireplaceList", "Items");
    }

    // this is a glitch and put imap coding into it
    @Test(enabled = false)
    public void verifyDecorTest3() {
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        waitForElementToBeVisible(decor.throwPillows);
        clickOnElement(decor.throwPillows);
        waitForElementToBeVisible(decor.pillowClick);
        clickOnElement(decor.pillowClick);

        String parentTab = driver.getWindowHandle();
        Set<String> tabHandles = driver.getWindowHandles();
        Iterator<String> iterator = tabHandles.iterator();

        waitForElementToBeVisible(decor.textProduct);
        clickOnElement(decor.textProduct);

        while (iterator.hasNext()) {
            String childTab = iterator.next();

            if (!(childTab.equalsIgnoreCase(parentTab))) {
                driver.switchTo().window(childTab);
                break;
            }
        }

        //waitForElementToBeVisible(decor.textProduct);
        //webDriverWait.until(ExpectedConditions.urlToBe("https://www.overstock.com/Home-Garden/Talco-Shaggy-Boho-Stripe-22-inch-Throw-Pillow/30756554/product.html?guid=5ca41708-d9b4-4010-a84c-d419b50804bc&kwds=&osp=true&refccid=RZ4HGAFSCCIKWX2G7K4NF6KG6M&rfmt=pattern%3ATextured&searchidx=0"));
        driver.switchTo().window(parentTab);
    }

    @Test
    public void verifyDecorTest4(){
        Homepage homepage = getHomepage();
        DecorHomePage decor = homepage.navigateToDecor();
        clickOnElement(decor.inputAccount);
        foundIframe(decor.loginIframe);
        homepage.enterUserInfo(decor.inputEmail,"smostafa1998@gmail.com",decor.inputPassword,"testing123");
    }


}
