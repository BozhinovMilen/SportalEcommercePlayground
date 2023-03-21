package pages.frontend;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends BasePage {

    private static final By PRODUCT_TITLE = By.cssSelector("div.product-thumb h4");
    private static final By PRODUCT_THUMB = By.cssSelector("div.product-thumb");
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickTheFirstProductOnTheSearchResultPage() {
        click(PRODUCT_THUMB);
    }

    public List<WebElement> getAllTheProductTitlesOnTheSearchResultPage() {
        return findElements(PRODUCT_TITLE);
    }
}
