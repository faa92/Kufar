package org.example.service;

import org.example.pages.LoginPage;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPageService extends BaseService{
   private LoginPage loginPage;
    public LoginPageService() {
        super(LoginPageService.class);
        this.loginPage = new LoginPage();
    }

    public LoginPageService enterLogin() {
        logger.info("Enter login");
        loginPage.getEmailInput().sendKeys(System.getenv("LOGIN_EMAIL"));
        return this;
    }

    public LoginPageService enterPassword() {
        logger.info("Enter password");
        loginPage.getPasswordInput().sendKeys(System.getenv("LOGIN_PASSWORD"));
        return this;
    }

    public LoginPageService clickButtonSignIn() {
        logger.info("Click sign in");
        loginPage.getSignInButton().click();
        return this;
    }
}