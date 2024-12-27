package Login;

import BaseClass.BaseClass;
import PageClass.LeadPage;
import PageClass.LogInPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends BaseClass {
    private LogInPage logInPage;

    @BeforeClass  //browser invocation
    public void SetUpTests() {
        super.Setup();
        logInPage = new LogInPage(driver);
    }


    @AfterClass
    public void Closer() {
        driver.quit();
    }

    @Test
    public void LogIn() {
        logInPage.EnterUserName("snackcoder@gmail.com");
        logInPage.EnterPassword("SuperAdmin");
        logInPage.ClickContinueButton();
    }


}
