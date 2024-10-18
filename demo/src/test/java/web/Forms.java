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


public class Forms extends Main {

@Test(description = "Prueba DemoQA Forms Practice Form")
@Story("Forms")
@Description("Rellenar Practice Form")
public void TC008_Practice_Form() throws InterruptedException, IOException, CsvException {
    testId = "TC008_Practice_Form";
     try{
        String[] datosCorrectosCP008 = datosCsv().get(12);
        String[] datosErroneosCP008 = datosCsv().get(13);

        driver.get("https://demoqa.com");
        System.out.println("Se abre la página DemoQA" + "\n");          

        WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.forms")));
        menu.click();
        Thread.sleep(100);
        System.out.println("Se abre el apartado Forms" + "\n");

        WebElement form = driver.findElement(By.xpath(propiedades.getProperty("forms.form")));
        form.click();
        Thread.sleep(100);
        System.out.println("Se abre el apartado Practice Form" + "\n");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 444);");  
        Thread.sleep(100);

        driver.findElement(By.xpath(propiedades.getProperty("form.firstname"))).sendKeys(datosCorrectosCP008[0]);
        Thread.sleep(100);
        System.out.println("Se rellena el campo First Name" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.lastname"))).sendKeys(datosCorrectosCP008[1]);
        Thread.sleep(100);
        System.out.println("Se rellena el campo Last Name" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.email"))).sendKeys(datosErroneosCP008[2]);
        Thread.sleep(100);
        System.out.println("Se rellena el campo Email" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.gender"))).click();
        Thread.sleep(100);
        System.out.println("El botón Male se selecciona" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.mobile"))).sendKeys(datosErroneosCP008[3]);
        Thread.sleep(100);
        System.out.println("Se rellena el campo Mobile" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.birth"))).click();
        Thread.sleep(100);
        System.out.println("Se abre un calendario" + "\n");

        WebElement mes = driver.findElement(By.xpath(propiedades.getProperty("form.mes")));
        Select mesSelect = new Select(mes);
        mesSelect.selectByVisibleText("April");
        Thread.sleep(100);

        WebElement año = driver.findElement(By.xpath(propiedades.getProperty("form.year")));
        Select añoSelect = new Select(año);
        añoSelect.selectByVisibleText("2023");
        Thread.sleep(100);

        driver.findElement(By.xpath(propiedades.getProperty("form.date"))).click();
        Thread.sleep(100);
        System.out.println("Se selecciona la fecha" + "\n");

        WebElement subject = driver.findElement(By.xpath(propiedades.getProperty("form.subjects")));
        subject.sendKeys(datosCorrectosCP008[4]);
        subject.sendKeys(Keys.ENTER);
        Thread.sleep(100);
        System.out.println("Se añade Maths al campo" + "\n");

        WebElement subject2 = driver.findElement(By.xpath(propiedades.getProperty("form.subjects")));
        subject2.sendKeys(datosCorrectosCP008[5]);
        subject2.sendKeys(Keys.ENTER);
        Thread.sleep(100);
        System.out.println("Se añade Arts al campo" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.subjectsb"))).click();
        Thread.sleep(100);
        System.out.println("Se borra todo" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.sports"))).click();
        Thread.sleep(100);
        System.out.println("El botón Sports se selecciona" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.reading"))).click();
        Thread.sleep(100);
        System.out.println("El botón Reading se selecciona" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.music"))).click();
        Thread.sleep(100);
        System.out.println("El botón Music se selecciona" + "\n");

        WebElement upload = driver.findElement(By.id("uploadPicture"));
        upload.sendKeys(datosCorrectosCP008[9]);
        Thread.sleep(100);
        System.out.println("Se sube el archivo" + "\n");
        
        driver.findElement(By.xpath(propiedades.getProperty("form.address"))).sendKeys(datosCorrectosCP008[6]);
        Thread.sleep(100);

        WebElement state = driver.findElement(By.xpath(propiedades.getProperty("form.state")));
        state.sendKeys(datosCorrectosCP008[7]);
        state.sendKeys(Keys.ENTER);
        Thread.sleep(100);
        System.out.println("El estado queda seleccionado en el menu" + "\n");

        WebElement city = driver.findElement(By.xpath(propiedades.getProperty("form.city")));
        city.sendKeys(datosCorrectosCP008[8]);
        city.sendKeys(Keys.ENTER);
        Thread.sleep(100);
        System.out.println("La ciudad queda seleccionada en el menu" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.submit"))).click();
        Thread.sleep(100);
        System.out.println("Nos da error en el campo Email y en el campo Mobile" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.email"))).clear();
        Thread.sleep(100);

        driver.findElement(By.xpath(propiedades.getProperty("form.email"))).sendKeys(datosCorrectosCP008[2]);
        Thread.sleep(100);
        System.out.println("Se rellena el campo Email" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.mobile"))).clear();
        Thread.sleep(100);

        driver.findElement(By.xpath(propiedades.getProperty("form.mobile"))).sendKeys(datosCorrectosCP008[3]);
        Thread.sleep(100);
        System.out.println("Se rellena el campo Mobile" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("form.submit"))).click();
        Thread.sleep(100);
        System.out.println("Nos sale el mensaje Thanks for submitting the form y nos da un esquema con los datos que le hemos proporcionado anteriormente" + "\n");

        System.out.println(driver.findElement(By.xpath(propiedades.getProperty("form.result"))).getText());

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP008\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP008\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP008\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP008\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP008\\IdNulo.png"));
            
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