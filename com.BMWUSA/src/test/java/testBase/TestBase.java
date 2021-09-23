package testBase;

import base.BaseClass;
import pom.Homepage;

public class TestBase extends BaseClass {

    public Homepage getHomepage() {
        return new Homepage();
    }
}
