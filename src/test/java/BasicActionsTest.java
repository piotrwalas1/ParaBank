import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionsTest {

    @Test
    public void performAction(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();

        driver.findElement(By.id("fname")).sendKeys("Piotrek");
        WebElement usernameImput = driver.findElement(By.name("username"));
        usernameImput.clear();
        usernameImput.sendKeys("admin");
        //symulowanie nacisniecia przycisku
        usernameImput.sendKeys(Keys.TAB);
        //klikanie checkboxa i radiobutton
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.cssSelector("[value='male']")).click();
        //klikamy na selecta
        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByIndex(2);
        //pobieranie opcji z select
        List<WebElement> options = cars.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
            //pobiera text z getOptions

            SelectCheck selectCheck = new SelectCheck();
            System.out.println(selectCheck.checkOption("Audi", selectCar));
            System.out.println(selectCheck.checkOption("jeep", selectCar));
        }

    }



}
