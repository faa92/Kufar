package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertisingWindow extends BasePage {
    private final By bannerFrame = By.id("banner-fullscreen");
    // //iframe[contains(@src, 'ads.adfox')]

//  <div class style="width: 100%; height: 100%;">
//    <iframe scrolling="no"
//    private final By bannerFrame = By.id("_hjSafeContext_74294860");
//    private final By bannerFrame = By.cssSelector("iframe[scrolling='no']");
//    private final By bannerFrame = By.xpath("//iframe[contains(@src, 'ads.adfox')]");
    //   //iframe[@id="_hjSafeContext_15472367"]


    public WebElement getBannerFrame() {
        return driver.findElement(bannerFrame);
    }
//    public WebElement getBanner() {
//        return driver.findElement(banner);
//    }

}
