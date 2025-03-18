package tests;
import config.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignupPage;
import java.util.UUID;

public class SignupTest extends BaseTest{

    @Test
    public void testSignup() {
        HomePage homePage = new HomePage(driver);
        SignupPage signupPage = new SignupPage(driver);

        String randomEmail = "user" + UUID.randomUUID() + "@example.com";

        homePage.goToLogin();
        signupPage.tapSignupButton();
        signupPage.enterEmail(randomEmail);
        signupPage.enterPassword("password");
        signupPage.tapSubmit();

        Assert.assertTrue(signupPage.isSignupSuccessful(), "Error on signup");
    }
}
