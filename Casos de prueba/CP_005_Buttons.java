package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_005_Buttons extends Main {

    @Test(description = "Prueba DemoQA Elements Buttons")
    @Story("Elements")
    @Description("Probar buttons")
    public void CP_005_Buttons() throws InterruptedException, IOException {

        
        testId = "CP 005 - Buttons";
        

        try{

    // 1	Acceder a la web https://demoqa.com
        driver.get("https://demoqa.com");
        
    // 2	Hacer click en el boton "Elements" en la pagina
        WebElement mainElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        mainElementsButton.click();

    // 3	Hacer click en la opcion "Buttons" en el desplegable "Elements" localizado en la izquierda de la pagina
        WebElement elemButtonsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]"));
        elemButtonsButton.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", ""); 

    // 4	Hacer un click izquierdo en el primer boton con el texto "Double Click Me"
        WebElement doubleClickButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"));
        doubleClickButton.click();
        Actions action = new Actions(driver);
    
    // 5	Hacer click derecho en el boton anterior
        action.moveToElement(doubleClickButton).contextClick().perform();

    // 6	Hacer doble click izquierdo en el mismo boton
        action.moveToElement(doubleClickButton).doubleClick().perform();

    // 7	Hacer click izquierdo en el segundo boton con el texto "Right Click Me"
        WebElement rightClickButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]"));
        rightClickButton.click();

    // 8	Hacer click derecho en el boton anterior
        action.moveToElement(rightClickButton).contextClick().perform();

    // 9	Hacer click derecho en el tercer boton con el texto "Click Me"
        WebElement leftClickButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]"));
        action.moveToElement(leftClickButton).contextClick().perform();

    // 10	Hacer click izquierdo en el boton anterior
        leftClickButton.click();

       
    } catch(Exception e) {System.out.println(e);}


    }

}
