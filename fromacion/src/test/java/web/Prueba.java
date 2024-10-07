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
import org.w3c.dom.Document;
// import org.w3c.dom.NodeList;
// import org.w3c.dom.Node;
//
public class Prueba extends Main {
    //
    public int action = 0;
    //
    @Test(description = "Prueba DemoQA Elements Text Box")
    @Story("Elements")
    @Description("Rellenar textbox")
    //
    public void XML_Test() throws InterruptedException, IOException {
        testId = "XML_Test";
        try {
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------ Beginning XML_Test -----------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            String fullNameBox = getTagValue("fullNameText_XML", doc);
            String emailBox = getTagValue("emailText_XML", doc);
            String currentAddressBox = getTagValue("currentAddressText_XML", doc);
            String permanentAddressBox = getTagValue("permanentAddressText_XML", doc);
            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            action = 2;
            //
            WebElement subMenu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
            subMenu.click();
            action = 3;
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            Thread.sleep(500);
            action = 4;
            //
            WebElement full_name = driver.findElement(By.id("userName"));
            full_name.sendKeys(fullNameBox);
            Thread.sleep(50);
            action = 5;
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys(emailBox);
            Thread.sleep(50);
            action = 6;
            //
            WebElement current_address = driver.findElement(By.id("currentAddress"));
            current_address.sendKeys(currentAddressBox);
            Thread.sleep(50);
            action = 7;
            //
            WebElement permanent_address = driver.findElement(By.id("permanentAddress"));
            permanent_address.sendKeys(permanentAddressBox);
            Thread.sleep(50);
            action = 8;
            //
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            action = 9;
            //
            WebElement output_text = driver.findElement(By.xpath("(//div[@class='border col-md-12 col-sm-12'])[1]"));
            String print_output = output_text.getText();
            System.out.println(print_output);
            action = 10;
            //
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|-------- XML_Test stopped after performing action " + action + " of 10 --------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
        }
    }
    @Test(description = "Prueba DemoQA Elements Text Box")
    @Story("Elements")
    @Description("Rellenar textbox")
    //
    public void CSV_Test() throws InterruptedException, IOException {
        testId = "CSV_Test";
        try {
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------ Beginning CSV_Test -----------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            String fullNameBox = getCsvValue("fullNameText_CSV");
            String emailBox = getCsvValue("emailText_CSV");
            String currentAddressBox = getCsvValue("currentAddressText_CSV");
            String permanentAddressBox = getCsvValue("permanentAddressText_CSV");
            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            action = 2;
            //
            WebElement subMenu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
            subMenu.click();
            action = 3;
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            Thread.sleep(500);
            action = 4;
            //
            WebElement full_name = driver.findElement(By.id("userName"));
            full_name.sendKeys(fullNameBox);
            Thread.sleep(50);
            action = 5;
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys(emailBox);
            Thread.sleep(50);
            action = 6;
            //
            WebElement current_address = driver.findElement(By.id("currentAddress"));
            current_address.sendKeys(currentAddressBox);
            Thread.sleep(50);
            action = 7;
            //
            WebElement permanent_address = driver.findElement(By.id("permanentAddress"));
            permanent_address.sendKeys(permanentAddressBox);
            Thread.sleep(50);
            action = 8;
            //
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            action = 9;
            //
            WebElement output_text = driver.findElement(By.xpath("(//div[@class='border col-md-12 col-sm-12'])[1]"));
            String print_output = output_text.getText();
            System.out.println(print_output);
            action = 10;
            //
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|-------- CSV_Test stopped after performing action " + action + " of 10 --------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
        }
    }
    @Test(description = "Prueba DemoQA Elements Text Box")
    @Story("Elements")
    @Description("Rellenar textbox")
    //
    public void JSON_Test() throws InterruptedException, IOException {
        testId = "JSON_Test";
        try {
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------ Beginning JSON_Test ----------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            String fullNameBox = getJsonValue("fullNameText_JSON");
            String emailBox = getJsonValue("emailText_JSON");
            String currentAddressBox = getJsonValue("currentAddressText_JSON");
            String permanentAddressBox = getJsonValue("permanentAddressText_JSON");
            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            action = 2;
            //
            WebElement subMenu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
            subMenu.click();
            action = 3;
            //
            // JavascriptExecutor js = (JavascriptExecutor) driver;
            // js.executeScript("window.scrollBy(0,350)", "");
            // Thread.sleep(500);
            action = 4;
            //
            WebElement full_name = driver.findElement(By.id("userName"));
            full_name.sendKeys(fullNameBox);
            Thread.sleep(50);
            action = 5;
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys(emailBox);
            Thread.sleep(50);
            action = 6;
            //
            WebElement current_address = driver.findElement(By.id("currentAddress"));
            current_address.sendKeys(currentAddressBox);
            Thread.sleep(50);
            action = 7;
            //
            WebElement permanent_address = driver.findElement(By.id("permanentAddress"));
            permanent_address.sendKeys(permanentAddressBox);
            Thread.sleep(50);
            action = 8;
            //
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            action = 9;
            //
            WebElement output_text = driver.findElement(By.xpath("(//div[@class='border col-md-12 col-sm-12'])[1]"));
            String print_output = output_text.getText();
            System.out.println(print_output);
            action = 10;
            //
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|-------- JSON_Test stopped after performing action " + action + " of 10 --------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_001 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            String url = getTagValue("demoqa", doc);
            String elementsXpath = getTagValue("elements", doc);
            String textBoxXpath = getTagValue("firstSubElement", doc);
            //
            String fullNameId = getTagValue("fullNameID_TC_001", doc);
            String emailId = getTagValue("emailID_TC_001", doc);
            String currentAddressId = getTagValue("currentAddressID_TC_001", doc);
            String permanentAddressId = getTagValue("permanentAddressID_TC_001", doc);
            String submitId = getTagValue("submitID_TC_001", doc);
            //
            String fullNameBox = getTagValue("fullNameText_TC_001", doc);
            String emailBox1 = getTagValue("emailText1_TC_001", doc);
            String emailBox2 = getTagValue("emailText2_TC_001", doc);
            String emailBox3 = getTagValue("emailText3_TC_001", doc);
            String emailBox4 = getTagValue("emailText4_TC_001", doc);
            String currentAddressBox = getTagValue("currentAddressText_TC_001", doc);
            String permanentAddressBox = getTagValue("permanentAddressText_TC_001", doc);
            //
            String outputTextXpath = getTagValue("outputTextXpath_TC_001", doc);
            //
            driver.get(url);
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath(elementsXpath));
            menu.click();
            action = 2;
            WebElement sub_menu = driver.findElement(By.xpath(textBoxXpath));
            sub_menu.click();
            action = 3;
            //
            Thread.sleep(500);
            // JavascriptExecutor js = (JavascriptExecutor) driver;
            // js.executeScript("window.scrollBy(0,350)", "");
            // action = 4;
            //
            WebElement full_name = driver.findElement(By.id(fullNameId));
            full_name.sendKeys(fullNameBox);
            action = 5;
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            action = 4;
            //
            WebElement email = driver.findElement(By.id(emailId));
            email.sendKeys(emailBox1);
            action = 6;
            WebElement submit = driver.findElement(By.id(submitId));
            submit.click();
            action = 7;
            email.clear();
            email.sendKeys(emailBox2);
            action = 8;
            submit.click();
            action = 9;
            email.clear();
            email.sendKeys(emailBox3);
            action = 10;
            submit.click();
            action = 11;
            email.clear();
            email.sendKeys(emailBox4);
            action = 12;
            //
            WebElement current_address = driver.findElement(By.id(currentAddressId));
            current_address.sendKeys(currentAddressBox);
            action = 13;
            //
            WebElement permanent_address = driver.findElement(By.id(permanentAddressId));
            permanent_address.sendKeys(permanentAddressBox);
            action = 14;
            submit.click();
            action = 15;
            //
            WebElement output_text = driver.findElement(By.xpath(outputTextXpath));
            String print_output = output_text.getText();
            System.out.println(print_output);
            action = 16;
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|--------- TC_001 stopped after performing action " + action + " of 16 ---------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_002 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            String url = getTagValue("demoqa", doc);
            String elementsXpath = getTagValue("elements", doc);
            String checkBoxXpath = getTagValue("secondSubElement", doc);
            //
            String plusPath = getTagValue("plusXpath_TC_002", doc);
            String minusPath = getTagValue("minusXpath_TC_002", doc);
            //
            String homeArrowPath = getTagValue("homeArrowXpath", doc);
            //
            String desktopArrowPath = getTagValue("desktopArrowXpath", doc);
            //
            String documentArrowPath = getTagValue("documentsArrowXpath", doc);
            String workSpaceArrowPath = getTagValue("workSpaceArrowXpath", doc);
            String officeArrowPath = getTagValue("officeArrowXpath", doc);
            //
            String downloadArrowPath = getTagValue("downloadArrowXpath", doc);
            //
            String homeBoxPath = getTagValue("homeArrowXpath", doc);
            //
            String desktopBoxPath = getTagValue("desktopArrowXpath", doc);
            //
            String documentBoxPath = getTagValue("documentsBoxXpath", doc);
            String notesBoxPath = getTagValue("notesBoxXpath", doc);
            String commandsBoxPath = getTagValue("commandsBoxXpath", doc);
            //
            String workSpaceBoxPath = getTagValue("workSpaceBoxXpath", doc);
            String reactBoxPath = getTagValue("reactBoxXpath", doc);
            String angularBoxPath = getTagValue("angularBoxXpath", doc);
            String veuBoxPath = getTagValue("veuBoxXpath", doc);
            //
            String officeBoxPath = getTagValue("officeBoxXpath", doc);
            //
            String downloadBoxPath = getTagValue("downloadBoxXpath", doc);
            //
            driver.get(url);
            action = 1;
            //  
            WebElement menu = driver.findElement(By.xpath(elementsXpath));
            menu.click();
            action = 2;
            WebElement sub_menu = driver.findElement(By.xpath(checkBoxXpath));
            sub_menu.click();
            action = 3;
            //
            WebElement plus = driver.findElement(By.xpath(plusPath));
            plus.click();
            action = 4;
            WebElement minus = driver.findElement(By.xpath(minusPath));
            minus.click();
            action = 5;
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,600)", "");
            action = 6;
            //
            WebElement home_arrow = driver.findElement(By.xpath(homeArrowPath));
            home_arrow.click();
            action = 7;
            //
            WebElement desktop_arrow = driver.findElement(By.xpath(desktopArrowPath));
            desktop_arrow.click();
            action = 8;
            //
            WebElement documents_arrow = driver.findElement(By.xpath(documentArrowPath));
            documents_arrow.click();
            action = 9;
            WebElement workSpace_arrow = driver.findElement(By.xpath(workSpaceArrowPath));
            workSpace_arrow.click();
            action = 10;
            WebElement office_arrow = driver.findElement(By.xpath(officeArrowPath));
            office_arrow.click();
            action = 11;
            //
            WebElement downloads_arrow = driver.findElement(By.xpath(downloadArrowPath));
            downloads_arrow.click();
            action = 12;
            //
            WebElement home_check_box = driver.findElement(By.xpath(homeBoxPath));
            home_check_box.click();
            action = 13;
            home_check_box.click();
            action = 14;
            //
            WebElement desktop_check_box = driver.findElement(By.xpath(desktopBoxPath));
            desktop_check_box.click();
            action = 15;
            desktop_check_box.click();
            action = 16;
            WebElement notes_check_box = driver.findElement(By.xpath(notesBoxPath));
            notes_check_box.click();
            action = 17;
            notes_check_box.click();
            action = 18;
            WebElement commands_check_box = driver.findElement(By.xpath(commandsBoxPath));
            commands_check_box.click();
            action = 19;
            commands_check_box.click();
            action = 20;
            //
            WebElement documents_check_box = driver.findElement(By.xpath(documentBoxPath));
            documents_check_box.click();
            action = 21;
            documents_check_box.click();
            action = 22;
            //
            WebElement workSpace_check_box = driver.findElement(By.xpath(workSpaceBoxPath));
            workSpace_check_box.click();
            action = 23;
            workSpace_check_box.click();
            action = 24;
            WebElement react_check_box = driver.findElement(By.xpath(reactBoxPath));
            react_check_box.click();
            action = 25;
            react_check_box.click();
            action = 26;
            WebElement angular_check_box = driver.findElement(By.xpath(angularBoxPath));
            angular_check_box.click();
            action = 27;
            angular_check_box.click();
            action = 28;
            WebElement veu_check_box = driver.findElement(By.xpath(veuBoxPath));
            veu_check_box.click();
            action = 29;
            veu_check_box.click();
            action = 30;
            //
            WebElement office_check_box = driver.findElement(By.xpath(officeBoxPath));
            office_check_box.click();
            action = 31;
            office_check_box.click();
            action = 32;
            WebElement public_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[1]"));
            public_check_box.click();
            action = 33;
            public_check_box.click();
            action = 34;
            WebElement private_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]"));
            private_check_box.click();
            action = 35;
            private_check_box.click();
            action = 36;
            WebElement classified_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]"));
            classified_check_box.click();
            action = 37;
            classified_check_box.click();
            action = 38;
            WebElement general_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"));
            general_check_box.click();
            action = 39;
            general_check_box.click();
            action = 40;
            //
            WebElement downloads_check_box = driver.findElement(By.xpath(downloadBoxPath));
            downloads_check_box.click();
            action = 41;
            downloads_check_box.click();
            action = 42;
            WebElement wordFile_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
            wordFile_check_box.click();
            action = 43;
            wordFile_check_box.click();
            action = 44;
            WebElement excelFile_check_box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
            excelFile_check_box.click();
            action = 45;
            excelFile_check_box.click();
            action = 46;
            //
            downloads_arrow = driver.findElement(By.xpath(downloadArrowPath));
            downloads_arrow.click();
            action = 47;
            office_arrow = driver.findElement(By.xpath(officeArrowPath));
            office_arrow.click();
            action = 48;
            workSpace_arrow = driver.findElement(By.xpath(workSpaceArrowPath));
            workSpace_arrow.click();
            action = 49;
            documents_arrow = driver.findElement(By.xpath(documentArrowPath));
            documents_arrow.click();
            action = 50;
            desktop_arrow = driver.findElement(By.xpath(desktopArrowPath));
            desktop_arrow.click();
            action = 51;
            home_arrow = driver.findElement(By.xpath(homeArrowPath));
            home_arrow.click();
            action = 52;
            //
            System.out.println("");
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|--------- TC_002 stopped after performing action " + action + " of 52 ---------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_003 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            action = 2;
            WebElement sub_menu = driver.findElement(By.id("item-2"));
            sub_menu.click();
            action = 3;
            //
            WebElement yes = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));
            yes.click();
            action = 4;
            //
            WebElement button = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p"));
            String selectedButton = button.getText();
            System.out.println("You have selected " + selectedButton);
            action = 5;
            //
            WebElement impressive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]"));
            impressive.click();
            action = 6;
            selectedButton = button.getText();
            System.out.println("You have selected " + selectedButton);
            action = 7;
            //
            WebElement no = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[4]"));
            no.click();
            action = 8;
            selectedButton = button.getText();
            System.out.println("You have selected " + selectedButton);
            action = 9;
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 9 ----------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_004 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            String firstNameBox = getTagValue("firstNameText_TC_004", doc);
            String firstNameBox1 = getTagValue("firstNameText1_TC_004", doc);
            String firstNameBox2 = getTagValue("firstNameText2_TC_004", doc);
            String firstNameBox3 = getTagValue("firstNameText3_TC_004", doc);
            //
            String lastNameBox = getTagValue("lastNameText_TC_004", doc);
            String lastNameBox1 = getTagValue("lastNameText1_TC_004", doc);
            String lastNameBox2 = getTagValue("lastNameText2_TC_004", doc);
            String lastNameBox3 = getTagValue("lastNameText3_TC_004", doc);
            //
            String emailBox01 = getTagValue("emailText01_TC_004", doc);
            String emailBox02 = getTagValue("emailText02_TC_004", doc);
            String emailBox03 = getTagValue("emailText03_TC_004", doc);
            String emailBox04 = getTagValue("emailText04_TC_004", doc);
            //
            String emailBox1 = getTagValue("emailText1_TC_004", doc);
            String emailBox2 = getTagValue("emailText2_TC_004", doc);
            String emailBox3 = getTagValue("emailText3_TC_004", doc);
            //
            String ageBox01 = getTagValue("ageText01_TC_004", doc);
            String ageBox02 = getTagValue("ageText02_TC_004", doc);
            //
            String ageBox1 = getTagValue("ageText1_TC_004", doc);
            String ageBox2 = getTagValue("ageText2_TC_004", doc);
            String ageBox3 = getTagValue("ageText3_TC_004", doc);
            //
            String salaryBox01 = getTagValue("salaryText01_TC_004", doc);
            String salaryBox02 = getTagValue("salaryText02_TC_004", doc);
            //
            String salaryBox1 = getTagValue("salaryText1_TC_004", doc);
            String salaryBox2 = getTagValue("salaryText2_TC_004", doc);
            String salaryBox3 = getTagValue("salaryText3_TC_004", doc);
            //
            String departmentBox = getTagValue("departmentText_TC_004", doc);
            String departmentBox1 = getTagValue("departmentText1_TC_004", doc);
            String departmentBox2 = getTagValue("departmentText2_TC_004", doc);
            String departmentBox3 = getTagValue("departmentText3_TC_004", doc);
            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            action = 2;
            WebElement sub_menu = driver.findElement(By.id("item-3"));
            sub_menu.click();
            action = 3;
            //
            Thread.sleep(500);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,450)", "");
            action = 4;
            //
            WebElement rows = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select"));
            rows.click();
            action = 5;
            //
            WebElement select_rows = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select"));
            select_rows.sendKeys(Keys.DOWN);
            action = 6;
            select_rows.sendKeys(Keys.DOWN);
            action = 7;
            select_rows.sendKeys(Keys.DOWN);
            action = 8;
            select_rows.sendKeys(Keys.DOWN);
            action = 9;
            select_rows.sendKeys(Keys.ENTER);
            action = 10;
            //\
            Thread.sleep(500);
            js.executeScript("window.scrollBy(0,5000)", "");
            action = 11;
            //
            rows.click();
            action = 12;
            select_rows.sendKeys(Keys.UP);
            action = 13;
            select_rows.sendKeys(Keys.ENTER);
            action = 14;
            //
            rows.click();
            action = 15;
            select_rows.sendKeys(Keys.UP);
            action = 16;
            select_rows.sendKeys(Keys.ENTER);
            action = 17;
            //
            rows.click();
            action = 18;
            select_rows.sendKeys(Keys.UP);
            action = 19;
            select_rows.sendKeys(Keys.ENTER);
            action = 20;
            //
            rows.click();
            action = 21;
            select_rows.sendKeys(Keys.UP);
            action = 22;
            select_rows.sendKeys(Keys.ENTER);
            action = 23;
            //
            rows.click();
            action = 24;
            select_rows.sendKeys(Keys.UP);
            action = 25;
            select_rows.sendKeys(Keys.ENTER);
            action = 26;
            //
            js.executeScript("window.scrollBy(0,-400)", "");
            action = 27;
            //
            WebElement add = driver.findElement(By.xpath("//*[@id='addNewRecordButton']"));
            add.click();
            action = 28;
            //
            WebElement first_name = driver.findElement(By.id("firstName"));
            first_name.sendKeys(firstNameBox);
            action = 29;
            WebElement last_name = driver.findElement(By.id("lastName"));
            last_name.sendKeys(lastNameBox);
            action = 30;
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys(emailBox01);
            action = 31;
            //
            WebElement age = driver.findElement(By.id("age"));
            age.sendKeys(ageBox01);
            action = 32;
            //
            WebElement salary = driver.findElement(By.id("salary"));
            salary.sendKeys(salaryBox01);
            action = 33;
            //
            WebElement department = driver.findElement(By.id("department"));
            department.sendKeys(departmentBox);
            action = 34;
            //
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            action = 35;
            email.clear();
            email.sendKeys(emailBox02);
            action = 36;
            submit.click();
            action = 37;
            email.clear();
            email.sendKeys(emailBox03);
            action = 38;
            submit.click();
            action = 39;
            email.clear();
            email.sendKeys(emailBox04);
            action = 40;
            //
            age.clear();
            age.sendKeys(ageBox02);
            action = 41;
            submit.click();
            //
            salary.clear();
            salary.sendKeys(salaryBox02);
            action = 42;
            submit.click();
            action = 43;
            //
            add.click();
            action = 44;
            WebElement first_name2 = driver.findElement(By.id("firstName"));
            first_name2.sendKeys(firstNameBox2);
            action = 45;
            WebElement last_name2 = driver.findElement(By.id("lastName"));
            last_name2.sendKeys(lastNameBox2);
            action = 46;
            WebElement email2 = driver.findElement(By.id("userEmail"));
            email2.sendKeys(emailBox2);
            action = 47;
            WebElement age2 = driver.findElement(By.id("age"));
            age2.sendKeys(ageBox2);
            action = 48;
            WebElement salary2 = driver.findElement(By.id("salary"));
            salary2.sendKeys(salaryBox2);
            action = 49;
            WebElement department2 = driver.findElement(By.id("department"));
            department2.sendKeys(departmentBox2);
            action = 50;
            WebElement submit2 = driver.findElement(By.id("submit"));
            submit2.click();
            action = 51;
            //
            add.click();
            action = 52;
            WebElement first_name3 = driver.findElement(By.id("firstName"));
            first_name3.sendKeys(firstNameBox3);
            action = 53;
            WebElement last_name3 = driver.findElement(By.id("lastName"));
            last_name3.sendKeys(lastNameBox3);
            action = 54;
            WebElement email3 = driver.findElement(By.id("userEmail"));
            email3.sendKeys(emailBox3);
            action = 55;
            WebElement age3 = driver.findElement(By.id("age"));
            age3.sendKeys(ageBox3);
            action = 56;
            WebElement salary3 = driver.findElement(By.id("salary"));
            salary3.sendKeys(salaryBox3);
            action = 57;
            WebElement department3 = driver.findElement(By.id("department"));
            department3.sendKeys(departmentBox3);
            action = 58;
            WebElement submit3 = driver.findElement(By.id("submit"));
            submit3.click();
            action = 59;
            //
            WebElement next = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[3]"));
            next.click();
            action = 60;
            //
            WebElement previous = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[1]"));
            previous.click();
            action = 61;
            //
            WebElement page = driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[1]/div/input"));
            page.clear();
            page.sendKeys("2");
            action = 62;
            page.sendKeys(Keys.ENTER);
            action = 63;
            //
            page.sendKeys(Keys.BACK_SPACE);;
            action = 64;
            page.sendKeys("1");
            action = 65;
            page.sendKeys(Keys.ENTER);
            action = 66;
            //
            WebElement edit = driver.findElement(By.xpath("//*[@id='edit-record-4']"));
            edit.click();
            action = 67;
            //
            WebElement first_name1 = driver.findElement(By.id("firstName"));
            first_name1.clear();
            first_name1.sendKeys(firstNameBox1);
            action = 68;
            WebElement last_name1 = driver.findElement(By.id("lastName"));
            last_name1.clear();
            last_name1.sendKeys(lastNameBox1);
            action = 69;
            WebElement email1 = driver.findElement(By.id("userEmail"));
            email1.clear();
            email1.sendKeys(emailBox1);
            action = 70;
            WebElement age1 = driver.findElement(By.id("age"));
            age1.clear();
            age1.sendKeys(ageBox1);
            action = 71;
            WebElement salary1 = driver.findElement(By.id("salary"));
            salary1.clear();
            salary1.sendKeys(salaryBox1);
            action = 72;
            WebElement department1 = driver.findElement(By.id("department"));
            department1.clear();
            department1.sendKeys(departmentBox1);
            action = 73;
            WebElement submit1 = driver.findElement(By.id("submit"));
            submit1.click();
            action = 74;
            //
            WebElement search_bar = driver.findElement(By.xpath("//*[@id='searchBox']"));
            search_bar.sendKeys(firstNameBox1);
            action = 75;
            WebElement search = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
            search.click();
            action = 76;
            //
            search_bar.clear();
            search_bar.sendKeys(lastNameBox2);
            action = 77;
            search.click();
            action = 78;
            //
            search_bar.clear();
            search_bar.sendKeys(emailBox3);
            action = 79;
            search.click();
            action = 80;
            //
            search_bar.clear();
            search_bar.sendKeys(ageBox1);
            action = 81;
            search.click();
            action = 82;
            //
            search_bar.clear();
            search_bar.sendKeys(salaryBox2);
            action = 83;
            search.click();
            action = 84;
            //
            search_bar.clear();
            search_bar.sendKeys(departmentBox3);
            action = 85;
            search.click();
            action = 86;
            //
            int n = 15;
            while (true) {
                search_bar.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            //
            WebElement sort1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]"));
            sort1.click();
            action = 102;
            sort1.click();
            action = 103;
            //
            WebElement sort2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[2]"));
            sort2.click();
            action = 104;
            sort2.click();
            action = 105;
            //
            WebElement sort3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]"));
            sort3.click();
            action = 106;
            sort3.click();
            action = 107;
            //
            WebElement sort4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]"));
            sort4.click();
            action = 109;
            sort4.click();
            action = 110;
            //
            WebElement sort5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[5]"));
            sort5.click();
            action = 111;
            sort5.click();
            action = 112;
            //
            WebElement sort6 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[6]"));
            sort6.click();
            action = 113;
            sort6.click();
            action = 114;
            //
            WebElement delete1 = driver.findElement(By.id("delete-record-6"));
            delete1.click();
            action = 115;
            //
            WebElement delete2 = driver.findElement(By.id("delete-record-5"));
            delete2.click();
            action = 116;
            //
            WebElement delete3 = driver.findElement(By.id("delete-record-4"));
            delete3.click();
            action = 117;
            //
            System.out.println();
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|-------- TC_004 stopped after performing action " + action + " of 117 --------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_005 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            Actions actions = new Actions(driver);
            action = 2;
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            action = 3;
            WebElement sub_menu = driver.findElement(By.id("item-4"));
            sub_menu.click();
            action = 4;
            //
            WebElement double_click = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
            actions.doubleClick(double_click).perform();
            action = 5;
            WebElement click = driver.findElement(By.id("doubleClickMessage"));
            String performedClick = click.getText();
            System.out.println("You have performed a " + performedClick);
            action = 6;
            //
            WebElement right_click = driver.findElement(By.id("rightClickBtn"));
            actions.contextClick(right_click).perform();
            action = 7;
            click = driver.findElement(By.id("rightClickMessage"));
            performedClick = click.getText();
            System.out.println("You have performed a " + performedClick);
            action = 8;
            //
            WebElement single_click = driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]"));
            single_click.click();
            action = 9;
            click = driver.findElement(By.id("dynamicClickMessage"));
            performedClick = click.getText();
            System.out.println("You have performed a " + performedClick);
            action = 10;
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|--------- TC_005 stopped after performing action " + action + " of 10 ---------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_006 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
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
            action = 1;
            WebElement sub_menu = driver.findElement(By.id("item-7"));
            sub_menu.click();
            action = 2;
            //
            WebElement download = driver.findElement(By.xpath("(//a[normalize-space()='Download'])[1]"));
            download.click();
            action = 3;
            //
            WebElement upload = driver.findElement(By.id("uploadFile"));
            upload.sendKeys("C:\\Users\\unai.ovejero.ext\\Downloads\\sampleFile.jpeg");
            action = 4;
            //
            WebElement path = driver.findElement(By.id("uploadedFilePath"));
            String filePath = path.getText();
            System.out.println(filePath);
            action = 5;
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 5 ----------|");
            System.out.println("|-------------------------------------------------------------------|");
            //

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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_007 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
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
            action = 1;
            WebElement sub_menu = driver.findElement(By.id("item-8"));
            sub_menu.click();
            action = 2;
            //
            WebElement enableAfter = driver.findElement(By.id("enableAfter"));
            enableAfter.click();
            action = 3;
            WebElement colorChange = driver.findElement(By.id("colorChange"));
            colorChange.click();
            WebElement getColor = driver.findElement(By.id("colorChange"));
            String color = colorChange.getCssValue("color");
            action = 4;
            //
            enableAfter.click();
            action = 5;
            colorChange.click();
            action = 6;
            getColor.getCssValue("color");
            System.out.println("El color es: " + color);
            action = 7;
            Thread.sleep(5000);
            WebElement visibleAfter = driver.findElement(By.id("visibleAfter"));
            visibleAfter.click();
            action = 8;
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_007 stopped after performing action " + action + " of 8 ----------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_008 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            String firstNameBox = getTagValue("firstNameText_TC_008", doc);
            String lastNameBox = getTagValue("lastNameText_TC_008", doc);
            String emailBox1 = getTagValue("emailText1_TC_008", doc);
            String emailBox2 = getTagValue("emailText2_TC_008", doc);
            String emailBox3 = getTagValue("emailText3_TC_008", doc);
            String dateOfBirthBox = getTagValue("dateOfBirthText_TC_008", doc);
            String numberBox1 = getTagValue("numberText1_TC_008", doc);
            String numberBox2 = getTagValue("numberText2_TC_008", doc);
            String subjectBox = getTagValue("subjectText_TC_008", doc);
            String picPathBox = getTagValue("picPath_TC_008", doc);
            String currentAddressBox = getTagValue("currentAddressText_TC_008", doc);

            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]"));
            menu.click();
            action = 2;
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
            sub_menu.click();
            action = 3;
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,300)", "");
            action = 4;
            //
            WebElement first_name = driver.findElement(By.id("firstName"));
            first_name.sendKeys(firstNameBox);
            action = 5;
            WebElement last_name = driver.findElement(By.id("lastName"));
            last_name.sendKeys(lastNameBox);
            action = 6;
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys(emailBox1);
            action = 7;
            //
            js.executeScript("window.scrollBy(0,50)", "");
            action = 8;
            //
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            action = 9;
            //
            email.clear();
            email.sendKeys(emailBox2);
            action = 10;
            //
            email.clear();
            email.sendKeys(emailBox3);
            action = 11;
            //
            WebElement male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
            male.click();
            action = 12;
            //
            WebElement female = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
            female.click();
            action = 13;
            //
            WebElement other = driver.findElement(By.xpath("//label[normalize-space()='Other']"));
            other.click();
            action = 14;
            //
            WebElement birthDate = driver.findElement(By.id("dateOfBirthInput"));
            //
            int n = 10;
            while (true) {
                birthDate.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            //
            birthDate.sendKeys(dateOfBirthBox);
            action = 25;
            //
            birthDate.sendKeys(Keys.ENTER);
            action = 26;
            //
            WebElement mobile = driver.findElement(By.id("userNumber"));
            mobile.sendKeys(numberBox1);
            action = 27;
            //
            submit.click();
            action = 28;
            //
            mobile.clear();
            mobile.sendKeys(numberBox2);
            action = 29;
            //
            WebElement subject = driver.findElement(By.id("subjectsInput"));
            subject.click();
            action = 30;
            subject.sendKeys(subjectBox);
            action = 31;
            subject.sendKeys(Keys.TAB);
            action = 32;
            //
            WebElement hobby1 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]"));
            hobby1.click();
            action = 33;
            //
            WebElement hobby2 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]"));
            hobby2.click();
            action = 34;
            //
            WebElement hobby3 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]"));
            hobby3.click();
            action = 35;
            //
            hobby1.click();
            action = 36;
            hobby2.click();
            action = 37;
            hobby3.click();
            action = 38;
            hobby3.click();
            action = 39;
            //
            WebElement upload = driver.findElement(By.id("uploadPicture"));
            upload.sendKeys(picPathBox);
            action = 40;
            //
            WebElement currentAdress = driver.findElement(By.id("currentAddress"));
            currentAdress.sendKeys(currentAddressBox);
            action = 41;
            //
            WebElement state = driver.findElement(By.xpath("//*[@id='state']/div/div[2]/div"));
            state.click();
            action = 42;
            WebElement stateSelect = driver.findElement(By.id("react-select-3-input"));
            stateSelect.sendKeys(Keys.ENTER);
            action = 43;
            //
            WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div"));
            city.click();
            action = 44;
            WebElement citySelect = driver.findElement(By.id("react-select-4-input"));
            citySelect.sendKeys(Keys.ENTER);
            action = 45;
            submit.click();
            action = 45;
            //
            WebElement result = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/table/tbody"));
            String output = result.getText();
            System.out.println(output);
            action = 46;
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|--------- TC_008 stopped after performing action " + action + " of 46 ---------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_009 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath("//div[3]//div[1]//div[2]"));
            menu.click();
            action = 2;
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
            sub_menu.click();
            action = 3;
            //
            WebElement newTab = driver.findElement(By.id("tabButton"));
            newTab.click();
            action = 4;
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(0));
            action = 5;
            //
            WebElement newWindow = driver.findElement(By.id("windowButton"));
            newWindow.click();
            action = 6;
            String currentWindow = driver.getWindowHandle();
            driver.switchTo().window(currentWindow);
            action = 7;
            //
            WebElement newAlert = driver.findElement(By.id("messageWindowButton"));
            newAlert.click();
            action = 8;
            String currentWindow2 = driver.getWindowHandle();
            driver.switchTo().window(currentWindow2);
            action = 9;
            //
            System.out.println();
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_009 stopped after performing action " + action + " of 9 ----------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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

    // private String getTagValue(String tag, Document doc) {
    //     NodeList nodeList = doc.getElementsByTagName(tag);
    //     if (nodeList != null && nodeList.getLength() > 0) {
    //         Node node = nodeList.item(0);
    //         return node.getTextContent();
    //     }
    //     return null;
    // }
}
//
