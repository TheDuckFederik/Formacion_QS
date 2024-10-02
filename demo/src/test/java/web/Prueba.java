package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Prueba extends Main {
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar Text Box")
    public void TC001_TextBox() throws InterruptedException, IOException {
        testId = "TC001_TextBox";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");        
  
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Elements" + "\n");

            WebElement textbox = driver.findElement(By.xpath(propiedades.getProperty("menu.textbox")));
            textbox.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Text Box" + "\n");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  

            WebElement fullname = driver.findElement(By.xpath(propiedades.getProperty("textbox.fullname")));
            fullname.sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Full Name" + "\n");

            WebElement email = driver.findElement(By.xpath(propiedades.getProperty("textbox.email")));
            email.sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");
            
            WebElement caddress = driver.findElement(By.xpath(propiedades.getProperty("textbox.current_address")));
            caddress.sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Current Address" + "\n");

            WebElement paddress = driver.findElement(By.xpath(propiedades.getProperty("textbox.permanent_address")));
            paddress.sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Permanent Address" + "\n");

            WebElement submit = driver.findElement(By.xpath(propiedades.getProperty("textbox.submit")));
            submit.click();
            Thread.sleep(100);

            driver.findElement(By.xpath(propiedades.getProperty("textbox.email"))).clear();

            WebElement email2 = driver.findElement(By.xpath(propiedades.getProperty("textbox.email")));
            email2.sendKeys("ejemplo@ejemplo.com");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");

            WebElement submit2 = driver.findElement(By.xpath(propiedades.getProperty("textbox.submit")));
            submit2.click();
            Thread.sleep(100);
            System.out.println("Nos devuelve los datos que hemos puesto anteriormente en los campos" + "\n");

            System.out.println(driver.findElement(By.xpath(propiedades.getProperty(""))).getText());

        } catch(Exception e){
            e.printStackTrace();
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

            WebElement checkbox = driver.findElement(By.xpath(propiedades.getProperty("menu.checkbox")));
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

            WebElement menos = driver.findElement(By.xpath());
            menos.click();
            Thread.sleep(100);
            System.out.println("\n" + "Se cierran todos los desplegables" + "\n");

        } catch(Exception e){
            e.printStackTrace();
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

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Web Tables")
    @Story("Elements")
    @Description("Probar Web Tables")
    public void TC004_WebTables() throws InterruptedException, IOException {
        testId = "TC004_WebTables";
         try{
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

            driver.findElement(By.xpath(propiedades.getProperty("webtables.firstnamef"))).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo First Name" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.lastnamef"))).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Last Name" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.emailf"))).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.agef"))).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Age" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.salaryf"))).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Salary" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.departmentf"))).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Department" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.submit"))).click();
            Thread.sleep(100);
            System.out.println("Nos da error en los campos Email Age y Salary" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.emailf"))).clear();
            driver.findElement(By.xpath(propiedades.getProperty("webtables.emailf"))).sendKeys("ejemplo@ejemplo.com");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.agef"))).clear();
            driver.findElement(By.xpath(propiedades.getProperty("webtables.agef"))).sendKeys("44");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Age" + "\n");

            driver.findElement(By.xpath(propiedades.getProperty("webtables.salaryf"))).clear();
            driver.findElement(By.xpath(propiedades.getProperty("webtables.salaryf"))).sendKeys("4444");
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

            js.executeScript("window.scrollBy(0, 1500);"); 

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

                driver.findElement(By.xpath(propiedades.getProperty("webtables.firstnamef"))).sendKeys("ejemplo");
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.lastnamef"))).sendKeys("ejemplo");
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.emailf"))).sendKeys("ejemplo@ejemplo.com");
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.agef"))).sendKeys("44");
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.salaryf"))).sendKeys("4444");
                Thread.sleep(100);

                driver.findElement(By.xpath(propiedades.getProperty("webtables.departmentf"))).sendKeys("ejemplo");
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

        driver.findElement(By.xpath(propiedades.getProperty("webtables.search"))).sendKeys("ejemplo");
        Thread.sleep(100);
        System.out.println("Filtra los nombres de la tabla que empiecen por lo que hemos escrito" + "\n");

        } catch(Exception e){
            e.printStackTrace();
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

        } catch(Exception e){
            e.printStackTrace();
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
            Thread.sleep(1000);
            System.out.println("Se descarga el archivo sampleFile.jpeg" + "\n");

            WebElement upload = driver.findElement(By.xpath(propiedades.getProperty("upload.archivo")));
            upload.sendKeys("C:\\Users\\ricard.ferrando.ext\\Downloads\\sampleFile.jpeg");
            Thread.sleep(100);
            System.out.println("Se sube el archivo" + "\n");

            System.out.println(driver.findElement(By.xpath(propiedades.getProperty("upload.subido"))).getText());

        } catch(Exception e){
            e.printStackTrace();
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

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Forms Practice Form")
    @Story("Forms")
    @Description("Rellenar Practice Form")
    public void TC008_Practice_Form() throws InterruptedException, IOException {
        testId = "TC008_Practice_Form";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.forms")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Forms" + "\n");

            WebElement form = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div"));
            form.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Practice Form" + "\n");
            
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(100);

            driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo First Name" + "\n");

            driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Last Name" + "\n");

            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");

            driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
            Thread.sleep(100);
            System.out.println("El botón Male se selecciona" + "\n");

            driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("ejemplo");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Mobile" + "\n");

            driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
            Thread.sleep(100);
            System.out.println("Se abre un calendario" + "\n");

            WebElement mes = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
            Select mesSelect = new Select(mes);
            mesSelect.selectByVisibleText("April");
            Thread.sleep(100);
            

            WebElement año = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
            Select añoSelect = new Select(año);
            añoSelect.selectByVisibleText("2005");
            Thread.sleep(100);

            driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]")).click();
            Thread.sleep(100);
            System.out.println("Se selecciona la fecha" + "\n");

            WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
            subject.sendKeys("Maths");
            subject.sendKeys(Keys.ENTER);
            Thread.sleep(100);
            System.out.println("Se añade Maths al campo" + "\n");

            WebElement subject2 = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
            subject2.sendKeys("Arts");
            subject2.sendKeys(Keys.ENTER);
            Thread.sleep(100);
            System.out.println("Se añade Arts al campo" + "\n");

            driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[2]/div")).click();
            Thread.sleep(100);
            System.out.println("Se borra todo" + "\n");

            driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")).click();
            Thread.sleep(100);
            System.out.println("El botón Sports se selecciona" + "\n");

            driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]")).click();
            Thread.sleep(100);
            System.out.println("El botón Reading se selecciona" + "\n");

            driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]")).click();
            Thread.sleep(100);
            System.out.println("El botón Music se selecciona" + "\n");

            WebElement upload = driver.findElement(By.id("uploadPicture"));
            upload.sendKeys("C:\\Users\\ricard.ferrando.ext\\Downloads\\sampleFile.jpeg");
            Thread.sleep(100);
            System.out.println("Se sube el archivo" + "\n");
            
            driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("ejemplo");
            Thread.sleep(100);

            WebElement state = driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"));
            state.sendKeys("NCR");
            state.sendKeys(Keys.ENTER);
            Thread.sleep(100);
            System.out.println("El estado queda seleccionado en el menu" + "\n");

            WebElement city = driver.findElement(By.xpath("//*[@id=\"react-select-4-input\"]"));
            city.sendKeys("Delhi");
            city.sendKeys(Keys.ENTER);
            Thread.sleep(100);
            System.out.println("La ciudad queda seleccionada en el menu" + "\n");

            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(100);
            System.out.println("Nos da error en el campo Email y en el campo Mobile" + "\n");

            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).clear();
            Thread.sleep(100);

            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ejemplo@ejemplo.com");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Email" + "\n");

            driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).clear();
            Thread.sleep(100);

            driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("4444444444");
            Thread.sleep(100);
            System.out.println("Se rellena el campo Mobile" + "\n");

            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(100);
            System.out.println("Nos sale el mensaje Thanks for submitting the form y nos da un esquema con los datos que le hemos proporcionado anteriormente" + "\n");

            System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div")).getText());

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Browser Windows")
    @Story("Alerts, Frame & Windows")
    @Description("Probar Browser Windows")
    public void TC009_Browser_Windows() throws InterruptedException, IOException {
        testId = "TC009_Browser_Windows";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");           

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Alerts, Frame & Windows" + "\n"); 

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]"));
            form.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Dynamic Properties" + "\n"); 

            driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
            Thread.sleep(100);
            System.out.println("Se abre una pestaña" + "\n"); 

            driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
            Thread.sleep(100);            
            System.out.println("Se abre una ventana" + "\n"); 

            driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]")).click();
            Thread.sleep(100);
            System.out.println("Se abre una ventana con un mensaje" + "\n"); 

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Alerts")
    @Story("Alerts, Frame & Windows")
    @Description("Probar Alerts")
    public void TC010_Alerts() throws InterruptedException, IOException {
        testId = "TC010_Alerts";
         try{
            driver.get("https://demoqa.com");
            System.out.println("Se abre la página DemoQA" + "\n");           

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Alerts, Frame & Windows" + "\n"); 

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
            form.click();
            Thread.sleep(100);
            System.out.println("Se abre el apartado Alerts" + "\n");

            driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
            Thread.sleep(100);
            System.out.println("Nos sale el texto You clicked a button" + "\n");
            driver.switchTo().alert().accept();
            Thread.sleep(100);

            driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
            Thread.sleep(5000);
            System.out.println("Nos sale el texto This alert appeared after 5 seconds" + "\n");
            driver.switchTo().alert().accept();

            driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
            Thread.sleep(100);
            System.out.println("Nos sale el texto Do you confirm action?" + "\n");
            driver.switchTo().alert().dismiss();
            Thread.sleep(100);
            System.out.println("Nos sale el texto You selected Cancel" + "\n");
            

            driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
            Thread.sleep(100);
            System.out.println("Nos sale el texto Do you confirm action?" + "\n");
            driver.switchTo().alert().accept();
            Thread.sleep(100);
            System.out.println("Nos sale el texto You selected Ok" + "\n");

            driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
            Thread.sleep(100);
            driver.switchTo().alert().sendKeys("ejemplo");
            driver.switchTo().alert().accept();
            Thread.sleep(100);

            System.out.println(driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText());
            System.out.println(driver.findElement(By.xpath("//*[@id=\"promptResult\"]")).getText());

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Extraer Frames")
    public void TC011_Frames() throws InterruptedException, IOException {
        testId = "TC011_Frames";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]"));
            form.click();
            Thread.sleep(100);
            
            driver.switchTo().frame("frame1");
            WebElement textoFrame1 = driver.findElement(By.id("sampleHeading"));
            String textoArriba = textoFrame1.getText();
            System.out.println("Texto del iframe de arriba: " + textoArriba);
        
            driver.switchTo().defaultContent();

            driver.switchTo().frame("frame2"); 
            WebElement textoFrame2 = driver.findElement(By.id("sampleHeading"));
            String textoAbajo = textoFrame2.getText();
            System.out.println("Texto del iframe de abajo: " + textoAbajo);

            driver.switchTo().defaultContent();
        
            if (textoArriba.equals(textoAbajo)) {
            System.out.println("Los textos de ambos iframes son iguales.");
            }   else {
            System.out.println("Los textos de los iframes son diferentes.");
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Nested Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Extraer Nested Frames")
    public void TC012_Nested_Frames() throws InterruptedException, IOException {
        testId = "TC012_Nested_Frames";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]"));
            form.click();
            Thread.sleep(100);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(100);

            driver.switchTo().frame("frame1");
    
            WebElement textoParentFrame = driver.findElement(By.tagName("body"));
            String textoPadre = textoParentFrame.getText();
            System.out.println("Texto del Parent Frame: " + textoPadre);

            driver.switchTo().frame(0);
        
            WebElement textoChildFrame = driver.findElement(By.tagName("p"));
            String textoHijo = textoChildFrame.getText();
            System.out.println("Texto del Child Iframe: " + textoHijo);

            driver.switchTo().defaultContent();

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Modal_Dialogs")
    @Story("Alerts, Frame & Windows")
    @Description("Extraer Modal Dialogs")
    public void TC013_Modal_Dialogs() throws InterruptedException, IOException {
        testId = "TC013_Modal_Dialogs";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
            menu.click();
            Thread.sleep(100);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]"));
            form.click();
            Thread.sleep(100);

            driver.findElement(By.xpath("//*[@id=\"showSmallModal\"]")).click();
            Thread.sleep(100);

            WebElement textosmall = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]"));
            String smallm = textosmall.getText();
            System.out.println("Texto del Small Modal: " + smallm);

            driver.findElement(By.xpath("//*[@id=\"closeSmallModal\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"showLargeModal\"]")).click();
            Thread.sleep(500);

            WebElement textolarge = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]"));
            String largem = textolarge.getText();
            System.out.println("Texto del Large Modal: " + largem);

            driver.findElement(By.xpath("//*[@id=\"closeLargeModal\"]")).click();
            Thread.sleep(500);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Date_Picker")
    @Story("Widgets")
    @Description("Probar Date_Picker")
    public void TC014_Date_Picker() throws InterruptedException, IOException {
        testId = "TC014_Date_Picker";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath());
            form.click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]")).click();
            Thread.sleep(500);

            WebElement mes = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
            Select mesSelect = new Select(mes);
            mesSelect.selectByVisibleText("April");
            Thread.sleep(500);

            WebElement año = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
            Select añoSelect = new Select(año);
            añoSelect.selectByVisibleText("2005");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[11]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[7]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[40]")).click();
            Thread.sleep(500);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Slider")
    @Story("Widgets")
    @Description("Probar Slider")
    public void TC015_Slider() throws InterruptedException, IOException {
        testId = "TC015_Slider";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]"));
            form.click();
            Thread.sleep(500);

            WebElement slider = driver.findElement(By.xpath("//*[@id='sliderContainer']/div[1]/span/input"));

            for(int i = 1; i < 25; i++) {
                
                slider.sendKeys(Keys.ARROW_LEFT);

            }

            for(int i = 1; i < 100; i++) {
                
                slider.sendKeys(Keys.ARROW_RIGHT);

            }

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Progress Bar")
    @Story("Widgets")
    @Description("Probar Progress Bar")
    public void TC016_Progress_Bar() throws InterruptedException, IOException {
        testId = "TC016_Progress_Bar";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]"));
            form.click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
            Thread.sleep(6000);

            driver.findElement(By.xpath("//*[@id=\"resetButton\"]")).click();
            Thread.sleep(500);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Menu")
    @Story("Widgets")
    @Description("Probar Menu")
    public void TC017_Menu() throws InterruptedException, IOException {
        testId = "TC017_Menu";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]"));
            form.click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a")).click();
            Thread.sleep(500);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Select Menu")
    @Story("Widgets")
    @Description("Probar Select Menu")
    public void TC018_Select_Menu() throws InterruptedException, IOException {
        testId = "TC018_Select_Menu";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
            menu.click();
            Thread.sleep(500);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]"));
            form.click();
            Thread.sleep(500);

            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(500);

            driver.findElement(By.id("react-select-2-input")).sendKeys("Group 1, option 1"+ Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.id("react-select-3-input")).sendKeys("Mr."+ Keys.ENTER);
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]/option[3]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]/option[3]")).click();
            Thread.sleep(500);

            WebElement multiSelect = driver.findElement(By.id("react-select-4-input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiSelect);
            multiSelect.sendKeys("Green"+ Keys.ENTER);
            Thread.sleep(500);

            multiSelect.sendKeys("Blue"+ Keys.ENTER);
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[2]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"cars\"]/option[3]")).click();
            Thread.sleep(500);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}