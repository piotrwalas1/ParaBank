package ShopTravel.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class accountTest4 {
    @Test
    public void account4() throws InterruptedException {
        //bez podania hasla
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://fakestore.testelka.pl/");
        driver.findElement(By.xpath("//*[@id='menu-item-201']/a")).click();
        driver.findElement(By.xpath("/html/body/p/a")).click();
        driver.findElement(By.id("reg_email")).sendKeys("nowak_piotronet.pl");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/article/div/div/div[2]/div[2]/form/p[3]/button")).click();
        Thread.sleep(1500);
        driver.quit();
    }
}
