package tests.admin;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AdminLoginNegativeTest extends BaseTest {

    @Test
    @DisplayName("Tries to login on the admin side by entering wrong username amd wrong password")
    @Tag("Regression")
    public void tryToLoginToTheAdminPanelWithWrongUsernameAndPassword() {
        ecommercePlayground().adminLoginPage().goTo();
        ecommercePlayground().adminLoginPage().loginToTheAdminPanel(
                "milenAdminMilen", "milenAdminMilen&123456");
        String theTextOfTheAlert = ecommercePlayground().adminLoginPage().getTheTextOfTheAlert();
        Assertions.assertTrue(theTextOfTheAlert.contains("No match for Username and/or Password."));
    }
}
