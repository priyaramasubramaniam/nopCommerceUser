package testCases;

import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.LoginPage;
import utilities.ReadConfig;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClass{

    @Test
    public void TC_LoginTest_001() throws InterruptedException {
        driver.get(URL);
        LoginPage lp = new LoginPage(driver);
        lp.clickLogin();
        ReadConfig readConfig1 = new ReadConfig();
        lp.setTxtUsername(readConfig1.setUsername());
        lp.setTxtPassword(readConfig1.setPassword());
        lp.clickSubmitBtn();
        Thread.sleep(1000);
        TimeUnit.MINUTES.sleep(30);
        if(lp.checkLogoutBtnPresent() == true)
        {
            Assert.assertTrue(true);
            logger.info("TestCase Passed");
        }
        else
        {
            Assert.assertTrue(false);
            logger.error("Testcase failed");
        }

    }


}
