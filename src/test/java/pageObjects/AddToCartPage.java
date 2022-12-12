package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
    WebDriver ldriver2;
    public AddToCartPage(WebDriver rdriver2)
    {
        ldriver2 = rdriver2;
        PageFactory.initElements(rdriver2, this);
    }

    @FindBy(xpath = "//input[@id='small-searchterms']") WebElement txtSearchBox;
    @FindBy(xpath = "//button[@type='submit']") WebElement btnSearch;
    @FindBy(linkText = "HTC One Mini Blue") WebElement linkProduct;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']") WebElement btnAddToCart;
    @FindBy(xpath = "//div[@class='bar-notification success']") WebElement msgSuccess;
    @FindBy(linkText = "shopping cart") WebElement linkShoppingCart;
    @FindBy(xpath = "//a[@class='product-name']") WebElement productName;

    public void setTxtSearchBox(String productname) { txtSearchBox.sendKeys(productname);}
    public void clickSearchBtn() { btnSearch.click();}
    public void clickProductLink(){ linkProduct.click();}
    public void clickAddToCartBtn() {btnAddToCart.click();}
    public String getSuccessMsg(){return msgSuccess.getText();}
    public void clickShoppingcartLink() { linkShoppingCart.click();}
    public String getProductName() {return productName.getText();}

 }
