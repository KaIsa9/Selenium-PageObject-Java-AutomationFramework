package TestCases;

import Pages.LoginPage;
import Pages.HomePage;
import driverManager.DriverManagerType;
import driverManager.WebDrivers;
import listeners.allure.AllureTestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import util.utility;

import java.util.Properties;

@Listeners(AllureTestListener.class)
public class BaseTest {

    protected LoginPage loginPage;
    protected HomePage homePage;
    WebDriver driver;
    Properties properties;
    static String URL;

    @BeforeMethod
    public void setUp() {
        String propertyPath = System.getProperty("user.dir") + "//src//test//resources//Env.properties";
        try {
            driver = WebDrivers.getDriver(DriverManagerType.FIREFOX);
            properties = utility.loadProperties(propertyPath);
            URL = properties.getProperty("URL");

            loginPage = new LoginPage(driver);
            homePage = new HomePage(driver);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterMethod
    public void destroyDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}