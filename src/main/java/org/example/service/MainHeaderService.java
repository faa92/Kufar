package org.example.service;

import org.example.pages.MainHeader;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void loginVerification() {
        List<WebElement> icons= driver.findElements(mainHeader.getPersonalAccountIconSelector());
        if (!icons.isEmpty()) {
            logger.info("User is logged in");
        } else logger.info("User is NOT logged in");
    }

}
