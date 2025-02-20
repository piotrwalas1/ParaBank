package Travel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TravelAcount {
    @Test
    public void searchTravel() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/");
        int randomNumber = (int) (Math.random()*1000);
        String email = "nowak_piotr" + randomNumber + "@interia.pl";
        driver.findElements(By.xpath("//li[@id='li_myaccount']")).stream().filter(WebElement::isDisplayed).findFirst().ifPresent(WebElement::click);
        driver.findElements(By.xpath("//a[text()='  Sign Up']")).get(1).click();
        driver.findElement(By.name("firstname")).sendKeys("Piotr");
        driver.findElement(By.name("lastname")).sendKeys("Nowak");
        driver.findElement(By.name("phone")).sendKeys("555333111");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.name("confirmpassword")).sendKeys("Password123");
        driver.findElement(By.xpath("//*[@id='headersignupform']/div[9]/button")).click();
        WebElement asercja = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[1]/h3"));

        Assert.assertEquals("Hi, Piotr Nowak", asercja.getText());
        driver.quit();

}}
