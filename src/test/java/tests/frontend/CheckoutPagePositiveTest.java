package tests.frontend;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CheckoutPagePositiveTest extends BaseTest {
    @Test
    @DisplayName("Proceed to 'Checkout page'")
    @Tag("Regression")
    public void addProductInTheCart() {
        ecommercePlayground().homePage().goTo();
        ecommercePlayground().topNavigationBar().typeTextInTheSearchInputField("iPhone");
        ecommercePlayground().topNavigationBar().clickOnTheSearchButton();
        ecommercePlayground().searchResultPage().clickTheFirstProductOnTheSearchResultPage();
        ecommercePlayground().productDetailPage().clickTheBuyNowButton();
        String productName = ecommercePlayground().checkoutPage().getProductName();
        Assertions.assertEquals("iPhone".toLowerCase(), productName.toLowerCase());
    }
}
