package pages.frontend;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends BasePage {
    private static final By PRODUCT_NAME = By.cssSelector(".cart-card tr td:nth-of-type(2) a");
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(PRODUCT_NAME));
        return getText(PRODUCT_NAME);
    }
}
