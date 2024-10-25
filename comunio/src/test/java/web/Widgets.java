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

public class Widgets extends Main{
    static Properties propiedades = new Properties();


    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP014_Date_Picker() throws InterruptedException, IOException, CsvException {

        testId = "CP014_Date_Picker";
          try {
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);
            
            MyReader jsonReader = new MyReader();

            CPD cpdList = new CPD();
            List<String[]> datos = cpdList.Datos();
            String[] datoRequerido = datos.get(12);
            String[] datosIncorrectos = datos.get(13);


            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Date_Picker")));
            submenu.click();
            Thread.sleep(500);

            //Hacer click  al cuadro de texto de Select 
            
                WebElement date = driver.findElement(By.id("datePickerMonthYearInput"));
                date.click();
                Thread.sleep(500);
                System.out.println("se abre el cuadro de Select Date" + "\n");

            // Hacer click en los meses
            // Hacer click en el mes January

            WebElement month = driver.findElement(By.xpath(propiedades.getProperty("select.MonthDate")));
              Select monthSelect = new Select(month);
              monthSelect.selectByVisibleText(jsonReader.dato("CP014", "selectdateMonth"));
              Thread.sleep(500);
              System.out.println("se selecciona January" + "\n");


            // Hacer click en los años
            // Hacer click en el año 2004

            WebElement year = driver.findElement(By.xpath(propiedades.getProperty("select.YearDate")));
              Select yearSelect = new Select(year);
              yearSelect.selectByVisibleText(jsonReader.dato("CP014", "selectDateYear"));
              Thread.sleep(500);
              System.out.println("se selecciona 2004" + "\n");


            // Hacer click en el dia 16

                driver.findElement(By.xpath(propiedades.getProperty("select.DayDate"))).click();
                Thread.sleep(500);
                System.out.println("se selecciona 16" + "\n");


            // escrivir una fecha incorrecta con letras
                date.sendKeys(Keys.CONTROL+"a");
                date.sendKeys(Keys.DELETE);
                Thread.sleep(500);
                date.sendKeys(datosIncorrectos[0]);
                date.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("se ha escrito una fecha incorrecta" + "\n");

                
            // escrivir una fecha incorrecta con numeros

                date.sendKeys(Keys.CONTROL+"a");
                date.sendKeys(Keys.DELETE);
                Thread.sleep(500);
                date.sendKeys(datosIncorrectos[1]);
                date.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("se ha escrito una fecha incorrecta con numeros" + "\n");


            // escrivir una fecha correcta 

                date.sendKeys(Keys.CONTROL+"a");
                date.sendKeys(Keys.DELETE);
                Thread.sleep(500);
                date.sendKeys(jsonReader.dato("CP014", "selectDateGood"));
                date.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("se ha escrito una fecha correcta" + "\n");



            // Hacer click  al cuadro de texto de Date And Time

                WebElement dateAndTime = driver.findElement(By.id("dateAndTimePickerInput"));
                dateAndTime.click();
                Thread.sleep(500);
                System.out.println("se selecciona el cuador de date and time" + "\n");


            // Hacer click en los meses

                driver.findElement(By.xpath(propiedades.getProperty("select.MonthDate&TimeSelect"))).click();
              
            // Hacer click en el mes January

                driver.findElement(By.xpath(propiedades.getProperty("select.MonthDate&Time"))).click();
                Thread.sleep(500);
                System.out.println("se selecciona January" + "\n");


            // Hacer click en los años

                driver.findElement(By.xpath(propiedades.getProperty("select.YearDate&TimeSelect"))).click();

            // Hacer click en el año 2021

                driver.findElement(By.xpath(propiedades.getProperty("select.YearDate&Time"))).click();
                Thread.sleep(500);
                System.out.println("se selecciona 2021" + "\n");

            // Hacer click en el dia 16

                driver.findElement(By.xpath(propiedades.getProperty("select.DayDate&Time"))).click();
                Thread.sleep(500);
                System.out.println("se selecciona 16" + "\n");

            // Hacer click en la hora 9:15

                driver.findElement(By.xpath(propiedades.getProperty("select.TimeDate&Time"))).click();
                Thread.sleep(500);
                System.out.println("se selecciona 9:15" + "\n");

            // escrivir una fecha incorrecta con letras

                dateAndTime.sendKeys(Keys.CONTROL+"a");
                dateAndTime.sendKeys(Keys.DELETE);
                Thread.sleep(500);
                dateAndTime.sendKeys(datosIncorrectos[2]);
                dateAndTime.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("se escrive una fecha incorrecta con letras" + "\n");

            // escrivir una fecha incorrecta con numeros

                dateAndTime.sendKeys(Keys.CONTROL+"a");
                dateAndTime.sendKeys(Keys.DELETE);
                Thread.sleep(500);
                dateAndTime.sendKeys(datosIncorrectos[3]);
                dateAndTime.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("se escrive una fecha incorrecta con numeros" + "\n");

            // escrivir una fecha y hora correcta

                dateAndTime.sendKeys(Keys.CONTROL+"a");
                dateAndTime.sendKeys(Keys.DELETE);
                Thread.sleep(500);
                dateAndTime.sendKeys(jsonReader.dato("CP014", "selectDateTimeGood"));
                dateAndTime.sendKeys(Keys.ENTER);
                Thread.sleep(500);
                System.out.println("se escrive una fecha correcta" + "\n");

        } catch(IllegalArgumentException e){
            System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP014\\NullXpathKey.png"));
        } catch(ElementClickInterceptedException e){
            System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP014\\ElementOnTop.png"));
        } catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("El ID o Xpath especificado no es correcto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP014\\NullIdOrXpath.png"));
        } catch (WebDriverException e){
            System.out.println("La URL especificada no existe");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP014\\URLError.png"));
        } catch (FileNotFoundException e){
            System.out.println("El archivo no esta bien especificado o no existe");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP014\\NoFile.png"));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El Array del Excel no contiene esa posición");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP014\\ArrayExcel.png"));
        } catch (NullPointerException e){
            System.out.println("El Json no contiene esa clave o valor");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP014\\JsonKeyValue.png"));
        } finally{
        driver.quit();
        }
    }
        @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP015_Slider() throws InterruptedException, IOException {

    testId = "CP015_Slider";
        try {

            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);
            
            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Slider")));
            submenu.click();
            Thread.sleep(500);

            //Mover el slider de arriba a abajo hasta el final

            WebElement slider = driver.findElement(By.xpath(propiedades.getProperty("slider.Slider")));
            for (int i = 0; i < 25; i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
            }
            System.out.println("el slider se ha movido hacia abajo del todo" + "\n");
            for (int i = 0; i < 100; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
            }
            System.out.println("el slider se ha movido hacia arriba del todo" + "\n");

        } catch(IllegalArgumentException e){
            System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP015\\NullXpathKey.png"));
        } catch(ElementClickInterceptedException e){
            System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP015\\ElementOnTop.png"));
        } catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("El ID o Xpath especificado no es correcto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP015\\NullIdOrXpath.png"));
        } catch (WebDriverException e){
            System.out.println("La URL especificada no existe");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP015\\URLError.png"));
        } catch (FileNotFoundException e){
            System.out.println("El archivo no esta bien especificado o no existe");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP015\\NoFile.png"));
        } finally{
            driver.quit();
        }
    }
            @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP016_progres_Bar() throws InterruptedException, IOException {

        testId = "CP016_progres_Bar";
          try {
            
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);

            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Progress_Bar")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
            Thread.sleep(500); 
            submenu.click();
            Thread.sleep(500);

            // Hacer click en el botón Start

                WebElement button = driver.findElement(By.id("startStopButton"));
                button.click();
                Thread.sleep(500);
                System.out.println("se hace click al boton para empecar la progress bar" + "\n");
            // Hacer click en el botón Stop

                button.click();
                Thread.sleep(500);
                button.click();
                System.out.println("se para a mitad la progress bar y se vuelve a iniciar" + "\n");

                
            // Cuando se llene hacer click en reset
                // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                // wait.until(new ExpectedCondition<Boolean>() {
                //   public Boolean apply(WebDriver driver) {
                //       WebElement barraProgreso = driver.findElement(By.id("progressBar"));
                //       String valor = barraProgreso.getAttribute("aria-valuenow");
                //       return valor.equals("100");
                //   }
                // });

                Thread.sleep(11000);
                driver.findElement(By.id("resetButton")).click();
                Thread.sleep(500);
                System.out.println("se reinicia la progress bar" + "\n");


            } catch(IllegalArgumentException e){
                System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP016\\NullXpathKey.png"));
            } catch(ElementClickInterceptedException e){
                System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP016\\ElementOnTop.png"));
            } catch (org.openqa.selenium.NoSuchElementException e){
                System.out.println("El ID o Xpath especificado no es correcto");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP016\\NullIdOrXpath.png"));
            } catch (WebDriverException e){
                System.out.println("La URL especificada no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP016\\URLError.png"));
            } catch (FileNotFoundException e){
                System.out.println("El archivo no esta bien especificado o no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP016\\NoFile.png"));
            } finally{
                driver.quit();
            }
        }
            @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP017_Menu() throws InterruptedException, IOException {

        testId = "CP017_Menu";
          try {
            FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
            propiedades.load(input);

            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);       
            WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Menu")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
            Thread.sleep(500); 
            submenu.click();
            Thread.sleep(500);


            // hacer click en Main Item 1
                driver.findElement(By.xpath(propiedades.getProperty("Menu.MainItem1"))).click();
                Thread.sleep(500);
                System.out.println("se hace click al main item 1" + "\n");
            // hacer click en Main Item 2

                WebElement subMenu2 = driver.findElement(By.xpath(propiedades.getProperty("Menu.MainItem2")));
                subMenu2.click();
                Thread.sleep(500);
                System.out.println("se hace click al main item 2" + "\n");

            // hacer click en Main Item 3

                driver.findElement(By.xpath(propiedades.getProperty("Menu.MainItem3"))).click();
                Thread.sleep(500);
                System.out.println("se hace click al main item 3" + "\n");

            // Pasar por encima del main item 2

                subMenu2.click();
                Thread.sleep(500);
                System.out.println("se hace click al main item 2" + "\n");

            // Hacer click en sub item
            
                driver.findElement(By.xpath(propiedades.getProperty("Menu.SubItem1"))).click();
                Thread.sleep(500);
                System.out.println("se hace click al subItem" + "\n");

            // Hacer click en sub Item

                driver.findElement(By.xpath(propiedades.getProperty("Menu.SubItem2"))).click();
                Thread.sleep(500);
                System.out.println("se hace click al subItem" + "\n");

            // Pasar por encima del SUB SUB List

                driver.findElement(By.xpath(propiedades.getProperty("Menu.SubSubList"))).click();
                Thread.sleep(500);
                System.out.println("se hace click al SUB SUB list" + "\n");

            // Hacer click en sub sub Item 1

                driver.findElement(By.xpath(propiedades.getProperty("Menu.SubSubItem1"))).click();
                Thread.sleep(500);
                System.out.println("se hace click al SUB SUB item1" + "\n");

            // Hacer click en sub sub Item 2

                driver.findElement(By.xpath(propiedades.getProperty("Menu.SubSubItem2"))).click();
                Thread.sleep(500);
                System.out.println("se hace click al SUB SUB item2" + "\n");

            } catch(IllegalArgumentException e){
                System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP017\\NullXpathKey.png"));
            } catch(ElementClickInterceptedException e){
                System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP017\\ElementOnTop.png"));
            } catch (org.openqa.selenium.NoSuchElementException e){
                System.out.println("El ID o Xpath especificado no es correcto");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP017\\NullIdOrXpath.png"));
            } catch (WebDriverException e){
                System.out.println("La URL especificada no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP017\\URLError.png"));
            } catch (FileNotFoundException e){
                System.out.println("El archivo no esta bien especificado o no existe");
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP017\\NoFile.png"));
            } finally{
                driver.quit();
            }
        }
        @Test(description = "Prueba DemoQA Elements Text box")
        @Story("Elements")
        @Description("Rellenar textbox")
        public void CP018_Select_Menu() throws InterruptedException, IOException {
    
            testId = "CP018_Select_Menu";
            try {
                FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\seleniumprincipio\\seleniumprincipio\\src\\test\\resources\\properties.properties");
                propiedades.load(input);

                driver.get("https://demoqa.com");
                Thread.sleep(500);

                WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
                menu.click();
                Thread.sleep(500);    

                WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Select_Menu")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
                Thread.sleep(500); 
                submenu.click();
                Thread.sleep(500);
            
                // Hacer click en el menu de select value
                // Hacer click en Group1, option 1 

                    driver.findElement(By.id("react-select-2-input")).sendKeys("Group 1, option 1"+ Keys.ENTER);
                    Thread.sleep(500);
                    System.out.println("se selecciona Group1, option 1" + "\n");
                    
                // Hacer click en el menu de Select One
                // Hacer click en Dr.

                    driver.findElement(By.id("react-select-3-input")).sendKeys("Dr."+ Keys.ENTER);
                    Thread.sleep(500);
                    System.out.println("se selecciona Dr." + "\n");

                // Hacer click en el menu de old Style Select Menu
                // Hacer click en Green

                    WebElement select = driver.findElement(By.id("oldSelectMenu"));
                    Select selectStyle = new Select(select);
                    selectStyle.selectByVisibleText("Green");
                    Thread.sleep(500);
                    System.out.println("se selecciona Green" + "\n");

                // Hacer click en el menu de Multiselect drop down
                // Hacer click en Green

                    WebElement multiSelect = driver.findElement(By.id("react-select-4-input"));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiSelect);
                    multiSelect.sendKeys("Green"+ Keys.ENTER);
                    Thread.sleep(500);
                    System.out.println("se selecciona Green" + "\n");

                // Hacer click en Blue

                    multiSelect.sendKeys("Blue"+ Keys.ENTER);
                    Thread.sleep(500);
                    System.out.println("se selecciona Blue" + "\n");

                // Hacer click en la cruz del Blue

                    driver.findElement(By.xpath(propiedades.getProperty("close.CloseBlue"))).click();
                    Thread.sleep(500);
                    System.out.println("se desselecciona Green" + "\n");

                // Hacer click en Volvo de Standard multi select

                    WebElement cars = driver.findElement(By.id("cars"));
                    Select volvoSelect = new Select(cars);
                    volvoSelect.selectByVisibleText("Volvo");
                    Thread.sleep(500);
                    System.out.println("se selecciona Volvo" + "\n");

                // hacer ctrl click en Saab

                    Select saabSelect = new Select(cars);
                    saabSelect.selectByVisibleText("Saab");
                    Thread.sleep(500);
                    System.out.println("se selecciona Saab" + "\n");

                } catch(IllegalArgumentException e){
                    System.out.println("El xpath es nulo. Es probable que hayas indicado mal la clave del properties");
                    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP018\\NullXpathKey.png"));
                } catch(ElementClickInterceptedException e){
                    System.out.println("Otro elemento esta puesto encima del elemento que quieres cickar");
                    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP018\\ElementOnTop.png"));
                } catch (org.openqa.selenium.NoSuchElementException e){
                    System.out.println("El ID o Xpath especificado no es correcto");
                    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP018\\NullIdOrXpath.png"));
                } catch (WebDriverException e){
                    System.out.println("La URL especificada no existe");
                    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP018\\URLError.png"));
                } catch (FileNotFoundException e){
                    System.out.println("El archivo no esta bien especificado o no existe");
                    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(scrFile, new File("c:\\capturas\\CP018\\NoFile.png"));
                } finally{
                    driver.quit();
                }
        }   
}
