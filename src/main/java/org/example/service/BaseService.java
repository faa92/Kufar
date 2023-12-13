package org.example.service;

import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseService {
    protected WebDriver driver = DriverManager.getDriver();
    protected   final Logger logger;

    public BaseService(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }
}
