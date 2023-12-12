package org.example.service;

import org.example.pages.AdvertisingWindow;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdvertisingWindowService {
    private WebDriver driver;
    private AdvertisingWindow advertisingWindow;

    public AdvertisingWindowService() {
        this.driver = DriverManager.getDriver();
        this.advertisingWindow = new AdvertisingWindow(driver);
    }

    public AdvertisingWindowService waitingForAdvertisement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(advertisingWindow.getBanner()));
        return this;
    }
}
