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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvException;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Elements extends Main{
    static Properties propiedades = new Properties();


    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP_001_Text_Box() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
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
    
    
                driver.get("https://demoqa.com");
                Thread.sleep(500);
                WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
                menu.click();
                Thread.sleep(500);
                WebElement submenu = driver.findElement(By.id("item-0"));
                submenu.click();
                Thread.sleep(500);
    
               // Rellenar el apartado Full Name
    
                WebElement userName = driver.findElement(By.id("userName"));
                userName.sendKeys(jsonReader.dato("CP001","fullname"));
                System.out.println("Se ha escrito el username");
                Thread.sleep(500);
                // Introducir un Correo electronico erroneo
    
                WebElement email = driver.findElement(By.id("userEmail"));
                email.sendKeys(jsonReader.dato("CP001","correoMalo"));
                System.out.println("Se ha escrito el email incorrecto");
                Thread.sleep(500);
    
                //Pulsar el botón de submit
    
                WebElement submit = driver.findElement(By.id("submit"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
                submit.click();
                Thread.sleep(500);
    
                //Corregir el correo correcto
                email.clear();
                email.sendKeys(datoRequerido[1]);
                System.out.println("Se ha escrito el email correcto");
                Thread.sleep(500);
    
                //Rellenar el apartado de Current 
                
                WebElement currentAddress = driver.findElement(By.id("currentAddress"));
                currentAddress.sendKeys(jsonReader.dato("CP001","currAddress"));
                System.out.println("Se ha escrito la dirección");
                Thread.sleep(500);
    
                //Rellenar el apartado de Permanent Address
    
                WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
                permanentAddress.sendKeys(datoRequerido[3]);
                System.out.println("Se ha escrito la dirección permanente");
                Thread.sleep(500);
    
                //Hacemos click en el botón de submit
    
                submit.click();
    
                //Recoger los datos que la pagina nos ha proporcionado
    
                WebElement data = driver.findElement(By.xpath(propiedades.getProperty("textbox.result")));
                String dataText = data.getText();
    
                //Imprimimos los datos por pantalla
    
                System.out.println(dataText);


            
            
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

    @Test(description = "En esta prueba se comprobará que se pueden hacer click en los check Box")
    @Story("Elements")
    @Description("Hacer click en los check Box")
    public void CP_002_Check_Box() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "Entrar";
        
        try{
              driver.get("https://demoqa.com");
                Thread.sleep(500);
                WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
                menu.click();
                Thread.sleep(500);
                
                WebElement submenu = driver.findElement(By.id("item-1"));
                submenu.click();
                Thread.sleep(500);
    
              // Hacer clic en desplegable   de Home
    
                  WebElement homeDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.homedes")));           
                  homeDes.click();            
                  Thread.sleep(500);
                  System.out.println("home desplegado");
    
              // Hacer click en desplegable   de Desktop
                 
              WebElement desktopDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DeskDes")));       
              desktopDes.click();
              Thread.sleep(500);
              System.out.println("desktop desplegado");           
    
              // Hacer click en desplegable   de Documents
    
              WebElement documentsDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DocDes")));
              documentsDes.click();
              Thread.sleep(500); 
              System.out.println("documents desplegado");
    
              // Hacer click en desplegable de Downloads
    
              WebElement downloadsDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DowDes")));
              downloadsDes.click();
              Thread.sleep(500);
              System.out.println("downloads desplegado");
    
              // Hacer click en desplegable de WorkSpace
    
              WebElement workSpaceDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.WorkDes")));
              workSpaceDes.click();
              Thread.sleep(500);
              System.out.println("workspace desplegado");
    
              // Hacer click en desplegable de Office
    
              WebElement officeDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.OffDes")));
              ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", officeDes);
              Thread.sleep(500); 
              officeDes.click();
              Thread.sleep(500);
              System.out.println("office desplegado");
    
              // Hacer click en Check box de Notes
    
              WebElement notesBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.NotesBox")));
              notesBox.click();
              Thread.sleep(500);
              System.out.println("notes check");
    
              // Hacer click en Check box de Commands
    
              WebElement commandsBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.ComBox")));
              commandsBox.click();
              Thread.sleep(500);
              System.out.println("comands check");
    
              // Hacer click en Check box de Desktop
    
              WebElement desktopBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DeskBox")));
              desktopBox.click();   
              Thread.sleep(500);
              System.out.println("desktop uncheck");
    
              // Hacer click en Check box de Desktop
    
              desktopBox.click();
              Thread.sleep(500);
              System.out.println("descktop check");
    
              // Hacer click en Check box de React
    
              WebElement reactBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.ReactBox")));
              reactBox.click();
              Thread.sleep(500);
              System.out.println("react check");
    
              // Hacer click en Check box de Angular
    
              WebElement angularBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.AngBox")));
              angularBox.click();
              Thread.sleep(500);
              System.out.println("angular check");
    
              // Hacer click en Check box de Veu
    
              WebElement veuBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.VeuBox")));
              veuBox.click();
              Thread.sleep(500);
              System.out.println("veu check");
    
              // Hacer click en Check box de WorkSpace
    
              WebElement workSpaceBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.WorkBox")));
              workSpaceBox.click();
              Thread.sleep(500);
              System.out.println("workspace uncheck");
    
              // Hacer click en Check box de WorkSpace
    
              workSpaceBox.click();
              Thread.sleep(500);
              System.out.println("workspace check");
    
              // Hacer click en Check box de Public
    
              WebElement publicBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.PublicBox")));
              publicBox.click();
              Thread.sleep(500);
              System.out.println("public check");
    
              // Hacer click en Check box de Private
    
              WebElement privateBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.PrivateBox")));
              privateBox.click();
              Thread.sleep(500);
              System.out.println("private check");
    
              // Hacer click en Check box de Classified
    
              WebElement classifiedBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.ClassBox")));
              classifiedBox.click();
              Thread.sleep(500);
              System.out.println("classified check");
    
              // Hacer click en Check box de General
    
              WebElement generalBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.genBox")));
              generalBox.click();
              Thread.sleep(500);
              System.out.println("general check");
    
              // Hacer click en Check box de Office
    
              WebElement officeBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.OffBox")));
              officeBox.click();
              Thread.sleep(500);
              System.out.println("office uncheck");
    
              // Hacer click en Check box de Office
    
              officeBox.click();
              Thread.sleep(500);
              System.out.println("office check");
    
              // Hacer click en Check box de Word File.doc
    
              WebElement wordBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.WordBox")));
              wordBox.click();
              Thread.sleep(500);
              System.out.println("word check");
    
              // Hacer click en Check box de Excel File.doc
    
              WebElement excelBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.ExcelBox")));
              excelBox.click();
              Thread.sleep(500);
              System.out.println("excel check");
    
              // Hacer click en Check box de Downloads
    
              WebElement downloadBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DowBox")));
              downloadBox.click();
              Thread.sleep(500);
              System.out.println("download uncheck");
    
              // Hacer click en Check box de Downloads
    
              downloadBox.click();
              Thread.sleep(500);
              System.out.println("download check");
    
              // Hacer click en Check box de Home
    
              WebElement homeBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.HomeBox")));
              homeBox.click();
              Thread.sleep(500); 
              System.out.println("home uncheck");
    
              // Hacer click en Check box de Home
    
              homeBox.click();
              Thread.sleep(500); 
              System.out.println("home check");
    
              // Hacer click en botón de comprimir
    
              WebElement colapseAll = driver.findElement(By.xpath(propiedades.getProperty("button.CollapseAll")));
              colapseAll.click();
              Thread.sleep(500);
              System.out.println("todo se ha cerrado");
    
              // Hacer click en botón de expandir
    
                WebElement expandAll = driver.findElement(By.xpath(propiedades.getProperty("button.ExpandAll")));
                expandAll.click();
                Thread.sleep(500);
                System.out.println("todo se ha abierto");
            
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

    @Test(description = "En esta prueva se hará click en los Radio Buttons de yes y impresive y se comprovará que el radio button de No no es clickable")
    @Story("Elements")
    @Description("Hacer click en los Radio Buttons")
    public void CP_003_Radio_Buttons() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "Entrar";
        
        try {
            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(500);
            
            WebElement submenu = driver.findElement(By.id("item-2"));
            submenu.click();
            Thread.sleep(500);

            // hacemos click en el radio button de yes

            WebElement yes = driver.findElement(By.xpath(propiedades.getProperty("radioButton.yes")));
            yes.click();
            Thread.sleep(500);
            System.out.println("se ha hecho click en yes");

            // Hacemos click en el radio button de Impresive

            WebElement impresive = driver.findElement(By.xpath(propiedades.getProperty("radioButton.impresive")));
            impresive.click();
            Thread.sleep(500);
            System.out.println("se ha hecho click en Impresive");

            // Comprovamos que el radio button de No esta deshabilitado

           String  atribute = driver.findElement(By.id("noRadio")).getAttribute("class");

           if (atribute.equalsIgnoreCase("custom-control-input disabled")) {
            System.out.println("El boton \"No\" esta deshabilitado");
           }
            
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

    @Test(description = "En esta prueva se Probará todas las funciones disponibles que aporta el web Tables")
    @Story("Elements")
    @Description("Probar las funciones del Web Tables")
    public void CP_004_Web_Tables() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "Entrar";
        
        try {

            MyReader jsonReader = new MyReader();

            CPD cpdList = new CPD();
            List<String[]> datos = cpdList.Datos();
            String[] datoRequerido = datos.get(4);
            String[] datosIncorrectos = datos.get(5);

            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(500);
            
            WebElement submenu = driver.findElement(By.id("item-3"));
            submenu.click();
            Thread.sleep(500);

            //Hacemos click al boton de Add User

            WebElement addUser = driver.findElement(By.id("addNewRecordButton"));
            addUser.click();
            Thread.sleep(500);
            System.out.println("se hace click en el addUser"+"\n");

            //Añadimos el Nombre

            WebElement firstNameAdd = driver.findElement(By.id("firstName"));
            System.out.println(driver.findElement(By.id("firstName")).getCssValue("class"));
            firstNameAdd.sendKeys(jsonReader.dato("CP004", "firstnameAdd"));
            Thread.sleep(500);
            System.out.println("se añade el nombre"+"\n");

            // //Añadimos el apellido
            
            WebElement lastNameAdd = driver.findElement(By.id("lastName"));
            lastNameAdd.sendKeys(jsonReader.dato("CP004", "lastnameAdd"));
            Thread.sleep(500);
            System.out.println("se añade el apellido"+"\n");

            //Añadimos un correo incorrecto
            
            WebElement emailAdd = driver.findElement(By.id("userEmail"));
            emailAdd.sendKeys(jsonReader.dato("CP004", "emailbadAdd"));
            Thread.sleep(500);
            System.out.println("se añade un correao incorrecto"+"\n");

            //Añadimos una edad incorrecta

            WebElement ageAdd = driver.findElement(By.id("age"));
            ageAdd.sendKeys(jsonReader.dato("CP004", "agebadAdd"));
            Thread.sleep(500);
            System.out.println("se añade una edad incorrecta"+"\n");

            //Añadimos un salario incorrecto

            WebElement salaryAdd = driver.findElement(By.id("salary"));
            salaryAdd.sendKeys(jsonReader.dato("CP004", "salarybadAdd"));
            Thread.sleep(500);
            System.out.println("se añade un salario incorrecto"+"\n");

            //Añadimos un departamento

            WebElement departmentAdd = driver.findElement(By.id("department"));
            departmentAdd.sendKeys(jsonReader.dato("CP004", "departmentAdd"));
            Thread.sleep(500);
            System.out.println("se añade un departamento"+"\n");

            //Hacemos click al boton de submit

            WebElement submitAdd = driver.findElement(By.id("submit"));
            submitAdd.click();
            Thread.sleep(500);
            System.out.println("se hace click en el submid"+"\n");

            //Introducimos un email Correcto

            emailAdd.clear();
            emailAdd.sendKeys(jsonReader.dato("CP004", "emailgoodAdd"));
            Thread.sleep(500);
            System.out.println("se pone un email correcto"+"\n");

            //Hacemos click al boton de submit

            submitAdd.click();
            Thread.sleep(500);
            System.out.println("se hace click al boton de submit"+"\n");

            //Introducimos una edad correcta

            ageAdd.clear();
            ageAdd.sendKeys(jsonReader.dato("CP004", "agegoodAdd"));
            Thread.sleep(500);
            System.out.println("Introducimos una edad correcta"+"\n");

            //Introducimos un salario correcto

            salaryAdd.clear();
            salaryAdd.sendKeys(jsonReader.dato("CP004", "salarygoodAdd"));
            Thread.sleep(500);
            System.out.println("Introducimos un salario correcto"+"\n");

            //Hacemos click al boton de submit

            submitAdd.click();
            Thread.sleep(500);
            System.out.println("Hacemos click al boton de submit"+"\n");

            //Hacemos click al lapiz para modificar

            WebElement editButton = driver.findElement(By.id("edit-record-1"));
            editButton.click();
            Thread.sleep(500);
            System.out.println("Hacemos click al lapiz para modificar"+"\n");

            //Borramos el First Name

            WebElement firstNameEdit = driver.findElement(By.id("firstName"));
            firstNameEdit.clear();
            Thread.sleep(500);
            System.out.println("Borramos el First Name"+"\n");

            //Borramos el Last Name

            WebElement lastNameEdit = driver.findElement(By.id("lastName"));
            lastNameEdit.clear();
            Thread.sleep(500);
            System.out.println("Borramos el Last Name"+"\n");

            //Borramos el Email

            WebElement emailEdit = driver.findElement(By.id("userEmail"));
            emailEdit.clear();
            Thread.sleep(500);
            System.out.println("Borramos el Email"+"\n");

            //Borramos el Age

            WebElement ageEdit = driver.findElement(By.id("age"));
            ageEdit.clear();
            Thread.sleep(500);
            System.out.println("Borramos el Age"+"\n");

            //Borramos el Salary

            WebElement salaryEdit = driver.findElement(By.id("salary"));
            salaryEdit.clear();
            Thread.sleep(500);
            System.out.println("Borramos el Salary"+"\n");

            //Borramos el Department

            WebElement departmentEdit = driver.findElement(By.id("department"));
            departmentEdit.clear();
            Thread.sleep(500);
            System.out.println("Borramos el Department"+"\n");

            //Hacemos click en submit

            WebElement submidEdit = driver.findElement(By.id("submit"));
            submidEdit.click();
            Thread.sleep(500);
            System.out.println("Hacemos click en submit"+"\n");

            //Hacemos clic a la cruz del formulario

            WebElement exitEdit = driver.findElement(By.xpath(propiedades.getProperty("button.ExitEdit")));
            exitEdit.click();
            Thread.sleep(500);
            System.out.println("Hacemos clic a la cruz del formulario"+"\n");

            //Hacemos click en el boton de editar

            editButton = driver.findElement(By.id("edit-record-1"));
            editButton.click();
            Thread.sleep(500);
            System.out.println("Hacemos click en el boton de editar"+"\n");

            //Modificamos el Email

            emailEdit = driver.findElement(By.id("userEmail"));
            emailEdit.clear();
            emailEdit.sendKeys(datosIncorrectos[2]);
            Thread.sleep(500);
            System.out.println("Modificamos el Email"+"\n");

            //Modificamos el Age

            ageEdit = driver.findElement(By.id("age"));
            ageEdit.clear();
            ageEdit.sendKeys(datosIncorrectos[3]);
            Thread.sleep(500);
            System.out.println("Modificamos el Age"+"\n");

            //Modificamos el Salary

            salaryEdit = driver.findElement(By.id("salary"));
            salaryEdit.clear();
            salaryEdit.sendKeys(datosIncorrectos[4]);
            Thread.sleep(500);
            System.out.println("Modificamos el Salary"+"\n");

            //Le damos al boton de submit

            submidEdit = driver.findElement(By.id("submit"));
            submidEdit.click();
            Thread.sleep(500);
            System.out.println("Le damos al boton de submit"+"\n");

            //Modificamos el Email

            emailEdit.clear();
            emailEdit.sendKeys(datoRequerido[2]);
            Thread.sleep(500);
            System.out.println("Modificamos el Email"+"\n");

            //Modificamos el Age

            ageEdit.clear();
            ageEdit.sendKeys(datoRequerido[3]);
            Thread.sleep(500);
            System.out.println("Modificamos el Age"+"\n");

            //Modificamos el Salary

            salaryEdit.clear();
            salaryEdit.sendKeys(datoRequerido[4]);
            Thread.sleep(500);
            System.out.println("Modificamos el Salary"+"\n");

            //Hacemos click en el boton de submit

            submidEdit.click();
            Thread.sleep(500);
            System.out.println("Hacemos click en el boton de submit"+"\n");

            //Hacemos click en el boton de delete

            WebElement deleteButton = driver.findElement(By.id("delete-record-1"));
            deleteButton.click();
            Thread.sleep(500);
            System.out.println("Hacemos click en el boton de delete"+"\n");

            //Ordenamos por orden alfabetico y descendente por el First Name

            WebElement firstNameorder = driver.findElement(By.xpath(propiedades.getProperty("button.FirstnameOrder")));
            WebElement firstNameorder2 = driver.findElement(By.xpath(propiedades.getProperty("button.FirstnameOrder")));
            firstNameorder.click();
            Thread.sleep(500);
            System.out.println("Ordenamos por orden alfabetico el First Name"+"\n");

            firstNameorder2.click();
            Thread.sleep(500);
            System.out.println("Ordenamos por orden descendente el First Name"+"\n");


            //Ordenamos por orden alfabetico y descendente por el Last Name

            WebElement lastNameOrder = driver.findElement(By.xpath(propiedades.getProperty("button.LastnameOrder")));
            WebElement lastNameOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.LastnameOrder")));
            lastNameOrder.click();
            Thread.sleep(500);
            System.out.println("Ordenamos por orden alfabetico el First Name"+"\n");

            lastNameOrder2.click();
            Thread.sleep(500); 
            System.out.println("Ordenamos por orden descendente el Last Name"+"\n");

            //Ordenamos por orden de mas grande a mas puequeño y viceversa por el Age

            WebElement ageOrder = driver.findElement(By.xpath(propiedades.getProperty("button.AgeOrder")));
            WebElement ageOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.AgeOrder")));
            ageOrder.click();
            Thread.sleep(500);
            System.out.println("Ordenamos por orden de mas grande a mas puequeño el Age"+"\n");

            ageOrder2.click();
            Thread.sleep(500); 
            System.out.println("Ordenamos por viceversa por el Age"+"\n");

            //Ordenamos por orden alfabetico y descendente por el Email

            WebElement emailOrder = driver.findElement(By.xpath(propiedades.getProperty("button.EmailOrder")));
            WebElement emailOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.EmailOrder")));
            emailOrder.click();
            Thread.sleep(500);
            System.out.println("Ordenamos por orden alfabetico el Email"+"\n");

            emailOrder2.click();
            Thread.sleep(500); 
            System.out.println("Ordenamos por orden descendente el Email"+"\n");

            //Ordenamos por orden de mas grande a mas puequeño y viceversa por el Salary

            WebElement salaryOrder = driver.findElement(By.xpath(propiedades.getProperty("button.SalaryOrder")));
            WebElement salaryOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.SalaryOrder")));
            salaryOrder.click();
            Thread.sleep(500);
            System.out.println("Ordenamos por orden de mas grande a mas puequeño el Salary"+"\n");

            salaryOrder2.click();
            Thread.sleep(500); 
            System.out.println("Ordenamos por viceversa el Salary"+"\n");

            //Ordenamos por orden alfabetico y descendente por el Department

            WebElement departmentOrder = driver.findElement(By.xpath(propiedades.getProperty("button.DepartmentOrder")));
            WebElement departmentOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.DepartmentOrder")));
            departmentOrder.click();
            Thread.sleep(500);
            System.out.println("Ordenamos por orden alfabetico por el Department"+"\n");

            departmentOrder2.click();
            Thread.sleep(500); 
            System.out.println("Ordenamos por orden descendente por el Department"+"\n");

            //Ordenamos por orden alfabetico y descendente por orden de creación

            WebElement actionOrder = driver.findElement(By.xpath(propiedades.getProperty("button.Actionorder")));
            WebElement actionOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.Actionorder")));
            actionOrder.click();
            Thread.sleep(500);
            System.out.println("Ordenamos por orden alfabetico por orden de creación"+"\n");

            actionOrder2.click();
            Thread.sleep(500); 
            System.out.println("Ordenamos por orden descendente por orden de creación"+"\n");

            //Bucle para crear 6 usuarios

            for(int i=0; i<6; i++){
                  addUser = driver.findElement(By.id("addNewRecordButton"));
                  addUser.click();
    
                  firstNameAdd = driver.findElement(By.id("firstName"));
                  firstNameAdd.sendKeys(jsonReader.dato("CP004", "firstnameAdd"));
                
                  lastNameAdd = driver.findElement(By.id("lastName"));
                  lastNameAdd.sendKeys(jsonReader.dato("CP004", "lastnameAdd"));
    
                  departmentAdd = driver.findElement(By.id("department"));
                  departmentAdd.sendKeys(jsonReader.dato("CP004", "departmentAdd"));
                  
                  emailAdd = driver.findElement(By.id("userEmail"));
                  emailAdd.sendKeys(jsonReader.dato("CP004", "emailgoodAdd"));
    
                  ageAdd = driver.findElement(By.id("age"));
                  ageAdd.sendKeys(jsonReader.dato("CP004", "agegoodAdd"));
                  
                  salaryAdd = driver.findElement(By.id("salary"));
                  salaryAdd.sendKeys(jsonReader.dato("CP004", "salarygoodAdd"));

                  submitAdd = driver.findElement(By.id("submit"));
                  submitAdd.click();
            }

            System.out.println("se han creado los usuarios"+"\n");

            Thread.sleep(500);

            //Acotamos a 5 lineas

            WebElement rows = driver.findElement(By.xpath(propiedades.getProperty("select.Rows")));
            Select rowsSelect = new Select(rows);
            rowsSelect.selectByVisibleText(jsonReader.dato("CP004", "rows"));
            Thread.sleep(500);
            System.out.println("se acotaros las lineas"+"\n");

            //Pasamos a la pagina siguiente

            WebElement next = driver.findElement(By.xpath(propiedades.getProperty("button.Next")));
            next.click();
            Thread.sleep(500);
            System.out.println("Pasamos a la pagina siguiente"+"\n");

            //Pasamos a la pagina anterior

            WebElement previous = driver.findElement(By.xpath(propiedades.getProperty("button.Previous")));
            previous.click();
            Thread.sleep(500);
            System.out.println("Pasamos a la pagina anterior"+"\n");

            //Pasamos a la siguiente pagina a traves de escrivir el numero de la pagina que queremos en el quadro de texto

            WebElement section = driver.findElement(By.xpath(propiedades.getProperty("input.Section")));
            section.clear();
            section.sendKeys(datoRequerido[7]);
            section.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            System.out.println("Pasamos a la siguiente pagina a traves de escrivir el numero de la pagina que queremos en el quadro de texto"+"\n");

            //Filtramos un Nombre en la barra de busqueda

            WebElement searchBox = driver.findElement(By.id("searchBox"));
            searchBox.sendKeys(datoRequerido[6]);
            Thread.sleep(500);
            searchBox.clear();
            Thread.sleep(500);
            System.out.println("Filtramos un Nombre en la barra de busqueda"+"\n");

            
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

    @Test(description = "En esta prueva se hará click en los Radio Buttons de yes y impresive y se comprovará que el radio button de No no es clickable")
    @Story("Elements")
    @Description("Hacer click en los Radio Buttons")
    public void CP_005_Buttons() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "Entrar";
        
        try {
            Actions act = new Actions(driver);
            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
            menu.click();
            Thread.sleep(500);
            
            WebElement submenu = driver.findElement(By.id("item-4"));
            submenu.click();
            Thread.sleep(500);

            //Hacemos doble click en el boton de Double click

            WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
            act.doubleClick(doubleClick).perform();
            Thread.sleep(500);
            System.out.println("se ha hecho doble click al Doube click" + "\n");

            //Hacemos click derecho en el boton de Right click

            WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
            act.contextClick(rightClick).perform();
            Thread.sleep(500);
            System.out.println("se ha hecho click al Right click" + "\n");

            //Hacemos click en el boton de Click Me

            WebElement click = driver.findElement(By.xpath(propiedades.getProperty("button.clickMe")));
            click.click();
            Thread.sleep(500);
            System.out.println("se ha hecho click al Click Me" + "\n");
            
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

    @Test(description = "En este caso de prueva se probará a descargar y subir un archivo")
    @Story("Elements")
    @Description("Descargar y cargar un archivo")
    public void CP_006_Upload_Download() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "Entrar";
        
        try {
                driver.get("https://demoqa.com");
                Thread.sleep(500);
                WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
                menu.click();
                Thread.sleep(500);
                
                WebElement submenu = driver.findElement(By.id("item-7"));
                submenu.click();
                Thread.sleep(500);

                //Hacemos click en el boton de download

                WebElement download = driver.findElement(By.id("downloadButton"));
                download.click();
                System.out.println("se ha descargado el archivo" + "\n");

                //Subimos el archivo descargado

                WebElement uploadFile = driver.findElement(By.id("uploadFile"));
                uploadFile.sendKeys(propiedades.getProperty("file.uploadFile"));
                Thread.sleep(500);
                System.out.println("se ha cargado el archivo" + "\n");
            
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

    @Test(description = "En este caso de prueva se probará botones que se activan o muestran despues de 5 segundos y de botones que canvian de color")
    @Story("Elements")
    @Description("Se probarán las funciones dinamicas")
    public void CP_007_Dynmic_Properties() throws InterruptedException, IOException, CsvException {
        FileInputStream input = new FileInputStream("src\\test\\resources\\properties.properties");
        propiedades.load(input);

        testId = "Entrar";
        
        try {
                driver.get("https://demoqa.com");
                Thread.sleep(500);
                WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
                menu.click();
                Thread.sleep(500);
                
                WebElement submenu = driver.findElement(By.id("item-8"));
                submenu.click();
                Thread.sleep(500);

                //Extrae el color del boton color change antes de que canvie de color

                WebElement extractColor = driver.findElement(By.id("colorChange"));
                System.out.println(extractColor.getCssValue("color"));

                System.out.println("se ha extraido antes de que canvie de color" + "\n");

                  //Espera 5 segundos para que el boton color change canvie de color y extrae su color

                Thread.sleep(5000);
                System.out.println(extractColor.getCssValue("color"));
                System.out.println("se ha extraido despues de que canvie de color" + "\n");

                //Extremos el random id

                WebElement randomId = driver.findElement(By.xpath(propiedades.getProperty("text.RandomId")));
                System.out.println(randomId.getAttribute("id"));
                System.out.println("se ha extraido el id random" + "\n");

                //Hacemos click en el boton de enable after 5 seconds

                WebElement enableAfter = driver.findElement(By.id("enableAfter"));
                enableAfter.click();
                Thread.sleep(500);
                System.out.println("se ha hecho click enable after" + "\n");

                //Hacemos click en el boton de visible after 5 seconds

                WebElement visibleAfter = driver.findElement(By.id("visibleAfter"));
                visibleAfter.click();
                Thread.sleep(500);
                System.out.println("se ha hecho click visible after" + "\n");
            
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

}
