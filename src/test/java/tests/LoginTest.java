package tests;
import config.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goToLogin();
        loginPage.enterEmail("user@example.com");
        loginPage.enterPassword("password");
        loginPage.tapLoginButton();

        Assert.assertTrue(loginPage.isLoginSuccessful(),"Error en login");
    }
}
