package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.Base;

public class FunctionsPage extends Base {

    //Elements

    By buttonDO1 = By.id("do1");
    By buttonDO2 = By.id("do2");
    By buttonIncrease = By.id("btnIncreaseFont");
    By buttonDecrease = By.id("btnDecreaseFont");
    By textBoxColor= By.id("bgColor");
    By buttonColor = By.id("btnSetBgColor");

    public FunctionsPage (WebDriver driver) {
        super(driver);
    }

    public void clickDO1() {

        driver.findElement(buttonDO1).click();
    }

    public void clickDO2() {

        driver.findElement(buttonDO2).click();
    }

    public void clickIncrease() {

        driver.findElement(buttonIncrease).click();
    }

    public void clickDecrease() {

        driver.findElement(buttonDecrease).click();
    }

    public void sendKeysColor() {

        driver.findElement(textBoxColor).sendKeys("Yellow");
    }

    public void clickColor() {

        driver.findElement(buttonColor).click();
    }







}
