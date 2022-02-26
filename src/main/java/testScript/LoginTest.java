package testScript;
import org.junit.After;
import org.junit.Test;
import  org.junit.Before;

import org.openqa.selenium.WebDriver;

import page.LoginPage;



public class LoginTest {

    private WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.driver.get("https://practis.co.il/automation/");
    }

    @Test
    public void loginTest() throws InterruptedException {
        loginPage = new LoginPage(driver);

        loginPage.sendKeysName();
        loginPage.sendKeysPassword();
        loginPage.clickLogin();
        loginPage.assertValidation();

    }

    @After
    public void tearDown() throws Exception {
        driver.close();


    }







}
