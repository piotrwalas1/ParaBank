package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test2 {
    @Test
    public void test12() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[1]/input")).sendKeys("PiotrWalas");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[2]/input")).sendKeys("ladnehaslo1!");
        Thread.sleep(1200);
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.id("amount")).sendKeys("150");
        driver.findElement(By.id("fromAccountId")).click();
        WebElement selectAcc = driver.findElement(By.id("fromAccountId"));
        Select Acc = new Select(selectAcc);
        Acc.selectByVisibleText("23334");
        WebElement selectAcc2 = driver.findElement(By.id("toAccountId"));
        Select Acc2 = new Select(selectAcc2);
        Acc2.selectByVisibleText("23445");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/div[2]/input")).click();


    }
}
