package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver ldriver;
    public SearchPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//input[@id='small-searchterms']") WebElement txtSearchbox;
    @FindBy(xpath = "//button[normalize-space()='Search']") WebElement linkSearch;
    @FindBy(linkText = "HTC One Mini Blue") WebElement linkProduct;

    public void setTxtSearchbox(String product) {
        txtSearchbox.sendKeys(product);
    }
    public void clickSearchLink(){ linkSearch.click();}
    public String getProductName() { return linkProduct.getText();}
}
