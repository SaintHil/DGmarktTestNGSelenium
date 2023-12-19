package com.dgmarkt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //Task
    //write a static method that takes a string parameter name : browserType
    //it will setUp the browser
    //and the method will return chromedriver or firefoxdriver object
    //name of the method: getDriver

    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;

        switch (browserType.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        return driver;
    }

}
