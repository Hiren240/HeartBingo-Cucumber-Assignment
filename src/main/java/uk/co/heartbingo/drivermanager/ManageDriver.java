package uk.co.heartbingo.drivermanager;
/*
 * Created By: Hiren Patel
 * Project Name: HeartBingo-Cucumber-Assignment
 */

import uk.co.heartbingo.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ManageDriver {
    private static final Logger log = LogManager.getLogger(ManageDriver.class.getName());
    public static WebDriver driver;
    public String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");

    public ManageDriver() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/resources/propertiesfile/log4j2.properties");
    }

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();//chromedriver setup
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();//firefox driver setup
            log.info("Launching firefox Browser");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //maximize the window
        driver.manage().window().maximize();
        // Wait For Page To Load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Using get command redirect to url
        driver.get(baseUrl);
    }

    // Shut down the web driver instance (Close all the windows)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}
