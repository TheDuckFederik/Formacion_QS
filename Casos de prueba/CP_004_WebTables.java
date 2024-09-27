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

public class CP_004_WebTables extends Main {

    @Test(description = "Prueba DemoQA Elements Web Tables")
    @Story("Elements")
    @Description("Probar Web Tables")
    public void CP_004_WebTables() throws InterruptedException, IOException {
        testId = "CP 004 - Web Tables";


        try{

    // 1	Acceder a la web https://demoqa.com
        driver.get("https://demoqa.com");




    // 2	Hacer click en el boton "Elements" en la pagina
        WebElement mainElementsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        mainElementsButton.click();

    // 3	Hacer click en la opcion "Web Tables" en el desplegable "Elements" localizado en la izquierda de la pagina
        WebElement elemRadioBButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
        elemRadioBButton.click();
        
    // 4	Hacer click en el boton "Edit" de la primera entrada de la web table
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", ""); 
        WebElement edit1Button = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[name()='svg'][1]"));
        edit1Button.click();

    // 5	Borrar la informacion en el campo de texto "First Name"
        WebElement firstNameTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        firstNameTextBox.sendKeys(Keys.CONTROL + "a");
        firstNameTextBox.sendKeys(Keys.DELETE);

    // 6	Borrar la informacion en el campo de texto "Vega"
        WebElement lastNameTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        lastNameTextBox.sendKeys(Keys.CONTROL + "a");
        lastNameTextBox.sendKeys(Keys.DELETE);

    // 7	Borrar la informacion en el campo de texto "Email"
        WebElement emailTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]"));
        emailTextBox.sendKeys(Keys.CONTROL + "a");
        emailTextBox.sendKeys(Keys.DELETE);

    // 8	Borrar la informacion en el campo de texto "Age"
        WebElement ageTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/input[1]"));
        ageTextBox.sendKeys(Keys.CONTROL + "a");
        ageTextBox.sendKeys(Keys.DELETE);

    // 9	Borrar la informacion en el campo de texto "Salary"
        WebElement salaryTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/input[1]"));
        salaryTextBox.sendKeys(Keys.CONTROL + "a");
        salaryTextBox.sendKeys(Keys.DELETE);

    // 10	Borrar la informacion en el campo de texto "Department"
        WebElement departmentTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[6]/div[2]/input[1]"));
        departmentTextBox.sendKeys(Keys.CONTROL + "a");
        departmentTextBox.sendKeys(Keys.DELETE);

    // 11	Hacer click en el boton submit
        WebElement formSubmitButton = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/button[1]"));
        formSubmitButton.click();
        

    // 12	Introducir informacion en el campo de texto "First Name"
        firstNameTextBox.sendKeys("TestName");
    // 13	Introducir informacion en el campo de texto "Last Name"
        lastNameTextBox.sendKeys("TestLastName");
    // 14	Introducir una palabra en el campo de texto "Email" para comprobar la verificacion del formato
        emailTextBox.sendKeys("TestEmail");
    // 15	Introducir un correo en el campo de texto "Email" con el formato valido
        emailTextBox.clear();
        emailTextBox.sendKeys("test@email.com");
    // 16	Introducir letras en el campo de texto "Age"
        ageTextBox.sendKeys("ff");
    // 17	Introducir numeros en el campo de texto "Age"
        ageTextBox.clear();
        ageTextBox.sendKeys("50");
    // 18	Introducir  letras en el campo de texto "Salary"
        salaryTextBox.sendKeys("TestSalary");
    // 19	Introducir numeros en el campo de texto "Salary"
        salaryTextBox.clear();
        salaryTextBox.sendKeys("5000");
    // 20	Introducir informacion en el campo de texto "Department"
        departmentTextBox.sendKeys("TestDepartment");
    
    // 21	Hacer click en el boton "Submit"
        formSubmitButton.click();

        
    // 22	Hacer click en el boton "Add"
        WebElement AddButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"));
        AddButton.click();

    // 23	Introducir informacion en el campo de texto "First Name"
        WebElement firstNameAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        firstNameAddTextBox.sendKeys("Test");

    // 24	Introducir informacion en el campo de texto "Last Name"    
        WebElement lastNameAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        lastNameAddTextBox.sendKeys("Test");

    // 25	Introducir un correo en el campo de texto "Email" con el formato valido
        WebElement emailAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]"));
        emailAddTextBox.sendKeys("test@email.com");

    // 26	Introducir numeros en el campo de texto "Age"
        WebElement ageAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/input[1]"));
        ageAddTextBox.sendKeys("69");

    // 27	Introducir numeros en el campo de texto "Salary"
        WebElement salaryAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/input[1]"));
        salaryAddTextBox.sendKeys("42000");

    // 28	Introducir informacion en el campo de texto "Department"
        WebElement departmentAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[6]/div[2]/input[1]"));
        departmentAddTextBox.sendKeys("TestDepartment");

    // 29	Hacer click en el boton "Submit"
        WebElement formSubmitAddButton = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/button[1]"));
        formSubmitAddButton.click();


    // 30	Hacer click en "First Name" 
        WebElement ordFirstNameButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        ordFirstNameButton.click();

    // 31	Hacer click en "Last Name"
        WebElement ordLastNameButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]"));
        ordLastNameButton.click();

    // 32	Hacer click en "Last Name" otra vez
        ordLastNameButton.click();


    // 33	Hacer click en "Age"
        WebElement ordAgeButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]"));
        ordAgeButton.click();
    
    // 34	Hacer click en "Age" otra vez
        ordAgeButton.click();

    // 35	Hacer click en "Email"
        WebElement ordEmailButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]"));
        ordEmailButton.click();

    // 36	Hacer click en "Email" otra vez
        ordEmailButton.click();

    // 37	Hacer click en "Salary"
        WebElement ordSalaryButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[5]/div[1]"));
        ordSalaryButton.click(); 
    
    // 38	Hacer click en "Salary" otra vez
        ordSalaryButton.click(); 
        
    // 39	Hacer click en "Department"
        WebElement ordDepartmentButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[6]/div[1]"));
        ordDepartmentButton.click();
    
    // 40	Hacer click en "Department" otra vez
        ordDepartmentButton.click();


    // 41	Introducir el contenido de uno de los campos de una entrada en el buscador
        WebElement tableSearchBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]"));
        tableSearchBox.sendKeys("test");


    // 42	Eliminar el texto introducido en el buscador
        tableSearchBox.sendKeys(Keys.CONTROL + "a");
        tableSearchBox.sendKeys(Keys.DELETE);



        for (int i = 1; i < 11; i++) {
            AddButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"));
            AddButton.click();
            firstNameAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
            firstNameAddTextBox.sendKeys("Test"+i);
            lastNameAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/input[1]"));
            lastNameAddTextBox.sendKeys("Test"+i);
            emailAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]"));
            emailAddTextBox.sendKeys("test"+i+"@email.com");
            ageAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/input[1]"));
            ageAddTextBox.sendKeys("55");
            salaryAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/input[1]"));
            salaryAddTextBox.sendKeys("55555");
            departmentAddTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[6]/div[2]/input[1]"));
            departmentAddTextBox.sendKeys("TestDepartment");
            formSubmitAddButton = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/button[1]"));
            formSubmitAddButton.click();
        };


    // 43	Hacer click en el boton derecho inferior "Next"
        WebElement nextPageButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[3]/button[1]"));
        nextPageButton.click();

    // 44	Hacer click en el boton izquierdo inferior "Previous"
        WebElement previousPageButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/button[1]"));
        previousPageButton.click();

    // 45	Borrar el numero que hay en la parte inferior central al lado del texto "Page"
        WebElement pageTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[1]/div[1]/input[1]"));
        pageTextBox.click();
        pageTextBox.sendKeys(Keys.CONTROL + "a");
        pageTextBox.sendKeys(Keys.DELETE);


    // 48	Apretar enter para comprobar el comportamiento cuando no hay un valor
        pageTextBox.sendKeys(Keys.ENTER);

    // 47	Volver a borrar el numero de la parte inferior central
        pageTextBox.click();
        pageTextBox.sendKeys(Keys.CONTROL + "a");
        pageTextBox.sendKeys(Keys.DELETE);

    // 48	Escribir un numero mayor a las paginas que hay en la tabla
        pageTextBox.sendKeys("5");
    
    // 49	Apretar enter para cambiar de pagina
        pageTextBox.sendKeys(Keys.ENTER);

    // 50	Seleccionar "5 rows" en el desplegable con el valor "10 rows"
        WebElement rowsSelect = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/span[2]/select[1]"));
        Select selectRow = new Select(rowsSelect);
        selectRow.selectByVisibleText("5 rows");

    // 51	Apretar el boton "Delete", localizado bajo "Action", en una de las entradas
        WebElement delete1Button = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[2]/*[name()='svg'][1]"));
        delete1Button.click();



        
         } catch(Exception e) {System.out.println(e);}
        

    }

}
