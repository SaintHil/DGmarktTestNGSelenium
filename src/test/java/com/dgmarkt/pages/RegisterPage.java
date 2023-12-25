package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerLinkBtn;
    @FindBy(id = "FirstName")
    public WebElement firstNameInbox;
    @FindBy(id = "LastName")
    public WebElement lastNameInbox;
    @FindBy(id = "Email")
    public WebElement emailInbox;
    @FindBy(id = "Password")
    public WebElement passwordInbox;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordInbox;
    @FindBy(id = "register-button")
    public WebElement registerBtn;
    @FindBy(xpath = "//span[text()='Wrong email']")
    public WebElement wrongEmailText;
    @FindBy(xpath = "//span[text()='The password should have at least 6 characters.']")
    public WebElement wrongPasswordText;
    @FindBy(xpath = "//span[text()='The password and confirmation password do not match.']")
    public WebElement wrongConfirmPasswordText;//"//p[contains(text(),'Welcome')]"

    public void verifyMessage(String expectedMessage){
        WebElement element= Driver.get().findElement(By.xpath("//span[text()='"+expectedMessage+"']"));
        String actualMessage=element.getText();
        Assert.assertEquals(actualMessage,expectedMessage);


    }
}
