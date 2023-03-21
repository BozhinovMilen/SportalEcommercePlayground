package base;

public class WebConfig {
    //the URL of the homepage.
    public static final String HOMEPAGE_URL = "https://ecommerce-playground.lambdatest.io";

    // the URL of the /admin area.
    public static final String ADMIN_AREA_URL = HOMEPAGE_URL + "/admin";

    //the Browser u run the tests with. Default is chrome
    public static final String BROWSER = System.getProperty("browser") != null ?
            System.getProperty("browser").toLowerCase().trim() : "chrome";

}
