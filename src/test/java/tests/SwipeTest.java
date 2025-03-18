package tests;
import config.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SwipePage;

public class SwipeTest extends BaseTest{

    @Test
    public void testSwipe() {
        HomePage homePage = new HomePage(driver);
        SwipePage swipePage = new SwipePage(driver);

        homePage.goToSwipe();
        swipePage.swipeRight();
    }
}
