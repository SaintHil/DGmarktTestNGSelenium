package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(id = "Email")
    public WebElement emailBtn;
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement login_Icon;
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
    public void login(){
        login_Icon.click();
        emailBtn.sendKeys(ConfigurationReader.get("username"));
        passwordBtn.sendKeys(ConfigurationReader.get("password"));
        loginBtn.click();
    }
}
