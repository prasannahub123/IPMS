package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    final By Lead = By.xpath("//li[contains(@class,'flex justify-between rounded')]/descendant::span[text()='Lead']");
    final By LeadList = By.xpath("//li[contains(@class,'flex items-center text-white') and contains(text(),'Lead List')]");
    final By AddLeadButton = By.xpath("//div[contains(@class,'flex justify-end')]/button");
    final By LeadNameField = By.xpath("(//div[contains(@class,'flex gap-2 my-2')]/descendant::input)[1]");
    final By LeadSizeDropDownButton = By.xpath("//div[@class=' css-13cymwt-control'][1]");
    final By LeadTypeDropDownButton = By.xpath("//select[@class=' py-2 px-1 rounded-md border-2'][1]");
    final By FlagDropDownButton = By.xpath("//select[@name='flag']");
    final String LeadSizeOptions = ("(//div[contains(@class,'menu')]/descendant::div[contains(@class,'option')])[%d]");
    final By LeadDescriptionField = By.xpath("//div[contains(@class,'relative')]/textarea");
    final String LeadTypeOptions = ("//select[@name='lead_type']/option[%d]");
    final String FlagOptions = ("(//select[@name='flag']/option)[%d]");
    final By LeadValueField = By.xpath("//input[@type='number'][1]");







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
    public void EnterLeadName(String LeadName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadNameField));
        driver.findElement(LeadNameField).click();
        driver.findElement(LeadNameField).sendKeys(LeadName);
    }

    @Step("Clicking on Lead Size Button")
    public void ClickOnLeadSizeDropdown() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadSizeDropDownButton));
        driver.findElement(LeadSizeDropDownButton).click();
    }

    @Step("Clicking on Lead Size Drop Down Button")
    public void ClickOnLeadTypeDropdown() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadTypeDropDownButton));
        driver.findElement(LeadTypeDropDownButton).click();
    }

    @Step("Clicking on Flag dropdown Button")
    public void ClickOnFlagDropDown() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FlagDropDownButton));
        driver.findElement(FlagDropDownButton).click();
    }
    @Step("Selecting desired Lead Size")
    public void SelectingLeadSize(int OptionNo) {
        String formattedXPath = String.format(LeadSizeOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
    }
    @Step("Entering desired text in lead description field")
    public void EnterLeadDescription() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadDescriptionField));
        driver.findElement(LeadDescriptionField).sendKeys("Test message");

    }
    @Step("Selecting desired Lead Type")
    public void SelectingLeadType(int OptionNo) {
        String formattedXPath = String.format(LeadTypeOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
    }
    @Step("Selecting desired Flag")
    public void SelectingFlagOption(int OptionNo) {
        String formattedXPath = String.format(FlagOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
    }
    @Step("Enter Lead Value")
    public void EnteringLeadValue(String LeadName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadValueField));
        driver.findElement(LeadValueField).click();
        driver.findElement(LeadValueField).sendKeys(LeadName);
    }
}








