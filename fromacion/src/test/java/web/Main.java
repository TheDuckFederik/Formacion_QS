package web;
//
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.util.Properties;
//
public class Main {
    public static String testId;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected TakesScreenshot scrshot;
    protected File srcFile;
    protected File destFile;
    protected Properties propiedades = new Properties();
    public static String paso;
    //
    @BeforeMethod
    public void setup_test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 45);
    }
    //
    @AfterMethod
    public void breakup_test() {
        if (driver != null) {
            driver.quit();
        }
    }
    //
    @AfterSuite
    public void after_suite() {
        // Optional: Add any clean-up logic needed after all tests are done.
    }
}
