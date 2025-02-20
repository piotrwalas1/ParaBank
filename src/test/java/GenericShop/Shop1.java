package GenericShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class Shop1 {
    @Test
    public void shopping1() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://skleptest.pl/");
        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/div/div/ul/li[3]/a"));
actions.moveToElement(heading).perform();
driver.findElement(By.cssSelector("[title='Shirts']")).click();
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[1]/a[2]")).click();
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[2]/a[2]")).click();
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[3]/a[2]")).click();
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[4]/a[2]")).click();
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[5]/a[2]")).click();
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[6]/a[2]")).click();
driver.findElement(By.xpath("/html/body/div/header[1]/div/div/div/ul/li[2]/a")).click();
Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/main/article/div[2]/div/div/div/a"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/main/article/div[2]/div/div/div/a")).click();

driver.findElement(By.id("billing_first_name")).sendKeys("Piotrek");
driver.findElement(By.id("billing_last_name")).sendKeys("Jakistam");
driver.findElement(By.id("billing_company")).sendKeys("Firma Krzak");

driver.findElement(By.xpath("//*[@id='select2-billing_country-container']")).click();

driver.findElement(By.cssSelector("[title='Poland']")).click();
WebElement elements3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/main/article/div[2]/form[3]/div[1]/div[1]/div[1]/div/p[7]/label"));
       js.executeScript("arguments[0].scrollIntoView();", elements3);
        Thread.sleep(1800);
driver.findElement(By.id("billing_address_1")).sendKeys("Orkana");
driver.findElement(By.id("billing_postcode")).sendKeys("42-200");
driver.findElement(By.id("billing_city")).sendKeys("Czestochowa");
driver.findElement(By.id("billing_phone")).sendKeys("555444333");
driver.findElement(By.id("billing_email")).sendKeys("piotrek@interia.pl");
driver.findElement(By.id("createaccount")).click();
driver.findElement(By.id("account_password")).sendKeys("Haslosilne1!");
        Thread.sleep(1800);

WebElement element2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/main/article/div[2]/form[3]/div[2]/table/tfoot/tr[3]/th"));
        js.executeScript("arguments[0].scrollIntoView();", element2);
        driver.findElement(By.xpath("//*[@id='payment_method_cod']")).click();
driver.findElement(By.id("place_order")).click();

    }
}
