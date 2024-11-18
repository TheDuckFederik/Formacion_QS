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
import java.util.Properties;
import java.util.StringTokenizer;

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

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Elements extends Main{
    static Properties propiedades = new Properties();


    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void RellenarJson() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\comunio\\src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "RellenarJson";
        
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

            driver.findElement(By.xpath(propiedades.getProperty("alineacion.menualineacion"))).click();
            Thread.sleep(1500);

            driver.findElement(By.id("jmmr-lineupEditor")).click();
            Thread.sleep(1500);

            driver.findElement(By.xpath(propiedades.getProperty("alineacion.seleccionarAlineacion"))).click();
            Thread.sleep(1500);
            



            String textDelanteros = driver.findElement(By.xpath("//tr[1]/td[2]/span[3]")).getText();

            System.out.println(textDelanteros);
            int start = textDelanteros.indexOf('(') + 1;  // Posición después del '('
            int end = textDelanteros.indexOf(')');        // Posición antes del ')'
            
            // Extrae el número como String y lo convierte en int
            String numberStrDelanteros = textDelanteros.substring(start, end);

            int numberDelanteros = Integer.parseInt(numberStrDelanteros);
            System.out.println(numberDelanteros);

            String[] plantillaDelanteros = new String[2];

            Map<String, String> mapDElanteros = new LinkedHashMap<>();
            for (int i = 2; i < numberDelanteros+2; i++) {

                driver.findElement(By.xpath("//tr["+i+"]/td[3]/a")).click();
                Thread.sleep(1500);
                WebElement volver = driver.findElement(By.id("header"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", volver);//div[@class='pi_name']

                if (i == 2 || i == 3) {
                    plantillaDelanteros[i-2] = driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNombre"))).getText();
                }
                mapDElanteros.put(driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNombre"))).getText(), driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNumero"))).getText());

                
                Thread.sleep(1500);
                driver.findElement(By.id("btn_pi_back")).click();
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("alineacion.menualineacion"))).click();
                Thread.sleep(1500);


            }

            Map<String, Map<String, String>> mainMap = new HashMap<>();
            mainMap.put("Delanteros", mapDElanteros);

            Gson gsonDelantero = new GsonBuilder().setPrettyPrinting().create();
            String jsonDelantero = gsonDelantero.toJson(mainMap);

            try (FileWriter fileWriter = new FileWriter("jugadoresyPuntos.json")) {
                fileWriter.write(jsonDelantero);
            } catch (IOException e) {
                e.printStackTrace();
            }




            String textCentro = driver.findElement(By.xpath("//*[@id=\"table_current_squad\"]/tbody/tr[6]/td[2]/span[3]")).getText();

            System.out.println(textCentro);
            int startCentro = textCentro.indexOf('(') + 1;  // Posición después del '('
            int endCentro = textCentro.indexOf(')');        // Posición antes del ')'
            
            // Extrae el número como String y lo convierte en int
            String numberStrCentro = textCentro.substring(startCentro, endCentro);

            String[] plantillaCentro = new String[4];

            int numberCentro = Integer.parseInt(numberStrCentro);
            System.out.println(numberCentro);

            Map<String, String> mapCentro = new LinkedHashMap<>();
            for (int i = 7; i < numberCentro+7; i++) {

                driver.findElement(By.xpath("//tr["+i+"]/td[3]/a")).click();
                Thread.sleep(1500);
                WebElement volver = driver.findElement(By.id("header"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", volver);//div[@class='pi_name']

                if (i == i+1 || i == i+2 || i == i+3 || i == i+4 ) {
                    plantillaCentro[i-7] = driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNombre"))).getText();
                }

                mapCentro.put(driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNombre"))).getText(), driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNumero"))).getText());

                
                Thread.sleep(1500);
                volver.click();
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("alineacion.menualineacion"))).click();
                Thread.sleep(1500);
                WebElement centrocampistas = driver.findElement(By.xpath("//tr[3]/td[3]/a"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", centrocampistas);
                Thread.sleep(1500);

            }

            mainMap.put("Centrocampistas", mapCentro);

            Gson gsonCentro = new GsonBuilder().setPrettyPrinting().create();
            String jsonCentro = gsonCentro.toJson(mainMap);

            try (FileWriter fileWriter = new FileWriter("jugadoresyPuntos.json")) {
                fileWriter.write(jsonCentro);
            } catch (IOException e) {
                e.printStackTrace();
            }




            String textDefensa = driver.findElement(By.xpath("//*[@id=\"table_current_squad\"]/tbody/tr[14]/td[2]/span[3]")).getText();

            System.out.println(textDefensa);
            int startDefensa = textDefensa.indexOf('(') + 1;  // Posición después del '('
            int endDefensa = textDefensa.indexOf(')');        // Posición antes del ')'
            
            // Extrae el número como String y lo convierte en int
            String numberStrDefensa = textDefensa.substring(startDefensa, endDefensa);

            int numberDefensa = Integer.parseInt(numberStrDefensa);
            System.out.println(numberDefensa);

            Map<String, String> mapDefensa = new LinkedHashMap<>();
            for (int i = 15; i < numberDefensa+15; i++) {

                driver.findElement(By.xpath("//tr["+i+"]/td[3]/a")).click();
                Thread.sleep(1500);
                WebElement volver = driver.findElement(By.id("header"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", volver);//div[@class='pi_name']

                mapDefensa.put(driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNombre"))).getText(), driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNumero"))).getText());

                Thread.sleep(1500);
                volver.click();
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("alineacion.menualineacion"))).click();
                Thread.sleep(1500);
                WebElement centrocampistas = driver.findElement(By.xpath("//tr[8]/td[3]/a"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", centrocampistas);
                Thread.sleep(1500);

            }

            mainMap.put("Defensas", mapDefensa);

            Gson gsonDefensa = new GsonBuilder().setPrettyPrinting().create();
            String jsonDefensa = gsonCentro.toJson(mainMap);

            try (FileWriter fileWriter = new FileWriter("jugadoresyPuntos.json")) {
                fileWriter.write(jsonDefensa);
            } catch (IOException e) {
                e.printStackTrace();
            }



            String textPortero = driver.findElement(By.xpath("//*[@id=\"table_current_squad\"]/tbody/tr[20]/td[2]/span[3]")).getText();

            System.out.println(textPortero);
            int startPortero = textPortero.indexOf('(') + 1;  // Posición después del '('
            int endPortero = textPortero.indexOf(')');        // Posición antes del ')'
            
            // Extrae el número como String y lo convierte en int
            String numberStrPortero = textPortero.substring(startPortero, endPortero);

            int numberPortero = Integer.parseInt(numberStrPortero);
            System.out.println(numberPortero);

            Map<String, String> mapPortero = new LinkedHashMap<>();
            for (int i = 21; i < numberPortero+21; i++) {

                driver.findElement(By.xpath("//tr["+i+"]/td[3]/a")).click();
                Thread.sleep(1500);
                WebElement volver = driver.findElement(By.id("header"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", volver);//div[@class='pi_name']

                mapPortero.put(driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNombre"))).getText(), driver.findElement(By.xpath(propiedades.getProperty("alineacion.recogerNumero"))).getText());

                Thread.sleep(1500);
                volver.click();
                Thread.sleep(1500);
                driver.findElement(By.xpath(propiedades.getProperty("alineacion.menualineacion"))).click();
                Thread.sleep(1500);
                WebElement centrocampistas = driver.findElement(By.xpath("//tr[8]/td[3]/a"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", centrocampistas);
                Thread.sleep(1500);

            }

            mainMap.put("Porteros", mapPortero);

            Gson gsonPortero = new GsonBuilder().setPrettyPrinting().create();
            String jsonPortero = gsonPortero.toJson(mainMap);

            try (FileWriter fileWriter = new FileWriter("jugadoresyPuntos.json")) {
                fileWriter.write(jsonPortero);
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
        @Attachment(value = "{imageName}", type = "image/png")
    public byte[] attachImage(String imageName, byte[] imageBytes) {
        return imageBytes;  // Retorna la imagen como un arreglo de bytes para que Allure la adjunte
    }




    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void Alinear() throws InterruptedException, IOException, CsvException {
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

            driver.findElement(By.xpath(propiedades.getProperty("alineacion.menualineacion"))).click();
            Thread.sleep(1500);

            driver.findElement(By.id("jmmr-lineupEditor")).click();
            Thread.sleep(1500);

            driver.findElement(By.xpath(propiedades.getProperty("alineacion.seleccionarAlineacion"))).click();
            Thread.sleep(1500);
            

            driver.findElement(By.id("jmmr-lineupEditor")).click();
            Thread.sleep(1500);

            String alineacionString = driver.findElement(By.xpath("//div[@title=\"3-5-2\"]")).getAttribute("title");
            StringTokenizer alineacion = new StringTokenizer(alineacionString,"-");
            int[] arrayPosiciones = new int[3];
            int alineacionLimite = 0;
            while (alineacion.hasMoreTokens()) {
                 arrayPosiciones[alineacionLimite] = Integer.parseInt(alineacion.nextToken());
                 alineacionLimite++;
            }

            MyReaderPlantilla reader = new MyReaderPlantilla();


            String[] plantillaDelanteros = new String[arrayPosiciones[2]];
            
            plantillaDelanteros = reader.dato("Delanteros", plantillaDelanteros.length);

            String[] plantillaCentro = new String[arrayPosiciones[1]];

            plantillaCentro = reader.dato("Centrocampistas", plantillaCentro.length);


            String[] plantillaDefensa = new String[arrayPosiciones[0]];

            plantillaDefensa = reader.dato("Defensas", plantillaDefensa.length);

            String[] portero = new String[1];

            portero = reader.dato("Porteros", portero.length);

            for (int j = 0; j < plantillaDelanteros.length; j++) {
                driver.findElement(By.xpath("//div[@id='striker-area']/div["+(j+1)+"]/div[3]")).click();
            }

            for (int i = 0; i < plantillaDelanteros.length; i++) {

                    driver.findElement(By.xpath("//div[@id='striker-area']/div["+(i+1)+"]")).click();
                    Thread.sleep(500);
                
                if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaDelanteros[i])) {
                    driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
                    Thread.sleep(500);
                } else {
                    if (driver.findElement(By.xpath("//*[@id=\"data_selection_btn_right\"]/div/div")).isDisplayed()) {
                        while (!(driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaDelanteros[i]))) {
                            driver.findElement(By.xpath("//*[@id=\"data_selection_btn_right\"]/div/div")).click();
                            Thread.sleep(500);
                        }
                        driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
                        Thread.sleep(500);
                    }
                }

            }
            
            for (int j = 0; j < plantillaCentro.length; j++) {
                driver.findElement(By.xpath("//div[@id='midfielder-area']/div["+(j+1)+"]/div[3]")).click();
            }

            for (int i = 0; i < plantillaCentro.length; i++) {

                driver.findElement(By.xpath("//div[@id='midfielder-area']/div["+(i+1)+"]")).click();
                Thread.sleep(500);

                if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaCentro[i])) {
                    driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
                    Thread.sleep(500);
                } else {
                    if (driver.findElement(By.xpath("//*[@id=\"data_selection_btn_right\"]/div/div")).isDisplayed()) {
                        while (!(driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaCentro[i]))) {
                            driver.findElement(By.xpath("//*[@id=\"data_selection_btn_right\"]/div/div")).click();
                            Thread.sleep(500);
                        }
                        driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
                        Thread.sleep(500);
                    } else {
                        if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaCentro[i])) {
                            driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[3]")).click();
                            Thread.sleep(2000);
                        } else if(driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[2]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaCentro[i])){
                            driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[2]/div[3]")).click();
                            Thread.sleep(2000);
                        } else if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[3]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaCentro[i])) {
                            driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[3]/div[3]")).click();
                            Thread.sleep(2000);
                        }
                    }
                }

            }

            for (int j = 0; j < plantillaDefensa.length; j++) {
                driver.findElement(By.xpath("//div[@id='defender-area']/div["+(j+1)+"]/div[3]")).click();
            }

            for (int i = 0; i < plantillaDefensa.length; i++) {

                driver.findElement(By.xpath("//div[@id='defender-area']/div["+(i+1)+"]")).click();
                Thread.sleep(2000);

                if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaDefensa[i])) {
                    driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
                    Thread.sleep(2000);
                } else {
                    if (driver.findElement(By.xpath("//*[@id=\"data_selection_btn_right\"]/div/div")).isDisplayed()) {
                        while (!(driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaDefensa[i]))) {
                            driver.findElement(By.xpath("//*[@id=\"data_selection_btn_right\"]/div/div")).click();
                            Thread.sleep(500);
                        }
                        driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
                        Thread.sleep(500);
                    } else {
                        if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaDefensa[i])) {
                            driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[3]")).click();
                            Thread.sleep(2000);
                        } else if(driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[2]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaDefensa[i])){
                            driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[2]/div[3]")).click();
                            Thread.sleep(2000);
                        } else if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[3]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(plantillaDefensa[i])) {
                            driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[3]/div[3]")).click();
                            Thread.sleep(2000);
                        }
                    }
                }
            }

            for (int j = 0; j < portero.length; j++) {
                driver.findElement(By.xpath("//div[@id='keeper-area']/div["+(j+1)+"]/div[3]")).click();
            }

            for (int i = 0; i < portero.length; i++) {

                driver.findElement(By.xpath("//div[@id='keeper-area']/div["+(i+1)+"]")).click();
                Thread.sleep(500);

                if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(portero[i])) {
                    driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
                    Thread.sleep(500);
                } else {
                    if (driver.findElement(By.xpath("//*[@id=\"data_selection_btn_right\"]/div/div")).isDisplayed()) {
                        while (!(driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(portero[i]))) {
                            driver.findElement(By.xpath("//*[@id=\"data_selection_btn_right\"]/div/div")).click();
                            Thread.sleep(500);
                        }
                        driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
                        Thread.sleep(500);
                    } else {
                        if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(portero[i])) {
                            driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[1]/div[3]")).click();
                            Thread.sleep(2000);
                        } else if(driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[2]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(portero[i])){
                            driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[2]/div[3]")).click();
                            Thread.sleep(2000);
                        } else if (driver.findElement(By.xpath("//div[@class=\"ts_item_wrapper\"]/div[3]/div[2]/div/div/div[2]")).getText().equalsIgnoreCase(portero[i])) {
                            driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[3]/div[3]")).click();
                            Thread.sleep(2000);
                        }
                    }
                }

            }

            driver.findElement(By.xpath("//*[@id=\"striker-area\"]/div[1]/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"dataSelection\"]/div[3]/div[1]/div[3]")).click();
            Thread.sleep(500);
            WebElement botonalineación = driver.findElement(By.xpath("//div[@id='keeper-area']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", botonalineación);//div[@class='pi_name']
            driver.findElement(By.id("btn-save-lineup")).click();
            Thread.sleep(3000);
            
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
