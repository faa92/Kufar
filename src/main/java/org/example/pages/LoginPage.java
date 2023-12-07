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
    private final By signInButton = By.xpath("//button[@class='styles_button__oKUgO styles_default__ws8JN styles_size-m__NgAcw styles_with_icon__r87Pw']");

    public LoginPage emailInputClick() {
        driver.findElement(emailInput).click();
        return this;
    }

    public LoginPage enterLoginAndGoPassword() {
        WebElement email = driver.findElement(emailInput);
        email.sendKeys(EMAIL, Keys.TAB);
        return this;
    }

    public LoginPage enterPasswordAndSignIn() {
        WebElement password = driver.findElement(passwordInput);
        password.sendKeys(PASSWORD, Keys.ENTER);
        return this;
    }

}
