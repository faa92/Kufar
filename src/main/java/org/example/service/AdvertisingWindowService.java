package org.example.service;

import org.apache.logging.log4j.core.util.JsonUtils;
import org.example.pages.AdvertisingWindow;
import org.example.util.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AdvertisingWindowService extends BaseService {
    private final AdvertisingWindow advertisingWindow;

    public AdvertisingWindowService() {
        super(AdvertisingWindowService.class);
        this.advertisingWindow = new AdvertisingWindow();
    }

    public void waitingForAdvertisement() {  //todo
        logger.info("Start wait");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait waitBanner = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement banner = advertisingWindow.getBannerFrame();

        try {
            waitBanner.until(ExpectedConditions.visibilityOf(banner));
            logger.info("Banner displayed");
            wait.until(ExpectedConditions.invisibilityOf(banner));
            driver.switchTo().defaultContent();
            logger.info("Advertisement disappeared");
        } catch (TimeoutException e) {
            logger.info("Banner not found");
        }
    }

}
