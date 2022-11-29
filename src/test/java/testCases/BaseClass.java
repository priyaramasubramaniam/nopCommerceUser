package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import utilities.ReadConfig;
import org.apache.log4j.Logger;


public class BaseClass {
    ReadConfig readConfig = new ReadConfig();
    String URL = readConfig.setUrl();
    String firstName = readConfig.setfirstName();
    String lastName = readConfig.setlastName();
    String Day = readConfig.setDay();
    String Month = readConfig.setMonth();
    String Year = readConfig.setYear();
    String CompanyName = readConfig.setCompanyName();
    String Password = readConfig.setPassword();
    String ConfirmPassword = readConfig.setConfirmPassword();
    public WebDriver driver;
    Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br) {
        logger = Logger.getLogger("nopCommerce");
        PropertyConfigurator.configure("Log4j.properties");

        if(br.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (br.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (br.equals("iedriver"))
        {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        else if (br.equals("edgedriver"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    public String randomestring() {
        return (RandomStringUtils.randomAlphabetic(8));
    }

    public static String randomeNum() {
        return (RandomStringUtils.randomNumeric(4));
    }
}