package web;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

import com.google.gson.Gson;


public class Widgets extends Main {

    @Test(description = "Prueba DemoQA Widgets Date_Picker")
    @Story("Widgets")
    @Description("Probar Date_Picker")
    public void TC014_Date_Picker() throws InterruptedException, IOException {
        testId = "TC014_Date_Picker";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("widgets.datepicker")));
            form.click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("datepicker.selectdate"))).click();
            Thread.sleep(100);

            WebElement mes = driver.findElement(By.xpath(propiedades.getProperty("datepicker.months")));
            Select mesSelect = new Select(mes);
            mesSelect.selectByVisibleText("April");
            Thread.sleep(100);

            WebElement año = driver.findElement(By.xpath(propiedades.getProperty("datepicker.years")));
            Select añoSelect = new Select(año);
            añoSelect.selectByVisibleText("2005");
            Thread.sleep(100);

            driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]")).click();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(100);

            // driver.findElement(By.xpath(propiedades.getProperty("datepicker.days"))).click();
            // Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("datepicker.dateandtime"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("datepicker.months2.1"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("datepicker.months2.2"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("datepicker.years2.1"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("datepicker.years2.2"))).click();
            Thread.sleep(100);

            // driver.findElement(By.xpath(propiedades.getProperty("datepicker.days2"))).click();
            // Thread.sleep(100);

            driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[7]")).click();

            driver.findElement(By.xpath(propiedades.getProperty("datepicker.hour"))).click();
            Thread.sleep(100);


        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP014\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP014\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP014\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP014\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP014\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Slider")
    @Story("Widgets")
    @Description("Probar Slider")
    public void TC015_Slider() throws InterruptedException, IOException {
        testId = "TC015_Slider";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("widgets.slider")));
            form.click();
            Thread.sleep(100);

            WebElement slider = driver.findElement(By.xpath(propiedades.getProperty("slider.slider")));

            for(int i = 1; i < 25; i++) {
                
                slider.sendKeys(Keys.ARROW_LEFT);

            }

            for(int i = 1; i < 100; i++) {
                
                slider.sendKeys(Keys.ARROW_RIGHT);

            }

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP015\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP015\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP015\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP015\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP015\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Progress Bar")
    @Story("Widgets")
    @Description("Probar Progress Bar")
    public void TC016_Progress_Bar() throws InterruptedException, IOException {
        testId = "TC016_Progress_Bar";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("widgets.progressbar")));
            form.click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("progressbar.start"))).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath(propiedades.getProperty("progressbar.start"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("progressbar.start"))).click();
            Thread.sleep(6000);

            driver.findElement(By.xpath(propiedades.getProperty("progressbar.restart"))).click();
            Thread.sleep(100);

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP016\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP016\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP016\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP016\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP016\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Menu")
    @Story("Widgets")
    @Description("Probar Menu")
    public void TC017_Menu() throws InterruptedException, IOException {
        testId = "TC017_Menu";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(100);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("widgets.menu")));;
            form.click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("menu.mainitem1"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("menu.mainitem3"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("menu.mainitem2"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("menu.subsublist"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("menu.subsub1"))).click();
            Thread.sleep(100);

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP017\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP017\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP017\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP017\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP017\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Select Menu")
    @Story("Widgets")
    @Description("Probar Select Menu")
    public void TC018_Select_Menu() throws InterruptedException, IOException {
        testId = "TC018_Select_Menu";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(100);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("widgets.selectmenu")));
            form.click();
            Thread.sleep(100);

            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(100);

            driver.findElement(By.id("react-select-2-input")).sendKeys("Group 1, option 1"+ Keys.ENTER);
            Thread.sleep(100);

            driver.findElement(By.id("react-select-3-input")).sendKeys("Mr."+ Keys.ENTER);
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("selectmenu.oldstyle"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("selectmenu.oldstyle2"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("selectmenu.oldstyle2"))).click();
            Thread.sleep(100);

            WebElement multiSelect = driver.findElement(By.id("react-select-4-input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiSelect);
            multiSelect.sendKeys("Green"+ Keys.ENTER);
            Thread.sleep(100);

            multiSelect.sendKeys("Blue"+ Keys.ENTER);
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("selectmenu.multiselect"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("selectmenu.opel"))).click();
            Thread.sleep(100);


        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP018\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP018\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP018\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP018\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP018\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
        public List<String[]> datosCsv() throws IOException, CsvException{
        String file = "C:\\Users\\ricard.ferrando.ext\\OneDrive - GFI\\Documentos\\FormacionQS\\Formacion_QS\\demo\\CSV.csv";

        CSVReader reader = new CSVReader(new FileReader(file));
        List<String[]> listDatos = reader.readAll();
        reader.close();
        return listDatos;
    
    }
        public String datoJson(String clavePrueba, String clave) throws IOException{

        Reader myreader = Files.newBufferedReader(Paths.get("C:\\Users\\ricard.ferrando.ext\\OneDrive - GFI\\Documentos\\FormacionQS\\Formacion_QS\\demo\\src\\test\\resources\\config.json"));
        Gson gson = new Gson();
        Map<?,Map<?,?>> userMap = gson.fromJson(myreader, Map.class);
        Map<?,?> subMap = userMap.get(clavePrueba);
        String valor = subMap.get(clave).toString();
        return valor;
    }
}