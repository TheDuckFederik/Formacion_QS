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
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Elements extends Main{
    static Properties propiedades = new Properties();


    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void Entrar() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "Entrar";
        
        //CASO DE Prueba 001
        try{       

            MyReader jsonReader = new MyReader();

            // datosPrueba = gson.fromJson(reader, DatosPrueba.class);
            CPD cpdList = new CPD();
            List<String[]> datos = cpdList.Datos();
            String[] datoRequerido = datos.get(1);
            String[] datosIncorrectos = datos.get(2);


            driver.get("https://www.comunio.es/");
            Thread.sleep(500);
            driver.findElement(By.xpath(propiedades.getProperty("menu.aceptarCockies"))).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(propiedades.getProperty("menu.entrar"))).click();
            Thread.sleep(500);
            driver.findElement(By.id("input-login")).sendKeys(jsonReader.dato("Entrar", "Usuario"));
            Thread.sleep(500);
            driver.findElement(By.id("input-pass")).sendKeys(jsonReader.dato("Entrar", "Contraseña"));
            Thread.sleep(500);
            driver.findElement(By.id("input-pass")).sendKeys(Keys.ENTER);
            Thread.sleep(3000);

            driver.findElement(By.xpath(propiedades.getProperty("menu.alineación"))).click();
            Thread.sleep(500);


            
            
            } catch(IllegalArgumentException e){
                System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NullXpathKey.png"));
            } catch(ElementClickInterceptedException e){
                System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
                e.printStackTrace();
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\ElementOnTop.png"));
            } catch (org.openqa.selenium.NoSuchElementException e){
                System.out.println("El ID o Xpath especificado no es correcto");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NullIdOrXpath.png"));
            } catch (WebDriverException e){
                System.out.println("La URL especificada no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\URLError.png"));
            } catch (FileNotFoundException e){
                System.out.println("El archivo no esta bien especificado o no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NoFile.png"));
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("El Array del Excel no contiene esa posición");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\ArrayExcel.png"));
            } catch (NullPointerException e){
                System.out.println("El Json no contiene esa clave o valor");
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
