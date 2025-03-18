package pageobjects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage {
    private final AppiumDriver driver;
    private final By emailField = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    private final By passwordField = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    private final By loginButton = By.xpath("//android.widget.Button[@content-desc='button-LOGIN']");
    private final By successMessage = By.xpath("//android.widget.TextView[@content-desc='message']");
    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void tapLoginButton() {
        driver.findElement(loginButton).click();
    }
    public boolean isLoginSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}




