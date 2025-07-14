package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
        WebElement dropdown =  driver.findElement(By.className("product_sort_container"));
        Select select = new Select(dropdown);

        select.selectByIndex(2);

    }


}
