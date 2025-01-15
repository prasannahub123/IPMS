package Projects;

import BaseClass.BaseClass;
import PageClass.LeadPage;
import PageClass.LogInPage;
import PageClass.ProjectsPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Projects extends BaseClass {
    private LogInPage logInPage;
    private ProjectsPage project ;

    @BeforeClass
    public void SetUpTests() {
        super.Setup();
        logInPage = new LogInPage(getDriver());
        project = new ProjectsPage(getDriver());
    }
        @AfterClass
    public void Closer() {
        getDriver().quit();
    }
    @Test
    public void ProjectCreation() {





    }



}
