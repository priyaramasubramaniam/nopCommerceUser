package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegisterPage;

public class RegisterMandatory extends BaseClass {
    @Test
    public void TC_RegisterMand_002() throws InterruptedException {
        driver.get(URL);
        logger.info("Url opened");
        RegisterPage rp = new RegisterPage(driver);
        rp.clickRegisterLink();
        logger.info("Register link is clicked");
        rp.setTxtFirstname(firstName);
        logger.info("Firstname is entered");
        rp.setTxtLastname(lastName);
        logger.info("Lastname is entered");
        rp.setTxtEmail(randomestring() + "@gmail.com");
        logger.info("Email is entered");
        rp.setTxtPassword(Password);
        logger.info("Password is entered");
        rp.setTxtConfirmPassword(ConfirmPassword);
        logger.info("Confirm password is entered");
        rp.clickSubmitBtn();
        logger.info("Submit button is cliked");
        Thread.sleep(2000);
        if (driver.getPageSource().contains("Your registration completed ")) {
            Assert.assertTrue(true);
            logger.info("Testase passed");
        } else {
            Assert.assertFalse(false);
            logger.error("TestCase Failed");
        }
    }
}
