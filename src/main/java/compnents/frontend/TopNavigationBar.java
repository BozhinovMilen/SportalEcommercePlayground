package compnents.frontend;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopNavigationBar extends BasePage {

    private static final By SEARCH_INPUT_FIELD = By.name("search");
    private static final By SEARCH_BUTTON = By.className("search-button");
    public TopNavigationBar(WebDriver driver) {
        super(driver);
    }


    public void typeTextInTheSearchInputField(String textToBeTyped) {
        typeText(SEARCH_INPUT_FIELD, textToBeTyped);
    }

    public void clickOnTheSearchButton() {
        click(SEARCH_BUTTON);
    }

}
