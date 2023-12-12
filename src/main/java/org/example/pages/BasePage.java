package org.example.pages;

import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        driver = DriverManager.getDriver();
        this.driver = driver;
    }


    public BasePage switchToActiveElement() {
        driver.switchTo().activeElement();
        return this;
    }

    public void waitExplicitly(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));

    }


}
