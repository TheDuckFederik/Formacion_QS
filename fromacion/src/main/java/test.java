//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//
public class test {
    public static void main(String[] args) {
        //
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
            Thread.sleep(2000);
            WebElement sub_menu = driver.findElement(By.id("item-0"));
            sub_menu.click();
            Thread.sleep(2000);
            WebElement full_name = driver.findElement(By.id("userName"));
            full_name.sendKeys("FullNameTest");
            Thread.sleep(2000);
            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("EmailTest");
            Thread.sleep(2000);
            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
            Thread.sleep(2000);
            email.clear();
            Thread.sleep(2000);
            email.sendKeys("EmailTest@");
            Thread.sleep(2000);
            submit.click();
            Thread.sleep(2000);
            email.clear();
            Thread.sleep(2000);
            email.sendKeys("EmailTest@Test");
            Thread.sleep(2000);
            submit.click();
            Thread.sleep(2000);
            email.clear();
            Thread.sleep(2000);
            email.sendKeys("EmailTest@Test.com");
            Thread.sleep(2000);
            //This part crashes for no aparent reason, the code seems fine.
            WebElement current_adress = driver.findElement(By.id("currentAdress"));
            current_adress.sendKeys("CurrentAdressTest");
            Thread.sleep(2000);
            WebElement permanent_adress = driver.findElement(By.id("permanentAdress"));
            permanent_adress.sendKeys("PermanentAdressTest");
            Thread.sleep(2000);
            submit.click();
            Thread.sleep(2000);
            //

        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}
//
