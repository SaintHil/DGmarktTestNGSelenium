package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartIconPage extends BasePage {
    @FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
    public WebElement Books_btn;
    @FindBy(xpath = "(//input[@type='button'])[3]")
    public WebElement addToCart1_btn;
    @FindBy(xpath = "(//input[@type='button'])[4]")
    public WebElement addToCart2_btn;

    @FindBy(xpath = "//span[text()='Shopping cart']")
    public WebElement shoppingCartLink;
    @FindBy(xpath = "(//a[text()='Computing and Internet'])[1]")
    public WebElement computingAndInternet;
    @FindBy(xpath = "(//a[text()='Computing and Internet'])[2]")
    public WebElement cartComputingAndInternet;
    @FindBy(xpath = "(//a[text()='Fiction'])[1]")
    public WebElement fiction;
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
    @FindBy(xpath = "(//input[@type='button'])[3]")
    public WebElement continue_btn2;
    @FindBy(xpath = "(//input[@type='button'])[4]")
    public WebElement continue_btn3;
    @FindBy(xpath = "(//input[@type='button'])[5]")
    public WebElement continue_btn4;
    @FindBy(xpath = "(//input[@type='button'])[6]")
    public WebElement continue_btn5;
    @FindBy(xpath = "(//input[@type='button'])[7]")
    public WebElement continue_btn6;


    @FindBy(xpath = "//div[@class='title']")
    public WebElement successfully_processed;

    public void checkout_mtd(){
        termofservice.click();
        checkout_btn.click();
        for (int i = 2; i <8 ; i++) {
             Driver.get().findElement(By.xpath("(//input[@type='button'])['"+i+"']")).click();
            BrowserUtils.waitFor(1);
        }
      /*  continue_btn1.click();
        continue_btn2.click();
        continue_btn3.click();
        continue_btn4.click();
        continue_btn5.click();
        continue_btn6.click();*/
        Assert.assertTrue(successfully_processed.isDisplayed());
    }

}
