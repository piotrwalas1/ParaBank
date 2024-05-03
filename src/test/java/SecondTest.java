import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
    public void findSeleniumTutorial(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.http://seleniumdemo.com");
    }
}
