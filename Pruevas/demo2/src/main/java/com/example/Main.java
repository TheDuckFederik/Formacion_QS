package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        // try{

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(2000);
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(2000);
        //     WebElement submenu = driver.findElement(By.id("item-0"));
        //     submenu.click();
        //     Thread.sleep(2000);
        //     WebElement userName = driver.findElement(By.id("userName"));
        //     userName.sendKeys("Holaquetal");
        //     Thread.sleep(2000);
        //     WebElement email = driver.findElement(By.id("userEmail"));
        //     email.sendKeys("EmailMalo");
        //     Thread.sleep(2000);

        //     WebElement submit = driver.findElement(By.id("submit"));

        //     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        //     Thread.sleep(500); 
            
        //     submit.click();

        //     Thread.sleep(2000);

        //     email.clear();

        //     email.sendKeys("Email@Bueno.com");

        //     Thread.sleep(2000);

        //     WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        //     currentAddress.sendKeys("HolaQueTal");

        //     Thread.sleep(2000);

        //     WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        //     permanentAddress.sendKeys("HolaQueTal");

        //     Thread.sleep(2000);

        //     submit.click();

        //     WebElement data = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[1]"));

        //     String dataText = data.getText();

        //     System.out.println(dataText);
            
            
        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

        // try{

        //     driver.get("https://demoqa.com");
        //     Thread.sleep(2000);
        //     WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        //     menu.click();
        //     Thread.sleep(2000);
            
        //     WebElement submenu = driver.findElement(By.id("item-1"));
        //     submenu.click();
        //     Thread.sleep(2000);
            
        //     WebElement homeDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));           
        //     homeDes.click();            
        //     Thread.sleep(2000);

             
        //     WebElement desktopDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));       
        //     desktopDes.click();
        //     Thread.sleep(2000);
             
        //     WebElement documentsDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]/*[name()='svg'][1]"));
        //     documentsDes.click();
        //     Thread.sleep(2000); 


        //     WebElement downloadsDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]/*[name()='svg'][1]"));
        //     downloadsDes.click();
        //     Thread.sleep(2000);

        //     WebElement notesBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     notesBox.click();
        //     Thread.sleep(2000);

        //     WebElement commandsBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     commandsBox.click();
        //     Thread.sleep(2000);

        //     WebElement desktopBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     desktopBox.click();   
        //     Thread.sleep(2000);

        //     WebElement workSpaceDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));
        //     workSpaceDes.click();
        //     Thread.sleep(2000);

        //     WebElement officeDes = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/button[1]/*[name()='svg'][1]"));
        //     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", officeDes);
        //     Thread.sleep(500); 

        //     officeDes.click();
        //     Thread.sleep(2000);

        //     WebElement reactBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     reactBox.click();
        //     Thread.sleep(2000);

        //     WebElement angularBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     angularBox.click();
        //     Thread.sleep(2000);

        //     WebElement veuBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     veuBox.click();
        //     Thread.sleep(2000);

        //     WebElement workSpaceBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     workSpaceBox.click();
        //     Thread.sleep(2000);

        //     WebElement publicBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     publicBox.click();
        //     Thread.sleep(2000);

        //     WebElement privateBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     privateBox.click();
        //     Thread.sleep(2000);

        //     WebElement classifiedBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     classifiedBox.click();
        //     Thread.sleep(2000);

        //     WebElement generalBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[4]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     generalBox.click();
        //     Thread.sleep(2000);

        //     WebElement officeBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     officeBox.click();
        //     Thread.sleep(2000);

        //     WebElement wordBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     wordBox.click();
        //     Thread.sleep(2000);

        //     WebElement excelBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     excelBox.click();
        //     Thread.sleep(2000);

        //     WebElement downloadBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     downloadBox.click();
        //     Thread.sleep(2000);

        //     WebElement homeBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        //     homeBox.click();
        //     Thread.sleep(2000); 

        //     WebElement colapseAll = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
        //     colapseAll.click();
        //     Thread.sleep(2000);

        //     WebElement expandAll = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"));
        //     expandAll.click();
        //     Thread.sleep(2000);
            

        // } catch(Exception e){
        //     e.printStackTrace();
        // } finally{
        //     driver.quit();
        // }

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

        try {

            driver.get("https://demoqa.com");
            Thread.sleep(500);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(500);
            
            WebElement submenu = driver.findElement(By.id("item-3"));
            submenu.click();
            Thread.sleep(500);

            WebElement addUser = driver.findElement(By.id("addNewRecordButton"));
            addUser.click();
            Thread.sleep(500);

            WebElement firstNameAdd = driver.findElement(By.id("firstName"));
            firstNameAdd.sendKeys("Nombre");
            Thread.sleep(500);
            
            WebElement lastNameAdd = driver.findElement(By.id("lastName"));
            lastNameAdd.sendKeys("Apellido");
            Thread.sleep(500);
            
            WebElement emailAdd = driver.findElement(By.id("userEmail"));
            emailAdd.sendKeys("emailErroneo");
            Thread.sleep(500);

            WebElement ageAdd = driver.findElement(By.id("age"));
            ageAdd.sendKeys("asdf");
            Thread.sleep(500);

            WebElement salaryAdd = driver.findElement(By.id("salary"));
            salaryAdd.sendKeys("aqwer");
            Thread.sleep(500);

            WebElement departmentAdd = driver.findElement(By.id("department"));
            departmentAdd.sendKeys("poidf");
            Thread.sleep(500);

            WebElement submitAdd = driver.findElement(By.id("submit"));
            submitAdd.click();
            Thread.sleep(500);

            emailAdd.clear();
            emailAdd.sendKeys("Email@Correcto.com");
            Thread.sleep(500);

            submitAdd.click();
            Thread.sleep(500);

            ageAdd.clear();
            ageAdd.sendKeys("23");
            Thread.sleep(500);

            salaryAdd.clear();
            salaryAdd.sendKeys("1200");
            Thread.sleep(500);

            submitAdd.click();
            Thread.sleep(500);

            WebElement firstNameorder = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
            WebElement firstNameorder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
            firstNameorder.click();
            Thread.sleep(2000);
            firstNameorder2.click();
            Thread.sleep(2000); 

            WebElement editButton = driver.findElement(By.id("edit-record-1"));

            editButton.click();
            Thread.sleep(500);

            WebElement 
            submitAdd.click();
            Thread.sleep(2000);


        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}