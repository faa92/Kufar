package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainHeader extends BasePage {
    private final By signInButton = By.xpath("//div[@class='styles_profile__login-button__cqXFe']");
    private final By personalAccountIcon = By.xpath("//span[@class='styles_avatar__vL34v styles_avatar_header-button__IFCLY']");


    public WebElement getSignInButton() {
        return driver.findElement(signInButton);
    }

    public WebElement getPersonalAccountIcon() {
        return driver.findElement(personalAccountIcon);
    }
    public By getPersonalAccountIconSelector() {
        return personalAccountIcon;
    }
}
