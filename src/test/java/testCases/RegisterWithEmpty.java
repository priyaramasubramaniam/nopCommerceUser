package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegisterPage;

public class RegisterWithEmpty extends BaseClass{

    @Test
    public void TC_RegisterEmpty_003() throws InterruptedException {
        driver.get(URL);
        RegisterPage rp2 = new RegisterPage(driver);
        rp2.clickRegisterLink();
        Thread.sleep(2000);
        rp2.clickSubmitBtn();
        logger.info("Submit button is clicked");
        if (driver.getPageSource().contains("First name is required.")
                && driver.getPageSource().contains("Last name is required.")
                && driver.getPageSource().contains("Email is required.")
                && driver.getPageSource().contains(" "))
            {
                Assert.assertTrue(true);
                logger.info("TestCase Passed");
            }
        else {
            Assert.assertFalse(false);
            logger.info("TestCase Failed");
        }
    }
}
