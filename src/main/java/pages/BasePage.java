package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public void set(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void delay(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement loginRevealed = driver.findElement(By.className("login_logo"));
        wait.until(d -> loginRevealed.isDisplayed());
    }
}
