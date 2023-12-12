package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvertisingWindow extends BasePage {
    private final By banner = By.id("container-banner-fullscreen");

    public By getBanner() {
        return banner;
    }
}
