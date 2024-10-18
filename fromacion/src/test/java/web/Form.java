package web;
//
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
// import java.util.ArrayList;
// import org.openqa.selenium.interactions.Actions;
//
public class Form extends Main {
    //
    public int action = 0;
    //
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
            String currentAddressBox = getTagValue("currentAddressText_TC_008", doc);
            //
            String picPathBox = config.getProperty("picPath_TC_008");
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\TC_008\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\TC_008\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\TC_008\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\ScrnShts\\TC_008\\0000.png"));
        } finally{
            driver.quit();
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|--------- TC_008 stopped after performing action " + action + " of 46 ---------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
        }
    }
}
