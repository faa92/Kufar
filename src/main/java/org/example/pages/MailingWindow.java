package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailingWindow extends BasePage {
    public MailingWindow(WebDriver driver) {
        super(driver);
    }

    private final By buttonUnsubscribe = By.xpath("//*[@id=\"cancel\"]");

    public void clickButtonNo() {
        driver.findElement(buttonUnsubscribe).click();
    }


}
