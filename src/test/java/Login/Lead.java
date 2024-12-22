package Login;

import BaseClass.BaseClass;
import PageClass.LogInPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lead extends BaseClass {

    private LogInPage logInPage;

    @BeforeClass
    public void SetUpTests() {
        super.Setup();
        logInPage = new LogInPage(driver);
    }
    @AfterClass
    public void Closer() {
        driver.quit();
    }
    @Test
    public void LeadGeneration() {
        logInPage.EnterUserName("snackcoder@gmail.com");
        logInPage.EnterPassword("SuperAdmin");
        logInPage.ClickContinueButton();
//        Write your code here about lead



    }
}
