package testPom;

import org.testng.annotations.Test;
import pom.Homepage;
import pom.SoccerHomePage;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TestSoccerHomePage extends TestBase {

    @Test
    public void verifySoccerTest1(){
        Homepage homepage = getHomepage();
        SoccerHomePage soccer = homepage.navigateToSoccer();
        List<String> elementCopied = new ArrayList<>();
        getListOfElements(soccer.linksArticles,elementCopied);
        database.insertDataFromListToSqlTable(elementCopied,"soccerArticles","Articles");
        clickOnElement(soccer.linksArticles.get(1));
        scrollJS(5000);
    }

    @Test(enabled=false)
    public void verifySoccerTest2(){
        Homepage homepage = getHomepage();

    }

    @Test(enabled=false)
    public void verifySoccerTest3(){
        Homepage homepage = getHomepage();

    }

}
