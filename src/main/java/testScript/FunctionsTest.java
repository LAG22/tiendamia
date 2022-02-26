package testScript;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.LoginPage;
import page.FunctionsPage;

public class FunctionsTest {

    private WebDriver driver;
    LoginPage loginPage;
    FunctionsPage functionsPage;

    @Before
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.driver.get("https://practis.co.il/automation/");
    }

    @Test
    public void functionsTest() throws InterruptedException {
        loginPage = new LoginPage(driver);
        functionsPage = new FunctionsPage(driver);

        loginPage.driver.manage().window().maximize();
        loginPage.sendKeysName();
        loginPage.sendKeysPassword();
        loginPage.clickLogin();
        functionsPage.clickDO2();
        functionsPage.clickDecrease();
        functionsPage.clickDecrease();
        functionsPage.clickDecrease();
        functionsPage.clickIncrease();
        functionsPage.clickIncrease();
        functionsPage.sendKeysColor();
        functionsPage.clickColor();

    }

    @After
    public void tearDown() throws Exception {
       driver.close();


    }







}
