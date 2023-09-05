import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected boolean clickElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
    protected boolean confirmElementIsVisible(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            return webElement.isDisplayed();

        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    protected boolean sendKeysToElement(By locator, String value) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(value);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    protected boolean selectElementByText(By locator, String value) {
        try {
            WebElement webElement = driver.findElement(locator);
            new Select(webElement).selectByValue(value);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    protected String getElementText(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            return webElement.getText();
        } catch (Exception exception) {
            exception.printStackTrace();
            return " ";
        }
    }

    public boolean scrollToElement(By locator) {
        WebElement webElement = driver.findElement(locator);
        JavascriptExecutor obj = (JavascriptExecutor) driver;
        obj.executeScript("arguments[0].scrollIntoView();", webElement);
        return true;
    }

    public void scrollToTop() {
        JavascriptExecutor obj = (JavascriptExecutor) driver;
        obj.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    }

    public void scrollToBottom() {
        JavascriptExecutor obj = (JavascriptExecutor) driver;
        obj.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

}
