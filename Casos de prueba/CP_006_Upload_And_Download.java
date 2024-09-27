package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_006_Upload_And_Download extends Main {

    @Test(description = "Prueba DemoQA Elements Buttons")
    @Story("Elements")
    @Description("Probar buttons")
    public void CP_006_Upload_And_Download() throws InterruptedException, IOException {

        
        testId = "CP 006 - Upload and Download";

        try{

    // 1	Acceder a la web https://demoqa.com
        driver.get("https://demoqa.com");

    // 2	Hacer click en el boton Elements en la pagina
        WebElement mainElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        mainElementsButton.click();

    // 3	Hacer click en la opcion "Upload and Download" en el desplegable "Elements" localizado en la izquierda de la pagina
        WebElement elemUpAndDownButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]"));
        elemUpAndDownButton.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", ""); 

    // 4	Hacer click en el boton "Download"
        WebElement downloadButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]"));
        downloadButton.click();

    // 5	Seleccionar el archivo con el nombre "sampleFile.jpeg"
        WebElement uploadButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]"));
        uploadButton.sendKeys("C:/Users/alex.martinez.ext/Downloads/samplefile.jpeg");

    } catch(Exception e) {System.out.println(e);}


    }

}
