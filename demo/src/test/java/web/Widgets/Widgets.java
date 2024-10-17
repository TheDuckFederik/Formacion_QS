package web.Widgets;

import java.io.IOException;

//
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
// import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
//
import io.qameta.allure.Description;
import io.qameta.allure.Story;

//

public class Widgets extends web.Main {
    @Test(description = "Prueba DemoQA Widgets Data Picker")
    @Story("Widgets")
    @Description("Data Picker")
    //
    public void TC014_Widgets14() throws InterruptedException, IOException {
        testId = "TC014_Widgets_14";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("DataPicker"))).click();
            Thread.sleep(1000);
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");
            //
            driver.findElement(By.id("datePickerMonthYearInput")).click();
            // Elegir año
            WebElement fecha_a = driver.findElement(By.xpath(config.getProperty("FechaAnyo")));
            Select select_a = new Select(fecha_a);
            select_a.selectByValue("2004");
            Thread.sleep(500);

            // Elegimos el mes
            WebElement fecha_m = driver.findElement(By.xpath(config.getProperty("FechaMes")));
            Select select_m = new Select(fecha_m);
            select_m.selectByValue("6");
            Thread.sleep(500);
            // Elegimos dia
            driver.findElement(By.xpath(config.getProperty("FechaDia"))).click();

            // Segundo Date
            driver.findElement(By.id("dateAndTimePickerInput")).click();
            // Desplegamos el año
            WebElement desplegable_2_a = driver.findElement(By.xpath(config.getProperty("DesplegableData1")));
            desplegable_2_a.click();
            for (int i = 0; i < 15; i++) {
                driver.findElement(By.xpath(config.getProperty("FlechaAbajo"))).click();
            }
            // Escogemos el año
            driver.findElement(By.xpath(config.getProperty("ElegirAnyo"))).click();
            Thread.sleep(500);

            // Elegimos el mes
            driver.findElement(By.xpath(config.getProperty("DesplegarMes"))).click();
            driver.findElement(By.xpath(config.getProperty("ElegirMes"))).click();
            Thread.sleep(500);
            // Elegimos dia
            driver.findElement(By.xpath(config.getProperty("ElegirDia"))).click();
            // Elegimos la hora

            driver.findElement(By.xpath(config.getProperty("ElegirHora"))).click();

            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Slider")
    @Story("Widgets")
    @Description("Slider")
    //
    public void TC015_Widgets15() throws InterruptedException, IOException {
        testId = "TC015_Widgets15";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Widgets
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("Slider"))).click();
            Thread.sleep(1000);
            // Clicamos el slider
            WebElement slider = driver.findElement(By.xpath(config.getProperty("SliderBar")));
            slider.click();
            // Movemos a la izquierda
            for (int i = 0; i < 50; i++) {
                slider.sendKeys(Keys.ARROW_LEFT);
            }
            // Movemos a la derecha
            for (int i = 0; i < 100; i++) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Slider")
    @Story("Widgets")
    @Description("Progres Bar")
    //
    public void TC016_Widgets16() throws InterruptedException, IOException {
        testId = "TC016_Widgets16";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            WebElement entrar = driver.findElement(By.xpath(config.getProperty("ProgressBar")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", entrar);
            entrar.click();
            Thread.sleep(1000);
            // Le damos click
            driver.findElement(By.id("startStopButton")).click();
            // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(5000);
            driver.findElement(By.id("startStopButton")).click();
            Thread.sleep(990);
            driver.findElement(By.id("startStopButton")).click();
            Thread.sleep(6000);
            driver.findElement(By.id("resetButton")).click();
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Menu")
    @Story("Widgets")
    @Description("Menu")
    //
    public void TC017_Widgets17() throws InterruptedException, IOException {
        testId = "TC017_Widgets17";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            WebElement entrar = driver.findElement(By.xpath(config.getProperty("Menu")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", entrar);
            entrar.click();
            Thread.sleep(500);
            // Le damos click Main 1
            driver.findElement(By.xpath(config.getProperty("Item1Menu"))).click();
            Thread.sleep(500);
            // Le damos click Main 3
            driver.findElement(By.xpath(config.getProperty("Item3Menu"))).click();
            Thread.sleep(500);
            // Le damos click Main 2
            driver.findElement(By.xpath(config.getProperty("Item2Menu"))).click();
            Thread.sleep(500);
            // Le damos click sub item
            driver.findElement(By.xpath(config.getProperty("Subitem1"))).click();
            Thread.sleep(500);
            // Le damos click sub item
            driver.findElement(By.xpath(config.getProperty("SubItem2"))).click();
            Thread.sleep(500);
            // Le damos click Sub sub list
            driver.findElement(By.xpath(config.getProperty("SubSubItem"))).click();
            Thread.sleep(500);
            // Le damos click Sub sub list 1
            driver.findElement(By.xpath(config.getProperty("SubSubItem1"))).click();
            Thread.sleep(500);
            // Le damos click Sub sub list 2
            driver.findElement(By.xpath(config.getProperty("SubSubItem2"))).click();
            Thread.sleep(500);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Widgets Select Menu")
    @Story("Widgets")
    @Description("Select Menu")
    //
    public void TC018_Widgets18() throws InterruptedException, IOException {
        testId = "TC018_Widgets18";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Widgets"))).click();
            Thread.sleep(1000);
            // Entramos al item
            WebElement entrar = driver.findElement(By.xpath(config.getProperty("SelectMenu")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", entrar);
            entrar.click();
            // Introducios texto en el primer campo
            Thread.sleep(500);
            driver.findElement(By.id("react-select-2-input"))
                    .sendKeys(web.Main.getTagValue("PrimeraOpcionOption_Select_Menu_TC_018", web.Main.doc) + Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.id("react-select-2-input"))
                    .sendKeys(web.Main.getTagValue("SegundaOpcionOption_Select_Menu_TC_018", web.Main.doc) + Keys.ENTER);
            Thread.sleep(500);

            // Introducimos texto en el segundo campo
            driver.findElement(By.id("react-select-3-input"))
                    .sendKeys(web.Main.getTagValue("PrimeraOpcionTitle_Select_Menu_TC_018", web.Main.doc) + Keys.ENTER);
            Thread.sleep(500);
            driver.findElement(By.id("react-select-3-input"))
                    .sendKeys(web.Main.getTagValue("SegundaOpcionTilte_Select_Menu_TC_018", web.Main.doc) + Keys.ENTER);

            // Elegimos color
            driver.findElement(By.xpath(config.getProperty("PrimerColor"))).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(config.getProperty("SegundoColor"))).click();
            Thread.sleep(500);

            // Seleccion multiple
            WebElement seleccionMultiple = driver.findElement(By.id("react-select-4-input"));
            js.executeScript("arguments[0].scrollIntoView(true);", seleccionMultiple);
            seleccionMultiple.sendKeys(web.Main.getTagValue("PrimerColor_Select_Menu_TC_018", web.Main.doc) + Keys.ENTER);
            seleccionMultiple.sendKeys(web.Main.getTagValue("SegundoColor_Select_Menu_TC_018", web.Main.doc) + Keys.ENTER);
            seleccionMultiple.sendKeys(web.Main.getTagValue("TercerColor_Select_Menu_TC_018", web.Main.doc) + Keys.ENTER);
            seleccionMultiple.sendKeys(web.Main.getTagValue("CuartoColor_Select_Menu_TC_018", web.Main.doc) + Keys.ENTER);
            Thread.sleep(500);
            // Le damos a la cruz
            driver.findElement(By.xpath(config.getProperty("Cruz"))).click();
            Thread.sleep(1000);

            // Le damos al Standar multi select
            Actions actions = new Actions(driver);

            WebElement multiSelectVolvo = driver.findElement(By.xpath("//*[@id='cars']/option[1]"));
            WebElement multiSelectAudi = driver.findElement(By.xpath("//*[@id='cars']/option[4]"));
            // Accion con el control
            actions.keyDown(Keys.CONTROL)
                    .click(multiSelectVolvo)
                    .click(multiSelectAudi)
                    .keyUp(Keys.CONTROL)
                    .build()
                    .perform();
            Thread.sleep(1000);
            // Accion con el shift
            actions.keyDown(Keys.SHIFT)
                    .click(multiSelectVolvo)
                    .click(multiSelectAudi)
                    .keyUp(Keys.SHIFT)
                    .build()
                    .perform();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
