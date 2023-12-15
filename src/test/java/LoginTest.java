import org.example.service.AdvertisingWindowService;
import org.example.service.CookieWindowService;
import org.example.service.LoginPageService;
import org.example.service.MainHeaderService;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.example.Constants.HOME_URL;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
         MainHeaderService mainHeaderService = new MainHeaderService();
         LoginPageService loginPageService = new LoginPageService();
         CookieWindowService cookieWindowService = new CookieWindowService();
         AdvertisingWindowService advertisingWindowService = new AdvertisingWindowService();

         cookieWindowService.cookieClickOk();
         advertisingWindowService.waitingForAdvertisement();
         mainHeaderService.clickToButtonSignIn();
         loginPageService.enterLogin().enterPassword().clickButtonSignIn();
         mainHeaderService.loginVerification();

    }
}
