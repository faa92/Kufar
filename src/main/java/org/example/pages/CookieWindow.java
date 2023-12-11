package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookieWindow extends BasePage {
    public CookieWindow(WebDriver driver) {
        super(driver);
    }

    private final By cookieOk = By.xpath("//button[@class='styles_button__oKUgO styles_secondary__MiBIC styles_size-m__NgAcw styles_submit_button__T_qS1']");

    public void cookieClickOk() {
        driver.findElement(cookieOk).click();
    }
}
