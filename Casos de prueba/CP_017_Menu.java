package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_017_Menu extends Main {

    @Test(description = "Prueba DemoQA Widgets Menu")
    @Story("Menu")
    @Description("Probar Menu")
    public void CP_017_Menu() throws InterruptedException, IOException {

        
        testId = "CP 017 - Menu";
        

        try{

        
        // 1	Acceder a la web https://demoqa.com
            driver.get("https://demoqa.com");

        // 2	Hacer click en el boton "Widgets" en la pagina
            WebElement mainWidgetsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]"));
            mainWidgetsButton.click();

        // 3	Hacer click en la opcion "Menu" en el desplegable "Alert, Frame & Windows" localizado en la izquierda de la pagina
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)", ""); 
            WebElement menuNormalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]"));
            menuNormalButton.click();
    
        // 4	Posicionarse sobre el boton "Main Item 1" y hacer click
            WebElement item1Button = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]"));
            item1Button.click();
        // 5	Posicionarse sobre el boton "Main Item 2" y hacer click
            WebElement item2Button = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]"));
            item2Button.click();

        // 6	Posicionarse sobre el boton "SUB SUB List >" y hacer click
            WebElement sublistButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]"));
            sublistButton.click();

        // 7	Posicionarse sobre el boton "Sub sub item 1 " y hacer click
            WebElement subitem1Button = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]"));
            subitem1Button.click();

        // 8	Posicionarse sobre el boton "Main Item 3" y hacer click
            WebElement item3Button = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]"));
            item3Button.click();

    } catch(Exception e) {System.out.println(e);}


    }

}
