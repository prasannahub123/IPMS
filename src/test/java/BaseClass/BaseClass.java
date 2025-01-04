package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    public static WebDriver driver ;
    public static String Url = "http://203.193.144.20:8005/";


    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
//        options.addArguments("--headless");
        driver.manage().window().maximize();
        driver.get(Url);
    }
}
