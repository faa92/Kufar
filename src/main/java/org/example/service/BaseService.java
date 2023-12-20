package org.example.service;

import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseService {
    protected   final Logger logger;
    protected WebDriver driver = DriverManager.getDriver();

    public BaseService(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }
}
