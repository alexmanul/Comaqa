import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AboutUsTest {

    private static final String URL = "https://comaqa.by/en/";
    private static final String EXPECTED_TITLE = "About us | COMAQA.BY – QA Automation Community Belarus";
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @Test
    public void checkAboutUsTitleTest() throws InterruptedException {
        WebElement aboutUsButton = driver.findElement(HomePage.ABOUT_US);
        aboutUsButton.click();
        Assert.assertEquals(driver.getTitle(), EXPECTED_TITLE);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}