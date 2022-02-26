package page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.Base;

public class LoginPage extends Base {

    //Add User

    By textBoxUsarname = By.name("username");
    By textBoxPassword = By.name("password");
    By buttonLogin = By.name("login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendKeysName() {

        driver.findElement(textBoxUsarname).sendKeys("admin");
    }

    public void sendKeysPassword() {

        driver.findElement(textBoxPassword).sendKeys("admin");
    }

    public void clickLogin() {
        driver.findElement(buttonLogin).click();
    }

    public void  assertValidation() {
    String title = driver.getTitle();
    String ExpectedTitle = "Main page example";
    Assert.assertEquals(title, ExpectedTitle);
    System.out.println("test ok");

    }



    }



