package PageClass;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v129.fedcm.model.Account;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

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
    final By AccountNameOption = By.xpath("//select[@name='account_name']//option[contains(text(),'Prasanna')]");
    final By Contact = By.xpath("//select[@id='contact_agent']");
    final String ContactOptions = ("(//select[@id='contact_agent']//option)[%d]");
    final By StageFor = By.xpath("//select[@id='stage_for']");
    final String StageForOptions = ("(//select[@id='stage_for']//option)[%d]");
    final By LeadStage = By.xpath("//select[@id='lead_stage_id']");
    final String LeadStageOptions = ("(//select[@id='lead_stage_id']//option)[%d]");
    final By AddLeadOwner = By.xpath("//*[name()='svg' and contains(@class, 'lucide-circle-plus')]");
    final By LoginCodeField = By.xpath("//input[@type='text' and @name='user_code']");
    final By DepartmentDropdown = By.xpath("//label[contains(text(),'Department')]/following-sibling::div/div");
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
    final By UserRoleDropDown = By.xpath("//label[contains(text(),'User Role')]/following-sibling::select");
    final String UserRoleDropDownOption = ("(//label[contains(text(),'User Role')]/following-sibling::select/descendant::option)[%d]");
    final By SubmitButtonCreateUser = By.xpath("(//button[contains(@class, 'bg-primary') and text()='Submit'])[5]");
    final By SubmitButtonLeadSource = By.xpath("(//button[contains(@class, 'bg-primary') and text()='Submit'])[3]");
    final By SubmitButtonCreateCustomer = By.xpath("(//button[contains(@class, 'bg-primary') and text()='Submit'])[2]");
    final By AddLeadSource = By.xpath("(//*[name()='svg' and contains(@class, 'lucide-circle-plus')])[2]");
    final By LeadSourceNameField = By.xpath("//input[@type='text' and @name='lead_source_name' and contains(@class,'rounded-md')]");
    final By CreateLeadSourceDescriptionField = By.xpath("//textarea[@name='description' and contains(@class,'rounded-md')]");
    final By CreateLeadSourceSubmitButton = By.xpath("//button[@fdprocessedid='iplzes' and text()='Submit']");
    final By AddAccountName = By.xpath("(//*[name()='svg' and contains(@class, 'lucide-circle-plus')])[3]");
    final By CustomerNameField = By.xpath("(//input[@name='name' and @type='text'])[2]");
    final By CreateCustomerEmailField = By.xpath("(//input[@name='email' and @type='email'])[2]");
    final By CreateCustomerPhoneField = By.xpath("(//input[@name='phone' and @type='number'])[2]");
    final By AddressField = By.xpath("(//textarea[@name='address'])[2]");
    final By ParentUser = By.xpath("//label[contains(text(),'Parent User ')]/following-sibling::div");
    final String ParentUserOptions = ("(//label[contains(text(),'Parent User')]/following-sibling::div/descendant::div[contains(@class,'option')])[%d]");
    final By ContactAddButton = By.xpath("(//*[name()='svg' and contains(@class,'lucide-circle-plus')])[4]");
    final By CustomerNameInCreateContact = By.xpath("//div[contains(text(),'Search customers')]/parent::div");
    final String CustomerNameOptions = ("(//div[contains(@id,'listbox')]/div)[%d]");
    final By AccountNameField = By.xpath("(//input[@type='text' and @name='name' and contains(@class,'flex h-10 w-full rounded-md border border-input')])[1]");
    final By PhoneInCreateAccount = By.xpath("(//input[@type='number' and @name='phone' and contains(@class,'flex h-10 w-full rounded-md border border-input')])[1]");
    final By EmailInCreateAccount = By.xpath("(//input[@type='email' and @name='email' and contains(@class,'flex h-10 w-full rounded-md border border-input')])[1]");
    final By AddressInCreateAccount = By.xpath("(//textarea[@name='address' and contains(@class, 'flex min-h-[80px] w-full rounded-md')])[1]");
    final By SubmitButtonInCreateAccount = By.xpath("(//button[contains(@class, 'inline-flex items-center justify-center') and text()='Submit'])[1]");








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
    public void SelectingAccountName(String DesiredAccount) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountName));
        driver.findElement(AccountName).click();
        Thread.sleep(500);
        driver.findElement(AccountNameOption).click();
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
    public void EnteringLoginCode(int count) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginCodeField));
        driver.findElement(LoginCodeField).click();
        String RandomLoginCode = String.valueOf(RandomString(count));
        System.out.println(RandomLoginCode);
        driver.findElement(LoginCodeField).sendKeys(RandomLoginCode);
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
    public void EnterEmail(String mail,int count) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailIdField));
        driver.findElement(EmailIdField).click();
        String RandomEmail = String.valueOf(generateRandomData(mail,count));
        driver.findElement(EmailIdField).sendKeys(RandomEmail);
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
    public void EnteringPassword(String Password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).click();
        driver.findElement(PasswordField).sendKeys(Password);
    }

    @Step("Enter Phone Number")
    public void EnteringPhoneNumber(String Number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PhoneNumberField));
        driver.findElement(PhoneNumberField).click();
        driver.findElement(PhoneNumberField).sendKeys(Number);
    }

    @Step("Clicking on the User Role Dropdown Button")
    public void ClickOnUserRole(int OptionNo) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserRoleDropDown));
        driver.findElement(UserRoleDropDown).click();
        String formattedXPath = String.format(UserRoleDropDownOption, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
    }
    @Step("Select desired parent user")
    public void SelectDesiredParentUser(int OptionNo) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ParentUser));
        driver.findElement(ParentUser).click();
        String formattedXPath = String.format(ParentUserOptions, OptionNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
    }

    @Step("Clicking on Submit Button in Create user module")
    public void ClickOnSubmitButtonCreateUser() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButtonCreateUser));
        driver.findElement(SubmitButtonCreateUser).click();
    }
    @Step("Clicking on Submit Button in Lead Source")
    public void ClickOnSubmitButtonLeadSource() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButtonLeadSource));
        driver.findElement(SubmitButtonLeadSource).click();
    }
    @Step("Clicking on Submit Button in Create customer")
    public void ClickOnSubmitButtonCreateCustomer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButtonCreateCustomer));
        driver.findElement(SubmitButtonCreateCustomer).click();
    }
    final By CloseIcon = By.xpath("(//div[@class='p-3']/descendant::*[contains(@class,'lucide lucide-circle-x cursor-pointer')])[2]");
    @Step("Clicking on page close icon")
    public void TempCloseButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CloseIcon));
        driver.findElement(CloseIcon).click();
    }

    @Step("Clicking on the add Lead Source Button")
    public void ClickOnAddLeadSourceButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddLeadSource));
        driver.findElement(AddLeadSource).click();
    }

    @Step("Enter desired Lead Source Name")
    public void EnteringLeadSourceName(String usecase,int count) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeadSourceNameField));
        driver.findElement(LeadSourceNameField).click();
        String RandomLeadSourceName= String.valueOf(generateRandomData(usecase,count));
        driver.findElement(LeadSourceNameField).sendKeys(RandomLeadSourceName);
    }

    @Step("Enter desired Description")
    public void EnteringDescription() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateLeadSourceDescriptionField));
        driver.findElement(CreateLeadSourceDescriptionField).click();
        String randomDescription= RandomDescriptionGenerator.generateRandomDescription(2);
        driver.findElement(CreateLeadSourceDescriptionField).sendKeys(randomDescription);
    }

    @Step("Clicking on Create Lead Source Submit Button")
    public void ClickOnCreateLeadSourceSubmitButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateLeadSourceSubmitButton));
        driver.findElement(CreateLeadSourceSubmitButton).click();
    }

    @Step("Clicking on the add Account Name Button")
    public void ClickOnAddAccountNameButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddAccountName));
        driver.findElement(AddAccountName).click();
    }

    @Step("Enter Customer Name")
    public void EnteringCustomerName(String usecase,int count) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerNameField));
        driver.findElement(CustomerNameField).click();
        String RandomCustomerName= String.valueOf(generateRandomData(usecase,count));
        driver.findElement(CustomerNameField).sendKeys(RandomCustomerName);
    }

    @Step("Enter Customer Email")
    public void EnteringCustomerEmail(String usecase,int count) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateCustomerEmailField));
        driver.findElement(CreateCustomerEmailField).click();
        String RandomCustomerEmail= String.valueOf(generateRandomData(usecase,count));
        driver.findElement(CreateCustomerEmailField).sendKeys(RandomCustomerEmail);
    }

    @Step("Enter Customer PhoneNo")
    public void EnteringCustomerPhoneNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateCustomerPhoneField));
        driver.findElement(CreateCustomerPhoneField).click();
        String RandomPhoneNumber =generatePhoneNumber();
        driver.findElement(CreateCustomerPhoneField).sendKeys(RandomPhoneNumber);
    }

    @Step("Enter Customer Address")
    public void EnteringCustomerAddress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddressField));
        driver.findElement(AddressField).click();
        String RandomAddress = RandomAddressGenerator.generateRandomAddress();
        driver.findElement(AddressField).sendKeys(RandomAddress);
    }
    @Step("Clicking on the add Contact Button")
    public void ClickOnAddContactButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContactAddButton));
        driver.findElement(ContactAddButton).click();
    }
    @Step("Clicking on the Customer Name dropdown In Create Account Menu")
    public void ClickOnCustomerNameDropDown() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerNameInCreateContact));
        driver.findElement(CustomerNameInCreateContact).click();
    }
    @Step("Selecting desired Customer Name Create Contact ")
    public void SelectingDesiredCustomerName(int CustNo) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerNameInCreateContact));
        driver.findElement(CustomerNameInCreateContact).click();
        Thread.sleep(500);
        String formattedXPath = String.format(CustomerNameOptions, CustNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
//        driver.findElement(CustomerNameInCreateContact).click();
    }

    @Step("Enter Account Name ")
    public void EnterAccountNameInCreateAccount(String usecase,int count) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountNameField));
        driver.findElement(AccountNameField).click();
        String RandomAccountName= String.valueOf(generateRandomData(usecase,count));
        driver.findElement(AccountNameField).sendKeys(RandomAccountName);

    }
    @Step("Enter Desired Phone")
    public void EnteringPhone() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PhoneInCreateAccount));
        driver.findElement(PhoneInCreateAccount).click();
        String RandomPhoneNumber =generatePhoneNumber();
        driver.findElement(PhoneInCreateAccount).sendKeys(RandomPhoneNumber);

    }
    @Step("Enter Desired Email")
    public void EnteringEmail(String usecase,int count) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailInCreateAccount));
        driver.findElement(EmailInCreateAccount).click();
        String RandomEmail = String.valueOf(generateRandomData(usecase,count));
        driver.findElement(EmailInCreateAccount).sendKeys(RandomEmail);
    }
    @Step("Enter Address in Create Account")
    public void EnteringAddress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddressInCreateAccount));
        driver.findElement(AddressInCreateAccount).click();
        String RandomAddress = RandomAddressGenerator.generateRandomAddress();
        driver.findElement(AddressInCreateAccount).sendKeys(RandomAddress);
    }
    @Step("Clicking on the Submit Button In Create Account")
    public void ClickOnSubmitButtonInCreateAccount() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButtonInCreateAccount));
        driver.findElement(SubmitButtonInCreateAccount).click();
    }
    public StringBuilder RandomString(int count) {
        String ALPHANUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmn_0123456789";
        StringBuilder randomString = new StringBuilder();
        String fixedPart = "QATester";
        SecureRandom rand = new SecureRandom();

        randomString.append(fixedPart);

        for (int i = 0; i < count; i++) {
            int randomIndex = rand.nextInt(ALPHANUMERIC_STRING.length());
            char randomChar = ALPHANUMERIC_STRING.charAt(randomIndex);
            randomString.append(randomChar);
        }
        return randomString;
    }
    public StringBuilder generateRandomData(String useCase, int count) {
        String ALPHANUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk0123456789";
        StringBuilder result = new StringBuilder();
        String fixedPart = "QATesting";
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < count; i++) {
            int randomIndex = rand.nextInt(ALPHANUMERIC_STRING.length());
            char randomChar = ALPHANUMERIC_STRING.charAt(randomIndex);
            result.append(randomChar);
        }
        if (useCase.equalsIgnoreCase("mail")) {
            return result.append("@gmail.com");
        } else if (useCase.equalsIgnoreCase("randomdata")) {

            return new StringBuilder(fixedPart).append(result);
        }
        return result;
    }



        public String generatePhoneNumber() {
            Random rand = new Random();
            // Generate a random 10-digit number
            long phoneNumber = Math.abs(rand.nextLong() % 1_000_000_0000L);

            // Return the phone number as a string with leading zeros if necessary
            return String.format("%010d", phoneNumber);
        }


    public static class RandomAddressGenerator {
        private static final String[] STREET_NAMES = {
                "Maple", "Oak", "Pine", "Elm", "Cedar", "Birch", "Willow", "Main", "High", "Park"
        };
        private static final String[] CITY_NAMES = {
                "Springfield", "Rivertown", "Greenville", "Fairview", "Madison", "Clifton", "Centerville"
        };
        private static final String[] STATE_CODES = {
                "CA", "NY", "TX", "FL", "IL", "PA", "OH", "MI", "GA", "NC"
        };
        private static final SecureRandom RAND = new SecureRandom();

        public static String generateRandomAddress() {
            // Generate street number (1-9999)
            int streetNumber = RAND.nextInt(9999) + 1;

            // Select a random street name
            String streetName = STREET_NAMES[RAND.nextInt(STREET_NAMES.length)];
            String streetSuffix = getRandomStreetSuffix();

            // Select a random city
            String city = CITY_NAMES[RAND.nextInt(CITY_NAMES.length)];

            // Select a random state
            String state = STATE_CODES[RAND.nextInt(STATE_CODES.length)];

            // Generate a random ZIP code (10000-99999)
            int zipCode = RAND.nextInt(90000) + 10000;

            // Combine all components into an address
            return streetNumber + " " + streetName + " " + streetSuffix + ", " + city + ", " + state + " " + zipCode;
        }

        private static String getRandomStreetSuffix() {
            String[] suffixes = {"St", "Ave", "Blvd", "Ln", "Dr", "Ct", "Rd", "Way", "Pl"};
            return suffixes[RAND.nextInt(suffixes.length)];
        }

        public static void main(String[] args) {
            // Generate and print 5 random addresses
            for (int i = 0; i < 5; i++) {
                System.out.println(generateRandomAddress());
            }
        }
    }

    public static class RandomDescriptionGenerator {
        private static final String[] SUBJECTS = {
                "This product", "The software", "The tool", "Our team", "The feature", "The system"
        };
        private static final String[] VERBS = {
                "provides", "delivers", "ensures", "offers", "supports", "facilitates"
        };
        private static final String[] OBJECTS = {
                "high performance", "reliable functionality", "seamless integration", "ease of use",
                "cost efficiency", "enhanced security"
        };
        private static final String[] ENDINGS = {
                "to meet your needs.", "for optimal results.", "with minimal effort.",
                "for better outcomes.", "with top-notch quality.", "to ensure satisfaction."
        };

        private static final SecureRandom RAND = new SecureRandom();

        public static String generateRandomDescription(int sentenceCount) {
            StringBuilder description = new StringBuilder();

            for (int i = 0; i < sentenceCount; i++) {
                String subject = SUBJECTS[RAND.nextInt(SUBJECTS.length)];
                String verb = VERBS[RAND.nextInt(VERBS.length)];
                String object = OBJECTS[RAND.nextInt(OBJECTS.length)];
                String ending = ENDINGS[RAND.nextInt(ENDINGS.length)];

                // Construct a sentence
                String sentence = subject + " " + verb + " " + object + " " + ending;
                description.append(sentence).append(" ");
            }

            return description.toString().trim();
        }

        public static void main(String[] args) {
            // Generate and print random descriptions
            System.out.println(generateRandomDescription(2));

        }
    }

    final By SuccessMessage = By.xpath("//div[contains(@role,'status') and contains(text(),'Successfully!')]");

    @Step("Verify  Success Message")
    public boolean VerifySuccessMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage));
            return driver.findElement(SuccessMessage).isDisplayed();
        }
        catch (Exception e) {
            return false;
        }
    }



}











