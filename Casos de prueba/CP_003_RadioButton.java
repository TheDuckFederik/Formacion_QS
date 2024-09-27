package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_003_RadioButton extends Main {

    @Test(description = "Prueba DemoQA Elements Radio Button")
    @Story("Elements")
    @Description("Probar Radio Button")
    public void CP_003_RadioButton() throws InterruptedException, IOException {
        testId = "CP 003 - Radio Button";


        try{

    // 1	Acceder a la web https://demoqa.com    
        driver.get("https://demoqa.com");

    // 2	Hacer click en el boton "Elements" en la pagina
        WebElement mainElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        mainElementsButton.click();

    // 3	Hacer click en la opcion "Radio Button" en el desplegable "Elements" localizado en la izquierda de la pagina
        WebElement elemRadioBButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
        elemRadioBButton.click();
        
    // 4	Hacer click en el boton "Yes"
        WebElement yesButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/label[1]"));
        yesButton.click();

    // 5	Hacer click en el boton "Impressive"
        WebElement impressiveButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/label[1]"));
        impressiveButton.click();

    // 6	Hacer click en el boton "No"
        WebElement noButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/label[1]"));
        noButton.click();

    // 7	Hacer click otra vez en el boton "Yes"
        yesButton.click();

         } catch(Exception e) {System.out.println(e);}
        

    }

}
