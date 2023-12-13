package org.example.service;

import org.example.pages.AdvertisingWindow;
import org.example.util.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdvertisingWindowService extends BaseService {
    private AdvertisingWindow advertisingWindow;

    public AdvertisingWindowService() {
        super(AdvertisingWindowService.class);
        this.advertisingWindow = new AdvertisingWindow();
    }

    public AdvertisingWindowService waitingForAdvertisement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        logger.info("Start wait");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(advertisingWindow.getBannerSelector()));
        logger.info("End wait");
        return this;
    }
}
