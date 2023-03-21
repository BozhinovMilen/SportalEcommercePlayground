package utils;

import base.WebConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.HashMap;

public class BrowserUtils {
    private WebDriver driver;

    public BrowserUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void quitBrowsed() {
        driver.quit();
    }

    public WebDriver startBrowser() {
        String browser = WebConfig.BROWSER;

        switch (browser) {
            case "chrome" : {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }

            case "firefox" : {
                setupDriver(DriverManagerType.FIREFOX);
                FirefoxProfile firefoxProfile = new FirefoxProfile();
                firefoxProfile.setPreference("webdriver.load.strategy", "unstable");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setAcceptInsecureCerts(true);
                firefoxOptions.setProfile(firefoxProfile);
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                driver = new FirefoxDriver(firefoxOptions);
                driver.manage().window().maximize();
                break;
            }

            case "edge" : {
                setupDriver(DriverManagerType.EDGE);
                EdgeOptions edgeOptions = new EdgeOptions();
                driver = new EdgeDriver(edgeOptions);
                driver.manage().window().maximize();
                break;
            }

            default : {
                throw new RuntimeException("Not supported browser: " + browser);
            }

        }

        driver.manage().deleteAllCookies();
        return driver;
    }


    /**
     * Get driver via manager
     *
     * @param driverType
     */
    private void setupDriver(DriverManagerType driverType) {
        WebDriverManager.getInstance(driverType).setup();
    }

}
