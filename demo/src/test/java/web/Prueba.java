package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
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
    @Description("Rellenar Web Tables")
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

            //Muy difícil, ya lo haré

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
             






            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}