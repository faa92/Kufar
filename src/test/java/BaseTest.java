import org.example.pages.*;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver = DriverManager.getDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MainHeader mainHeader = new MainHeader(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected CookieWindow cookieWindow = new CookieWindow(driver);
    protected MailingWindow mailingWindow = new MailingWindow(driver);
    protected AdvertisingWindow advertisingWindow = new AdvertisingWindow(driver);


}
