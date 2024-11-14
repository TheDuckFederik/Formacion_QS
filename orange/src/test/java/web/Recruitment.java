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

public class Recruitment extends PIM{
    @Test(description = "El objetivo es validar la sección de reclutamiento")
    @Story("LEAVE")
    @Description("Sección\"Reclutamiento\"")
    public void ORN_TC015() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC015";
    try {
        ORN_TC001();

            // - Click en la sección de "Recruitment"
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.Enter"))).click();
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

    @Test(description = "El objetivo es validar la funcionalidad para agregar un nuevo candidato")
    @Story("RECRUITMENT")
    @Description("Agregar un nuevo candidato")
    public void ORN_TC016() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC016";
    try {
        ORN_TC015();

            // - Click en el botón Add
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.Add"))).click();
                Thread.sleep(1500);
            // - Llenar los campos obligatorios (Full Name, Last Name,Email )    
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.AddFirstName"))).sendKeys(reader.dato("RECRUITMENT", "firstName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.AddMiddleName"))).sendKeys(reader.dato("RECRUITMENT", "middleName"));
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.AddLastName"))).sendKeys(reader.dato("RECRUITMENT", "lastName"));
                Thread.sleep(1500);  
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.AddEmail"))).sendKeys(reader.dato("RECRUITMENT", "email"));
                Thread.sleep(1500);                             
            //-  Seleccionar un tipo de vacante 
               WebElement vacancy = driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.AddVacancy")));
               vacancy.click();
               Thread.sleep(1500);
               vacancy.sendKeys(Keys.DOWN);
               Thread.sleep(1500);
               vacancy.sendKeys(Keys.ENTER);
               Thread.sleep(1500);
            // -  Click en el botón "Save"
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.AddSave"))).click();
                Thread.sleep(15000);

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

    @Test(description = "Agregar una nueva vacante")
    @Story("RECRUITMENT")
    @Description("Agregar una nueva vacante")
    public void ORN_TC017() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);
        testId = "ORN_TC017";
    try {
        ORN_TC015();

            // "- Click en la seccion de ""Vacancies""
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.Vacancy"))).click();
                Thread.sleep(1500);
            // "- Click en el botón ""+ Add"" 
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.VacancyAdd"))).click();
                Thread.sleep(1500);
            // - Llenar los campos obligatorios (Vacancy Name, Job Title, Hiring Manager"" )
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.VacancyAddName"))).sendKeys(reader.dato("RECRUITMENT", "jobTitle"));
                Thread.sleep(1500);

                WebElement jobTitle = driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.VacancyAddJobTitle")));
                    jobTitle.click();
                    Thread.sleep(1500);
                    jobTitle.sendKeys(Keys.DOWN);  
                    Thread.sleep(1500);
                    jobTitle.sendKeys(Keys.ENTER);  
                    Thread.sleep(1500);

                WebElement hiringManager = driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.VacancyAddHiringManager")));
                    hiringManager.sendKeys(reader.dato("RECRUITMENT", "hiringManager"));
                    Thread.sleep(1500);
                    hiringManager.sendKeys(Keys.DOWN);
                    Thread.sleep(1500);
                    hiringManager.sendKeys(Keys.ENTER);
                    Thread.sleep(1500);
            // -  Click en el Botón Save
                driver.findElement(By.xpath(propiedades.getProperty("RECRUITMENT.VacancySave"))).click();
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
