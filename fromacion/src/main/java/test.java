import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/unai.ovejero.ext/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.demoqa.com/";
        driver.get(url);

        WebElement element = driver.findElement(By.className("Main"));

        String text = element.getText();

        System.out.println(text);

        driver.quit();
    }
}