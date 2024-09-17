package web;
import java.io.IOException;
//
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
// import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
import io.qameta.allure.Description;
import io.qameta.allure.Story;
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
            
            WebElement text_box = driver.findElement(By.id("item-3"));
            text_box.click();

            // Añadimos un user
            //Clicamos a ADD
            WebElement B_Add = driver.findElement(By.id("addNewRecordButton"));
            B_Add.click();
            Thread.sleep(500);
            // Rellenamos formulario
            WebElement Add_FirstN = driver.findElement(By.id("firstName"));
            Add_FirstN.sendKeys("FUser");

            WebElement Add_LastN = driver.findElement(By.id("lastName"));
            Add_LastN.sendKeys("LUser");

            
            WebElement Add_Email = driver.findElement(By.id("userEmail"));
            Add_Email.sendKeys("User");
            Thread.sleep(500);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Add_Email.clear();
            
            Add_Email.sendKeys("User@");
            submit.click();
            Thread.sleep(500);
            Add_Email.clear();

            Add_Email.sendKeys("User@gmail.com");

            WebElement Add_Age = driver.findElement(By.id("age"));
            Add_Age.sendKeys("20");

            WebElement Add_Salary = driver.findElement(By.id("salary"));
            Add_Salary.sendKeys("2000");

            WebElement Add_Department = driver.findElement(By.id("department"));
            Add_Department.sendKeys("IA");
            Thread.sleep(2000);
            submit.click();
            
            // Buscamos Last Name
            WebElement buscar = driver.findElement(By.id("searchBox"));
            buscar.sendKeys("Cierra");
            Thread.sleep(1000);
            buscar.clear();
            Thread.sleep(1000);

            

            // Editamos 
            WebElement editar = driver.findElement(By.xpath("//*[@id='edit-record-1']"));
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
            Thread.sleep(5000);
            

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}
//
