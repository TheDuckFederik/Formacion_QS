package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Prueba extends Main {

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void TC001_TextBox() throws InterruptedException, IOException {
        testId = "TC001_TextBox";
         try{
            driver.get("https://demoqa.com");

            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
            menu.click();
            Thread.sleep(1000);

            WebElement textbox = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
            textbox.click();
            Thread.sleep(1000);

            WebElement fullname = driver.findElement(By.xpath("//*[@id='userName']"));
            fullname.sendKeys("ejemplo");
            Thread.sleep(1000);

            WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
            email.sendKeys("ejemplo");
            Thread.sleep(1000);
            
            WebElement caddress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
            caddress.sendKeys("ejemplo");
            Thread.sleep(1000);

            WebElement paddress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
            paddress.sendKeys("ejemplo");
            Thread.sleep(1000);

            WebElement submit = driver.findElement(By.xpath("//*[@id='submit']"));
            submit.click();
            Thread.sleep(1000);

            WebElement email2 = driver.findElement(By.xpath("//*[@id='userEmail']"));
            email.sendKeys("ejemplo@ejemplo.com");
            Thread.sleep(1000);

            WebElement submit2 = driver.findElement(By.xpath("//*[@id='submit']"));
            submit.click();
            Thread.sleep(1000);
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }



    }


}
