import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurSolutionPage extends BasePage{

    public OurSolutionPage(WebDriver driver) {
        super(driver);
    }

    private final By QUALITY_INPUT_DELIVERS_TEXT = By.xpath("//h1[contains(text(),'Quality inputs deliver')]");
    private final By REQUEST_A_DEMO_BUTTON = By.linkText("Request a Demo");


    public boolean confirmQualityInputDeliversTextIsVisible() {
        return confirmElementIsVisible(QUALITY_INPUT_DELIVERS_TEXT);
    }

    public boolean clickRequestADemoButton() {
        return clickElement(REQUEST_A_DEMO_BUTTON);
    }
}
