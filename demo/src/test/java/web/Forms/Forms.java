package web.Forms;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;


// import org.testng.Assert;

//

public class Forms extends web.Main {
    
    @Test(description = "Prueba DemoQA Forms Practice Form")
    @Story("Forms")
    @Description("Practice Form")
    //
    public void TC008_Forms8() throws InterruptedException, IOException {
        testId = "TC008_Forms8";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Forms
            driver.findElement(By.xpath(config.getProperty("forms"))).click();
            Thread.sleep(500);
            // Entramos al unico item
            driver.findElement(By.xpath(config.getProperty("PracticeForm"))).click();
            Thread.sleep(500);

            // Introducimos el First Name
            driver.findElement(By.id("firstName"))
                    .sendKeys(web.Main.getTagValue("UserFirstName_Practice_Forms_TC_008", web.Main.doc));
            driver.findElement(By.id("lastName"))
                    .sendKeys(web.Main.getTagValue("UserLastName_Practice_Forms_TC_008", web.Main.doc));
            WebElement email = driver.findElement(By.id("userEmail"));

            WebElement submit = driver.findElement(By.id("submit"));

            // Para hace scroll
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            Thread.sleep(500);

            // verificar que el correo es erroneo
            email.sendKeys(web.Main.getTagValue("UserEmailIncorrecto_Practice_Forms_TC_008", web.Main.doc));
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            submit.click();

            Thread.sleep(500);

            email.clear();
            email.sendKeys(web.Main.getTagValue("UserEmailIncorrecto2_Practice_Forms_TC_008", web.Main.doc));

            Thread.sleep(500);
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            submit.click();

            Thread.sleep(500);
            email.clear();
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            email.sendKeys(web.Main.getTagValue("UserEmailCorrecto_Practice_Forms_TC_008", web.Main.doc));
            Thread.sleep(500);

            // Elegimos el genero
            driver.findElement(By.xpath(config.getProperty("RadOth"))).click();
            System.out.println("Clicamos al Other");
            Thread.sleep(500);
            driver.findElement(By.xpath(config.getProperty("RadFam"))).click();
            System.out.println("Clicamos al Female");
            Thread.sleep(500);
            driver.findElement(By.xpath(config.getProperty("RadMal"))).click();
            System.out.println("Clicamos al Male");

            // Escribimos el mobile
            driver.findElement(By.id("userNumber")).sendKeys(web.Main.getTagValue("Movil_Practice_Forms_TC_008", web.Main.doc));

            // Fecha de nacimiento
            WebElement fecha = driver.findElement(By.id("dateOfBirthInput"));
            fecha.click();
            Thread.sleep(1000);

            // Elegir año
            WebElement fecha_a = driver.findElement(By.xpath(config.getProperty("EscoAnyo")));
            Select select_a = new Select(fecha_a);
            select_a.selectByValue("2004");
            Thread.sleep(2000);

            // Elegimos el mes
            WebElement fecha_m = driver.findElement(By.xpath(config.getProperty("EscoMes")));
            Select select_m = new Select(fecha_m);
            select_m.selectByValue("6");
            Thread.sleep(2000);
            // Elegimos dia
            driver.findElement(By.xpath(config.getProperty("EscoDia"))).click();

            // Escogeremos el Subject
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(web.Main.getTagValue("SubjectMath_Practice_Froms_TC_008", web.Main.doc));
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(web.Main.getTagValue("SubjectAccounting_Practice_Forms_TC_008", web.Main.doc));
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(web.Main.getTagValue("SubjectArts_Practice_Forms_TC_008", web.Main.doc));
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(web.Main.getTagValue("SubjectSoci_Practice_Forms_TC_008", web.Main.doc));
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(Keys.RETURN);
            Thread.sleep(2000);

            // Le damos a los botones de los hobbies
            driver.findElement(By.xpath(config.getProperty("Sport"))).click();
            System.out.println("Escogemos Sport");
            Thread.sleep(500);
            driver.findElement(By.xpath(config.getProperty("Sport"))).click();
            System.out.println("Quitamos Sport");
            driver.findElement(By.xpath(config.getProperty("Reading"))).click();
            System.out.println("Escogemos Reading");
            Thread.sleep(500);
            driver.findElement(By.xpath(config.getProperty("Reading"))).click();
            System.out.println("Quitamos Reading ");
            driver.findElement(By.xpath(config.getProperty("Music"))).click();
            System.out.println("Escogemos Music ");
            Thread.sleep(500);
            driver.findElement(By.xpath(config.getProperty("Music"))).click();
            System.out.println("Quitamos Music ");
            driver.findElement(By.xpath(config.getProperty("Sport"))).click();
            System.out.println("Escogemos Sport ");

            // selecionamos el archivo
            WebElement subir_archivo = driver.findElement(By.id("uploadPicture"));
            // Escribimos la ruta de nuestro archivo
            subir_archivo.sendKeys(web.Main.getTagValue("SubirArchivo_Practice_Froms_TC_008", web.Main.doc));
            Thread.sleep(1000);

            // Current Addres
            driver.findElement(By.id("currentAddress")).sendKeys(web.Main.getTagValue("CurrentAddress_Practice_Forms_TC_008", web.Main.doc));
            // State and City
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            driver.findElement(By.id("react-select-3-input")).sendKeys(web.Main.getTagValue("State_Practice_Froms_TC_008", web.Main.doc));
            driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            driver.findElement(By.id("react-select-4-input")).sendKeys(web.Main.getTagValue("City_Practice_Froms_TC_008", web.Main.doc));
            driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            submit.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
