package web;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.interactions.Actions;

public class AlertsFramesWindows extends Main {
    //
    public int action = 0;
    //
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
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\data.xml");
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_009\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_009\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_009\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_009\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_009\\Succesful.png"));
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_010 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\data.xml");
            //
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //
            driver.get("https://demoqa.com");
            action = 1;
            //
            WebElement menu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[2]"));
            menu.click();
            action = 2;
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']"));
            sub_menu.click();
            action = 3;
            //
            WebElement alert1 = driver.findElement(By.id("alertButton"));
            alert1.click();
            action = 4;
            driver.switchTo().alert().accept();
            action = 5;
            //
            WebElement alert2 = driver.findElement(By.id("timerAlertButton"));
            alert2.click();
            action = 6;
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
            action = 7;
            //
            WebElement alert3 = driver.findElement(By.id("confirmButton"));
            alert3.click();
            action = 8;
            driver.switchTo().alert().accept();
            action = 9;
            //
            WebElement confirmResult = driver.findElement(By.id("confirmResult"));
            String confirmOutput = confirmResult.getText();
            System.out.println(confirmOutput);
            action = 10;
            //
            alert3.click();
            action = 11;
            driver.switchTo().alert().dismiss();
            action = 12;
            //
            String confirmOutput2 = confirmResult.getText();
            System.out.println(confirmOutput2);
            //
            WebElement alert4 = driver.findElement(By.id("promtButton"));
            alert4.click();
            action = 13;
            driver.switchTo().alert().sendKeys("TextTest");
            action = 14;
            driver.switchTo().alert().accept();
            action = 15;
            //
            WebElement promptResult = driver.findElement(By.id("promptResult"));
            String promptOutput = promptResult.getText();
            System.out.println(promptOutput);
            action = 16;
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_010\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_010\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_010\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_010\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_010\\Succesful.png"));
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|--------- TC_010 stopped after performing action " + action + " of 16 ---------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_011 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            action = 0;
            //
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\data.xml");
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
            WebElement sub_menu = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
            sub_menu.click();
            action = 3;
            //
            driver.switchTo().frame(driver.findElements(By.id("frame1")).get(0));
            WebElement text1 = driver.findElement(By.id("sampleHeading"));
            String output1 = text1.getText();
            action = 4;
            //
            driver.switchTo().defaultContent();
            driver.switchTo().frame(driver.findElements(By.id("frame2")).get(0));
            WebElement text2 = driver.findElement(By.tagName("h1"));
            String output2 = text2.getText();
            action = 5;
            //
            System.out.println("Texto iFrame 1: " + output1);
            System.out.println("Texto iFrame 2: " + output2);
            action = 6;
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_011\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_011\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_011\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_011\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_011\\Succesful.png"));
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_011 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
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
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\data.xml");
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_012\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_012\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_012\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_012\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_012\\Succesful.png"));
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
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\data.xml");
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_013\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_013\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_013\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_013\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_013\\Succesful.png"));
            driver.quit();
        }
    }
}
