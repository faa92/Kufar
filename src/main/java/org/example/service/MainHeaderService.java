package org.example.service;

import org.example.pages.MainHeader;
import org.example.util.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class MainHeaderService extends BaseService {
    private final MainHeader mainHeader;
    public MainHeaderService() {
        super(MainHeaderService.class);
        this.mainHeader = new MainHeader();
    }

    public MainHeaderService  clickToButtonSignIn() {
        logger.info("Click button sign in");
        mainHeader.getSignInButton().click();
        return this;
    }

    public void loginVerification() { //todo
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        try {
            wait.until(ExpectedConditions.visibilityOf(mainHeader.getPersonalAccountIcon()));
            logger.info("User is logged in");
        } catch (Exception e) {
            logger.info("User is NOT logged in");
        }
    }

}
