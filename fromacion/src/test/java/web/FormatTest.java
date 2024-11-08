package web;
//
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import java.io.File;
// import java.util.ArrayList;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.interactions.Actions;
// import javax.xml.parsers.DocumentBuilder;
// import javax.xml.parsers.DocumentBuilderFactory;
// import org.w3c.dom.Document;
//
public class FormatTest extends Main {
    //
    public int action = 0;
    //
    @Test(description = "Prueba DemoQA Elements Text Box")
    @Story("Elements")
    @Description("Rellenar textbox")
    // @Category(Format_Test.class)
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\XML_Test\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\XML_Test\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\XML_Test\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\XML_Test\\0000.png"));
        } finally {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\TC_003\\Succesful.png"));
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
    // @Category("Format_Test")
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\CSV_Test\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\CSV_Test\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\CSV_Test\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\CSV_Test\\0000.png"));
        } finally {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\TC_003\\Succesful.png"));
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
    // @Category("Format_Test")
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\JSON_Test\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\JSON_Test\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\JSON_Test\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\JSON_Test\\0000.png"));
        } finally {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\TC_003\\Succesful.png"));
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|-------- JSON_Test stopped after performing action " + action + " of 10 --------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
        }
    }
}
