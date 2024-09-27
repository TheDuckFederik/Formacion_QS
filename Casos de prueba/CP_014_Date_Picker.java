package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_014_Date_Picker extends Main {

    @Test(description = "Prueba DemoQA Widgets Date Picker")
    @Story("Date Picker")
    @Description("Probar Date Picker")
    public void CP_014_Date_Picker() throws InterruptedException, IOException {

        
        testId = "CP 014 - Date Picker";
        

        try{

        
        // 1	Acceder a la web https://demoqa.com
            driver.get("https://demoqa.com");

        // 2	Hacer click en el boton "Widgets" en la pagina
            WebElement mainWidgetsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]"));
            mainWidgetsButton.click();

        // 3	Hacer click en la opcion "Date Picker" en el desplegable "Alert, Frame & Windows" localizado en la izquierda de la pagina
            WebElement dateNormalButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]"));
            dateNormalButton.click();
    
        // 4	Borrar el texto del date picker "Select Date"
            WebElement dateBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"));
            dateBox.sendKeys(Keys.CONTROL+"a");
            dateBox.sendKeys(Keys.DELETE);

        // 5	Escribir una nueva fecha con el formato "MM/DD/YYYY" dentro del date picker "Select Date"
            dateBox.sendKeys("06/06/2006");
            System.out.println(dateBox.getAttribute("value"));
            dateBox.sendKeys(Keys.ENTER);

        // 6	Borrar el texto del date picker "Date And Time"
            WebElement dateTimeBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]"));
            dateTimeBox.sendKeys(Keys.CONTROL+"a");
            dateTimeBox.sendKeys(Keys.DELETE);

        // 7	Escribir una nueva fecha con el formato "Month Day, Year HH:MM" dentro del date picker "Date And Time"
            dateTimeBox.sendKeys("June 06, 2006 05:15 PM");
            System.out.println(dateTimeBox.getAttribute("value"));
            dateTimeBox.sendKeys(Keys.ENTER);

        // 8	Hacer click en el date picker "Select Date"
            dateBox.click();

        // 9	Hacer click en el desplegable de los meses y seleccionar el mes de "Julio"
            WebElement dateMonthSelect = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
            Select selectRow = new Select(dateMonthSelect);
            selectRow.selectByVisibleText("July");

        // 10	Hacer click en el desplegable de los años y seleccionar el año "2004"
            WebElement dateYearSelect = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
            selectRow = new Select(dateYearSelect);
            selectRow.selectByVisibleText("2004");

        // 11	Hacer click en el dia "9"
            WebElement dateDayButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[6]"));
            dateDayButton.click();
            System.out.println(dateBox.getAttribute("value"));

        // 12	Hacer click en el date picker "Date And Time"
            dateTimeBox.click();

        // 13	Hacer click en el desplegable de los meses y seleccionar el mes de "Julio"
            WebElement dateTimeMonthDropwdown = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]"));
            dateTimeMonthDropwdown.click();
            WebElement dateTimeMonthButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]"));
            dateTimeMonthButton.click();

        // 14	Hacer click en el desplegable de los años y seleccionar el año "2004"
            WebElement dateTimeYearDropwdown = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]"));
            dateTimeYearDropwdown.click();
            WebElement dateTimeYearButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[9]"));
            dateTimeYearButton.click();

        // 15	En el apartado time seleccionar el tiempo "0:00"
            WebElement dateTimeDayButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[6]"));
            dateTimeDayButton.click();
            
        // 16	Hacer click en el dia "9"
            WebElement dateTimeHourButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dateTimeHourButton);
            dateTimeHourButton.click();
            System.out.println(dateTimeBox.getAttribute("value"));
       
    } catch(Exception e) {System.out.println(e);}


    }

}
