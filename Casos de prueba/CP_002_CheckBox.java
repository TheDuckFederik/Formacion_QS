package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_002_CheckBox extends Main {

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void CP_002_CheckBox() throws InterruptedException, IOException {

        
        testId = "CP 002 - Check Box";

    

        try{
    // 1  Acceder a la web https://demoqa.com
        driver.get("https://demoqa.com");

    // 2  Hacer click en la opcion "Check Box" en el desplegable "Elements" localizado en la izquierda de la pagina
        WebElement mainElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        mainElementsButton.click();

    // 3  Hacer click en la opcion "Check Box" en el desplegable "Elements" localizado en la izquierda de la pagina
        WebElement elemCheckBoxButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
        elemCheckBoxButton.click();

    // 4  Hacer click en la flecha desplegable a la izquierda de la checkbox "Home"
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", ""); 
        WebElement HomeDropDown = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));
        HomeDropDown.click();

    // 5  Hacer click en la flecha desplegable a la izquierda de la checkbox "Desktop"
        WebElement DesktopDropDown = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));
        DesktopDropDown.click();

    // 6  Hacer click en la flecha desplegable a la izquierda de la checkbox "Documents"
        WebElement DocumentsDropDown = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]/*[name()='svg'][1]"));
        DocumentsDropDown.click();

    // 7  Hacer click en la flecha desplegable a la izquierda de la checkbox "Workspace"
        WebElement WorkspaceDropDown = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]"));
        WorkspaceDropDown.click();
    
    // 8  Hacer click en la flecha desplegable a la izquierda de la checkbox "Office"
        WebElement OfficeDropDown = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/button[1]/*[name()='svg'][1]"));
        OfficeDropDown.click();

    // 9  Hacer click en la flecha desplegable a la izquierda de la checkbox "Downloads"
        WebElement DownloadsDropDown = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]/*[name()='svg'][1]"));
        DownloadsDropDown.click();

    // 10  Hacer click en la checkbox "Desktop"
        WebElement DesktopCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        DesktopCheckbox.click();

    // 11  Hacer click en la checkbox "Notes"
        WebElement NotesCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]"));
        NotesCheckbox.click();

    // 12  Hacer click en la checkbox "Commands"
        WebElement CommandsCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]"));
        CommandsCheckbox.click();

    // 13  Hacer click en la checkbox "Documents"
        WebElement DocumentsCheckbox = driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        DocumentsCheckbox.click();

    // 14  Hacer click en la checkbox "WorkSpace"
        WebElement WorkSpaceCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]"));
        WorkSpaceCheckbox.click();

    // 15  Hacer click en la checkbox "React"
        WebElement ReactCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        ReactCheckbox.click();

    // 16  Hacer click en la checkbox "Angular"
        WebElement AngularCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1] "));
        AngularCheckbox.click();

    // 17  Hacer click en la checkbox "Veu"
        WebElement VeuCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        VeuCheckbox.click();

    // 18  Hacer click en la checkbox "Office"
        WebElement OfficeCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        OfficeCheckbox.click();

    // 19  Hacer click en la checkbox "Public"
        WebElement PublicCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        PublicCheckbox.click();

    // 20  Hacer click en la checkbox "Private"
        WebElement PrivateCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        PrivateCheckbox.click();

    // 21  Hacer click en la checkbox "Classified"
        WebElement ClassifiedCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[3]/span[1]/label[1]/span[1]"));
        ClassifiedCheckbox.click();

    // 22  Hacer click en la checkbox "General"
        WebElement GeneralCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/ol[1]/li[4]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        GeneralCheckbox.click();

    // 23  Hacer click en la checkbox "Downloads"
        WebElement DownloadsCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        DownloadsCheckbox.click();

    // 24  Hacer click en la checkbox "Word File.doc"
        WebElement WordFileCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]"));
        WordFileCheckbox.click();

    // 25  Hacer click en la checkbox "Excel File.doc"
        WebElement ExcelFileCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[3]/ol[1]/li[2]/span[1]/label[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]"));
        ExcelFileCheckbox.click();

    // 26  Hacer click en la checkbox "Home"
        WebElement HomeCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]"));
        HomeCheckbox.click();

    // 27  Hacer click otra vez en la checkbox "Home"
        HomeCheckbox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]"));
        HomeCheckbox.click();
        
    // 28  Hacer click en el boton "-" localizado a la derecha de las checkboxes
        WebElement MinusButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[2]/*[name()='svg'][1]"));
        MinusButton.click();

    // 29  Hacer click en el boton "+" localizado a la derecha de las checkboxes
        WebElement PlusButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/*[name()='svg'][1]"));
        PlusButton.click();

    } catch(Exception e) {System.out.println(e);}


    }

}
