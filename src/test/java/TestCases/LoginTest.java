package TestCases;

import listeners.allure.AllureTestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners(AllureTestListener.class)
public class LoginTest extends BaseTest {


    @Test
    public void TEST_CASE_ONE() {
        driver.get(URL);
        loginPage.pressExc();
    }

    @Test
    public void TEST_CASE_TWO() throws Exception {
        driver.get(URL);
        loginPage.pressExc();
        homePage.searchForProducts("Mobiles");
        assertTrue(false);

    }

    public WebDriver getDriver() {
        return driver;
    }


}
