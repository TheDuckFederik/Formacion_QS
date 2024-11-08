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

public class PIM extends Main{

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Login")
    @Description("Ingreso a la web de Orange")
    public void ORN_TC001() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC001";
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
    @Story("PIM")
    @Description("Hacer click en PIM")
    public void ORN_TC002() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC002";

        //CASO DE Prueba 001
        try{
            //Iniciamos Session
            ORN_TC001();

            //Entramos en PIM
            driver.findElement(By.xpath(propiedades.getProperty("PIM.enter"))).click();
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
            } catch (ArrayIndexOutOfBoundsException e){
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
    @Story("PIM")
    @Description("Crear un nuevo empleado")
    public void ORN_TC003() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC003";

        try{
            ORN_TC001();
            ORN_TC002();

            //   - Click en el botón"Add Employee"
                driver.findElement(By.xpath(propiedades.getProperty("PIM.Add"))).click();
                Thread.sleep(1500);
            // - Completar los campos obligatorios (First Name, Last Name, Employee ID)   - Click en el botón"Save"

                driver.findElement(By.xpath(propiedades.getProperty("PIM.FirstName"))).sendKeys(reader.dato("PIM", "firstName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("PIM.MidleName"))).sendKeys(reader.dato("PIM", "middleName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("PIM.LastName"))).sendKeys(reader.dato("PIM", "lastName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("PIM.EmployeeID"))).sendKeys(reader.dato("PIM", "employeeID"));
                Thread.sleep(1500);

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
            } catch (ArrayIndexOutOfBoundsException e){
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
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("PIM")
    @Description("Buscar un empleado existente ")
    public void ORN_TC004() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "PIM_TC02";

        try{
            ORN_TC001();
            ORN_TC002();

                // "Click en el campo de Employee Id
                // - Ingresar en el campo un Id de un empleado existente
                    driver.findElement(By.xpath(propiedades.getProperty("PIM.EmployeeID"))).sendKeys(reader.dato("PIM", "employeeID"));
                    Thread.sleep(1500);
                // - Click en el botón ""Search"""
                    driver.findElement(By.xpath(propiedades.getProperty("PIM.Search"))).click();
                    Thread.sleep(2000);

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
            } catch (ArrayIndexOutOfBoundsException e){
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
    @Story("PIM")
    @Description("Editar la información de un empleado")
    public void ORN_TC005() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC005";

        try{
            ORN_TC004();

            // - Click en el icono de lapiz correspondiente a la accion de editar
                driver.findElement(By.xpath(propiedades.getProperty("PIM.Lapiz"))).click();
                Thread.sleep(5000);
            // - Editar los campos del  "Employee Full Name"
            // - Click en Save 
                driver.findElement(By.xpath(propiedades.getProperty("PIM.FirstName"))).sendKeys(reader.dato("PIM", "firstName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("PIM.MidleName"))).sendKeys(reader.dato("PIM", "middleName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("PIM.LastName"))).sendKeys(reader.dato("PIM", "lastName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("PIM.Save"))).click();
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
            } catch (ArrayIndexOutOfBoundsException e){
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

        @Test(description = "Prueba DemoQA Elements Text box")
    @Story("PIM")
    @Description("Eliminar un Empleado")
    public void ORN_TC006() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC006";

        try{
            ORN_TC004();

            // - Click en el icono de papelera correspondiente a la acción de "Eliminar"
                driver.findElement(By.xpath(propiedades.getProperty("PIM.Delete"))).click();
                Thread.sleep(1500);
            // - Click en "Yes Delete 
                driver.findElement(By.xpath(propiedades.getProperty("PIM.DeleteConfirm"))).click();


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
            } catch (ArrayIndexOutOfBoundsException e){
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
}
