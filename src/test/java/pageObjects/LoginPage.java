package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in") WebElement linkLogin;
    @FindBy(id = "Email") WebElement txtEmail;
    @FindBy(id = "Password") WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='Log in']") WebElement btnLogin;

    public void clickLoginLink() { linkLogin.click();}
    public String setTxtEmail(String email) { txtEmail.sendKeys(email);
        return email;
    }
    public String setTxtPassword(String pwd) { txtPassword.sendKeys(pwd);
        return pwd;
    }
    public void clickLoginBtn() { btnLogin.click();}

}
