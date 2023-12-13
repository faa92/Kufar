import org.example.service.CookieWindowService;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.example.Constants.HOME_URL;

public class LoginTest extends BaseTest {

    @Test
    public void login() {


        try {
            cookieWindowService.cookieClickOk();
            advertisingWindowService.waitingForAdvertisement();
            mainHeaderService.clickToButtonSignIn();
            loginPageService.enterLogin().enterPassword().clickButtonSignIn();
            mainHeaderService.loginVerification();

        } catch (NoSuchElementException e) {
            advertisingWindowService.waitingForAdvertisement();
            mainHeaderService.clickToButtonSignIn();
            loginPageService.enterLogin().enterPassword().clickButtonSignIn();
            mainHeaderService.loginVerification();
        }
    }
}
