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

public class Claim extends  PIM{
    @Test(description = "El objetivo  es validar los elementos que se deben mostrar en la sección \"Claim\"")
    @Story("CLAIM")
    @Description("Validar elementos de la sección \"Claim\"")
    public void ORN_TC028() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC028";
    try {
        ORN_TC001();

        // "- Click en la seccion de ""Claim""
            driver.findElement(By.xpath(propiedades.getProperty("CLAIM.Enter"))).click();
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
    @Test(description = "El objetivo  es validarla funcionalidad para asignar reclamos a empleados en especifico")
    @Story("CLAIM")
    @Description("Asignar un reclamo")
    public void ORN_TC029() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC029";
    try {
        ORN_TC028();

        // "- Click el botón""+ Assign Claim""
        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.AssignClaim"))).click();
        Thread.sleep(1500);                                                                 
        // "- Se llenan todos los campos mostrados 
        WebElement employeeName = driver.findElement(By.xpath(propiedades.getProperty("CLAIM.AssignClaimEmployeeName")));
            employeeName.sendKeys(reader.dato("CLAIM", "employeeName"));
            Thread.sleep(1500);
            employeeName.sendKeys(Keys.DOWN);
            Thread.sleep(1500);
            employeeName.sendKeys(Keys.ENTER);

        WebElement event = driver.findElement(By.xpath(propiedades.getProperty("CLAIM.AssignClaimEvent")));
            event.click();
            Thread.sleep(1500);
            event.sendKeys(Keys.DOWN);
            Thread.sleep(1500);
            event.sendKeys(Keys.ENTER);
            Thread.sleep(1500);
        WebElement currency = driver.findElement(By.xpath(propiedades.getProperty("CLAIM.AssignClaimCurrency")));
        currency.click();
            Thread.sleep(1500);
            currency.sendKeys(Keys.DOWN);
            Thread.sleep(1500);
            currency.sendKeys(Keys.ENTER);
            Thread.sleep(1500);

        // - Click en el botón ""Create""
        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.AssignClaimCreate"))).click();
        Thread.sleep(5000); 

        // "- Click en botón ""Submit""
        WebElement submit = driver.findElement(By.xpath(propiedades.getProperty("CLAIM.AssignClaimSubmit")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
            Thread.sleep(1500);
            submit.click();
            Thread.sleep(1500);  

        // "- Click en botón ""Back""
        WebElement back = driver.findElement(By.xpath(propiedades.getProperty("CLAIM.AssignClaimBack")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", back);
            Thread.sleep(1500);
            back.click();
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

    @Test(description = "El objetivo es validar que todos los campos obligatorios para la creación de un evento sean diligenciados para poder ser creados")
    @Story("CLAIM")
    @Description("Intentar crear un Evento")
    public void ORN_TC030() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC030";
    try {
        ORN_TC028();

        // "- Click en la seccion de ""Configuration""  

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.Configuration"))).click();
        Thread.sleep(1500);                                                                 

        // - Click en ""Events""

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.ConfigurationEvents"))).click();
        Thread.sleep(1500);                                                                 

        // " - Click en el botón ""+ Add""

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.EventAdd"))).click();
        Thread.sleep(1500);                                                                 

        // "- Click en el botón ""Save""

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.EventSave"))).click();
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

    @Test(description = "El objetivo  es validar la funcionalidad para crear un evento")
    @Story("CLAIM")
    @Description(" crear un Evento")
    public void ORN_TC031() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC031";
    try {
        ORN_TC028();

            // "- Click en la seccion de ""Configuration""  

            driver.findElement(By.xpath(propiedades.getProperty("CLAIM.Configuration"))).click();
            Thread.sleep(1500);                                                                 
    
            // - Click en ""Events""
            
            driver.findElement(By.xpath(propiedades.getProperty("CLAIM.ConfigurationEvents"))).click();
            Thread.sleep(1500);                                                                 
    
            // " - Click en el botón ""+ Add""

            driver.findElement(By.xpath(propiedades.getProperty("CLAIM.EventAdd"))).click();
            Thread.sleep(1500);                                                                 
    
            // "- Se llenan los campos de ""Event Name"" y se da una descripción  
                          
            driver.findElement(By.xpath(propiedades.getProperty("CLAIM.EventName"))).sendKeys(reader.dato("CLAIM", "eventname"));
            Thread.sleep(1500);                                                                 

            driver.findElement(By.xpath(propiedades.getProperty("CLAIM.EventDescription"))).sendKeys(reader.dato("CLAIM", "eventDescription"));
            Thread.sleep(1500);                                                                 

            // - Click en el botón ""Save""       
            
            driver.findElement(By.xpath(propiedades.getProperty("CLAIM.EventSave"))).click();
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

    @Test(description = "El objetivo  es validar la funcionalidad para agregar un nuevo tipo de gasto")
    @Story("CLAIM")
    @Description("Agregar tipo de gasto")
    public void ORN_TC032() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC032";
    try {
        ORN_TC028();


        // "- Click en la seccion de ""Configuration""  

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.Configuration"))).click();
        Thread.sleep(1500);                                                                 

        // - Click en ""Expense Types"" 

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.ExpenseType"))).click();
        Thread.sleep(1500);                                                                 

        // " - Click en el botón ""+ Add""

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.EventAdd"))).click();
        Thread.sleep(1500);                                                                 

        // "- Se llenan los campos de ""Name"" y se da una descripción 

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.ExpenseTypeName"))).sendKeys(reader.dato("CLAIM", "expenseTypeName"));
        Thread.sleep(1500);                                                                 

       driver.findElement(By.xpath(propiedades.getProperty("CLAIM.ExpenseTypeStatus"))).sendKeys(reader.dato("CLAIM", "expenseTypeDescription"));
       Thread.sleep(1500);                                                                 
                            
        // - Click en el botón ""Save""
        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.ExpenseTypeSave"))).click();
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
    @Test(description = "El objetivo  es validar la funcionalidad para Cancelar un reclamos con status iniciado")
    @Story("CLAIM")
    @Description("Cancelar un envio de reclamo")
    public void ORN_TC033() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC032";
    try {
        ORN_TC028();


        // "- Click en la seccion de ""My Claims""

        driver.findElement(By.xpath(propiedades.getProperty("CLAIM.MyClaims"))).click();
        Thread.sleep(1500);                                                                 

        // " - Click en el botón ""View Details"" en uno de los reclamos con status ""Initiated""

        String text = driver.findElement(By.xpath(propiedades.getProperty("CLAIM.MyClaimsRows"))).getText(); // Esto debería dar "(5) Records Found"

        String numberOnly = text.replaceAll("\\D+", "");
        int number = Integer.parseInt(numberOnly);

        for (int i = 1; i < number+1; i++) {
            if (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[2]/div["+i+"]/div/div[6]/div")).getText().equalsIgnoreCase("Initiated")) {
                driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div[2]/div["+i+"]/div/div[8]/div/button")).click();
                break;
            }
        }                                                               

        // " - Click en el botón ""Cancel""
            Thread.sleep(5000);
            WebElement cancel = driver.findElement(By.xpath(propiedades.getProperty("CLAIM.MyClaimsCancel")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancel);
            Thread.sleep(1500);
            cancel.click();                                                               
            Thread.sleep(7000);

        // " - Click en el botón ""Back""    
        
            WebElement back = driver.findElement(By.xpath(propiedades.getProperty("CLAIM.MyClaimsBack")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", back);
            Thread.sleep(1500);
            back.click();                                                                  
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
}
