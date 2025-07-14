package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductsTest extends BaseTest {
    @Test
    @BeforeClass
    public void headerIsDisplayed(){
        ProductsPage productsPage = loginPage.loginIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.headerTextDisplayed());
    }

    @Test
    public void filterByLowPrice(){
        driver.findElement(By.className("product_sort_container")).click();
    }


}
