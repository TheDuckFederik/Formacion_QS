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


public class Leave extends Main {

    @Test(description = "Alinear jugadores Comunio")
    @Story("Alineación")
    @Description("Alinear jugadores")
    public void Alinear() throws InterruptedException, IOException, CsvException {
        testId = "Alinear";
         try{

            driver.get("https://www.comunio.es/");
            System.out.println("Se abre la página Comunio" + "\n");    
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("aceptar"))).click();
            Thread.sleep(100);
            System.out.println("Se aceptan las galletas" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("nombreusuario"))).sendKeys("RFP44");
            driver.findElement(By.xpath(propiedades.getProperty("contrasena"))).sendKeys("Ricard10.");


        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP001\\NullXpath.png"));

        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP001\\InterceptedButton.png"));

        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP001\\TextoNulo.png")); 

        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP001\\AcciónInvalida.png"));

        } finally{
            driver.quit();
            
        }
    }
}
