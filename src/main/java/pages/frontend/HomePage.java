package pages.frontend;

import base.BasePage;
import base.WebConfig;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(WebConfig.HOMEPAGE_URL);
    }
}
