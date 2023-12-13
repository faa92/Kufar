package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookieWindow extends BasePage {
    private final By cookieOkButton = By.xpath("//button[contains(text(), 'Принять')]");

    public WebElement getCookieOkButton() {
        return driver.findElement(cookieOkButton);
    }
}
