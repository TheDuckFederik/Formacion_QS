package web;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_009_Browser_Windows extends Main {
    public static String changeWindow() {
        for (String windhandle : driver.getWindowHandles()) {
            if (windhandle != driver.getWindowHandle()){
                return windhandle;
            }
        }
        return "0";
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Browser Windows")
    @Story("Form")
    @Description("Probar Browser Windows")
    
    public void CP_009_Browser_Windows() throws InterruptedException, IOException {

        
        testId = "CP 009 - Browser Windows";

        try{
        

        // 1	Acceder a la web https://demoqa.com
            driver.get("https://demoqa.com");



        // 2	Hacer click en el boton "Alert, Frame & Windows" en la pagina
            WebElement mainAFWButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]"));
            mainAFWButton.click();
    
        // 3	Hacer click en la opcion "Browser Windows" en el desplegable "Alert, Frame & Windows" localizado en la izquierda de la pagina
            WebElement afwBrowserWindowsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]"));
            afwBrowserWindowsButton.click();

            
        // 4	Hacer click en el boton "New Tab"
            WebElement newTabButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"));
            ArrayList<String> Windows = new ArrayList<String>(driver.getWindowHandles());
            newTabButton.click();
            Thread.sleep(1000);

        // 5	Mostrar el texto en el nuevo tab
            changeWindow();
            WebElement newTabText = driver.findElement(By.xpath("/html/body/h1"));
            System.out.println(newTabText.getText());
            driver.close();
        
        // 6	Hacer click en el boton "New Window"
            WebElement newWindowButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]"));
            newWindowButton.click();
            Thread.sleep(1000);

        // 7	Mostrar el texto en la nueva ventana
            changeWindow();
            WebElement newWindowText = driver.findElement(By.xpath("/html/body/h1"));
            System.out.println(newWindowText.getText());
            driver.close();

        // 8	Hacer click en el boton "New Window Message"
            WebElement newMessageButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]"));
            newMessageButton.click();
            Thread.sleep(1000);
        
        // 9	Mostrar el texto de el mensaje
            changeWindow();
            WebElement newMessageText = driver.findElement(By.xpath("/html/body/text()"));
            System.out.println(newMessageText);


            driver.close();

      

            Thread.sleep(5000);

       
    } catch(Exception e) {System.out.println(e);}


    }

}
