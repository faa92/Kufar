import org.example.pages.*;
import org.example.service.AdvertisingWindowService;
import org.example.service.CookieWindowService;
import org.example.service.LoginPageService;
import org.example.service.MainHeaderService;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public abstract class BaseTest {
    protected WebDriver driver = DriverManager.getDriver();
    protected MainHeaderService mainHeaderService = new MainHeaderService();
    protected LoginPageService loginPageService = new LoginPageService();
    protected CookieWindowService cookieWindowService = new CookieWindowService();
    protected AdvertisingWindowService advertisingWindowService = new AdvertisingWindowService();

}
