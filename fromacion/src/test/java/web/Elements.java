package web;
//
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
// import java.util.ArrayList;
//
public class Elements extends Main {
    //
    public int action = 0;
    //
    @Test(description = "Prueba DemoQA Elements Text Box")
    @Story("Elements")
    @Description("Rellenar textbox")
    // @Category("Elemets")
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
            String url = config.getProperty("url");
            //
            String elementsXpath = config.getProperty("elements");
            String textBoxXpath = config.getProperty("firstSubElement");
            //
            String fullNameId = config.getProperty("fullNameID_TC_001");
            String emailId = config.getProperty("emailID_TC_001");
            String currentAddressId = config.getProperty("currentAddressID_TC_001");
            String permanentAddressId = config.getProperty("permanentAddressID_TC_001");
            String submitId = config.getProperty("submitID_TC_001");

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
        } catch(IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
        } catch(WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
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
            String elementsXpath = config.getProperty("elements");
            String checkBoxXpath = config.getProperty("secondSubElement");

            //
            String plusPath = config.getProperty("plusXpath_TC_002");
            String minusPath = config.getProperty("minusXpath_TC_002");
            //
            String homeArrowPath = config.getProperty("homeArrowXpath");
            String desktopArrowPath = config.getProperty("desktopArrowXpath");
            String documentArrowPath = config.getProperty("documentsArrowXpath");
            String workSpaceArrowPath = config.getProperty("workSpaceArrowXpath");
            String officeArrowPath = config.getProperty("officeArrowXpath");
            //
            String downloadArrowPath = config.getProperty("downloadArrowXpath");
            //
            String homeBoxPath = config.getProperty("homeBoxXpath");
            String desktopBoxPath = config.getProperty("desktopBoxXpath");
            String documentBoxPath = config.getProperty("documentsBoxXpath");
            String notesBoxPath = config.getProperty("notesBoxXpath");
            String commandsBoxPath = config.getProperty("commandsBoxXpath");
            //
            String workSpaceBoxPath = config.getProperty("workSpaceBoxXpath");
            String reactBoxPath = config.getProperty("reactBoxXpath");
            String angularBoxPath = config.getProperty("angularBoxXpath");
            String veuBoxPath = config.getProperty("veuBoxXpath");
            //
            String officeBoxPath = config.getProperty("officeBoxXpath");
            String publicBoxPath = config.getProperty("publicBoxXpath");
            String privateBoxPath = config.getProperty("privateBoxXpath");
            String classifiedBoxPath = config.getProperty("classifiedBoxXpath");
            String generalBoxPath = config.getProperty("generalBoxXpath");
            String wordFileBoxPath = config.getProperty("wordFileBoxXpath");
            String excelFileBoxPath = config.getProperty("excelFileBoxXpath");
            String downloadBoxPath = config.getProperty("downloadBoxXpath");
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
            WebElement public_check_box = driver.findElement(By.xpath(publicBoxPath));
            public_check_box.click();
            action = 33;
            public_check_box.click();
            action = 34;
            WebElement private_check_box = driver.findElement(By.xpath(privateBoxPath));
            private_check_box.click();
            action = 35;
            private_check_box.click();
            action = 36;
            WebElement classified_check_box = driver.findElement(By.xpath(classifiedBoxPath));
            classified_check_box.click();
            action = 37;
            classified_check_box.click();
            action = 38;
            WebElement general_check_box = driver.findElement(By.xpath(generalBoxPath));
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
            WebElement wordFile_check_box = driver.findElement(By.xpath(wordFileBoxPath));
            wordFile_check_box.click();
            action = 43;
            wordFile_check_box.click();
            action = 44;
            WebElement excelFile_check_box = driver.findElement(By.xpath(excelFileBoxPath));
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
}
