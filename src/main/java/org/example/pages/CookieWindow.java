package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookieWindow extends BasePage {
    private final By cookieOkButton = By.xpath("//button[@class='styles_button__oKUgO styles_secondary__MiBIC styles_size-m__NgAcw styles_submit_button__T_qS1']");

    public By getCookieOkButton() {
        return cookieOkButton;
    }
}
