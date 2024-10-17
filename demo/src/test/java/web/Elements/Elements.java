package web.Elements;


import java.io.IOException;


//
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
//

public class Elements extends web.Main {
    //

    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    public void TC001_Elements1() throws InterruptedException, IOException {
        testId = "TC001_Elements1";

        // Cargar el archivo JSON en lugar de "/data.json"
        web.Main.loadJSON("src\\test\\java\\web\\selenium.json");

        try {

            driver.get(config.getProperty("urlPrincipal"));
            System.out.println("Entramos a la pagina demoqa.com");

            driver.findElement(By.xpath(config.getProperty("elementos"))).click();
            System.out.println("Entramos en Elementos");

            driver.findElement(By.id("item-0")).click();
            System.out.println("Entramos en el Text Box");

            // Usar JSON para rellenar el campo de Full Name
            driver.findElement(By.id("userName")).sendKeys(web.Main.getJSONValue("TC_001", "fullNameText_TC_001"));
            System.out.println("Escribimos en Full Name ");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 600);");

            WebElement input_email = driver.findElement(By.id("userEmail"));

            // Usar JSON para el campo email incorrecto
            input_email.sendKeys(web.Main.getJSONValue("TC_001", "EmailincorrectoText_TC_001"));
            System.out.println("Escribimos en email de forma incorrecta");

            WebElement B_submit = driver.findElement(By.id("submit"));
            B_submit.click();
            System.out.println("Le damos al submit");

            Thread.sleep(500);
            input_email.clear();

            // Usar JSON para el campo email incorrecto 2
            input_email.sendKeys(web.Main.getJSONValue("TC_001", "Emailincorrecto2Text_TC_001"));
            System.out.println("Escribimos en email de forma incorrecta");

            B_submit.click();
            System.out.println("Le damos al submit");

            Thread.sleep(500);
            input_email.clear();

            // Usar JSON para el campo email correcto
            input_email.sendKeys(web.Main.getJSONValue("TC_001", "EmailCorrectoText_TC_001"));
            System.out.println("Escribimos en email de forma correcta");

            // Usar JSON para las direcciones
            driver.findElement(By.id("currentAddress"))
                .sendKeys(web.Main.getJSONValue("TC_001", "CurrentAddressText_TC_001"));
            System.out.println("Escribimos en el current Address");

            driver.findElement(By.id("permanentAddress"))
                .sendKeys(web.Main.getJSONValue("TC_001", "PermanentAddressText_TC_001"));
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
                Add_FirstN.sendKeys(web.Main.getTagValue("UserFullName_Web_Tables_TC_004", web.Main.doc) + i);
                Thread.sleep(500);

                WebElement Add_LastN = driver.findElement(By.id("lastName"));
                Add_LastN.sendKeys(web.Main.getTagValue("UserLastName_Web_Tables_TC_004", web.Main.doc) + i);

                WebElement Add_Email = driver.findElement(By.id("userEmail"));
                Add_Email.sendKeys(web.Main.getTagValue("UserEmailIncorrecto_Web_Tables_TC_004", web.Main.doc) + i);
                Thread.sleep(500);
                WebElement submit = driver.findElement(By.id("submit"));
                submit.click();
                Add_Email.clear();

                Add_Email.sendKeys(web.Main.getTagValue("UserEmailIncorrecto2_Web_Tables_TC_004", web.Main.doc));
                submit.click();
                Thread.sleep(500);
                Add_Email.clear();

                Add_Email.sendKeys(web.Main.getTagValue("UserEmailCorrecto_Web_Tables_TC_004", web.Main.doc));

                WebElement Add_Age = driver.findElement(By.id("age"));
                Add_Age.sendKeys(web.Main.getTagValue("UserAge_Web_Tables_TC_004", web.Main.doc));

                WebElement Add_Salary = driver.findElement(By.id("salary"));
                Add_Salary.sendKeys(web.Main.getTagValue("UserSalary_Web_Tables_TC_004", web.Main.doc));

                WebElement Add_Department = driver.findElement(By.id("department"));
                Add_Department.sendKeys(web.Main.getTagValue("UserDepartament_Web_Tables_TC_004", web.Main.doc));
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
                    .sendKeys(web.Main.getTagValue("EditarFirstName_Web_Tables_TC_004", web.Main.doc));
            Thread.sleep(500);

            driver.findElement(By.xpath(config.getProperty("edLast"))).clear();
            System.out.println("Editamos el Last Name ");
            driver.findElement(By.xpath(config.getProperty("edLast")))
                    .sendKeys(web.Main.getTagValue("EditarLastName_Web_Tables_TC_004", web.Main.doc));

            driver.findElement(By.xpath(config.getProperty("edEmail"))).clear();
            System.out.println("Editamos el Email");
            driver.findElement(By.xpath(config.getProperty("edEmail")))
                    .sendKeys(web.Main.getTagValue("EditarEmail_Web_Tables_TC_004", web.Main.doc));
            Thread.sleep(500);

            driver.findElement(By.xpath(config.getProperty("edAge"))).clear();
            System.out.println("Editamos el año");
            driver.findElement(By.xpath(config.getProperty("edAge")))
                    .sendKeys(web.Main.getTagValue("EditarAge_Web_Tables_TC_004", web.Main.doc));

            driver.findElement(By.xpath(config.getProperty("edSalary"))).clear();
            System.out.println("Editamos el salario");
            driver.findElement(By.xpath(config.getProperty("edSalary")))
                    .sendKeys(web.Main.getTagValue("EditarSalary_Web_Tables_TC_004", web.Main.doc));

            driver.findElement(By.xpath(config.getProperty("edDep"))).clear();
            System.out.println("Editamos el departamento");
            driver.findElement(By.xpath(config.getProperty("edDep")))
                    .sendKeys(web.Main.getTagValue("EditarDepart_Web_Tables_TC_004", web.Main.doc));

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

            WebElement tercer_boton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(config.getProperty("ClickMe"))));
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
            subir_archivo.sendKeys(web.Main.getTagValue("Archivo_Upload_Download_TC_006", web.Main.doc));
            Thread.sleep(500);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

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
}