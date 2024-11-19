package web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Mercado extends Main{

    

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("MERCADO")
    @Description("Rellenar textbox")
    public void datos_Mercado() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "RellenarJson";
        
        try{   
            Map<String, Map<String, String>> mainMap = new HashMap<>();

            MyReader jsonReader = new MyReader();

            // datosPrueba = gson.fromJson(reader, DatosPrueba.class);
            CPD cpdList = new CPD();
            List<String[]> datos = cpdList.Datos();
            String[] datoRequerido = datos.get(1);
            String[] datosIncorrectos = datos.get(2);


            driver.get("https://www.comuniate.com/mercado.php");
            Thread.sleep(500);
            driver.findElement(By.xpath(propiedades.getProperty("MERCADO.AceptarCoockiesComuniate"))).click();
            Thread.sleep(1500);
            driver.findElement(By.id(propiedades.getProperty("MERCADO.IDNombre"))).sendKeys(jsonReader.dato("Entrar", "Usuario"));
            Thread.sleep(500);
            driver.findElement(By.id(propiedades.getProperty("MERCADO.IDPassword"))).sendKeys(jsonReader.dato("Entrar", "Contraseña"));
            Thread.sleep(500);

            driver.findElement(By.xpath(propiedades.getProperty("MERCADO.botonAnalizar"))).click();
            Thread.sleep(5000);

            WebElement mercadoFichajes = driver.findElement(By.xpath(propiedades.getProperty("MERCADO.MercadoDeFichajes")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mercadoFichajes);


            Map<String, String> mercadoDefensas = new LinkedHashMap<>();
            Map<String, String> mercadoDelanteros = new LinkedHashMap<>();
            Map<String, String> mercadoCentro = new LinkedHashMap<>();
            Map<String, String> mercadoPorteros = new LinkedHashMap<>();
            //Mientras hayan jugadores en el mercado
            boolean hayJugadores = true;
            int i = 1;
            while (hayJugadores) {
                //Si hay un jugador
                try {
                        //Si el jugador es un defensa,delantero,medio o portero
                        if (driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div/span")).getText().equalsIgnoreCase("df")) {
                            mercadoDefensas.put(driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div[3]/a/strong")).getText(), driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div/span[2]/span")).getText());
                        } else if(driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div/span")).getText().equalsIgnoreCase("dl")){
                            mercadoDelanteros.put(driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div[3]/a/strong")).getText(), driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div/span[2]/span")).getText());
                        }else if(driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div/span")).getText().equalsIgnoreCase("md")){
                            mercadoCentro.put(driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div[3]/a/strong")).getText(), driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div/span[2]/span")).getText());
                        }else if(driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div/span")).getText().equalsIgnoreCase("pt")){
                            mercadoPorteros.put(driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div[3]/a/strong")).getText(), driver.findElement(By.xpath("//div[@id=\"tab_c\"]/div["+i+"]/div/span[2]/span")).getText());
                        }
                    i++;
                } catch (Exception e) {
                    break;
                }

            }

            mainMap.put("Defensas", mercadoDefensas);
            mainMap.put("Delanteros", mercadoDelanteros);
            mainMap.put("Medios", mercadoCentro);
            mainMap.put("Porteros", mercadoPorteros);


            Gson gsonDefensas = new GsonBuilder().setPrettyPrinting().create();
            String jsonDefensas = gsonDefensas.toJson(mainMap);

            try (FileWriter fileWriter = new FileWriter("mercadoJugadores.json")) {
                fileWriter.write(jsonDefensas);
            } catch (IOException e) {
                e.printStackTrace();
            }




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
        } catch (FileNotFoundException e){
            System.out.println("El archivo no esta bien especificado o no existe");
            e.printStackTrace();
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NoFile.png"));
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
    @Story("MERCADO")
    @Description("Rellenar textbox")
    public void comprar_Jugador() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "RellenarJson";
        
        try{   
            MyReader jsonReader = new MyReader();

            driver.get("https://www.comunio.es/");
            Thread.sleep(500);
            driver.findElement(By.xpath(propiedades.getProperty("alineacion.aceptarCockies"))).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(propiedades.getProperty("alineacion.entrar"))).click();
            Thread.sleep(500);
            driver.findElement(By.id("input-login")).sendKeys(jsonReader.dato("Entrar", "Usuario"));
            Thread.sleep(500);
            driver.findElement(By.id("input-pass")).sendKeys(jsonReader.dato("Entrar", "Contraseña"));
            Thread.sleep(500);
            driver.findElement(By.id("input-pass")).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            driver.findElement(By.xpath(propiedades.getProperty("MERCADO.Entrar"))).click();
            Thread.sleep(1500);

            WebElement jugadoresMercado = driver.findElement(By.xpath(propiedades.getProperty("Mercado.TodosLosJugadores")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", jugadoresMercado);

            driver.findElement(By.xpath("//div[text() = 'Diego Rico']/../../../span[@id=\"ic-05\"]/span")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id=\"calculator\"]/div[2]/div[3]/div/div/div[4]/span[1]")).click();
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
        } catch (FileNotFoundException e){
            System.out.println("El archivo no esta bien especificado o no existe");
            e.printStackTrace();
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP001\\NoFile.png"));
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
