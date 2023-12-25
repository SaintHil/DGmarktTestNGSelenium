package com.dgmarkt.test;

import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.pages.SearchIconPage;
import com.dgmarkt.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchIconTest extends TestBase{
    LoginPage loginPage=new LoginPage();
    SearchIconPage searchIconPage=new SearchIconPage();

    @Test
    public void searchBoxPositiveVerify(){
        extentLogger = report.createTest("Search Icon Function Test");
        extentLogger.info("go to url web page" );
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("login with true credentials");
        loginPage.login();
        extentLogger.info("click to search box and enter computer and click to search button");
        searchIconPage.searchIconBox.sendKeys("computer");
        searchIconPage.searchBtn.click();
        extentLogger.info("verify that the products are displayed");
        Assert.assertTrue(searchIconPage.searchVerifyText.isDisplayed());
    }
    @Test
    public void searchBoxNegativeVerify(){
        extentLogger = report.createTest("Search Icon Function Test");
        extentLogger.info("go to url web page" );
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("login with true credentials");
        loginPage.login();
        extentLogger.info("click to search box and enter plane and click to search button");
        searchIconPage.searchIconBox.sendKeys("plane");
        searchIconPage.searchBtn.click();
        extentLogger.info("verify that the products not found");
        Assert.assertTrue(searchIconPage.productNotFoundText.isDisplayed());
    }
    @Test
    public void advancedSearchFunction() {
        extentLogger = report.createTest("Search Icon Function Test");
        extentLogger.info("go to url web page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("login with true credentials");
        loginPage.login();
        extentLogger.info("click to search box and enter plane and click to search button");
        searchIconPage.searchIconBox.sendKeys("plane");
        searchIconPage.searchBtn.click();
        extentLogger.info("click to advanced search and enter computer to advanced search box");
        searchIconPage.advancedSearch.click();
        searchIconPage.advancedSearchSearchBox.clear();
        searchIconPage.advancedSearchSearchBox.sendKeys("computer");
        extentLogger.info("click to advanced search search button and verify that the products is found");
        searchIconPage.advancedSearchSearchBtn.click();
        Assert.assertTrue(searchIconPage.productVerify.isDisplayed());

    }
}
//-Verify that the product is displayed when the user searches for the item on the website
//-Verify that the message "product not found" is displayed when the user searches for the item that is not on the website
//-Verify that advanced search is clickable.