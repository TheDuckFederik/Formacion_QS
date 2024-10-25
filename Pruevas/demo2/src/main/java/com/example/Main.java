package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import dev.failsafe.internal.util.Assert;
import java.util.Properties;
import java.io.FileInputStream;

public class Main {
      
      static Properties propiedades = new Properties();

    public static void main(String[] args) throws CsvException, FileNotFoundException, IOException{
      
        FileInputStream input = new FileInputStream("C:\\Users\\ramon.fernandez-roig\\Downloads\\Formacion_QS\\Formacion_QS\\Pruevas\\demo2\\src\\main\\resources\\properties.properties");
        propiedades.load(input);
        // Leer todas las líneas del CSV (cada línea es un array de Strings)
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        //CASO DE Prueba 001
        // try{       

        //     MyReader jsonReader = new MyReader();

        //     // datosPrueba = gson.fromJson(reader, DatosPrueba.class);
        //     CPD cpdList = new CPD();
        //     List<String[]> datos = cpdList.Datos();
        //     String[] datoRequerido = datos.get(1);
        //     String[] datosIncorrectos = datos.get(2);


        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
        //     menu.click();
        //     Thread.sleep(500);
        //     WebElement submenu = driver.findElement(By.id("item-0"));
        //     submenu.click();
        //     Thread.sleep(500);

        //    // Rellenar el apartado Full Name

        //     WebElement userName = driver.findElement(By.id("userName"));
        //     userName.sendKeys(jsonReader.dato("CP001","fullname"));
        //     System.out.println("Se ha escrito el username");
        //     Thread.sleep(500);
        //     // Introducir un Correo electronico erroneo

        //     WebElement email = driver.findElement(By.id("userEmail"));
        //     email.sendKeys(jsonReader.dato("CP001","correoMalo"));
        //     System.out.println("Se ha escrito el email incorrecto");
        //     Thread.sleep(500);

        //     //Pulsar el botón de submit

        //     WebElement submit = driver.findElement(By.id("submit"));
        //     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        //     submit.click();
        //     Thread.sleep(500);

        //     //Corregir el correo correcto
        //     email.clear();
        //     email.sendKeys(datoRequerido[1]);
        //     System.out.println("Se ha escrito el email correcto");
        //     Thread.sleep(500);

        //     //Rellenar el apartado de Current 
            
        //     WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        //     currentAddress.sendKeys(jsonReader.dato("CP001","currAddress"));
        //     System.out.println("Se ha escrito la dirección");
        //     Thread.sleep(500);

        //     //Rellenar el apartado de Permanent Address

        //     WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        //     permanentAddress.sendKeys(datoRequerido[3]);
        //     System.out.println("Se ha escrito la dirección permanente");
        //     Thread.sleep(500);

        //     //Hacemos click en el botón de submit

        //     submit.click();

        //     //Recoger los datos que la pagina nos ha proporcionado

        //     WebElement data = driver.findElement(By.xpath(propiedades.getProperty("textbox.result")));
        //     String dataText = data.getText();

        //     //Imprimimos los datos por pantalla

        //     System.out.println(dataText);
            
            
        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


              //CASO DE Prueba 002
        // try{
        //   driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-1"));
        //     submenu.click();
        //     Thread.sleep(500);

        //   // Hacer clic en desplegable   de Home

        //       WebElement homeDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.homedes")));           
        //       homeDes.click();            
        //       Thread.sleep(500);
        //       System.out.println("home desplegado");

        //   // Hacer click en desplegable   de Desktop
             
        //   WebElement desktopDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DeskDes")));       
        //   desktopDes.click();
        //   Thread.sleep(500);
        //   System.out.println("desktop desplegado");           

        //   // Hacer click en desplegable   de Documents

        //   WebElement documentsDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DocDes")));
        //   documentsDes.click();
        //   Thread.sleep(500); 
        //   System.out.println("documents desplegado");

        //   // Hacer click en desplegable de Downloads

        //   WebElement downloadsDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DowDes")));
        //   downloadsDes.click();
        //   Thread.sleep(500);
        //   System.out.println("downloads desplegado");

        //   // Hacer click en desplegable de WorkSpace

        //   WebElement workSpaceDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.WorkDes")));
        //   workSpaceDes.click();
        //   Thread.sleep(500);
        //   System.out.println("workspace desplegado");

        //   // Hacer click en desplegable de Office

        //   WebElement officeDes = driver.findElement(By.xpath(propiedades.getProperty("checkBox.OffDes")));
        //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", officeDes);
        //   Thread.sleep(500); 
        //   officeDes.click();
        //   Thread.sleep(500);
        //   System.out.println("office desplegado");

        //   // Hacer click en Check box de Notes

        //   WebElement notesBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.NotesBox")));
        //   notesBox.click();
        //   Thread.sleep(500);
        //   System.out.println("notes check");

        //   // Hacer click en Check box de Commands

        //   WebElement commandsBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.ComBox")));
        //   commandsBox.click();
        //   Thread.sleep(500);
        //   System.out.println("comands check");

        //   // Hacer click en Check box de Desktop

        //   WebElement desktopBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DeskBox")));
        //   desktopBox.click();   
        //   Thread.sleep(500);
        //   System.out.println("desktop uncheck");

        //   // Hacer click en Check box de Desktop

        //   desktopBox.click();
        //   Thread.sleep(500);
        //   System.out.println("descktop check");

        //   // Hacer click en Check box de React

        //   WebElement reactBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.ReactBox")));
        //   reactBox.click();
        //   Thread.sleep(500);
        //   System.out.println("react check");

        //   // Hacer click en Check box de Angular

        //   WebElement angularBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.AngBox")));
        //   angularBox.click();
        //   Thread.sleep(500);
        //   System.out.println("angular check");

        //   // Hacer click en Check box de Veu

        //   WebElement veuBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.VeuBox")));
        //   veuBox.click();
        //   Thread.sleep(500);
        //   System.out.println("veu check");

        //   // Hacer click en Check box de WorkSpace

        //   WebElement workSpaceBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.WorkBox")));
        //   workSpaceBox.click();
        //   Thread.sleep(500);
        //   System.out.println("workspace uncheck");

        //   // Hacer click en Check box de WorkSpace

        //   workSpaceBox.click();
        //   Thread.sleep(500);
        //   System.out.println("workspace check");

        //   // Hacer click en Check box de Public

        //   WebElement publicBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.PublicBox")));
        //   publicBox.click();
        //   Thread.sleep(500);
        //   System.out.println("public check");

        //   // Hacer click en Check box de Private

        //   WebElement privateBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.PrivateBox")));
        //   privateBox.click();
        //   Thread.sleep(500);
        //   System.out.println("private check");

        //   // Hacer click en Check box de Classified

        //   WebElement classifiedBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.ClassBox")));
        //   classifiedBox.click();
        //   Thread.sleep(500);
        //   System.out.println("classified check");

        //   // Hacer click en Check box de General

        //   WebElement generalBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.genBox")));
        //   generalBox.click();
        //   Thread.sleep(500);
        //   System.out.println("general check");

        //   // Hacer click en Check box de Office

        //   WebElement officeBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.OffBox")));
        //   officeBox.click();
        //   Thread.sleep(500);
        //   System.out.println("office uncheck");

        //   // Hacer click en Check box de Office

        //   officeBox.click();
        //   Thread.sleep(500);
        //   System.out.println("office check");

        //   // Hacer click en Check box de Word File.doc

        //   WebElement wordBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.WordBox")));
        //   wordBox.click();
        //   Thread.sleep(500);
        //   System.out.println("word check");

        //   // Hacer click en Check box de Excel File.doc

        //   WebElement excelBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.ExcelBox")));
        //   excelBox.click();
        //   Thread.sleep(500);
        //   System.out.println("excel check");

        //   // Hacer click en Check box de Downloads

        //   WebElement downloadBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.DowBox")));
        //   downloadBox.click();
        //   Thread.sleep(500);
        //   System.out.println("download uncheck");

        //   // Hacer click en Check box de Downloads

        //   downloadBox.click();
        //   Thread.sleep(500);
        //   System.out.println("download check");

        //   // Hacer click en Check box de Home

        //   WebElement homeBox = driver.findElement(By.xpath(propiedades.getProperty("checkBox.HomeBox")));
        //   homeBox.click();
        //   Thread.sleep(500); 
        //   System.out.println("home uncheck");

        //   // Hacer click en Check box de Home

        //   homeBox.click();
        //   Thread.sleep(500); 
        //   System.out.println("home check");

        //   // Hacer click en botón de comprimir

        //   WebElement colapseAll = driver.findElement(By.xpath(propiedades.getProperty("button.CollapseAll")));
        //   colapseAll.click();
        //   Thread.sleep(500);
        //   System.out.println("todo se ha cerrado");

        //   // Hacer click en botón de expandir

        //     WebElement expandAll = driver.findElement(By.xpath(propiedades.getProperty("button.ExpandAll")));
        //     expandAll.click();
        //     Thread.sleep(500);
        //     System.out.println("todo se ha abierto");


        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


      //CASO DE Prueba 003

        // try {
        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-2"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     // hacemos click en el radio button de yes

        //     WebElement yes = driver.findElement(By.xpath(propiedades.getProperty("radioButton.yes")));
        //     yes.click();
        //     Thread.sleep(500);
        //     System.out.println("se ha hecho click en yes");

        //     // Hacemos click en el radio button de Impresive

        //     WebElement impresive = driver.findElement(By.xpath(propiedades.getProperty("radioButton.impresive")));
        //     impresive.click();
        //     Thread.sleep(500);
        //     System.out.println("se ha hecho click en Impresive");

        //     // Comprovamos que el radio button de No esta deshabilitado

        //    String  atribute = driver.findElement(By.id("noRadio")).getAttribute("class");

        //    if (atribute.equalsIgnoreCase("custom-control-input disabled")) {
        //     System.out.println("El boton \"No\" esta deshabilitado");
        //    }


        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


      //CASO DE Prueba 004
        // try {

        //     MyReader jsonReader = new MyReader();

        //     CPD cpdList = new CPD();
        //     List<String[]> datos = cpdList.Datos();
        //     String[] datoRequerido = datos.get(4);
        //     String[] datosIncorrectos = datos.get(5);

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-3"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     //Hacemos click al boton de Add User

        //     WebElement addUser = driver.findElement(By.id("addNewRecordButton"));
        //     addUser.click();
        //     Thread.sleep(500);
        //     System.out.println("se hace click en el addUser"+"\n");

        //     //Añadimos el Nombre

        //     WebElement firstNameAdd = driver.findElement(By.id("firstName"));
        //     System.out.println(driver.findElement(By.id("firstName")).getCssValue("class"));
        //     firstNameAdd.sendKeys(jsonReader.dato("CP004", "firstnameAdd"));
        //     Thread.sleep(500);
        //     System.out.println("se añade el nombre"+"\n");

        //     // //Añadimos el apellido
            
        //     WebElement lastNameAdd = driver.findElement(By.id("lastName"));
        //     lastNameAdd.sendKeys(jsonReader.dato("CP004", "lastnameAdd"));
        //     Thread.sleep(500);
        //     System.out.println("se añade el apellido"+"\n");

        //     //Añadimos un correo incorrecto
            
        //     WebElement emailAdd = driver.findElement(By.id("userEmail"));
        //     emailAdd.sendKeys(jsonReader.dato("CP004", "emailbadAdd"));
        //     Thread.sleep(500);
        //     System.out.println("se añade un correao incorrecto"+"\n");

        //     //Añadimos una edad incorrecta

        //     WebElement ageAdd = driver.findElement(By.id("age"));
        //     ageAdd.sendKeys(jsonReader.dato("CP004", "agebadAdd"));
        //     Thread.sleep(500);
        //     System.out.println("se añade una edad incorrecta"+"\n");

        //     //Añadimos un salario incorrecto

        //     WebElement salaryAdd = driver.findElement(By.id("salary"));
        //     salaryAdd.sendKeys(jsonReader.dato("CP004", "salarybadAdd"));
        //     Thread.sleep(500);
        //     System.out.println("se añade un salario incorrecto"+"\n");

        //     //Añadimos un departamento

        //     WebElement departmentAdd = driver.findElement(By.id("department"));
        //     departmentAdd.sendKeys(jsonReader.dato("CP004", "departmentAdd"));
        //     Thread.sleep(500);
        //     System.out.println("se añade un departamento"+"\n");

        //     //Hacemos click al boton de submit

        //     WebElement submitAdd = driver.findElement(By.id("submit"));
        //     submitAdd.click();
        //     Thread.sleep(500);
        //     System.out.println("se hace click en el submid"+"\n");

        //     //Introducimos un email Correcto

        //     emailAdd.clear();
        //     emailAdd.sendKeys(jsonReader.dato("CP004", "emailgoodAdd"));
        //     Thread.sleep(500);
        //     System.out.println("se pone un email correcto"+"\n");

        //     //Hacemos click al boton de submit

        //     submitAdd.click();
        //     Thread.sleep(500);
        //     System.out.println("se hace click al boton de submit"+"\n");

        //     //Introducimos una edad correcta

        //     ageAdd.clear();
        //     ageAdd.sendKeys(jsonReader.dato("CP004", "agegoodAdd"));
        //     Thread.sleep(500);
        //     System.out.println("Introducimos una edad correcta"+"\n");

        //     //Introducimos un salario correcto

        //     salaryAdd.clear();
        //     salaryAdd.sendKeys(jsonReader.dato("CP004", "salarygoodAdd"));
        //     Thread.sleep(500);
        //     System.out.println("Introducimos un salario correcto"+"\n");

        //     //Hacemos click al boton de submit

        //     submitAdd.click();
        //     Thread.sleep(500);
        //     System.out.println("Hacemos click al boton de submit"+"\n");

        //     //Hacemos click al lapiz para modificar

        //     WebElement editButton = driver.findElement(By.id("edit-record-1"));
        //     editButton.click();
        //     Thread.sleep(500);
        //     System.out.println("Hacemos click al lapiz para modificar"+"\n");

        //     //Borramos el First Name

        //     WebElement firstNameEdit = driver.findElement(By.id("firstName"));
        //     firstNameEdit.clear();
        //     Thread.sleep(500);
        //     System.out.println("Borramos el First Name"+"\n");

        //     //Borramos el Last Name

        //     WebElement lastNameEdit = driver.findElement(By.id("lastName"));
        //     lastNameEdit.clear();
        //     Thread.sleep(500);
        //     System.out.println("Borramos el Last Name"+"\n");

        //     //Borramos el Email

        //     WebElement emailEdit = driver.findElement(By.id("userEmail"));
        //     emailEdit.clear();
        //     Thread.sleep(500);
        //     System.out.println("Borramos el Email"+"\n");

        //     //Borramos el Age

        //     WebElement ageEdit = driver.findElement(By.id("age"));
        //     ageEdit.clear();
        //     Thread.sleep(500);
        //     System.out.println("Borramos el Age"+"\n");

        //     //Borramos el Salary

        //     WebElement salaryEdit = driver.findElement(By.id("salary"));
        //     salaryEdit.clear();
        //     Thread.sleep(500);
        //     System.out.println("Borramos el Salary"+"\n");

        //     //Borramos el Department

        //     WebElement departmentEdit = driver.findElement(By.id("department"));
        //     departmentEdit.clear();
        //     Thread.sleep(500);
        //     System.out.println("Borramos el Department"+"\n");

        //     //Hacemos click en submit

        //     WebElement submidEdit = driver.findElement(By.id("submit"));
        //     submidEdit.click();
        //     Thread.sleep(500);
        //     System.out.println("Hacemos click en submit"+"\n");

        //     //Hacemos clic a la cruz del formulario

        //     WebElement exitEdit = driver.findElement(By.xpath(propiedades.getProperty("button.ExitEdit")));
        //     exitEdit.click();
        //     Thread.sleep(500);
        //     System.out.println("Hacemos clic a la cruz del formulario"+"\n");

        //     //Hacemos click en el boton de editar

        //     editButton = driver.findElement(By.id("edit-record-1"));
        //     editButton.click();
        //     Thread.sleep(500);
        //     System.out.println("Hacemos click en el boton de editar"+"\n");

        //     //Modificamos el Email

        //     emailEdit = driver.findElement(By.id("userEmail"));
        //     emailEdit.clear();
        //     emailEdit.sendKeys(datosIncorrectos[2]);
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Email"+"\n");

        //     //Modificamos el Age

        //     ageEdit = driver.findElement(By.id("age"));
        //     ageEdit.clear();
        //     ageEdit.sendKeys(datosIncorrectos[3]);
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Age"+"\n");

        //     //Modificamos el Salary

        //     salaryEdit = driver.findElement(By.id("salary"));
        //     salaryEdit.clear();
        //     salaryEdit.sendKeys(datosIncorrectos[4]);
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Salary"+"\n");

        //     //Le damos al boton de submit

        //     submidEdit = driver.findElement(By.id("submit"));
        //     submidEdit.click();
        //     Thread.sleep(500);
        //     System.out.println("Le damos al boton de submit"+"\n");

        //     //Modificamos el Email

        //     emailEdit.clear();
        //     emailEdit.sendKeys(datoRequerido[2]);
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Email"+"\n");

        //     //Modificamos el Age

        //     ageEdit.clear();
        //     ageEdit.sendKeys(datoRequerido[3]);
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Age"+"\n");

        //     //Modificamos el Salary

        //     salaryEdit.clear();
        //     salaryEdit.sendKeys(datoRequerido[4]);
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Salary"+"\n");

        //     //Hacemos click en el boton de submit

        //     submidEdit.click();
        //     Thread.sleep(500);
        //     System.out.println("Hacemos click en el boton de submit"+"\n");

        //     //Hacemos click en el boton de delete

        //     WebElement deleteButton = driver.findElement(By.id("delete-record-1"));
        //     deleteButton.click();
        //     Thread.sleep(500);
        //     System.out.println("Hacemos click en el boton de delete"+"\n");

        //     //Ordenamos por orden alfabetico y descendente por el First Name

        //     WebElement firstNameorder = driver.findElement(By.xpath(propiedades.getProperty("button.FirstnameOrder")));
        //     WebElement firstNameorder2 = driver.findElement(By.xpath(propiedades.getProperty("button.FirstnameOrder")));
        //     firstNameorder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico el First Name"+"\n");

        //     firstNameorder2.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden descendente el First Name"+"\n");


        //     //Ordenamos por orden alfabetico y descendente por el Last Name

        //     WebElement lastNameOrder = driver.findElement(By.xpath(propiedades.getProperty("button.LastnameOrder")));
        //     WebElement lastNameOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.LastnameOrder")));
        //     lastNameOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico el First Name"+"\n");

        //     lastNameOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por orden descendente el Last Name"+"\n");

        //     //Ordenamos por orden de mas grande a mas puequeño y viceversa por el Age

        //     WebElement ageOrder = driver.findElement(By.xpath(propiedades.getProperty("button.AgeOrder")));
        //     WebElement ageOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.AgeOrder")));
        //     ageOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden de mas grande a mas puequeño el Age"+"\n");

        //     ageOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por viceversa por el Age"+"\n");

        //     //Ordenamos por orden alfabetico y descendente por el Email

        //     WebElement emailOrder = driver.findElement(By.xpath(propiedades.getProperty("button.EmailOrder")));
        //     WebElement emailOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.EmailOrder")));
        //     emailOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico el Email"+"\n");

        //     emailOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por orden descendente el Email"+"\n");

        //     //Ordenamos por orden de mas grande a mas puequeño y viceversa por el Salary

        //     WebElement salaryOrder = driver.findElement(By.xpath(propiedades.getProperty("button.SalaryOrder")));
        //     WebElement salaryOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.SalaryOrder")));
        //     salaryOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden de mas grande a mas puequeño el Salary"+"\n");

        //     salaryOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por viceversa el Salary"+"\n");

        //     //Ordenamos por orden alfabetico y descendente por el Department

        //     WebElement departmentOrder = driver.findElement(By.xpath(propiedades.getProperty("button.DepartmentOrder")));
        //     WebElement departmentOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.DepartmentOrder")));
        //     departmentOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico por el Department"+"\n");

        //     departmentOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por orden descendente por el Department"+"\n");

        //     //Ordenamos por orden alfabetico y descendente por orden de creación

        //     WebElement actionOrder = driver.findElement(By.xpath(propiedades.getProperty("button.Actionorder")));
        //     WebElement actionOrder2 = driver.findElement(By.xpath(propiedades.getProperty("button.Actionorder")));
        //     actionOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico por orden de creación"+"\n");

        //     actionOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por orden descendente por orden de creación"+"\n");

        //     //Bucle para crear 6 usuarios

        //     for(int i=0; i<6; i++){
        //           addUser = driver.findElement(By.id("addNewRecordButton"));
        //           addUser.click();
    
        //           firstNameAdd = driver.findElement(By.id("firstName"));
        //           firstNameAdd.sendKeys(jsonReader.dato("CP004", "firstnameAdd"));
                
        //           lastNameAdd = driver.findElement(By.id("lastName"));
        //           lastNameAdd.sendKeys(jsonReader.dato("CP004", "lastnameAdd"));
    
        //           departmentAdd = driver.findElement(By.id("department"));
        //           departmentAdd.sendKeys(jsonReader.dato("CP004", "departmentAdd"));
                  
        //           emailAdd = driver.findElement(By.id("userEmail"));
        //           emailAdd.sendKeys(jsonReader.dato("CP004", "emailgoodAdd"));
    
        //           ageAdd = driver.findElement(By.id("age"));
        //           ageAdd.sendKeys(jsonReader.dato("CP004", "agegoodAdd"));
                  
        //           salaryAdd = driver.findElement(By.id("salary"));
        //           salaryAdd.sendKeys(jsonReader.dato("CP004", "salarygoodAdd"));

        //           submitAdd = driver.findElement(By.id("submit"));
        //           submitAdd.click();
        //     }

        //     System.out.println("se han creado los usuarios"+"\n");

        //     Thread.sleep(500);

        //     //Acotamos a 5 lineas

        //     WebElement rows = driver.findElement(By.xpath(propiedades.getProperty("select.Rows")));
        //     Select rowsSelect = new Select(rows);
        //     rowsSelect.selectByVisibleText(jsonReader.dato("CP004", "rows"));
        //     Thread.sleep(500);
        //     System.out.println("se acotaros las lineas"+"\n");

        //     //Pasamos a la pagina siguiente

        //     WebElement next = driver.findElement(By.xpath(propiedades.getProperty("button.Next")));
        //     next.click();
        //     Thread.sleep(500);
        //     System.out.println("Pasamos a la pagina siguiente"+"\n");

        //     //Pasamos a la pagina anterior

        //     WebElement previous = driver.findElement(By.xpath(propiedades.getProperty("button.Previous")));
        //     previous.click();
        //     Thread.sleep(500);
        //     System.out.println("Pasamos a la pagina anterior"+"\n");

        //     //Pasamos a la siguiente pagina a traves de escrivir el numero de la pagina que queremos en el quadro de texto

        //     WebElement section = driver.findElement(By.xpath(propiedades.getProperty("input.Section")));
        //     section.clear();
        //     section.sendKeys(datoRequerido[7]);
        //     section.sendKeys(Keys.ENTER);
        //     Thread.sleep(500);
        //     System.out.println("Pasamos a la siguiente pagina a traves de escrivir el numero de la pagina que queremos en el quadro de texto"+"\n");

        //     //Filtramos un Nombre en la barra de busqueda

        //     WebElement searchBox = driver.findElement(By.id("searchBox"));
        //     searchBox.sendKeys(datoRequerido[6]);
        //     Thread.sleep(500);
        //     searchBox.clear();
        //     Thread.sleep(500);
        //     System.out.println("Filtramos un Nombre en la barra de busqueda"+"\n");

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


              //CASO DE Prueba 005
        // try{
            
        //     Actions act = new Actions(driver);
        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-4"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     //Hacemos doble click en el boton de Double click

        //     WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        //     act.doubleClick(doubleClick).perform();
        //     Thread.sleep(500);
        //     System.out.println("se ha hecho doble click al Doube click" + "\n");

        //     //Hacemos click derecho en el boton de Right click

        //     WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        //     act.contextClick(rightClick).perform();
        //     Thread.sleep(500);
        //     System.out.println("se ha hecho click al Right click" + "\n");

        //     //Hacemos click en el boton de Click Me

        //     WebElement click = driver.findElement(By.xpath(propiedades.getProperty("button.clickMe")));
        //     click.click();
        //     Thread.sleep(500);
        //     System.out.println("se ha hecho click al Click Me" + "\n");

            

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


              //CASO DE Prueba 006

        // try{

        //         driver.get("https://demoqa.com");
        //         Thread.sleep(500);
        //         WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
        //         menu.click();
        //         Thread.sleep(500);
                
        //         WebElement submenu = driver.findElement(By.id("item-7"));
        //         submenu.click();
        //         Thread.sleep(500);

        //         //Hacemos click en el boton de download

        //         WebElement download = driver.findElement(By.id("downloadButton"));
        //         download.click();
        //         System.out.println("se ha descargado el archivo" + "\n");

        //         //Subimos el archivo descargado

        //         WebElement uploadFile = driver.findElement(By.id("uploadFile"));
        //         uploadFile.sendKeys(propiedades.getProperty("file.uploadFile"));
        //         Thread.sleep(500);
        //         System.out.println("se ha cargado el archivo" + "\n");

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


        //CASO DE Prueba 007
        // try {

        //         driver.get("https://demoqa.com");
        //         Thread.sleep(500);
        //         WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.elements")));
        //         menu.click();
        //         Thread.sleep(500);
                
        //         WebElement submenu = driver.findElement(By.id("item-8"));
        //         submenu.click();
        //         Thread.sleep(500);

        //         //Extrae el color del boton color change antes de que canvie de color

        //         WebElement extractColor = driver.findElement(By.id("colorChange"));
        //         System.out.println(extractColor.getCssValue("color"));

        //         System.out.println("se ha extraido antes de que canvie de color" + "\n");

        //           //Espera 5 segundos para que el boton color change canvie de color y extrae su color

        //         Thread.sleep(5000);
        //         System.out.println(extractColor.getCssValue("color"));
        //         System.out.println("se ha extraido despues de que canvie de color" + "\n");

        //         //Extremos el random id

        //         WebElement randomId = driver.findElement(By.xpath(propiedades.getProperty("text.RandomId")));
        //         System.out.println(randomId.getAttribute("id"));
        //         System.out.println("se ha extraido el id random" + "\n");

        //         //Hacemos click en el boton de enable after 5 seconds

        //         WebElement enableAfter = driver.findElement(By.id("enableAfter"));
        //         enableAfter.click();
        //         Thread.sleep(500);
        //         System.out.println("se ha hecho click enable after" + "\n");

        //         //Hacemos click en el boton de visible after 5 seconds

        //         WebElement visibleAfter = driver.findElement(By.id("visibleAfter"));
        //         visibleAfter.click();
        //         Thread.sleep(500);
        //         System.out.println("se ha hecho click visible after" + "\n");

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


      //CASO DE Prueba 008
        // try{

        //     MyReader jsonReader = new MyReader();

        //     CPD cpdList = new CPD();
        //     List<String[]> datos = cpdList.Datos();
        //     String[] datoRequerido = datos.get(7);
        //     String[] datosIncorrectos = datos.get(8);

        //         driver.get("https://demoqa.com");
        //         Thread.sleep(500);
        //         WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.forms")));
        //         menu.click();
        //         Thread.sleep(500);
                
        //         WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.forms")));
        //         submenu.click();
        //         Thread.sleep(500);

        //         // //Hacemos click al boton de submit

        //         WebElement submitForm = driver.findElement(By.id("submit"));
        //         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitForm);
        //         Thread.sleep(500); 
        //         submitForm.click();
        //         Thread.sleep(500);
        //         System.out.println("se ha hecho click en submit" + "\n");

        //         //Rellenamos el campo firstName

        //         WebElement firstNameForm = driver.findElement(By.id("firstName"));
        //         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstNameForm);
        //         Thread.sleep(500); 
        //         firstNameForm.sendKeys(datoRequerido[0]);
        //         Thread.sleep(500);
        //         System.out.println("se ha rellenado firstname" + "\n");
                
        //         //Rellenamos el campo Last Name

        //         WebElement lastNameForm = driver.findElement(By.id("lastName"));
        //         lastNameForm.sendKeys(jsonReader.dato("CP008", "lastName"));
        //         Thread.sleep(500);
        //         System.out.println("se ha rellenado lastName" + "\n");

        //         //Rellenamos el campo Email

        //         WebElement emailForm = driver.findElement(By.id("userEmail"));
        //         emailForm.sendKeys(datosIncorrectos[3]);
        //         Thread.sleep(1500);
        //         System.out.println("se ha rellenado email erroneamente" + "\n");

        //         //Hacer click en el boton de submit

        //         submitForm.click();
        //         System.out.println("se ha hecho click en submit" + "\n");

        //         //Rellenamos el campo Email correctamente

        //         emailForm.clear();
        //         emailForm.sendKeys(jsonReader.dato("CP008", "emailgood"));
        //         Thread.sleep(500);
        //         System.out.println("se ha rellenado email correctamente" + "\n");

        //         //Hacer click en el radio button de Male

        //         WebElement maleRadioButtonForm = driver.findElement(By.xpath(propiedades.getProperty("radioButton.Male")));
        //         maleRadioButtonForm.click();
        //         Thread.sleep(500);
        //         System.out.println("se hizo click en Male" + "\n");


        //         //Rellenamos el campo Mobile con 10 letras

        //         WebElement mobileForm = driver.findElement(By.id("userNumber"));
        //         mobileForm.sendKeys(datosIncorrectos[4]);
        //         Thread.sleep(500);
        //         System.out.println("se ha rellenado Mobile con 10 letras" + "\n");


        //         //Rellenamos el campo mobile con 5 numeros

        //         mobileForm.clear();
        //         mobileForm.sendKeys(datosIncorrectos[5]);
        //         Thread.sleep(500);
        //         System.out.println("Rellenamos el campo mobile con 5 numeros" + "\n");


        //         //Hacemos click al boton de submit

        //         submitForm.click();
        //         Thread.sleep(500);
        //         System.out.println("Se ha hecho click al boton de submit" + "\n");

        //         //Rellenamos el campo Mobile con 10 numeros

        //         mobileForm.clear();
        //         mobileForm.sendKeys(jsonReader.dato("CP008", "mobilegood"));
        //         Thread.sleep(500);
        //         System.out.println("Se ha hecho click al boton de submit" + "\n");

        //         //Hacer click en date of birth

        //         WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        //         dateOfBirth.click();
        //         Thread.sleep(500);
        //         System.out.println("Se ha hecho click a date of birth" + "\n");
                
        //         //Hacer click en los meses Y seleccionar Enero

        //         WebElement monthForm = driver.findElement(By.xpath(propiedades.getProperty("Form.MonthForm")));
        //         Select monthSelect = new Select(monthForm);
        //         monthSelect.selectByVisibleText("January");
        //         Thread.sleep(500);
        //         System.out.println("se ha seleccionado january" + "\n");

        //         //Hacer click en los años Y seleccionar 2004

        //         WebElement yearForm = driver.findElement(By.xpath(propiedades.getProperty("Form.YearForm")));
        //         Select yearSelect = new Select(yearForm);
        //         yearSelect.selectByVisibleText("2004");
        //         Thread.sleep(500);    
        //         System.out.println("Se ha seleccionado 2004" + "\n");
                
        //         //Hacer click en 16

        //         WebElement dayForm = driver.findElement(By.xpath(propiedades.getProperty("Form.DayForm")));
        //         dayForm.click();
        //         Thread.sleep(500);
        //         System.out.println("Se ha seleccionado el dia 16" + "\n");

        //         //Rellenar el campo Subjects

        //         WebElement subjectsForm = driver.findElement(By.id("subjectsInput"));
        //         subjectsForm.sendKeys(datoRequerido[5]);
        //         subjectsForm.sendKeys(Keys.ENTER);
        //         Thread.sleep(500);
        //         System.out.println("Se ha rellenado el campo subjects una vez" + "\n");

        //         //Rellenar el campo subjects

        //         subjectsForm.sendKeys(datoRequerido[6]);
        //         subjectsForm.sendKeys(Keys.ENTER);
        //         Thread.sleep(500);
        //         System.out.println("Se ha rellenado el campo subjects dos vezes" + "\n");

        //         //Hacer click en Sports, Reading y Music

        //         WebElement sports = driver.findElement(By.xpath(propiedades.getProperty("Form.Sports")));
        //         WebElement reading = driver.findElement(By.xpath(propiedades.getProperty("Form.Reading")));
        //         WebElement music = driver.findElement(By.xpath(propiedades.getProperty("Form.Music")));

        //         sports.click();
        //         Thread.sleep(500);
        //         reading.click();
        //         Thread.sleep(500);
        //         music.click();
        //         Thread.sleep(500);
        //         System.out.println("Se ha seleccionado sports, reading y music" + "\n");

        //         //Subir un archivo

        //         WebElement uploadFile = driver.findElement(By.id("uploadPicture"));
        //         uploadFile.sendKeys(propiedades.getProperty("file.FormUploadFile"));
        //         Thread.sleep(500);
        //         System.out.println("Se ha subido el archivo" + "\n");

        //         //Rellenar el campo current address

        //         WebElement currentAddressForm = driver.findElement(By.id("currentAddress"));
        //         currentAddressForm.sendKeys(datoRequerido[7]);
        //         Thread.sleep(500);
        //         System.out.println("Se ha rellenado current address" + "\n");

        //         //Seleccionar un estado y ciudad

        //         WebElement stateForm = driver.findElement(By.id("react-select-3-input"));
        //         stateForm.sendKeys(jsonReader.dato("CP008", "statesel"));
        //         stateForm.sendKeys(Keys.ENTER);
        //         Thread.sleep(500);
        //         System.out.println("Se ha implementado el estado" + "\n");

        //         WebElement cityForm = driver.findElement(By.id("react-select-4-input"));
        //         cityForm.sendKeys(datoRequerido[9]);
        //         cityForm.sendKeys(Keys.ENTER);
        //         Thread.sleep(500);
        //         System.out.println("Se ha implementado la ciudad" + "\n");
        //         //hacer click al boton de submit

        //         submitForm.click();

        //         Thread.sleep(500);
        //         System.out.println("Se ha hecho click en submit" + "\n");

        //         //Obtener los resultados
        //         System.out.println("Se han recogido los resultados" + "\n");
        //         System.out.println(driver.findElement(By.xpath("//div[@class=\"table-responsive\"]")).getText());

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        //CASO DE Prueba 009
        // try {

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
        //     menu.click();
        //     Thread.sleep(500);       
        //     WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Windows")));
        //     submenu.click();
        //     Thread.sleep(500);

        //     //Hacemos click al boton de New Tab

        //     driver.findElement(By.id("tabButton")).click();
        //     System.out.println("se ha abierto la pestaña" + "\n");

        //     //Guardamos en un array las pestañas disponibles y nos cambiamos a la pestaña nueva

        //     ArrayList<String> pestañas = new ArrayList<>(driver.getWindowHandles());
        //     driver.switchTo().window(pestañas.get(1));
        //     Thread.sleep(500);

        //     //Cerramos la pestaña

        //     driver.close();
        //     Thread.sleep(500);
        //     System.out.println("se ha cerrado la pestaña" + "\n");

        //     //Cambiamos a la pestaña original y hacemos clic al boton de New Window

        //     driver.switchTo().window(pestañas.get(0));
        //     driver.findElement(By.id("windowButton")).click();
        //     Thread.sleep(500);
        //     System.out.println("se ha abierto la ventana" + "\n");

        //     //Guardamos en un array las ventanas disponibles y nos cambiamos a la ventana nueva

        //     ArrayList<String> ventanas = new ArrayList<>(driver.getWindowHandles());
        //     driver.switchTo().window(ventanas.get(1));
        //     Thread.sleep(500);

        //     //Cerramos la ventana

        //     driver.close();
        //     Thread.sleep(500);
        //     System.out.println("se ha cerrado la ventana" + "\n");

        //     //Cambiamos a la ventana original y hacemos clic al boton de New Window Message

        //     driver.switchTo().window(ventanas.get(0));
        //     driver.findElement(By.id("messageWindowButton")).click();
        //     Thread.sleep(500);
        //     System.out.println("se ha abierto la ventana de mensage" + "\n");

        //     //Guardamos en un array las ventanas disponibles y nos cambiamos a la ventana nueva

        //     ventanas = new ArrayList<>(driver.getWindowHandles());
        //     driver.switchTo().window(ventanas.get(1));
        //     Thread.sleep(500);

        //     //Cerramos la ventana

        //     driver.close();
        //     Thread.sleep(500);
        //     System.out.println("se ha cerrado la ventana de mensage" + "\n");

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        //CASO DE Prueba 010

        // try{

        //     MyReader jsonReader = new MyReader();

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
        //     menu.click();
        //     Thread.sleep(500);       
        //     WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Alerts")));
        //     submenu.click();
        //     Thread.sleep(500);

        //     //Hacemos click en el boton para ver una alert

        //     driver.findElement(By.id("alertButton")).click();
        //     Thread.sleep(500);
        //     System.out.println("se abre el alert" + "\n");

        //     //Cambiamos al alert y acceptamos el alert

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().accept();
        //     Thread.sleep(500);
        //     System.out.println("se acepta el alert" + "\n");

        //     //Hacemos click al segundo boton y esperamos 5 segundos

        //     driver.findElement(By.id("timerAlertButton")).click();
        //     Thread.sleep(7000);
        //     System.out.println("se abre el alert despues de 5 segundos" + "\n");

        //     //Cambiamos al alert que saldrá dentro de 5 segundos y lo aceptamos

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().accept();
        //     Thread.sleep(500);
        //     System.out.println("se acepta el alert" + "\n");

        //     //Hacemos click al tercer boton

        //     driver.findElement(By.id("confirmButton")).click();
        //     Thread.sleep(500);
        //     System.out.println("se abre el alert de acept y cancel" + "\n");

        //     //Cambiamos al alert que saldrá y acceptamos

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().accept();
        //     Thread.sleep(500);  
        //     System.out.println("se acepta el alert" + "\n");

        //     //Hacemos click al tercer boton

        //     driver.findElement(By.id("confirmButton")).click();
        //     Thread.sleep(500);
        //     System.out.println("se abre el alert de acept y cancel" + "\n");

        //     //Cambiamos al alert que saldrá y cancelamos

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().dismiss();
        //     Thread.sleep(500);     
        //     System.out.println("se cancela el alert" + "\n");

        //     //Hacemos click al cuarto boton

        //     driver.findElement(By.id("promtButton")).click();
        //     Thread.sleep(500);
        //     System.out.println("se abre el alert de texto" + "\n");
            
        //     //Cambiamos al alert que saldrá y escrivimos la Prueba y aceptamos

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().sendKeys(jsonReader.dato("CP010", "alertBox"));
        //     Thread.sleep(500);
        //     driver.switchTo().alert().accept();
        //     Thread.sleep(500);  
        //     System.out.println("se ha escrito el texto y se ha aceptado el alert" + "\n");

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        //CASO DE Prueba 011

        // try{

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
        //     menu.click();
        //     Thread.sleep(500);       
        //     WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Frames")));
        //     submenu.click();
        //     Thread.sleep(500);
            
        //     //Cambiamos a la perspectiva del frame1

        //     driver.switchTo().frame("frame1");

        //     //Extraemos el texto del frame

        //     System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        //     System.out.println("se ha extraido el texto del frame de arriba"+"\n");

        //     //Cambiamos a la pagina principal

        //     driver.switchTo().defaultContent();

        //     //Cambiamos al iFrame de abajo

        //     driver.switchTo().frame("frame2");
            
        //     //Extraemos el texto del frame

        //     System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        //     System.out.println("se ha extraido el texto del frame de abajo"+"\n");

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        //CASO DE PRUEBA 012

        // try {
 
        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
        //     menu.click();
        //     Thread.sleep(500);       
        //     WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Nested_Frames")));
        //     submenu.click();
        //     Thread.sleep(500);

        //     // Cambiar la perspectiva al iFrame Parent

        //         driver.switchTo().frame("frame1");

        //     // Extraer el Texto  <p>Parent frame</p>

        //         WebElement parentFrame = driver.findElement(By.xpath(propiedades.getProperty("Frame.ParentFrame")));
        //         System.out.println(parentFrame.getText());
        //         System.out.println("Se ha extraido el texto del parent frame" + "\n");

        //     // Cambiar la perspectiva al iFrame Child

        //         driver.switchTo().frame(0);

        //     // Extraer el Texto  <p>Child Iframe</p>

        //         System.out.println(driver.findElement(By.xpath(propiedades.getProperty("Frame.ChildFrame"))).getText());
        //         System.out.println("Se ha extraido el texto del child frame frame" + "\n");


        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

          //CASO DE PRUEBA 13

          // try {

          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.alerts")));
          //   menu.click();
          //   Thread.sleep(500);       
          //   WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Modal_Dialogs")));
          //   submenu.click();
          //   Thread.sleep(500);

          //   // Hacer click al botón de Small Modla

          //       driver.findElement(By.id("showSmallModal")).click();
          //       Thread.sleep(500);
          //       System.out.println("Se ha hecho click al boton de Small Modal" + "\n");

          //   // Extraemos el texto

          //       System.err.println(driver.findElement(By.xpath(propiedades.getProperty("text.SmallModal"))).getText());
          //       System.out.println("Se ha extraido el texto del Small Modal" + "\n");

          //   // Hacer click al botón de Close

          //       driver.findElement(By.id("closeSmallModal")).click();
          //       Thread.sleep(500);
          //       System.out.println("Se ha hecho click al boton de close de Small Modal" + "\n");

          //   // Hacer click al botón de Large modal

          //       driver.findElement(By.id("showLargeModal")).click();
          //       Thread.sleep(500);
          //       System.out.println("Se ha hecho click al boton de Large Modal" + "\n");

          //   // Extraemos el texto

          //       System.err.println(driver.findElement(By.xpath(propiedades.getProperty("text.largeModal"))).getText());
          //       System.out.println("Se ha extraido el texto del Large Modal" + "\n");

          // } catch(Exception e){
          //     e.printStackTrace();
          // } finally{
          //     driver.quit();
          // }

          //CASO DE PRUEBA 014

          try {

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

          } catch(Exception e){
              e.printStackTrace();
          } finally{
              driver.quit();
          }

          //CASO DE PRUEBA 015

          // try {

            
          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
          //   menu.click();
          //   Thread.sleep(500);       
          //   WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Slider")));
          //   submenu.click();
          //   Thread.sleep(500);

          //   //Mover el slider de arriba a abajo hasta el final

          //   WebElement slider = driver.findElement(By.xpath(propiedades.getProperty("slider.Slider")));
          //   for (int i = 0; i < 25; i++) {
          //     slider.sendKeys(Keys.ARROW_LEFT);
          //   }
          //   System.out.println("el slider se ha movido hacia abajo del todo" + "\n");
          //   for (int i = 0; i < 100; i++) {
          //     slider.sendKeys(Keys.ARROW_RIGHT);
          //   }
          //   System.out.println("el slider se ha movido hacia arriba del todo" + "\n");

          // } catch(Exception e){
          //   e.printStackTrace();
          // } finally{
          //   driver.quit();
          // }

          //CASO DE PRUEBA 016

          // try {

          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
          //   menu.click();
          //   Thread.sleep(500);       
          //   WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Progress_Bar")));
          //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
          //   Thread.sleep(500); 
          //   submenu.click();
          //   Thread.sleep(500);

          //   // Hacer click en el botón Start

          //       WebElement button = driver.findElement(By.id("startStopButton"));
          //       button.click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al boton para empecar la progress bar" + "\n");
          //   // Hacer click en el botón Stop

          //       button.click();
          //       Thread.sleep(500);
          //       button.click();
          //       System.out.println("se para a mitad la progress bar y se vuelve a iniciar" + "\n");

                
          //   // Cuando se llene hacer click en reset
          //       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

          //       // wait.until(new ExpectedCondition<Boolean>() {
          //       //   public Boolean apply(WebDriver driver) {
          //       //       WebElement barraProgreso = driver.findElement(By.id("progressBar"));
          //       //       String valor = barraProgreso.getAttribute("aria-valuenow");
          //       //       return valor.equals("100");
          //       //   }
          //       // });

          //       Thread.sleep(11000);
          //       driver.findElement(By.id("resetButton")).click();
          //       Thread.sleep(500);
          //       System.out.println("se reinicia la progress bar" + "\n");


          // } catch(Exception e){
          //   e.printStackTrace();
          // } finally{
          //   driver.quit();
          // }

          //CASO DE PRUEVA 017

          // try {

          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
          //   menu.click();
          //   Thread.sleep(500);       
          //   WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Menu")));
          //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
          //   Thread.sleep(500); 
          //   submenu.click();
          //   Thread.sleep(500);


          //   // hacer click en Main Item 1
          //       driver.findElement(By.xpath(propiedades.getProperty("Menu.MainItem1"))).click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al main item 1" + "\n");
          //   // hacer click en Main Item 2

          //       WebElement subMenu2 = driver.findElement(By.xpath(propiedades.getProperty("Menu.MainItem2")));
          //       subMenu2.click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al main item 2" + "\n");

          //   // hacer click en Main Item 3

          //       driver.findElement(By.xpath(propiedades.getProperty("Menu.MainItem3"))).click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al main item 3" + "\n");

          //   // Pasar por encima del main item 2

          //       subMenu2.click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al main item 2" + "\n");

          //   // Hacer click en sub item
            
          //       driver.findElement(By.xpath(propiedades.getProperty("Menu.SubItem1"))).click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al subItem" + "\n");

          //   // Hacer click en sub Item

          //       driver.findElement(By.xpath(propiedades.getProperty("Menu.SubItem2"))).click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al subItem" + "\n");

          //   // Pasar por encima del SUB SUB List

          //       driver.findElement(By.xpath(propiedades.getProperty("Menu.SubSubList"))).click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al SUB SUB list" + "\n");

          //   // Hacer click en sub sub Item 1

          //       driver.findElement(By.xpath(propiedades.getProperty("Menu.SubSubItem1"))).click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al SUB SUB item1" + "\n");

          //   // Hacer click en sub sub Item 2

          //       driver.findElement(By.xpath(propiedades.getProperty("Menu.SubSubItem2"))).click();
          //       Thread.sleep(500);
          //       System.out.println("se hace click al SUB SUB item2" + "\n");

          // } catch(Exception e){
          //   e.printStackTrace();
          // } finally{
          //   driver.quit();
          // }

          //CASO DE PRUEVA 018

          // try {

          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);

          //   WebElement menu = driver.findElement(By.xpath(propiedades.getProperty("menu.widgets")));
          //   menu.click();
          //   Thread.sleep(500);    

          //   WebElement submenu = driver.findElement(By.xpath(propiedades.getProperty("submenu.Select_Menu")));
          //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
          //   Thread.sleep(500); 
          //   submenu.click();
          //   Thread.sleep(500);
          
          //   // Hacer click en el menu de select value
          //   // Hacer click en Group1, option 1 

          //       driver.findElement(By.id("react-select-2-input")).sendKeys("Group 1, option 1"+ Keys.ENTER);
          //       Thread.sleep(500);
          //       System.out.println("se selecciona Group1, option 1" + "\n");
                
          //   // Hacer click en el menu de Select One
          //   // Hacer click en Dr.

          //       driver.findElement(By.id("react-select-3-input")).sendKeys("Dr."+ Keys.ENTER);
          //       Thread.sleep(500);
          //       System.out.println("se selecciona Dr." + "\n");

          //   // Hacer click en el menu de old Style Select Menu
          //   // Hacer click en Green

          //         WebElement select = driver.findElement(By.id("oldSelectMenu"));
          //         Select selectStyle = new Select(select);
          //         selectStyle.selectByVisibleText("Green");
          //         Thread.sleep(500);
          //         System.out.println("se selecciona Green" + "\n");

          //   // Hacer click en el menu de Multiselect drop down
          //   // Hacer click en Green

          //       WebElement multiSelect = driver.findElement(By.id("react-select-4-input"));
          //       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiSelect);
          //         multiSelect.sendKeys("Green"+ Keys.ENTER);
          //         Thread.sleep(500);
          //         System.out.println("se selecciona Green" + "\n");

          //   // Hacer click en Blue

          //       multiSelect.sendKeys("Blue"+ Keys.ENTER);
          //       Thread.sleep(500);
          //       System.out.println("se selecciona Blue" + "\n");

          //   // Hacer click en la cruz del Blue

          //       driver.findElement(By.xpath(propiedades.getProperty("close.CloseBlue"))).click();
          //       Thread.sleep(500);
          //       System.out.println("se desselecciona Green" + "\n");

          //   // Hacer click en Volvo de Standard multi select

          //       WebElement cars = driver.findElement(By.id("cars"));
          //       Select volvoSelect = new Select(cars);
          //       volvoSelect.selectByVisibleText("Volvo");
          //       Thread.sleep(500);
          //       System.out.println("se selecciona Volvo" + "\n");

          //   // hacer ctrl click en Saab

          //       Select saabSelect = new Select(cars);
          //       saabSelect.selectByVisibleText("Saab");
          //       Thread.sleep(500);
          //       System.out.println("se selecciona Saab" + "\n");

          // }  catch(Exception e){
          //     e.printStackTrace();
          // } finally{
          //     driver.quit();
          // }
    }
}