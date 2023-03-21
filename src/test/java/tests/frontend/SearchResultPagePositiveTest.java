package tests.frontend;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPagePositiveTest extends BaseTest {
    @Test
    @DisplayName("Search for products by using search input field")
    @Tag("Regression")
    public void searchForProductsByUsingSearchInputField() {
        ecommercePlayground().homePage().goTo();
        ecommercePlayground().topNavigationBar().typeTextInTheSearchInputField("iPhone");
        ecommercePlayground().topNavigationBar().clickOnTheSearchButton();
        List<WebElement> allTheProductsOnTheSearchResultPage =
                ecommercePlayground().searchResultPage().getAllTheProductTitlesOnTheSearchResultPage();
        allTheProductsOnTheSearchResultPage.forEach(productTitle ->
                Assertions.assertEquals("iPhone".toLowerCase(), productTitle.getText().toLowerCase()));
    }
}
