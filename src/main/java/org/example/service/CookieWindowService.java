package org.example.service;

import org.example.pages.CookieWindow;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;

public class CookieWindowService {
    private   WebDriver driver;
    private CookieWindow cookieWindow;
    public CookieWindowService() {
        this.driver = DriverManager.getDriver();
        this.cookieWindow = new CookieWindow();
    }

    public CookieWindowService cookieClickOk() {
        driver.findElement(cookieWindow.getCookieOkButton()).click();
        return this;
    }
}
