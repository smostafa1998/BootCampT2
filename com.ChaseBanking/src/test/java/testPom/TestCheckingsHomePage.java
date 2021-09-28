package testPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pom.CheckingsHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


public class TestCheckingsHomePage extends TestBase {

    @Test(enabled= false)
    public void verifyCheckingsTest1(){
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        String parentTab = driver.getWindowHandle();
        clickOnElement(checkings.modalWindow);
        clickOnElement(checkings.modalWindowButton);
        clickOnElement(checkings.modalWindow);
        clickOnElement(checkings.modalPDF);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        WebElement shadowHost = driver.findElement(By.cssSelector("#viewer"));
        WebElement shadowTreeL1= getShadowElement(shadowHost,"#toolbar");
        WebElement shadowTreeL2 = getShadowElement(shadowTreeL1,"#downloads");
        WebElement shadowTreeL3 = getShadowElement(shadowTreeL2,"#download");
        clickJScript(shadowTreeL3);

        //WebElement root1 = driver.findElement(By.xpath("//*[@id=\"viewer\"]"));
        //WebElement shadowRoot1 = expandRootElement(root1);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        clickOnElement(checkings.modalWindowButton);




        /*
        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> tabHandles = driver.getWindowHandles();
        Iterator<String> iterator = tabHandles.iterator();

        while (iterator.hasNext()) {
            String childTab = iterator.next();

            if (!(childTab.equalsIgnoreCase(parentTab))) {
                driver.switchTo().window(childTab);
                break;
            }
        }
        //https://personal.chase.com/personal/checking
        //clickJScript(checkings.downloadFile);
        driver.switchTo().window(parentTab);

         */

       // WebElement root1 = driver.findElement(By.xpath("//*[@id=\"viewer\"]"));
       // WebElement shadowRoot1 = expandRootElement(root1);

        //expandRootElement(checkings.firstRoot);

        //expandRootElement(checkings.secondRoot);
        //expandRootElement(checkings.thirdRoot);
        //clickJScript(checkings.thirdRoot);


    }



    @Test
    public void verifyCheckingsTest2(){
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();
        clickOnElement(checkings.clickStudent);
        clickOnElement(checkings.learnMore);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        clickOnElement(checkings.pressPlay);
        clickOnElement(checkings.playButton);
        clickOnElement(checkings.cancelButton);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        waitForElementToBeVisible(checkings.messageKids);

    }

    @Test(enabled=false)
    public void verifyCheckingsTest3(){
        Homepage homepage = getHomepage();
        CheckingsHomePage checkings = homepage.navigateToCheckingsPage();

    }
}
