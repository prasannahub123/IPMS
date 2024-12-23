package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeadPage {
    WebDriver driver;
    WebDriverWait wait;

    public LeadPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    final  By Lead  = By.xpath("//li[contains(@class,'flex justify-between rounded')]/descendant::span[text()='Lead']");
    final  By LeadList  = By.xpath("//li[contains(@class,'flex items-center text-white') and contains(text(),'Lead List')]");
    final  By AddLeadButton = By.xpath("//div[contains(@class,'flex justify-end')]/button");
    final  By LeadNameField = By.xpath("(//div[contains(@class,'flex gap-2 my-2')]/descendant::input)[1]");

    @Step("Clicking on the Lead menu")
    public void ClickOnLead() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Lead));
        driver.findElement(Lead).click();
    }
    @Step("Clicking on the Lead List")
    public void ClickOnLeadList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadList));
        driver.findElement(LeadList).click();
    }
    @Step("Clicking on the add new Lead Button")
    public void ClickOnAddLeadButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddLeadButton));
        driver.findElement(AddLeadButton).click();
    }
    @Step("Enter lead Name")
    public void EnterLeadName(String leadname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadNameField));
        driver.findElement(LeadNameField).click();
        driver.findElement(LeadNameField).sendKeys(leadname);
    }






}
