package core;

import base.WebConfig;
import compnents.frontend.TopNavigationBar;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.admin.AdminLoginPage;
import pages.frontend.*;
import utils.BrowserUtils;

public class EcommercePlayground {
    private WebDriver driver;
    private HomePage homePage;
    private ProductDetailPage productDetailPage;
    private ProductListPage productListPage;
    private AdminLoginPage adminLoginPage;
    private BrowserUtils browserUtils;
    private SearchResultPage searchResultPage;
    private TopNavigationBar topNavigationBar;
    private CheckoutPage checkoutPage;

    public EcommercePlayground() {

    }
    //lazy instantiating methods
    public HomePage homePage() {
        if (homePage == null) {
            return new HomePage(driver);
        }
        return homePage;
    }

    public ProductDetailPage productDetailPage() {
        if (productDetailPage == null) {
            return new ProductDetailPage(driver);
        }
        return productDetailPage;
    }

    public ProductListPage productListPage() {
        if (productListPage == null) {
            return new ProductListPage(driver);
        }
        return productListPage;
    }
    public AdminLoginPage adminLoginPage() {
        if (adminLoginPage == null) {
            return new AdminLoginPage(driver);
        }
        return adminLoginPage;
    }

    public SearchResultPage searchResultPage() {
        if (searchResultPage == null) {
            return new SearchResultPage(driver);
        }
        return searchResultPage;
    }

    public TopNavigationBar topNavigationBar() {
        if (topNavigationBar == null) {
            return new TopNavigationBar(driver);
        }
        return topNavigationBar;
    }
    public CheckoutPage checkoutPage() {
        if (checkoutPage == null) {
            return new CheckoutPage(driver);
        }
        return checkoutPage;
    }

    public BrowserUtils browserUtils() {
        if (browserUtils == null) {
            return new BrowserUtils(driver);
        }
        return browserUtils;
    }


    public void startBrowser() {
        String browser = WebConfig.BROWSER;

        switch (browser) {
            case "chrome" : {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            }

            case "firefox" : {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            }

            case "edge" : {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
            }

            default : {
                throw new RuntimeException("Not supported browser: " + browser);
            }

        }

        driver.manage().deleteAllCookies();
    }


}
