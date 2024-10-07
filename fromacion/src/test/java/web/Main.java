package web;

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

public class Main {
    public static String testId;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected TakesScreenshot scrshot;
    protected File srcFile;
    protected File destFile;
    protected static String paso;

    // XML, CSV, and JSON
    static Document doc;
    static Map<String, String> csvData = new HashMap<>();
    static JSONObject jsonData;

    @BeforeMethod
    public void setup_test() {
        String xmlFilePath = "C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml";
        String csvFilePath = "C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.csv";
        String jsonFilePath = "C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.json";

        // XML Reading
        try {
            File inputFile = new File(xmlFilePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions for XML
        }

        // CSV Reading
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 2) {
                    csvData.put(values[0].trim(), values[1].trim());
                }
            }
            // Debug: Print loaded CSV data
            System.out.println("CSV Data Loaded: " + csvData);
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions for CSV
        }

        // JSON Reading
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
            jsonData = new JSONObject(jsonString);
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions for JSON
        }

        // WebDriver Setup
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");

        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 45);
    }

    @AfterMethod
    public void breakup_test() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void after_suite() throws Exception {
        // Final processes, if necessary
    }

    // Method to get the value of a specific tag in the XML document
    public static String getTagValue(String tag, Document doc) {
        NodeList nodeList = doc.getElementsByTagName(tag);
        Node node = nodeList.item(0); // Get the first node

        // Check if the node is not null and is an element
        if (node != null && node.getNodeType() == Node.ELEMENT_NODE) {
            return node.getTextContent(); // Return the node content
        }
        return null; // Return null if the node does not exist
    }

    // Method to get the value from CSV data
    public static String getCsvValue(String key) {
        return csvData.get(key);
    }

    // Method to get the value from JSON data
    public static String getJsonValue(String key) {
        return jsonData.optString(key, null); // Returns null if the key does not exist
    }
}
