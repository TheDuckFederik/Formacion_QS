package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_018_Select_Menu extends Main {

    @Test(description = "Prueba DemoQA Widgets Select Menu")
    @Story("Select Menu")
    @Description("Probar Select Menu")
    public void CP_018_Select_Menu() throws InterruptedException, IOException {

        
        testId = "CP 018 - Select Menu";
        

        try{

        
        // 1	Acceder a la web https://demoqa.com
            driver.get("https://demoqa.com");

        // 2	Hacer click en el boton "Widgets" en la pagina
            WebElement mainWidgetsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]"));
            mainWidgetsButton.click();

        // 3	Hacer click en la opcion "Select Menu" en el desplegable "Alert, Frame & Windows" localizado en la izquierda de la pagina
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)", ""); 
            WebElement menuNormalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]"));
            menuNormalButton.click();
    
        // 4	Seleccionar la opcion "Group 1, option 1" en el menu "Select Value"
            WebElement valueSelect = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/input"));
            valueSelect.sendKeys("Group 1");
            valueSelect.sendKeys(Keys.ENTER);

        // 5	Seleccionar la opcion "Group 2, option 2" en el menu "Select Value"
            valueSelect.sendKeys("Group 2");
            valueSelect.sendKeys(Keys.ENTER);
            
        // 6	Seleccionar la opcion "A root option" en el menu "Select Value"
            valueSelect.sendKeys("A root");
            valueSelect.sendKeys(Keys.ENTER);

        // 7	Seleccionar la opcion "Mr." en el menu "Select One"
            WebElement selectOneSelect = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[4]/div/div/div/div[1]/div[2]/div/input"));
            selectOneSelect.sendKeys("Mr");
            selectOneSelect.sendKeys(Keys.ENTER);

        // 8	Seleccionar la opcion "Purple" en el menu "Old Style Select Menu"
            WebElement oldStyleSelect = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/select[1]"));
            Select selectRow = new Select(oldStyleSelect);
            selectRow.selectByVisibleText("Purple");

        // 9	Seleccionar la opcion "Red" en el menu "Multiselect drop down"
            WebElement multiDropSelect = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div/div/div[1]/div[2]/div/input"));
            multiDropSelect.sendKeys("Red");
            multiDropSelect.sendKeys(Keys.ENTER);


        // 10	Seleccionar la opcion "Blue" en el menu "Multiselect drop down"
            multiDropSelect.sendKeys("Blue");
            multiDropSelect.sendKeys(Keys.ENTER);
            Thread.sleep(5000);

        // 11	Hacer click en el boton "X" al lado del valor "Red" en el menu "Multiselect drop down"
            WebElement redXButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/*[name()='svg'][1]/*[name()='path'][1]"));
            redXButton.click();

        // 12	Hacer click en el boton "X" en la parte derecha de el menu "Multiselect drop down"
            WebElement multiXButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/*[name()='svg'][1]"));
            multiXButton.click();

        // 13	Hacer click en el valor "Volvo" en el menu "Standard multi select"
            WebElement volvoStandardMultiSelect = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/select[1]/option[1]"));
            volvoStandardMultiSelect.click();

        // 14	Hacer click en el valor "Saab" en el menu "Standard multi select"
            WebElement saabStandardMultiSelect = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/select[1]/option[2]"));
            saabStandardMultiSelect.click();

    } catch(Exception e) {System.out.println(e);}


    }

}
