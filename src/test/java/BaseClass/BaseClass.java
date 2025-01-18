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

        if (System.getProperty("Url") != null)
            Url = System.getProperty("Url");

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--window-size=1280,720");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--ignore-ssl-errors");
        driver.set(new ChromeDriver(options));
        getDriver().manage().window().maximize();
        getDriver().get(Url);
    }

}
