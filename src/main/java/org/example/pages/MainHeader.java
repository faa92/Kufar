package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainHeader extends BasePage {
    private final By categoriesButton = By.xpath("//button[@data-name='category-chip']");
    private final By searchInput = By.xpath("//input[@class='styles_input__IvCG7']");
    private final By regionButton = By.xpath("//div[@class='styles_wrapper__sQ207 styles_wrapper__heavy__pprSj']");
    private final By createAdButton = By.xpath("//button[@class='styles_button__oKUgO styles_default__ws8JN styles_size-m__NgAcw styles_with_icon__r87Pw']");
    private final By basketButton = By.xpath("//button[@class='styles_button__oKUgO styles_default__ws8JN styles_size-m__NgAcw styles_with_icon__r87Pw']");
    private final By signInButton = By.xpath("//div[@class='styles_profile__login-button__cqXFe']");


    public MainHeader(WebDriver driver) {
        super(driver);
    }

    public MainHeader clickToButtonSignIn() {
        driver.findElement(signInButton).click();
        return this;
    }

    public void waitButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
        wait.until(ExpectedConditions.presenceOfElementLocated(signInButton));
    }

    public void clickButtonAfterAdDisappears() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("container-banner-fullscreen")));
        driver.findElement(signInButton).click();
    }


}
