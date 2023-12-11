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

    private final By banner = By.xpath("//div[@id='container-banner-fullscreen']");
//a[@id='banner' and contains(@class, 'banner')]


    public void waitForBannerToDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
        wait.until(ExpectedConditions.presenceOfElementLocated(banner));
    }


}
