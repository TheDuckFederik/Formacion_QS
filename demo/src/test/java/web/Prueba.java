package web;

import java.io.IOException;

import org.openqa.selenium.Alert;
//
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
// import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
//
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import java.util.concurrent.TimeUnit;
//
import java.util.Set;
//

public class Prueba extends Main {
    //

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void TC001_Elements1() throws InterruptedException, IOException {
        testId = "TC001_Elements1";

        // Cargar el archivo JSON en lugar de "/data.json"
        Main.loadJSON("src\\test\\java\\web\\selenium.json");

        try {
            driver.get(config.getProperty("urlPrincipal"));
            System.out.println("Entramos a la pagina demoqa.com");

            driver.findElement(By.xpath(config.getProperty("elementos"))).click();
            System.out.println("Entramos en Elementos");

            driver.findElement(By.id("item-0")).click();
            System.out.println("Entramos en el Text Box");

            // Usar JSON para rellenar el campo de Full Name
            driver.findElement(By.id("userName"))
                .sendKeys(Main.getJSONValue("TC_001", "fullNameText_TC_001"));
            System.out.println("Escribimos en Full Name ");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 600);");

            WebElement input_email = driver.findElement(By.id("userEmail"));

            // Usar JSON para el campo email incorrecto
            input_email.sendKeys(Main.getJSONValue("TC_001", "EmailincorrectoText_TC_001"));
            System.out.println("Escribimos en email de forma incorrecta");

            WebElement B_submit = driver.findElement(By.id("submit"));
            B_submit.click();
            System.out.println("Le damos al submit");

            Thread.sleep(500);
            input_email.clear();

            // Usar JSON para el campo email incorrecto 2
            input_email.sendKeys(Main.getJSONValue("TC_001", "Emailincorrecto2Text_TC_001"));
            System.out.println("Escribimos en email de forma incorrecta");

            B_submit.click();
            System.out.println("Le damos al submit");

            Thread.sleep(500);
            input_email.clear();

            // Usar JSON para el campo email correcto
            input_email.sendKeys(Main.getJSONValue("TC_001", "EmailCorrectoText_TC_001"));
            System.out.println("Escribimos en email de forma correcta");

            // Usar JSON para las direcciones
            driver.findElement(By.id("currentAddress"))
                .sendKeys(Main.getJSONValue("TC_001", "CurrentAddressText_TC_001"));
            System.out.println("Escribimos en el current Address");

            driver.findElement(By.id("permanentAddress"))
                .sendKeys(Main.getJSONValue("TC_001", "PermanentAddressText_TC_001"));
            System.out.println("Escribimos en el Permanent Address");

            B_submit.click();
            System.out.println("Le damos al submit");
            Thread.sleep(500);

            // Recoger el texto de la página
            WebElement elemento = driver.findElement(By.xpath(config.getProperty("RecogerDatos")));
            String texto = elemento.getText();
            System.out.println("Recogida de texto: " + texto);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }


    @Test(description = "Prueba DemoQA Elements Check box")
    @Story("Elements")
    @Description("Rellenar check box")
    //
    public void TC002_Elements2() throws InterruptedException, IOException {
        testId = "TC002_Elements2";

        //
        try {
            driver.get(config.getProperty("urlPrincipal"));
            System.out.println("Entramos a la pagina demoqa.com");

            driver.findElement(By.xpath(config.getProperty("elementos"))).click();
            System.out.println("Entramos a Elementos");

            driver.findElement(By.id("item-1")).click();
            System.out.println("Entramos en el Check Box");

            Thread.sleep(100);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");
            // Desplegar todo
            driver.findElement(By.xpath(config.getProperty("DespHome"))).click();
            System.out.println("Desplegamos el Home");

            driver.findElement(By.xpath(config.getProperty("DespDeskDocsWorkOffi"))).click();
            System.out.println("Desplegamos el Desktop");

            driver.findElement(By.xpath(config.getProperty("DespDeskDocsWorkOffi"))).click();
            System.out.println("Desplegamos el Documents");

            driver.findElement(By.xpath(config.getProperty("DespDown"))).click();
            System.out.println("Desplegamos Downloads");

            driver.findElement(By.xpath(config.getProperty("DespDeskDocsWorkOffi"))).click();
            System.out.println("Desplegamos WorkSapce");

            driver.findElement(By.xpath(config.getProperty("DespDeskDocsWorkOffi"))).click();
            System.out.println("Desplegamos Office");
            Thread.sleep(100);

            // Clicamos al check
            js.executeScript("window.scrollBy(0, 444);");
            // Clicamos el Home
            driver.findElement(By.xpath(config.getProperty("BoxHome"))).click();
            System.out.println("Clicamos el Check Home");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxHome"))).click();
            System.out.println("Clicamos el Check Home");
            Thread.sleep(100);

            // Clicamos el Desktop
            driver.findElement(By.xpath(config.getProperty("BoxDesk"))).click();
            Thread.sleep(100);
            System.out.println("Clicamos el Check Desktop");
            driver.findElement(By.xpath(config.getProperty("BoxDesk"))).click();
            System.out.println("Clicamos el Check Desktop");
            Thread.sleep(100);

            // Clicamos el Documents
            driver.findElement(By.xpath(config.getProperty("BoxDocs"))).click();
            System.out.println("Clicamos el Check Documents");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxDocs"))).click();
            System.out.println("Clicamos el Check Documents");
            Thread.sleep(100);

            // Clicamos el Downloads
            driver.findElement(By.xpath(config.getProperty("BoxDown"))).click();
            System.out.println("Clicamos el Check Downloads");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxDown"))).click();
            System.out.println("Clicamos el Check Downloads");
            Thread.sleep(100);

            // Clicamos el WorkSpace
            driver.findElement(By.xpath(config.getProperty("BoxWork"))).click();
            System.out.println("Clicamos el Check WorkSpace");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxWork"))).click();
            System.out.println("Clicamos el Check WorkSpace");
            Thread.sleep(100);

            // Clicamos el Office
            driver.findElement(By.xpath(config.getProperty("BoxOffi"))).click();
            System.out.println("Clicamos el Check Office");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxOffi"))).click();
            System.out.println("Clicamos el Check Office");
            Thread.sleep(100);

            // Clicamos en Notes
            driver.findElement(By.xpath(config.getProperty("BoxNote"))).click();
            System.out.println("Clicamos el Check Office");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxNote"))).click();
            System.out.println("Clicamos el Check Office");
            Thread.sleep(100);

            // Clicamos en Command
            driver.findElement(By.xpath(config.getProperty("BoxComm"))).click();
            System.out.println("Clicamos el Check Command");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxComm"))).click();
            System.out.println("Clicamos el Check Command");
            Thread.sleep(100);

            // Clicamos en React
            driver.findElement(By.xpath(config.getProperty("BoxReac"))).click();
            System.out.println("Clicamos el Check React");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxReac"))).click();
            System.out.println("Clicamos el Check React");
            Thread.sleep(100);

            // Clicamos en Angular
            driver.findElement(By.xpath(config.getProperty("BoxAngl"))).click();
            System.out.println("Clicamos el Check Angular");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxAngl"))).click();
            System.out.println("Clicamos el Check Angular");
            Thread.sleep(100);

            // Clicmaos en Veu
            driver.findElement(By.xpath(config.getProperty("BoxVeu"))).click();
            System.out.println("Clicamos el Check Veu");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxVeu"))).click();
            System.out.println("Clicamos el Check Veu");
            Thread.sleep(100);

            // Clicamos en Public
            driver.findElement(By.xpath(config.getProperty("BoxPub"))).click();
            System.out.println("Clicamos el Check Public");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxPub"))).click();
            System.out.println("Clicamos el Check Public");
            Thread.sleep(100);

            // Clicamos en Private
            driver.findElement(By.xpath(config.getProperty("BoxPri"))).click();
            System.out.println("Clicamos el Check Private");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxPri"))).click();
            System.out.println("Clicamos el Check Private");
            Thread.sleep(100);

            // Clicamos en Classified
            driver.findElement(By.xpath(config.getProperty("BoxCla"))).click();
            System.out.println("Clicamos el Check Classified");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxCla"))).click();
            System.out.println("Clicamos el Check Classified");
            Thread.sleep(100);

            // Clicamos en General
            driver.findElement(By.xpath(config.getProperty("BoxGen"))).click();
            System.out.println("Clicamos el Check General");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxGen"))).click();
            System.out.println("Clicamos el Check General");
            Thread.sleep(100);

            // Clicamos en Word File.doc
            driver.findElement(By.xpath(config.getProperty("BoxWor"))).click();
            System.out.println("Clicamos el Check Word File.doc");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxWor"))).click();
            System.out.println("Clicamos el Check Word File.doc");
            Thread.sleep(100);

            // Clicamos en Excel File.doc
            driver.findElement(By.xpath(config.getProperty("BoxExc"))).click();
            System.out.println("Clicamos el Check Excel File.doc");
            Thread.sleep(100);
            driver.findElement(By.xpath(config.getProperty("BoxExc"))).click();
            System.out.println("Clicamos el Check Excel File.doc");
            Thread.sleep(100);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Elements Radio Button")
    @Story("Elements")
    @Description("Rellenar Radio Button")
    //
    public void TC003_Elements3() throws InterruptedException, IOException {
        testId = "TC003_Elements3";

        //
        try {
            driver.get(config.getProperty("urlPrincipal"));
            System.out.println("Entramos a demoqa.com");

            driver.findElement(By.xpath(config.getProperty("elementos"))).click();
            System.out.println("Entramos a Elementos");
            Thread.sleep(500);

            driver.findElement(By.id("item-2")).click();
            System.out.println("Entramos en Radio Button");
            Thread.sleep(500);

            // Clicamos el Radio del Yes
            driver.findElement(By.xpath(config.getProperty("ClikYes"))).click();
            System.out.println("Clicamos al Radio Del Yes");
            Thread.sleep(500);

            // Recogemos texto
            WebElement elemento = driver.findElement(By.xpath(config.getProperty("RecogerTexto")));
            String primer_texto = elemento.getText();
            System.out.println("Recogida de texto: " + primer_texto);

            // Clicamos el Radio del Impressive
            driver.findElement(By.xpath(config.getProperty("ClikImpres"))).click();
            System.out.println("Hacemos click al Impressive");
            Thread.sleep(1000);

            // Recogemos texto
            WebElement elemento2 = driver.findElement(By.xpath(config.getProperty("RecogerTexto")));
            String segundo_texto = elemento2.getText();
            System.out.println("Recogida de texto: " + segundo_texto);

            // Clicamos el Radio del No
            driver.findElement(By.xpath(config.getProperty("ClikNo"))).click();
            System.out.println("Hacemos click al No");
            Thread.sleep(1000);

            // Recogemos texto
            WebElement elemento3 = driver.findElement(By.xpath(config.getProperty("RecogerTexto")));
            String tercero_texto = elemento3.getText();
            System.out.println("Recogida de texto erroneo: " + tercero_texto);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Elements Web Tables")
    @Story("Elements")
    @Description("Rellenar Web Tables")
    //
    public void TC004_Elements4() throws InterruptedException, IOException {
        testId = "TC004_Elements4";

        //
        try {
            driver.get(config.getProperty("urlPrincipal"));
            System.out.println("Entramos a la pagina demoqa.com");
            driver.findElement(By.xpath(config.getProperty("elementos"))).click();
            System.out.println("Entramos a Elementos");
            driver.findElement(By.id("item-3")).click();
            System.out.println("Entramos a Web Tables");

            System.out.println("Creara 3 Usuarios");
            for (int i = 1; i <= 3; i++) {
                // Añadimos un user
                // Clicamos a ADD
                WebElement B_Add = driver.findElement(By.id("addNewRecordButton"));
                B_Add.click();
                Thread.sleep(500);
                // Rellenamos formulario

                WebElement Add_FirstN = driver.findElement(By.id("firstName"));
                Add_FirstN.sendKeys(Main.getTagValue("UserFullName_Web_Tables_TC_004", Main.doc) + i);
                Thread.sleep(500);

                WebElement Add_LastN = driver.findElement(By.id("lastName"));
                Add_LastN.sendKeys(Main.getTagValue("UserLastName_Web_Tables_TC_004", Main.doc) + i);

                WebElement Add_Email = driver.findElement(By.id("userEmail"));
                Add_Email.sendKeys(Main.getTagValue("UserEmailIncorrecto_Web_Tables_TC_004", Main.doc) + i);
                Thread.sleep(500);
                WebElement submit = driver.findElement(By.id("submit"));
                submit.click();
                Add_Email.clear();

                Add_Email.sendKeys(Main.getTagValue("UserEmailIncorrecto2_Web_Tables_TC_004", Main.doc));
                submit.click();
                Thread.sleep(500);
                Add_Email.clear();

                Add_Email.sendKeys(Main.getTagValue("UserEmailCorrecto_Web_Tables_TC_004", Main.doc));

                WebElement Add_Age = driver.findElement(By.id("age"));
                Add_Age.sendKeys(Main.getTagValue("UserAge_Web_Tables_TC_004", Main.doc));

                WebElement Add_Salary = driver.findElement(By.id("salary"));
                Add_Salary.sendKeys(Main.getTagValue("UserSalary_Web_Tables_TC_004", Main.doc));

                WebElement Add_Department = driver.findElement(By.id("department"));
                Add_Department.sendKeys(Main.getTagValue("UserDepartament_Web_Tables_TC_004", Main.doc));
                Thread.sleep(500);
                submit.click();
            }
            /*
             * // Buscamos Last Name
             * WebElement buscar = driver.findElement(By.id("searchBox"));
             * buscar.sendKeys("User");
             * Thread.sleep(1000);
             * for (int i = 0; i < 4; i++) {
             * buscar.sendKeys(Keys.BACK_SPACE);
             * }
             * Thread.sleep(1000);
             */
            // Ordenar
            WebElement O_first_name = driver.findElement(By.xpath(config.getProperty("OrdFir")));
            O_first_name.click();
            System.out.println("Clicaremos el First Name para ordenar ");
            O_first_name.click();
            System.out.println("Clicaremos el First Name para ordenar ");

            WebElement O_last_name = driver.findElement(By.xpath(config.getProperty("OrdLas")));
            O_last_name.click();
            System.out.println("Clicaremos el Last Name para ordenar ");
            O_last_name.click();
            System.out.println("Clicaremos el Last Name para ordenar ");

            WebElement O_age = driver.findElement(By.xpath(config.getProperty("OrdAge")));
            O_age.click();
            System.out.println("Clicaremos el Age para ordenar ");
            O_age.click();
            System.out.println("Clicaremos el Age para ordenar ");

            WebElement O_email = driver.findElement(By.xpath(config.getProperty("OrdEma")));
            O_email.click();
            System.out.println("Clicaremos el Email para ordenar ");
            O_email.click();
            System.out.println("Clicaremos el Email para ordenar ");

            WebElement O_Salary = driver.findElement(By.xpath(config.getProperty("Ordsal")));
            O_Salary.click();
            System.out.println("Clicaremos el Salario para ordenar ");
            O_Salary.click();
            System.out.println("Clicaremos el Salario para ordenar ");

            WebElement O_Department = driver.findElement(By.xpath(config.getProperty("OrdDep")));
            O_Department.click();
            System.out.println("Clicaremos el Departamento para ordenar ");
            O_Department.click();
            System.out.println("Clicaremos el Departamento para ordenar ");

            WebElement filas = driver.findElement(By.xpath(config.getProperty("Filas")));
            Select select = new Select(filas);
            select.selectByValue("5");
            System.out.println("Ponemos 5 rows");
            Thread.sleep(300);
            select.selectByValue("10");
            System.out.println("Ponemos 10 rows");
            Thread.sleep(300);
            select.selectByValue("20");
            System.out.println("Ponemos 20 rows");
            Thread.sleep(300);
            select.selectByValue("25");
            System.out.println("Ponemos 25 rows");
            Thread.sleep(300);
            select.selectByValue("50");
            System.out.println("Ponemos 50 rows");
            Thread.sleep(300);
            select.selectByValue("100");
            System.out.println("Ponemos 100 rows");
            Thread.sleep(300);

            // Editamos
            driver.findElement(By.xpath(config.getProperty("edit"))).click();
            System.out.println("Clicamos el editar");

            driver.findElement(By.xpath(config.getProperty("edFirst"))).clear();
            System.out.println("Editamos el First Name");

            driver.findElement(By.xpath(config.getProperty("edLast")))
                    .sendKeys(Main.getTagValue("EditarFirstName_Web_Tables_TC_004", Main.doc));
            Thread.sleep(500);

            driver.findElement(By.xpath(config.getProperty("edLast"))).clear();
            System.out.println("Editamos el Last Name ");
            driver.findElement(By.xpath(config.getProperty("edLast")))
                    .sendKeys(Main.getTagValue("EditarLastName_Web_Tables_TC_004", Main.doc));

            driver.findElement(By.xpath(config.getProperty("edEmail"))).clear();
            System.out.println("Editamos el Email");
            driver.findElement(By.xpath(config.getProperty("edEmail")))
                    .sendKeys(Main.getTagValue("EditarEmail_Web_Tables_TC_004", Main.doc));
            Thread.sleep(500);

            driver.findElement(By.xpath(config.getProperty("edAge"))).clear();
            System.out.println("Editamos el año");
            driver.findElement(By.xpath(config.getProperty("edAge")))
                    .sendKeys(Main.getTagValue("EditarAge_Web_Tables_TC_004", Main.doc));

            driver.findElement(By.xpath(config.getProperty("edSalary"))).clear();
            System.out.println("Editamos el salario");
            driver.findElement(By.xpath(config.getProperty("edSalary")))
                    .sendKeys(Main.getTagValue("EditarSalary_Web_Tables_TC_004", Main.doc));

            driver.findElement(By.xpath(config.getProperty("edDep"))).clear();
            System.out.println("Editamos el departamento");
            driver.findElement(By.xpath(config.getProperty("edDep")))
                    .sendKeys(Main.getTagValue("EditarDepart_Web_Tables_TC_004", Main.doc));

            System.out.println("Le damos a submit");
            WebElement E_Submit = driver.findElement(By.xpath(config.getProperty("submit")));
            E_Submit.click();
            Thread.sleep(500);

            // buscar.sendKeys("User");
            System.out.println("Borramos usuario");
            driver.findElement(By.xpath(config.getProperty("BorrarUser"))).click();
            Thread.sleep(500);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Elements buttons")
    @Story("Elements")
    @Description("Rellenar Buttons")
    //
    public void TC005_Elements5() throws InterruptedException, IOException {
        testId = "TC005_Elements5";

        //
        try {
            driver.get(config.getProperty("urlPrincipal"));
            System.out.println("Entramos a la pagina de demoqa.com");

            driver.findElement(By.xpath(config.getProperty("elementos"))).click();
            System.out.println("Entramos en Elements");

            driver.findElement(By.id("item-4")).click();
            System.out.println("Vamos al apartado Buttons");

            WebElement primer_boton = driver.findElement(By.id("doubleClickBtn"));
            Actions actions = new Actions(driver);
            actions.doubleClick(primer_boton).perform();
            System.out.println("Le damos doble click al primer boton");
            Thread.sleep(500);

            WebElement segundo_boton = driver.findElement(By.id("rightClickBtn"));
            actions.contextClick(segundo_boton).perform();
            System.out.println("Le damos click derecho al segundo boton");
            Thread.sleep(500);

            WebElement tercer_boton = wait
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(config.getProperty("ClickMe"))));
            tercer_boton.click();
            System.out.println("Le damos click al boton dinamico");
            Thread.sleep(500);

            WebElement primer_text = driver.findElement(By.xpath(config.getProperty("TextDobleClic")));
            WebElement segundo_text = driver.findElement(By.id("rightClickMessage"));
            WebElement tercer_texto = driver.findElement(By.id("dynamicClickMessage"));
            String texto = primer_text.getText();
            texto += " " + "\n" + segundo_text.getText();
            texto += " " + "\n" + tercer_texto.getText();
            System.out.println("Texto de los tres botones: " + texto);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Elements Upload and Download")
    @Story("Elements")
    @Description("Upload and Download")
    //
    public void TC006_Elements6() throws InterruptedException, IOException {
        testId = "TC006_Elements6";

        //
        try {
            driver.get(config.getProperty("urlPrincipal"));

            WebElement menu = driver.findElement(By.xpath(config.getProperty("elementos")));
            menu.click();

            WebElement Upload_donwload = driver.findElement(By.id("item-7"));
            Upload_donwload.click();
            Thread.sleep(500);

            WebElement download_btn = driver.findElement(By.id("downloadButton"));
            download_btn.click();

            WebElement subir_archivo = driver.findElement(By.id("uploadFile"));
            // Escribimos la ruta de nuestro archivo
            subir_archivo.sendKeys(Main.getTagValue("Archivo_Upload_Download_TC_006", Main.doc));
            Thread.sleep(500);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @SuppressWarnings("deprecation")
    @Test(description = "Prueba DemoQA Elements Dynamic Properties")
    @Story("Elements")
    @Description("Dynamic Properties")
    //
    public void TC007_Elements7() throws InterruptedException, IOException {
        testId = "TC007_Elements7";

        //
        try {
            driver.get(config.getProperty("urlPrincipal"));

            WebElement menu = driver.findElement(By.xpath(config.getProperty("elementos")));
            menu.click();

            WebElement Upload_donwload = driver.findElement(By.id("item-8"));
            Upload_donwload.click();
            Thread.sleep(500);

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement primer_boton = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
            primer_boton.click();

            WebElement color_boton = driver.findElement(By.id("colorChange"));
            Thread.sleep(500);
            color_boton.click();
            Thread.sleep(500);
            String color = color_boton.getCssValue("color");
            System.out.println("Este es el color : " + color);

            WebElement boton_visible = driver.findElement(By.id("visibleAfter"));
            boton_visible.click();
            Thread.sleep(500);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

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
                    .sendKeys(Main.getTagValue("UserFirstName_Practice_Forms_TC_008", Main.doc));
            driver.findElement(By.id("lastName"))
                    .sendKeys(Main.getTagValue("UserLastName_Practice_Forms_TC_008", Main.doc));
            WebElement email = driver.findElement(By.id("userEmail"));

            WebElement submit = driver.findElement(By.id("submit"));

            // Para hace scroll
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            Thread.sleep(500);

            // verificar que el correo es erroneo
            email.sendKeys(Main.getTagValue("UserEmailIncorrecto_Practice_Forms_TC_008", Main.doc));
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            submit.click();

            Thread.sleep(500);

            email.clear();
            email.sendKeys(Main.getTagValue("UserEmailIncorrecto2_Practice_Forms_TC_008", Main.doc));

            Thread.sleep(500);
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            submit.click();

            Thread.sleep(500);
            email.clear();
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            email.sendKeys(Main.getTagValue("UserEmailCorrecto_Practice_Forms_TC_008", Main.doc));
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
            driver.findElement(By.id("userNumber")).sendKeys(Main.getTagValue("Movil_Practice_Forms_TC_008", Main.doc));

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
            driver.findElement(By.xpath(config.getProperty("Subject")))
                    .sendKeys(Main.getTagValue("SubjectMath_Practice_Froms_TC_008", Main.doc));
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath(config.getProperty("Subject")))
                    .sendKeys(Main.getTagValue("SubjectAccounting_Practice_Forms_TC_008", Main.doc));
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath(config.getProperty("Subject")))
                    .sendKeys(Main.getTagValue("SubjectArts_Practice_Forms_TC_008", Main.doc));
            driver.findElement(By.xpath(config.getProperty("Subject"))).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath(config.getProperty("Subject")))
                    .sendKeys(Main.getTagValue("SubjectSoci_Practice_Forms_TC_008", Main.doc));
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
            subir_archivo.sendKeys(Main.getTagValue("SubirArchivo_Practice_Froms_TC_008", Main.doc));
            Thread.sleep(1000);

            // Current Addres
            driver.findElement(By.id("currentAddress"))
                    .sendKeys(Main.getTagValue("CurrentAddress_Practice_Forms_TC_008", Main.doc));
            // State and City
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            driver.findElement(By.id("react-select-3-input"))
                    .sendKeys(Main.getTagValue("State_Practice_Froms_TC_008", Main.doc));
            driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            driver.findElement(By.id("react-select-4-input"))
                    .sendKeys(Main.getTagValue("City_Practice_Froms_TC_008", Main.doc));
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

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Browser Windows")
    @Story("Alerts, Frame & Windows")
    @Description("Browser Windows")
    //
    public void TC009_Alerts_Frame_Windows9() throws InterruptedException, IOException {
        testId = "TC009_Alerts_Frame_&_Windows9";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));

            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);

            // Entramos al primer item (Browser Windows)
            driver.findElement(By.xpath(config.getProperty("Browser_windows"))).click();
            Thread.sleep(1000);

            // Guardamos el identificador de la ventana original
            String originalWindow = driver.getWindowHandle();

            // Acción con el primer botón: Abrir nueva pestaña
            WebElement botonNuevaPestaña = driver.findElement(By.id("tabButton"));
            botonNuevaPestaña.click();
            Thread.sleep(2000);

            // Obtener todos los identificadores de ventanas/pestañas
            Set<String> allWindows = driver.getWindowHandles();
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    // Cambiamos a la nueva pestaña
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            // Cerramos la nueva pestaña
            driver.close();
            Thread.sleep(2000);

            // Volver a la ventana original
            driver.switchTo().window(originalWindow);

            // Acción con el segundo botón: Abrir nueva ventana
            WebElement botonNuevaVentana = driver.findElement(By.id("windowButton"));
            botonNuevaVentana.click();
            Thread.sleep(2000);

            // Obtener nuevamente todos los identificadores de ventanas
            allWindows = driver.getWindowHandles();
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    // Cambiamos a la nueva ventana
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            // Cerramos la nueva ventana
            driver.close();
            Thread.sleep(2000);

            // Volver a la ventana original
            driver.switchTo().window(originalWindow);

            WebElement botonNuevaVentana2 = driver.findElement(By.id("messageWindowButton"));
            botonNuevaVentana2.click();
            Thread.sleep(2000);

            // Obtener nuevamente todos los identificadores de ventanas
            allWindows = driver.getWindowHandles();
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    // Cambiamos a la nueva ventana
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            // Cerramos la nueva ventana
            driver.close();
            Thread.sleep(2000);

            // Volver a la ventana original
            driver.switchTo().window(originalWindow);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Alerts")
    @Story("Alerts, Frame & Windows")
    @Description("Alerts")
    //
    public void TC010_Alerts_Frame_Windows10() throws InterruptedException, IOException {
        testId = "TC010_Alerts,_Frame_&_Windows10";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("ItemAlerts"))).click();
            Thread.sleep(1000);

            // Primer boton
            driver.findElement(By.id("alertButton")).click();
            Thread.sleep(500);
            driver.switchTo().alert().accept();

            // Segundo boton
            driver.findElement(By.id("timerAlertButton")).click();
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
            Thread.sleep(500);

            // Tercer boton
            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(1000);
            driver.switchTo().alert().dismiss();
            Thread.sleep(1000);
            // Cuarto boton
            // Le do al acceptar

            // Hacer clic en el botón que abre la alerta
            driver.findElement(By.xpath(config.getProperty("PromBoton"))).click();
            Thread.sleep(1000);

            // Cambiar el foco a la alerta y enviar el texto
            Alert promptAlert = driver.switchTo().alert();
            promptAlert.sendKeys(Main.getTagValue("MensajePromp_Alerts_TC_010", Main.doc));

            Thread.sleep(1000);
            // Aceptar la alerta
            driver.switchTo().alert().accept();

            // Para la acción de cancelar
            driver.findElement(By.xpath(config.getProperty("PromBoton"))).click();
            Thread.sleep(1000);

            // Cambiar el foco a la alerta nuevamente y enviar el texto
            driver.switchTo().alert().sendKeys(Main.getTagValue("MensajePromp_Alerts_TC_010", Main.doc));

            // Cancelar la alerta
            driver.switchTo().alert().dismiss();
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Frames")
    //
    public void TC011_Alerts_Frame_Windows11() throws InterruptedException, IOException {
        testId = "TC011_Alerts_Frame_&_Windows11";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("Frames"))).click();
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");
            // Entrar al primer Frame y coger el texto.
            driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

            WebElement h1Element = driver.findElement(By.tagName("h1"));
            Thread.sleep(1000);
            String h1Text = h1Element.getText();
            System.out.println("El texto del h1 es: " + h1Text);

            driver.switchTo().defaultContent();
            // Entrar al primer Frame y coger el texto.
            driver.switchTo().frame(driver.findElement(By.id("frame2")));

            // Buscar el h1 dentro del segundo iframe y obtener su texto
            WebElement h1Element2 = driver.findElement(By.tagName("h1"));
            String h1Text2 = h1Element2.getText();
            System.out.println("El texto del h1 en el segundo iframe es: " + h1Text2);

            // Volver al contenido principal
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Nested Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Nested Frames")
    //
    public void TC012_Alerts_Frame_Windows12() throws InterruptedException, IOException {
        testId = "TC012_Alerts_Frame_&_Windows12";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("Nasted_Frames"))).click();
            Thread.sleep(1000);
            // Entrar al primer Frame y coger el texto.
            driver.switchTo().frame(driver.findElement(By.id("frame1")));
            WebElement primer = driver.findElement(By.xpath(config.getProperty("Nasted_Body")));
            System.out.println("Texto padre: " + primer.getText());
            // Entrar al segundo frame y coger el texto.
            driver.switchTo().frame(driver.findElements(By.xpath(config.getProperty("segundo_Frame"))).get(0));
            WebElement segundo = driver.findElement(By.xpath(config.getProperty("Nasted_p")));
            System.out.println("Texto hijo: " + segundo.getText());
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Modal Dialogs")
    @Story("Alerts, Frame & Windows")
    @Description("Modal Dialogs")
    //
    public void TC013_Alerts_Frame_Windows13() throws InterruptedException, IOException {
        testId = "TC013_Alerts_Frame_&_Windows13";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("ModalDia"))).click();
            Thread.sleep(1000);
            // Entrar al primer boton y coger el texto.
            driver.findElement(By.id("showSmallModal")).click();
            Thread.sleep(1000);
            WebElement Primer_texto = driver.findElement(By.xpath(config.getProperty("PrimerTextoModal")));
            String texto1 = Primer_texto.getText();
            System.out.println("Small modal: " + texto1);
            // Cerrar alerta
            driver.findElement(By.id("closeSmallModal")).click();
            // Entramos al segundo boton y cogemos el texto
            driver.findElement(By.id("showLargeModal")).click();
            Thread.sleep(1000);
            WebElement Segund_texto = driver.findElement(By.xpath(config.getProperty("SegundoTextoModal")));
            String texto2 = Segund_texto.getText();
            System.out.println("Large modal : " + texto2);
            // Cerrar alerta
            driver.findElement(By.id("closeLargeModal")).click();

            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Data Picker")
    @Story("Widgets")
    @Description("Data Picker")
    //
    public void TC014_Widgets14() throws InterruptedException, IOException {
        testId = "TC014_Widgets_14";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("DataPicker"))).click();
            Thread.sleep(1000);
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");
            //
            driver.findElement(By.id("datePickerMonthYearInput")).click();
            // Elegir año
            WebElement fecha_a = driver.findElement(By.xpath(config.getProperty("FechaAnyo")));
            Select select_a = new Select(fecha_a);
            select_a.selectByValue("2004");
            Thread.sleep(500);

            // Elegimos el mes
            WebElement fecha_m = driver.findElement(By.xpath(config.getProperty("FechaMes")));
            Select select_m = new Select(fecha_m);
            select_m.selectByValue("6");
            Thread.sleep(500);
            // Elegimos dia
            driver.findElement(By.xpath(config.getProperty("FechaDia"))).click();

            // Segundo Date
            driver.findElement(By.id("dateAndTimePickerInput")).click();
            // Desplegamos el año
            WebElement desplegable_2_a = driver.findElement(By.xpath(config.getProperty("DesplegableData1")));
            desplegable_2_a.click();
            for (int i = 0; i < 15; i++) {
                driver.findElement(By.xpath(config.getProperty("FlechaAbajo"))).click();
            }
            // Escogemos el año
            driver.findElement(By.xpath(config.getProperty("ElegirAnyo"))).click();
            Thread.sleep(500);

            // Elegimos el mes
            driver.findElement(By.xpath(config.getProperty("DesplegarMes"))).click();
            driver.findElement(By.xpath(config.getProperty("ElegirMes"))).click();
            Thread.sleep(500);
            // Elegimos dia
            driver.findElement(By.xpath(config.getProperty("ElegirDia"))).click();
            // Elegimos la hora

            driver.findElement(By.xpath(config.getProperty("ElegirHora"))).click();

            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Slider")
    @Story("Widgets")
    @Description("Slider")
    //
    public void TC015_Widgets15() throws InterruptedException, IOException {
        testId = "TC015_Widgets15";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Widgets
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("Slider"))).click();
            Thread.sleep(1000);
            // Clicamos el slider
            WebElement slider = driver.findElement(By.xpath(config.getProperty("SliderBar")));
            slider.click();
            // Movemos a la izquierda
            for (int i = 0; i < 50; i++) {
                slider.sendKeys(Keys.ARROW_LEFT);
            }
            // Movemos a la derecha
            for (int i = 0; i < 100; i++) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Slider")
    @Story("Widgets")
    @Description("Progres Bar")
    //
    public void TC016_Widgets16() throws InterruptedException, IOException {
        testId = "TC016_Widgets16";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            WebElement entrar = driver.findElement(By.xpath(config.getProperty("ProgressBar")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", entrar);
            entrar.click();
            Thread.sleep(1000);
            // Le damos click
            driver.findElement(By.id("startStopButton")).click();
            // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(5000);
            driver.findElement(By.id("startStopButton")).click();
            Thread.sleep(990);
            driver.findElement(By.id("startStopButton")).click();
            Thread.sleep(6000);
            driver.findElement(By.id("resetButton")).click();
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Menu")
    @Story("Widgets")
    @Description("Menu")
    //
    public void TC017_Widgets17() throws InterruptedException, IOException {
        testId = "TC017_Widgets17";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            WebElement entrar = driver.findElement(By.xpath(config.getProperty("Menu")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", entrar);
            entrar.click();
            Thread.sleep(500);
            // Le damos click Main 1
            driver.findElement(By.xpath(config.getProperty("Item1Menu"))).click();
            Thread.sleep(500);
            // Le damos click Main 3
            driver.findElement(By.xpath(config.getProperty("Item3Menu"))).click();
            Thread.sleep(500);
            // Le damos click Main 2
            driver.findElement(By.xpath(config.getProperty("Item2Menu"))).click();
            Thread.sleep(500);
            // Le damos click sub item
            driver.findElement(By.xpath(config.getProperty("Subitem1"))).click();
            Thread.sleep(500);
            // Le damos click sub item
            driver.findElement(By.xpath(config.getProperty("SubItem2"))).click();
            Thread.sleep(500);
            // Le damos click Sub sub list
            driver.findElement(By.xpath(config.getProperty("SubSubItem"))).click();
            Thread.sleep(500);
            // Le damos click Sub sub list 1
            driver.findElement(By.xpath(config.getProperty("SubSubItem1"))).click();
            Thread.sleep(500);
            // Le damos click Sub sub list 2
            driver.findElement(By.xpath(config.getProperty("SubSubItem2"))).click();
            Thread.sleep(500);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Select Menu")
    @Story("Widgets")
    @Description("Select Menu")
    //
    public void TC018_Widgets18() throws InterruptedException, IOException {
        testId = "TC018_Widgets18";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            WebElement entrar = driver.findElement(By.xpath(config.getProperty("SelectMenu")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", entrar);
            entrar.click();
            // Introducios texto en el primer campo
            Thread.sleep(500);
            driver.findElement(By.id("react-select-2-input"))
                    .sendKeys(Main.getTagValue("PrimeraOpcionOption_Select_Menu_TC_018", Main.doc) + Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.id("react-select-2-input"))
                    .sendKeys(Main.getTagValue("SegundaOpcionOption_Select_Menu_TC_018", Main.doc) + Keys.ENTER);
            Thread.sleep(500);

            // Introducimos texto en el segundo campo
            driver.findElement(By.id("react-select-3-input"))
                    .sendKeys(Main.getTagValue("PrimeraOpcionTitle_Select_Menu_TC_018", Main.doc) + Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.id("react-select-3-input"))
                    .sendKeys(Main.getTagValue("SegundaOpcionTilte_Select_Menu_TC_018", Main.doc) + Keys.ENTER);

            // Elegimos color
            driver.findElement(By.xpath(config.getProperty("PrimerColor"))).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(config.getProperty("SegundoColor"))).click();
            Thread.sleep(500);

            // Seleccion multiple
            WebElement seleccionMultiple = driver.findElement(By.id("react-select-4-input"));
            js.executeScript("arguments[0].scrollIntoView(true);", seleccionMultiple);
            seleccionMultiple.sendKeys(Main.getTagValue("PrimerColor_Select_Menu_TC_018", Main.doc) + Keys.ENTER);
            seleccionMultiple.sendKeys(Main.getTagValue("SegundoColor_Select_Menu_TC_018", Main.doc) + Keys.ENTER);
            seleccionMultiple.sendKeys(Main.getTagValue("TercerColor_Select_Menu_TC_018", Main.doc) + Keys.ENTER);
            seleccionMultiple.sendKeys(Main.getTagValue("CuartoColor_Select_Menu_TC_018", Main.doc) + Keys.ENTER);
            Thread.sleep(500);
            // Le damos a la cruz
            driver.findElement(By.xpath(config.getProperty("Cruz"))).click();
            Thread.sleep(1000);

            // Le damos al Standar multi select
            Actions actions = new Actions(driver);

            WebElement multiSelectVolvo = driver.findElement(By.xpath("//*[@id='cars']/option[1]"));
            WebElement multiSelectAudi = driver.findElement(By.xpath("//*[@id='cars']/option[4]"));
            // Accion con el control
            actions.keyDown(Keys.CONTROL)
                    .click(multiSelectVolvo)
                    .click(multiSelectAudi)
                    .keyUp(Keys.CONTROL)
                    .build()
                    .perform();
            Thread.sleep(1000);
            // Accion con el shift
            actions.keyDown(Keys.SHIFT)
                    .click(multiSelectVolvo)
                    .click(multiSelectAudi)
                    .keyUp(Keys.SHIFT)
                    .build()
                    .perform();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
//
