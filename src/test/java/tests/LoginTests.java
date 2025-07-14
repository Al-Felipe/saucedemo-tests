package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void successfulLogin(){
        loginPage.loginIntoApplication("standard_user", "secret_sauce");
    }

    @Test
    public void displayLoginErrorMessage(){
        loginPage.loginIntoApplication("standard_user", "");
        String actual = loginPage.getErrorMessage();

        Assert.assertTrue(actual.contains("Epic sadface"));
    }






}
