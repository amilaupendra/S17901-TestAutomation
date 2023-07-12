package com.example.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected WebDriver driver;
    protected ConfigReader configReader;
    
    @BeforeClass
    public void setup() {
        initialize();
        configReader = new ConfigReader("config/config.properties");
    }
    
    @AfterClass
    public void cleanup() {
        teardown();
    }

    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
