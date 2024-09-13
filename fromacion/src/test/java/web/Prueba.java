package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        //
        WebDriver driver = new ChromeDriver(chromeOptions);
        //
        try{
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(2000);
            WebElement sub_menu = driver.findElement(By.id("item-0"));
            sub_menu.click();
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            Thread.sleep(2000);
            WebElement full_name = driver.findElement(By.id("userName"));
            full_name.sendKeys("FullNameTest");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailTest");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);
            email.clear();
            Thread.sleep(2000);
            email.sendKeys("EmailTest@");
            Thread.sleep(2000);
            submit.click();
            Thread.sleep(2000);
            email.clear();
            Thread.sleep(2000);
            email.sendKeys("EmailTest@Test");
            Thread.sleep(2000);
            submit.click();
            Thread.sleep(2000);
            email.clear();
            Thread.sleep(2000);
            email.sendKeys("EmailTest@Test.com");
            Thread.sleep(2000);
            //This part crashes for no aparent reason, the code seems fine.
            WebElement current_adress = driver.findElement(By.id("currentAddress"));
            current_adress.sendKeys("CurrentAdressTest");
            Thread.sleep(2000);
            WebElement permanent_adress = driver.findElement(By.id("permanentAddress"));
            permanent_adress.sendKeys("PermanentAdressTest");
            Thread.sleep(2000);
            submit.click();
            Thread.sleep(2000);
            //

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }

    }

    
}
