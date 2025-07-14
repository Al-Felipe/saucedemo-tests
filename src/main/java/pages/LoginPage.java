package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By usernameField = By.name("user-name");
    private By passwordField = By.name("password");
    private By loginBtn = By.name("login-button");

    public void setUsernameField(String text) {
        set(usernameField, text);
    }

    public void setPasswordField(String text) {
        set(passwordField, text);
    }

    public void clickLoginBtn(){
        click(loginBtn);
    }

    public void loginIntoApplication(String username, String password){
        setUsernameField(username);
        setPasswordField(password);
        clickLoginBtn();
    }
}
