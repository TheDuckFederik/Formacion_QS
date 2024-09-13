//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //
        String url = "https://www.demoqa.com/";
        driver.get(url);
        //
        driver.quit();
    }
}