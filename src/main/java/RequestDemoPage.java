import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestDemoPage extends BasePage{

    public RequestDemoPage(WebDriver driver) {
        super(driver);
    }

    private final By REQUEST_A_DEMO_TITLE = By.xpath("//h1[text()='Request a Demo']");

    public boolean confirmRequestADemoTitleIsVisible() {
        return confirmElementIsVisible(REQUEST_A_DEMO_TITLE);
    }

}
