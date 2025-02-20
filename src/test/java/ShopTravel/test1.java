package ShopTravel;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class test1 {
    @Test
    public void buyTest1() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://fakestore.testelka.pl");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/p/a")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/section[4]/div/ul/li[1]/a[1]/img"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        WebElement element2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/main/div[2]/div[2]/div[2]/div/a/span"));
        js.executeScript("arguments[0].scrollIntoView();", element2);
        Thread.sleep(1000);
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/main/div[2]/div[3]/ul/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='tab-title-reviews']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/main/div[2]/div[3]/ul/li[1]/a")).click();
WebElement element3 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/main/div[2]/div[3]/div[1]/h2"));
       js.executeScript("arguments[0].scrollIntoView();",element3);
       Thread.sleep(1200);
       driver.findElement(By.xpath("/html/body/div[2]/section/div/div/a")).click();
        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/ul/li[1]/a/span[1]"));
actions.moveToElement(heading).perform();
driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/ul/li[2]/div/div/p[2]/a[2]")).click();
driver.findElement(By.id("billing_first_name")).sendKeys("Piotrek");
driver.findElement(By.id("billing_last_name")).sendKeys("Nowak");
driver.findElement(By.id("billing_address_1")).sendKeys("Jagiellońska 6");
driver.findElement(By.id("billing_postcode")).sendKeys("42-200");
driver.findElement(By.id("billing_city")).sendKeys("Częstochowa");
driver.findElement(By.id("billing_phone")).sendKeys("555222444");
driver.findElement(By.id("billing_email")).sendKeys("nowak_piotr@onet.pl");
WebElement element4 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/main/article/div/div/form[3]/div[1]/div[2]/div[2]/h3"));
js.executeScript("arguments[0].scrollIntoView();", element4);
driver.findElement(By.id("order_comments")).sendKeys("NIE MAM UWAG, TAK TYLKO PISZE");
Thread.sleep(900);
WebElement element5 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/main/article/div/div/form[3]/div[1]/div[1]/div[1]/div/p[5]/label"));
js.executeScript("arguments[0].scrollIntoView();", element5);
Thread.sleep(2000);
//WebElement iframe = driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame3496']"));
driver.switchTo().frame(1);
driver.findElement(By.xpath("/html/body/div/form/span[2]/div/div/div[2]/span/input")).sendKeys("4242424242424242" );

driver.switchTo().defaultContent();
driver.switchTo().frame(2);
driver.findElement(By.xpath("//input[@class='InputElement is-empty Input Input--empty']")).sendKeys("1225");
driver.switchTo().defaultContent();
driver.switchTo().frame(3);
driver.findElement(By.xpath("/html/body/div/form/span[2]/div/span/input")).sendKeys("505");
driver.switchTo().defaultContent();
driver.findElement(By.name("terms")).click();

WebElement elem1 = driver.findElement(By.xpath("//*[@id='place_order']"));
js.executeScript("arguments[0].scrollIntoView();", elem1);
elem1.click();
Thread.sleep(10000);
       WebElement asercja = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/main/article/header/h1"));
        Assert.assertEquals("Zamówienie otrzymane", asercja.getText());
        System.out.println(asercja.getText());

    }
}
