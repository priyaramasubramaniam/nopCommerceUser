package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver ldriver;
    public RegisterPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//a[@class='ico-register']") WebElement linkRegister;
    @FindBy(id = "gender-female") WebElement radioFemale;
    @FindBy(id = "FirstName") WebElement txtFirstname;
    @FindBy(id = "LastName") WebElement txtLastname;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']") WebElement drpdwnDay;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']") WebElement drpdwnMonth;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']") WebElement drpdwnYear;
    @FindBy(xpath = "//input[@id='Email']") WebElement txtEmail;
    @FindBy(xpath = "//input[@id='Company']") WebElement txtCompanyName;
    @FindBy(xpath = "//input[@id='Newsletter']") WebElement checkboxNewletter;
    @FindBy(xpath = "//input[@id='Password']") WebElement txtPassword;
    @FindBy(xpath = "//input[@id='ConfirmPassword']") WebElement txtConfirmPassword;
    @FindBy(xpath = "//button[@id='register-button']") WebElement btnSubmit;
    @FindBy(xpath = "//div[@class='result']") WebElement messageSuccess;

    public void clickRegisterLink() {linkRegister.click();}
    public void selectFemaleRadioBtn() { radioFemale.click();}
    public void setTxtFirstname(String fname) {txtFirstname.sendKeys(fname);}
    public void setTxtLastname(String lname) {txtLastname.sendKeys(lname);}
    public void selectDay(String day) {
        Select dropdown = new Select(drpdwnDay);
        dropdown.selectByVisibleText(day);
    }
    public void selectMonth(String month) {
        Select dropdown1 = new Select(drpdwnMonth);
        dropdown1.selectByVisibleText(month);

    }
    public void selectYear(String year) {
        Select dropdown1 = new Select(drpdwnYear);
        dropdown1.selectByVisibleText(year);
    }

    public void setTxtEmail(String email) { txtEmail.sendKeys(email);}
    public void setTxtCompanyName(String companyName) { txtCompanyName.sendKeys(companyName);}
    public void checkNewsletterCb() { checkboxNewletter.isEnabled();}
    public void setTxtPassword(String password) { txtPassword.sendKeys(password);}
    public void setTxtConfirmPassword(String confirmPassword) { txtConfirmPassword.sendKeys(confirmPassword);}
    public void clickSubmitBtn() { btnSubmit.click();}
    public String getSuccessMsg() {return messageSuccess.getText();}
}
