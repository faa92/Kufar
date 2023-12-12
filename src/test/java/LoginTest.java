import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.example.Constants.HOME_URL;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @BeforeMethod
    public void setUp() {
        driver.get(HOME_URL);
    }
    @AfterSuite
    public void closeDriver(){driver.quit();}


    @Test
    public void login() {
        log.info("Start!!!");

        cookieWindowService.cookieClickOk();
        log.info("Click cookie OK");

        log.info("Start WAIT");
        advertisingWindowService.waitingForAdvertisement();
        log.info("End WAIT");

        mainHeaderService.clickToButtonSignIn();
        log.info("Click button sign in");

        loginPageService.enterLogin().enterPassword().clickButtonSignIn();
        log.info("Sign in");

        Assert.assertTrue(mainHeaderService.isLoggedIn(), "Login FAILED!");
    }
}
