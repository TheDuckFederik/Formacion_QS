package web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Alert_Frame_Windows extends Main{
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP009_Browser_Windows() throws InterruptedException,IOException {

        testId = "CP009_Browser_Windows";
        
        //CASO DE Prueba 009
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);

            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Windows")));
            submenu.click();
            Thread.sleep(500);

            //Hacemos click al boton de New Tab

            driver.findElement(By.id("tabButton")).click();
            System.out.println("se ha abierto la pestaña" + "\n");

            //Guardamos en un array las pestañas disponibles y nos cambiamos a la pestaña nueva

            ArrayList<String> pestañas = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(pestañas.get(1));
            Thread.sleep(500);

            //Cerramos la pestaña

            driver.close();
            Thread.sleep(500);
            System.out.println("se ha cerrado la pestaña" + "\n");

            //Cambiamos a la pestaña original y hacemos clic al boton de New Window

            driver.switchTo().window(pestañas.get(0));
            driver.findElement(By.id("windowButton")).click();
            Thread.sleep(500);
            System.out.println("se ha abierto la ventana" + "\n");

            //Guardamos en un array las ventanas disponibles y nos cambiamos a la ventana nueva

            ArrayList<String> ventanas = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(ventanas.get(1));
            Thread.sleep(500);

            //Cerramos la ventana

            driver.close();
            Thread.sleep(500);
            System.out.println("se ha cerrado la ventana" + "\n");

            //Cambiamos a la ventana original y hacemos clic al boton de New Window Message

            driver.switchTo().window(ventanas.get(0));
            driver.findElement(By.id("messageWindowButton")).click();
            Thread.sleep(500);
            System.out.println("se ha abierto la ventana de mensage" + "\n");

            //Guardamos en un array las ventanas disponibles y nos cambiamos a la ventana nueva

            ventanas = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(ventanas.get(1));
            Thread.sleep(500);

            //Cerramos la ventana

            driver.close();
            Thread.sleep(500);
            System.out.println("se ha cerrado la ventana de mensage" + "\n");
            
            } catch(IllegalArgumentException e){
                System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP009\\NullXpathKey.png"));
            } catch(ElementClickInterceptedException e){
                System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP009\\ElementOnTop.png"));
            } catch (org.openqa.selenium.NoSuchElementException e){
                System.out.println("El ID o Xpath especificado no es correcto");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP009\\NullIdOrXpath.png"));
            } catch (WebDriverException e){
                System.out.println("La URL especificada no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP009\\URLError.png"));
            } catch (FileNotFoundException e){
                System.out.println("El archivo no esta bien especificado o no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP009\\NoFile.png"));
            } finally{
                driver.quit();
            }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP010_Alerts() throws InterruptedException, IOException {

        testId = "CP010_Alerts";
        
        try{
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);
            MyReader jsonReader = new MyReader();

            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Alerts")));
            submenu.click();
            Thread.sleep(500);

            //Hacemos click en el boton para ver una alert

            driver.findElement(By.id("alertButton")).click();
            Thread.sleep(500);
            System.out.println("se abre el alert" + "\n");

            //Cambiamos al alert y acceptamos el alert

            driver.switchTo().alert();
            driver.switchTo().alert().accept();
            Thread.sleep(500);
            System.out.println("se acepta el alert" + "\n");

            //Hacemos click al segundo boton y esperamos 5 segundos

            driver.findElement(By.id("timerAlertButton")).click();
            Thread.sleep(7000);
            System.out.println("se abre el alert despues de 5 segundos" + "\n");

            //Cambiamos al alert que saldrá dentro de 5 segundos y lo aceptamos

            driver.switchTo().alert();
            driver.switchTo().alert().accept();
            Thread.sleep(500);
            System.out.println("se acepta el alert" + "\n");

            //Hacemos click al tercer boton

            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(500);
            System.out.println("se abre el alert de acept y cancel" + "\n");

            //Cambiamos al alert que saldrá y acceptamos

            driver.switchTo().alert();
            driver.switchTo().alert().accept();
            Thread.sleep(500);  
            System.out.println("se acepta el alert" + "\n");

            //Hacemos click al tercer boton

            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(500);
            System.out.println("se abre el alert de acept y cancel" + "\n");

            //Cambiamos al alert que saldrá y cancelamos

            driver.switchTo().alert();
            driver.switchTo().alert().dismiss();
            Thread.sleep(500);     
            System.out.println("se cancela el alert" + "\n");

            //Hacemos click al cuarto boton

            driver.findElement(By.id("promtButton")).click();
            Thread.sleep(500);
            System.out.println("se abre el alert de texto" + "\n");
            
            //Cambiamos al alert que saldrá y escrivimos la Prueba y aceptamos

            driver.switchTo().alert();
            driver.switchTo().alert().sendKeys(jsonReader.dato("CP010", "alertBox"));
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);  
            System.out.println("se ha escrito el texto y se ha aceptado el alert" + "\n");

        } catch(IllegalArgumentException e){
            System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP010\\NullXpathKey.png"));
        } catch(ElementClickInterceptedException e){
            System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP010\\ElementOnTop.png"));
        } catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("El ID o Xpath especificado no es correcto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP010\\NullIdOrXpath.png"));
        } catch (WebDriverException e){
            System.out.println("La URL especificada no existe");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP010\\URLError.png"));
        } catch (FileNotFoundException e){
            System.out.println("El archivo no esta bien especificado o no existe");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP010\\NoFile.png"));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El Array del Excel no contiene esa posición");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP010\\ArrayExcel.png"));
        } catch (NullPointerException e){
            System.out.println("El Json no contiene esa clave o valor");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP010\\JsonKeyValue.png"));
        } finally{
        driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP011_Frames() throws InterruptedException, IOException {

        testId = "CP011_Frames";
        
        try{
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);
            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Frames")));
            submenu.click();
            Thread.sleep(500);
            
            //Cambiamos a la perspectiva del frame1

            driver.switchTo().frame("frame1");

            //Extraemos el texto del frame

            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            System.out.println("se ha extraido el texto del frame de arriba"+"\n");

            //Cambiamos a la pagina principal

            driver.switchTo().defaultContent();

            //Cambiamos al iFrame de abajo

            driver.switchTo().frame("frame2");
            
            //Extraemos el texto del frame

            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            System.out.println("se ha extraido el texto del frame de abajo"+"\n");

        } catch(IllegalArgumentException e){
            System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP011\\NullXpathKey.png"));
        } catch(ElementClickInterceptedException e){
            System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP011\\ElementOnTop.png"));
        } catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("El ID o Xpath especificado no es correcto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP011\\NullIdOrXpath.png"));
        } catch (WebDriverException e){
            System.out.println("La URL especificada no existe");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP011\\URLError.png"));
        } catch (FileNotFoundException e){
            System.out.println("El archivo no esta bien especificado o no existe");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP011\\NoFile.png"));
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP012_Nested_Frames() throws InterruptedException, IOException {

        testId = "CP012_Nested_Frames";
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);

            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Nested_Frames")));
            submenu.click();
            Thread.sleep(500);

            // Cambiar la perspectiva al iFrame Parent

                driver.switchTo().frame("frame1");

            // Extraer el Texto  <p>Parent frame</p>

                WebElement parentFrame = driver.findElement(By.xpath(propiedades.getProperty("Frame.ParentFrame")));
                System.out.println(parentFrame.getText());
                System.out.println("Se ha extraido el texto del parent frame" + "\n");

            // Cambiar la perspectiva al iFrame Child

                driver.switchTo().frame(0);

            // Extraer el Texto  <p>Child Iframe</p>

                System.out.println(driver.findElement(By.xpath(propiedades.getProperty("Frame.ChildFrame"))).getText());
                System.out.println("Se ha extraido el texto del child frame frame" + "\n");


            } catch(IllegalArgumentException e){
                System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP012\\NullXpathKey.png"));
            } catch(ElementClickInterceptedException e){
                System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP012\\ElementOnTop.png"));
            } catch (org.openqa.selenium.NoSuchElementException e){
                System.out.println("El ID o Xpath especificado no es correcto");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP012\\NullIdOrXpath.png"));
            } catch (WebDriverException e){
                System.out.println("La URL especificada no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP012\\URLError.png"));
            } catch (FileNotFoundException e){
                System.out.println("El archivo no esta bien especificado o no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP012\\NoFile.png"));
            } finally{
                driver.quit();
            }
    }
        @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP013_Modal_Dialogs() throws InterruptedException, IOException {


        testId = "CP013_Modal_Dialogs";
          try {
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);

            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Modal_Dialogs")));
            submenu.click();
            Thread.sleep(500);

            // Hacer click al botón de Small Modla

                driver.findElement(By.id("showSmallModal")).click();
                Thread.sleep(500);
                System.out.println("Se ha hecho click al boton de Small Modal" + "\n");

            // Extraemos el texto

                System.err.println(driver.findElement(By.xpath(propiedades.getProperty("text.SmallModal"))).getText());
                System.out.println("Se ha extraido el texto del Small Modal" + "\n");

            // Hacer click al botón de Close

                driver.findElement(By.id("closeSmallModal")).click();
                Thread.sleep(500);
                System.out.println("Se ha hecho click al boton de close de Small Modal" + "\n");

            // Hacer click al botón de Large modal

                driver.findElement(By.id("showLargeModal")).click();
                Thread.sleep(500);
                System.out.println("Se ha hecho click al boton de Large Modal" + "\n");

            // Extraemos el texto

                System.err.println(driver.findElement(By.xpath(propiedades.getProperty("text.largeModal"))).getText());
                System.out.println("Se ha extraido el texto del Large Modal" + "\n");

            } catch(IllegalArgumentException e){
                System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP013\\NullXpathKey.png"));
            } catch(ElementClickInterceptedException e){
                System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP013\\ElementOnTop.png"));
            } catch (org.openqa.selenium.NoSuchElementException e){
                System.out.println("El ID o Xpath especificado no es correcto");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP013\\NullIdOrXpath.png"));
            } catch (WebDriverException e){
                System.out.println("La URL especificada no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP013\\URLError.png"));
            } catch (FileNotFoundException e){
                System.out.println("El archivo no esta bien especificado o no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP013\\NoFile.png"));
            } finally{
                driver.quit();
            }
        }

}

