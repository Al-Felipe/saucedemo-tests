package pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
    private By headerProducts = By.tagName("span");

    public boolean headerTextDisplayed(){
        return driver.findElement(headerProducts).isDisplayed();
    }
}
