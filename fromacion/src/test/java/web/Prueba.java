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
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");
        //
        WebDriver driver = new ChromeDriver(chromeOptions);
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
    @Test(description = "Prueba DemoQA Elements Check box")
    @Story("Elements")
    @Description("Comprobar que todos los botones y desplegables funcionan de forma correcta.")
    //
    public void TC002_Elements2() throws InterruptedException, IOException {
        testId = "TC002_Elements2";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");
        //
        WebDriver driver = new ChromeDriver(chromeOptions);
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
    public void TC003_Elements3() throws InterruptedException, IOException {
        testId = "TC003_Elements3";
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--log-level=1");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--incognito");
        //
        WebDriver driver = new ChromeDriver(chromeOptions);
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

            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}
//
