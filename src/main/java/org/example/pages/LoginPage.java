package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.example.Constants.EMAIL;
import static org.example.Constants.PASSWORD;

public class LoginPage extends BasePage {
    private final By emailInput = By.xpath("//input[@id='login']");
    private final By passwordInput = By.xpath("//input[@id='password']");
    private final By signInButton = By.xpath("//button[@type='submit'][contains(text(),'Войти')]");

    public WebElement getEmailInput() {
        return driver.findElement(emailInput);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(passwordInput);
    }

    public WebElement getSignInButton() {
        return driver.findElement(signInButton);
    }
}
