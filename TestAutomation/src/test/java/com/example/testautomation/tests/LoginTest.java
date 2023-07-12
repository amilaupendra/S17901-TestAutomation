package com.example.testautomation.tests;

import com.example.testautomation.TestBase;
import com.example.testautomation.config.ConfigReader;
import com.example.testautomation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    private LoginPage loginPage;
    private ConfigReader configReader;

    @BeforeClass
    public void setup() {
        initialize();
        loginPage = new LoginPage(driver);
        configReader = new ConfigReader("src/main/resources/config/config.properties");
    }

    @AfterClass
    public void cleanup() {
        teardown();
    }

    @Test
    public void testLoginWithValidCredentials() {
        String username = configReader.getProperty("username");
        String password = configReader.getProperty("password");

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        Assert.assertTrue
    }

}
