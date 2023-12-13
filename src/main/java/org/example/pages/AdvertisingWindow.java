package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertisingWindow extends BasePage {
    private final By banner = By.id("container-banner-fullscreen");

    public WebElement getBannerElement() {
        return driver.findElement(banner);
    }
    public By getBannerSelector() {
        return banner;
    }
}
