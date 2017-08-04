import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTest {

    private WebDriver driver;
    private HomePage homePage = new HomePage();

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get(HomePage.URL);
    }

    @Test
    public void checkTitleTest() {
        homePage.shouldAppear(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
