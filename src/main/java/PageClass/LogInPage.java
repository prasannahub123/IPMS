package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInPage {

    WebDriver driver;
    WebDriverWait wait;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final By UserNameField = By.xpath("(//div[contains(@class,'space-y')])[1]");
    final By PasswordField = By.xpath("(//div[contains(@class,'space-y')])[2]");
    final By ContinueButton = By.xpath("//button[contains(@type,'submit')]");

    @Step("Entering UserName")
    public  void EnterUserName() {
        wait.until(ExpectedConditions.presenceOfElementLocated(UserNameField));
        driver.findElement(UserNameField).click();
        driver.switchTo().activeElement().sendKeys("snackcoder@gmail.com");
    }

    @Step("Entering Password")
    public void EnterPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).click();
        driver.switchTo().activeElement().sendKeys("SuperAdmin");
    }

    @Step("Clicking Continue Button")
    public void ClickContinueButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));
        driver.findElement(ContinueButton).click();

    }

}
