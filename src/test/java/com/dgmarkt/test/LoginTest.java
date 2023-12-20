package com.dgmarkt.test;

import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    LoginPage loginPage;

    @Test
    public void testPositiveLogin() {
        loginPage=new LoginPage();
        extentLogger = report.createTest("Positive Login Test1");
        extentLogger.info("Go to"+ ConfigurationReader.get("url")+"website");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Login with valid credentials");
        loginPage.login("username","password");
        extentLogger.pass("Passed");
    }
}
