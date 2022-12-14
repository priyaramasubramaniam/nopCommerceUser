package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegisterPage;


public class RegisterTest extends BaseClass{

    @Test
    public void TC_Register_001() throws InterruptedException {
        driver.get(URL);
        logger.info("URL opened");
        RegisterPage rp = new RegisterPage(driver);
        rp.clickRegisterLink();
        logger.info("Registerlink is clicked");
        rp.selectFemaleRadioBtn();
        logger.info("Female Radio button is clicked");
        rp.setTxtFirstname(firstName);
        logger.info("First name is entered");
        rp.setTxtLastname(lastName);
        logger.info("First name is entered");
        rp.selectDay(Day);
        logger.info("Day is Selected");
        rp.selectMonth(Month);
        logger.info("Month is Selected");
        rp.selectYear(Year);
        logger.info("Year is Selected");
        rp.setTxtEmail(randomestring() + "@gmail.com");
        logger.info("Email is entered");
        rp.setTxtCompanyName(CompanyName);
        logger.info("Company name is enterd");
        rp.setTxtPassword(Password);
        logger.info("Password is entered");
        rp.setTxtConfirmPassword(ConfirmPassword);
        logger.info("Confirm password is entered");
        rp.clickSubmitBtn();
        logger.info("Submit button is clicked");
        Thread.sleep(2000);
        if(rp.getSuccessMsg().equals("Your registration completed"))
        {
            Assert.assertTrue(true);
            logger.info("Test Case is Passed");
        }
        else {
            Assert.assertTrue(false);
            logger.warn("TestCase is Failed");
        }
    }

}