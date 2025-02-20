package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test1 {
    @Test
   public void test11(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        int randomNumber = (int) (Math.random()*1000);
        String email = "PiotrWalas" + randomNumber;
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Piotr");
        driver.findElement(By.id("customer.lastName")).sendKeys("Walas");
        driver.findElement(By.id("customer.address.street")).sendKeys("Dluga");
        driver.findElement(By.id("customer.address.city")).sendKeys("Czestochowa");
        driver.findElement(By.id("customer.address.state")).sendKeys("Costam");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("42200");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("555111456");
        driver.findElement(By.id("customer.ssn")).sendKeys("5423");
        driver.findElement(By.id("customer.username")).sendKeys(email);
        driver.findElement(By.id("customer.password")).sendKeys("ladnanazwa1!");
        driver.findElement(By.id("repeatedPassword")).sendKeys("ladnanazwa1!");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();
        WebElement asercja = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p"));
        Assert.assertEquals("Your account was created successfully. You are now logged in.",asercja.getText());
        System.out.println(asercja.getText());
    }
}
