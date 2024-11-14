package web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Performance extends  PIM{
    @Test(description = "El objetivo  es validar que la sección de \"Performance\" Cargue con los elementos correspondientes")
    @Story("PERFORMANCE")
    @Description("Sección \"Performance\"")
    public void ORN_TC021() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC021";
    try {
        ORN_TC001();

        // "- Click en la seccion de ""Performance""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.Enter"))).click();
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
    @Test(description = "El objetivo  es validar la funcionalidad de agregar un seguidor de desempeño a un empleado")
    @Story("PERFORMANCE")
    @Description(" Agregar un nuevo seguidor de desempeño")
    public void ORN_TC022() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC022";
    try {
        ORN_TC021();

        // "- Click en la seccion de ""Configure""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.Configure"))).click();
            Thread.sleep(1500);
        // - Click en la sección de ""Trackers""
             driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.ConfigureTrackers"))).click();
             Thread.sleep(1500);
        // "- Click en el boton de ""+Add""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.TrackersAdd"))).click();
            Thread.sleep(1500);
        // "- Llenar todos los campos

            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.TrackersAddTrackerName"))).sendKeys(reader.dato("PERFORMANCE", "trackerName"));

            WebElement employeeName = driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.TrackersAddEmployeeName")));
                employeeName.sendKeys(reader.dato("PERFORMANCE", "employeeName"));
                Thread.sleep(1500);
                employeeName.sendKeys(Keys.DOWN);
                Thread.sleep(1500);
                employeeName.sendKeys(Keys.ENTER);
                Thread.sleep(1500);
            WebElement reviewers = driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.TrackersAddReviewers")));
                reviewers.sendKeys(reader.dato("PERFORMANCE", "reviewers"));
                Thread.sleep(1500);
                reviewers.sendKeys(Keys.DOWN);
                Thread.sleep(1500);
                reviewers.sendKeys(Keys.ENTER);
                Thread.sleep(1500);

        // - Click en el botón ""Save""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.TrackersAddSave"))).click();
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
    } 
    
    }
    @Test(description = "El objetivo  es validar que para agregar un nuevo seguidor de desempeño se diligencien todos los datos de forma correcta")
    @Story("PERFORMANCE")
    @Description("Intentar Agregar un nuevo seguidor de desempeño sin llenar todos los campos")
    public void ORN_TC023() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC023";
    try {
        ORN_TC021();

        // "- Click en la seccion de ""Configure""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.Configure"))).click();
            Thread.sleep(1500);
        // - Click en la sección de ""Trackers""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.ConfigureTrackers"))).click();
            Thread.sleep(1500);
        // "- Click en el boton de ""+Add""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.TrackersAdd"))).click();
            Thread.sleep(1500);
        // "- Click en el botón ""Save"
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.TrackersAddSave"))).click();
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
    } 
    
    }
    @Test(description = "El objetivo  es validar la funcionalidad para agregar un indicador de desempeño")
    @Story("PERFORMANCE")
    @Description(" Agregar un nuevo indicador clave de desempeño")
    public void ORN_TC024() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC024";
    try {
        ORN_TC021();
        // - Click en la seccion de ""Configure""  
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.Configure"))).click();
            Thread.sleep(1500);                                                                 
        // - Click en la sección de ""KPIs"" 
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPI"))).click();
            Thread.sleep(1500); 
        // - Click en el boton de ""+Add""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPIAdd"))).click();
            Thread.sleep(1500);                                                                 
        // - Se llenan todos los campos
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPIAddKeyPerformanceIndicator"))).sendKeys(reader.dato("PERFORMANCE", "keyPerformanceIndicator"));
            Thread.sleep(1500); 

            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPIAddMinimumRating"))).sendKeys(reader.dato("PERFORMANCE", "minimumRating"));
            Thread.sleep(1500);

            WebElement reviewers = driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPIAddJobTitle")));
                reviewers.click();
                Thread.sleep(1500);
                reviewers.sendKeys(Keys.DOWN);
                Thread.sleep(1500);
                reviewers.sendKeys(Keys.ENTER);
                Thread.sleep(1500);

    
        // - Click en el botón ""Save""
            driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPIAddSave"))).click();
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
    } 
    
    }

    @Test(description = "El objetivo  es validar que para poder crear un neuvo indicador se deban llenar los campos obligatorios")
    @Story("PERFORMANCE")
    @Description(" Intentar  Agregar un nuevo indicador clave de desempeño sin llenar los campos obligatorios")
    public void ORN_TC025() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC025";
    try {
        ORN_TC021();
        // "- Click en la seccion de ""Configure""
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.Configure"))).click();
        Thread.sleep(1500);                                                                 
        //  - Click en la sección de ""KPIs"" 
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPI"))).click();
        Thread.sleep(1500); 
        // "- Click en el boton de ""+Add""
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPIAdd"))).click();
        Thread.sleep(1500);                                                                 
        // - Click en el botón ""Save""
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.KPIAddSave"))).click();
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
    } 
    
    }
    @Test(description = "El objetivo  es validar la funcionalidad para realizar una review a un empleado")
    @Story("PERFORMANCE")
    @Description("Realizar una Review")
    public void ORN_TC026() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC026";
    try {
        ORN_TC021();

        // "- Click en la seccion de ""Manage Reviews""
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.manageReviews"))).click();
        Thread.sleep(1500);                                                                 

        // - Click en la sección de ""My Reviews"" 
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.manageReviewsItem"))).click();
        Thread.sleep(1500);                                                                 

        // "- Click en el boton de acción correspondiente a la calificacion del empleado
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.MyReviewsList"))).click();
        Thread.sleep(1500);                                                                 

        // - Se le da una calificacion entre 0 y 100 a cada uno de los KPIs correspondientes y un comentario
        for (int i = 6; i <= 22; i+=4) {
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div/div[2]/div[2]/div["+i+"]/div/div[2]/input")).sendKeys(reader.dato("PERFORMANCE", "number"));
        }
        // - Click en ""Save""
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.MyReviewsComplete"))).click();
        Thread.sleep(1500);   

        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.MyReviewsOk"))).click();
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
    } 
    
    }
    @Test(description = "El objetivo  es validar la funcionalidad para Agregar nuevos registros como seguidor de un empleado")
    @Story("PERFORMANCE")
    @Description("Agregar un nuevo registro de seguimiento")
    public void ORN_TC027() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC027";
    try {
        ORN_TC021();

        // "- Click en la seccion de ""Employee Trackers"" 
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.EmployeeTracker"))).click();
        Thread.sleep(1500);                                                                 
                                                                     
        // "- Click en el boton de acción ""View"" correspondiente al empleado a agregar el nuevo registro 
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.ViewEmployeeName"))).click();
        Thread.sleep(1500);                                                                 
        // - Click en el botón ""+Add Log""    
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.AddLog"))).click();
        Thread.sleep(1500);                                                                           
        // - Llenar los campos de log y Comment    
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.AddLogLog"))).sendKeys(reader.dato("PERFORMANCE", "log"));
        Thread.sleep(1500);                                                                           
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.AddLogComment"))).sendKeys(reader.dato("PERFORMANCE", "comment"));
        Thread.sleep(1500);                                                                           
        // - Click en el botón de ""Save""      
        driver.findElement(By.xpath(propiedades.getProperty("PERFORMANCE.AddLogSave"))).click();
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
