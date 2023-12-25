package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchIconPage extends BasePage{

    @FindBy(id = "small-searchterms")
    public WebElement searchIconBox;
    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement searchBtn;

    @FindBy(xpath = "//h1[text()='Search']")
    public WebElement searchVerifyText;
    @FindBy(xpath = "//strong[@class='result']")
    public WebElement productNotFoundText;
    @FindBy(id = "Q")
    public WebElement advancedSearchSearchBox;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement advancedSearchSearchBtn;
    @FindBy(id = "As")
    public WebElement advancedSearch;
    @FindBy(xpath = "//div[@class='product-item']")
    public WebElement productVerify;
    @FindBy(className = "[class='price-from']")
    public WebElement priceFrom;
    @FindBy(className = "[class='price-to']")
    public WebElement priceTo;
    @FindBy(xpath = "//div[@class='item-box'][2]")
    public WebElement searchBoxItems;
    @FindBy(xpath = "(//div[@class='prices'])[1]")
    public WebElement advancedSearchProductPrice;

}

