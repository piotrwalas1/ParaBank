package wakacjePL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class test1 {
    @Test
    public void wyszukiwanie() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.wakacje.pl");
        String currentWindow = driver.getWindowHandle();
        Set<String> windowsNames = driver.getWindowHandles();
        for(String window : windowsNames){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div/button[2]")).click();
        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[1]/div[2]/div[2]/span[4]/div[1]/p"));
        actions.moveToElement(heading).perform();
       // driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[1]/div[2]/div[2]/span[4]/div[2]/div[1]/div/a[2]/div/p")).click();
driver.findElement(By.linkText("Turcja")).click();
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[1]/section/div/div/div/div[2]/div/div/div/div/div/div/input")).click();

       String currentWindow1 = driver.getWindowHandle();
        Set<String> windowsNames1 = driver.getWindowHandles();
        for(String window1 : windowsNames1){
            if(!window1.equals(currentWindow1)){
                driver.switchTo().window(window1);
            }
        }
        driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div/div[1]/div[1]/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div/div[2]/div/div/div[2]/div[4]/div[8]")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div/div[1]/div[2]/div/div/input")).click();
        driver.findElement((By.xpath("/html/body/div[7]/div[1]/div[1]/div/div[2]/div/div/div[2]/div[4]/div[29]"))).click();
    driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/footer/button[2]/span")).click();
    Thread.sleep(2000);
    driver.switchTo().window(currentWindow1);
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[2]/aside/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div/div/input")).sendKeys("1200");
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[2]/aside/div/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div/input")).sendKeys("3500");
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)","");
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[2]/aside/div/div[2]/div[2]/div/div[1]/div[1]/label/span/span")).click();
        Thread.sleep(1000);
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,650)","");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[2]/aside/div/div[4]/div[2]/div/div[1]/div/label/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[2]/aside/div/div[11]/div/button")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,650)","");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[2]/div[1]/section/div[2]/a[2]")).click();
        Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[1]/div[1]/div/div/button/span")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)","");
        Thread.sleep(3000);
  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/main/div/div[4]/div/div[2]/section/div/div/div/div[2]/div/div/div[2]/button")).click();
driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[4]/div[1]/form/article/div[1]/input")).sendKeys("Jan");
driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[4]/div[1]/form/article/div[2]/input")).sendKeys("Kowalski");
Thread.sleep(1200);
driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[4]/div[1]/form/article/div[3]/input")).sendKeys("jankowalski@onet.pl");
driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[4]/div[1]/form/article/div[4]/input")).sendKeys("jankowalski@onet.pl");
driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[4]/div[1]/form/article/div[5]/div/div/input[1]")).sendKeys("555555551");
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)","");
driver.findElement(By.xpath("//*[@id='1']")).click();
driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[4]/div[1]/form/article/div[12]/button/div")).click();
Thread.sleep(8000);
driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[4]/div[1]/form/article[1]/div/div[1]/input")).sendKeys("Sportowa");
driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[4]/div[1]/form/article[1]/div/div[2]/div[1]/input")).sendKeys("42-200");
driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[4]/div[1]/form/article[1]/div/div[2]/div[2]/input")).sendKeys("Czestochowa");
Thread.sleep(1800);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,680)","");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[4]/div[1]/form/article[3]/div[1]/input")).sendKeys("Monika");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[4]/div[1]/form/article[3]/div[2]/input")).sendKeys("Kowalska");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[4]/div[1]/form/article[4]/div/label/span[1]")).click();
        Thread.sleep(1300);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)","");


    }
}
