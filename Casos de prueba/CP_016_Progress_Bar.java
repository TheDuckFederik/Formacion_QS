package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_016_Progress_Bar extends Main {

    @Test(description = "Prueba DemoQA Widgets Progress Bar")
    @Story("Progress Bar")
    @Description("Probar Progress Bar")
    public void CP_016_Progress_Bar() throws InterruptedException, IOException {

        
        testId = "CP 016 - Progress Bar";
        

        try{

        
        // 1	Acceder a la web https://demoqa.com
            driver.get("https://demoqa.com");

        // 2	Hacer click en el boton "Widgets" en la pagina
            WebElement mainWidgetsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]"));
            mainWidgetsButton.click();

        // 3	Hacer click en la opcion "Progress Bar" en el desplegable "Alert, Frame & Windows" localizado en la izquierda de la pagina
            WebElement progressNormalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]"));
            progressNormalButton.click();
    
        // 4	Hacer click en el boton "Start"	La barra de progreso se inicia y su valor empieza a aumentar
            WebElement startButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
            startButton.click();
            WebElement progressBar = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div"));


        // 5	Cuando el valor de la barra llegue a 50, hacer click en el boton "Stop"	La barra de progreso se pausa
            while (Integer.valueOf(progressBar.getAttribute("aria-valuenow")) <= 49) {if(Integer.valueOf(progressBar.getAttribute("aria-valuenow")) == 50) {
                System.out.println(progressBar.getAttribute("aria-valuenow"));
                startButton.click();
            }
        }


        // 6	Hacer click en "Start"	La barra de progreso continua
            startButton.click();

        // 7	Cuando el valor de la barra llegue a 100, hacer click en el boton "Reset". La barra de progreso se pone a 0 de nuevo
            while (Integer.valueOf(progressBar.getAttribute("aria-valuenow")) > 50 && Integer.valueOf(progressBar.getAttribute("aria-valuenow")) <= 100) {
                if(Integer.valueOf(progressBar.getAttribute("aria-valuenow")) == 100) {
                    startButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/button"));
                    System.out.println(progressBar.getAttribute("aria-valuenow"));
                    startButton.click();
                    
                
                }
            }

        // 8	Volver a hacer click en "Start" para asegurar que la barra sigue funcionando correctamente	La barra de progreso se inicia y su valor empieza a aumentar de nuevo
            startButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
            startButton.click();

    } catch(Exception e) {System.out.println(e);}


    }

}
