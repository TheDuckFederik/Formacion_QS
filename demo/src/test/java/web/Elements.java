package web;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

import com.google.gson.Gson;


public class Elements extends Main {

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar Text Box")
    public void TC001_TextBox() throws InterruptedException, IOException, CsvException {
        testId = "TC001_TextBox";
         try{

            // String[] datosCorrectosCP001 = datosCsv().get(2);
            // String[] datosErroneosCP001 = datosCsv().get(3);
            
            System.out.println();
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");        
  
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Elements" + "\n");

            WebElement textbox = driver.findElement(By.xpath(propiedades.getProperty("elements.textbox")));
            textbox.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Text Box" + "\n");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  

            WebElement fullname = driver.findElement(By.xpath(propiedades.getProperty("textbox.fullname")));
            fullname.sendKeys(datoJson("CP001", "nombre"));
            Thread.sleep(100);
            System.out.println("Se rellena el campo Full Name" + "\n");

            WebElement email = driver.findElement(By.xpath(propiedades.getProperty("textbox.email")));
            email.sendKeys(datoJson("CP001", "correobad"));
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");
            
            WebElement caddress = driver.findElement(By.xpath(propiedades.getProperty("textbox.current_address")));
            caddress.sendKeys(datoJson("CP001", "address"));
            Thread.sleep(100);
            System.out.println("Se rellena el campo Current Address" + "\n");

            WebElement paddress = driver.findElement(By.xpath(propiedades.getProperty("textbox.permanent_address")));
            paddress.sendKeys(datoJson("CP001", "addressp"));
            Thread.sleep(100);
            System.out.println("Se rellena el campo Permanent Address" + "\n");

            WebElement submit = driver.findElement(By.xpath(propiedades.getProperty("textbox.submit")));
            submit.clear();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("textbox.email"))).clear();

            WebElement email2 = driver.findElement(By.xpath(propiedades.getProperty("textbox.email")));
            email2.sendKeys(datoJson("CP001", "correo"));
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");

            WebElement submit2 = driver.findElement(By.xpath(propiedades.getProperty("textbox.submit")));
            submit2.click();
            Thread.sleep(100);
            System.out.println("Nos devuelve los datos que hemos puesto anteriormente en los campos" + "\n");

            System.out.println(driver.findElement(By.xpath(propiedades.getProperty(""))).getText());

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP001\\NullXpath.png"));

        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP001\\InterceptedButton.png"));

        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP001\\TextoNulo.png")); 

        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP001\\AcciónInvalida.png"));

        } finally{
            driver.quit();
            
        }
    }
    @Test(description = "Prueba DemoQA Elements Check box")
    @Story("Elements")
    @Description("Probar Check Box")
    public void TC002_CheckBox() throws InterruptedException, IOException {
        testId = "TC002_CheckBox";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Elements" + "\n");

            WebElement checkbox = driver.findElement(By.xpath(propiedades.getProperty("elements.checkbox")));
            checkbox.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Check Box" + "\n");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  

            WebElement home = driver.findElement(By.xpath(propiedades.getProperty("checkbox.home")));
            home.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Home" + "\n");

            WebElement homed = driver.findElement(By.xpath(propiedades.getProperty("checkbox.homed")));
            homed.click();
            Thread.sleep(100);
            System.out.println("Se abre el desplegable Home" + "\n");

            WebElement desktopd = driver.findElement(By.xpath(propiedades.getProperty("checkbox.desktopd")));
            desktopd.click();
            Thread.sleep(100);
            System.out.println("Se abre el desplegable Desktop" + "\n");

            WebElement documentsd = driver.findElement(By.xpath(propiedades.getProperty("checkbox.documentsd")));
            documentsd.click();
            Thread.sleep(100);
            System.out.println("Se abre el desplegable Documents" + "\n");

            WebElement downloadsd = driver.findElement(By.xpath(propiedades.getProperty("checkbox.downloadsd")));
            downloadsd.click();
            Thread.sleep(100);
            System.out.println("Se abre el desplegable Downloads" + "\n");

            WebElement workspaced = driver.findElement(By.xpath(propiedades.getProperty("checkbox.workspaced")));
            workspaced.click();
            Thread.sleep(100);
            System.out.println("Se abre el desplegable WorkSpace" + "\n");


            WebElement officed = driver.findElement(By.xpath(propiedades.getProperty("checkbox.officed")));
            officed.click();
            Thread.sleep(100);
            System.out.println("Se abre el desplegable Office" + "\n");


            WebElement home2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.home")));
            home2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla Home" + "\n");


            WebElement desktop = driver.findElement(By.xpath(propiedades.getProperty("checkbox.desktop")));
            desktop.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Desktop" + "\n");

            WebElement documents = driver.findElement(By.xpath(propiedades.getProperty("checkbox.documents")));
            documents.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Documents" + "\n");

            WebElement downloads = driver.findElement(By.xpath(propiedades.getProperty("checkbox.downloads")));
            downloads.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Downloads" + "\n");

            WebElement desktop2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.desktop")));
            desktop2.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Desktop" + "\n");

            WebElement documents2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.documents")));
            documents2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla Documents" + "\n");

            WebElement downloads2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.downloads")));
            downloads2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla Downloads" + "\n");

            WebElement workspace = driver.findElement(By.xpath(propiedades.getProperty("checkbox.workspace")));
            workspace.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Workspace" + "\n");

            WebElement office = driver.findElement(By.xpath(propiedades.getProperty("checkbox.office")));
            office.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Office" + "\n");

            WebElement workspace2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.workspace")));
            workspace2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla Workspace" + "\n");

            WebElement office2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.office")));
            office2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla Office" + "\n");

            WebElement notes = driver.findElement(By.xpath(propiedades.getProperty("checkbox.notes")));
            notes.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Notes" + "\n");

            WebElement react = driver.findElement(By.xpath(propiedades.getProperty("checkbox.react")));
            react.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla React" + "\n");

            WebElement public1 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.public")));
            public1.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Public" + "\n");

            WebElement wordfile = driver.findElement(By.xpath(propiedades.getProperty("checkbox.wordfile.doc")));
            wordfile.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Word File.doc" + "\n");

            WebElement notes2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.notes")));
            notes2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla Notes" + "\n");

            WebElement react2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.react")));
            react2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla React" + "\n");

            WebElement public2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.public")));
            public2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla Public" + "\n");

            WebElement wordfile2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.wordfile.doc")));
            wordfile2.click();
            Thread.sleep(100);
            System.out.println("Se deselecciona la casilla Word File.doc" + "\n");

            WebElement officed2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.officed")));
            officed2.click();
            Thread.sleep(100);
            System.out.println("Se cierra el desplegable Office" + "\n");

            WebElement workspaced2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.workspaced")));
            workspaced2.click();
            Thread.sleep(100);
            System.out.println("Se cierra el desplegable WorkSpace" + "\n");

            WebElement downloadsd2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.downloadsd")));
            downloadsd2.click();
            Thread.sleep(100);
            System.out.println("Se cierra el desplegable Downloads" + "\n");

            WebElement documentsd2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.documentsd")));
            documentsd2.click();
            Thread.sleep(100);
            System.out.println("Se cierra el desplegable Documents" + "\n");

            WebElement desktopd2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.desktopd")));
            desktopd2.click();
            Thread.sleep(100);
            System.out.println("Se cierra el desplegable Desktop" + "\n");

            WebElement homed2 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.homed")));
            homed2.click();
            Thread.sleep(100);
            System.out.println("Se cierra el desplegable Home" + "\n");

            WebElement home3 = driver.findElement(By.xpath(propiedades.getProperty("checkbox.home")));
            home3.click();
            Thread.sleep(100);
            System.out.println("Se selecciona la casilla Home" + "\n");

            WebElement mas = driver.findElement(By.xpath(propiedades.getProperty("checkbox.mas")));
            mas.click();
            Thread.sleep(100);
            System.out.println("Se abren todos los desplegables" + "\n");

            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("checkbox.result"))).getText());

            WebElement menos = driver.findElement(By.xpath(propiedades.getProperty("checkbox.menos")));;
            menos.click();
            Thread.sleep(100);
            System.out.println("\n" + "Se cierran todos los desplegables" + "\n");

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP002\\NullXpath.png"));

        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP002\\InterceptedButton.png"));

        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP002\\TextoNulo.png")); 

        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP002\\AcciónInvalida.png"));
        
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Radio Button")
    @Story("Elements")
    @Description("Rellenar Radio Button")
    public void TC003_RadioButton() throws InterruptedException, IOException {
        testId = "TC003_RadioButton";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Elements" + "\n");

            WebElement radiobutton = driver.findElement(By.xpath(propiedades.getProperty("elements.radiobutton")));
            radiobutton.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Radio Button" + "\n");

            WebElement yes = driver.findElement(By.xpath(propiedades.getProperty("radiobutton.yes")));
            yes.click();
            Thread.sleep(100);

            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("radiobutton.getyes"))).getText());

            WebElement impresive = driver.findElement(By.xpath(propiedades.getProperty("radiobutton.impressive")));
            impresive.click();
            Thread.sleep(100);

            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("radiobutton.getimpressive"))).getText());

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP003\\NullXpath.png"));

        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP003\\InterceptedButton.png"));

        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP003\\TextoNulo.png")); 

        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP003\\AcciónInvalida.png"));
        
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Web Tables")
    @Story("Elements")
    @Description("Probar Web Tables")
    public void TC004_WebTables() throws InterruptedException, IOException, CsvException {
        testId = "TC004_WebTables";
         try{

            String[] datosCorrectosCP004 = datosCsv().get(7);
            String[] datosErroneosCP004 = datosCsv().get(8);
            
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Elements" + "\n");

            WebElement webt = driver.findElement(By.xpath(propiedades.getProperty("elements.webtables")));
            webt.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Web Tables" + "\n");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);"); 

            driver.findElement(By.xpath(propiedades.getProperty("webtables.firstname"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético descendiente respecto al nombre" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.firstname"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético ascendiente respecto al nombre" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.lastname"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético descendiente respecto al apellido" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.lastname"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético ascendiente respecto al apellido" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.age"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético descendiente respecto a la edad" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.age"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético ascendiente respecto a la edad" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.email"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético descendiente respecto al correo" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.email"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético ascendiente respecto al correo" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.salary"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético descendiente respecto al salario" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.salary"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético ascendiente respecto al salario" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.department"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético descendiente respecto al departamento" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.department"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético ascendiente respecto al departamento" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.action"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético descendiente respecto a la acción" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.action"))).click();
            Thread.sleep(100);
            System.out.println("La lista se ordena en orden alfabético ascendiente respecto a la acción" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.add"))).click();
            Thread.sleep(100);
            System.out.println("Se abre un Registration Form" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.submit"))).click();
            Thread.sleep(100);
            System.out.println("Nos sale un error en todos los campos sin rellenar" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.firstnamef"))).sendKeys(datosCorrectosCP004[0]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo First Name" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.lastnamef"))).sendKeys(datosCorrectosCP004[1]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo Last Name" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.emailf"))).sendKeys(datosErroneosCP004[2]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.agef"))).sendKeys(datosErroneosCP004[3]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo Age" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.salaryf"))).sendKeys(datosErroneosCP004[4]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo Salary" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.departmentf"))).sendKeys(datosCorrectosCP004[5]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo Department" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.submit"))).click();
            Thread.sleep(100);
            System.out.println("Nos da error en los campos Email Age y Salary" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.emailf"))).clear();
            driver.findElement(By.xpath(propiedades.getProperty("webtables.emailf"))).sendKeys(datosCorrectosCP004[2]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.agef"))).clear();
            driver.findElement(By.xpath(propiedades.getProperty("webtables.agef"))).sendKeys(datosCorrectosCP004[3]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo Age" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.salaryf"))).clear();
            driver.findElement(By.xpath(propiedades.getProperty("webtables.salaryf"))).sendKeys(datosCorrectosCP004[4]);
            Thread.sleep(100);
            System.out.println("Se rellena el campo Salary" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.submit"))).click();
            Thread.sleep(100);
            System.out.println("El ejemplo se añade a nuestra lista" + "\n");

            WebElement rows = driver.findElement(By.xpath(propiedades.getProperty("webtables.rows")));
            Select rowsSelect = new Select(rows);
            rowsSelect.selectByVisibleText("100 rows");
            Thread.sleep(100);
            System.out.println("Aparecen 100 filas en la página" + "\n");

            js.executeScript("window.scrollBy(0, 1100);"); 

            WebElement rows2 = driver.findElement(By.xpath(propiedades.getProperty("webtables.rows")));
            Select rowsSelect2 = new Select(rows2);
            rowsSelect2.selectByVisibleText("50 rows");
            Thread.sleep(100);
            System.out.println("Aparecen 50 filas en la página" + "\n");

            WebElement rows3 = driver.findElement(By.xpath(propiedades.getProperty("webtables.rows")));
            Select rowsSelect3 = new Select(rows3);
            rowsSelect3.selectByVisibleText("25 rows");
            Thread.sleep(100);
            System.out.println("Aparecen 25 filas en la página" + "\n");

            WebElement rows4 = driver.findElement(By.xpath(propiedades.getProperty("webtables.rows")));
            Select rowsSelect4 = new Select(rows4);
            rowsSelect4.selectByVisibleText("20 rows");
            Thread.sleep(100);
            System.out.println("Aparecen 20 filas en la página" + "\n");

            WebElement rows5 = driver.findElement(By.xpath(propiedades.getProperty("webtables.rows")));
            Select rowsSelect5 = new Select(rows5);
            rowsSelect5.selectByVisibleText("10 rows");
            Thread.sleep(100);
            System.out.println("Aparecen 10 filas en la página" + "\n");

            WebElement rows6 = driver.findElement(By.xpath(propiedades.getProperty("webtables.rows")));
            Select rowsSelect6 = new Select(rows6);
            rowsSelect6.selectByVisibleText("5 rows");
            Thread.sleep(100);
            System.out.println("Aparecen 5 filas en la página" + "\n");

                for(int i = 1; i < 3; i++) {
                
                driver.findElement(By.xpath(propiedades.getProperty("webtables.add"))).click();
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.firstnamef"))).sendKeys(datosCorrectosCP004[0]);
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.lastnamef"))).sendKeys(datosCorrectosCP004[1]);
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.emailf"))).sendKeys(datosCorrectosCP004[2]);
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.agef"))).sendKeys(datosCorrectosCP004[3]);
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.salaryf"))).sendKeys(datosCorrectosCP004[4]);
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.departmentf"))).sendKeys(datosCorrectosCP004[5]);
                Thread.sleep(100);
        
                driver.findElement(By.xpath(propiedades.getProperty("webtables.submit"))).click();
                Thread.sleep(100);
            }

        driver.findElement(By.xpath(propiedades.getProperty("webtables.next"))).click();
        Thread.sleep(100);
        System.out.println("Pasa a la siguiente página" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("webtables.previous"))).click();
        Thread.sleep(100);
        System.out.println("Pasa a la anterior página" + "\n");

        driver.findElement(By.xpath(propiedades.getProperty("webtables.search"))).sendKeys(datosCorrectosCP004[0]);
        Thread.sleep(100);
        System.out.println("Filtra los nombres de la tabla que empiecen por lo que hemos escrito" + "\n");

    } catch(IllegalArgumentException e){
        System.out.println("Xpath nulo");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\captura\\CP004\\NullXpath.png"));

    } catch(ElementClickInterceptedException e){
        System.out.println("No se puede hacer click en el botón");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\captura\\CP004\\InterceptedButton.png"));

    } catch(NullPointerException e){
        System.out.println("El texto es nulo");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\captura\\CP004\\TextoNulo.png")); 

    } catch(InvalidElementStateException e){
        System.out.println("No se puede hacer esta acción es este tipo de objeto");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\captura\\CP004\\AcciónInvalida.png"));
    
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Buttons")
    @Story("Elements")
    @Description("Probar Buttons")
    public void TC005_Buttons() throws InterruptedException, IOException {
        testId = "TC005_Buttons";
         try{

            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Elements" + "\n");
        
            WebElement buttons = driver.findElement(By.xpath(propiedades.getProperty("elements.buttons")));
            buttons.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Buttons" + "\n");
        
            Actions action = new Actions(driver);
        
            WebElement doble1 = driver.findElement(By.xpath(propiedades.getProperty("buttons.doble")));
            action.moveToElement(doble1).doubleClick().perform();
            Thread.sleep(100);
        
            WebElement derecha = driver.findElement(By.xpath(propiedades.getProperty("buttons.right")));
            action.moveToElement(derecha).contextClick().perform();
            Thread.sleep(100);
        
            driver.findElement(By.xpath(propiedades.getProperty("buttons.click"))).click();
            Thread.sleep(100);
        
            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("buttons.clickm"))).getText());
            
            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("buttons.rightm"))).getText());
            
            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("buttons.doblem"))).getText());

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP005\\NullXpath.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP005\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP005\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP005\\AcciónInvalida.png"));
        
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Upload and Download")
    @Story("Elements")
    @Description("Probar Upload and Download")
    public void TC006_Upload_and_Download() throws InterruptedException, IOException {
        testId = "TC006_Upload_and_Download";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Elements" + "\n");

            WebElement uploadanddownload = driver.findElement(By.xpath(propiedades.getProperty("elements.upload")));
            uploadanddownload.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Upload and Download" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("upload.download"))).click();
            Thread.sleep(100);
            System.out.println("Se descarga el archivo sampleFile.jpeg" + "\n");

            WebElement upload = driver.findElement(By.xpath(propiedades.getProperty("upload.archivo")));
            upload.sendKeys("C:\\Users\\ricard.ferrando.ext\\Downloads\\sampleFile.jpeg");
            Thread.sleep(100);
            System.out.println("Se sube el archivo" + "\n");

            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("upload.subido"))).getText());

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP006\\NullXpath.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP006\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP006\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP006\\AcciónInvalida.png"));
        
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Dynamic Properties")
    @Story("Elements")
    @Description("Probar Dynamic Properties")
    public void TC007_Dynamic_Properties() throws InterruptedException, IOException {
        testId = "TC007_Dynamic_Properties";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Elements" + "\n");

            WebElement dynamic = driver.findElement(By.xpath(propiedades.getProperty("elements.properties")));
            dynamic.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Dynamic Properties" + "\n");
            
            WebElement colorChangeButton = driver.findElement(By.id("colorChange"));

            String initialColor = colorChangeButton.getCssValue("color");
            System.out.println("Color inicial: " + Color.fromString(initialColor).asHex());

            Thread.sleep(5000);

            String changedColor = colorChangeButton.getCssValue("color");
            System.out.println("Color después de 5 segundos: " + Color.fromString(changedColor).asHex());

        } catch(IllegalArgumentException e){
            System.out.println("Xpath nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP007\\XpathNulo.png"));
    
        } catch(ElementClickInterceptedException e){
            System.out.println("No se puede hacer click en el botón");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP007\\InterceptedButton.png"));
    
        } catch(NullPointerException e){
            System.out.println("El texto es nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP007\\TextoNulo.png")); 
    
        } catch(InvalidElementStateException e){
            System.out.println("No se puede hacer esta acción es este tipo de objeto");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP007\\AcciónInvalida.png"));

        } catch(NoSuchElementException e){
            System.out.println("Id nulo");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\captura\\CP007\\IdNulo.png"));
        
        } finally{
            driver.quit();
        }
    }
    public List<String[]> datosCsv() throws IOException, CsvException{
        String file = "C:\\Users\\ricard.ferrando.ext\\OneDrive - GFI\\Documentos\\FormacionQS\\Formacion_QS\\demo\\CSV.csv";

        CSVReader reader = new CSVReader(new FileReader(file));
        List<String[]> listDatos = reader.readAll();
        reader.close();
        return listDatos;
        
    }
    public String datoJson(String clavePrueba, String clave) throws IOException{

        Reader myreader = Files.newBufferedReader(Paths.get("C:\\Users\\ricard.ferrando.ext\\OneDrive - GFI\\Documentos\\FormacionQS\\Formacion_QS\\demo\\src\\test\\resources\\config.json"));
        Gson gson = new Gson();
        Map<?,Map<?,?>> userMap = gson.fromJson(myreader, Map.class);
        Map<?,?> subMap = userMap.get(clavePrueba);
        String valor = subMap.get(clave).toString();
        return valor;
    }
}