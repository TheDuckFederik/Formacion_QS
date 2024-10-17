package web;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Properties;


import org.json.JSONObject;


import java.nio.file.Files;

public class Main {

    // Instanciar acciones y condiciones
    public static String testId;
    public static WebDriver driver;
    protected static Wait<WebDriver> wait;
    static TakesScreenshot scrshot;
    static File srcFile;
    static File destFile;

    // Para el archivo de configuración
    public static Properties config;

    // Para el archivo XML y JSON

    public static Document doc;
    public static JSONObject jsonData;
    public static String jsonFilePath;
    private static Main home_instance = null;

    // Patrón Singleton para instanciar la clase
    public static Main setInstance() {
        if (home_instance == null) {
            home_instance = new Main();
        }
        return home_instance;
    }

    @BeforeMethod
    public void setup_test() throws Exception {
        // Cargar el archivo de configuración
        config = new Properties();
        InputStream input = new FileInputStream("src\\test\\java\\web\\selenium.conf");
        config.load(input);

        // Cargar el archivo JSON
        jsonFilePath = "src\\test\\java\\web\\selenium.json"; // Ruta modificada según tu estructura de directorios
        loadJSON(jsonFilePath); // Llamada al método para cargar el archivo JSON

        // Cargar el archivo XML
        String xmlFilePath = "src\\test\\java\\web\\selenium.xml";
        loadXML(xmlFilePath);

        // Configuración del WebDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(chromeOptions);
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }

    // Método para cargar el archivo JSON
    public static void loadJSON(String filePath) throws IOException {
        String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
        jsonData = new JSONObject(jsonString); // Cargar el archivo JSON en un JSONObject
    }

    // Método para obtener un valor del JSON según el ID del caso de prueba
    public static String getJSONValue(String testCaseId, String key) {
        return jsonData.getJSONObject(testCaseId).getString(key);
    }

    // Método para cargar el archivo XML (No modificado)
    public static void loadXML(String filePath) throws Exception {
        File inputFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize(); // Normalizar el documento
    }

    @AfterMethod
    public void breakup_test() throws Exception {
        // Cerrar el navegador
        driver.quit();
    }

    @AfterSuite
    public void after_suite() throws Exception {
        // Procesos finales, si es necesario
    }

    // Método para obtener el valor de una etiqueta específica en el documento XML (No modificado)
    public static String getTagValue(String tag, Document doc) {
        NodeList nodeList = doc.getElementsByTagName(tag);
        Node node = nodeList.item(0); // Obtener el primer nodo de la lista

        // Verificar si el nodo no es nulo y es un elemento
        if (node != null && node.getNodeType() == Node.ELEMENT_NODE) {
            return node.getTextContent(); // Devolver el contenido del nodo
        }
        return null; // Devolver null si el nodo no existe
    }
}
