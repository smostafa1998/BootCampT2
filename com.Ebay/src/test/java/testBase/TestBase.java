package testBase;

import base.BaseClass;
import pom.Homepage;

/**
 * EBAY TEST BASE
 */
public class TestBase extends BaseClass {

    public Homepage getHomepage() {
        return new Homepage();
    }
}
