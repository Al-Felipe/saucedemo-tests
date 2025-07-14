package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void successfulLogin(){
        loginPage.loginIntoApplication("standard_user", "secret_sauce");
    }



}
