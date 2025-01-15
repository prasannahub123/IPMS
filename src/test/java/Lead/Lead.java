package Lead;

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
        logInPage = new LogInPage(getDriver());
        lead = new LeadPage(getDriver());

    }

        @AfterClass
    public void Closer() {
        getDriver().quit();
    }

    @Test
    public void LeadGeneration() throws InterruptedException {
        //Browser Open & Login
        logInPage.EnterUserName("snackcoder@gmail.com");
        logInPage.EnterPassword("SuperAdmin");
        logInPage.ClickContinueButton();
        //Then Lead Operation starts with Clicking on Lead
        lead.ClickOnLead();
        Thread.sleep(1000);
        lead.ClickOnLeadList();
        lead.ClickOnAddLeadButton();
        Thread.sleep(1000);
        //Then Creating Lead Starts in Create Lead Window
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
        //Clicking on Plus Icon For Adding Lead Owner
        lead.ClickOnAddLeadOwner();
        lead.EnteringLoginCode(4);
        lead.ClickOnDepartment(4);
        lead.EnterUserName("TestR");
        lead.EnterEmail("mail",5);
        lead.EnteringPassword("Password@123");
        lead.EnteringPhoneNumber("9348544778");
        lead.ClickOnUserRole(7);
        lead.SelectDesiredParentUser(7);
//        lead.ClickOnSubmitButtonCreateUser();
        lead.TempCloseButton();
        //Clicking on Plus Icon For Adding Lead Source
        lead.ClickOnAddLeadSourceButton();
        lead.EnteringLeadSourceName("randomdata",5);
        lead.EnteringDescription();
        lead.ClickOnSubmitButtonLeadSource();
        //Clicking on Plus Icon For Adding Account Name(Creating Customer)
        lead.ClickOnAddAccountNameButton();
        lead.EnteringCustomerName("randomdata",6);
        lead.EnteringCustomerEmail("mail",6);
        lead.EnteringCustomerPhoneNumber();
        lead.EnteringCustomerAddress();
        lead.ClickOnSubmitButtonCreateCustomer();
        //Clicking on Plus Icon For Adding Contact Details(Create Account)
        lead.ClickOnAddContactButton();
        lead.SelectingDesiredCustomerName(4);
        lead.EnterAccountNameInCreateAccount("randomdata",6);
        lead.EnteringPhone();
        lead.EnteringEmail("mail",6);
        lead.EnteringAddress();
        lead.ClickOnSubmitButtonInCreateAccount();
    }
}
