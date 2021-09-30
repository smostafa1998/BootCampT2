package testPom;

import org.testng.annotations.Test;
import pom.AccessoriesHomePage;
import pom.Homepage;
import testBase.TestBase;


public class TestAccessoriesHomePage extends TestBase {


    @Test(enabled=true)
    public void verifyAccessoriesTest1(){
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
    }

    @Test(enabled=true)
    public void verifyAccessoriesTest2(){
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
    }

    @Test(enabled=true)
    public void verifyAccessoriesTest3(){
        Homepage homepage = getHomepage();
        AccessoriesHomePage accessories = homepage.navigateToAccessories();
    }
}
