package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By usernameField = By.name("user-name");
    private By passwordField = By.name("password");
    private By loginBtn = By.name("login-button");
    private By errorMsg = By.tagName("h3");

    public void setUsernameField(String text) {
        set(usernameField, text);
    }

    public void setPasswordField(String text) {
        set(passwordField, text);
    }

    public ProductsPage clickLoginBtn(){
        click(loginBtn);
        return new ProductsPage();
    }

    public ProductsPage loginIntoApplication(String username, String password){
        setUsernameField(username);
        setPasswordField(password);
        return clickLoginBtn();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMsg).getText();
    }
}
