package testPom;

import org.testng.annotations.Test;
import pom.CreditCardHomePage;
import pom.Homepage;
import testBase.TestBase;

import java.util.ArrayList;

public class TestCreditCardHomePage extends TestBase {

    @Test(enabled = false)
    public void verifyCreditCardTest1(){
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        oneDList(credit.creditLinks);
    }

    //works but needs an extra wait
    @Test(enabled = false)
    public void verifyCreditCardTest2(){
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.btnCompareCreditCards);
        oneDList(credit.cardNames);
        oneDList(credit.cardDescriptions);
        database.insertDataFrom2ListsToSqlTable(oneDList(credit.cardNames), oneDList(credit.cardDescriptions),"cardTable","cardName","Description");
    }

    @Test(enabled = false)
    public void verifyCreditCardTest3(){
        Homepage homepage = getHomepage();
        CreditCardHomePage credit = homepage.navigateToCreditCard();
        clickOnElement(credit.cardsForStudents);
        clickOnElement(credit.cardsForStudentsTC);
        ArrayList<String> windows2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows2.get(1));
        oneDList(credit.rowName);
        driver.close();
        driver.switchTo().window(windows2.get(0));
    }

}
