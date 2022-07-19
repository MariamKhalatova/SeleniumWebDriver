package baseFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.common.HomePage;


public class BaseTests {
    public static WebDriver driver;
    public String baseURL = "http://automationpractice.com/index.php";
    HomePage homePage = new HomePage(driver);

    @BeforeClass
    public static void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testOne() throws InterruptedException {
        homePage.navigateToHomePage(baseURL);
        Thread.sleep(2000);
        //  homePage.inputSearchValue("dress");


    }


    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }
}

