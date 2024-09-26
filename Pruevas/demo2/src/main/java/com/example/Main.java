package com.example;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

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

public class Main {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        //CASO DE Prueba 001
        // try{

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(500);
        //     WebElement submenu = driver.findElement(By.id("item-0"));
        //     submenu.click();
        //     Thread.sleep(500);

        //    // Rellenar el apartado Full Name

        //     WebElement userName = driver.findElement(By.id("userName"));
        //     userName.sendKeys("Holaquetal");
        //     System.out.println("Se ha escrito el username");
        //     Thread.sleep(500);
        //     // Introducir un Correo electronico erroneo

        //     WebElement email = driver.findElement(By.id("userEmail"));
        //     email.sendKeys("EmailMalo");
        //     System.out.println("Se ha escrito el email incorrecto");
        //     Thread.sleep(500);

        //     //Pulsar el botón de submit

        //     WebElement submit = driver.findElement(By.id("submit"));
        //     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        //     submit.click();
        //     Thread.sleep(500);

        //     //Corregir el correo incorrecto

        //     email.clear();
        //     email.sendKeys("Email@Bueno.com");
        //     System.out.println("Se ha escrito el email correcto");
        //     Thread.sleep(500);

        //     //Rellenar el apartado de Current 
            
        //     WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        //     currentAddress.sendKeys("HolaQueTal");
        //     System.out.println("Se ha escrito la dirección");
        //     Thread.sleep(500);

        //     //Rellenar el apartado de Permanent Address

        //     WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        //     permanentAddress.sendKeys("HolaQueTal");
        //     System.out.println("Se ha escrito la dirección permanente");
        //     Thread.sleep(500);

        //     //Hacemos click en el botón de submit

        //     submit.click();

        //     //Recoger los datos que la pagina nos ha proporcionado

        //     WebElement data = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]"));
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
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-1"));
        //     submenu.click();
        //     Thread.sleep(500);

        //   // Hacer clic en desplegable   de Home

        //       WebElement homeDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));           
        //       homeDes.click();            
        //       Thread.sleep(500);
        //       System.out.println("home desplegado");

        //   // Hacer click en desplegable   de Desktop
             
        //   WebElement desktopDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));       
        //   desktopDes.click();
        //   Thread.sleep(500);
        //   System.out.println("desktop desplegado");           

        //   // Hacer click en desplegable   de Documents

        //   WebElement documentsDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]/*[name()='svg'][1]"));
        //   documentsDes.click();
        //   Thread.sleep(500); 
        //   System.out.println("documents desplegado");

        //   // Hacer click en desplegable de Downloads

        //   WebElement downloadsDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]/*[name()='svg'][1]"));
        //   downloadsDes.click();
        //   Thread.sleep(500);
        //   System.out.println("downloads desplegado");

        //   // Hacer click en desplegable de WorkSpace

        //   WebElement workSpaceDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));
        //   workSpaceDes.click();
        //   Thread.sleep(500);
        //   System.out.println("workspace desplegado");

        //   // Hacer click en desplegable de Office

        //   WebElement officeDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/button[1]/*[name()='svg'][1]"));
        //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", officeDes);
        //   Thread.sleep(500); 
        //   officeDes.click();
        //   Thread.sleep(500);
        //   System.out.println("office desplegado");

        //   // Hacer click en Check box de Notes

        //   WebElement notesBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label"));
        //   notesBox.click();
        //   Thread.sleep(500);
        //   System.out.println("notes check");

        //   // Hacer click en Check box de Commands

        //   WebElement commandsBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   commandsBox.click();
        //   Thread.sleep(500);
        //   System.out.println("comands check");

        //   // Hacer click en Check box de Desktop

        //   WebElement desktopBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label"));
        //   desktopBox.click();   
        //   Thread.sleep(500);
        //   System.out.println("desktop uncheck");

        //   // Hacer click en Check box de Desktop

        //   desktopBox.click();
        //   Thread.sleep(500);
        //   System.out.println("descktop check");

        //   // Hacer click en Check box de React

        //   WebElement reactBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   reactBox.click();
        //   Thread.sleep(500);
        //   System.out.println("react check");

        //   // Hacer click en Check box de Angular

        //   WebElement angularBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   angularBox.click();
        //   Thread.sleep(500);
        //   System.out.println("angular check");

        //   // Hacer click en Check box de Veu

        //   WebElement veuBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   veuBox.click();
        //   Thread.sleep(500);
        //   System.out.println("veu check");

        //   // Hacer click en Check box de WorkSpace

        //   WebElement workSpaceBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label"));
        //   workSpaceBox.click();
        //   Thread.sleep(500);
        //   System.out.println("workspace uncheck");

        //   // Hacer click en Check box de WorkSpace

        //   workSpaceBox.click();
        //   Thread.sleep(500);
        //   System.out.println("workspace check");

        //   // Hacer click en Check box de Public

        //   WebElement publicBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   publicBox.click();
        //   Thread.sleep(500);
        //   System.out.println("public check");

        //   // Hacer click en Check box de Private

        //   WebElement privateBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   privateBox.click();
        //   Thread.sleep(500);
        //   System.out.println("private check");

        //   // Hacer click en Check box de Classified

        //   WebElement classifiedBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   classifiedBox.click();
        //   Thread.sleep(500);
        //   System.out.println("classified check");

        //   // Hacer click en Check box de General

        //   WebElement generalBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[4]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   generalBox.click();
        //   Thread.sleep(500);
        //   System.out.println("general check");

        //   // Hacer click en Check box de Office

        //   WebElement officeBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label"));
        //   officeBox.click();
        //   Thread.sleep(500);
        //   System.out.println("office uncheck");

        //   // Hacer click en Check box de Office

        //   officeBox.click();
        //   Thread.sleep(500);
        //   System.out.println("office check");

        //   // Hacer click en Check box de Word File.doc

        //   WebElement wordBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   wordBox.click();
        //   Thread.sleep(500);
        //   System.out.println("word check");

        //   // Hacer click en Check box de Excel File.doc

        //   WebElement excelBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //   excelBox.click();
        //   Thread.sleep(500);
        //   System.out.println("excel check");

        //   // Hacer click en Check box de Downloads

        //   WebElement downloadBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label"));
        //   downloadBox.click();
        //   Thread.sleep(500);
        //   System.out.println("download uncheck");

        //   // Hacer click en Check box de Downloads

        //   downloadBox.click();
        //   Thread.sleep(500);
        //   System.out.println("download check");

        //   // Hacer click en Check box de Home

        //   WebElement homeBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label"));
        //   homeBox.click();
        //   Thread.sleep(500); 
        //   System.out.println("home uncheck");

        //   // Hacer click en Check box de Home

        //   homeBox.click();
        //   Thread.sleep(500); 
        //   System.out.println("home check");

        //   // Hacer click en botón de comprimir

        //   WebElement colapseAll = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
        //   colapseAll.click();
        //   Thread.sleep(500);
        //   System.out.println("todo se ha cerrado");

        //   // Hacer click en botón de expandir

        //     WebElement expandAll = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"));
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
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-2"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     // hacemos click en el radio button de yes

        //     WebElement yes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/label[1]"));
        //     yes.click();
        //     Thread.sleep(500);
        //     System.out.println("se ha hecho click en yes");

        //     // Hacemos click en el radio button de Impresive

        //     WebElement impresive = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/label[1]"));
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

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
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
        //     firstNameAdd.sendKeys("Nombre");
        //     Thread.sleep(500);
        //     System.out.println("se añade el nombre"+"\n");

        //     // //Añadimos el apellido
            
        //     WebElement lastNameAdd = driver.findElement(By.id("lastName"));
        //     lastNameAdd.sendKeys("Apellido");
        //     Thread.sleep(500);
        //     System.out.println("se añade el apellido"+"\n");

        //     //Añadimos un correo incorrecto
            
        //     WebElement emailAdd = driver.findElement(By.id("userEmail"));
        //     emailAdd.sendKeys("emailErroneo");
        //     Thread.sleep(500);
        //     System.out.println("se añade un correao incorrecto"+"\n");

        //     //Añadimos una edad incorrecta

        //     WebElement ageAdd = driver.findElement(By.id("age"));
        //     ageAdd.sendKeys("asdf");
        //     Thread.sleep(500);
        //     System.out.println("se añade una edad incorrecta"+"\n");

        //     //Añadimos un salario incorrecto

        //     WebElement salaryAdd = driver.findElement(By.id("salary"));
        //     salaryAdd.sendKeys("aqwer");
        //     Thread.sleep(500);
        //     System.out.println("se añade un salario incorrecto"+"\n");

        //     //Añadimos un departamento

        //     WebElement departmentAdd = driver.findElement(By.id("department"));
        //     departmentAdd.sendKeys("poidf");
        //     Thread.sleep(500);
        //     System.out.println("se añade un departamento"+"\n");

        //     //Hacemos click al boton de submit

        //     WebElement submitAdd = driver.findElement(By.id("submit"));
        //     submitAdd.click();
        //     Thread.sleep(500);
        //     System.out.println("se hace click en el submid"+"\n");

        //     //Introducimos un email Correcto

        //     emailAdd.clear();
        //     emailAdd.sendKeys("Email@Correcto.com");
        //     Thread.sleep(500);
        //     System.out.println("se pone un email correcto"+"\n");

        //     //Hacemos click al boton de submit

        //     submitAdd.click();
        //     Thread.sleep(500);
        //     System.out.println("se hace click al boton de submit"+"\n");

        //     //Introducimos una edad correcta

        //     ageAdd.clear();
        //     ageAdd.sendKeys("23");
        //     Thread.sleep(500);
        //     System.out.println("Introducimos una edad correcta"+"\n");

        //     //Introducimos un salario correcto

        //     salaryAdd.clear();
        //     salaryAdd.sendKeys("1200");
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
        //     Thread.sleep(1000);
        //     System.out.println("Hacemos click en submit"+"\n");

        //     //Hacemos clic a la cruz del formulario

        //     WebElement exitEdit = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/button[1]"));
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
        //     emailEdit.sendKeys("CorreoIncorrecto");
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Email"+"\n");

        //     //Modificamos el Age

        //     ageEdit = driver.findElement(By.id("age"));
        //     ageEdit.clear();
        //     ageEdit.sendKeys("de");
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Age"+"\n");

        //     //Modificamos el Salary

        //     salaryEdit = driver.findElement(By.id("salary"));
        //     salaryEdit.clear();
        //     salaryEdit.sendKeys("hui");
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Salary"+"\n");

        //     //Le damos al boton de submit

        //     submidEdit = driver.findElement(By.id("submit"));
        //     submidEdit.click();
        //     Thread.sleep(1000);
        //     System.out.println("Le damos al boton de submit"+"\n");

        //     //Modificamos el Email

        //     emailEdit.clear();
        //     emailEdit.sendKeys("Correo@correcto.com");
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Email"+"\n");

        //     //Modificamos el Age

        //     ageEdit.clear();
        //     ageEdit.sendKeys("23");
        //     Thread.sleep(500);
        //     System.out.println("Modificamos el Age"+"\n");

        //     //Modificamos el Salary

        //     salaryEdit.clear();
        //     salaryEdit.sendKeys("1500");
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

        //     WebElement firstNameorder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        //     WebElement firstNameorder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        //     firstNameorder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico el First Name"+"\n");

        //     firstNameorder2.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden descendente el First Name"+"\n");


        //     //Ordenamos por orden alfabetico y descendente por el Last Name

        //     WebElement lastNameOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]"));
        //     WebElement lastNameOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]"));
        //     lastNameOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico el First Name"+"\n");

        //     lastNameOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por orden descendente el Last Name"+"\n");

        //     //Ordenamos por orden de mas grande a mas puequeño y viceversa por el Age

        //     WebElement ageOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]"));
        //     WebElement ageOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]"));
        //     ageOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden de mas grande a mas puequeño el Age"+"\n");

        //     ageOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por viceversa por el Age"+"\n");

        //     //Ordenamos por orden alfabetico y descendente por el Email

        //     WebElement emailOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]"));
        //     WebElement emailOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]"));
        //     emailOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico el Email"+"\n");

        //     emailOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por orden descendente el Email"+"\n");

        //     //Ordenamos por orden de mas grande a mas puequeño y viceversa por el Salary

        //     WebElement salaryOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]"));
        //     WebElement salaryOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]"));
        //     salaryOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden de mas grande a mas puequeño el Salary"+"\n");

        //     salaryOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por viceversa el Salary"+"\n");

        //     //Ordenamos por orden alfabetico y descendente por el Department

        //     WebElement departmentOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[6]/div[1]"));
        //     WebElement departmentOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[6]/div[1]"));
        //     departmentOrder.click();
        //     Thread.sleep(500);
        //     System.out.println("Ordenamos por orden alfabetico por el Department"+"\n");

        //     departmentOrder2.click();
        //     Thread.sleep(500); 
        //     System.out.println("Ordenamos por orden descendente por el Department"+"\n");

        //     //Ordenamos por orden alfabetico y descendente por orden de creación

        //     WebElement actionOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[7]/div[1]"));
        //     WebElement actionOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[7]/div[1]"));
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
        //           firstNameAdd.sendKeys("Nombre");
                
        //           lastNameAdd = driver.findElement(By.id("lastName"));
        //           lastNameAdd.sendKeys("Apellido");
                
        //           emailAdd = driver.findElement(By.id("userEmail"));
        //           emailAdd.sendKeys("emailErroneo");
    
        //           ageAdd = driver.findElement(By.id("age"));
        //           ageAdd.sendKeys("asdf");
    
        //           salaryAdd = driver.findElement(By.id("salary"));
        //           salaryAdd.sendKeys("aqwer");
    
        //           departmentAdd = driver.findElement(By.id("department"));
        //           departmentAdd.sendKeys("poidf");
    
        //          submitAdd = driver.findElement(By.id("submit"));
        //           submitAdd.click();
    
        //           emailAdd.clear();
        //           emailAdd.sendKeys("Email@Correcto.com");
    
        //           submitAdd.click();
    
        //           ageAdd.clear();
        //           ageAdd.sendKeys("23");
                  
        //           salaryAdd.clear();
        //           salaryAdd.sendKeys("1200");
    
        //           submitAdd.click();
        //     }

        //     System.out.println("se han creado los usuarios"+"\n");

        //     Thread.sleep(2000);

        //     //Acotamos a 5 lineas

        //     WebElement rows = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
        //     Select rowsSelect = new Select(rows);
        //     rowsSelect.selectByVisibleText("5 rows");
        //     Thread.sleep(2000);
        //     System.out.println("se acotaros las lineas"+"\n");

        //     //Pasamos a la pagina siguiente

        //     WebElement next = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[3]/button[1]"));
        //     next.click();
        //     Thread.sleep(2000);
        //     System.out.println("Pasamos a la pagina siguiente"+"\n");

        //     //Pasamos a la pagina anterior

        //     WebElement previous = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/button[1]"));
        //     previous.click();
        //     Thread.sleep(2000);
        //     System.out.println("Pasamos a la pagina anterior"+"\n");

        //     //Pasamos a la siguiente pagina a traves de escrivir el numero de la pagina que queremos en el quadro de texto

        //     WebElement section = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[1]/div[1]/input[1]"));
        //     section.clear();
        //     section.sendKeys("2");
        //     section.sendKeys(Keys.ENTER);
        //     Thread.sleep(2000);
        //     System.out.println("Pasamos a la siguiente pagina a traves de escrivir el numero de la pagina que queremos en el quadro de texto"+"\n");

        //     //Filtramos un Nombre en la barra de busqueda

        //     WebElement searchBox = driver.findElement(By.id("searchBox"));
        //     searchBox.sendKeys("Kierra");
        //     Thread.sleep(2000);
        //     searchBox.clear();
        //     Thread.sleep(2000);
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
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-4"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     //Hacemos doble click en el boton de Double click

        //     WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        //     act.doubleClick(doubleClick).perform();
        //     Thread.sleep(2000);
        //     System.out.println("se ha hecho doble click al Doube click" + "\n");

        //     //Hacemos click derecho en el boton de Right click

        //     WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        //     act.contextClick(rightClick).perform();
        //     Thread.sleep(2000);
        //     System.out.println("se ha hecho click al Right click" + "\n");

        //     //Hacemos click en el boton de Click Me

        //     WebElement click = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]"));
        //     click.click();
        //     Thread.sleep(2000);
        //     System.out.println("se ha hecho click al Click Me" + "\n");

            

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


              //CASO DE Prueba 006

        try{

                driver.get("https://demoqa.com");
                Thread.sleep(500);
                WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
                menu.click();
                Thread.sleep(500);
                
                WebElement submenu = driver.findElement(By.id("item-7"));
                submenu.click();
                Thread.sleep(3000);

                //Hacemos click en el boton de download

                WebElement download = driver.findElement(By.id("downloadButton"));
                download.click();
                System.out.println("se ha descargado el archivo" + "\n");

                //Subimos el archivo descargado

                WebElement uploadFile = driver.findElement(By.id("uploadFile"));
                uploadFile.sendKeys("C:\\Users\\ramon.fernandez-roig\\Downloads\\sampleFile.jpeg");
                Thread.sleep(5000);
                System.out.println("se ha cargado el archivo" + "\n");

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }


              //CASO DE Prueba 007
      //   try {

      //           driver.get("https://demoqa.com");
      //           Thread.sleep(500);
      //           WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
      //           menu.click();
      //           Thread.sleep(500);
                
      //           WebElement submenu = driver.findElement(By.id("item-8"));
      //           submenu.click();
      //           Thread.sleep(500);

      //           //Extrae el color del boton color change antes de que canvie de color

      //           WebElement extractColor = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]"));
      //           System.out.println(extractColor.getCssValue("color"));

      //             //Espera 5 segundos para que el boton color change canvie de color y extrae su color

      //           Thread.sleep(5000);
      //           System.out.println(extractColor.getCssValue("color"));

      //           //Extremos el random id

      //           WebElement randomId = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]"));
      //           System.out.println(randomId.getAttribute("id"));

      //           //Hacemos click en el boton de enable after 5 seconds

      //           WebElement enableAfter = driver.findElement(By.id("enableAfter"));
      //           enableAfter.click();
      //           Thread.sleep(2000);

      //           //Hacemos click en el boton de visible after 5 seconds

      //           WebElement visibleAfter = driver.findElement(By.id("visibleAfter"));
      //           visibleAfter.click();
      //           Thread.sleep(2000);

      //   } catch(Exception e){
      //       e.printStackTrace();
      //   } finally{
      //       driver.quit();
      //   }


      //CASO DE Prueba 008
      //   try{
      //           driver.get("https://demoqa.com");
      //           Thread.sleep(500);
      //           WebElement menu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/*[name()='svg'][1]"));
      //           menu.click();
      //           Thread.sleep(2000);
                
      //           WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]"));
      //           submenu.click();
      //           Thread.sleep(500);

      //           // //Hacemos click al boton de submit

      //           WebElement submitForm = driver.findElement(By.id("submit"));
      //           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitForm);
      //           Thread.sleep(500); 
      //           submitForm.click();
      //           Thread.sleep(2000);

      //           //Rellenamos el campo firstName

      //           WebElement firstNameForm = driver.findElement(By.id("firstName"));
      //           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstNameForm);
      //           Thread.sleep(500); 
      //           firstNameForm.sendKeys("PruebaName");
      //           Thread.sleep(500);
                
      //           //Rellenamos el campo Last Name

      //           WebElement lastNameForm = driver.findElement(By.id("lastName"));
      //           lastNameForm.sendKeys("PruebaLastName");
      //           Thread.sleep(500);

      //           //Rellenamos el campo Email

      //           WebElement emailForm = driver.findElement(By.id("userEmail"));
      //           emailForm.sendKeys("PruebaEmail");
      //           Thread.sleep(1500);

      //           //Hacer click en el boton de submit

      //           submitForm.click();

      //           //Rellenamos el campo Email carrectamente

      //           emailForm.clear();
      //           emailForm.sendKeys("Prueba@Email.com");
      //           Thread.sleep(500);

      //           //Hacer click en el radio button de Male

      //           WebElement maleRadioButtonForm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
      //           maleRadioButtonForm.click();
      //           Thread.sleep(500);

      //           //Rellenamos el campo Mobile con 10 letras

      //           WebElement mobileForm = driver.findElement(By.id("userNumber"));
      //           mobileForm.sendKeys("gshdretsgd");
      //           Thread.sleep(1000);

      //           //Rellenamos el campo mobile con 5 numeros

      //           mobileForm.clear();
      //           mobileForm.sendKeys("12345");
      //           Thread.sleep(1000);

      //           //Hacemos click al boton de submit

      //           submitForm.click();
      //           Thread.sleep(1000);

      //           //Rellenamos el campo Mobile con 10 numeros

      //           mobileForm.clear();
      //           mobileForm.sendKeys("1234567890");
      //           Thread.sleep(1000);

      //           //Hacer click en date of birth

      //           WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
      //           dateOfBirth.click();
      //           Thread.sleep(1000);

      //           //Hacer click en los meses Y seleccionar Enero

      //           WebElement monthForm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
      //           Select monthSelect = new Select(monthForm);
      //           monthSelect.selectByVisibleText("January");
      //           Thread.sleep(1000);

      //           //Hacer click en los años Y seleccionar 2004

      //           WebElement yearForm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
      //           Select yearSelect = new Select(yearForm);
      //           yearSelect.selectByVisibleText("2004");
      //           Thread.sleep(1000);    
                
                
      //           //Hacer click en 16

      //           WebElement dayForm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[6]"));
      //           dayForm.click();
      //           Thread.sleep(1000);  

      //           //Rellenar el campo Subjects

      //           WebElement subjectsForm = driver.findElement(By.id("subjectsInput"));
      //           subjectsForm.sendKeys("English");
      //           subjectsForm.sendKeys(Keys.ENTER);
      //           Thread.sleep(1000);

      //           //Rellenar el campo subjects

      //           subjectsForm.sendKeys("Math");
      //           subjectsForm.sendKeys(Keys.ENTER);
      //           Thread.sleep(1000);

      //           //Hacer click en Sports, Reading y Music

      //           WebElement sports = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]/label[1]"));
      //           WebElement reading = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]/label[1]"));
      //           WebElement music = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]"));

      //           sports.click();
      //           Thread.sleep(1000);
      //           reading.click();
      //           Thread.sleep(1000);
      //           music.click();
      //           Thread.sleep(1000);

      //           //Subir un archivo

      //           WebElement uploadFile = driver.findElement(By.id("uploadPicture"));
      //           uploadFile.sendKeys("C:\\Users\\ramon.fernandez-roig\\Downloads\\sampleFile.jpeg");
      //           Thread.sleep(1000);

      //           //Rellenar el campo current address

      //           WebElement currentAddressForm = driver.findElement(By.id("currentAddress"));
      //           currentAddressForm.sendKeys("Carrer Hola");
      //           Thread.sleep(1000);

      //           //Seleccionar un estado y ciudad

      //           WebElement stateForm = driver.findElement(By.id("react-select-3-input"));
      //           stateForm.sendKeys("NCR");
      //           stateForm.sendKeys(Keys.ENTER);
      //           Thread.sleep(1000);

      //           WebElement cityForm = driver.findElement(By.id("react-select-4-input"));
      //           cityForm.sendKeys("Delhi");
      //           cityForm.sendKeys(Keys.ENTER);
      //           Thread.sleep(1000);

      //           //hacer click al boton de submit

      //           submitForm.click();

      //           Thread.sleep(2000);

      //           //Obtener los resultados

      //           System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div")).getText());

      //   } catch(Exception e){
      //       e.printStackTrace();
      //   } finally{
      //       driver.quit();
      //   }

        //CASO DE Prueba 009
      //   try {

      //       driver.get("https://demoqa.com");
      //       Thread.sleep(500);
      //       WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
      //       menu.click();
      //       Thread.sleep(2000);       
      //       WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]"));
      //       submenu.click();
      //       Thread.sleep(500);

      //       //Hacemos click al boton de New Tab

      //       driver.findElement(By.id("tabButton")).click();

      //       //Guardamos en un array las pestañas disponibles y nos cambiamos a la pestaña nueva

      //       ArrayList<String> pestañas = new ArrayList<>(driver.getWindowHandles());
      //       driver.switchTo().window(pestañas.get(1));
      //       Thread.sleep(2000);

      //       //Cerramos la pestaña

      //       driver.close();
      //       Thread.sleep(2000);

      //       //Cambiamos a la pestaña original y hacemos clic al boton de New Window

      //       driver.switchTo().window(pestañas.get(0));
      //       driver.findElement(By.id("windowButton")).click();
      //       Thread.sleep(2000);

      //       //Guardamos en un array las ventanas disponibles y nos cambiamos a la ventana nueva

      //       ArrayList<String> ventanas = new ArrayList<>(driver.getWindowHandles());
      //       driver.switchTo().window(ventanas.get(1));
      //       Thread.sleep(2000);

      //       //Cerramos la ventana

      //       driver.close();
      //       Thread.sleep(2000);

      //       //Cambiamos a la ventana original y hacemos clic al boton de New Window Message

      //       driver.switchTo().window(ventanas.get(0));
      //       driver.findElement(By.id("messageWindowButton")).click();
      //       Thread.sleep(2000);

      //       //Guardamos en un array las ventanas disponibles y nos cambiamos a la ventana nueva

      //       ventanas = new ArrayList<>(driver.getWindowHandles());
      //       driver.switchTo().window(ventanas.get(1));
      //       Thread.sleep(2000);

      //       //Cerramos la ventana

      //       driver.close();
      //       Thread.sleep(2000);

      //   } catch(Exception e){
      //       e.printStackTrace();
      //   } finally{
      //       driver.quit();
      //   }

        //CASO DE Prueba 010

        // try{

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
        //     menu.click();
        //     Thread.sleep(2000);       
        //     WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     //Hacemos click en el boton para ver una alert

        //     driver.findElement(By.id("alertButton")).click();
        //     Thread.sleep(2000);

        //     //Cambiamos al alert y acceptamos el alert

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().accept();
        //     Thread.sleep(2000);

        //     //Hacemos click al segundo boton y esperamos 5 segundos

        //     driver.findElement(By.id("timerAlertButton")).click();
        //     Thread.sleep(7000);

        //     //Cambiamos al alert que saldrá dentro de 5 segundos y lo aceptamos

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().accept();
        //     Thread.sleep(2000);

        //     //Hacemos click al tercer boton

        //     driver.findElement(By.id("confirmButton")).click();
        //     Thread.sleep(2000);

        //     //Cambiamos al alert que saldrá y acceptamos

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().accept();
        //     Thread.sleep(2000);  

        //     //Hacemos click al tercer boton

        //     driver.findElement(By.id("confirmButton")).click();
        //     Thread.sleep(2000);

        //     //Cambiamos al alert que saldrá y cancelamos

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().dismiss();
        //     Thread.sleep(2000);     

        //     //Hacemos click al cuarto boton

        //     driver.findElement(By.id("promtButton")).click();
        //     Thread.sleep(2000);

        //     //Cambiamos al alert que saldrá y escrivimos la Prueba y aceptamos

        //     driver.switchTo().alert();
        //     driver.switchTo().alert().sendKeys("hola");
        //     Thread.sleep(2000);
        //     driver.switchTo().alert().accept();
        //     Thread.sleep(2000);  

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        //CASO DE Prueba 011

        // try{

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
        //     menu.click();
        //     Thread.sleep(2000);       
        //     WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]"));
        //     submenu.click();
        //     Thread.sleep(500);
            
            //Cambiamos a la perspectiva del frame1

            // driver.switchTo().frame("frame1");

            // //Extraemos el texto del frame

            // System.out.println(driver.findElement(By.id("sampleHeading")).getText());

            // //Cambiamos a la pagina principal

            // driver.switchTo().defaultContent();

            // //Cambiamos al iFrame de abajo

            // driver.switchTo().frame("frame2");

            // System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        //CASO DE PRUEBA 012

        // try {
 
        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
        //     menu.click();
        //     Thread.sleep(2000);       
        //     WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     // Cambiar la perspectiva al iFrame Parent

        //         driver.switchTo().frame("frame1");

        //     // Extraer el Texto  <p>Parent frame</p>

        //         WebElement parentFrame = driver.findElement(By.xpath("/html[1]/body[1]"));
        //         System.out.println(parentFrame.getText());

        //     // Cambiar la perspectiva al iFrame Child

        //         driver.switchTo().frame(0);

        //     // Extraer el Texto  <p>Child Iframe</p>

        //         System.out.println(driver.findElement(By.xpath("/html/body/p")).getText());


        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

          //CASO DE PRUEBA 13

          // try {

          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
          //   menu.click();
          //   Thread.sleep(2000);       
          //   WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]"));
          //   submenu.click();
          //   Thread.sleep(500);

          //   // Hacer click al botón de Small Modla

          //       driver.findElement(By.id("showSmallModal")).click();
          //       Thread.sleep(1000);

          //   // Extraemos el texto

          //       System.err.println(driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]")).getText());

          //   // Hacer click al botón de Close

          //       driver.findElement(By.id("closeSmallModal")).click();
          //       Thread.sleep(1000);

          //   // Hacer click al botón de Large modal

          //       driver.findElement(By.id("showLargeModal")).click();
          //       Thread.sleep(1000);

          //   // Extraemos el texto

          //       System.err.println(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/p[1]")).getText());

          // } catch(Exception e){
          //     e.printStackTrace();
          // } finally{
          //     driver.quit();
          // }

          //CASO DE PRUEBA 014

          // try {
            
          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
          //   menu.click();
          //   Thread.sleep(2000);       
          //   WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/span[1]"));
          //   submenu.click();
          //   Thread.sleep(500);

          //   //Hacer click  al cuadro de texto de Select 
            
          //       WebElement date = driver.findElement(By.id("datePickerMonthYearInput"));
          //       date.click();
          //       Thread.sleep(500);

          //   // Hacer click en los meses
          //   // Hacer click en el mes January

          //   WebElement month = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
          //     Select monthSelect = new Select(month);
          //     monthSelect.selectByVisibleText("January");
          //     Thread.sleep(1000);

          //   // Hacer click en los años
          //   // Hacer click en el año 2004

          //   WebElement year = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
          //     Select yearSelect = new Select(year);
          //     yearSelect.selectByVisibleText("2004");
          //     Thread.sleep(2000);

          //   // Hacer click en el dia 16

          //       driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]")).click();
          //       Thread.sleep(1000);

          //   // escrivir una fecha incorrecta con letras
          //       date.sendKeys(Keys.CONTROL+"a");
          //       date.sendKeys(Keys.DELETE);
          //       Thread.sleep(2000);
          //       date.sendKeys("fgdsajhk");
          //       date.sendKeys(Keys.ENTER);
          //       Thread.sleep(1000);
                
          //   // escrivir una fecha incorrecta con numeros

          //       date.sendKeys(Keys.CONTROL+"a");
          //       date.sendKeys(Keys.DELETE);
          //       Thread.sleep(2000);
          //       date.sendKeys("43526/43627/20019");
          //       date.sendKeys(Keys.ENTER);
          //       Thread.sleep(1000);

          //   // escrivir una fecha correcta 

          //       date.sendKeys(Keys.CONTROL+"a");
          //       date.sendKeys(Keys.DELETE);
          //       Thread.sleep(2000);
          //       date.sendKeys("12/1/2004");
          //       date.sendKeys(Keys.ENTER);
          //       Thread.sleep(1000);


          //   // Hacer click  al cuadro de texto de Date And Time

          //       WebElement dateAndTime = driver.findElement(By.id("dateAndTimePickerInput"));
          //       dateAndTime.click();
          //       Thread.sleep(500);

          //   // Hacer click en los meses

          //       driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]")).click();
              
          //   // Hacer click en el mes January

          //       driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
          //       Thread.sleep(2000);

          //   // Hacer click en los años

          //       driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]")).click();

          //   // Hacer click en el mes 2004

          //       driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[10]")).click();
          //       Thread.sleep(2000);
                
          //   // Hacer click en el dia 16

          //       driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[7]")).click();
          //       Thread.sleep(2000);
          //   // Hacer click en la hora 9:15

          //       driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[45]")).click();
          //       Thread.sleep(2000);

          //   // escrivir una fecha incorrecta con letras

          //       dateAndTime.sendKeys(Keys.CONTROL+"a");
          //       dateAndTime.sendKeys(Keys.DELETE);
          //       Thread.sleep(2000);
          //       dateAndTime.sendKeys("fdgsjhk");
          //       dateAndTime.sendKeys(Keys.ENTER);
          //       Thread.sleep(1000);
          //   // escrivir una fecha incorrecta con numeros

          //       dateAndTime.sendKeys(Keys.CONTROL+"a");
          //       dateAndTime.sendKeys(Keys.DELETE);
          //       Thread.sleep(2000);
          //       dateAndTime.sendKeys("September 342, 432432 106:54 AM");
          //       dateAndTime.sendKeys(Keys.ENTER);
          //       Thread.sleep(1000);
          //   // escrivir una fecha y hora correcta

          //       dateAndTime.sendKeys(Keys.CONTROL+"a");
          //       dateAndTime.sendKeys(Keys.DELETE);
          //       Thread.sleep(2000);
          //       dateAndTime.sendKeys("jANUARY 16, 2004 12:54 AM");
          //       dateAndTime.sendKeys(Keys.ENTER);
          //       Thread.sleep(1000);

          // } catch(Exception e){
          //     e.printStackTrace();
          // } finally{
          //     driver.quit();
          // }

          //CASO DE PRUEBA 015

          // try {

            
          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
          //   menu.click();
          //   Thread.sleep(2000);       
          //   WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]"));
          //   submenu.click();
          //   Thread.sleep(500);

          //   //Mover el slider de arriba a abajo hasta el final

          //   WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
          //   for (int i = 0; i < 25; i++) {
          //     slider.sendKeys(Keys.ARROW_LEFT);
          //   }
          //   for (int i = 0; i < 100; i++) {
          //     slider.sendKeys(Keys.ARROW_RIGHT);
          //   }

          // } catch(Exception e){
          //   e.printStackTrace();
          // } finally{
          //   driver.quit();
          // }

          //CASO DE PRUEBA 016

          // try {

          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
          //   menu.click();
          //   Thread.sleep(2000);       
          //   WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]"));
          //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
          //   Thread.sleep(500); 
          //   submenu.click();
          //   Thread.sleep(500);

          //   // Hacer click en el botón Start

          //       WebElement button = driver.findElement(By.id("startStopButton"));
          //       button.click();
          //       Thread.sleep(1000);
          //   // Hacer click en el botón Stop

          //       button.click();
          //       Thread.sleep(1000);
          //       button.click();
                
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
          //       Thread.sleep(2000);

          // } catch(Exception e){
          //   e.printStackTrace();
          // } finally{
          //   driver.quit();
          // }

          //CASO DE PRUEVA 017

          // try {

          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
          //   menu.click();
          //   Thread.sleep(2000);       
          //   WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]/span[1]"));
          //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
          //   Thread.sleep(500); 
          //   submenu.click();
          //   Thread.sleep(1000);


          //   // hacer click en Main Item 1
          //       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]")).click();
          //       Thread.sleep(1000);
          //   // hacer click en Main Item 2

          //       WebElement subMenu2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]"));
          //       subMenu2.click();
          //       Thread.sleep(1000);

          //   // hacer click en Main Item 3

          //       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")).click();
          //       Thread.sleep(1000);

          //   // Pasar por encima del main item 2

          //       subMenu2.click();
          //       Thread.sleep(1000);

          //   // Hacer click en sub item
            
          //       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
          //       Thread.sleep(1000);

          //   // Hacer click en sub Item

          //       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")).click();
          //       Thread.sleep(1000);

          //   // Pasar por encima del SUB SUB List

          //       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();
          //       Thread.sleep(1000);

          //   // Hacer click en sub sub Item 1

          //       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
          //       Thread.sleep(1000);

          //   // Hacer click en sub sub Item 2

          //       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
          //       Thread.sleep(1000);

          // } catch(Exception e){
          //   e.printStackTrace();
          // } finally{
          //   driver.quit();
          // }

          //CASO DE PRUEVA 018

          // try {

          //   driver.get("https://demoqa.com");
          //   Thread.sleep(500);
          //   WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
          //   menu.click();
          //   Thread.sleep(2000);       
          //   WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]"));
          //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submenu);
          //   Thread.sleep(500); 
          //   submenu.click();
          //   Thread.sleep(1000);

          //   // Hacer click en el menu de select value
          //   // Hacer click en Group1, option 1 

          //       driver.findElement(By.id("react-select-2-input")).sendKeys("Group 1, option 1"+ Keys.ENTER);
          //       Thread.sleep(1000);
                
          //   // Hacer click en el menu de Select One
          //   // Hacer click en Dr.

          //       driver.findElement(By.id("react-select-3-input")).sendKeys("Dr."+ Keys.ENTER);
          //       Thread.sleep(1000);

          //   // Hacer click en el menu de old Style Select Menu
          //   // Hacer click en Green

          //         WebElement select = driver.findElement(By.id("oldSelectMenu"));
          //         Select selectStyle = new Select(select);
          //         selectStyle.selectByVisibleText("Green");
          //         Thread.sleep(1000);
          //   // Hacer click en el menu de Multiselect drop down
          //   // Hacer click en Green

          //       WebElement multiSelect = driver.findElement(By.id("react-select-4-input"));
          //       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiSelect);
          //         multiSelect.sendKeys("Green"+ Keys.ENTER);
          //         Thread.sleep(1000);

          //   // Hacer click en 

          //       multiSelect.sendKeys("Blue"+ Keys.ENTER);
          //       Thread.sleep(1000);

          //   // Hacer click en la cruz del Blue

          //       driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[2]/div/div[2]")).click();
          //       Thread.sleep(1000);

          //   // Hacer click en Volvo de Standard multi select

          //       WebElement cars = driver.findElement(By.id("cars"));
          //       Select volvoSelect = new Select(cars);
          //       volvoSelect.selectByVisibleText("Volvo");
          //       Thread.sleep(1000);

          //   // hacer ctrl click en Saab

          //       Select saabSelect = new Select(cars);
          //       saabSelect.selectByVisibleText("Saab");
          //       Thread.sleep(1000);

          // }  catch(Exception e){
          //     e.printStackTrace();
          // } finally{
          //     driver.quit();
          // }
    }
}