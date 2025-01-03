package Login;

import BaseClass.BaseClass;
import PageClass.LeadPage;
import PageClass.LogInPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lead extends BaseClass {

    private LogInPage logInPage;
    private LeadPage lead ;


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
        lead.EnterLeadName("Rajesh");
        lead.ClickOnLeadSizeDropdown();
        lead.SelectingLeadSize(1);
        lead.EnterLeadDescription();
        lead.ClickOnLeadTypeDropdown();
        lead.ClickOnFlagDropDown();
        lead.SelectingLeadType(2);
        lead.SelectingFlagOption(2);
        lead.EnteringLeadValue("5000");
        lead.AddDesiredDate("29-04-2025");
        lead.SelectingLeadOwner(4);
        lead.SelectingLeadSource(3);
        Thread.sleep(1000);
        lead.SelectingAccountName(3);
        lead.SelectingContact(2);
        lead.SelectingStageFor(2);
        lead.SelectingLeadStage(2);
        //lead.ClickOnCloseButton();
        lead.ClickOnAddLeadOwner();
        lead.EnteringLoginCode("Rajesh_2024");
        lead.ClickOnDepartment(2);
        lead.EnterUserName("TESTUSER");
        lead.EnterEmail("prasanna.panda@lipl.in");
        lead.EnteringPassword("Password@123");
        lead.EnteringPhoneNumber("9348544777");
        lead.EnterUserRole();







    }
}
