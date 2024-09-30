package web;
//
import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
//
public class Prueba extends Main {
    @Test(description = "Prueba DemoQA Elements Text Box")
    @Story("Elements")
    @Description("Rellenar textbox")
    //
    public void XML_Test() throws InterruptedException, IOException {
        testId = "XML_Test";
        try {
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            String fullNameBox = getTagValue("fullName_TC_001", doc);
            String emailBox = getTagValue("email4_TC_001", doc);
            String currentAddressBox = getTagValue("currentAddress_TC_001", doc);
            String permanentAddressBox = getTagValue("permanentAddress_TC_001", doc);
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='avatar mx-auto white'])[1]")));
            menu.click();
            //
            WebElement subMenu = wait.until(ExpectedConditions.elementToBeClickable(By.id("item-0")));
            subMenu.click();
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            Thread.sleep(500);
            //
            WebElement full_name = driver.findElement(By.id("userName"));
            full_name.sendKeys(fullNameBox);
            Thread.sleep(50);
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys(emailBox);
            Thread.sleep(50);
            //
            WebElement current_address = driver.findElement(By.id("currentAddress"));
            current_address.sendKeys(currentAddressBox);
            Thread.sleep(50);
            //
            WebElement permanent_address = driver.findElement(By.id("permanentAddress"));
            permanent_address.sendKeys(permanentAddressBox);
            Thread.sleep(50);
            //
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            //
            WebElement output_text = driver.findElement(By.xpath("(//div[@class='border col-md-12 col-sm-12'])[1]"));
            String print_output = output_text.getText();
            System.out.println(print_output);
            //
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Text Box")
    @Story("Elements")
    @Description("Rellenar textbox")
    //
    public void TC001_Text_Box() throws InterruptedException, IOException {
        testId = "TC001_Text_Box";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            String url = getTagValue("demoqa", doc);
            String elementsXpath = getTagValue("elements", doc);
            String textBoxXpath = getTagValue("firstSubelement", doc);
            //
            String fullNameId = getTagValue("", doc);
            String emailId = getTagValue("", doc);
            String currentAddressId = getTagValue("", doc);
            String permanentAddressId = getTagValue("", doc);
            //
            String fullNameBox = getTagValue("fullNameText_TC_001", doc);
            String emailBox1 = getTagValue("emailText1_TC_001", doc);
            String emailBox2 = getTagValue("emailText2_TC_001", doc);
            String emailBox3 = getTagValue("emailText3_TC_001", doc);
            String emailBox4 = getTagValue("emailText4_TC_001", doc);
            String currentAddressBox = getTagValue("currentAddressText_TC_001", doc);
            String permanentAddressBox = getTagValue("permanentAddressText_TC_001", doc);
            //
            String outputTextXpath = getTagValue("", doc);
            //
            driver.get(url);
            //
            WebElement menu = driver.findElement(By.xpath(elementsXpath));
            menu.click();
            Thread.sleep(50);
            WebElement sub_menu = driver.findElement(By.xpath(textBoxXpath));
            sub_menu.click();
            Thread.sleep(50);
            //
            Thread.sleep(100);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            //
            WebElement full_name = driver.findElement(By.id("userName"));
            full_name.sendKeys(fullNameBox);
            //
            WebElement email = driver.findElement(By.id(permanentAddressId)));
            email.sendKeys(emailBox1);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            email.clear();
            email.sendKeys(emailBox2);
            submit.click();
            email.clear();
            email.sendKeys(emailBox3);
            email.clear();
            email.sendKeys(emailBox4);
            //
            WebElement current_address = driver.findElement(By.id("currentAddress"));
            current_address.sendKeys(currentAddressBox);
            //
            WebElement permanent_address = driver.findElement(By.id("permanentAddress"));
            permanent_address.sendKeys(permanentAddressBox);
            submit.click();
            //
            WebElement output_text = driver.findElement(By.xpath("(//div[@class='border col-md-12 col-sm-12'])[1]"));
            String print_output = output_text.getText();
            System.out.println(print_output);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Check Box")
    @Story("Elements")
    @Description("Comprobar que todos los botones y desplegables funcionan de forma correcta.")
    //
    public void TC002_Check_Box() throws InterruptedException, IOException {
        testId = "TC002_Check_Box";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.id("item-1"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement plus = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
            plus.click();
            Thread.sleep(500);
            WebElement minus = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
            minus.click();
            Thread.sleep(500);
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,600)", "");
            Thread.sleep(500);
            //
            Thread.sleep(500);
            WebElement home_arrow = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button"));
            home_arrow.click();
            Thread.sleep(500);
            //
            WebElement desktop_arrow = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
            desktop_arrow.click();
            Thread.sleep(500);
            //
            WebElement documents_arrow = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
            documents_arrow.click();
            Thread.sleep(500);
            WebElement workSpace_arrow = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button"));
            workSpace_arrow.click();
            Thread.sleep(500);
            WebElement office_arrow = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button"));
            office_arrow.click();
            Thread.sleep(500);
            //
            WebElement downloads_arrow = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
            downloads_arrow.click();
            Thread.sleep(500);
            //
            WebElement home_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]"));
            home_check_box.click();
            Thread.sleep(500);
            home_check_box.click();
            Thread.sleep(500);
            //
            WebElement desktop_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]"));
            desktop_check_box.click();
            Thread.sleep(500);
            desktop_check_box.click();
            Thread.sleep(500);
            WebElement notes_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
            notes_check_box.click();
            Thread.sleep(500);
            notes_check_box.click();
            Thread.sleep(500);
            WebElement commands_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]"));
            commands_check_box.click();
            Thread.sleep(500);
            commands_check_box.click();
            Thread.sleep(500);
            //
            WebElement documents_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]"));
            documents_check_box.click();
            Thread.sleep(500);
            documents_check_box.click();
            Thread.sleep(500);
            WebElement workSpace_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]"));
            workSpace_check_box.click();
            Thread.sleep(500);
            workSpace_check_box.click();
            Thread.sleep(500);
            WebElement react_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
            react_check_box.click();
            Thread.sleep(500);
            react_check_box.click();
            Thread.sleep(500);
            WebElement angular_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[1]"));
            angular_check_box.click();
            Thread.sleep(500);
            angular_check_box.click();
            Thread.sleep(500);
            WebElement veu_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]"));
            veu_check_box.click();
            Thread.sleep(500);
            veu_check_box.click();
            Thread.sleep(500);
            //
            WebElement office_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]"));
            office_check_box.click();
            Thread.sleep(500);
            office_check_box.click();
            Thread.sleep(500);
            WebElement public_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
            public_check_box.click();
            Thread.sleep(500);
            public_check_box.click();
            Thread.sleep(500);
            WebElement private_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]"));
            private_check_box.click();
            Thread.sleep(500);
            private_check_box.click();
            Thread.sleep(500);
            WebElement classified_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]"));
            classified_check_box.click();
            Thread.sleep(500);
            classified_check_box.click();
            Thread.sleep(500);
            WebElement general_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"));
            general_check_box.click();
            Thread.sleep(500);
            general_check_box.click();
            Thread.sleep(500);
            //
            WebElement downloads_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]"));
            downloads_check_box.click();
            Thread.sleep(500);
            downloads_check_box.click();
            Thread.sleep(500);
            WebElement wordFile_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
            wordFile_check_box.click();
            Thread.sleep(500);
            wordFile_check_box.click();
            Thread.sleep(500);
            WebElement excelFile_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
            excelFile_check_box.click();
            Thread.sleep(500);
            excelFile_check_box.click();
            Thread.sleep(500);
            //
            downloads_arrow.click();
            Thread.sleep(500);
            office_arrow.click();
            Thread.sleep(500);
            workSpace_arrow.click();
            Thread.sleep(500);
            documents_arrow.click();
            Thread.sleep(500);
            desktop_arrow.click();
            Thread.sleep(500);
            home_arrow.click();
            Thread.sleep(500);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Radio Button")
    @Story("Elements")
    @Description("Comprobar que todos los botones funcionan de forma correcta.")
    //
    public void TC003_Radio_Button() throws InterruptedException, IOException {
        testId = "TC003_Radio_Button";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.id("item-2"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement yes = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));
            yes.click();
            Thread.sleep(500);
            //
            WebElement impressive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]"));
            impressive.click();
            Thread.sleep(500);
            //
            WebElement no = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[4]"));
            no.click();
            Thread.sleep(500);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Web Tables")
    @Story("Elements")
    @Description("Comprobar el formulario, la lista, el buscador y las paginas.")
    //
    public void TC004_Web_Tables() throws InterruptedException, IOException {
        testId = "TC004_Web_Tables";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.id("item-3"));
            sub_menu.click();
            Thread.sleep(500);
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,450)", "");
            Thread.sleep(500);
            //
            WebElement rows = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select"));
            rows.click();
            Thread.sleep(500);
            //
            WebElement select_rows = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select"));
            select_rows.sendKeys(Keys.DOWN);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.DOWN);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.DOWN);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.DOWN);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            js.executeScript("window.scrollBy(0,5000)", "");
            Thread.sleep(500);
            //
            rows.click();
            Thread.sleep(500);
            select_rows.sendKeys(Keys.UP);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            rows.click();
            Thread.sleep(500);
            select_rows.sendKeys(Keys.UP);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            rows.click();
            Thread.sleep(500);
            select_rows.sendKeys(Keys.UP);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            rows.click();
            Thread.sleep(500);
            select_rows.sendKeys(Keys.UP);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            rows.click();
            Thread.sleep(500);
            select_rows.sendKeys(Keys.UP);
            Thread.sleep(50);
            select_rows.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            js.executeScript("window.scrollBy(0,-400)", "");
            Thread.sleep(500);
            //
            WebElement add = driver.findElement(By.xpath("//*[@id='addNewRecordButton']"));
            add.click();
            Thread.sleep(500);
            //
            WebElement first_name = driver.findElement(By.id("firstName"));
            first_name.sendKeys("FirstNameTest");
            Thread.sleep(500);
            WebElement last_name = driver.findElement(By.id("lastName"));
            last_name.sendKeys("LastNameTest");
            Thread.sleep(500);
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailTest");
            Thread.sleep(500);
            //
            WebElement age = driver.findElement(By.id("age"));
            age.sendKeys("AgeTest");
            Thread.sleep(500);
            //
            WebElement salary = driver.findElement(By.id("salary"));
            salary.sendKeys("SalaryTest");
            Thread.sleep(500);
            //
            WebElement department = driver.findElement(By.id("department"));
            department.sendKeys("DepartmentTest");
            Thread.sleep(500);
            //
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(500);
            email.clear();
            Thread.sleep(500);
            email.sendKeys("EmailTest@");
            Thread.sleep(500);
            submit.click();
            Thread.sleep(500);
            email.clear();
            Thread.sleep(500);
            email.sendKeys("EmailTest@Test");
            Thread.sleep(500);
            submit.click();
            Thread.sleep(500);
            email.clear();
            Thread.sleep(500);
            email.sendKeys("EmailTest@Test.com");
            Thread.sleep(500);
            //
            age.clear();
            age.sendKeys("00");
            Thread.sleep(500);
            submit.click();
            //
            salary.clear();
            salary.sendKeys("0000");
            Thread.sleep(500);
            submit.click();
            Thread.sleep(500);
            //
            add.click();
            Thread.sleep(500);
            WebElement first_name2 = driver.findElement(By.id("firstName"));
            first_name2.sendKeys("FirstNameTest2");
            Thread.sleep(500);
            WebElement last_name2 = driver.findElement(By.id("lastName"));
            last_name2.sendKeys("LastNameTest2");
            Thread.sleep(500);
            WebElement email2 = driver.findElement(By.id("userEmail"));
            email2.sendKeys("EmailTest2@Test.com");
            Thread.sleep(500);
            WebElement age2 = driver.findElement(By.id("age"));
            age2.sendKeys("02");
            Thread.sleep(500);
            WebElement salary2 = driver.findElement(By.id("salary"));
            salary2.sendKeys("0002");
            Thread.sleep(500);
            WebElement department2 = driver.findElement(By.id("department"));
            department2.sendKeys("DepartmentTest2");
            Thread.sleep(500);
            WebElement submit2 = driver.findElement(By.id("submit"));
            submit2.click();
            Thread.sleep(500);
            //
            add.click();
            Thread.sleep(500);
            WebElement first_name3 = driver.findElement(By.id("firstName"));
            first_name3.sendKeys("FirstNameTest3");
            Thread.sleep(500);
            WebElement last_name3 = driver.findElement(By.id("lastName"));
            last_name3.sendKeys("LastNameTest3");
            Thread.sleep(500);
            WebElement email3 = driver.findElement(By.id("userEmail"));
            email3.sendKeys("EmailTest3@Test.com");
            Thread.sleep(500);
            WebElement age3 = driver.findElement(By.id("age"));
            age3.sendKeys("03");
            Thread.sleep(500);
            WebElement salary3 = driver.findElement(By.id("salary"));
            salary3.sendKeys("0003");
            Thread.sleep(500);
            WebElement department3 = driver.findElement(By.id("department"));
            department3.sendKeys("DepartmentTest3");
            Thread.sleep(500);
            WebElement submit3 = driver.findElement(By.id("submit"));
            submit3.click();
            Thread.sleep(500);
            //
            WebElement next = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[3]"));
            next.click();
            Thread.sleep(500);
            //
            WebElement previous = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[1]"));
            previous.click();
            Thread.sleep(500);
            //
            WebElement page = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[1]/div/input"));
            page.clear();
            Thread.sleep(50);
            page.sendKeys("2");
            Thread.sleep(50);
            page.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            page.sendKeys(Keys.BACK_SPACE);;
            Thread.sleep(50);
            page.sendKeys("1");
            Thread.sleep(50);
            page.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement edit = driver.findElement(By.xpath("//*[@id='edit-record-4']"));
            edit.click();
            Thread.sleep(500);
            //
            WebElement first_name1 = driver.findElement(By.id("firstName"));
            first_name1.clear();
            first_name1.sendKeys("FirstNameTest1");
            Thread.sleep(500);
            WebElement last_name1 = driver.findElement(By.id("lastName"));
            last_name1.clear();
            last_name1.sendKeys("LastNameTest1");
            Thread.sleep(500);
            WebElement email1 = driver.findElement(By.id("userEmail"));
            email1.clear();
            email1.sendKeys("EmailTest1@Test.com");
            Thread.sleep(500);
            WebElement age1 = driver.findElement(By.id("age"));
            age1.clear();
            age1.sendKeys("01");
            Thread.sleep(500);
            WebElement salary1 = driver.findElement(By.id("salary"));
            salary1.clear();
            salary1.sendKeys("0001");
            Thread.sleep(500);
            WebElement department1 = driver.findElement(By.id("department"));
            department1.clear();
            department1.sendKeys("DepartmentTest1");
            Thread.sleep(500);
            WebElement submit1 = driver.findElement(By.id("submit"));
            submit1.click();
            Thread.sleep(500);
            //
            WebElement search_bar = driver.findElement(By.xpath("//*[@id='searchBox']"));
            search_bar.sendKeys("FirstNameTest1");
            Thread.sleep(500);
            WebElement search = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
            search.click();
            Thread.sleep(500);
            //
            search_bar.clear();
            search_bar.sendKeys("LastNameTest2");
            Thread.sleep(500);
            search.click();
            Thread.sleep(500);
            //
            search_bar.clear();
            search_bar.sendKeys("EmailTest3@Test.com");
            Thread.sleep(500);
            search.click();
            Thread.sleep(500);
            //
            search_bar.clear();
            search_bar.sendKeys("01");
            Thread.sleep(500);
            search.click();
            Thread.sleep(500);
            //
            search_bar.clear();
            search_bar.sendKeys("0002");
            Thread.sleep(500);
            search.click();
            Thread.sleep(500);
            //
            search_bar.clear();
            search_bar.sendKeys("DepartmentTest3");
            Thread.sleep(500);
            search.click();
            Thread.sleep(500);
            //
            int n = 15;
            while (true) {
                search_bar.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    Thread.sleep(500);
                    break;
                }
            }
            //
            WebElement sort1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]"));
            sort1.click();
            Thread.sleep(500);
            sort1.click();
            Thread.sleep(500);
            //
            WebElement sort2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[2]"));
            sort2.click();
            Thread.sleep(500);
            sort2.click();
            Thread.sleep(500);
            //
            WebElement sort3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]"));
            sort3.click();
            Thread.sleep(500);
            sort3.click();
            Thread.sleep(500);
            //
            WebElement sort4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]"));
            sort4.click();
            Thread.sleep(500);
            sort4.click();
            Thread.sleep(500);
            //
            WebElement sort5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[5]"));
            sort5.click();
            Thread.sleep(500);
            sort5.click();
            Thread.sleep(500);
            //
            WebElement sort6 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[6]"));
            sort6.click();
            Thread.sleep(500);
            sort6.click();
            Thread.sleep(500);
            //
            WebElement delete1 = driver.findElement(By.id("delete-record-6"));
            delete1.click();
            Thread.sleep(500);
            //
            WebElement delete2 = driver.findElement(By.id("delete-record-5"));
            delete2.click();
            Thread.sleep(500);
            //
            WebElement delete3 = driver.findElement(By.id("delete-record-4"));
            delete3.click();
            Thread.sleep(500);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Buttons")
    @Story("Elements")
    @Description("Comprobar que todos los botones funcionan con su input asignado.")
    //
    public void TC005_Buttons() throws InterruptedException, IOException {
        testId = "TC005_Buttons";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            Actions actions = new Actions(driver);
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.id("item-4"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement double_click = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
            actions.doubleClick(double_click).perform();
            Thread.sleep(500);
            //
            WebElement right_click = driver.findElement(By.id("rightClickBtn"));
            actions.contextClick(right_click).perform();
            Thread.sleep(500);
            //
            WebElement single_click = driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]"));
            single_click.click();
            Thread.sleep(2000);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Upload And Download.")
    @Story("Elements")
    @Description("Comprobar que la descraga y la subida de archivos funciona correctamente.")
    //
    public void TC006_Upload_And_Download() throws InterruptedException, IOException {
        testId = "TC006_Upload_And_Download";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.id("item-7"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement download = driver.findElement(By.xpath("(//a[normalize-space()='Download'])[1]"));
            download.click();
            Thread.sleep(500);
            //
            WebElement upload = driver.findElement(By.id("uploadFile"));
            upload.sendKeys("C:\\Users\\unai.ovejero.ext\\Downloads\\sampleFile.jpeg");
            Thread.sleep(500);
            //
            WebElement path = driver.findElement(By.id("uploadedFilePath"));
            String filePath = path.getText();
            System.out.println(filePath);
            Thread.sleep(500);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Elements Dynamic Properties.")
    @Story("Elements")
    @Description("Comprobar que los elementos canvian de forma dinamica.")
    //
    public void TC007_Dynamic_Properties() throws InterruptedException, IOException {
        testId = "TC007_Dynamic_Properties";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.id("item-8"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement enableAfter = driver.findElement(By.id("enableAfter"));
            enableAfter.click();
            Thread.sleep(500);
            WebElement colorChange = driver.findElement(By.id("colorChange"));
            colorChange.click();
            WebElement getColor = driver.findElement(By.id("colorChange"));
            String color = colorChange.getCssValue("color");
            Thread.sleep(5000);
            //
            enableAfter.click();
            Thread.sleep(500);
            colorChange.click();
            Thread.sleep(500);
            getColor.getCssValue("color");
            System.out.println("El color es: " + color);
            Thread.sleep(500);
            WebElement visibleAfter = driver.findElement(By.id("visibleAfter"));
            visibleAfter.click();
            Thread.sleep(500);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Forms Practice Form.")
    @Story("Forms")
    @Description("Comprobar los diferentes campos en el formulario y sus difirentes formatos.")
    //
    public void TC008_Practice_Form() throws InterruptedException, IOException {
        testId = "TC008_Practice_Form";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,300)", "");
            Thread.sleep(500);
            //
            WebElement first_name = driver.findElement(By.id("firstName"));
            first_name.sendKeys("FirstNameTest");
            Thread.sleep(500);
            WebElement last_name = driver.findElement(By.id("lastName"));
            last_name.sendKeys("LastNameTest");
            Thread.sleep(500);
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailTest");
            Thread.sleep(500);
            //
            js.executeScript("window.scrollBy(0,50)", "");
            Thread.sleep(500);
            //
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(500);
            //
            email.clear();
            email.sendKeys("EmailTest@Test");
            Thread.sleep(500);
            //
            email.clear();
            email.sendKeys("EmailTest@Test.com");
            Thread.sleep(500);
            //
            WebElement male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
            male.click();
            Thread.sleep(500);
            //
            WebElement female = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
            female.click();
            Thread.sleep(500);
            //
            WebElement other = driver.findElement(By.xpath("//label[normalize-space()='Other']"));
            other.click();
            Thread.sleep(500);
            //
            WebElement birthDate = driver.findElement(By.id("dateOfBirthInput"));
            //
            // birthDate.clear();
            // Thread.sleep(500);
            //
            int n = 10;
            while (true) {
                birthDate.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    Thread.sleep(500);
                    break;
                }
            }
            //
            birthDate.sendKeys(" Jan 2000");
            Thread.sleep(500);
            //
            birthDate.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement mobile = driver.findElement(By.id("userNumber"));
            mobile.sendKeys("123456789");
            Thread.sleep(500);
            //
            submit.click();
            Thread.sleep(500);
            //
            mobile.clear();
            Thread.sleep(50);
            mobile.sendKeys("1234567890");
            Thread.sleep(500);
            //
            WebElement subject = driver.findElement(By.id("subjectsInput"));
            subject.click();
            Thread.sleep(500);
            subject.sendKeys("Computer");
            Thread.sleep(50);
            subject.sendKeys(Keys.TAB);
            Thread.sleep(500);
            //
            WebElement hobby1 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]"));
            hobby1.click();
            Thread.sleep(500);
            //
            WebElement hobby2 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]"));
            hobby2.click();
            Thread.sleep(500);
            //
            WebElement hobby3 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]"));
            hobby3.click();
            Thread.sleep(500);
            //
            hobby1.click();
            Thread.sleep(50);
            hobby2.click();
            Thread.sleep(50);
            hobby3.click();
            Thread.sleep(50);
            hobby3.click();
            Thread.sleep(500);
            //
            WebElement upload = driver.findElement(By.id("uploadPicture"));
            upload.sendKeys("C:\\Users\\unai.ovejero.ext\\Downloads\\sampleFile.jpeg");
            Thread.sleep(500);
            //
            WebElement currentAdress = driver.findElement(By.id("currentAddress"));
            currentAdress.sendKeys("CurrentAddressTest");
            Thread.sleep(500);
            //
            WebElement state = driver.findElement(By.xpath("//*[@id='state']/div/div[2]/div"));
            state.click();
            Thread.sleep(500);
            WebElement stateSelect = driver.findElement(By.id("react-select-3-input"));
            stateSelect.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div"));
            city.click();
            Thread.sleep(500);
            WebElement citySelect = driver.findElement(By.id("react-select-4-input"));
            citySelect.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            submit.click();
            //
            WebElement result = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody"));
            String output = result.getText();
            System.out.println(output);
            Thread.sleep(2000);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frames & Windows Browser Windows.")
    @Story("Alerts, Frames & Windows")
    @Description("Clicar los botones y comprobar su accion.")
    //
    public void TC009_Browser_Windows() throws InterruptedException, IOException {
        testId = "TC009_Browser_Windows";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[3]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement newTab = driver.findElement(By.id("tabButton"));
            newTab.click();
            Thread.sleep(500);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(0));
            Thread.sleep(500);
            //
            WebElement newWindow = driver.findElement(By.id("windowButton"));
            newWindow.click();
            Thread.sleep(500);
            String currentWindow = driver.getWindowHandle();
            driver.switchTo().window(currentWindow);
            Thread.sleep(500);
            //
            WebElement newAlert = driver.findElement(By.id("messageWindowButton"));
            newAlert.click();
            Thread.sleep(500);
            String currentWindow2 = driver.getWindowHandle();
            driver.switchTo().window(currentWindow2);
            Thread.sleep(2000);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frames & Windows Alerts.")
    @Story("Alerts, Frames & Windows")
    @Description("Comprobar las diferentes alertas.")
    //
    public void TC010_Alerts() throws InterruptedException, IOException {
        testId = "TC010_Alerts";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement alert1 = driver.findElement(By.id("alertButton"));
            alert1.click();
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);
            //
            WebElement alert2 = driver.findElement(By.id("timerAlertButton"));
            Thread.sleep(500);
            alert2.click();
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
            Thread.sleep(500);
            //
            WebElement alert3 = driver.findElement(By.id("confirmButton"));
            alert3.click();
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);
            //
            WebElement confirmResult = driver.findElement(By.id("confirmResult"));
            String confirmOutput = confirmResult.getText();
            System.out.println(confirmOutput);
            Thread.sleep(500);
            //
            alert3.click();
            Thread.sleep(500);
            driver.switchTo().alert().dismiss();
            Thread.sleep(500);
            //
            String confirmOutput2 = confirmResult.getText();
            System.out.println(confirmOutput2);
            Thread.sleep(500);
            //
            WebElement alert4 = driver.findElement(By.id("promtButton"));
            alert4.click();
            Thread.sleep(500);
            driver.switchTo().alert().sendKeys("TextTest");
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);
            //
            WebElement promptResult = driver.findElement(By.id("promptResult"));
            String promptOutput = promptResult.getText();
            System.out.println(promptOutput);
            Thread.sleep(500);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frames & Windows Frames.")
    @Story("Alerts, Frames & Windows")
    @Description("Extraer el texto de los 'Iframes'.")
    //
    public void TC011_Frames() throws InterruptedException, IOException {
        testId = "TC011_Frames";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[3]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            driver.switchTo().frame(driver.findElements(By.id("frame1")).get(0));
            WebElement text1 = driver.findElement(By.id("sampleHeading"));
            String output1 = text1.getText();
            Thread.sleep(500);
            //
            driver.switchTo().defaultContent();
            driver.switchTo().frame(driver.findElements(By.id("frame2")).get(0));
            WebElement text2 = driver.findElement(By.tagName("h1"));
            String output2 = text2.getText();
            Thread.sleep(500);
            //
            System.out.println("Texto iFrame 1: " + output1);
            System.out.println("Texto iFrame 2: " + output2);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frames & Windows Nested Frames.")
    @Story("Alerts, Frames & Windows")
    @Description("Extraer el texto de los 'Nested Iframes'.")
    //
    public void TC012_Nested_Frames() throws InterruptedException, IOException {
        testId = "TC012_Nested_Frames";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[3]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            driver.switchTo().frame(driver.findElements(By.id("frame1")).get(0));
            WebElement text1 = driver.findElement(By.xpath("/html/body"));
            String output1 = text1.getText();
            Thread.sleep(500);
            //
            driver.switchTo().frame(driver.findElements(By.xpath("/html/body/iframe")).get(0));
                WebElement text2 = driver.findElement(By.xpath("/html/body/p"));
                String output2 = text2.getText();
                Thread.sleep(500);
            //
            System.out.println("The parent frame's text is: " + output1);
            System.out.println("The child frame's text is: " + output2);
		    //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Alerts, Frames & Windows Modal Dialogs.")
    @Story("Alerts, Frames & Windows")
    @Description("Comprobar la funcionalidad de los botones..")
    //
    public void TC013_Modal_Dialogs() throws InterruptedException, IOException {
        testId = "TC013_Modal_Dialogs";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[3]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement smallModalClick = driver.findElement(By.id("showSmallModal"));
            smallModalClick.click();
            Thread.sleep(500);
            WebElement smallModal = driver.findElement(By.xpath("(//div[@class='modal-body'])[1]"));
            String output1 = smallModal.getText();
            Thread.sleep(500);
            WebElement smallModalClose = driver.findElement(By.id("closeSmallModal"));
            smallModalClose.click();
            Thread.sleep(500);
            //
            WebElement largeModalClick = driver.findElement(By.id("showLargeModal"));
            largeModalClick.click();
            Thread.sleep(500);
            WebElement largeModal = driver.findElement(By.xpath("(//p[contains(text(),\"Lorem Ipsum is simply dummy text of the printing a\")])[1]"));
            String output2 = largeModal.getText();
            Thread.sleep(500);
            WebElement largeModalClose = driver.findElement(By.id("closeLargeModal"));
            largeModalClose.click();
            Thread.sleep(500);
            //
            System.out.println("Small modal's text: " + output1);
            System.out.println("Large modal's text: " + output2);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Date Picker.")
    @Story("Widgets")
    @Description("Comprobar la funcionalidad de los campos y los formatos.")
    //
    public void TC014_Date_Picker() throws InterruptedException, IOException {
        testId = "TC014_Date_Picker";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[4]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement selectDate = driver.findElement(By.id("datePickerMonthYearInput"));
            selectDate.click();
            Thread.sleep(50);
            //
            WebElement selectDateYear = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
            selectDateYear.click();
            Thread.sleep(50);
            int n = 24;
            while (true) {
                selectDateYear.sendKeys(Keys.UP);
                n--;
                if (n == 0) {
                    Thread.sleep(50);
                    break;
                }
            }
            selectDateYear.sendKeys(Keys.RETURN);
            Thread.sleep(50);
            //
            WebElement selectDateMonth = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
            selectDateMonth.click();
            Thread.sleep(50);
            n = 8;
            while (true) {
                selectDateMonth.sendKeys(Keys.UP);
                n--;
                if (n == 0) {
                    Thread.sleep(50);
                    break;
                }
            }
            selectDateMonth.sendKeys(Keys.RETURN);
            Thread.sleep(50);
            //
            WebElement selectDateDay = driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[7]"));
            selectDateDay.click();
            Thread.sleep(50);
            //
            WebElement selectTimeDate = driver.findElement(By.id("dateAndTimePickerInput"));
            selectTimeDate.click();
            //
            WebElement selectTimeDateYear = driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]"));
            selectTimeDateYear.click();
            WebElement selectTimeDateYearDown = driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]"));
            n = 19;
            while (true) {
                selectTimeDateYearDown.click();
                n--;
                if (n == 0) {
                    Thread.sleep(50);
                    break;
                }
            }
            Thread.sleep(50);
            //
            WebElement selectTimeDateYearSelection = driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[12]"));
            selectTimeDateYearSelection.click();
            Thread.sleep(50);
            //
            WebElement selectTimeDateMonth = driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]"));
            selectTimeDateMonth.click();
            Thread.sleep(50);
            WebElement selectTimeDateMonthSelection = driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));
            selectTimeDateMonthSelection.click();
            Thread.sleep(50);
            //
            WebElement selectTimeDateDaySelection = driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[7]"));
            selectTimeDateDaySelection.click();
            Thread.sleep(50);
            //
            WebElement selectTimeDateTimeUp = driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[1]"));
            selectTimeDateTimeUp.click();
            //
            Thread.sleep(5000);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Slider.")
    @Story("Widgets")
    @Description("Comprobar los dos formatos del valor.")
    //
    public void TC015_Slider() throws InterruptedException, IOException {
        testId = "TC015_Slider";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[4]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
            int n = 75;
            while (true) {
                slider.sendKeys(Keys.RIGHT);
                n--;
                if (n == 0) {
                    Thread.sleep(50);
                    break;
                }
            }
            String value1 = driver.findElement(By.id("sliderValue")).getAttribute("value");
            System.out.println("The value of the slieder is: " + value1);
            //
            n = 100;
            while (true) {
                slider.sendKeys(Keys.LEFT);
                n--;
                if (n == 0) {
                    Thread.sleep(50);
                    break;
                }
            }
            String value2 = driver.findElement(By.id("sliderValue")).getAttribute("value");
            System.out.println("The value of the slieder is: " + value2);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Progress Bar.")
    @Story("Widgets")
    @Description("Comprobar la funcionalidad del boton y la barra.")
    //
    public void TC016_Progress_Bar() throws InterruptedException, IOException {
        testId = "TC016_Progress_Bar";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[4]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement startStop = driver.findElement(By.id("startStopButton"));
            startStop.click();
            Thread.sleep(1000);
            startStop.click();
            Thread.sleep(500);
            //
            String value1 = driver.findElement(By.xpath("//*[@id='progressBar']/div")).getText();
            System.out.println("The progress is: " + value1);
            Thread.sleep(50);
            //
            startStop.click();
            Thread.sleep(10000);
            //
            String value2 = driver.findElement(By.xpath("//*[@id='progressBar']/div")).getText();
            System.out.println("The progress is: " + value2);
            Thread.sleep(500);
            //
            WebElement reset = driver.findElement(By.id("resetButton"));
            reset.click();
            Thread.sleep(50);
            startStop = driver.findElement(By.id("startStopButton"));
            startStop.click();
            startStop.click();
            //
            String value3 = driver.findElement(By.xpath("//*[@id='progressBar']/div")).getText();
            System.out.println("The progress is: " + value3);
            Thread.sleep(500);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Menu.")
    @Story("Widgets")
    @Description("Comprobar la funcionalidad del boton y la barra.")
    //
    public void TC017_Menu() throws InterruptedException, IOException {
        testId = "TC017_Menu";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[4]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-7']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement menuItem1 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
            menuItem1.click();
            Thread.sleep(500);
            //
            WebElement menuItem2 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
            menuItem2.click();
            Thread.sleep(500);
            //
            WebElement SubSubList = driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/a"));
            SubSubList.click();
            Thread.sleep(500);
            //
            WebElement SubSubItem1 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/ul/li[1]/a"));
            SubSubItem1.click();
            Thread.sleep(500);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    @Test(description = "Prueba DemoQA Widgets Menu.")
    @Story("Widgets")
    @Description("Comprobar la funcionalidad del boton y la barra.")
    //
    public void TC018_Menu() throws InterruptedException, IOException {
        testId = "TC018_Menu";
        //
        try{
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("//div[4]//div[1]//div[2]"));
            menu.click();
            Thread.sleep(500);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-8']"));
            sub_menu.click();
            Thread.sleep(500);
            //
            WebElement value = driver.findElement(By.xpath("//*[@id='withOptGroup']/div/div[1]"));
            value.click();
            Thread.sleep(50);
            //
            js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            //
            value = driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]"));
            value.sendKeys("root");
            value.sendKeys(Keys.ENTER);
            Thread.sleep(50);
            //
            WebElement one = driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]"));
            one.click();
            Thread.sleep(50);
            //
            one = driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"));
            one.sendKeys("Prof");
            one.sendKeys(Keys.ENTER);
            Thread.sleep(50);
            //
            WebElement color = driver.findElement(By.id("oldSelectMenu"));
            color.click();
            Thread.sleep(50);
            //
            color.sendKeys("P");
            color.sendKeys(Keys.ENTER);
            Thread.sleep(50);
            //
            WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]"));
            multiSelect.click();
            Thread.sleep(50);
            //
            multiSelect = driver.findElement(By.xpath("//*[@id=\"react-select-4-input\"]"));
            multiSelect.sendKeys("Green");
            multiSelect.sendKeys(Keys.ENTER);
            Thread.sleep(50);
            //
            multiSelect.sendKeys("Blue");
            multiSelect.sendKeys(Keys.ENTER);
            Thread.sleep(50);
            //
            multiSelect.sendKeys("Black");
            multiSelect.sendKeys(Keys.ENTER);
            Thread.sleep(50);
            //
            multiSelect.sendKeys("Red");
            multiSelect.sendKeys(Keys.ENTER);
            Thread.sleep(50);
            //
            WebElement redClose = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[4]/div/div[2]"));
            redClose.click();
            Thread.sleep(50);
            WebElement blackClose = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[3]/div/div[2]"));
            blackClose.click();
            Thread.sleep(50);  
            WebElement blueClose = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[2]/div/div[2]"));
            blueClose.click();
            Thread.sleep(50);
            WebElement greenClose = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[2]"));
            greenClose.click();
            Thread.sleep(50);
            //
            multiSelect.sendKeys("Black");
            multiSelect.sendKeys(Keys.ENTER);
            Thread.sleep(50);
            WebElement closeAll = driver.findElement(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[2]/div[1]"));
            closeAll.click();
            //
            WebElement volvo = driver.findElement(By.xpath("//*[@id='cars']/option[1]"));
            WebElement saab = driver.findElement(By.xpath("//*[@id='cars']/option[2]"));
            WebElement opel = driver.findElement(By.xpath("//*[@id='cars']/option[3]"));
            WebElement audi = driver.findElement(By.xpath("//*[@id='cars']/option[4]"));
            volvo.click();
            Thread.sleep(500);
            volvo.click();
            Thread.sleep(50);
            saab.click();
            Thread.sleep(500);
            saab.click();
            Thread.sleep(50);
            opel.click();
            Thread.sleep(500);
            opel.click();
            Thread.sleep(50);
            audi.click();
            Thread.sleep(500);
            audi.click();
            Thread.sleep(50);
            //  
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.SHIFT)
                   .click(volvo)
                   .keyUp(Keys.SHIFT)
                   .build()
                   .perform();
            Thread.sleep(500);
            //
            actions.keyDown(Keys.SHIFT)
                   .click(opel)
                   .keyUp(Keys.SHIFT)
                   .build()
                   .perform();
            Thread.sleep(500);
            //
            actions.keyDown(Keys.SHIFT)
                   .click(saab)
                   .keyUp(Keys.SHIFT)
                   .build()
                   .perform();
            Thread.sleep(500);
            //
            actions.keyDown(Keys.SHIFT)
                   .click(audi)
                   .keyUp(Keys.SHIFT)
                   .build()
                   .perform();
            Thread.sleep(500);
            //
            volvo.click();
            Thread.sleep(500);
            saab.click();
            Thread.sleep(500);
            opel.click();
            Thread.sleep(500);
            audi.click();
            Thread.sleep(500);
            //
            actions.keyDown(Keys.CONTROL)
                   .click(volvo)
                   .keyUp(Keys.CONTROL)
                   .build()
                   .perform();
            Thread.sleep(500);
            //
            actions.keyDown(Keys.CONTROL)
                   .click(opel)
                   .keyUp(Keys.CONTROL)
                   .build()
                   .perform();
            Thread.sleep(500);
            //
            actions.keyDown(Keys.SHIFT)
                   .click(saab)
                   .keyUp(Keys.SHIFT)
                   .build()
                   .perform();
            Thread.sleep(500);
            //
            actions.keyDown(Keys.SHIFT)
                   .click(audi)
                   .keyUp(Keys.SHIFT)
                   .build()
                   .perform();
            Thread.sleep(500);
            //
            Thread.sleep(5000);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }

    private String getTagValue(String tag, Document doc) {
        NodeList nodeList = doc.getElementsByTagName(tag);
        if (nodeList != null && nodeList.getLength() > 0) {
            Node node = nodeList.item(0);
            return node.getTextContent();
        }
        return null;
    }
}

//
