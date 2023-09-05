import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TendableAutomationTest extends BrowserPage{


    @Test//Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why Tendable.
    public void validateAccessibilityOfTopLevelMenu()
    {
        TendableHomePage tendableHomePage = new TendableHomePage(driver);
        assertTrue("Fail to find 'Tendable' title", tendableHomePage.confirmTendableTitleIsVisible());
        assertTrue("Fail to find 'Our Story' link", tendableHomePage.confirmOurStoryLinkIsVisible());
        assertTrue("Fail to find 'Our Solution' link", tendableHomePage.confirmOurSolutionLinkIsVisible());
        assertTrue("Fail to find 'Why Tendable?' link", tendableHomePage.confirmWhyTendableLinkIsVisible());
    }

    @Test//Verify that the "Request a Demo" button is present and active on each of the aforementioned top-level menu pages.
    public void validateRequestDemoButtonIsFunctional() {
        TendableHomePage tendableHomePage = new TendableHomePage(driver);
        assertTrue("Fail to find 'Tendable' title", tendableHomePage.confirmTendableTitleIsVisible());
        assertTrue("Fail to click 'Tendable' title", tendableHomePage.clickTendableTitleIcon());
        assertTrue("Fail to click 'Request A Demo' button on 'Home' page", tendableHomePage.clickRequestADemoButton());

        RequestDemoPage requestDemoPage = new RequestDemoPage(driver);
        assertTrue("Fail to find 'Request A Demo' title", requestDemoPage.confirmRequestADemoTitleIsVisible());

        OurStoryPage ourStoryPage = new OurStoryPage(driver);
        assertTrue("Fail to click 'Our Story' link", tendableHomePage.clickOurStoryLink());
        assertTrue("Fail to click 'Tend.Able' image on 'Our Story' page", ourStoryPage.confirmTendableImageIsVisible());
        assertTrue("Fail to click 'Request A Demo' button on 'Our Story' page", ourStoryPage.clickRequestADemoButton());
        assertTrue("Fail to find 'Request A Demo' title on 'Our Story' page", requestDemoPage.confirmRequestADemoTitleIsVisible());

        OurSolutionPage ourSolutionPage = new OurSolutionPage(driver);
        assertTrue("Fail to click 'Our Solution' link", tendableHomePage.clickOurSolutionLink());
        assertTrue("Fail to find 'Quality inputs deliver' text on 'Our Solution' page", ourSolutionPage.confirmQualityInputDeliversTextIsVisible());
        assertTrue("Fail to click 'Request A Demo' button on 'Our Solution' page", ourSolutionPage.clickRequestADemoButton());
        assertTrue("Fail to find 'Request A Demo' title on 'Our Solution' page", requestDemoPage.confirmRequestADemoTitleIsVisible());

        WhyTendable whyTendable = new WhyTendable(driver);
        assertTrue("Fail to click 'Why Tendable?' link", tendableHomePage.clickWhyTendableLink());
        assertTrue("Fail to find 'Why should you choose Tendable?' text on 'Why Tendable?' page", whyTendable.confirmWhyShouldYouChooseTendableTextIsVisible());
        assertTrue("Fail to click 'Request A Demo' button on 'Why Tendable?' page", whyTendable.clickRequestADemoButton());
        assertTrue("Fail to find 'Request A Demo' title on 'OWhy Tendable?' page", requestDemoPage.confirmRequestADemoTitleIsVisible());

    }
    @Test
    public void validateContactUsFormUnderMarketingSection() throws InterruptedException {
        TendableHomePage tendableHomePage = new TendableHomePage(driver);
        assertTrue("Failed to click 'Contact Us' button", tendableHomePage.clickContactUsButton());
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        assertTrue("Failed to find 'Contact Us' Text", contactUsPage.confirmContactUsTextIsVisible());
        assertTrue("Failed to click marketing 'Contact' button", contactUsPage.clickMarketingContactButton());
        //String fullName = "Matthew Marry";
        String fullName = RandomStringUtils.randomAlphabetic(10);
        assertTrue("Failed to sendKeys to 'Full Name' text box", contactUsPage.sendKeysToFullNameTextBox(fullName));
        String organisationName = RandomStringUtils.randomAlphabetic(8);
        assertTrue("Failed to sendKeys to 'Organisation Name' text box", contactUsPage.sendKeysToOrganisationTextBox(organisationName));
        String phoneNumber = RandomStringUtils.randomNumeric(10);
        assertTrue("Failed to sendKeys to 'Phone Number' text box", contactUsPage.sendKeysToPhoneNumberTextBox(phoneNumber));
        String email = RandomStringUtils.randomAlphabetic(7) + "@test.lcl";
        assertTrue("Failed to sendKeys to 'Email' text box", contactUsPage.sendKeysToEmailTextBox(email));
        String jobRole = "Executive Board Member";
        assertTrue("Failed to select job role", contactUsPage.selectGivenJobRoleDropdownOption(jobRole));
        Thread.sleep(4000);//Temporary solution to avoid 'Flakiness'
        assertTrue("Failed to find 'I Agree' radio button",contactUsPage.confirmIAgreeRadioIsVisible());
        assertTrue("Failed to click 'I Agree' button", contactUsPage.clickIAgreeRadio());
        assertTrue("Failed to click 'Submit' button", contactUsPage.clickSubmitButton());
        Thread.sleep(2000);//Temporary solution to avoid 'Flakiness'
        String expectedMessage = "Sorry, there was an error submitting the form. Please try again.";
        assertEquals("Failed to match error message", expectedMessage, contactUsPage.getErrorMessage());
    }

}
