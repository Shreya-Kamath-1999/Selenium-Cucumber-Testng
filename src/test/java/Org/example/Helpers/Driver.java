package Org.example.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Driver {
    private static WebDriver driver;
    private static File file;
    public static void setWebDriver()
    {
        file = new File("tools/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();

    }
    public static WebDriver getDriver() {
        return driver;
    }
}
