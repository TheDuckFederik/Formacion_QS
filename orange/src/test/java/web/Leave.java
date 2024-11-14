package web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
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

            WebElement leaveType = driver.findElement(By.xpath(propiedades.getProperty("LEAVE.LeaveType")));    
            leaveType.click();
            Thread.sleep(1500);
            leaveType.sendKeys(Keys.DOWN);
            Thread.sleep(1500);
            leaveType.sendKeys(Keys.ENTER);
            Thread.sleep(1500);

            driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ToDate"))).sendKeys(reader.dato("LEAVE", "ToDate"));
            Thread.sleep(1500);
            driver.findElement(By.xpath(propiedades.getProperty("LEAVE.FromDate"))).sendKeys(reader.dato("LEAVE", "FromDate"));
            Thread.sleep(1500);
            leaveType.click();

           WebElement partialDays = driver.findElement(By.xpath(propiedades.getProperty("LEAVE.PartialDays")));
           partialDays.click();
           Thread.sleep(1500);
           partialDays.sendKeys(Keys.DOWN);
           Thread.sleep(1500);
           partialDays.sendKeys(Keys.DOWN);
           Thread.sleep(1500);
           partialDays.sendKeys(Keys.ENTER);

           WebElement startDay = driver.findElement(By.xpath(propiedades.getProperty("LEAVE.StartDay")));
           leaveType.click();
           startDay.click();
           Thread.sleep(1500);
           startDay.sendKeys(Keys.DOWN);
           Thread.sleep(1500);
           startDay.sendKeys(Keys.ENTER);

           driver.findElement(By.xpath(propiedades.getProperty("LEAVE.SubmitApply"))).click();
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
    @Description("Cancelar un permiso")
    public void ORN_TC009() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC009";
    try {
        ORN_TC007();

        // Seleccionar en uno de los permisos encontrados y darle click en el botón de cancelar
        driver.findElement(By.xpath(propiedades.getProperty("Leave.LeaveAction"))).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(propiedades.getProperty("Leave.LeaveCancel"))).click();
        Thread.sleep(1500);
        // Click en el botón de ""Yes, Confirm


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
    @Description("Agregar derechos de permiso")
    public void ORN_TC010() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC010";
    try {
        ORN_TC007();

        // Click en la sección de Entitlements
        driver.findElement(By.xpath(propiedades.getProperty("Leave.Entitlements"))).click();
        Thread.sleep(1500);
        // Click en ""Add Entitlements
        driver.findElement(By.xpath(propiedades.getProperty("Leave.AddEntitlements"))).click();
        Thread.sleep(1500);
        // Se debe de llenar la informacion requeriada como el nombre del empleado el tipo de permiso el periodo y los dias de permiso que se daran
        WebElement name =driver.findElement(By.xpath(propiedades.getProperty("Leave.AddEntitlementsName")));
        name.sendKeys(reader.dato("LEAVE", "AddEntitlementName"));
        Thread.sleep(2000);
        name.sendKeys(Keys.DOWN);
        name.sendKeys(Keys.ENTER);
        Thread.sleep(1500);

        WebElement partialDays = driver.findElement(By.xpath(propiedades.getProperty("LEAVE.LeaveType")));
        partialDays.click();
        Thread.sleep(1500);
        partialDays.sendKeys(Keys.DOWN);
        Thread.sleep(1500);
        partialDays.sendKeys(Keys.DOWN);
        Thread.sleep(1500);
        partialDays.sendKeys(Keys.ENTER);

        WebElement startDay = driver.findElement(By.xpath(propiedades.getProperty("LEAVE.LeavePeriod")));
        startDay.click();
        Thread.sleep(1500);
        startDay.sendKeys(Keys.DOWN);
        Thread.sleep(1500);
        startDay.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(propiedades.getProperty("Leave.AddEntitlement"))).sendKeys(reader.dato("LEAVE", "AddEntitlement"));
        Thread.sleep(1500);
        // Click en el botón Save
        driver.findElement(By.xpath(propiedades.getProperty("Leave.AddEntitlementSubmit"))).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(propiedades.getProperty("LEAVE.AddEntitlementConfirm"))).click();
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

    @Test(description = "El objetivo es validar la obligatoriedad de cada uno de los campos obligatorios para solicitar un permiso de dias")
    @Story("LEAVE")
    @Description("Solicitar un permiso sin llenar todos los campos obligatorios")
    public void ORN_TC011() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC011";
    try {
        ORN_TC007();

            // Click en la sección de Apply
            driver.findElement(By.xpath(propiedades.getProperty("LEAVE.Apply"))).click();
            Thread.sleep(1500);

            // Dar click en el botón de Apply sin llenar ningun campo

            driver.findElement(By.xpath(propiedades.getProperty("LEAVE.SubmitApply"))).click();
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

    @Test(description = "El objetivo es validar la funcionalidad para agregar nuevos tipo de causa para pedir permisos")
    @Story("LEAVE")
    @Description("Agregar nuevo tipo de Permiso")
    public void ORN_TC012() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC012";
    try {
        ORN_TC007();

            // Click en la sección de ""Configure""
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.Configure"))).click();
                Thread.sleep(1500);
            // "- Dar click en la opcion de ""Leave Types""
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ConfigureLeaveType"))).click();
                Thread.sleep(1500);
            // "- Dar click en el botón de ""+ Add""
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ConfigureLEaveTypeAdd"))).click();
                Thread.sleep(1500);
            // "- Digitar un nombre para el nuevo tipo de permiso en el campo de Name, seleccionar la opcion de Yes o de No en el apartado de si es situacional, dar click en el Botón Save
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ConfigureLEaveTypeAddName"))).sendKeys(reader.dato("LEAVE", "LeaveTypeName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ConfigureLEaveTypeAddButtonYes"))).click();
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ConfigureLEaveTypeAddSave"))).click();
                Thread.sleep(7000);

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

    @Test(description = "El objetivo es validar la funcionalidad para asignarle dias de permiso a un empleado en especifico")
    @Story("LEAVE")
    @Description("Asignar un permiso a un empleado")
    public void ORN_TC013() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC013";
    try {
        ORN_TC007();

            //"- Click en la sección de ""Assign Leave""

                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.AssignLeave"))).click();
                Thread.sleep(1500);

            // "- Llenar todos los datos obligatorios y escribir un comentario     

            WebElement name =driver.findElement(By.xpath(propiedades.getProperty("LEAVE.AssignLeaveName")));
            name.sendKeys(reader.dato("LEAVE", "AssignLeaveName"));
            Thread.sleep(2000);
            name.sendKeys(Keys.DOWN);
            name.sendKeys(Keys.ENTER);
            Thread.sleep(1500);

            WebElement leaveType =driver.findElement(By.xpath(propiedades.getProperty("LEAVE.AssignLeaveLeaveType")));
            leaveType.click();
            Thread.sleep(2000);
            leaveType.sendKeys(Keys.DOWN);
            leaveType.sendKeys(Keys.ENTER);
            Thread.sleep(1500);

            driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ToDate"))).sendKeys(reader.dato("LEAVE", "ToDate"));
            Thread.sleep(1500);
            driver.findElement(By.xpath(propiedades.getProperty("LEAVE.FromDate"))).sendKeys(reader.dato("LEAVE", "FromDate"));
            Thread.sleep(1500);
            name.click();

            WebElement partialDays = driver.findElement(By.xpath(propiedades.getProperty("LEAVE.AssignLeavePartialDays")));
            partialDays.click();
            partialDays.sendKeys(Keys.DOWN);
            partialDays.sendKeys(Keys.ENTER);
            Thread.sleep(1500);

            WebElement duration = driver.findElement(By.xpath(propiedades.getProperty("LEAVE.AssignLeaveDuration")));
            duration.click();
            duration.sendKeys(Keys.DOWN);
            duration.sendKeys(Keys.ENTER);
            Thread.sleep(1500);

            //- Click en el botón de ""Assign""

                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.AssignLeaveAssign"))).click();
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.AssignLeaveOk"))).click();
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

    @Test(description = "El objetivo es validar la funcionalidad de editar un tipo de permiso")
    @Story("LEAVE")
    @Description("Editar un tipo de permiso")
    public void ORN_TC014() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC014";
    try {
        ORN_TC012();

            //"- Click en uno de los tipos de permisos y en el boton con icono de lapiz correspondiente al editar
                WebElement editButton = driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ConfigureEditButton")));
                Thread.sleep(1500);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);
                Thread.sleep(1500); 
                editButton.click();
                Thread.sleep(1500);
            // "- Editar el nombre y click en Save
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ConfigureEditName"))).sendKeys(reader.dato("LEAVE", "LeaveTypeName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("LEAVE.ConfigureEditLEaveTypeAddSave"))).click();
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

}
