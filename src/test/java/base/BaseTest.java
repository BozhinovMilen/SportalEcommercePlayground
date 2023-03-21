package base;

import core.EcommercePlayground;
import org.junit.jupiter.api.*;

public class BaseTest {
    protected EcommercePlayground ecommercePlayground;

    public BaseTest() {
    }


    @BeforeEach
    public void beforeEachTests() {

        ecommercePlayground().startBrowser();
    }

    @AfterEach
    public void afterEachTests() {
        ecommercePlayground().browserUtils().quitBrowsed();
    }


    protected EcommercePlayground ecommercePlayground() {
        if (ecommercePlayground == null) {
            ecommercePlayground = new EcommercePlayground();
        }
        return ecommercePlayground;
    }


}
