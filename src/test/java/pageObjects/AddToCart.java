package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    WebDriver ldriver;
    public AddToCart(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "small-searchterms") WebElement txtSearchBox;
    @FindBy(xpath = "//button[(@class=\"button-1 search-box-button\")]") WebElement btnSearch;




 }
