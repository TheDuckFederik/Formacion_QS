package web.Alerts_Frames__Windows;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.Alert;
//

//
import java.util.Set;
//

public class Alerts_Frames__Windows extends web.Main {

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Browser Windows")
    @Story("Alerts, Frame & Windows")
    @Description("Browser Windows")
    //
    public void TC009_Alerts_Frame_Windows9() throws InterruptedException, IOException {
        testId = "TC009_Alerts_Frame_&_Windows9";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));

            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);

            // Entramos al primer item (Browser Windows)
            driver.findElement(By.xpath(config.getProperty("Browser_windows"))).click();
            Thread.sleep(1000);

            // Guardamos el identificador de la ventana original
            String originalWindow = driver.getWindowHandle();

            // Acción con el primer botón: Abrir nueva pestaña
            WebElement botonNuevaPestaña = driver.findElement(By.id("tabButton"));
            botonNuevaPestaña.click();
            Thread.sleep(2000);

            // Obtener todos los identificadores de ventanas/pestañas
            Set<String> allWindows = driver.getWindowHandles();
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    // Cambiamos a la nueva pestaña
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            // Cerramos la nueva pestaña
            driver.close();
            Thread.sleep(2000);

            // Volver a la ventana original
            driver.switchTo().window(originalWindow);

            // Acción con el segundo botón: Abrir nueva ventana
            WebElement botonNuevaVentana = driver.findElement(By.id("windowButton"));
            botonNuevaVentana.click();
            Thread.sleep(2000);

            // Obtener nuevamente todos los identificadores de ventanas
            allWindows = driver.getWindowHandles();
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    // Cambiamos a la nueva ventana
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            // Cerramos la nueva ventana
            driver.close();
            Thread.sleep(2000);

            // Volver a la ventana original
            driver.switchTo().window(originalWindow);

            WebElement botonNuevaVentana2 = driver.findElement(By.id("messageWindowButton"));
            botonNuevaVentana2.click();
            Thread.sleep(2000);

            // Obtener nuevamente todos los identificadores de ventanas
            allWindows = driver.getWindowHandles();
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(originalWindow)) {
                    // Cambiamos a la nueva ventana
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            // Cerramos la nueva ventana
            driver.close();
            Thread.sleep(2000);

            // Volver a la ventana original
            driver.switchTo().window(originalWindow);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Alerts")
    @Story("Alerts, Frame & Windows")
    @Description("Alerts")
    //
    public void TC010_Alerts_Frame_Windows10() throws InterruptedException, IOException {
        testId = "TC010_Alerts,_Frame_&_Windows10";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("ItemAlerts"))).click();
            Thread.sleep(1000);

            // Primer boton
            driver.findElement(By.id("alertButton")).click();
            Thread.sleep(500);
            driver.switchTo().alert().accept();

            // Segundo boton
            driver.findElement(By.id("timerAlertButton")).click();
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
            Thread.sleep(500);

            // Tercer boton
            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(1000);
            driver.switchTo().alert().dismiss();
            Thread.sleep(1000);
            // Cuarto boton
            // Le do al acceptar

            // Hacer clic en el botón que abre la alerta
            driver.findElement(By.xpath(config.getProperty("PromBoton"))).click();
            Thread.sleep(1000);

            // Cambiar el foco a la alerta y enviar el texto
            Alert promptAlert = driver.switchTo().alert();
            promptAlert.sendKeys(web.Main.getTagValue("MensajePromp_Alerts_TC_010", web.Main.doc));

            Thread.sleep(1000);
            // Aceptar la alerta
            driver.switchTo().alert().accept();

            // Para la acción de cancelar
            driver.findElement(By.xpath(config.getProperty("PromBoton"))).click();
            Thread.sleep(1000);

            // Cambiar el foco a la alerta nuevamente y enviar el texto
            driver.switchTo().alert().sendKeys(web.Main.getTagValue("MensajePromp_Alerts_TC_010", web.Main.doc));

            // Cancelar la alerta
            driver.switchTo().alert().dismiss();
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Frames")
    //
    public void TC011_Alerts_Frame_Windows11() throws InterruptedException, IOException {
        testId = "TC011_Alerts_Frame_&_Windows11";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("Frames"))).click();
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 444);");
            // Entrar al primer Frame y coger el texto.
            driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

            WebElement h1Element = driver.findElement(By.tagName("h1"));
            Thread.sleep(1000);
            String h1Text = h1Element.getText();
            System.out.println("El texto del h1 es: " + h1Text);

            driver.switchTo().defaultContent();
            // Entrar al primer Frame y coger el texto.
            driver.switchTo().frame(driver.findElement(By.id("frame2")));

            // Buscar el h1 dentro del segundo iframe y obtener su texto
            WebElement h1Element2 = driver.findElement(By.tagName("h1"));
            String h1Text2 = h1Element2.getText();
            System.out.println("El texto del h1 en el segundo iframe es: " + h1Text2);

            // Volver al contenido principal
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Nested Frames")
    @Story("Alerts, Frame & Windows")
    @Description("Nested Frames")
    //
    public void TC012_Alerts_Frame_Windows12() throws InterruptedException, IOException {
        testId = "TC012_Alerts_Frame_&_Windows12";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("Nasted_Frames"))).click();
            Thread.sleep(1000);
            // Entrar al primer Frame y coger el texto.
            driver.switchTo().frame(driver.findElement(By.id("frame1")));
            WebElement primer = driver.findElement(By.xpath(config.getProperty("Nasted_Body")));
            System.out.println("Texto padre: " + primer.getText());
            // Entrar al segundo frame y coger el texto.
            driver.switchTo().frame(driver.findElements(By.xpath(config.getProperty("segundo_Frame"))).get(0));
            WebElement segundo = driver.findElement(By.xpath(config.getProperty("Nasted_p")));
            System.out.println("Texto hijo: " + segundo.getText());
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test(description = "Prueba DemoQA Alerts, Frame & Windows Modal Dialogs")
    @Story("Alerts, Frame & Windows")
    @Description("Modal Dialogs")
    //
    public void TC013_Alerts_Frame_Windows13() throws InterruptedException, IOException {
        testId = "TC013_Alerts_Frame_&_Windows13";

        //
        try {
            // Entramos a demoqa
            driver.get(config.getProperty("urlPrincipal"));
            // Entramos al Alerts, Frames & Windows
            driver.findElement(By.xpath(config.getProperty("Alerts"))).click();
            Thread.sleep(1000);
            // Entramos al item
            driver.findElement(By.xpath(config.getProperty("ModalDia"))).click();
            Thread.sleep(1000);
            // Entrar al primer boton y coger el texto.
            driver.findElement(By.id("showSmallModal")).click();
            Thread.sleep(1000);
            WebElement Primer_texto = driver.findElement(By.xpath(config.getProperty("PrimerTextoModal")));
            String texto1 = Primer_texto.getText();
            System.out.println("Small modal: " + texto1);
            // Cerrar alerta
            driver.findElement(By.id("closeSmallModal")).click();
            // Entramos al segundo boton y cogemos el texto
            driver.findElement(By.id("showLargeModal")).click();
            Thread.sleep(1000);
            WebElement Segund_texto = driver.findElement(By.xpath(config.getProperty("SegundoTextoModal")));
            String texto2 = Segund_texto.getText();
            System.out.println("Large modal : " + texto2);
            // Cerrar alerta
            driver.findElement(By.id("closeLargeModal")).click();

            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
