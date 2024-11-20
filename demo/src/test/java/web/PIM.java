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


public class PIM extends Main {


    @Test(description = "Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    public void ORN_TC001() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC001";
         try{

            String[] datosCorrectosCP01 = datosCsv().get(2);

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            System.out.println("Se abre la página OrangeHRM" + "\n");    
            Thread.sleep(5000);

            driver.findElement(By.xpath(propiedades.getProperty("login.username"))).sendKeys(datosCorrectosCP01[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("login.password"))).sendKeys(datosCorrectosCP01[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("login.login"))).click();
            Thread.sleep(3000);
            System.out.println("Entramos a la página" + "\n");

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
        }
    }
    @Test(description = "PIM I")
    @Story("Seccion PIM")
    @Description("El objetivo es comprobar que los diferentes elementos de la seccion \"PIM\" se muestren de manera correcta ")
    public void ORN_TC002() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC002";
         try{

            ORN_TC001();

            driver.findElement(By.xpath(propiedades.getProperty("pim.pim"))).click();
            Thread.sleep(1000);

            System.out.println("Cargan los siguientes elementos: Configuration, Employee List, Add Employee, Reports");

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
            
        }
    }
    @Test(description = "PIM II")
    @Story(" Crear un nuevo empleado")
    @Description("El objetivo es comprobar que se puedan crear nuevos empleados de forma exitosa")
    public void ORN_TC003() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC003";
         try{

            String[] datosCorrectosCP03 = datosCsv().get(6);

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            System.out.println("Se abre la página OrangeHRM" + "\n");    
            Thread.sleep(1000);

            ORN_TC002();

            driver.findElement(By.xpath(propiedades.getProperty("pim.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.firstname"))).sendKeys(datosCorrectosCP03[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.middlename"))).sendKeys(datosCorrectosCP03[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.lastname"))).sendKeys(datosCorrectosCP03[2]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.employeeid"))).sendKeys(datosCorrectosCP03[3]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.save"))).click();
            Thread.sleep(10000);


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
    @Test(description = "PIM III")
    @Story("Buscar un empleado existente ")
    @Description("El objetivo consiste en probar el correcto funcionamiento del buscador de empleados existentes desde el modulo de \"PIM\"")
    public void ORN_TC004() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC004";
         try{

            String[] datosCorrectosCP04 = datosCsv().get(10);

            ORN_TC002();

            driver.findElement(By.xpath(propiedades.getProperty("pim.employeelist"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.employeeid"))).sendKeys(datosCorrectosCP04[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.search"))).click();
            Thread.sleep(1000);



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
            
        }
    }
    @Test(description = "PIM IV")
    @Story("Editar la información de un empleado")
    @Description("El objetivo consiste en buscar a un empleado y editar la informacion correspondiente del usuario")
    public void ORN_TC005() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC005";
         try{

            String[] datosCorrectosCP05 = datosCsv().get(14);

            ORN_TC004();

            driver.findElement(By.xpath(propiedades.getProperty("pim.edit"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.firstname"))).sendKeys(datosCorrectosCP05[0]);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 111);");  
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("pim.save"))).click();
            Thread.sleep(1000);


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
    @Test(description = "PIM V")
    @Story("Eliminar un empleado")
    @Description("El objetivo consiste en buscar a un empleado y Eliminarlo")
    public void ORN_TC006() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC006";
         try{

            ORN_TC004();

            driver.findElement(By.xpath(propiedades.getProperty("pim.delete"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("pim.yesdelete"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Leave I")
    @Story("Sesion Leave")
    @Description("El objetivo es comprobar que los diferentes elementos de la seccion \"Leave\" se muestren de manera correcta")
    public void ORN_TC007() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC007";
         try{

            ORN_TC001();

            driver.findElement(By.xpath(propiedades.getProperty("leave.leave"))).click();
            Thread.sleep(1000);

            System.out.println("Cargan los siguientes elementos: Leave List, Assing Leave, Configure, Reports, Entitlements, My Leave, Apply \n");

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
            //driver.quit();
            
        }
    }    
    @Test(description = "Leave II")
    @Story("Solicitar un permiso")
    @Description("El objetivo es comprobar que las solicitudes de permiso queden registradas correctamente")
    public void ORN_TC008() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC008";
         try{

            String[] datosCorrectosCP08 = datosCsv().get(18);

            ORN_TC007();

            driver.findElement(By.xpath(propiedades.getProperty("leave.apply"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetype"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetype"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.fromdate"))).sendKeys(datosCorrectosCP08[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.todate"))).sendKeys(datosCorrectosCP08[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.duration"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.duration"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.bapply"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Leave III")
    @Story("Cancelar un permiso")
    @Description("El objetivo es comprobar se pueda cancelar los permisos solicitados")
    public void ORN_TC009() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC009";
         try{

            ORN_TC007();

            driver.findElement(By.xpath(propiedades.getProperty("leave.trespuntos"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.cancelleave"))).click();
            Thread.sleep(1000);


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
    @Test(description = "Leave IV")
    @Story("Agregar derechos de permiso")
    @Description("El Objetivo es asignar derechos de permisos de dias fuera a un empleado en especifico")
    public void ORN_TC010() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC010";
         try{

            String[] datosCorrectosCP10 = datosCsv().get(22);

            ORN_TC007();

            driver.findElement(By.xpath(propiedades.getProperty("leave.entitlements"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.addentitlements"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.employeename"))).sendKeys(datosCorrectosCP10[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetype"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetype"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetype"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.entitlement"))).sendKeys(datosCorrectosCP10[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.save"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Leave V")
    @Story("Solicitar un permiso sin llenar todos los campos obligatorios")
    @Description("El objetivo es validar la obligatoriedad de cada uno de los campos obligatorios para solicitar un permiso de dias ")
    public void ORN_TC011() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC011";
         try{

            ORN_TC007();

            driver.findElement(By.xpath(propiedades.getProperty("leave.apply"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.bapply"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Leave VI")
    @Story("Agregar nuevo tipo de Permiso")
    @Description("El objetivo es validar la funcionalidad para agregar nuevos tipo de causa para pedir permisos")
    public void ORN_TC012() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC012";
         try{

            String[] datosCorrectosCP12 = datosCsv().get(26);


            ORN_TC007();

            driver.findElement(By.xpath(propiedades.getProperty("leave.configure"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetypes"))).click();
            Thread.sleep(1000);
            
            driver.findElement(By.xpath(propiedades.getProperty("leave.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.name"))).sendKeys(datosCorrectosCP12[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.save"))).click();
            Thread.sleep(1000);

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
            //driver.quit();
            
        }
    }   
    @Test(description = "Leave VII")
    @Story("Asignar un permiso a un empleado")
    @Description("El objetivo es validar la funcionalidad para asignarle dias de permiso a un empleado en especifico")
    public void ORN_TC013() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC013";
         try{

            String[] datosCorrectosCP13 = datosCsv().get(26);


            ORN_TC007();

            driver.findElement(By.xpath(propiedades.getProperty("leave.assignleave"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.employeename"))).sendKeys(datosCorrectosCP13[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetype"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetype"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetype"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.fromdate"))).sendKeys(datosCorrectosCP13[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.todate"))).sendKeys(datosCorrectosCP13[2]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.assign"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Leave VIII")
    @Story("Editar un tipo de permiso")
    @Description("El objetivo es validar la funcionalidad para agregar nuevos tipo de causa para pedir permisos")
    public void ORN_TC014() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC014";
         try{

            ORN_TC012();

            driver.findElement(By.xpath(propiedades.getProperty("leave.configure"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.leavetypes"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.delete"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("leave.yesdelete"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Recruitment I")
    @Story("Sección Reclutamiento")
    @Description("El objetivo es validar la sección de reclutamiento")
    public void ORN_TC015() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC015";
         try{

            ORN_TC001();

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.recruitment"))).click();
            Thread.sleep(1000);

            System.out.println("Cargan los siguientes elementos: Candidates, Vacancies, +Add, Reset, y Search");


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
            // driver.quit();
            
        }
    }        
    @Test(description = "Recruitment II")
    @Story("Agregar un nuevo candidato")
    @Description("El objetivo es validar la funcionalidad para agregar un nuevo candidato")
    public void ORN_TC016() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC016";
         try{

            String[] datosCorrectosCP16 = datosCsv().get(34);


            ORN_TC015();

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.firstname"))).sendKeys(datosCorrectosCP16[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.middlename"))).sendKeys(datosCorrectosCP16[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.lastname"))).sendKeys(datosCorrectosCP16[2]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.vacancy"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.vacancy"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.email"))).sendKeys(datosCorrectosCP16[3]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.save"))).click();
            Thread.sleep(1000);


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
    @Test(description = "Recruitment III")
    @Story("Agregar una nueva vacante")
    @Description("Agregar una nueva vacante")
    public void ORN_TC017() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC017";
         try{

            String[] datosCorrectosCP17 = datosCsv().get(38);


            ORN_TC015();

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.vacancies"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.vacancyname"))).sendKeys(datosCorrectosCP17[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.jobtitle"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.jobtitle"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.hiringmanager"))).sendKeys(datosCorrectosCP17[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("recruitment.save"))).click();
            Thread.sleep(1000);


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
    @Test(description = "My Info I")
    @Story("Sección My Info")
    @Description("El objetivo  es validar que la sección de My Info Cargue con los elementos correspondientes")
    public void ORN_TC018() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC018";
         try{

            ORN_TC001();

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.myinfo"))).click();
            Thread.sleep(1000);

            System.out.println(" Cargar los siguientes elementos: Personal Details, Contact Details, Emergency Contacts, Dependets,Immigration, Job, Salary, Report to, Qualifications, Memberships");

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
           //driver.quit();
            
        }
    }        
    @Test(description = "My Info II")
    @Story("Sección My Info")
    @Description("El objetivo  es validar que la sección de My Info Cargue con los elementos correspondientes")
    public void ORN_TC019() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC019";
         try{

            String[] datosCorrectosCP19 = datosCsv().get(42);

            ORN_TC018();

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.firstname"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.firstname"))).sendKeys(Keys.BACK_SPACE.toString().repeat(20));
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.middlename"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.middlename"))).sendKeys(Keys.BACK_SPACE.toString().repeat(20));
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.lastname"))).click();
            Thread.sleep(1000);
            
            driver.findElement(By.xpath(propiedades.getProperty("myinfo.lastname"))).sendKeys(Keys.BACK_SPACE.toString().repeat(20));
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.employeeid"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.employeeid"))).sendKeys(Keys.BACK_SPACE.toString().repeat(20));
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.firstname"))).sendKeys(datosCorrectosCP19[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.middlename"))).sendKeys(datosCorrectosCP19[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.lastname"))).sendKeys(datosCorrectosCP19[2]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.employeeid"))).sendKeys(datosCorrectosCP19[3]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.save"))).click();
            Thread.sleep(1000);

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
    @Test(description = "My Info III")
    @Story("Agregar una nueva experiencia laboral")
    @Description("El objetivo  es validar la funcionalidad de agregar una nueva experiencia laboral")
    public void ORN_TC020() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC020";
         try{

            String[] datosCorrectosCP20 = datosCsv().get(46);

            ORN_TC018();

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.qualifications"))).click();
            Thread.sleep(1000);
            
            driver.findElement(By.xpath(propiedades.getProperty("myinfo.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.company"))).sendKeys(datosCorrectosCP20[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.jobtitle"))).sendKeys(datosCorrectosCP20[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("myinfo.save2"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Performance I")
    @Story("Sección Performance")
    @Description("El objetivo  es validar que la sección de Performance Cargue con los elementos correspondientes")
    public void ORN_TC021() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC021";
         try{

            ORN_TC001();

            driver.findElement(By.xpath(propiedades.getProperty("performance.performance"))).click();
            Thread.sleep(1000);

            System.out.println("Cargan los siguientes elementos: Configure, Manage Reviews, My Trackers, Employee Trackers");

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
            //driver.quit();
            
        }
    }        
    @Test(description = "Performance II")
    @Story("Agregar un nuevo seguidor de desempeño ")
    @Description("El objetivo  es validar la funcionalidad de agregar un seguidor de desempeño a un empleado")
    public void ORN_TC022() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC022";
         try{

            String[] datosCorrectosCP20 = datosCsv().get(50);

            ORN_TC021();

            driver.findElement(By.xpath(propiedades.getProperty("performance.configure"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.trackers"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.trackername"))).sendKeys(datosCorrectosCP20[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.employeename"))).sendKeys(datosCorrectosCP20[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.reviewers"))).sendKeys(datosCorrectosCP20[2]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.save"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Performance III")
    @Story(" Intentar Agregar un nuevo seguidor de desempeño sin llenar todos los campos")
    @Description("El objetivo  es validar que para agregar un nuevo seguidor de desempeño se diligencien todos los datos de forma correcta")
    public void ORN_TC023() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC023";
         try{

            ORN_TC021();

            driver.findElement(By.xpath(propiedades.getProperty("performance.configure"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.trackers"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.save"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Performance IV")
    @Story(" Agregar un nuevo indicador clave de desempeño")
    @Description("El objetivo  es validar la funcionalidad para agregar un indicador de desempeño")
    public void ORN_TC024() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC024";
         try{

            String[] datosCorrectosCP24 = datosCsv().get(54);

            ORN_TC021();

            driver.findElement(By.xpath(propiedades.getProperty("performance.configure"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.kpis"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.keyperformance"))).sendKeys(datosCorrectosCP24[0]);
            Thread.sleep(1000);
            
            driver.findElement(By.xpath(propiedades.getProperty("performance.jobtitle"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.jobtitle"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.save"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Performance V")
    @Story("Intentar  Agregar un nuevo indicador clave de desempeño sin llenar los campos obligatorios")
    @Description("El objetivo  es validar que para poder crear un neuvo indicador se deban llenar los campos obligatorios")
    public void ORN_TC025() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC025";
         try{

            ORN_TC021();

            driver.findElement(By.xpath(propiedades.getProperty("performance.configure"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.kpis"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.save"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Performance V")
    @Story("Realizar una Review")
    @Description("El objetivo  es validar la funcionalidad para realizar una review a un empleado")
    public void ORN_TC026() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC026";
         try{

            String[] datosCorrectosCP26 = datosCsv().get(58);

            ORN_TC021();

            driver.findElement(By.xpath(propiedades.getProperty("performance.managereviews"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.myreviews"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.evaluate"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.rating1"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.rating2"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.rating3"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);
            
            driver.findElement(By.xpath(propiedades.getProperty("performance.rating4"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.rating5"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.save3"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Performance V")
    @Story("Realizar una Review")
    @Description("El objetivo  es validar la funcionalidad para realizar una review a un empleado")
    public void ORN_TC027() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC027";
         try{

            String[] datosCorrectosCP26 = datosCsv().get(58);

            ORN_TC021();

            driver.findElement(By.xpath(propiedades.getProperty("performance.managereviews"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.myreviews"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.evaluate"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.rating1"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.rating2"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.rating3"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);
            
            driver.findElement(By.xpath(propiedades.getProperty("performance.rating4"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.rating5"))).sendKeys(datosCorrectosCP26[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("performance.save3"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Claim I")
    @Story("Validar elementos de la sección Claim")
    @Description("El objetivo  es validar los elementos que se deben mostrar en la sección Claim")
    public void ORN_TC028() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC028";
         try{

            ORN_TC001();

            driver.findElement(By.xpath(propiedades.getProperty("claim.claim"))).click();
            Thread.sleep(1000);

            System.out.println("Aparecen los siguientes elementos: Assign Claim, Employee Claims, My CLaims, Submit Claim, Configuration y botones.");


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
            // driver.quit();
            
        }
    }                
    @Test(description = "Claim II")
    @Story("Validar elementos de la sección Claim")
    @Description("El objetivo  es validar los elementos que se deben mostrar en la sección Claim")
    public void ORN_TC029() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC029";
         try{

            String[] datosCorrectosCP29 = datosCsv().get(62);

            ORN_TC028();

            driver.findElement(By.xpath(propiedades.getProperty("claim.assignclaim"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.employeename"))).sendKeys(datosCorrectosCP29[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.event"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.event"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.currency"))).sendKeys(Keys.DOWN);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.currency"))).sendKeys(Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.create"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Claim II")
    @Story("Validar elementos de la sección Claim")
    @Description("El objetivo  es validar los elementos que se deben mostrar en la sección Claim")
    public void ORN_TC030() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC030";
         try{

            ORN_TC028();

            driver.findElement(By.xpath(propiedades.getProperty("claim.configuration"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.events"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.save"))).click();
            Thread.sleep(1000);

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
    @Test(description = "Claim III")
    @Story("Validar elementos de la sección Claim")
    @Description("El objetivo  es validar los elementos que se deben mostrar en la sección Claim")
    public void ORN_TC031() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC031";
         try{

            String[] datosCorrectosCP31 = datosCsv().get(66);

            ORN_TC028();

            driver.findElement(By.xpath(propiedades.getProperty("claim.configuration"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.events"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.eventname"))).sendKeys(datosCorrectosCP31[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.description"))).sendKeys(datosCorrectosCP31[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.save"))).click();
            Thread.sleep(5000);

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
    @Test(description = "Claim I")
    @Story("Validar elementos de la sección Claim")
    @Description("El objetivo  es validar los elementos que se deben mostrar en la sección Claim")
    public void ORN_TC032() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC032";
         try{

            String[] datosCorrectosCP31 = datosCsv().get(66);

            ORN_TC028();

            driver.findElement(By.xpath(propiedades.getProperty("claim.configuration"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.expensetypes"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.add"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.name"))).sendKeys(datosCorrectosCP31[0]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.description"))).sendKeys(datosCorrectosCP31[1]);
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.save"))).click();
            Thread.sleep(5000);

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
    @Test(description = "Claim I")
    @Story("Validar elementos de la sección Claim")
    @Description("El objetivo  es validar los elementos que se deben mostrar en la sección Claim")
    public void ORN_TC033() throws InterruptedException, IOException, CsvException {
        testId = "ORN_TC033";
         try{

            ORN_TC028();

            driver.findElement(By.xpath(propiedades.getProperty("claim.myclaims"))).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(propiedades.getProperty("claim.viewdetails"))).click();
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("claim.cancel"))).click();
            Thread.sleep(1000);

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
    public List<String[]> datosCsv() throws IOException, CsvException{
        String file = "C:\\Users\\ricard.ferrando.ext\\OneDrive - GFI\\Documentos\\Orange Testing\\Orange\\demo\\datos.csv";

        CSVReader reader = new CSVReader(new FileReader(file));
        List<String[]> listDatos = reader.readAll();
        reader.close();
        return listDatos;
    }
    
}
