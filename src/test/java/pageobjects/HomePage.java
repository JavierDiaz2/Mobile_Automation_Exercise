package pageobjects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage {
    private final AppiumDriver driver;
    private final By loginButton = By.xpath("//android.widget.Button[@content-desc='Login']");
    private final By swipeButton = By.xpath("//android.widget.Button[@content-desc='Swipe']");
    private final By formsButton = By.xpath("//android.widget.Button[@content-desc='Forms']");
    public HomePage(AppiumDriver driver) {
        this.driver = driver;
    }
    public void goToLogin() {
        driver.findElement(loginButton).click();
    }
    public void goToSwipe() {
        driver.findElement(swipeButton).click();
    }
    public void goToForms() {
        driver.findElement(formsButton).click();
    }
}










