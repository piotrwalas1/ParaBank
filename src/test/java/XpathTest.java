import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {

   @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //clicnOnMe
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);
        //fname

        By firstName = By.name("fname");
        WebElement firstNameInput =driver.findElement(firstName);
        driver.findElement(By.name("fname"));

        By paraHidden = By.className("topSecret");
        driver.findElement(paraHidden);


        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputLocator);
       System.out.println(inputs.size());

       By linkText = By.linkText("Visit W3Schools.com!");
       WebElement schollLink = driver.findElement(linkText);

       By partialLink = By.partialLinkText("Visit");
       WebElement schollPartial = driver.findElement(partialLink);

       By fullPath = By.xpath("/html/body/div/ul");
       driver.findElement(fullPath);

       By shortPath = By.xpath("//ul");
       driver.findElement(shortPath);

       //szukamy atrybutu ktorego wartosc jest rowna lub nie jest rowna
       By attrEq = By.xpath("//button[@id='clickOnMe']");
       By atteNotEq = By.xpath("//button[@id!='clickOnMe']");
       driver.findElement(attrEq);
       driver.findElement(atteNotEq);




    }
}
