package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Clicks on WebElement.
     * @param locator The locator of the WebElement that will be clicked on.
     */
    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    /**
     * Clears the text from input WebElement and writes text in it.
     * @param locator The locator of the WebElement that will be written in.
     * @param textToBeWritten The text the user wants to write in the WebElement.
     */
    protected void typeText(By locator, String textToBeWritten) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(textToBeWritten);
    }

    /**
     * Finds the first WebElement that match the provided locator and returns it.
     * @param locator The locator which the WebElement should match.
     * @return The first WebElement that match the provided locator.
     */
    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    /**
     * Finds all the elements that match the provided locator and returns them as List of WebElements.
     * @param locator The locator which the WebElements should match.
     * @return List of the elements that match the provided locator.
     */
    protected List<WebElement> findElements(By locator) {
       return driver.findElements(locator);
    }

    /**
     * Gets the visible text of an WebElement and its children
     * @param locator The locator which the WebElements should match.
     * @return The text  ot the WebElement and its children
     */
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }


}
