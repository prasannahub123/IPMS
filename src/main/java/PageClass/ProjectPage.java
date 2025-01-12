package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectPage {
    WebDriver driver;
    WebDriverWait wait;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }
}
