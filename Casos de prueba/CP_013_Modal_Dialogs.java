package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_013_Modal_Dialogs extends Main {

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Modal Dialogs")
    @Story("Modal Dialogs")
    @Description("Probar Modal Dialogs")
    public void CP_013_Modal_Dialogs() throws InterruptedException, IOException {

        
        testId = "CP 013 - Modal Dialogs";
        

        try{

        
        // 1	Acceder a la web https://demoqa.com
            driver.get("https://demoqa.com");

        // 2	Hacer click en el boton "Alert, Frame & Windows" en la pagina
            WebElement mainAFWButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]"));
            mainAFWButton.click();

        // 3	Hacer click en la opcion "Modal Dialogs" en el desplegable "Alert, Frame & Windows" localizado en la izquierda de la pagina
            WebElement modalNormalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]"));
            modalNormalButton.click();

        // 4	Hacer click en el boton "Small modal"
            WebElement smallModalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"));
            smallModalButton.click();

        // 5	Extraer el texto del dialogo
            WebElement smallModalText = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]"));
            System.out.println(smallModalText.getText());

        // 6	Hacer click en el boton "Close"
            WebElement smallModalCloseButton = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/button[1]"));
            smallModalCloseButton.click();

        // 7	Hacer click en el boton "Small modal" otra vez
            smallModalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"));
            smallModalButton.click();

        // 8	Hacer click en el boton "X"
            WebElement smallModalXButton = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/button[1]"));
            smallModalXButton.click();

        // 9	Hacer click en el boton "Large modal"
            WebElement largeModalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]"));
            largeModalButton.click();

        
        // 10	Extraer el texto del dialogo
            WebElement largeModalText = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/p"));
            System.out.println(largeModalText.getText());

        // 11	Hacer click en el boton "Close"
            WebElement largwModalCloseButton = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/button[1]"));
            largwModalCloseButton.click();

        // 12	Hacer click en el boton "Large modal" otra vez
            largeModalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]"));
            largeModalButton.click();

        // 13	Hacer click en el boton "X"
            WebElement largeModalXButton = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/button[1]"));
            largeModalXButton.click();

       
    } catch(Exception e) {System.out.println(e);}


    }

}
