package pages.admin;

import base.BasePage;
import base.WebConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AdminLoginPage extends BasePage {
    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector(".btn-primary");
    private static final By NO_MATCH_ALERT = By.cssSelector(".alert.alert-danger.alert-dismissible");

    public AdminLoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Redirects to the 'Admin login' page.
     */
    public void goTo() {
        driver.get(WebConfig.ADMIN_AREA_URL);
    }

    /**
     * Enters String in the 'Username' input field on the 'Admin login' page.
     * @param userName The String that will be inserted in the 'Username' input field.
     */
    public void typeUsername(String userName) {
        typeText(USERNAME_INPUT_FIELD, userName);
    }

    /**
     * Enters String in the 'Password' input field on the 'Admin login' page.
     * @param password The String that will be inserted in the 'Password' input field.
     */
    public void typePassword(String password) {
        typeText(PASSWORD_INPUT_FIELD, password);
    }

    /**
     * Clicks the 'Login' button on the 'Admin login' page.
     */
    public void clickTheLoginButton() {
        click(LOGIN_BUTTON);
    }

    /**
     * Logs the user in with given credentials.
     * @param username The String that will be inserted in the 'Username' input field.
     * @param password The String that will be inserted in the 'Password' input field.
     */
    public void loginToTheAdminPanel(String username, String password) {
        typeUsername(username);
        typePassword(password);
        clickTheLoginButton();
    }

    /**
     * Gets the text from the 'No match' alert on the 'Admin login' page.
     * @return The text from the 'No match' alert on the 'Admin login' page.
     */
    public String getTheTextOfTheAlert() {
        return driver.findElement(NO_MATCH_ALERT).getText();
    }
}
