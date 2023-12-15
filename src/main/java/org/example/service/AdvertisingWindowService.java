package org.example.service;

import org.example.pages.AdvertisingWindow;
import org.example.util.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public void waitingForAdvertisement() {
        logger.info("Start wait");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("End wait");
    }

}
