package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import net.bytebuddy.asm.Advice.Enter;


public class Prueba extends Main {

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar Text Box")
    public void TC001_TextBox() throws InterruptedException, IOException {
        testId = "TC001_TextBox";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
            menu.click();
            Thread.sleep(500);

            WebElement textbox = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
            textbox.click();
            Thread.sleep(500);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  

            WebElement fullname = driver.findElement(By.xpath("//*[@id='userName']"));
            fullname.sendKeys("ejemplo");
            Thread.sleep(500);

            WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
            email.sendKeys("ejemplo");
            Thread.sleep(500);
            
            WebElement caddress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
            caddress.sendKeys("ejemplo");
            Thread.sleep(500);

            WebElement paddress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
            paddress.sendKeys("ejemplo");
            Thread.sleep(500);

            WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
            submit.click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id='userEmail']")).clear();

            WebElement email2 = driver.findElement(By.xpath("//*[@id='userEmail']"));
            email2.sendKeys("ejemplo@ejemplo.com");
            Thread.sleep(500);

            WebElement submit2 = driver.findElement(By.xpath("//*[@id='submit']"));
            submit2.click();
            Thread.sleep(500);
            
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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
            menu.click();
            Thread.sleep(500);

            WebElement checkbox = driver.findElement(By.xpath("//*[@id=\'item-1\']"));
            checkbox.click();
            Thread.sleep(500);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  

            WebElement home = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]"));
            home.click();
            Thread.sleep(500);

            WebElement homed = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
            homed.click();
            Thread.sleep(500);

            WebElement desktopd = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
            desktopd.click();
            Thread.sleep(500);

            WebElement documentsd = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
            documentsd.click();
            Thread.sleep(500);

            WebElement downloadsd = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
            downloadsd.click();
            Thread.sleep(500);

            WebElement workspaced = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button"));
            workspaced.click();
            Thread.sleep(500);

            WebElement officed = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button"));
            officed.click();
            Thread.sleep(500);

            WebElement home2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]"));
            home2.click();
            Thread.sleep(500);

            WebElement desktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]"));
            desktop.click();
            Thread.sleep(500);

            WebElement documents = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]"));
            documents.click();
            Thread.sleep(500);

            WebElement downloads = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]"));
            downloads.click();
            Thread.sleep(500);

            WebElement desktop2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]"));
            desktop2.click();
            Thread.sleep(500);

            WebElement documents2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]"));
            documents2.click();
            Thread.sleep(500);

            WebElement downloads2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]"));
            downloads2.click();
            Thread.sleep(500);

            WebElement workspace = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]"));
            workspace.click();
            Thread.sleep(500);

            WebElement office = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]"));
            office.click();
            Thread.sleep(500);

            WebElement workspace2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]"));
            workspace2.click();
            Thread.sleep(500);

            WebElement office2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]"));
            office2.click();
            Thread.sleep(500);

            WebElement notes = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
            notes.click();
            Thread.sleep(500);

            WebElement react = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
            react.click();
            Thread.sleep(500);

            WebElement public1 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
            public1.click();
            Thread.sleep(500);

            WebElement wordfile = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
            wordfile.click();
            Thread.sleep(500);

            WebElement notes2 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
            notes2.click();
            Thread.sleep(500);

            WebElement react2 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
            react2.click();
            Thread.sleep(500);

            WebElement public2 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
            public2.click();
            Thread.sleep(500);

            WebElement wordfile2 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
            wordfile2.click();
            Thread.sleep(500);

            WebElement workspaced2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button"));
            workspaced2.click();
            Thread.sleep(500);

            WebElement officed2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button"));
            officed2.click();
            Thread.sleep(500);

            WebElement downloadsd2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
            downloadsd2.click();
            Thread.sleep(500);

            WebElement documentsd2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
            documentsd2.click();
            Thread.sleep(500);

            WebElement desktopd2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
            desktopd2.click();
            Thread.sleep(500);

            WebElement homed2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
            homed2.click();
            Thread.sleep(500);

            WebElement mas = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
            mas.click();
            Thread.sleep(500);

            WebElement menos = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
            menos.click();
            Thread.sleep(500);

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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
            menu.click();
            Thread.sleep(500);

            WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"item-2\"]"));
            radiobutton.click();
            Thread.sleep(500);

            WebElement yes = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));
            yes.click();
            Thread.sleep(500);

            WebElement impresive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label"));
            impresive.click();
            Thread.sleep(500);

            WebElement no = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[4]/label"));
            no.click();
            Thread.sleep(500);

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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
            menu.click();
            Thread.sleep(500);

            WebElement buttons = driver.findElement(By.xpath("//*[@id=\"item-3\"]"));
            buttons.click();
            Thread.sleep(500);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);"); 

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[5]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[5]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[6]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[6]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[7]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[7]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ejemplo@ejemplo.com");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"age\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("44");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"salary\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("4444");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(500);

            WebElement rows = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
            Select rowsSelect = new Select(rows);
            rowsSelect.selectByVisibleText("100 rows");
            Thread.sleep(500);

            JavascriptExecutor js2 = (JavascriptExecutor) driver;
            js2.executeScript("window.scrollBy(0, 1500);"); 

            WebElement rows2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
            Select rowsSelect2 = new Select(rows2);
            rowsSelect2.selectByVisibleText("50 rows");
            Thread.sleep(500);

            WebElement rows3 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
            Select rowsSelect3 = new Select(rows3);
            rowsSelect3.selectByVisibleText("25 rows");
            Thread.sleep(500);

            WebElement rows4 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
            Select rowsSelect4 = new Select(rows4);
            rowsSelect4.selectByVisibleText("20 rows");
            Thread.sleep(500);

            WebElement rows5 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
            Select rowsSelect5 = new Select(rows5);
            rowsSelect5.selectByVisibleText("10 rows");
            Thread.sleep(500);

            WebElement rows6 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
            Select rowsSelect6 = new Select(rows6);
            rowsSelect6.selectByVisibleText("5 rows");
            Thread.sleep(500);

                for(int i = 1; i < 3; i++) {
                
                driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
                Thread.sleep(500);
        
                driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
                Thread.sleep(500);

                driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ejemplo");
                Thread.sleep(500);

                driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("ejemplo");
                Thread.sleep(500);

                driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ejemplo@ejemplo.com");
                Thread.sleep(500);

                driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("44");
                Thread.sleep(500);

                driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("4444");
                Thread.sleep(500);

                driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("ejemplo");
                Thread.sleep(500);
        
                driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
                Thread.sleep(500);
            }

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/button")).click();
        Thread.sleep(500);


        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/button")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"searchBox\"]")).sendKeys("ejemplo");
        Thread.sleep(500);

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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
            menu.click();
            Thread.sleep(500);

            WebElement buttons = driver.findElement(By.xpath("//*[@id=\"item-4\"]"));
            buttons.click();
            Thread.sleep(500);

            Actions action = new Actions(driver);

            WebElement doble1 = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
            action.moveToElement(doble1).doubleClick().perform();
            Thread.sleep(500);

            WebElement derecha = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
            action.moveToElement(derecha).contextClick().perform();
            Thread.sleep(500);

            driver.findElement(By.xpath("//button[text()='Click Me']")).click();
            Thread.sleep(500);

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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
            menu.click();
            Thread.sleep(500);

            WebElement uploadanddownload = driver.findElement(By.xpath("//*[@id=\"item-7\"]"));
            uploadanddownload.click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"downloadButton\"]")).click();
            Thread.sleep(5000);

            WebElement upload = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]"));
            upload.sendKeys("C:\\Users\\ricard.ferrando.ext\\Downloads\\sampleFile.jpeg");
            Thread.sleep(5000);

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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
            menu.click();
            Thread.sleep(500);

            WebElement uploadanddownload = driver.findElement(By.xpath("//*[@id=\"item-8\"]"));
            uploadanddownload.click();
            Thread.sleep(500);
             
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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div"));
            form.click();
            Thread.sleep(500);
            
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
            Thread.sleep(500);

            WebElement mes = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
            Select mesSelect = new Select(mes);
            mesSelect.selectByVisibleText("April");
            Thread.sleep(2000);

            WebElement año = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
            Select añoSelect = new Select(año);
            añoSelect.selectByVisibleText("2005");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]")).click();
            Thread.sleep(500);

            WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
            subject.sendKeys("Maths");
            subject.sendKeys(Keys.ENTER);
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]")).click();
            Thread.sleep(500);

            WebElement upload = driver.findElement(By.id("uploadPicture"));
            upload.sendKeys("C:\\Users\\ricard.ferrando.ext\\Downloads\\sampleFile.jpeg");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("ejemplo");
            Thread.sleep(500);

            WebElement state = driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"));
            state.sendKeys("NCR");
            state.sendKeys(Keys.ENTER);
            Thread.sleep(500);

            WebElement city = driver.findElement(By.xpath("//*[@id=\"react-select-4-input\"]"));
            city.sendKeys("Delhi");
            city.sendKeys(Keys.ENTER);
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).clear();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ejemplo@ejemplo.com");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).clear();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("4444444444");
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
            Thread.sleep(5000);

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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]"));
            form.click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]")).click();
            Thread.sleep(500);

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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
            form.click();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
            Thread.sleep(6000);
            driver.switchTo().alert().accept();

            driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
            Thread.sleep(500);
            driver.switchTo().alert().dismiss();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);

            driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
            Thread.sleep(500);
            driver.switchTo().alert().sendKeys("ejemplo");
            driver.switchTo().alert().accept();
            Thread.sleep(5000);

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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]"));
            form.click();
            Thread.sleep(500);

            // Extraer texto del primer iframe (iframe1)
            driver.switchTo().frame("frame1"); // Cambiar al iframe de arriba
            WebElement textoFrame1 = driver.findElement(By.id("sampleHeading")); // Localizar el elemento que contiene el texto
            String textoArriba = textoFrame1.getText();
            System.out.println("Texto del iframe de arriba: " + textoArriba);
        
            // Volver al contenido principal para cambiar de iframe
            driver.switchTo().defaultContent();

            // Extraer texto del segundo iframe (iframe2)
            driver.switchTo().frame("frame2"); // Cambiar al iframe de abajo
            WebElement textoFrame2 = driver.findElement(By.id("sampleHeading")); // Localizar el elemento que contiene el texto
            String textoAbajo = textoFrame2.getText();
            System.out.println("Texto del iframe de abajo: " + textoAbajo);

            // Volver al contenido principal
            driver.switchTo().defaultContent();
        
            // Comprobar si los textos son iguales
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

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]"));
            form.click();
            Thread.sleep(500);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(500);

            // Cambiar al Parent Frame (iframe padre)
            driver.switchTo().frame("frame1");
        
            // Extraer texto del Parent Frame
            WebElement textoParentFrame = driver.findElement(By.tagName("body"));
            String textoPadre = textoParentFrame.getText();
            System.out.println("Texto del Parent Frame: " + textoPadre);

            // Cambiar al Child Iframe
            driver.switchTo().frame(0);
        
            // Extraer texto del Child Iframe
            WebElement textoChildFrame = driver.findElement(By.tagName("p"));
            String textoHijo = textoChildFrame.getText();
            System.out.println("Texto del Child Iframe: " + textoHijo);

            // Volver al contenido principal
            driver.switchTo().defaultContent();

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Nested Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Extraer Nested Frames")
    public void TC013_Nested_Frames() throws InterruptedException, IOException {
        testId = "TC012_Nested_Frames";
         try{
            driver.get("https://demoqa.com");          

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
            menu.click();
            Thread.sleep(500);

            WebElement form = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]"));
            form.click();
            Thread.sleep(500);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");  
            Thread.sleep(500);

            // Cambiar al Parent Frame (iframe padre)
            driver.switchTo().frame("frame1");
        
            // Extraer texto del Parent Frame
            WebElement textoParentFrame = driver.findElement(By.tagName("body"));
            String textoPadre = textoParentFrame.getText();
            System.out.println("Texto del Parent Frame: " + textoPadre);

            // Cambiar al Child Iframe
            driver.switchTo().frame(0);
        
            // Extraer texto del Child Iframe
            WebElement textoChildFrame = driver.findElement(By.tagName("p"));
            String textoHijo = textoChildFrame.getText();
            System.out.println("Texto del Child Iframe: " + textoHijo);

            // Volver al contenido principal
            driver.switchTo().defaultContent();

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}