import org.example.pages.*;
import org.example.service.AdvertisingWindowService;
import org.example.service.CookieWindowService;
import org.example.service.LoginPageService;
import org.example.service.MainHeaderService;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import static org.example.Constants.HOME_URL;

public abstract class BaseTest {
    protected WebDriver driver = DriverManager.getDriver();
    protected MainHeaderService mainHeaderService = new MainHeaderService();
    protected LoginPageService loginPageService = new LoginPageService();
    protected CookieWindowService cookieWindowService = new CookieWindowService();
    protected AdvertisingWindowService advertisingWindowService = new AdvertisingWindowService();

    @BeforeMethod
    public void setUp() {
        driver.get(HOME_URL);
    }
    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

}
