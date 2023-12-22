package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CartIconPage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
    public WebElement Books_btn;
    @FindBy(css = "[value='Add to cart']")
    public List<WebElement> addToCart_List;
    @FindBy(xpath = "(//input[@type='button'])[3]")
    public WebElement addToCart1_btn;
    @FindBy(xpath = "//span[text()='Shopping cart']")
    public WebElement shoppingCartLink;
    @FindBy(css = "[class='product-title']")
    public List<WebElement> product_List;
    @FindBy(xpath = "(//a[text()='Computing and Internet'])[1]")
    public WebElement computingAndInternet;
    @FindBy(xpath = "//input[@type='button']")
    public WebElement goToCart_btn;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox_btn;
    @FindBy(xpath = "//input[@name='updatecart']")
    public WebElement updateShoppingCart;
    @FindBy(xpath = "//input[@name='continueshopping']")
    public WebElement continueShopping_btn;
    @FindBy(xpath = "//div[@class='order-summary-content']")
    public WebElement verifyMessage;
    @FindBy(xpath = "//input[@id='termsofservice']")
    public WebElement termofservice;
    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement checkout_btn;
    @FindBy(xpath = "(//input[@type='button'])[2]")
    public WebElement continue_btn1;
    @FindBy(xpath = "//input[@type='button']")
    public List<WebElement> continue_List;

    @FindBy(xpath = "//div[@class='title']")
    public WebElement successfully_processed;

    public void checkout_mtd(){
        termofservice.click();
        checkout_btn.click();
        for (int i = 1; i <continue_List.size() ; i++) {
            continue_List.get(i).click();
        }
        Assert.assertTrue(successfully_processed.isDisplayed());
    }
}
