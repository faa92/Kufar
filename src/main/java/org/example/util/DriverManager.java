package org.example.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {
    }

    public static synchronized WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static synchronized void closeWebDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
