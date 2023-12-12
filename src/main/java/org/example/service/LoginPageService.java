package org.example.service;

import org.example.pages.LoginPage;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.Constants.EMAIL;
import static org.example.Constants.PASSWORD;

public class LoginPageService {
   private WebDriver driver;
   private LoginPage loginPage;
    public LoginPageService() {
        this.driver = DriverManager.getDriver();
        this.loginPage = new LoginPage(driver);
    }

    public LoginPageService enterLogin() {
        driver.findElement(loginPage.getEmailInput()).sendKeys(EMAIL);
        return this;
    }

    public LoginPageService enterPassword() {
        driver.findElement(loginPage.getPasswordInput()).sendKeys(PASSWORD);
        return this;
    }

    public LoginPageService clickButtonSignIn() {
        driver.findElement(loginPage.getSignInButton()).click();
        return this;
    }
}