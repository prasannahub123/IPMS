package Login;

import BaseClass.BaseClass;
import PageClass.LeadPage;
import PageClass.LogInPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lead extends BaseClass {

    private LogInPage logInPage;
    private LeadPage lead;


    @BeforeClass
    public void SetUpTests() {
        super.Setup();
        logInPage = new LogInPage(driver);
        lead = new LeadPage(driver);

    }

    //    @AfterClass
    public void Closer() {
        driver.quit();
    }

    @Test
    public void LeadGeneration() throws InterruptedException {
        logInPage.EnterUserName("snackcoder@gmail.com");
        logInPage.EnterPassword("SuperAdmin");
        logInPage.ClickContinueButton();
        lead.ClickOnLead();
        Thread.sleep(1000);
        lead.ClickOnLeadList();
        lead.ClickOnAddLeadButton();
        Thread.sleep(1000);
        lead.EnterLeadName("TestLead001");
        lead.ClickOnLeadSizeDropdown();
        lead.SelectingLeadSize(2);
        lead.EnterLeadDescription();
        lead.ClickOnLeadTypeDropdown();
        lead.ClickOnFlagDropDown();
        lead.SelectingLeadType(1);
        lead.SelectingFlagOption(3);
        lead.EnteringLeadValue("1000000");
        lead.AddDesiredDate("10-01-2025");
        lead.SelectingLeadOwner(1);
        lead.SelectingLeadSource(7);
        Thread.sleep(1000);
        lead.SelectingAccountName(11);
        lead.SelectingContact(2);
        lead.SelectingStageFor(2);
        lead.SelectingLeadStage(2);
//        lead.ClickOnCloseButton();
        lead.ClickOnAddLeadOwner();
        lead.EnteringLoginCode("Rajesh_156");
        lead.ClickOnDepartment(4);
        lead.EnterUserName("TestR");
        lead.EnterEmail("testR@gmail.com");
        lead.EnteringPassword("Password@123");
        lead.EnteringPhoneNumber("9348544778");
        lead.ClickOnUserRole(7);
        lead.SelectDesiredParentUser(7);
//        lead.ClickOnSubmitButtonCreateUser();
        lead.TempCloseButton();
        lead.ClickOnAddLeadSourceButton();
        lead.EnteringLeadSourceName("FireSafety-WEB");
        lead.EnteringDescription("Web Design and Development of FireSafety");
        lead.ClickOnSubmitButtonLeadSource();
        lead.ClickOnAddAccountNameButton();
        lead.EnteringCustomerName("TATA Steel");
        lead.EnteringCustomerEmail("prasanna.panda.16@gmail.com");
        lead.EnteringCustomerPhoneNumber("8455089863");
        lead.EnteringCustomerAddress("BBSR");
        lead.ClickOnSubmitButtonCreateCustomer();
        lead.ClickOnAddContactButton();
        lead.SelectingDesiredCustomerName(2);
        lead.EnterAccountNameInCreateAccount("J p Gupta");
    }
}
