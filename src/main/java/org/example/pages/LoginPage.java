package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.Constants.EMAIL;
import static org.example.Constants.PASSWORD;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailInput = By.xpath("//input[@id='login']");
    private final By passwordInput = By.xpath("//input[@id='password']");
    private final By signInButton = By.xpath("//button[@type='submit'][contains(text(),'Войти')]");

    ////button[contains(text(),'Войти')]


    public LoginPage enterLogin() {
        WebElement email = driver.findElement(emailInput);
        email.sendKeys(EMAIL);
        return this;
    }

    public LoginPage enterPassword() {
        WebElement password = driver.findElement(passwordInput);
        password.sendKeys(PASSWORD);
        return this;
    }

    public LoginPage clickButtonSignIn() {
        WebElement button = driver.findElement(signInButton);
        button.click();
        return this;
    }

}
