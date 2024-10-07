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
import java.io.InputStream;
import java.util.Properties;

public class Main {

    // Instanciar acciones y condiciones
    public static String testId;
    static WebDriver driver;
    static Wait<WebDriver> wait;
    static TakesScreenshot scrshot;
    static File srcFile;
    static File destFile;

    // Para el archivo de configuración
    static Properties config;

    // Para el archivo XML
    static Document doc;
    
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

        // Cargar el archivo XML
        String xmlFilePath = "src\\test\\java\\web\\selenium.xml";
        File inputFile = new File(xmlFilePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize(); // Normaliza el documento

        // Configuración del WebDriver
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
    public void breakup_test() throws Exception {
        // Cerrar el navegador
        driver.quit();
    }

    @AfterSuite
    public void after_suite() throws Exception {
        // Procesos finales, si es necesario
        // ProcessBuilder procesoBuilder = new ProcessBuilder("./script.bat");
        // Process proceso = procesoBuilder.start();
        // proceso.waitFor();
    }

    // Método para obtener el valor de una etiqueta específica en el documento XML
    public static String getTagValue(String tag, Document doc) {
        // Buscar todas las ocurrencias del tag
        NodeList nodeList = doc.getElementsByTagName(tag);
        Node node = nodeList.item(0); // Obtener el primer nodo de la lista
        
        // Verificar si el nodo no es nulo y es un elemento
        if (node != null && node.getNodeType() == Node.ELEMENT_NODE) {
            return node.getTextContent(); // Devolver el contenido del nodo
        }
        return null; // Devolver null si el nodo no existe
    }
}
