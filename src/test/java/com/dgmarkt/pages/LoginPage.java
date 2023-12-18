package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(id = "Email")
    public WebElement emailBtn;
    @FindBy(id = "Password")
    public WebElement passwordBtn;
    @FindBy(xpath = "//input[@class='button-1 login-button']")
    public WebElement loginBtn;
    @FindBy(xpath = "//a[text()='grup@gmail.com']")
    public WebElement loginVerify;

    public  void loginVerifyMethod(){
        String expectedLogin="grup@gmail.com";
        String actualLogin=loginVerify.getText();
        Assert.assertTrue(actualLogin.contains(expectedLogin));
    }
    public void login(String username,String password){
        emailBtn.sendKeys(username);
        passwordBtn.sendKeys(password);
        loginBtn.click();
    }

}
