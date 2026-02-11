package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrzeciTest {
    @Test
    public void test13() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[1]/input")).sendKeys("PiotrWalas815");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[2]/input")).sendKeys("ladnanazwa1!");
        Thread.sleep(1200);
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();
        WebElement asercja1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/h1"));
        Assert.assertEquals("Error!", asercja1.getText());
        System.out.println(asercja1.getText());

    }
}
