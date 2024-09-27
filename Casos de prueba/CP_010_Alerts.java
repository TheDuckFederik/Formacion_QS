package web;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_010_Alerts extends Main {

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Alerts")
    @Story("Form")
    @Description("Probar Alerts")
    public void CP_010_Alerts() throws InterruptedException, IOException {

        
        testId = "CP 010 - Alerts";
        driver.get("https://demoqa.com");

        try{

        // Acceder a la web https://demoqa.com
            WebElement mainAFWButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]"));
            mainAFWButton.click();
        
        // Hacer click en el boton "Elements" en la pagina  
            WebElement afwAlertsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
            afwAlertsButton.click();

        

            WebElement alertNormalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]"));
            alertNormalButton.click();

            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();


            WebElement alertDelayedButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]"));
            alertDelayedButton.click();

            Thread.sleep(5000);

            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();
            


            WebElement alertConfirmButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/button[1]"));
            alertConfirmButton.click();
            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();

            WebElement alertConfirmText = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/span[2]"));
            System.out.println(alertConfirmText.getText());

            alertConfirmButton.click();
            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().dismiss();;
            System.out.println(alertConfirmText.getText());


            WebElement alertPromptButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/button[1]"));
            alertPromptButton.click();

            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();

            alertPromptButton.click();
            driver.switchTo().alert().sendKeys("Test");
            driver.switchTo().alert().accept();
            WebElement alertPromptText = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/span[2]"));
            System.out.println(alertPromptText.getText());


            Thread.sleep(5000);

       
    } catch(Exception e) {System.out.println(e);}


    }

}
