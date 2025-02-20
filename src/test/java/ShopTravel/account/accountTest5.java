package ShopTravel.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class accountTest5 {
    @Test
    public void account5() throws InterruptedException {
        //bez podania hasla
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://fakestore.testelka.pl/");
        driver.findElement(By.xpath("//*[@id='menu-item-201']/a")).click();
        driver.findElement(By.xpath("/html/body/p/a")).click();
        driver.findElement(By.id("reg_email")).sendKeys("nowak_piotr@onetpl");
        driver.findElement(By.id("reg_password")).sendKeys("Ladnedlugiehaslo");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/article/div/div/div[2]/div[2]/form/p[3]/button")).click();
        WebElement asercja1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/ul/li"));
        Assert.assertEquals("Błąd: Podaj poprawny adres e-mail.", asercja1.getText());
        System.out.println(asercja1.getText());

        Thread.sleep(1500);
       driver.close();
    }
}
