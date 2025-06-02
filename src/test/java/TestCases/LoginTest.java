package TestCases;

import org.testng.annotations.Test;

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
        homePage.searchForProducts();

    }


}
