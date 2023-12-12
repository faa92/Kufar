package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdvertisingWindow extends BasePage {
    public AdvertisingWindow(WebDriver driver) {
        super(driver);
    }
    private final By banner = By.id("container-banner-fullscreen");

    public By getBanner() {
        return banner;
    }
}
