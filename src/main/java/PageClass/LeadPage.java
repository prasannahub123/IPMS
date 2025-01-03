package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

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
    final By LeadSource = By.xpath("//select[contains(@name,'lead_source_id')]");
    final String LeadSourceOptions = ("(//select[contains(@name,'lead_source_id')]/option)[%d]");
    final String LeadOwnerOptions = ("(//div[contains(@class,'menu')]/descendant::div[contains(@class,'option')])[%d]");
    final By LeadOwnerDropdown = By.xpath("//label[contains(text(),'Lead Owner')]/parent::div/following-sibling::div");
    final By AccountName = By.xpath("//select[@name='account_name']");
    final String AccountNameOptions = ("(//select[@name='account_name']//option)[%d]");
    final By Contact = By.xpath("//select[@id='contact_agent']");
    final String ContactOptions = ("(//select[@id='contact_agent']//option)[%d]");
    final By StageFor = By.xpath("//select[@id='stage_for']");
    final String StageForOptions = ("(//select[@id='stage_for']//option)[%d]");
    final By LeadStage = By.xpath("//select[@id='lead_stage_id']");
    final String LeadStageOptions = ("(//select[@id='lead_stage_id']//option)[%d]");
    final By AddLeadOwner = By.xpath("//*[name()='svg' and contains(@class, 'lucide-circle-plus')]");
    final By LoginCodeField = By.xpath("//input[@type='text' and @name='user_code']");
     final By DepartmentDropdown = By.xpath ("//label[contains(text(),'Department')]/following-sibling::div/div");
    final By UserNameField = By.xpath("//input[@name='user_name']");
    final By EmailIdField = By.xpath("(//label[contains(text(),'Email')]/following-sibling::input)[3]");
    final By CloseButton = By.xpath("//*[name()='svg' and contains(@class,'lucide lucide-circle-x cursor-pointer)]");
    final By DateField = By.xpath("//label[contains(text(),'Proposed Date')]/following-sibling::input");
    final By DateFieldCal = By.xpath("//label[contains(text(),'Proposed Date')]/following-sibling::input[contains(@name,'conv_by_date')]");
    final By SubmitButton = By.xpath("(//div[contains(@class,'justify-center')]/button[contains(text(),'Submit')])[1]");
    final By SearchField = By.xpath("//div[contains(@class,'relative w')]/input");
    final String DepartmentOptions = ("(//div[contains(@class,'menu')]/descendant::div[contains(@class,'option')])[%d]");
    final By PasswordField = By.xpath("//input[@name='password']");
    final By PhoneNumberField = By.xpath("//input[@name='phone_number']");
    final By UserRoleDropDown =  By.xpath("//select[@class='py-2 px-1 rounded-md border-2']");


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

    @Step("Selecting desired Lead Source")
    public void SelectingLeadSource(int OptionNo) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadSource));
        driver.findElement(LeadSource).click();
        Thread.sleep(500);
        String formattedXPath = String.format(LeadSourceOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
        driver.findElement(LeadSource).click();
    }

    @Step("Selecting desired Lead owner")
    public void SelectingLeadOwner(int OptionNo) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadOwnerDropdown));
        driver.findElement(LeadOwnerDropdown).click();
        Thread.sleep(500);
        String formattedXPath = String.format(LeadOwnerOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
    }

    @Step("Selecting desired Account Name")
    public void SelectingAccountName(int OptionNo) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountName));
        driver.findElement(AccountName).click();
        Thread.sleep(500);
        String formattedXPath = String.format(AccountNameOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
        driver.findElement(AccountName).click();
    }

    @Step("Selecting desired Contact")
    public void SelectingContact(int OptionNo) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Contact));
        driver.findElement(Contact).click();
        Thread.sleep(500);
        String formattedXPath = String.format(ContactOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
        driver.findElement(Contact).click();

    }

    @Step("Selecting desired Stage For")
    public void SelectingStageFor(int OptionNo) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(StageFor));
        driver.findElement(StageFor).click();
        Thread.sleep(500);
        String formattedXPath = String.format(StageForOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
        driver.findElement(StageFor).click();


    }

    @Step("Selecting desired Lead Stage")
    public void SelectingLeadStage(int OptionNo) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadStage));
        driver.findElement(LeadStage).click();
        Thread.sleep(500);
        String formattedXPath = String.format(LeadStageOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
        driver.findElement(LeadStage).click();
    }

    @Step("Clicking on the Close Button")
    public void ClickOnCloseButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CloseButton));
        driver.findElement(CloseButton).click();
    }

    @Step("Clicking on the Add Lead Owner Button")
    public void ClickOnAddLeadOwner() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddLeadOwner));
        driver.findElement(AddLeadOwner).click();
    }

    @Step("Enter Login Code")
    public void EnteringLoginCode(String Code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginCodeField));
        driver.findElement(LoginCodeField).click();
        driver.findElement(LoginCodeField).sendKeys(Code);
    }

    @Step("Clicking on the Department Dropdown Button")
    public void ClickOnDepartment(int OptionNo) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DepartmentDropdown));
        driver.findElement(DepartmentDropdown).click();
        String formattedXPath = String.format(DepartmentOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
    }
    @Step("Enter User Name")
    public void EnterUserName(String LeadName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameField));
        driver.findElement(UserNameField).click();
        driver.findElement(UserNameField).sendKeys(LeadName);

    }

    @Step("Enter Email")
    public void EnterEmail(String Email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailIdField));
        driver.findElement(EmailIdField).click();
        driver.findElement(EmailIdField).sendKeys(Email);
    }

    @Step("Adding desired date")
    public void AddDesiredDate(String Date) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DateField));
        driver.findElement(DateField).click();
        driver.switchTo().activeElement().sendKeys(Date);
    }

    @Step("Clicking on the Submit Button")
    public void ClickOnSubmitButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButton));
        driver.findElement(SubmitButton).click();
    }

    @Step("Enter lead Name in search field")
    public void EnterLeadNameInSearchField(String LeadName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchField));
        driver.findElement(SearchField).click();
        driver.findElement(SearchField).sendKeys(LeadName);
    }
    @Step("Enter Password")
    public void EnteringPassword(String Code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).click();
        driver.findElement(PasswordField).sendKeys(Code);
    }
    @Step("Enter Phone Number")
    public void EnteringPhoneNumber(String Code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PhoneNumberField));
        driver.findElement(PhoneNumberField).click();
        driver.findElement(PhoneNumberField).sendKeys(Code);
    }
    @Step("Enter User Role")
    public void EnterUserRole() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserRoleDropDown));
        driver.findElement(UserRoleDropDown).click();
    }

}









