import org.testng.annotations.Test;

import static org.example.Constants.HOME_URL;

public class LoginTests extends BaseTest {
    @Test
    public void clickButtonSignIn() {
        basePage.openUrl(HOME_URL);
        cookieWindow.cookieClickOk();
        mainHeader.clickToButtonSignIn();
    }

    @Test
    public void login() {
        mainHeader.switchToActiveElement();
        loginPage.emailInputClick().enterLoginAndGoPassword().enterPasswordAndSignIn();
    }
}
