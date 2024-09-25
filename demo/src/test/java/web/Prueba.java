package web;
import java.io.IOException;

import org.openqa.selenium.Alert;
//
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import java.util.concurrent.TimeUnit;
//
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
//
public class Prueba extends Main {
    //
    @Test(description = "Prueba DemoQA Elements Text box")
    @Story("Elements")
    @Description("Rellenar textbox")
    //
    public void TC001_Elements1() throws InterruptedException, IOException {
        testId = "TC001_Elements1";
        
        //
        try{
            driver.get("https://demoqa.com");

            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            
            WebElement text_box = driver.findElement(By.id("item-0"));
            text_box.click();

            WebElement input_name = driver.findElement(By.id("userName"));
            input_name.sendKeys("User");

            WebElement input_email = driver.findElement(By.id("userEmail"));
            input_email.sendKeys("User");

            WebElement B_submit = driver.findElement(By.id("submit"));
            B_submit.click();
            Thread.sleep(1000);
            input_email.clear();

            input_email.sendKeys("User@");
            B_submit.click();
            Thread.sleep(1000);
            input_email.clear();

            input_email.sendKeys("User@gmail.com");
            WebElement input_current = driver.findElement(By.id("currentAddress"));
            input_current.sendKeys("Current Address");

            WebElement input_permanent  = driver.findElement(By.id("permanentAddress"));
            input_permanent.sendKeys("Permanent Address");
            B_submit.click();   
            Thread.sleep(1000);

            // Recoger el texto
            WebElement elemento = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
            String texto = elemento.getText();
            System.out.println("Recogida de texto: " + texto);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            driver.get("https://demoqa.com");

            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            
            WebElement check_box = driver.findElement(By.id("item-1"));
            check_box.click();
            Thread.sleep(500);
            //Desplegar todo
            WebElement Home = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']//button"));
            Home.click();
            
            WebElement Desktop = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed'][1]//button"));
            Desktop.click();
            
            WebElement Documents = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed'][1]//button"));
            Documents.click();

            WebElement Downloads = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
            Downloads.click();
            
            WebElement WorkSpace = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed'][1]//button"));
            WorkSpace.click();

            WebElement Office = driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed'][1]//button"));
            Office.click();
            Thread.sleep(500);

            // Clicamos al check
            // Clicamos el Home 
            WebElement Chome = driver.findElement(By.xpath("//*[@id='tree-node']//span//span[1]"));
            Chome.click();
            Thread.sleep(1000);
            Chome.click();
            Thread.sleep(500);

            // Clicamos el Desktop
            WebElement Cdesktop = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/label/span[1]"));
            Cdesktop.click();
            Thread.sleep(500);
            Cdesktop.click();
            Thread.sleep(500);

            // Clicamos el Documents
            WebElement CDocumts = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/label/span[1]"));
            CDocumts.click();
            Thread.sleep(500);
            CDocumts.click();
            Thread.sleep(500);

            // Clicamos el Downloads 
            WebElement Cdownloads = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/label/span[1]"));
            Cdownloads.click();
            Thread.sleep(500);
            Cdownloads.click();
            Thread.sleep(500);

            // Clicamos el WorkSpace 
            WebElement Cworkspace = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]"));
            Cworkspace.click();
            Thread.sleep(500);
            Cworkspace.click();
            Thread.sleep(500);
            
            // Clicamos el Office
            WebElement Coffice = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]"));
            Coffice.click();
            Thread.sleep(500);
            Coffice.click();
            Thread.sleep(500);

            // Clicamos en Notes 
            WebElement Cnotes = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
            Cnotes.click();
            Thread.sleep(500);
            Cnotes.click();
            Thread.sleep(500);

            // Clicamos en Command 
            WebElement Ccommand = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
            Ccommand.click();
            Thread.sleep(500);
            Ccommand.click();
            Thread.sleep(500);

            // Clicamos en React
            WebElement Creact = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
            Creact.click();
            Thread.sleep(500);
            Creact.click();
            Thread.sleep(500);

            // Clicamos en Angular
            WebElement Cangular = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]"));
            Cangular.click();
            Thread.sleep(500);
            Cangular.click();
            Thread.sleep(500);

            // Clicmaos en Veu
            WebElement Cveu = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]"));
            Cveu.click();
            Thread.sleep(500);
            Cveu.click();
            Thread.sleep(500);

            // Clicamos en Public
            WebElement Cpublic = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
            Cpublic.click();
            Thread.sleep(500);
            Cpublic.click();
            Thread.sleep(500);

            // Clicamos en Private
            WebElement Cprivate = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]"));
            Cprivate.click();
            Thread.sleep(500);
            Cprivate.click();
            Thread.sleep(500);

            // Clicamos en Classified
            WebElement Cclassified = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]"));
            Cclassified.click();
            Thread.sleep(500);
            Cclassified.click();
            Thread.sleep(500);

            // Clicamos en General
            WebElement Cgeneral = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"));
            Cgeneral.click();
            Thread.sleep(500);
            Cgeneral.click();
            Thread.sleep(500);

            // Clicamos en Word File.doc
            WebElement Cword = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
            Cword.click();
            Thread.sleep(500);
            Cword.click();
            Thread.sleep(500);

            // Clicamos en Excel File.doc
            WebElement Cexcel = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
            Cexcel.click();
            Thread.sleep(500);
            Cexcel.click();
            Thread.sleep(500);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            driver.get("https://demoqa.com");

            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(500);
            
            WebElement radio_button = driver.findElement(By.id("item-2"));
            radio_button.click();
            Thread.sleep(500);

            // Clicamos el Radio del Yes
            WebElement R_yes = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[2]/label"));
            R_yes.click();
            Thread.sleep(1000);

            // Recogemos texto
            WebElement elemento = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/p/span"));
            String primer_texto = elemento.getText();
            System.out.println("Recogida de texto: " + primer_texto);

            // Clicamos el Radio del Yes
            WebElement R_impressive = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/label"));
            R_impressive.click();
            Thread.sleep(1000);

            // Recogemos texto
            WebElement elemento2 = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/p/span"));
            String segundo_texto = elemento2.getText();
            System.out.println("Recogida de texto: " + segundo_texto);

            // Clicamos el Radio del Yes
            WebElement R_no = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[4]/label"));
            R_no.click();
            Thread.sleep(1000);

            // Recogemos texto
            WebElement elemento3 = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/p/span"));
            String tercero_texto = elemento3.getText();
            System.out.println("Recogida de texto: " + tercero_texto);
            

        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            driver.get("https://demoqa.com");

            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            
            WebElement web_tables = driver.findElement(By.id("item-3"));
            web_tables.click();

            
            
            
            for (int i=1;i<7;i++){
                // Añadimos un user
                //Clicamos a ADD
                WebElement B_Add = driver.findElement(By.id("addNewRecordButton"));
                B_Add.click();
                Thread.sleep(500);
                // Rellenamos formulario

                WebElement Add_FirstN = driver.findElement(By.id("firstName"));
                Add_FirstN.sendKeys("FUser" + i);
                Thread.sleep(500);

                WebElement Add_LastN = driver.findElement(By.id("lastName"));
                Add_LastN.sendKeys("LUser" + i);
    
                WebElement Add_Email = driver.findElement(By.id("userEmail"));
                Add_Email.sendKeys("User" + i);
                Thread.sleep(500);
                WebElement submit = driver.findElement(By.id("submit"));
                submit.click();
                Add_Email.clear();
                
                Add_Email.sendKeys("User"+ i +"@");
                submit.click();
                Thread.sleep(500);
                Add_Email.clear();

                Add_Email.sendKeys("User"+ i +"@gmail.com");

                WebElement Add_Age = driver.findElement(By.id("age"));
                Add_Age.sendKeys("2"+i);

                WebElement Add_Salary = driver.findElement(By.id("salary"));
                Add_Salary.sendKeys("2"+i+"00");

                WebElement Add_Department = driver.findElement(By.id("department"));
                Add_Department.sendKeys("department"+i);
                Thread.sleep(500);
                submit.click();
            }
            

            

            
            
            // Buscamos Last Name
            WebElement buscar = driver.findElement(By.id("searchBox"));
            buscar.sendKeys("User");
            Thread.sleep(1000);
            buscar.clear();
            Thread.sleep(1000);

            

            // Editamos 
            WebElement editar = driver.findElement(By.xpath("//*[@id='edit-record-4']"));
            editar.click();
            Thread.sleep(1000);
            
            WebElement Edit_FirstN = driver.findElement(By.xpath("//*[@id='firstName']"));
            Edit_FirstN.clear();
            Thread.sleep(1000);

            Edit_FirstN.sendKeys("Kevin");
            Thread.sleep(1000);

            WebElement Edit_LastN = driver.findElement(By.xpath("//*[@id='lastName']"));
            Edit_LastN.clear();
            Edit_LastN.sendKeys("Riese");

            WebElement Edit_Email = driver.findElement(By.xpath("//*[@id='userEmail']"));
            Edit_Email.clear();
            Edit_Email.sendKeys("Kevin@gmail.com");
            Thread.sleep(500);

            WebElement Edit_Age = driver.findElement(By.xpath("//*[@id='age']"));
            Edit_Age.clear();
            Edit_Age.sendKeys("20");

            WebElement Edit_Salary = driver.findElement(By.xpath("//*[@id='salary']"));
            Edit_Salary.clear();
            Edit_Salary.sendKeys("2000");

            WebElement Edit_Department = driver.findElement(By.xpath("//*[@id='department']"));
            Edit_Department.clear();
            Edit_Department.sendKeys("IA");
            WebElement E_Submit = driver.findElement(By.xpath("//*[@id='submit']"));
            E_Submit.click();
            Thread.sleep(1000);

            buscar.sendKeys("User");

            WebElement borrar = driver.findElement(By.xpath("//*[@id='delete-record-5']"));
            Thread.sleep(1000);
            borrar.click();
            Thread.sleep(2000);

            // Ordenar
            WebElement O_first_name = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[1]"));
            O_first_name.click();

            O_first_name.click();

            WebElement O_last_name = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[1]"));
            O_last_name.click();

            O_last_name.click();

            WebElement O_age = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[1]"));
            O_age.click();

            O_age.click();

            WebElement O_email = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]/div[1]"));
            O_email.click();

            O_email.click();

            WebElement O_Salary = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[5]/div[1]"));
            O_Salary.click();

            O_Salary.click();

            WebElement O_Department = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[6]/div[1]"));
            O_Department.click();

            O_Department.click();
            Thread.sleep(1000);

            WebElement filas = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select"));
            Select select = new Select(filas);
            select.selectByValue("5");
            Thread.sleep(500);
            select.selectByValue("10");
            Thread.sleep(500);
            select.selectByValue("20");
            Thread.sleep(500);
            select.selectByValue("25");
            Thread.sleep(500);
            select.selectByValue("50");
            Thread.sleep(500);
            select.selectByValue("100");
            Thread.sleep(500);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            driver.get("https://demoqa.com");

            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            
            WebElement buttons = driver.findElement(By.id("item-4"));
            buttons.click();

            WebElement primer_boton = driver.findElement(By.id("doubleClickBtn"));

            Actions actions = new Actions(driver);

            actions.doubleClick(primer_boton).perform();
            Thread.sleep(500);

            WebElement segundo_boton = driver.findElement(By.id("rightClickBtn"));

            actions.contextClick(segundo_boton).perform();
            Thread.sleep(500);

            WebElement tercer_boton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click Me']")));

            tercer_boton.click();
            Thread.sleep(500);
            
            WebElement primer_text = driver.findElement(By.xpath("//*[@id='doubleClickMessage']"));
            WebElement segundo_text = driver.findElement(By.id("rightClickMessage"));
            WebElement tercer_texto = driver.findElement(By.id("dynamicClickMessage"));
            String texto = primer_text.getText();
            texto +=" "+"\n"+ segundo_text.getText();
            texto +=" "+"\n"+tercer_texto.getText();
            System.out.println("Texto: " + texto);
            

        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            driver.get("https://demoqa.com");

            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            
            WebElement Upload_donwload = driver.findElement(By.id("item-7"));
            Upload_donwload.click();
            Thread.sleep(1000);

            WebElement download_btn = driver.findElement(By.id("downloadButton"));
            download_btn.click();
            

            WebElement subir_archivo = driver.findElement(By.id("uploadFile"));
            // Escribimos la ruta de nuestro archivo
            subir_archivo.sendKeys("C:\\Users\\kevin.riese.ext\\Downloads\\FOODTURE.png");
            Thread.sleep(1000);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            driver.get("https://demoqa.com");

            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            
            WebElement Upload_donwload = driver.findElement(By.id("item-8"));
            Upload_donwload.click();
            Thread.sleep(1000);
            
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement primer_boton = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
            primer_boton.click();


            WebElement color_boton = driver.findElement(By.id("colorChange"));
            Thread.sleep(500);
            color_boton.click();
            Thread.sleep(500);
            String color = color_boton.getCssValue("color");
            System.out.println("Este es el color : "+ color);
           
            WebElement boton_visible = driver.findElement(By.id("visibleAfter"));
            boton_visible.click();
            Thread.sleep(1000);

        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Forms
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]")).click();
            Thread.sleep(1000);
            //Entramos al unico item
            driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
            Thread.sleep(1000);
            
            //Introducimos el First Name
            driver.findElement(By.id("firstName")).sendKeys("FUser");
            driver.findElement(By.id("lastName")).sendKeys("LUser");
            WebElement email =driver.findElement(By.id("userEmail"));
            
            WebElement submit = driver.findElement(By.id("submit"));

            // Para hace scroll 
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            Thread.sleep(1000);

            // verificar que el correo es erroneo
            email.sendKeys("User");
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            submit.click();

            Thread.sleep(1000);

            email.clear();
            email.sendKeys("User@");

            Thread.sleep(1000);
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            submit.click();

            Thread.sleep(1000);
            email.clear();
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            email.sendKeys("User@gmail.com");
            Thread.sleep(500);

            // Elegimos el genero
            driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[3]/label")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]/label")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[1]/label")).click();

            // Escribimos el mobile
            driver.findElement(By.id("userNumber")).sendKeys("1234567890");

            // Fecha de nacimiento
            WebElement fecha = driver.findElement(By.id("dateOfBirthInput"));
            fecha.click();
            Thread.sleep(1000);

            // Elegir año
            WebElement fecha_a = driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
            Select select_a = new Select(fecha_a);
            select_a.selectByValue("2004");
            Thread.sleep(2000);
            
            // Elegimos el mes
            WebElement fecha_m = driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
            Select select_m = new Select(fecha_m);
            select_m.selectByValue("6");
            Thread.sleep(2000);
            // Elegimos dia 
            driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]")).click();

            // Escogeremos el Subject
            driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys("Math");
            driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys("Accounting");
            driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys("Arts");
            driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys(Keys.RETURN);
            driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys("Soci");
            driver.findElement(By.xpath("//*[@id='subjectsInput']")).sendKeys(Keys.RETURN);
            Thread.sleep(2000);

            // Le damos a los botones de los hobbies
            driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label")).click();
            driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[2]/label")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[2]/label")).click();
            driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[3]/label")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[3]/label")).click();
            driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label")).click();

            // selecionamos el archivo
            WebElement subir_archivo = driver.findElement(By.id("uploadPicture"));
            // Escribimos la ruta de nuestro archivo
            subir_archivo.sendKeys("C:\\Users\\kevin.riese.ext\\Downloads\\FOODTURE.png");
            Thread.sleep(1000);

            // Current Addres
            driver.findElement(By.id("currentAddress")).sendKeys("Current Address");
            // State and City
            js.executeScript("arguments[0].scrollIntoView(true);", submit);
            driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
            driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            driver.findElement(By.id("react-select-4-input")).sendKeys("Noida");
            driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            submit.click();
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
            driver.get("https://demoqa.com");
    
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[3]")).click();
            Thread.sleep(1000);
    
            // Entramos al primer item (Browser Windows)
            driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]")).click();
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


        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[3]")).click();
            Thread.sleep(1000);
            //Entramos al item
            driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Alerts']")).click();
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
            driver.findElement(By.xpath("//*[@id='promtButton']")).click();
            Thread.sleep(1000);

            // Cambiar el foco a la alerta y enviar el texto
            Alert promptAlert = driver.switchTo().alert();
            promptAlert.sendKeys("Holaa");
            
            Thread.sleep(1000);
            // Aceptar la alerta
            driver.switchTo().alert().accept();

            // Para la acción de cancelar
            driver.findElement(By.xpath("//*[@id='promtButton']")).click();
            Thread.sleep(1000);

            // Cambiar el foco a la alerta nuevamente y enviar el texto
            driver.switchTo().alert().sendKeys("Holaa");

            // Cancelar la alerta
            driver.switchTo().alert().dismiss();
            Thread.sleep(1000);
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[3]")).click();
            Thread.sleep(1000);
            //Entramos al item
            driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Frames']")).click();
            Thread.sleep(1000);
            // Entrar al primer Frame y coger el texto.
            driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

            WebElement h1Element = driver.findElement(By.tagName("h1"));
            
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
        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[3]")).click();
            Thread.sleep(1000);
            //Entramos al item
            driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Nested Frames']")).click();
            Thread.sleep(1000);
            // Entrar al primer Frame y coger el texto.
            driver.switchTo().frame(driver.findElement(By.id("frame1")));
            WebElement primer = driver.findElement(By.xpath("//body"));
            System.out.println("Texto padre: " +primer.getText());
            // Entrar al segundo frame y coger el texto.
            driver.switchTo().frame(driver.findElements(By.xpath("/html/body/iframe")).get(0)); 
            WebElement segundo = driver.findElement(By.xpath("/html/body/p"));
            System.out.println("Texto hijo: " +segundo.getText());
            driver.switchTo().defaultContent();
            

        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[3]")).click();
            Thread.sleep(1000);
            //Entramos al item
            driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Modal Dialogs']")).click();
            Thread.sleep(1000);
            // Entrar al primer boton y coger el texto.
            driver.findElement(By.id("showSmallModal")).click();
            Thread.sleep(1000);
            WebElement Primer_texto = driver.findElement(By.xpath("//div[text()='This is a small modal. It has very less content']"));
            String texto1 = Primer_texto.getText();
            System.out.println("Small modal: "+ texto1);
            // Cerrar alerta
            driver.findElement(By.id("closeSmallModal")).click();
            // Entramos al segundo boton y cogemos el texto
            driver.findElement(By.id("showLargeModal")).click();
            Thread.sleep(1000);
            WebElement Segund_texto = driver.findElement(By.xpath("//div[@class='modal-body']/p"));
            String texto2 = Segund_texto.getText();
            System.out.println("Large modal : "+ texto2);
            // Cerrar alerta
            driver.findElement(By.id("closeLargeModal")).click();
            
            
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Data Picker")
    @Story("Alerts, Frame & Windows")
    @Description("Data Picker")
    //
    public void TC014_Alerts_Frame_Windows14() throws InterruptedException, IOException {
        testId = "TC014_Alerts_Frame_&_Windows14";
        
        //
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[4]")).click();
            Thread.sleep(1000);
            //Entramos al item
            driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Date Picker']")).click();
            Thread.sleep(1000);
            // 
            driver.findElement(By.id("datePickerMonthYearInput")).click();
            // Elegir año
            WebElement fecha_a = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
            Select select_a = new Select(fecha_a);
            select_a.selectByValue("2004");
            Thread.sleep(500);
            
            // Elegimos el mes
            WebElement fecha_m = driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
            Select select_m = new Select(fecha_m);
            select_m.selectByValue("6");
            Thread.sleep(500);
            // Elegimos dia 
            driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]")).click();

            // Segundo Date
            driver.findElement(By.id("dateAndTimePickerInput")).click();
            // Desplegamos el año
            WebElement desplegable_2_a = driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[2]"));
            desplegable_2_a.click();
            for (int i = 0; i < 15; i++) {
                driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]")).click();
            }
            driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[12]")).click();
            Thread.sleep(500);
            // Escogemos el año

            // Elegimos el mes
            driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]")).click();
            driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]")).click();
            Thread.sleep(500);
            // Elegimos dia 
            driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]")).click();
            // Elegimos la hora 
            
            driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[17]")).click();
            
            Thread.sleep(2000);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[4]")).click();
            Thread.sleep(1000);
            //Entramos al item
            driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Slider']")).click();
            Thread.sleep(1000);
            // Clicamos el slider
            WebElement slider = driver.findElement(By.xpath("//*[@id='sliderContainer']/div[1]/span/input"));
            slider.click();
            // Movemos a la izquierda
            for (int i = 0; i < 50; i++) {
                slider.sendKeys(Keys.ARROW_LEFT);
            }
            //Movemos a la derecha
            for (int i = 0; i < 100; i++) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            }
            
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Slider")
    @Story("Widgets")
    @Description("Slider")
    //
    public void TC016_Widgets16() throws InterruptedException, IOException {
        testId = "TC016_Widgets16";
        
        //
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[4]")).click();
            Thread.sleep(1000);
            //Entramos al item
            WebElement entrar = driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Progress Bar']"));
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
        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[4]")).click();
            Thread.sleep(1000);
            //Entramos al item
            WebElement entrar = driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Menu']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", entrar);
            entrar.click();
            Thread.sleep(1000);
            // Le damos click Main 1
            driver.findElement(By.xpath("//*[@id='nav']/li[1]/a")).click();
            Thread.sleep(1000);
            // Le damos click Main 3
            driver.findElement(By.xpath("//*[@id='nav']/li[3]/a")).click();
            Thread.sleep(1000);
            // Le damos click Main 2
            driver.findElement(By.xpath("//*[@id='nav']/li[2]/a")).click();
            Thread.sleep(1000);
            // Le damos click sub item
            driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[1]/a")).click();
            Thread.sleep(1000);
            // Le damos click sub item
            driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[2]/a")).click();
            Thread.sleep(1000);
            // Le damos click Sub sub list
            driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/a")).click();
            Thread.sleep(1000);
            // Le damos click Sub sub list 1
            driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/ul/li[1]/a")).click();
            Thread.sleep(1000);
            // Le damos click Sub sub list 2
            driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/ul/li[2]/a")).click();
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
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
        try{
            // Entramos a demoqa
            driver.get("https://demoqa.com");
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[4]")).click();
            Thread.sleep(1000);
            //Entramos al item
            WebElement entrar = driver.findElement(By.xpath("//div[@class='element-list collapse show']//span[text()='Select Menu']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", entrar);
            entrar.click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[contains(text(),'Select Option')]")).sendKeys("Group 1, Option 1");
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}
//
