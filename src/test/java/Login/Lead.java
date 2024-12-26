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
//        Thread.sleep(1000);
        lead.ClickOnLeadList();
        lead.ClickOnAddLeadButton();
        lead.EnterLeadName("Prasanna");
        lead.ClickOnLeadSizeDropdown();
        lead.SelectingLeadSize(1);
        lead.EnterLeadDescription();
        lead.ClickOnLeadTypeDropdown();
        lead.ClickOnFlagDropDown();
        lead.SelectingLeadType(2);
        lead.SelectingFlagOption(2);
        lead.EnteringLeadValue("100000");
        lead.SelectingLeadSource(2);






    }
}
