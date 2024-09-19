package com.example;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        //CASO DE PRUEVA 001
        // try{

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(500);
        //     WebElement submenu = driver.findElement(By.id("item-0"));
        //     submenu.click();
        //     Thread.sleep(500);
        //     WebElement userName = driver.findElement(By.id("userName"));
        //     userName.sendKeys("Holaquetal");
        //     Thread.sleep(500);
        //     WebElement email = driver.findElement(By.id("userEmail"));
        //     email.sendKeys("EmailMalo");
        //     Thread.sleep(500);

        //     WebElement submit = driver.findElement(By.id("submit"));

        //     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        //     Thread.sleep(500); 
            
        //     submit.click();

        //     Thread.sleep(500);

        //     email.clear();

        //     email.sendKeys("Email@Bueno.com");

        //     Thread.sleep(500);

        //     WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        //     currentAddress.sendKeys("HolaQueTal");

        //     Thread.sleep(500);

        //     WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        //     permanentAddress.sendKeys("HolaQueTal");

        //     Thread.sleep(500);

        //     submit.click();

        //     WebElement data = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]"));

        //     String dataText = data.getText();

        //     System.out.println(dataText);
            
            
        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


              //CASO DE PRUEVA 002
        // try{

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-1"));
        //     submenu.click();
        //     Thread.sleep(500);
            
        //     WebElement homeDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));           
        //     homeDes.click();            
        //     Thread.sleep(500);

             
        //     WebElement desktopDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));       
        //     desktopDes.click();
        //     Thread.sleep(500);
             
        //     WebElement documentsDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]/*[name()='svg'][1]"));
        //     documentsDes.click();
        //     Thread.sleep(500); 


        //     WebElement downloadsDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]/*[name()='svg'][1]"));
        //     downloadsDes.click();
        //     Thread.sleep(500);

        //     WebElement notesBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     notesBox.click();
        //     Thread.sleep(500);

        //     WebElement commandsBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     commandsBox.click();
        //     Thread.sleep(500);

        //     WebElement desktopBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     desktopBox.click();   
        //     Thread.sleep(500);

        //     WebElement workSpaceDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));
        //     workSpaceDes.click();
        //     Thread.sleep(500);

        //     WebElement officeDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/button[1]/*[name()='svg'][1]"));
        //     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", officeDes);
        //     Thread.sleep(500); 

        //     officeDes.click();
        //     Thread.sleep(500);

        //     WebElement reactBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     reactBox.click();
        //     Thread.sleep(500);

        //     WebElement angularBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     angularBox.click();
        //     Thread.sleep(500);

        //     WebElement veuBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     veuBox.click();
        //     Thread.sleep(500);

        //     WebElement workSpaceBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     workSpaceBox.click();
        //     Thread.sleep(500);

        //     WebElement publicBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     publicBox.click();
        //     Thread.sleep(500);

        //     WebElement privateBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     privateBox.click();
        //     Thread.sleep(500);

        //     WebElement classifiedBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     classifiedBox.click();
        //     Thread.sleep(500);

        //     WebElement generalBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[4]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     generalBox.click();
        //     Thread.sleep(500);

        //     WebElement officeBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     officeBox.click();
        //     Thread.sleep(500);

        //     WebElement wordBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     wordBox.click();
        //     Thread.sleep(500);

        //     WebElement excelBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     excelBox.click();
        //     Thread.sleep(500);

        //     WebElement downloadBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     downloadBox.click();
        //     Thread.sleep(500);

        //     WebElement homeBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     homeBox.click();
        //     Thread.sleep(500); 

        //     WebElement colapseAll = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
        //     colapseAll.click();
        //     Thread.sleep(500);

        //     WebElement expandAll = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"));
        //     expandAll.click();
        //     Thread.sleep(500);
            

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


      //CASO DE PRUEVA 003
        // try {
        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(500);
            
        //     WebElement submenu = driver.findElement(By.id("item-2"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     WebElement yes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/label[1]"));
        //     yes.click();
        //     Thread.sleep(500);

        //     WebElement impresive = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/label[1]"));
        //     impresive.click();
        //     Thread.sleep(500);

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


      //CASO DE PRUEVA 004
        // try {

            // driver.get("https://demoqa.com");
            // Thread.sleep(500);
            // WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            // menu.click();
            // Thread.sleep(500);
            
            // WebElement submenu = driver.findElement(By.id("item-3"));
            // submenu.click();
            // Thread.sleep(500);

            // WebElement addUser = driver.findElement(By.id("addNewRecordButton"));
            // addUser.click();
            // Thread.sleep(500);

            // WebElement firstNameAdd = driver.findElement(By.id("firstName"));
            // firstNameAdd.sendKeys("Nombre");
            // Thread.sleep(500);
            
            // WebElement lastNameAdd = driver.findElement(By.id("lastName"));
            // lastNameAdd.sendKeys("Apellido");
            // Thread.sleep(500);
            
            // WebElement emailAdd = driver.findElement(By.id("userEmail"));
            // emailAdd.sendKeys("emailErroneo");
            // Thread.sleep(500);

            // WebElement ageAdd = driver.findElement(By.id("age"));
            // ageAdd.sendKeys("asdf");
            // Thread.sleep(500);

            // WebElement salaryAdd = driver.findElement(By.id("salary"));
            // salaryAdd.sendKeys("aqwer");
            // Thread.sleep(500);

            // WebElement departmentAdd = driver.findElement(By.id("department"));
            // departmentAdd.sendKeys("poidf");
            // Thread.sleep(500);

            // WebElement submitAdd = driver.findElement(By.id("submit"));
            // submitAdd.click();
            // Thread.sleep(500);

            // emailAdd.clear();
            // emailAdd.sendKeys("Email@Correcto.com");
            // Thread.sleep(500);

            // submitAdd.click();
            // Thread.sleep(500);

            // ageAdd.clear();
            // ageAdd.sendKeys("23");
            // Thread.sleep(500);

            // salaryAdd.clear();
            // salaryAdd.sendKeys("1200");
            // Thread.sleep(500);

            // submitAdd.click();
            // Thread.sleep(500);

            // WebElement editButton = driver.findElement(By.id("edit-record-1"));
            // editButton.click();
            // Thread.sleep(500);

            
            // WebElement firstNameEdit = driver.findElement(By.id("firstName"));
            // firstNameEdit.clear();
            // Thread.sleep(500);

            // WebElement lastNameEdit = driver.findElement(By.id("lastName"));
            // lastNameEdit.clear();
            // Thread.sleep(500);

            // WebElement emailEdit = driver.findElement(By.id("userEmail"));
            // emailEdit.clear();
            // Thread.sleep(500);

            // WebElement ageEdit = driver.findElement(By.id("age"));
            // ageEdit.clear();
            // Thread.sleep(500);

            // WebElement salaryEdit = driver.findElement(By.id("salary"));
            // salaryEdit.clear();
            // Thread.sleep(500);

            // WebElement departmentEdit = driver.findElement(By.id("department"));
            // departmentEdit.clear();
            // Thread.sleep(500);

            // WebElement submidEdit = driver.findElement(By.id("submit"));
            // submidEdit.click();
            // Thread.sleep(1000);

            // WebElement exitEdit = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/button[1]"));
            // exitEdit.click();
            // Thread.sleep(500);

            // editButton = driver.findElement(By.id("edit-record-1"));
            // editButton.click();
            // Thread.sleep(500);

            // emailEdit = driver.findElement(By.id("userEmail"));
            // emailEdit.clear();
            // emailEdit.sendKeys("CorreoIncorrecto");
            // Thread.sleep(500);

            // ageEdit = driver.findElement(By.id("age"));
            // ageEdit.clear();
            // ageEdit.sendKeys("de");
            // Thread.sleep(500);

            // salaryEdit = driver.findElement(By.id("salary"));
            // salaryEdit.clear();
            // salaryEdit.sendKeys("hui");
            // Thread.sleep(500);

            // submidEdit = driver.findElement(By.id("submit"));
            // submidEdit.click();
            // Thread.sleep(1000);

            // emailEdit.clear();
            // emailEdit.sendKeys("Correo@correcto.com");
            // Thread.sleep(500);

            // ageEdit.clear();
            // ageEdit.sendKeys("23");
            // Thread.sleep(500);

            // salaryEdit.clear();
            // salaryEdit.sendKeys("1500");
            // Thread.sleep(500);

            // submidEdit.click();
            // Thread.sleep(500);

            // WebElement deleteButton = driver.findElement(By.id("delete-record-1"));
            // deleteButton.click();
            // Thread.sleep(500);

            // WebElement firstNameorder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
            // WebElement firstNameorder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
            // firstNameorder.click();
            // Thread.sleep(500);
            // firstNameorder2.click();
            // Thread.sleep(500);

            // WebElement lastNameOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]"));
            // WebElement lastNameOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]"));
            // lastNameOrder.click();
            // Thread.sleep(500);
            // lastNameOrder2.click();
            // Thread.sleep(500); 

            // WebElement ageOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]"));
            // WebElement ageOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]"));
            // ageOrder.click();
            // Thread.sleep(500);
            // ageOrder2.click();
            // Thread.sleep(500); 

            // WebElement emailOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]"));
            // WebElement emailOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]"));
            // emailOrder.click();
            // Thread.sleep(500);
            // emailOrder2.click();
            // Thread.sleep(500); 

            // WebElement salaryOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]"));
            // WebElement salaryOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]"));
            // salaryOrder.click();
            // Thread.sleep(500);
            // salaryOrder2.click();
            // Thread.sleep(500); 

            // WebElement departmentOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[6]/div[1]"));
            // WebElement departmentOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[6]/div[1]"));
            // departmentOrder.click();
            // Thread.sleep(500);
            // departmentOrder2.click();
            // Thread.sleep(500); 

            // WebElement actionOrder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[7]/div[1]"));
            // WebElement actionOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[7]/div[1]"));
            // actionOrder.click();
            // Thread.sleep(500);
            // actionOrder2.click();
            // Thread.sleep(500); 

            // for(int i=0; i<6; i++){
            //     WebElement addUser = driver.findElement(By.id("addNewRecordButton"));
            //     addUser.click();
    
            //     WebElement firstNameAdd = driver.findElement(By.id("firstName"));
            //     firstNameAdd.sendKeys("Nombre");
                
            //     WebElement lastNameAdd = driver.findElement(By.id("lastName"));
            //     lastNameAdd.sendKeys("Apellido");
                
            //     WebElement emailAdd = driver.findElement(By.id("userEmail"));
            //     emailAdd.sendKeys("emailErroneo");
    
            //     WebElement ageAdd = driver.findElement(By.id("age"));
            //     ageAdd.sendKeys("asdf");
    
            //     WebElement salaryAdd = driver.findElement(By.id("salary"));
            //     salaryAdd.sendKeys("aqwer");
    
            //     WebElement departmentAdd = driver.findElement(By.id("department"));
            //     departmentAdd.sendKeys("poidf");
    
            //     WebElement submitAdd = driver.findElement(By.id("submit"));
            //     submitAdd.click();
    
            //     emailAdd.clear();
            //     emailAdd.sendKeys("Email@Correcto.com");
    
            //     submitAdd.click();
    
            //     ageAdd.clear();
            //     ageAdd.sendKeys("23");
    
            //     salaryAdd.clear();
            //     salaryAdd.sendKeys("1200");
    
            //     submitAdd.click();
            // }

            // Thread.sleep(2000);

            // WebElement rows = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
            // Select rowsSelect = new Select(rows);
            // rowsSelect.selectByVisibleText("5 rows");
            // Thread.sleep(2000);

            // WebElement next = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[3]/button[1]"));
            // next.click();
            // Thread.sleep(2000);

            // WebElement previous = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/button[1]"));
            // previous.click();
            // Thread.sleep(2000);

            // WebElement section = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[1]/div[1]/input[1]"));
            // section.clear();
            // section.sendKeys("2");
            // section.sendKeys(Keys.ENTER);
            // Thread.sleep(2000);

            // WebElement searchBox = driver.findElement(By.id("searchBox"));
            // searchBox.sendKeys("Kierra");
            // Thread.sleep(2000);
            // searchBox.clear();
            // Thread.sleep(2000);

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


              //CASO DE PRUEVA 005
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

        //     WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        //     act.doubleClick(doubleClick).perform();
        //     Thread.sleep(2000);

        //     WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        //     act.contextClick(rightClick).perform();
        //     Thread.sleep(2000);

        //     WebElement click = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]"));
        //     click.click();
        //     Thread.sleep(2000);

            

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


              //CASO DE PRUEVA 006

        // try{

        //         driver.get("https://demoqa.com");
        //         Thread.sleep(500);
        //         WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //         menu.click();
        //         Thread.sleep(500);
                
        //         WebElement submenu = driver.findElement(By.id("item-7"));
        //         submenu.click();
        //         Thread.sleep(3000);

        //         // WebElement download = driver.findElement(By.id("downloadButton"));
        //         // download.click();

        //         WebElement uploadFile = driver.findElement(By.id("uploadFile"));
        //         uploadFile.sendKeys("C:\\Users\\ramon.fernandez-roig\\Downloads\\sampleFile.jpeg");
        //         Thread.sleep(5000);

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


              //CASO DE PRUEVA 007
        // try {

        //         driver.get("https://demoqa.com");
        //         Thread.sleep(500);
        //         WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //         menu.click();
        //         Thread.sleep(500);
                
        //         WebElement submenu = driver.findElement(By.id("item-8"));
        //         submenu.click();
        //         Thread.sleep(500);

        //         WebElement extractColor = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]"));
        //         System.out.println(extractColor.getCssValue("color"));
        //         Thread.sleep(5000);
        //         System.out.println(extractColor.getCssValue("color"));

        //         WebElement randomId = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]"));
        //         System.out.println(randomId.getAttribute("id"));

        //         WebElement enableAfter = driver.findElement(By.id("enableAfter"));
        //         enableAfter.click();
        //         Thread.sleep(2000);

        //         WebElement visibleAfter = driver.findElement(By.id("visibleAfter"));
        //         visibleAfter.click();
        //         Thread.sleep(2000);

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }


      //CASO DE PRUEVA 008
        // try{
        //         driver.get("https://demoqa.com");
        //         Thread.sleep(500);
        //         WebElement menu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/*[name()='svg'][1]"));
        //         menu.click();
        //         Thread.sleep(2000);
                
        //         WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]"));
        //         submenu.click();
        //         Thread.sleep(500);

        //         // //Hacemos click al boton de submit

        //         WebElement submitForm = driver.findElement(By.id("submit"));
        //         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitForm);
        //         Thread.sleep(500); 
        //         submitForm.click();
        //         Thread.sleep(2000);

        //         //Rellenamos el campo firstName

        //         WebElement firstNameForm = driver.findElement(By.id("firstName"));
        //         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstNameForm);
        //         Thread.sleep(500); 
        //         firstNameForm.sendKeys("PruevaName");
        //         Thread.sleep(500);
                
        //         //Rellenamos el campo Last Name

        //         WebElement lastNameForm = driver.findElement(By.id("lastName"));
        //         lastNameForm.sendKeys("PruevaLastName");
        //         Thread.sleep(500);

        //         //Rellenamos el campo Email

        //         WebElement emailForm = driver.findElement(By.id("userEmail"));
        //         emailForm.sendKeys("PruevaEmail");
        //         Thread.sleep(1500);

        //         //Hacer click en el boton de submit

        //         submitForm.click();

        //         //Rellenamos el campo Email carrectamente

        //         emailForm.clear();
        //         emailForm.sendKeys("Prueva@Email.com");
        //         Thread.sleep(500);

        //         //Hacer click en el radio button de Male

        //         WebElement maleRadioButtonForm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        //         maleRadioButtonForm.click();
        //         Thread.sleep(500);

        //         //Rellenamos el campo Mobile con 10 letras

        //         WebElement mobileForm = driver.findElement(By.id("userNumber"));
        //         mobileForm.sendKeys("gshdretsgd");
        //         Thread.sleep(1000);

        //         //Rellenamos el campo mobile con 5 numeros

        //         mobileForm.clear();
        //         mobileForm.sendKeys("12345");
        //         Thread.sleep(1000);

        //         //Hacemos click al boton de submit

        //         submitForm.click();
        //         Thread.sleep(1000);

        //         //Rellenamos el campo Mobile con 10 numeros

        //         mobileForm.clear();
        //         mobileForm.sendKeys("1234567890");
        //         Thread.sleep(1000);

        //         //Hacer click en date of birth

        //         WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        //         dateOfBirth.click();
        //         Thread.sleep(1000);

        //         //Hacer click en los meses Y seleccionar Enero

        //         WebElement monthForm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
        //         Select monthSelect = new Select(monthForm);
        //         monthSelect.selectByVisibleText("January");
        //         Thread.sleep(1000);

        //         //Hacer click en los años Y seleccionar 2004

        //         WebElement yearForm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
        //         Select yearSelect = new Select(yearForm);
        //         yearSelect.selectByVisibleText("2004");
        //         Thread.sleep(1000);    
                
                
        //         //Hacer click en 16

        //         WebElement dayForm = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[6]"));
        //         dayForm.click();
        //         Thread.sleep(1000);  

        //         //Rellenar el campo Subjects

        //         WebElement subjectsForm = driver.findElement(By.id("subjectsInput"));
        //         subjectsForm.sendKeys("English");
        //         subjectsForm.sendKeys(Keys.ENTER);
        //         Thread.sleep(1000);

        //         //Rellenar el campo subjects

        //         subjectsForm.sendKeys("Math");
        //         subjectsForm.sendKeys(Keys.ENTER);
        //         Thread.sleep(1000);

        //         //Hacer click en Sports, Reading y Music

        //         WebElement sports = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]/label[1]"));
        //         WebElement reading = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]/label[1]"));
        //         WebElement music = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]"));

        //         sports.click();
        //         Thread.sleep(1000);
        //         reading.click();
        //         Thread.sleep(1000);
        //         music.click();
        //         Thread.sleep(1000);

        //         //Subir un archivo

        //         WebElement uploadFile = driver.findElement(By.id("uploadPicture"));
        //         uploadFile.sendKeys("C:\\Users\\ramon.fernandez-roig\\Downloads\\sampleFile.jpeg");
        //         Thread.sleep(1000);

        //         //Rellenar el campo current address

        //         WebElement currentAddressForm = driver.findElement(By.id("currentAddress"));
        //         currentAddressForm.sendKeys("Carrer Hola");
        //         Thread.sleep(1000);

        //         //Seleccionar un estado y ciudad

        //         WebElement stateForm = driver.findElement(By.id("react-select-3-input"));
        //         stateForm.sendKeys("NCR");
        //         stateForm.sendKeys(Keys.ENTER);
        //         Thread.sleep(1000);

        //         WebElement cityForm = driver.findElement(By.id("react-select-4-input"));
        //         cityForm.sendKeys("Delhi");
        //         cityForm.sendKeys(Keys.ENTER);
        //         Thread.sleep(1000);

        //         //hacer click al boton de submit

        //         submitForm.click();

        //         Thread.sleep(2000);

        //         //Obtener los resultados

        //         System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div")).getText());

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        //CASO DE PRUEVA 009
        // try {

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(500);
        //     WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
        //     menu.click();
        //     Thread.sleep(2000);       
        //     WebElement submenu = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]"));
        //     submenu.click();
        //     Thread.sleep(500);

        //     //Hacemos click al boton de New Tab

        //     driver.findElement(By.id("tabButton")).click();

        //     //Guardamos en un array las pestañas disponibles y nos cambiamos a la pestaña nueva

        //     ArrayList<String> pestañas = new ArrayList<>(driver.getWindowHandles());
        //     driver.switchTo().window(pestañas.get(1));
        //     Thread.sleep(2000);

        //     //Cerramos la pestaña

        //     driver.close();
        //     Thread.sleep(2000);

        //     //Cambiamos a la pestaña original y hacemos clic al boton de New Window

        //     driver.switchTo().window(pestañas.get(0));
        //     driver.findElement(By.id("windowButton")).click();
        //     Thread.sleep(2000);

        //     //Guardamos en un array las ventanas disponibles y nos cambiamos a la ventana nueva

        //     ArrayList<String> ventanas = new ArrayList<>(driver.getWindowHandles());
        //     driver.switchTo().window(ventanas.get(1));
        //     Thread.sleep(2000);

        //     //Cerramos la ventana

        //     driver.close();
        //     Thread.sleep(2000);

        //     //Cambiamos a la ventana original y hacemos clic al boton de New Window Message

        //     driver.switchTo().window(ventanas.get(0));
        //     driver.findElement(By.id("messageWindowButton")).click();
        //     Thread.sleep(2000);

        //     //Guardamos en un array las ventanas disponibles y nos cambiamos a la ventana nueva

        //     ventanas = new ArrayList<>(driver.getWindowHandles());
        //     driver.switchTo().window(ventanas.get(1));
        //     Thread.sleep(2000);

        //     //Cerramos la ventana

        //     driver.close();
        //     Thread.sleep(2000);

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        //CASO DE PRUEVA 010

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

        //     //Cambiamos al alert que saldrá y escrivimos la prueva y aceptamos

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
    }
}