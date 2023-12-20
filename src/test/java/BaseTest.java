
import org.example.util.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest {
    protected WebDriver driver = DriverManager.getDriver();

    @BeforeMethod
    public void setUp() {
        driver.get(System.getenv("HOME_URL_KUFAR"));
    }
    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

}
