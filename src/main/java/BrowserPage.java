import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserPage {

    WebDriver driver;
    @Before
    public void setup() {
    WebDriverManager.chromedriver().setup();

    String website_url = "https://www.tendable.com/";

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");

    driver = new ChromeDriver(options);
    driver.get(website_url);
}

    @After
    public void exit()
    {
        driver.quit();
    }

}
