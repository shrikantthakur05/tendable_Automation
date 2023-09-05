import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TendableHomePage extends BasePage{

    public TendableHomePage(WebDriver driver) {
        super(driver);
    }

    private final By TENDABLE_TITLE = By.xpath("//img[@alt='Tendable Logo']");
    private final By OUR_STORY_LINK = By.linkText("Our Story");
    private final By OUR_SOLUTION_LINK = By.linkText("Our Solution");
    private final By WHY_TENDABLE_LINK = By.linkText("Why Tendable?");
    private final By REQUEST_A_DEMO_BUTTON = By.linkText("Request a Demo");
    private final By CONTACT_US_BUTTON = By.linkText("Contact Us");

    public boolean clickTendableTitleIcon() {
        return clickElement(TENDABLE_TITLE);
    }

    public boolean confirmTendableTitleIsVisible() {
        return confirmElementIsVisible(TENDABLE_TITLE);
    }

    public boolean confirmOurStoryLinkIsVisible() {
        return confirmElementIsVisible(OUR_STORY_LINK);
    }

    public boolean confirmOurSolutionLinkIsVisible() {
        return confirmElementIsVisible(OUR_SOLUTION_LINK);
    }

    public boolean confirmWhyTendableLinkIsVisible() {
        return confirmElementIsVisible(WHY_TENDABLE_LINK);
    }

    public boolean clickRequestADemoButton() {
        return clickElement(REQUEST_A_DEMO_BUTTON);
    }

    public boolean clickOurStoryLink() {
        return clickElement(OUR_STORY_LINK);
    }

    public boolean clickOurSolutionLink() {
        return clickElement(OUR_SOLUTION_LINK);
    }

    public boolean clickWhyTendableLink() {
        return clickElement(WHY_TENDABLE_LINK);
    }

    public boolean clickContactUsButton() {
        return clickElement(CONTACT_US_BUTTON);
    }


}
