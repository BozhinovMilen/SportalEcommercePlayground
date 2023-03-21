package pages.frontend;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductDetailPage extends BasePage {
    private static final By BUY_NOW_BUTTON = By.cssSelector(".btn-buynow");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void clickTheBuyNowButton() {
        final List<WebElement> frames = driver.findElements(By.tagName("frame"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(BUY_NOW_BUTTON));
        click(BUY_NOW_BUTTON);
    }
}
