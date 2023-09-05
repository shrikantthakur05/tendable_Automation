import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhyTendable extends BasePage{
    public WhyTendable(WebDriver driver) {
        super(driver);
    }

    private final By WHY_SHOULD_YOU_CHOOSE_TENDABLE_TEXT = By.xpath("//h2[contains(text(),'Why should you')]");
    private final By REQUEST_A_DEMO_BUTTON = By.linkText("Request a Demo");

    public boolean confirmWhyShouldYouChooseTendableTextIsVisible() {
        return confirmElementIsVisible(WHY_SHOULD_YOU_CHOOSE_TENDABLE_TEXT);
    }

    public boolean clickRequestADemoButton() {
        return clickElement(REQUEST_A_DEMO_BUTTON);
    }
}
