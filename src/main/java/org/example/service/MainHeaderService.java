package org.example.service;

import org.example.pages.MainHeader;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;


public class MainHeaderService {
    private final WebDriver driver;
    private final MainHeader mainHeader;
    public MainHeaderService() {
        this.driver = DriverManager.getDriver();
        this.mainHeader = new MainHeader();
    }

    public MainHeaderService  clickToButtonSignIn() {
        driver.findElement(mainHeader.getSignInButton()).click();
        return this;
    }

    public MainHeaderService clickPersonalIcon() {
        driver.findElement(mainHeader.getPersonalAccountIcon()).click();
        return this;
    }

    public boolean isLoggedIn() {
       return driver.findElement(mainHeader.getPersonalAccountIcon()).isDisplayed();
    }

}
