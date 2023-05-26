package homewokr4;

import homework4.steps.Action;
import homework4.steps.Assertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
@@ -16,7 +15,8 @@
public class DriverSetup {
    protected static WebDriver driver;

    protected static HomePage homePage;
    protected static Action action;
    protected static Assertion assertion;

    @BeforeTest
    public static void setup() {
        @@ -33,10 +33,14 @@ public static void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            homePage = new HomePage(driver, properties.getProperty("site.url"));
            action = new Action(driver, properties);
            assertion = new Assertion(driver, properties);

            // 1. Open test site by URL
            action.navigateToHomePage();

            // 3. Perform login
            homePage.performLogin(properties.getProperty("user.name"), properties.getProperty("user.password"));
            action.performLogin();
        }

        @AfterTest
        public static void exit() {
            //10. Close Browser
            driver.close();
        }
    }