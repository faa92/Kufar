import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.example.Constants.HOME_URL;

public class LoginTests extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTests.class);


    @Test
    public void clickButtonSignIn() {
        log.info("Start!");
        basePage.openUrl(HOME_URL);
        cookieWindow.cookieClickOk();

    }

    @Test
    public void login() {
        mainHeader.clickToButtonSignIn();
        mainHeader.switchToActiveElement();
        loginPage.emailInputClick().enterLoginAndGoPassword().enterPasswordAndSignIn();
    }
}
