package pageObjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    public LoginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//a[@class='ico-login']") WebElement linkLogin;
    @FindBy(xpath = "//input[@id='Email']") WebElement txtUsername;
    @FindBy(xpath = "//input[@id='Password']") WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='Log in']") WebElement btnLogin;
    @FindBy(xpath = "//a[@class='ico-logout']") WebElement btnLogout;


    public void clickLogin() { linkLogin.click();}
    public void setTxtUsername(String uname) {txtUsername.sendKeys(uname);}
    public void setTxtPassword(String pwd) {txtPassword.sendKeys(pwd);}
    public void clickSubmitBtn() {btnLogin.click();}
    public Boolean checkLogoutBtnPresent() {return btnLogout.isDisplayed();}


}
