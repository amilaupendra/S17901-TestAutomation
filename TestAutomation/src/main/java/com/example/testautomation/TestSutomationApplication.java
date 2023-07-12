package com.example.testautomation;

import com.example.testautomation.pages.LoginPage;

public class TestAutomationApplication {
    public static void main(String[] args) {
        TestBase testBase = new TestBase();
        testBase.setup();
        
        LoginPage loginPage = new LoginPage(testBase.driver);
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("testpassword");
        loginPage.clickLoginButton();
        
        testBase.teardown();
    }
}
