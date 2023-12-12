import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.example.Constants.HOME_URL;

public class LoginTests extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTests.class);

    @Test
    public void login() {
        log.info("Start!!!");
        basePage.openUrl(HOME_URL);
        log.info("open url");

        cookieWindow.cookieClickOk();
        log.info("cookie OK");

        log.info("start WAIT");
        advertisingWindow.waitingForAdvertisement();
        log.info("END WAIT");

        mainHeader.clickToButtonSignIn();
        log.info("click button sign in");

        loginPage.enterLogin().enterPassword().clickButtonSignIn();
        log.info("sign in");

        mainHeader.clickPersonalIcon();
    }
}
