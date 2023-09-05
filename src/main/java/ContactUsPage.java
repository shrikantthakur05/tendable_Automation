import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    private final By CONTACT_US_TEXT = By.xpath("//h1[text()='Contact us']");
    private final By MARKETING_CONTACT_BUTTON = By.xpath("//div[normalize-space()='Marketing']//following-sibling::div/button[text()='Contact']");
    private final By FULL_NAME_TEXT_BOX = By.id("form-input-fullName");
    private final By ORGANISATION_NAME_TEXT_BOX = By.id("form-input-organisationName");
    private final By PHONE_NUMBER_TEXT_BOX = By.id("form-input-cellPhone");
    private final By EMAIL_TEXT_BOX = By.id("form-input-email");
    private final By JOB_ROLE_DROPDOWN = By.id("form-input-jobRole");
    private final By SUBMIT_BUTTON = By.name("form_page_submit");
    private final By I_AGREE_RADIO = By.xpath("//form[@id='contactMarketingPipedrive-163701']//label/input[@name='consentAgreed']");
    private final  By ERROR_MESSAGE = By.xpath("//div/p[normalize-space()='Sorry, there was an error submitting the form. Please try again.']");

    public boolean confirmContactUsTextIsVisible() {
        return confirmElementIsVisible(CONTACT_US_TEXT);
    }

    public boolean clickMarketingContactButton() {
        return clickElement(MARKETING_CONTACT_BUTTON);
    }

    public boolean sendKeysToFullNameTextBox(String value) {
        return sendKeysToElement(FULL_NAME_TEXT_BOX, value);
    }

    public boolean sendKeysToOrganisationTextBox(String value) {
        return sendKeysToElement(ORGANISATION_NAME_TEXT_BOX, value);
    }

    public boolean sendKeysToPhoneNumberTextBox(String value) {
        return sendKeysToElement(PHONE_NUMBER_TEXT_BOX, value);
    }

    public boolean sendKeysToEmailTextBox(String value) {
        return sendKeysToElement(EMAIL_TEXT_BOX, value);
    }

    public boolean selectGivenJobRoleDropdownOption(String job) {
        return selectElementByText(JOB_ROLE_DROPDOWN, job);
    }

    public boolean clickSubmitButton() {
        return clickElement(SUBMIT_BUTTON);
    }

    public boolean clickIAgreeRadio() {
        return clickElement(I_AGREE_RADIO);
    }

    public boolean confirmIAgreeRadioIsVisible() {
        return confirmElementIsVisible(I_AGREE_RADIO);
    }

    public String getErrorMessage() {
        return getElementText(ERROR_MESSAGE);
    }

    public boolean scrollToSubmitButton() {
        return scrollToElement(SUBMIT_BUTTON);
    }
}
