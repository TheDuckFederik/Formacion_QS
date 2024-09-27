package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_011_Frames extends Main {

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Alerts")
    @Story("Form")
    @Description("Probar Alerts")
    public void CP_011_Frames() throws InterruptedException, IOException {

        
        testId = "CP 011 - Frames";
        driver.get("https://demoqa.com");

        try{

        
        // 1	Acceder a la web https://demoqa.com
            WebElement mainAFWButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]"));
            mainAFWButton.click();

        // 2	Hacer click en el boton "Alert, Frame & Windows" en la pagina
            WebElement afwAlertsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
            afwAlertsButton.click();

        // 3	Hacer click en la opcion "Frames" en el desplegable "Alert, Frame & Windows" localizado en la izquierda de la pagina
            WebElement framesNormalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]"));
            framesNormalButton.click();

        // 4	Acceder al html del primer iframe
            driver.switchTo().frame(driver.findElement(By.id("frame1")));

        // 5	Extraer el texto del iframe
            WebElement iframe1Text = driver.findElement(By.xpath("/html[1]/body[1]/h1[1]"));
            System.out.println(iframe1Text.getText());

        // 6	Acceder al html del segundo iframe
            driver.switchTo().defaultContent();
            driver.switchTo().frame(driver.findElement(By.id("frame2")));

        // 7	Extraer el texto del iframe
            WebElement iframe2Text = driver.findElement(By.xpath("/html[1]/body[1]/h1[1]"));
            System.out.println(iframe2Text.getText());
            
            
            Thread.sleep(5000);

       
    } catch(Exception e) {System.out.println(e);}


    }

}
