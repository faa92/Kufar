package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainHeader extends BasePage {
    private final By signInButton = By.xpath("//div[@class='styles_profile__login-button__cqXFe']");

    public MainHeader(WebDriver driver) {
        super(driver);
    }

    public MainHeader clickToButtonSignIn() {
        driver.findElement(signInButton).click();
        return this;
    }


}
