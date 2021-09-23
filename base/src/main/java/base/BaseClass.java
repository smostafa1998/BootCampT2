package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
public class BaseClass {

    public static WebDriver driver;
    public static WebDriverWait driverWait;
    public static ExtentReports extent;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuiteExtentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod(alwaysRun = true)
    public static void beforeEachMethodExtentInit(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName();

        ExtentTestManager.startTest(methodName);
        ExtentTestManager.getTest().assignCategory(className);

        System.out.println("\n\t***" + methodName + "***\n");
    }

    @Parameters ({"browser", "url"})
    @BeforeMethod (alwaysRun = true)
    public void driverSetup(@Optional("chrome") String browser, String url) {
        driver = initDriver(browser);
        driverWait = new WebDriverWait(driver, 20);

        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void extentFlush(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, "TEST CASE FAILED: " + result.getName());
            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
            captureScreenshot(driver, result.getName());
        } else if (result.getStatus() == ITestResult.SKIP) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "TEST CASE SKIPPED: " + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "TEST CASE PASSED: " + result.getName());
        }

        ExtentTestManager.endTest();
        extent.flush();
    }

    @AfterMethod
    public void driverClose() {
        driver.close();
    }

    @AfterSuite (alwaysRun = true)
    private void afterSuiteTearDown() {
        driver.quit();
        extent.close();
    }

    public WebDriver initDriver(String browser) {
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        return driver;
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    private static void captureScreenshot(WebDriver driver, String testName) {
        String fileName = testName + ".png";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File newScreenshotFile = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "main" + File.separator + "java" + File.separator + "reporting" + File.separator + fileName);

        try {
            FileHandler.copy(screenshot, newScreenshotFile);
            System.out.println("SCREENSHOT TAKEN");
        } catch (Exception e) {
            System.out.println("ERROR TAKING SCREENSHOT: " + e.getMessage());
        }
    }

    /*
    Selenium Helper Methods
     */

    public WebElement safeFindElement(By by) {
        WebElement element = driver.findElement(by);

        return element;
    }

    public void sendKeysToInput(WebElement element, String keys) {
        driverWait.until(ExpectedConditions.visibilityOf(element));

        element.sendKeys(keys);
    }

    public void dropdownSelectByVisibleText(WebElement element, String visibleText) {
        driverWait.until(ExpectedConditions.visibilityOf(element));

        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public void clickOnElement(WebElement element) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (StaleElementReferenceException e1) {
            e1.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            element.click();
        } catch (Exception e1) {
            clickJScript(element);
        }
    }

    public void clickJScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
    }

    /*
    SYNC Methods
     */
    public void waitForElementToBeVisible(WebElement element) {
        driverWait.until(ExpectedConditions.visibilityOf(element));
    }
}
