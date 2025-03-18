package pageobjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import java.time.Duration;
public class SwipePage {
    private final AppiumDriver driver;
    private final By swipeCard = By.xpath("//android.view.ViewGroup[@content-desc='card']");
    public SwipePage(AppiumDriver driver) {
        this.driver = driver;
    }
    public void swipeRight() {
        int startX = driver.manage().window().getSize().width * 3 / 4;
        int endX = driver.manage().window().getSize().width / 4;
        int startY = driver.manage().window().getSize().height / 2;
        new AndroidTouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }
}
