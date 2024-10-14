// Main.java
package web;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.openqa.selenium.WebElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public String testId;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected TakesScreenshot scrshot;
    protected File srcFile;
    protected File destFile;
    protected String paso;
    static Properties config;
    // XML, CSV, and JSON
    Document doc;
    Map<String, String> csvData = new HashMap<>();
    JSONArray jsonDataArray;

    /**
     * Setup test environment before each test method
     */
    @BeforeMethod
    public void setup_test() {
        setupConfig();
        setupXML();
        setupCSV();
        setupJSON();
        setupWebDriver();
    }

    private void setupConfig() {
        String confFilePath = "C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.conf";
        config = new Properties();
        try (InputStream input = new FileInputStream(confFilePath)) {
            config.load(input);
        } catch (IOException ex) {
            ex.printStackTrace(); // Handle exceptions for config
        }
    }

    private void setupXML() {
        String xmlFilePath = "C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml";
        try {
            File inputFile = new File(xmlFilePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions for XML
        }
    }

    private void setupCSV() {
        String csvFilePath = "C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 2) {
                    csvData.put(values[0].trim(), values[1].trim());
                }
            }
            System.out.println("CSV Data Loaded: " + csvData);
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions for CSV
        }
    }

    private void setupJSON() {
        String jsonFilePath = "C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.json";
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            JSONObject jsonData = new JSONObject(jsonString);
            jsonDataArray = jsonData.getJSONArray("data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\fromacion\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 45);

        // Navigate to the URL from the config file
        String url = config.getProperty("url");
        driver.get(url);
    }

    /**
     * Cleanup test environment after each test method
     */
    @AfterMethod
    public void breakup_test() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Perform final cleanup after all test methods
     */
    @AfterSuite
    public void after_suite() throws Exception {
        // Final processes, if necessary
    }

    // Method to get the value of a specific tag in the XML document
    public String getTagValue(String tag) {
        NodeList nodeList = doc.getElementsByTagName(tag);
        Node node = nodeList.item(0); // Get the first node

        if (node != null && node.getNodeType() == Node.ELEMENT_NODE) {
            return node.getTextContent();
        }
        return null;
    }

    // Method to get the value from CSV data
    public String getCsvValue(String key) {
        return csvData.get(key);
    }

    // Method to get the value from JSON data
    public String getJsonValue(String key) {
        for (int i = 0; i < jsonDataArray.length(); i++) {
            JSONObject jsonObject = jsonDataArray.getJSONObject(i);
            if (jsonObject.has(key)) {
                return jsonObject.getString(key);
            }
        }
        return null;
    }

    // Example method to demonstrate sending keys safely
    public void safeSendKeys(WebElement element, String value) {
        if (value != null && !value.isEmpty()) {
            element.sendKeys(value);
        } else {
            System.out.println("Value is null or empty for element: " + element.toString());
        }
    }

    // Getter method for the doc field
    public Document getDoc() {
        return doc;
    }
}