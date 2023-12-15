package org.example.pages;

import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver = DriverManager.getDriver();

}
