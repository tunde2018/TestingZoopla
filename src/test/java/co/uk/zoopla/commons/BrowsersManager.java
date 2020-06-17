package co.uk.zoopla.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BrowsersManager extends DriverManager
{
    private WebDriver initChrome()
    {
        WebDriverManager.chromiumdriver().setup();
        return new ChromeDriver();
    }

    private WebDriver initHeadlessChrome()
    {
        WebDriverManager.chromiumdriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu","headless");
        return new ChromeDriver(options);
    }

    private WebDriver initFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver initHeadlessFireFox()
    {
        WebDriverManager.firefoxdriver().setup();

      FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-gpu","headless");
        return new FirefoxDriver(options);
    }

    public void  launchBrowser(String browser) {
        switch (browser) {
            case "Chrome":
                driver = initChrome();
                break;
            case "HeadlessChrome":
                driver = initHeadlessChrome();
                break;
            case "Firefox":
                driver = initFirefox();
                break;
            case "HeadlessFirefox":
                driver = initHeadlessFireFox();
                break;
            default:
                driver = initHeadlessChrome();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
            public void closeBrowser()
            {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
