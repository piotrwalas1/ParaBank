package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test4 {
    @Test
    public void test14() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[1]/input")).sendKeys("PiotrWalas815");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[2]/input")).sendKeys("ladnanazwa1!");
        Thread.sleep(1200);
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[2]/a")).click();


    }
}
