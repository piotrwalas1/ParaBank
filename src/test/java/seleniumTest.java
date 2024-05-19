import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class seleniumTest {

   @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //clicnOnMe
        By buttonId = By.xpath("//button[@id='clickOnMe']");
        WebElement clickOnMeButton = driver.findElement(buttonId);
        //fname

        By firstName = By.xpath("//input[@name='fname']");
        WebElement firstNameInput =driver.findElement(firstName);
        driver.findElement(By.name("fname"));

        By paraHidden = By.className("topSecret");
        driver.findElement(paraHidden);

        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputLocator);
       System.out.println(inputs.size());

       By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
       WebElement schollLink = driver.findElement(linkText);

       By partialLink = By.xpath("//a[contains(text(), 'Visit')]");
       WebElement schollPartial = driver.findElement(partialLink);

       By fullPath = By.xpath("/html/body/div/ul");
       driver.findElement(fullPath);

       By shortPath = By.xpath("//ul");
       driver.findElement(shortPath);
//szuka wszystkie znnaczniki
       By allXpath = By.xpath("//*");
       driver.findElement(allXpath);
//szukanie 2 wartosci z input
       By secondElement = By.xpath("(//input)[2]" );
       driver.findElement(secondElement);
//szukanie po ostatniej wyswietlonej z input
       By lastElement = By.xpath("(//input)[last]");
       driver.findElement(lastElement);
//szukanie po atrybucie
       By elementWithAtribute = By.xpath("//*[@name]");
       driver.findElement(elementWithAtribute);



    }
}
