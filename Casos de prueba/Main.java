package web;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Main {

  // Instanciar accionescondiciónes
  public static String testId;
  static WebDriver driver;
  static Wait<WebDriver> wait;
  static TakesScreenshot scrshot;
  static File srcFile;
  static File destFile;
  static Properties propiedades = new Properties();
  public static String paso;

  private static Main home_instance = null;

  // Instanciar clases de test con patrón Singleton
  public static Main setInstance() {
    if (home_instance == null) {
      home_instance = new Main();
    }
    return home_instance;
  }

  public static boolean validateElement(String xPath) throws IOException {
    try {
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
      Assert.assertTrue(element.isDisplayed());
      return true;
    }
    catch (Exception e) {
      System.out.println("Element does not exist");
      return false;
    }

  }

  @BeforeMethod
  public void setup_test() throws Exception {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--window-position=500,-1000");
    chromeOptions.addArguments("start-maximized");
    chromeOptions.addArguments("maximize_window");
    chromeOptions.addArguments("--log-level=1");
    chromeOptions.addArguments("--disable-search-engine-choice-screen");
    chromeOptions.addArguments("--incognito");


    //chromeOptions.addArguments("--headless");
    driver = new ChromeDriver(chromeOptions);
    driver.manage().window().maximize();
    wait = new WebDriverWait(driver, 45);
  }

  @AfterMethod
  public void breakup_test() throws Exception {
    // Cerrar el navegador
    driver.quit();
  }

  @AfterSuite
  public void after_suite() throws Exception {
    // ProcessBuilder procesoBuilder = new ProcessBuilder("./script.bat");
    // Process proceso = procesoBuilder.start();
    // proceso.waitFor();
  }



}
