package Travel;

import net.bytebuddy.description.ByteCodeElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class TravelSearch {
    @Test
    public void searchTravel() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/");
        driver.findElement(By.xpath("//span[text()='Search by Hotel or City Name']")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("London");
        driver.findElement(By.xpath("//span[@class='select2-match' and text()='London']")).click();
        driver.findElement(By.name("checkin")).sendKeys("27/10/2024");
        driver.findElement(By.name("checkout")).sendKeys("30/10/2024");
        driver.findElement(By.name("checkout")).click();
        driver.findElement(By.id("travellersInput")).click();
        driver.findElement(By.id("adultMinusBtn")).click();
        driver.findElement(By.id("childPlusBtn")).click();
        driver.findElement(By.id("childPlusBtn")).click();
        driver.findElement(By.xpath("//button[text()=' Search']")).click();
        driver.findElement(By.xpath("//button[text()='Details']")).click();
        driver.findElement(By.className("fotorama__img")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//html/body/div[5]/div[4]/section/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label/div"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
        //WebElement select = driver.findElement(By.xpath("/html/body/div[5]/div[4]/section/div/table/tbody/tr/td/div[2]/div[1]/div[2]/div[1]/div[2]/select"));
        WebElement select = driver.findElement((By.xpath(("//*[@id='ROOMS']/div/table/tbody/tr[1]/td/div[2]/div[1]/div[2]/div[1]/div[2]/select"))));
        Select select1 = new Select(select);
        select1.selectByIndex(0);

       // WebElement klikk = driver.findElement((By.xpath("/html/body/div[5]/div[4]/section/div/table/tbody/tr/td/div[2]/div[2]/div/div[3]/div/label/div")));
      WebElement klikk = driver.findElement(By.xpath("//html/body/div[5]/div[4]/section/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label/div"));
       klikk.click();
       driver.findElement(By.xpath("//*[@id='ROOMS']/div/button")).click();
driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[1]/div[2]/input")).sendKeys("Piotr");
driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[1]/div[3]/input")).sendKeys("Nowak");
driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[2]/div[2]/input")).sendKeys("nowak_piotr@interia.pl");
driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[2]/div[3]/input")).sendKeys("nowak_piotr@interia.pl");
driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[3]/div[2]/input")).sendKeys("555111222");
driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[4]/div[2]/input")).sendKeys("42-200 Czestochowa ul Orkana 6");


        WebElement Element2 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div[1]/div[2]/div[4]/button"));
        js.executeScript("arguments[0].scrollIntoView();", Element2);
        Thread.sleep(2000);
        Element2.click();

        WebElement czekanie = driver.findElement(By.xpath("//button[text()='Pay on Arrival']"));
        czekanie.click();
        Thread.sleep(1500);
       czekanie.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();



    }
}
