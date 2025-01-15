package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static String Url = "http://203.193.144.20:8005/";
    public static WebDriver getDriver() {
        return driver.get();
    }

    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        driver.set(new ChromeDriver(options));
        options.addArguments("--headless");

        getDriver().manage().window().maximize();
        getDriver().get(Url);
    }
}
