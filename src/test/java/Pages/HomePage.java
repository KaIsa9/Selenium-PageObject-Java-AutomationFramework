package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePageClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@placeholder='Search for Products, Brands and More']")
    WebElement searchForProducts;

    @FindBy(xpath = "")
    WebElement mobileNames;

    @Step("Search for products [{product}]")
    public void searchForProducts(String product) {
        webActionHelperMethods.clickbutton(searchForProducts);
        searchForProducts.sendKeys(product);
        searchForProducts.sendKeys(Keys.ENTER);
    }
}
