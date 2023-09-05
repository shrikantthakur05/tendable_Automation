import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurStoryPage extends BasePage{
    public OurStoryPage(WebDriver driver) {
        super(driver);
    }

    private final By TENDABLE_IMAGE = By.xpath("//img[@alt='Tendable meaning']");
    private final By REQUEST_A_DEMO_BUTTON = By.linkText("Request a Demo");

    public boolean clickRequestADemoButton() {
        return clickElement(REQUEST_A_DEMO_BUTTON);
    }

    public boolean confirmTendableImageIsVisible() {
        return confirmElementIsVisible(TENDABLE_IMAGE);
    }
}
