package GenericShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewAccount {
    @Test
    public void newAccount(){
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://skleptest.pl");
driver.findElement(By.xpath("//*[@id='page']/header[1]/div/div/div/ul/li[3]/a")).click();
driver.findElement(By.id("reg_email")).sendKeys("piotrek@interia.pl");
driver.findElement(By.id("reg_password")).sendKeys("Haslodomaila1!123");
driver.findElement(By.name("register")).click();
    }


}
