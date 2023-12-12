package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainHeader extends BasePage {
    private final By signInButton = By.xpath("//div[@class='styles_profile__login-button__cqXFe']");
    private final By personalAccountIcon = By.xpath("//span[@class='styles_avatar__vL34v styles_avatar_header-button__IFCLY']");

    public MainHeader(WebDriver driver) {
        super(driver);
    }

    public By getSignInButton() {
        return signInButton;
    }

    public By getPersonalAccountIcon() {
        return personalAccountIcon;
    }
}
