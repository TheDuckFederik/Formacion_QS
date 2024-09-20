package web;
//
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.ArrayList;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
// import io.appium.java_client.android.nativekey.KeyEvent;
// import io.appium.java_client.android.nativekey.KeyEvent;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.testng.Assert;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
//
public class Prueba extends Main {
    //
    @Test(description = "Prueba DemoQA Elements Text Box")
    @Story("Elements")
    @Description("Rellenar textbox")
    //
    public void TC001_Text_Box() throws InterruptedException, IOException {
        testId = "TC001_Text_Box";
        //
        try{
            driver.get("https://demoqa.com");
            //
            WebElement menu = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
            menu.click();
            Thread.sleep(500);
            WebElement sub_menu = driver.findElement(By.id("item-0"));
            sub_menu.click();
            Thread.sleep(500);
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            Thread.sleep(500);
            //
            WebElement full_name = driver.findElement(By.id("userName"));
            full_name.sendKeys("FullNameTest");
            Thread.sleep(500);
            //
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailTest");
            Thread.sleep(500);
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
            WebElement current_address = driver.findElement(By.id("currentAddress"));
            current_address.sendKeys("CurrentAddressTest");
            Thread.sleep(500);
            //
            WebElement permanent_address = driver.findElement(By.id("permanentAddress"));
            permanent_address.sendKeys("PermanentAddressTest");
            submit.click();
            Thread.sleep(500);
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
    @Description("Comprobar que la descraga y la subida de archivos funciona correctamente.")
    //
    public void TC009_Browser_Windows() throws InterruptedException, IOException {
        testId = "TC009_Browser_Windows";
        //
        try{
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
    @Story("Alerts")
    @Description("Comprobar que la descraga y la subida de archivos funciona correctamente.")
    //
    public void TC010_Alerts() throws InterruptedException, IOException {
        testId = "TC010_Alerts";
        //
        try{
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
}
//
