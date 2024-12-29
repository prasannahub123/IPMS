package Login;

import BaseClass.BaseClass;
import PageClass.LeadPage;
import PageClass.LogInPage;
import PageClass.ProjectsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Projects extends BaseClass {
    private LogInPage logInPage;
    private ProjectsPage Projects ;

    @BeforeClass
    public void SetUpTests() {
        super.Setup();
        logInPage = new LogInPage(driver);
        Projects = new ProjectsPage(driver);
    }
    //    @AfterClass
    public void Closer() {
        driver.quit();
    }
    @Test
    public void LeadGeneration() throws InterruptedException{





    }



}
