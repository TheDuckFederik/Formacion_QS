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

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class PIM extends Main{

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void Log_TC01() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "Log_TC01s";
    try {


        driver.findElement(By.xpath(propiedades.getProperty("login.user"))).sendKeys(reader.dato("Login", "Usuario"));
        Thread.sleep(1500);
        driver.findElement(By.xpath(propiedades.getProperty("login.password"))).sendKeys(reader.dato("Login", "Contraseña"));
        Thread.sleep(1500);
        driver.findElement(By.xpath(propiedades.getProperty("login.login"))).click();
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
    @Story("Elements")
    @Description("Rellenar textbox")
    public void PIM_TC01() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "PIM_TC01";

        //CASO DE Prueba 001
        try{
            //Iniciamos Session

            Log_TC01();
            //Entramos en PIM

            driver.findElement(By.xpath(propiedades.getProperty("PIM.enter"))).click();
            Thread.sleep(1500);
            //Hacer click en + Add
            driver.findElement(By.xpath(propiedades.getProperty("PIM.Add"))).click();
            Thread.sleep(1500);
            //Rellenar el campo FirstName
            driver.findElement(By.xpath(propiedades.getProperty("PIM.FirstName"))).sendKeys(reader.dato("PIM", "firstName"));
            Thread.sleep(1500);
            //Rellenar el campo MiddleName
            driver.findElement(By.xpath(propiedades.getProperty("PIM.MidleName"))).sendKeys(reader.dato("PIM", "middleName"));
            Thread.sleep(1500);
            //Rellenar el campo lastName
            driver.findElement(By.xpath(propiedades.getProperty("PIM.LastName"))).sendKeys(reader.dato("PIM", "lastName"));
            Thread.sleep(1500);
            //Rellenar EmployeeID
            driver.findElement(By.xpath(propiedades.getProperty("PIM.EmployeeID"))).sendKeys(reader.dato("PIM", "employeeID"));
            Thread.sleep(1500);
            //Hacer click en Create Login Details
            driver.findElement(By.xpath(propiedades.getProperty("PIM.CreateLoginDetails"))).click();
            Thread.sleep(1500);
            //Rellenar el campo Username
            driver.findElement(By.xpath(propiedades.getProperty("PIM.Username"))).sendKeys(reader.dato("PIM", "Username"));
            Thread.sleep(1500);

            //Rellenar el campo Password
            driver.findElement(By.xpath(propiedades.getProperty("PIM.Password"))).sendKeys(reader.dato("PIM", "Password"));
            Thread.sleep(1500);

            //Rellena el campo Confirm Password.
            driver.findElement(By.xpath(propiedades.getProperty("PIM.ConfirmPassword"))).sendKeys(reader.dato("PIM", "Password"));
            Thread.sleep(1500);

            //Hacer click en Save
            driver.findElement(By.xpath(propiedades.getProperty("PIM.Submit"))).click();
            Thread.sleep(5000);


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
            } finally{
            driver.quit();
            }
    }

    
    @Attachment(value = "{imageName}", type = "image/png")
    public byte[] attachImage(String imageName, byte[] imageBytes) {
        return imageBytes;  // Retorna la imagen como un arreglo de bytes para que Allure la adjunte
    }

}
