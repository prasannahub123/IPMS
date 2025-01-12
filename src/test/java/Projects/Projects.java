package Projects;

import BaseClass.BaseClass;
import PageClass.LeadPage;
import PageClass.LogInPage;
import PageClass.ProjectsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Projects extends BaseClass {
    private LogInPage logInPage;
    private ProjectsPage project ;

    @BeforeClass
    public void SetUpTests() {
        super.Setup();
        logInPage = new LogInPage(driver);
        project = new ProjectsPage(driver);
    }
    //    @AfterClass
    public void Closer() {
        driver.quit();
    }
    @Test
    public void ProjectCreation() {





    }



}
