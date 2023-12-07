package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainHeader extends BasePage {
    private final By categoriesButton = By.xpath("//button[@data-name='category-chip']");
    private final By searchInput = By.xpath("//input[@class='styles_input__IvCG7']");
    private final By regionButton = By.xpath("//div[@class='styles_wrapper__sQ207 styles_wrapper__heavy__pprSj']");
    private final By createAdButton = By.xpath("//button[@class='styles_button__oKUgO styles_default__ws8JN styles_size-m__NgAcw styles_with_icon__r87Pw']");
    private final By basketButton = By.xpath("//button[@class='styles_button__oKUgO styles_default__ws8JN styles_size-m__NgAcw styles_with_icon__r87Pw']");
    private final By signInButton = By.xpath("//button[@class='styles_button__oKUgO styles_default__ws8JN styles_size-m__NgAcw styles_with_icon__r87Pw']");


    public MainHeader(WebDriver driver) {
        super(driver);
    }

    public MainHeader clickToButtonSignIn() {
        driver.findElement(signInButton).click();
        return this;
    }

}
