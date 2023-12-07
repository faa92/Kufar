import org.example.pages.BasePage;
import org.example.pages.CookieWindow;
import org.example.pages.LoginPage;
import org.example.pages.MainHeader;
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver = DriverManager.getDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MainHeader mainHeader = new MainHeader(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected CookieWindow cookieWindow = new CookieWindow(driver);

//@AfterSuite (alwaysRun = true)
//    public void quitDriver() {
//        driver.quit();
//    }


}
