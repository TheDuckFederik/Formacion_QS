package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_007_Dynamic_Properties extends Main {

    @Test(description = "Prueba DemoQA Elements Dynamic Properties")
    @Story("Elements")
    @Description("Probar Dynamic Properties")
    public void CP_007_Dynamic_Properties() throws InterruptedException, IOException {

        
        testId = "CP 007 - Dynamic Properties";

        try{

    // 1	Acceder a la web https://demoqa.com	Se accede correctamente a la pagina https://demoqa.com
        driver.get("https://demoqa.com");

    // 2	Hacer click en el boton "Elements" en la pagina	
        WebElement mainElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        mainElementsButton.click();

    // 3	Hacer click en la opcion "Dynamic Properties" en el desplegable "Elements" localizado en la izquierda de la pagina	
        WebElement elemDynPropertiesButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]"));
        elemDynPropertiesButton.click();

    // 4	Imprimir el texto por pantalla
        WebElement randomIdText = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]"));    
        System.out.println(randomIdText.getText());

    // 5	Capturar el color del segundo boton con el nombre "Color Change" en color blanco	
        WebElement colorButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]"));
        System.out.println(colorButton.getCssValue("color"));

    // 6	Intentar hacer click en el primer boton "Will enable 5 seconds"	
        WebElement willEnableButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
        willEnableButton.click();

    // 7	Esperar 5 segundos	
        Wait<WebDriver> wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(willEnableButton));

    // 8	Hacer click en el boton "Will enable 5 seconds"	
        willEnableButton.click();

    // 9	Comparar el color del boton "Color change" con el valor guardado anteriormente	
        System.out.println(colorButton.getCssValue("color"));

    // 10	Hacer click en el boton "Visible After 5 Seconds"
        WebElement visibleAfterButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(visibleAfterButton));
        visibleAfterButton.click();

       
    } catch(Exception e) {System.out.println(e);}


    }

}
