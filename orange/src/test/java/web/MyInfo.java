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

public class MyInfo extends PIM{
    @Test(description = "El objetivo  es validar que la sección de \"My Info\" Cargue con los elementos correspondientes")
    @Story("MyInfo")
    @Description("Sección \"My Info\"")
    public void ORN_TC018() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC018";
    try {
        ORN_TC001();

            // "- Click en la seccion de ""My Info""
                    driver.findElement(By.xpath(propiedades.getProperty("MYINFO.Enter"))).click();
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
    @Test(description = "El objetivo  es validar la funcionalidad de editar la informacion personal de un empleado")
    @Story("MyInfo")
    @Description("Editar \"Personal Details")
    public void ORN_TC019() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC019";
    try {
        ORN_TC018();

            // "- Click en la seccion de ""Personal Details""
                    // driver.findElement(By.xpath(propiedades.getProperty(paso))).click();
            // "- Editar los campos de :                               
            // - Employee Full Name  
                    driver.findElement(By.xpath(propiedades.getProperty("MYINFO.AddFirstName"))).sendKeys(reader.dato("MYINFO", "firstName"));
                    Thread.sleep(1500);                                                                                               
            // - Employee Id 
                    driver.findElement(By.xpath(propiedades.getProperty("MYINFO.AddMiddleName"))).sendKeys(reader.dato("MYINFO", "middleName"));    
                    Thread.sleep(1500);                                                                                                                                                  
            // - Nationality
                    driver.findElement(By.xpath(propiedades.getProperty("MYINFO.AddLastName"))).sendKeys(reader.dato("MYINFO", "lastName"));    
                    Thread.sleep(1500);                                                                                                                                                  
            // - Marital Status
                    WebElement martialStatus = driver.findElement(By.xpath(propiedades.getProperty("MYINFO.AddMartialStatus")));
                        martialStatus.sendKeys(Keys.DOWN);
                        Thread.sleep(1500);   
                        martialStatus.sendKeys(Keys.DOWN);
                        Thread.sleep(1500);  
                        martialStatus.sendKeys(Keys.ENTER);
                        Thread.sleep(1500);                                              
                                           
            // - Click en el Botón de "" Save"" 
                    driver.findElement(By.xpath(propiedades.getProperty(paso))).click();
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
    @Test(description = "El objetivo  es validar la funcionalidad de agregar una nueva experiencia laboral")
    @Story("MyInfo")
    @Description("Agregar una nueva experiencia laboral")
    public void ORN_TC020() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC020";
    try {
        ORN_TC018();

            // "- Click en la seccion de ""Qualifications""
                driver.findElement(By.xpath(propiedades.getProperty("MYINFO.QualificationsEnter"))).click();
                Thread.sleep(1500);
            // "- Click en el botón de ""+ Add"" correspondiente a la experiencia laboral del usuario
                driver.findElement(By.xpath(propiedades.getProperty("MYINFO.QualificationsAdd"))).click();
                Thread.sleep(1500);
            // "- Se llenan los campos obligatorios (Nombre de la compañia, Cargo o titulo , Fecha de inicio y fecha de fin)   
                driver.findElement(By.xpath(propiedades.getProperty("MYINFO.QualificationsAddCompany"))).sendKeys(reader.dato("MYINFO", "company"));  
                Thread.sleep(1500);  
                driver.findElement(By.xpath(propiedades.getProperty("MYINFO.QualificationsJobTitle"))).sendKeys(reader.dato("MYINFO", "jobTitle"));  
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("MYINFO.QualificationsTo"))).sendKeys(reader.dato("MYINFO", "to"));  
                Thread.sleep(1500);                   
                driver.findElement(By.xpath(propiedades.getProperty("MYINFO.QualificationsFrom"))).sendKeys(reader.dato("MYINFO", "from"));  
                Thread.sleep(1500);                       
                                      

            // - Click en el botón de ""Save""
                driver.findElement(By.xpath(propiedades.getProperty("MYINFO.QualificationsSave"))).click();
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
