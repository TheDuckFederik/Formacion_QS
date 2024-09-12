package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","seleniumprincipio\\src\\main\\resources\\chromedriver.exe");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        try{

            driver.get("https://www.wikipedia.es");
            Thread.sleep(2000);
            WebElement menu = driver.findElement(By.id("vector-main-menu-dropdown-checkbox"));
            menu.click();
            Thread.sleep(2000);
            WebElement pagAleatoria =  driver.findElement(By.id("n-randompage"));
           pagAleatoria.click();
            Thread.sleep(5000);
            String titulo = driver.getCurrentUrl();

            System.out.println(titulo);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}