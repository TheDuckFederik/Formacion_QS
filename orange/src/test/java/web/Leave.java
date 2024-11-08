package web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Leave extends PIM{
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("LEAVE")
    @Description("Sesion Leave")
    public void ORN_TC007() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC007";
    try {
        ORN_TC001();
        // - Click en la sección de Leave
            driver.findElement(By.xpath(propiedades.getProperty("LEAVE.Enter"))).click();
            Thread.sleep(1500);
        


    } catch(IllegalArgumentException e){
        System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NullXpathKey.png"));
    } catch(ElementClickInterceptedException e){
        System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\ElementOnTop.png"));
    } catch (org.openqa.selenium.NoSuchElementException e){
        System.out.println("El ID o Xpath especificado no es correcto");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NullIdOrXpath.png"));
    } catch (WebDriverException e){
        System.out.println("La URL especificada no existe");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\URLError.png"));
    } 
    // catch (FileNotFoundException e){
    //     System.out.println("El archivo no esta bien especificado o no existe");
    //     e.printStackTrace();
    //     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //     FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NoFile.png"));
    // } 
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("El Array del Excel no contiene esa posición");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\ArrayExcel.png"));
    } catch (NullPointerException e){
        System.out.println("El Json no contiene esa clave o valor");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\JsonKeyValue.png"));
    } 
    
    }

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("LEAVE")
    @Description("Solicitar un permiso")
    public void ORN_TC008() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC008";
    try {
        ORN_TC007();

        // - Click en la sección de Apply
            driver.findElement(By.xpath(propiedades.getProperty("LEAVE.Apply"))).click();
            Thread.sleep(1500);
        // - Se selecciona un Leave Type, Una From Date y una To Date, selecciona una de las opciones de Partial Days y la Duration y da click en Apply
        


    } catch(IllegalArgumentException e){
        System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NullXpathKey.png"));
    } catch(ElementClickInterceptedException e){
        System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\ElementOnTop.png"));
    } catch (org.openqa.selenium.NoSuchElementException e){
        System.out.println("El ID o Xpath especificado no es correcto");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NullIdOrXpath.png"));
    } catch (WebDriverException e){
        System.out.println("La URL especificada no existe");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\URLError.png"));
    } 
    // catch (FileNotFoundException e){
    //     System.out.println("El archivo no esta bien especificado o no existe");
    //     e.printStackTrace();
    //     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //     FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NoFile.png"));
    // } 
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("El Array del Excel no contiene esa posición");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\ArrayExcel.png"));
    } catch (NullPointerException e){
        System.out.println("El Json no contiene esa clave o valor");
        e.printStackTrace();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\JsonKeyValue.png"));
    } 
    
    }
}
