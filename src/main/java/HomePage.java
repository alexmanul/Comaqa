import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public static final By ABOUT_US = By.cssSelector("#menu-item-636 > a");
    public static final By TITLE = new By.ByTagName("title");
    public static final String URL = "https://comaqa.by/en/";

    public void shouldAppear(WebDriver driver) {
        WebElement title = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(TITLE));

    }
}
