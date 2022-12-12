package testCases;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import utilities.ReadConfig;

public class LoginTest extends BaseClass{

    @Test(priority = 2)
    public void TC_LoginTest_001() throws InterruptedException {
        RegisterTest registerTest = new RegisterTest();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginLink();

        loginPage.clickLoginBtn();

    }
}
