package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;


public class Prueba extends Main {

    
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void TC001_Elements1() throws InterruptedException, IOException {
        testId = "TC001_Elements1";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        
        try{

            driver.get("https://demoqa.com");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
            menu.click();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.id("item-0"));
            submenu.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.id("userName"));
            userName.sendKeys("Holaquetal");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailMalo");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);

            email.clear();

            email.sendKeys("Email@Bueno.com");

            
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    
    }
