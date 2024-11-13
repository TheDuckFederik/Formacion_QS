package web;

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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
// import java.util.ArrayList;

public class Widgets extends Main {
    //
    public int action = 0;
    //
    @Test(description = "Prueba DemoQA Widgets Date Picker.")
    @Story("Widgets")
    @Description("Comprobar la funcionalidad de los campos y los formatos.")
    //
    public void TC014_Date_Picker() throws InterruptedException, IOException {
        testId = "TC014_Date_Picker";
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_014\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_014\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_014\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_014\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_014\\Succesful.png"));
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
            File inputFile = new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\data.xml");
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_015\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_015\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_015\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_015\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_015\\Succesful.png"));
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_016\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_016\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_016\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_016\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_016\\Succesful.png"));
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_017\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_017\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_017\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_017\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_017\\Succesful.png"));
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
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_018\\0001.png"));
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_018\\0002.png"));
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_018\\0003.png"));
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_018\\0000.png"));
        } finally{
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\formacion\\assets\\ScrnShts\\TC_018\\Succesful.png"));
            driver.quit();
        }
    }
}
