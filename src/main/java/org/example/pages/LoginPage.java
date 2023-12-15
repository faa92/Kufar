package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
