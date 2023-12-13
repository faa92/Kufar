package org.example.service;

import org.example.pages.CookieWindow;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;

public class CookieWindowService extends  BaseService{
    private CookieWindow cookieWindow;
    public CookieWindowService() {
        super(CookieWindowService.class);
        this.cookieWindow = new CookieWindow();
    }

    public CookieWindowService cookieClickOk() {
        logger.info("Cookie click ok");
        cookieWindow.getCookieOkButton().click();
        return this;
    }
}
