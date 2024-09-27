package web;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_001_TextBox extends Main {

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP_001_TextBox() throws InterruptedException, IOException {

        
        testId = "CP 001 - Text Box";

        try{


    // 1  Acceder a la web https://demoqa.com
        driver.get("https://demoqa.com");
        if(validateElement("//img[@alt='Selenium Online Training']") == true) {System.out.println("S'ha accedit a demoqa");} else {throw.}
        
    // 2  Hacer click en el boton "Elements" en la pagina
        WebElement mainElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        mainElementsButton.click();
        
    
    // 3  Hacer click en la opcion "Text Box" en el desplegable "Elements" localizado en la izquierda de la pagina
        WebElement elemTextBoxButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
        elemTextBoxButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", ""); 

    // 4  Escribir un texto en el cuadro de texto "Full Name"
        WebElement fullnameBox = driver.findElement(By.xpath("(//input[@id='userName'])[1]"));
        fullnameBox.sendKeys("TestName");

    // 5  Escribir un email erroneo en la text box Email para comprobar la verificacion del texto
        WebElement emailBox = driver.findElement(By.xpath("(//input[@id='userEmail'])[1]"));
        emailBox.sendKeys("emailTest");
        System.out.println(emailBox.getAttribute("value"));


    // 6  Comprobar la verificacion de formato de texto en el cuadro de texto "Email" haciendo click en Submit con un texto erroneo introducido en el cuadro de texto.
        WebElement submitButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
        submitButton.click();
        System.out.println(emailBox.getCssValue("border"));


    // 7  Introducir un texto con formato correcto en el cuadro de texto "Email"
        emailBox.clear();
        emailBox.sendKeys("email@gmail.com");
        System.out.println(emailBox.getAttribute("value"));

    // 8  Hacer click en el boton submit para comprobar que verifica correctamente el formato del texto introducido en la text box "Email"  
       submitButton.click();
       System.out.println(emailBox.getCssValue("border"));

    // 9  Introducir algun texto en el cuadro de texto "Current Address"
        WebElement CurrentAddressBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
        CurrentAddressBox.sendKeys("CATest");

    // 10  Introducir algun texto en el cuadro de texto "Permanent Address"
        WebElement PermanentAddressBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
        PermanentAddressBox.sendKeys("PATest");

    // 11  Se hace click en el boton "Submit" 
        submitButton.click();

    // 12  Guardar los datos que se reciben de la pagina
        WebElement ResultText = driver.findElement(By.xpath("//*[@id=\"output\"]/div"));
        String Result = ResultText.getText();

    // 13  Imprimir los datos guardados por pantalla utilizando el terminal
        System.out.println(Result);

    } catch(Exception e) {System.out.println(e);}
    }

}
