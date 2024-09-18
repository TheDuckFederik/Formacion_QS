package web;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

// import com.google.common.collect.ImmutableMap;

import java.io.File;

import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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

  @BeforeMethod
  public void setup_test() throws Exception {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("start-maximized");
    chromeOptions.addArguments("--log-level=1");
    chromeOptions.addArguments("--incognito");
    chromeOptions.addArguments("--disable-notifications");
    chromeOptions.addArguments("--disable-search-engine-choice-screen");
    chromeOptions.addArguments("--incognito");
    //chromeOptions.addArguments("--headless");
    driver = new ChromeDriver(chromeOptions);
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
