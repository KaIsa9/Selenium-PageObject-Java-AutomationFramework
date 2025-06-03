package listeners.allure;

import TestCases.BaseTest;
import TestCases.LoginTest;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.ScreenshotUtils;

public class AllureTestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
//        Object testClass = result.getInstance();
//        WebDriver driver = ((LoginTest) testClass).getDriver();
//        ScreenshotUtils.takeScreenshot(driver);
        Object testInstance = result.getInstance();
        if (testInstance instanceof BaseTest) {
            WebDriver driver = ((BaseTest) testInstance).getDriver();
            if (driver != null) {
                saveScreenshot(driver);
            } else {
                System.out.println("WebDriver is null in Allure listener.");
            }
        }
    }
    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
