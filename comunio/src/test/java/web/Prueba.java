package web;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;


public class Prueba extends Main {
    
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP005_Buttons() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP005_Buttons";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP006_Upload_Dounload() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP006_Upload_Dounload";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP007_Dynamic_Properties() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP007_Dynamic_Properties";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP008_Practice_Form() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "TC001_Elements1";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP009_Browser_Windows() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP009_Browser_Windows";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP010_Alerts() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP010_Alerts";
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP011_Frames() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP011_Frames";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP012_Nested_Frames() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP012_Nested_Frames";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP013_Modal_Dialogs() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP013_Modal_Dialogs";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP014_Date_Picker() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP014_Date_Picker";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP015_Slider() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP015_Slider";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP016_progres_Bar() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP016_progres_Bar";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP017_Menu() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP017_Menu";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP018_Select_Menu() throws InterruptedException, IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "CP018_Select_Menu";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    
    }
