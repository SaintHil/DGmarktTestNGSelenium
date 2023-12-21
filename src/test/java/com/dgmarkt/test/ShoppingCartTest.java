package com.dgmarkt.test;

import com.dgmarkt.pages.CartIconPage;
import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    CartIconPage cartIconPage = new CartIconPage();
    /**
     * DEMOWEBSHOP SHOPPİNG CART TASK1
     * go to demowebshop web page
     * log in with your own valid credential
     * Verify that login is successful
     * Go to Books and add the first item to the cart
     * Verify that the user can see the items added to the cart by hover over the cart icon.
     */
    @Test
    public void test1() {
        extentLogger = report.createTest("DEMOWEBSHOP SHOPPİNG CART TASK1");
        extentLogger.info("go to " + ConfigurationReader.get("url") + " web page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("log in with your own valid credential");
        loginPage.login1();
        extentLogger.info("Verify that login is successful");
        loginPage.loginVerifyMethod();
        extentLogger.info("Go to Books and add the first item to the cart");
        cartIconPage.Books_btn.click();
        BrowserUtils.waitFor(1);
        cartIconPage.addToCart1_btn.click();
        BrowserUtils.waitFor(1);
        extentLogger.info("Verify that the user can see the items added to the cart by hover over the cart icon.");
        BrowserUtils.hover(cartIconPage.shoppingCartLink);
        Assert.assertTrue(cartIconPage.computingAndInternet.isDisplayed());
        extentLogger.pass("PASSED");

    }

    /**
     * DEMOWEBSHOP SHOPPİNG CART TASK2
     * go to demowebshop web page
     * log in with your own valid credential
     * Verify that login is successful
     * Go to Books and add the first item to the cart
     * Verify that when the user enters the wrong item, they can delete it from the cart.
     */

    @Test
    public void test2() {
        extentLogger = report.createTest("DEMOWEBSHOP SHOPPİNG CART TASK2");
        extentLogger.info("go to " + ConfigurationReader.get("url") + " web page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("log in with your own valid credential");
        loginPage.login1();
        extentLogger.info("Verify that login is successful");
        loginPage.loginVerifyMethod();
        extentLogger.info("Go to Books and add the first item to the cart");
        cartIconPage.Books_btn.click();
        BrowserUtils.waitFor(1);
        cartIconPage.addToCart1_btn.click();
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(cartIconPage.shoppingCartLink);
        cartIconPage.goToCart_btn.click();
        cartIconPage.checkbox_btn.click();
        cartIconPage.updateShoppingCart.click();
        Assert.assertTrue(cartIconPage.verifyMessage.isDisplayed());
        extentLogger.pass("PASSED");
    }

    /**
     * DEMOWEBSHOP SHOPPİNG CART TASK3
     * go to demowebshop web page
     * log in with your own valid credential
     * Verify that login is successful
     * Go to Books and add the first item to the cart
     * Verify that the user can continue shopping after selecting the desired product
     */

    @Test
    public void test3() {

       extentLogger = report.createTest("DEMOWEBSHOP SHOPPİNG CART TASK3");
        extentLogger.info("go to " + ConfigurationReader.get("url") + " web page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("log in with your own valid credential");
        loginPage.login1();
        extentLogger.info("Verify that login is successful");
        loginPage.loginVerifyMethod();
        extentLogger.info("Go to Books and add the first item to the cart");
        cartIconPage.Books_btn.click();
        BrowserUtils.waitFor(1);
        cartIconPage.addToCart1_btn.click();
        BrowserUtils.waitFor(1);
        extentLogger.info("Verify that the user can continue shopping after selecting the desired product");
        BrowserUtils.hover(cartIconPage.shoppingCartLink);
        BrowserUtils.waitFor(1);
        Assert.assertTrue(cartIconPage.computingAndInternet.isDisplayed());
        cartIconPage.goToCart_btn.click();
        BrowserUtils.waitFor(1);
        cartIconPage.continueShopping_btn.click();
        BrowserUtils.waitFor(1);
        cartIconPage.addToCart2_btn.click();
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(cartIconPage.shoppingCartLink);
        BrowserUtils.waitFor(1);
        Assert.assertTrue(cartIconPage.fiction.isDisplayed());
        extentLogger.pass("PASSED");
    }

    /**
     * DEMOWEBSHOP SHOPPİNG CART TASK4
     * go to demowebshop web page
     * log in with your own valid credential
     * Verify that login is successful
     * Go to Books and add the first item to the cart
     * Verify that the user should be able to go to the Checkout page from the cart icon and complete the checkout
     */

    @Test
    public void test4() {

        extentLogger = report.createTest("DEMOWEBSHOP SHOPPİNG CART TASK4");
        extentLogger.info("go to " + ConfigurationReader.get("url") + " web page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("log in with your own valid credential");
        loginPage.login1();
        extentLogger.info("Verify that login is successful");
        loginPage.loginVerifyMethod();
        extentLogger.info("Go to Books and add the first item to the cart");
        cartIconPage.Books_btn.click();
        BrowserUtils.waitFor(1);
        cartIconPage.addToCart1_btn.click();
        BrowserUtils.waitFor(1);
        extentLogger.info("Verify that the user should be able to go to the Checkout page from the cart icon and complete the checkout");
        BrowserUtils.hover(cartIconPage.shoppingCartLink);
        cartIconPage.goToCart_btn.click();
        cartIconPage.checkout_mtd();
        Assert.assertTrue(cartIconPage.successfully_processed.isDisplayed());
        extentLogger.pass("PASSED");
    }
}