package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_015_Slider extends Main {

    @Test(description = "Prueba DemoQA Widgets Date Picker")
    @Story("Date Picker")
    @Description("Probar Date Picker")
    public void CP_015_Slider() throws InterruptedException, IOException {

        
        testId = "CP 015 - Slider";
        

        try{

        
        // 1	Acceder a la web https://demoqa.com
            driver.get("https://demoqa.com");

        // 2	Hacer click en el boton "Widgets" en la pagina
            WebElement mainWidgetsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]"));
            mainWidgetsButton.click();

        // 3	Hacer click en la opcion "Date Picker" en el desplegable "Alert, Frame & Windows" localizado en la izquierda de la pagina
            WebElement sliderNormalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]"));
            sliderNormalButton.click();
    
        // 4	Mover el slider completamente a la izquierda
            WebElement mainSlider = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]"));
            Thread.sleep(1000);
            while (Integer.valueOf(mainSlider.getAttribute("value")) >= 1) {mainSlider.sendKeys(Keys.LEFT);} 

        // 5	Comprobar que el valor del slider es "0"
            System.out.println(mainSlider.getAttribute("value"));
        
        // 6	Mover el slider completamente a la derecha
            while (Integer.valueOf(mainSlider.getAttribute("value")) <= 99) {mainSlider.sendKeys(Keys.RIGHT);} 

        // 7	Comprobar que el valor del slider es "100"
            System.out.println(mainSlider.getAttribute("value"));

        // 8	Mover el slider al centro
            while (Integer.valueOf(mainSlider.getAttribute("value")) != 50) {mainSlider.sendKeys(Keys.LEFT);} 

        // 9	Comprobar que el valor del slider es "50"
            System.out.println(mainSlider.getAttribute("value"));

    } catch(Exception e) {System.out.println(e);}


    }

}
