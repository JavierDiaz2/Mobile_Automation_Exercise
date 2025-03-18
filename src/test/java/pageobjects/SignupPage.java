package pageobjects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SignupPage {
    private final AppiumDriver driver;
    private final By signupButton = By.xpath("//android.widget.Button[@content-desc='button-SIGN UP']");
    private final By emailField = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    private final By passwordField = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    private final By confirmPasswordField = By.xpath("//android.widget.EditText[@content-desc='input-password-confirm']");
    private final By submitButton = By.xpath("//android.widget.Button[@content-desc='button-SUBMIT']");
    private final By successMessage = By.xpath("//android.widget.TextView[@content-desc='message']");
    public SignupPage(AppiumDriver driver) {
        this.driver = driver;
    }
    public void tapSignupButton() {
        driver.findElement(signupButton).click();
    }
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(password);
    }
    public void tapSubmit() {
        driver.findElement(submitButton).click();
    }
    public boolean isSignupSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}
