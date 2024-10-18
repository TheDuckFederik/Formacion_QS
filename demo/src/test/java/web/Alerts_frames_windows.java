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


public class Alerts_frames_windows extends Main {

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Browser Windows")
    @Story("Alerts, Frame & Windows")
    @Description("Probar Browser Windows")
    public void TC009_Browser_Windows() throws InterruptedException, IOException {
        testId = "TC009_Browser_Windows";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");           

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.windows")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Alerts, Frame & Windows" + "\n"); 

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("windows.browser")));
            form.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Browser Windows" + "\n"); 

            driver.findElement(By.xpath(propiedades.getProperty("browser.tab"))).click();
            Thread.sleep(100);
            System.out.println("Se abre una pestaña" + "\n"); 

            driver.findElement(By.xpath(propiedades.getProperty("browser.window"))).click();
            Thread.sleep(100);            
            System.out.println("Se abre una ventana" + "\n"); 

            driver.findElement(By.xpath(propiedades.getProperty("browser.windowm"))).click();
            Thread.sleep(100);
            System.out.println("Se abre una ventana con un mensaje" + "\n"); 

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP009\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP009\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP009\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP009\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP009\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Alerts")
    @Story("Alerts, Frame & Windows")
    @Description("Probar Alerts")
    public void TC010_Alerts() throws InterruptedException, IOException, CsvException {
        testId = "TC010_Alerts";
         try{
            String[] datosCorrectosCP010 = datosCsv().get(17);

            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");           

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.windows")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Alerts, Frame & Windows" + "\n"); 

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("windows.alerts")));
            form.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Alerts" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("alerts.boton1"))).click();
            Thread.sleep(100);
            System.out.println("Nos sale el texto You clicked a button" + "\n");
            driver.switchTo().alert().accept();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("alerts.boton2"))).click();
            Thread.sleep(5000);
            System.out.println("Nos sale el texto This alert appeared after 5 seconds" + "\n");
            driver.switchTo().alert().accept();

            driver.findElement(By.xpath(propiedades.getProperty("alerts.boton3"))).click();
            Thread.sleep(100);
            System.out.println("Nos sale el texto Do you confirm action?" + "\n");
            driver.switchTo().alert().dismiss();
            Thread.sleep(100);
            System.out.println("Nos sale el texto You selected Cancel" + "\n");
            

            driver.findElement(By.xpath(propiedades.getProperty("alerts.boton3"))).click();
            Thread.sleep(100);
            System.out.println("Nos sale el texto Do you confirm action?" + "\n");
            driver.switchTo().alert().accept();
            Thread.sleep(100);
            System.out.println("Nos sale el texto You selected Ok" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("alerts.boton4"))).click();
            Thread.sleep(100);
            driver.switchTo().alert().sendKeys(datosCorrectosCP010[0]);
            driver.switchTo().alert().accept();
            Thread.sleep(100);

            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("alerts.boton3m"))).getText());
            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("alerts.boton4m"))).getText());

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP010\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP010\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP010\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP010\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP010\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Extraer Frames")
    public void TC011_Frames() throws InterruptedException, IOException {
        testId = "TC011_Frames";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.windows")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("windows.frames")));
            form.click();
            Thread.sleep(100);
            
            driver.switchTo().frame("frame1");
            WebElement textoFrame1 = driver.findElement(By.id("sampleHeading"));
            String textoArriba = textoFrame1.getText();
            System.out.println("Texto del iframe de arriba: " + textoArriba);
        
            driver.switchTo().defaultContent();

            driver.switchTo().frame("frame2"); 
            WebElement textoFrame2 = driver.findElement(By.id("sampleHeading"));
            String textoAbajo = textoFrame2.getText();
            System.out.println("Texto del iframe de abajo: " + textoAbajo);

            driver.switchTo().defaultContent();
        
            if (textoArriba.equals(textoAbajo)) {
            System.out.println("Los textos de ambos iframes son iguales.");
            }   else {
            System.out.println("Los textos de los iframes son diferentes.");
            }


        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP011\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP011\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP011\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP011\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP011\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Nested Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Extraer Nested Frames")
    public void TC012_Nested_Frames() throws InterruptedException, IOException {
        testId = "TC012_Nested_Frames";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.windows")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("windows.nframes")));
            form.click();
            Thread.sleep(100);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(100);

            driver.switchTo().frame("frame1");
    
            WebElement textoParentFrame = driver.findElement(By.tagName("body"));
            String textoPadre = textoParentFrame.getText();
            System.out.println("Texto del Parent Frame: " + textoPadre);

            driver.switchTo().frame(0);
        
            WebElement textoChildFrame = driver.findElement(By.tagName("p"));
            String textoHijo = textoChildFrame.getText();
            System.out.println("Texto del Child Iframe: " + textoHijo);

            driver.switchTo().defaultContent();


        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP012\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP012\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP012\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP012\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP012\\IdNulo.png"));
            
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Modal_Dialogs")
    @Story("Alerts, Frame & Windows")
    @Description("Extraer Modal Dialogs")
    public void TC013_Modal_Dialogs() throws InterruptedException, IOException {
        testId = "TC013_Modal_Dialogs";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.windows")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath(propiedades.getProperty("windows.modal")));
            form.click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("modal.small"))).click();
            Thread.sleep(100);

            WebElement textosmall = driver.findElement(By.xpath(propiedades.getProperty("modal.stexto")));
            String smallm = textosmall.getText();
            System.out.println("Texto del Small Modal: " + smallm);

            driver.findElement(By.xpath(propiedades.getProperty("modal.sclose"))).click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("modal.large"))).click();
            Thread.sleep(100);

            WebElement textolarge = driver.findElement(By.xpath(propiedades.getProperty("modal.ltexto")));
            String largem = textolarge.getText();
            System.out.println("Texto del Large Modal: " + largem);

            driver.findElement(By.xpath(propiedades.getProperty("modal.lclose"))).click();
            Thread.sleep(100);


        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP013\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP013\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP013\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP013\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP013\\IdNulo.png"));
            
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