package web;
//
import java.io.IOException;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
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
// import java.util.ArrayList;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.interactions.Actions;
// import javax.xml.parsers.DocumentBuilder;
// import javax.xml.parsers.DocumentBuilderFactory;
// import org.w3c.dom.Document;
//
public class ORN extends Main {
    //
    public int action = 0;
    public int totalActions = 0;
    //
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC001() throws InterruptedException, IOException {
        testId = "ORN_TC001";
        try {
            //
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_001 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String url = config.getProperty("url");
            String usernameP = config.getProperty("TC001_username");
            String passwordP = config.getProperty("TC001_password");
            String loginP = config.getProperty("TC001_login");
            //
            String usernameT = getTagValue("username", doc);
            String passwordT = getTagValue("password", doc);
            //
            driver.get(url);
            Thread.sleep(3000);
            action = 1;
            //
            WebElement username = driver.findElement(By.xpath(usernameP));
            username.sendKeys(usernameT);
            action = 2;
            //
            WebElement password = driver.findElement(By.xpath(passwordP));
            password.sendKeys(passwordT);
            action = 3;
            //
            WebElement login = driver.findElement(By.xpath(loginP));
            login.click();
            Thread.sleep(5000);
            action = 4;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC002() throws InterruptedException, IOException {
        testId = "ORN_TC002";
        try {
            //
            ORN_TC001();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_002 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String pimP = config.getProperty("TC002_PIM");
            //
            WebElement pim = driver.findElement(By.xpath(pimP));
            pim.click();
            Thread.sleep(1000);
            action = 1;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC003() throws InterruptedException, IOException {
        testId = "ORN_TC003";
        try {
            //
            ORN_TC002();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_003 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String addP = config.getProperty("TC003_Add");
            String fnP = config.getProperty("TC003_FirstName");
            String mnP = config.getProperty("TC003_MiddleName");
            String lnP = config.getProperty("TC003_LastName");
            String idP = config.getProperty("TC003_ID");
            String saveP = config.getProperty("TC003_Save");
            //
            String fnT = getTagValue("TC003_fistName", doc);
            String mnT = getTagValue("TC003_middleName", doc);
            String lnT = getTagValue("TC003_lastName", doc);
            String idT = getTagValue("TC003_id", doc);
            //
            WebElement add = driver.findElement(By.xpath(addP));
            add.click();
            Thread.sleep(1000);
            action = 1;
            //
            WebElement fn = driver.findElement(By.xpath(fnP));
            fn.sendKeys(fnT);
            action = 2;
            //
            WebElement mn = driver.findElement(By.xpath(mnP));
            mn.sendKeys(mnT);
            action = 3;
            //
            WebElement ln = driver.findElement(By.xpath(lnP));
            ln.sendKeys(lnT);
            action = 4;
            //
            WebElement id = driver.findElement(By.xpath(idP));
            int n = 4;
            while (true) {
                id.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            id.sendKeys(idT);
            action = 5;
            //
            WebElement save = driver.findElement(By.xpath(saveP));
            save.click();
            Thread.sleep(5000);
            action = 6;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\0001.png"));
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\0002.png"));
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\0003.png"));
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\0000.png"));
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC004() throws InterruptedException, IOException {
        testId = "ORN_TC004";
        try {
            //
            ORN_TC002();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_004 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String idPath = config.getProperty("TC004_ID");
            String searchP= config.getProperty("TC004_Search");
            String recordsP = config.getProperty("TC004_Records");
            String name1P = config.getProperty("TC004_Name1");
            String name2P = config.getProperty("TC004_Name2");
            //
            String idT = getTagValue("TC004_id", doc);
            //
            WebElement id = driver.findElement(By.xpath(idPath));
            id.sendKeys(idT);
            Thread.sleep(1000);
            action = 1;
            //
            WebElement search = driver.findElement(By.xpath(searchP));
            search.click();
            Thread.sleep(500);
            action = 2;
            //
            String recordsT = driver.findElement(By.xpath(recordsP)).getText();
            action = 3;
            System.out.println("Los resultados son: " + recordsT);
            //
            String name1T = driver.findElement(By.xpath(name1P)).getText();
            String name2T = driver.findElement(By.xpath(name2P)).getText();
            action = 4;
            //
            System.out.println("Nombre: " + name1T + " " + name2T);
            Thread.sleep(5000);
            action = 5;
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC005() throws InterruptedException, IOException {
        testId = "ORN_TC005";
        try {
            //
            ORN_TC004();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_005 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String editP = config.getProperty("TC005_Edit");
            String fnP = config.getProperty("TC005_FirstName");
            String mnP = config.getProperty("TC005_MiddleName");
            String lnP = config.getProperty("TC005_LastName");
            String saveP = config.getProperty("TC005_Save");
            //
            String fnT = getTagValue("TC005_fistName", doc);
            String mnT = getTagValue("TC005_middleName", doc);
            String lnT = getTagValue("TC005_lastName", doc);
            //
            WebElement edit = driver.findElement(By.xpath(editP));
            edit.click();
            Thread.sleep(1000);
            action = 1;
            //
            WebElement fn = driver.findElement(By.xpath(fnP));
            int n = 13;
            while (true) {
                fn.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            fn.sendKeys(fnT);
            action = 2;
            //
            WebElement mn = driver.findElement(By.xpath(mnP));
            n = 14;
            while (true) {
                mn.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            mn.sendKeys(mnT);
            action = 3;
            //
            WebElement ln = driver.findElement(By.xpath(lnP));
            n = 12;
            while (true) {
                ln.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            ln.sendKeys(lnT);
            action = 4;
            //
            WebElement save = driver.findElement(By.xpath(saveP));
            save.click();
            Thread.sleep(5000);
            action = 5;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC006() throws InterruptedException, IOException {
        testId = "ORN_TC006";
        try {
            //
            ORN_TC004();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_006 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String deleteP = config.getProperty("TC006_Delete");
            String confirmP = config.getProperty("TC006_Confirm");
            //
            WebElement delete = driver.findElement(By.xpath(deleteP));
            delete.click();
            Thread.sleep(1000);
            action = 1;
            //
            WebElement confirm = driver.findElement(By.xpath(confirmP));
            confirm.click();
            Thread.sleep(1000);
            action = 2;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC007() throws InterruptedException, IOException {
        testId = "ORN_TC007";
        try {
            //
            ORN_TC001();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_007 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String leaveP = config.getProperty("TC007_Leave");
            //
            WebElement leave = driver.findElement(By.xpath(leaveP));
            leave.click();
            Thread.sleep(1000);
            action = 1;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC007\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_007 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC007\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_007 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC007\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_007 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC007\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_007 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC007\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_007 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC008() throws InterruptedException, IOException {
        testId = "ORN_TC008";
        try {
            //
            ORN_TC007();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_008 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String applyP = config.getProperty("TC008_Apply");
            String ltP = config.getProperty("TC008_LeaveType");
            String fdP = config.getProperty("TC008_FromDate");
            String tdP = config.getProperty("TC008_ToDate");
            String pdP = config.getProperty("TC008_PartialDays");
            String edP = config.getProperty("TC008_EndDay");
            String commentsP = config.getProperty("TC008_Comments");
            String acP = config.getProperty("TC008_ApplyChanges");
            //
            String fdT = getTagValue("TC008_FromDate", doc);
            String tdT = getTagValue("TC008_ToDate", doc);
            String commentsT = getTagValue("TC008_Comments", doc);
            //
            WebElement apply = driver.findElement(By.xpath(applyP));
            apply.click();
            Thread.sleep(1500);
            action = 1;
            //
            WebElement lt = driver.findElement(By.xpath(ltP));
            lt.click();
            lt.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(500);
            action = 2;
            //
            WebElement fd = driver.findElement(By.xpath(fdP));
            fd.sendKeys(fdT);
            Thread.sleep(1000);
            action = 3;
            //
            WebElement td = driver.findElement(By.xpath(tdP));
            td.click();
            int n = 10;
            while (true) {
                td.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            td.sendKeys(tdT);
            td.sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            action = 4;
            //
            WebElement pd = driver.findElement(By.xpath(pdP));
            pd.click();
            pd.sendKeys(Keys.ARROW_DOWN);
            pd.sendKeys(Keys.ARROW_DOWN);
            pd.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(5000);
            action = 5;
            //
            WebElement ed = driver.findElement(By.xpath(edP));
            ed.click();
            ed.sendKeys(Keys.ARROW_DOWN);
            ed.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(5000);
            action = 6;
            //
            WebElement comments = driver.findElement(By.xpath(commentsP));
            comments.sendKeys(commentsT);
            Thread.sleep(1000);
            action = 7;
            //
            WebElement ac = driver.findElement(By.xpath(acP));
            ac.click();
            action = 8;
            Thread.sleep(5000);
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC008\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_008 stopped after performing action " + action + " of 8 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC008\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_008 stopped after performing action " + action + " of 8 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC008\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_008 stopped after performing action " + action + " of 8 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC008\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_008 stopped after performing action " + action + " of 8 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC008\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_008 stopped after performing action " + action + " of 8 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC009() throws InterruptedException, IOException {
        testId = "ORN_TC009";
        try {
            //
            ORN_TC007();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_009 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String optionsP = config.getProperty("TC009_Options");
            String cancelP = config.getProperty("TC009_Cancel");
            //
            WebElement options = driver.findElement(By.xpath(optionsP));
            options.click();
            Thread.sleep(500);
            action = 1;
            //
            WebElement cancel = driver.findElement(By.xpath(cancelP));
            cancel.click();
            Thread.sleep(500);
            action = 2;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC009\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_009 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC009\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_009 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC009\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_009 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC009\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_009 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC009\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_009 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC010() throws InterruptedException, IOException {
        testId = "ORN_TC010";
        try {
            //
            ORN_TC007();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_010 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String entitlementP = config.getProperty("TC010_Entitlements");
            String aeP = config.getProperty("TC010_AddEntitlements");
            String enP = config.getProperty("TC010_EmployeeName");
            String ltP = config.getProperty("TC010_LeaveType");
            String lpP = config.getProperty("TC010_LeavePeriod");
            String eaP = config.getProperty("TC010_EntitlementAmount");
            String saveP = config.getProperty("TC010_Save");
            String confimP = config.getProperty("TC010_Confirm");
            //
            String enT = getTagValue("TC010_EmployeeName", doc);
            String eaT = getTagValue("TC010_EntitlementAmount", doc);
            //
            WebElement entitlement = driver.findElement(By.xpath(entitlementP));
            entitlement.click();
            Thread.sleep(500);
            action = 1;
            //
            WebElement ae = driver.findElement(By.xpath(aeP));
            ae.click();
            Thread.sleep(500);
            action = 2;
            //
            WebElement en = driver.findElement(By.xpath(enP));
            en.click();
            en.sendKeys(enT);
            Thread.sleep(1500);
            en.sendKeys(Keys.DOWN);
            en.sendKeys(Keys.RETURN);
            Thread.sleep(500);
            action = 3;
            //
            WebElement lt = driver.findElement(By.xpath(ltP));
            lt.click();
            int n = 5;
            while (true) {
                lt.sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            lt.sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            action = 4;
            //
            WebElement lp = driver.findElement(By.xpath(lpP));
            lp.click();
            n = 6;
            while (true) {
                lp.sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            lp.sendKeys(Keys.RETURN);
            Thread.sleep(1000);
            action = 5;
            //
            WebElement ea = driver.findElement(By.xpath(eaP));
            ea.sendKeys(eaT);
            Thread.sleep(500);
            action = 6;
            //
            WebElement save = driver.findElement(By.xpath(saveP));
            save.click();
            Thread.sleep(500);
            action = 7;
            //
            WebElement confim = driver.findElement(By.xpath(confimP));
            confim.click();
            Thread.sleep(1500);
            action = 8;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC010\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_010 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC010\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_010 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC010\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_010 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC010\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_010 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC010\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_010 stopped after performing action " + action + " of 3 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC011() throws InterruptedException, IOException {
        testId = "ORN_TC011";
        try {
            //
            ORN_TC007();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_011 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String applyP = config.getProperty("TC011_Apply");
            String acP = config.getProperty("TC011_ApplyChanges");
            //
            WebElement apply = driver.findElement(By.xpath(applyP));
            apply.click();
            Thread.sleep(1500);
            action = 1;
            //
            WebElement ac = driver.findElement(By.xpath(acP));
            ac.click();
            action = 2;
            Thread.sleep(200);
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC011\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_011 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC011\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_011 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC011\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_011 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC011\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_011 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC011\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_011 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC012() throws InterruptedException, IOException {
        testId = "ORN_TC012";
        try {
            //
            ORN_TC007();
            action = 0;
            totalActions = 6;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_012 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String configureP = config.getProperty("TC012_Configure");
            String ltP = config.getProperty("TC012_Leave_Type");
            String addP = config.getProperty("TC012_Add");
            String nameP = config.getProperty("TC012_Name");
            String iesP = config.getProperty("TC012_Is_Entitlement_Situational");
            String saveP = config.getProperty("TC012_Save");
            //
            String nameT = getTagValue("TC012_Name", doc);
            //
            WebElement configure = driver.findElement(By.xpath(configureP));
            configure.click();
            action = 1;
            Thread.sleep(500);
            //
            WebElement lt = driver.findElement(By.xpath(ltP));
            lt.click();
            action = 2;
            Thread.sleep(1000);
            //
            WebElement add = driver.findElement(By.xpath(addP));
            add.click();
            action = 3;
            Thread.sleep(1000);
            //
            WebElement name = driver.findElement(By.xpath(nameP));
            name.sendKeys(nameT);
            action = 4;
            Thread.sleep(500);
            //
            WebElement ies = driver.findElement(By.xpath(iesP));
            ies.click();
            action = 5;
            Thread.sleep(500);
            //
            WebElement save = driver.findElement(By.xpath(saveP));
            save.click();
            action = 6;
            Thread.sleep(10000);
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC012\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_012 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC012\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_012 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC012\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_012 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC012\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_012 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC012\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_012 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC013() throws InterruptedException, IOException {
        testId = "ORN_TC013";
        try {
            //
            ORN_TC007();
            action = 0;
            totalActions = 6;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_013 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String alP = config.getProperty("TC013_Assign_Leave");
            String enP = config.getProperty("TC013_Employee_Name");
            String ltP = config.getProperty("TC013_Leave_Type");
            String fdP = config.getProperty("TC013_FromDate");
            String tdP = config.getProperty("TC013_To_Date");
            String commentsP = config.getProperty("TC013_Comments");
            String assignP = config.getProperty("TC013_Assign");
            //
            String enT = getTagValue("TC013_Employee_Name", doc);
            String fdT = getTagValue("TC013_From_Date", doc);
            String tdT = getTagValue("TC013_To_Date", doc);
            String commentsT = getTagValue("TC013_To_Date", doc);
            //
            WebElement al = driver.findElement(By.xpath(alP));
            al.click();
            action = 1;
            Thread.sleep(500);
            //
            WebElement en = driver.findElement(By.xpath(enP));
            en.sendKeys(enT);
            Thread.sleep(1000);
            en.sendKeys(Keys.ARROW_DOWN);
            en.sendKeys(Keys.RETURN);
            action = 2;
            Thread.sleep(500);
            //
            WebElement lt = driver.findElement(By.xpath(ltP));
            int n = 5;
            while (true) {
                lt.sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            lt.sendKeys(Keys.RETURN);
            Thread.sleep(500);
            action = 3; 
            //
            WebElement comments = driver.findElement(By.xpath(commentsP));
            comments.sendKeys(commentsT);
            Thread.sleep(500);
            action = 4;
            //
            WebElement fd = driver.findElement(By.xpath(fdP));
            fd.sendKeys(fdT);
            Thread.sleep(500);
            action = 5;
            //
            WebElement td = driver.findElement(By.xpath(tdP));
            td.sendKeys(tdT);
            Thread.sleep(500);
            action = 6;
            //
            WebElement assign = driver.findElement(By.xpath(assignP));
            assign.click();
            Thread.sleep(500);
            action = 6;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC013\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_013 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC013\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_013 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC013\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_013 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC013\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_013 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC013\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_013 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC014() throws InterruptedException, IOException {
        testId = "ORN_TC014";
        try {
            //
            ORN_TC012();
            action = 0;
            totalActions = 3;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_014 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String editP = config.getProperty("TC014_Edit");
            String nameP = config.getProperty("TC014_Name");
            String saveP = config.getProperty("TC014_Save");
            //
            String nameT = getTagValue("TC014_Name", doc);
            //
            WebElement edit = driver.findElement(By.xpath(editP));
            edit.click();
            action = 1;
            Thread.sleep(500);
            //
            WebElement name = driver.findElement(By.xpath(nameP));
            name.sendKeys(nameT);
            action = 2;
            Thread.sleep(500);
            //
            WebElement save = driver.findElement(By.xpath(saveP));
            save.click();
            action = 3;
            Thread.sleep(500);
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC014\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_014 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC014\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_014 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC014\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_014 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC014\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_014 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC014\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_014 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC015() throws InterruptedException, IOException {
        testId = "ORN_TC015";
        try {
            //
            ORN_TC001();
            action = 0;
            totalActions = 1;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_015 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String recruitmentP = config.getProperty("TC015_Recruitment");
            //
            WebElement recruitment = driver.findElement(By.xpath(recruitmentP));
            recruitment.click();
            Thread.sleep(1000);
            action = 1;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC015() throws InterruptedException, IOException {
        testId = "ORN_TC015";
        try {
            //
            ORN_TC001();
            action = 0;
            totalActions = 1;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_015 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String recruitmentP = config.getProperty("TC015_Recruitment");
            //
            WebElement recruitment = driver.findElement(By.xpath(recruitmentP));
            recruitment.click();
            Thread.sleep(1000);
            action = 1;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC015\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_015 stopped after performing action " + action + " of " + totalActions + " ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
}
