package web;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class CP_008_Practice_Form extends Main {

    @Test(description = "Prueba DemoQA Forms Practice Form")
    @Story("Form")
    @Description("Probar Practice Form")
    public void CP_008_Practice_Form() throws InterruptedException, IOException {

        
        testId = "CP 008 - Practice Form";

        try{


    // 1	Acceder a la web https://demoqa.com
        driver.get("https://demoqa.com");

    // 2	Hacer click en el boton "Forms" en la pagina
        WebElement mainFormsButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]"));
        mainFormsButton.click();

    // 3	Hacer click en la opcion "Practice Form" en el desplegable "Forms" localizado en la izquierda de la pagina
        WebElement formsPracticeFormButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]"));
        formsPracticeFormButton.click();

    // 4	Hacer click en el boton submit con todos lo campos vacios
        
    // 5	Escribir texto en la caja de texto "First Name"
        WebElement firstNameTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        firstNameTextBox.sendKeys("TestName");
        System.out.println(firstNameTextBox.getText());

    // 6	Escribir texto en la caja de texto "Last Name"
        WebElement lastNameTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[4]/input[1]"));
        lastNameTextBox.sendKeys("TestLastName");
        System.out.println(lastNameTextBox.getText());

    // 7	Escribir una palabra en el cuadro de texto "Email"
        WebElement emailTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        emailTextBox.sendKeys("Test");
        System.out.println(emailTextBox.getText());

    // 8	Escribir texto con formato de email en el cuadro de texto "Email"
        emailTextBox.clear();
        emailTextBox.sendKeys("test@email.com");
        System.out.println(emailTextBox.getText());

    // 9	Hacer click en el boton "Male" de el apartado gender
        WebElement maleGenderButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        maleGenderButton.click();

    // 10	Hacer click en el boton "Female"
        WebElement femaleGenderButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[2]/label[1]"));
        femaleGenderButton.click();

    // 11	Hacer click en el boton "Other"
        WebElement otherGenderButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[3]/label[1]"));
        otherGenderButton.click();

    // 12	Escribir texto en el cuadro de texto "Mobile"
        WebElement mobileTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/input[1]"));
        mobileTextBox.sendKeys("Test");
        System.out.println(mobileTextBox.getText());

    // 13	Escribir un numero en el cuadro de texto "Mobile"
        mobileTextBox.clear();
        mobileTextBox.sendKeys("1");
        System.out.println(mobileTextBox.getText());
        
    // 14	Escribir diez numeros en el cuadro de texto "Mobile"
        mobileTextBox.sendKeys("231412412");
        System.out.println(mobileTextBox.getText());

    // 16	Seleccionar una fecha en el campo "Date of Birth"
        WebElement dateOfBirthBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]"));
        dateOfBirthBox.click();
        dateOfBirthBox.sendKeys(Keys.CONTROL+"A");
        dateOfBirthBox.sendKeys("29 Aug 2024");
        dateOfBirthBox.sendKeys(Keys.ENTER);
        System.out.println(dateOfBirthBox.getText());

    // 17	Escribir texto en la caja de texto "Subjects"
        WebElement subjectsTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        subjectsTextBox.sendKeys("En");

    // 18	Seleccionar una de las opciones que aparecen en "Subjects"
        subjectsTextBox.sendKeys(Keys.ENTER);

    // 19	Hacer click en la checkbox "Sports"
        WebElement sportsHobbiesButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]/label[1]"));
        sportsHobbiesButton.click();

    // 20	Hacer click en la checkbox "Reading"
        WebElement readingHobbiesButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]/label[1]"));
        readingHobbiesButton.click();

    // 21	Hacer click en la checkbox "Music"
        WebElement musicHobbiesButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]"));
        musicHobbiesButton.click();

    // 22	En el boton "Choose File" seleccionar un archivo de imagen
        WebElement uploadButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[8]/div[2]/div[1]/input[1]"));
        uploadButton.sendKeys("C:/Users/alex.martinez.ext/Downloads/samplefile.jpeg");

    // 25	Escribir texto en la caja de texto "Current Address"
        WebElement addressTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[9]/div[2]/textarea[1]"));
        addressTextBox.sendKeys("TestAddress");
        System.out.println(addressTextBox.getText());
        
    // 26	Seleccionar la opcion "NCR" en el desplegable "Select State"
        WebElement stateInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[2]/div/div/div[1]/div[2]/div/input"));
        stateInput.sendKeys("NCR");
        stateInput.sendKeys(Keys.ENTER);

    // 27	Seleccionar la opcion "Delhi" en el desplegable "Select City"
        WebElement citySelector = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[3]/div/div/div[1]/div[2]/div/input"));
        citySelector.sendKeys("Delhi");
        citySelector.sendKeys(Keys.ENTER);

    // 28	Hacer click en el boton "Submit"
        WebElement submitButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[11]/div[1]/button[1]"));
        submitButton.click();

    // 29	Imprimir los resultados por pantalla
        WebElement thankYouText = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]"));
        System.out.println(thankYouText.getText());
        WebElement formResultTable = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table"));
        System.out.println(formResultTable.getText());

       
    } catch(Exception e) {System.out.println(e);}


    }

}
