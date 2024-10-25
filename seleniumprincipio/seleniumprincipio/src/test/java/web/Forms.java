package web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Forms extends  Main{
    static Properties propiedades = new Properties();


    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP_008_Practice_Form() throws InterruptedException, IOException, CsvException {


        testId = "TC001_Elements1";
        
        //CASO DE Prueba 001
        try{
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);
            
            MyReader jsonReader = new MyReader();

            CPD cpdList = new CPD();
            List<String[]> datos = cpdList.Datos();
            String[] datoRequerido = datos.get(7);
            String[] datosIncorrectos = datos.get(8);

                driver.get("https://demoqa.com");
                Thread.sleep(500);
                WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.forms")));
                menu.click();
                Thread.sleep(500);
                
                WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.forms")));
                submenu.click();
                Thread.sleep(500);

                // //Hacemos click al boton de submit

                WebElement submitForm = driver.findElement(By.id("submit"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitForm);
                Thread.sleep(500); 
                submitForm.click();
                Thread.sleep(500);
                System.out.println("se ha hecho click en submit" + "\n");

                //Rellenamos el campo firstName

                WebElement firstNameForm = driver.findElement(By.id("firstName"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstNameForm);
                Thread.sleep(500); 
                firstNameForm.sendKeys(datoRequerido[0]);
                Thread.sleep(500);
                System.out.println("se ha rellenado firstname" + "\n");
                
                //Rellenamos el campo Last Name

                WebElement lastNameForm = driver.findElement(By.id("lastName"));
                lastNameForm.sendKeys(jsonReader.dato("CP008", "lastName"));
                Thread.sleep(500);
                System.out.println("se ha rellenado lastName" + "\n");

                //Rellenamos el campo Email

                WebElement emailForm = driver.findElement(By.id("userEmail"));
                emailForm.sendKeys(datosIncorrectos[3]);
                Thread.sleep(1500);
                System.out.println("se ha rellenado email erroneamente" + "\n");

                //Hacer click en el boton de submit

                submitForm.click();
                System.out.println("se ha hecho click en submit" + "\n");

                //Rellenamos el campo Email correctamente

                emailForm.clear();
                emailForm.sendKeys(jsonReader.dato("CP008", "emailgood"));
                Thread.sleep(500);
                System.out.println("se ha rellenado email correctamente" + "\n");

                //Hacer click en el radio button de Male

                WebElement maleRadioButtonForm = driver.findElement(By.xpath(propiedades.getProperty("radioButton.Male")));
                maleRadioButtonForm.click();
                Thread.sleep(500);
                System.out.println("se hizo click en Male" + "\n");


                //Rellenamos el campo Mobile con 10 letras

                WebElement mobileForm = driver.findElement(By.id("userNumber"));
                mobileForm.sendKeys(datosIncorrectos[4]);
                Thread.sleep(500);
                System.out.println("se ha rellenado Mobile con 10 letras" + "\n");


                //Rellenamos el campo mobile con 5 numeros

                mobileForm.clear();
                mobileForm.sendKeys(datosIncorrectos[5]);
                Thread.sleep(500);
                System.out.println("Rellenamos el campo mobile con 5 numeros" + "\n");


                //Hacemos click al boton de submit

                submitForm.click();
                Thread.sleep(500);
                System.out.println("Se ha hecho click al boton de submit" + "\n");

                //Rellenamos el campo Mobile con 10 numeros

                mobileForm.clear();
                mobileForm.sendKeys(jsonReader.dato("CP008", "mobilegood"));
                Thread.sleep(500);
                System.out.println("Se ha hecho click al boton de submit" + "\n");

                //Hacer click en date of birth

                WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
                dateOfBirth.click();
                Thread.sleep(500);
                System.out.println("Se ha hecho click a date of birth" + "\n");
                
                //Hacer click en los meses Y seleccionar Enero

                WebElement monthForm = driver.findElement(By.xpath(propiedades.getProperty("Form.MonthForm")));
                Select monthSelect = new Select(monthForm);
                monthSelect.selectByVisibleText("January");
                Thread.sleep(500);
                System.out.println("se ha seleccionado january" + "\n");

                //Hacer click en los años Y seleccionar 2004

                WebElement yearForm = driver.findElement(By.xpath(propiedades.getProperty("Form.YearForm")));
                Select yearSelect = new Select(yearForm);
                yearSelect.selectByVisibleText("2004");
                Thread.sleep(500);    
                System.out.println("Se ha seleccionado 2004" + "\n");
                
                //Hacer click en 16

                WebElement dayForm = driver.findElement(By.xpath(propiedades.getProperty("Form.DayForm")));
                dayForm.click();
                Thread.sleep(500);
                System.out.println("Se ha seleccionado el dia 16" + "\n");

                //Rellenar el campo Subjects

                WebElement subjectsForm = driver.findElement(By.id("subjectsInput"));
                subjectsForm.sendKeys(datoRequerido[5]);
                subjectsForm.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("Se ha rellenado el campo subjects una vez" + "\n");

                //Rellenar el campo subjects

                subjectsForm.sendKeys(datoRequerido[6]);
                subjectsForm.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("Se ha rellenado el campo subjects dos vezes" + "\n");

                //Hacer click en Sports, Reading y Music

                WebElement sports = driver.findElement(By.xpath(propiedades.getProperty("Form.Sports")));
                WebElement reading = driver.findElement(By.xpath(propiedades.getProperty("Form.Reading")));
                WebElement music = driver.findElement(By.xpath(propiedades.getProperty("Form.Music")));

                sports.click();
                Thread.sleep(500);
                reading.click();
                Thread.sleep(500);
                music.click();
                Thread.sleep(500);
                System.out.println("Se ha seleccionado sports, reading y music" + "\n");

                //Subir un archivo

                WebElement uploadFile = driver.findElement(By.id("uploadPicture"));
                uploadFile.sendKeys(propiedades.getProperty("file.FormUploadFile"));
                Thread.sleep(500);
                System.out.println("Se ha subido el archivo" + "\n");

                //Rellenar el campo current address

                WebElement currentAddressForm = driver.findElement(By.id("currentAddress"));
                currentAddressForm.sendKeys(datoRequerido[7]);
                Thread.sleep(500);
                System.out.println("Se ha rellenado current address" + "\n");

                //Seleccionar un estado y ciudad

                WebElement stateForm = driver.findElement(By.id("react-select-3-input"));
                stateForm.sendKeys(jsonReader.dato("CP008", "statesel"));
                stateForm.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("Se ha implementado el estado" + "\n");

                WebElement cityForm = driver.findElement(By.id("react-select-4-input"));
                cityForm.sendKeys(datoRequerido[9]);
                cityForm.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("Se ha implementado la ciudad" + "\n");
                //hacer click al boton de submit

                submitForm.click();

                Thread.sleep(500);
                System.out.println("Se ha hecho click en submit" + "\n");

                //Obtener los resultados
                System.out.println("Se han recogido los resultados" + "\n");
                System.out.println(driver.findElement(By.xpath("//div[@class=\"table-responsive\"]")).getText());


            } catch(IllegalArgumentException e){
                System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP008\\NullXpathKey.png"));
            } catch(ElementClickInterceptedException e){
                System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP008\\ElementOnTop.png"));
            } catch (org.openqa.selenium.NoSuchElementException e){
                System.out.println("El ID o Xpath especificado no es correcto");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP008\\NullIdOrXpath.png"));
            } catch (WebDriverException e){
                System.out.println("La URL especificada no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP008\\URLError.png"));
            } catch (FileNotFoundException e){
                System.out.println("El archivo no esta bien especificado o no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP008\\NoFile.png"));
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("El Array del Excel no contiene esa posición");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP008\\ArrayExcel.png"));
            } catch (NullPointerException e){
                System.out.println("El Json no contiene esa clave o valor");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP008\\JsonKeyValue.png"));
            } finally{
            driver.quit();
            }
    }
}
