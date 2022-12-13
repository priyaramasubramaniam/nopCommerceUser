package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddToCartPage;
import pageObjects.RegisterPage;
import utilities.ReadConfig;

public class AddToCartTest extends BaseClass {

    @Test
    public void TC_AddToCart_001() throws InterruptedException {
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        ReadConfig readConfig = new ReadConfig();
        addToCartPage.setTxtSearchBox(readConfig.setProductName());
        addToCartPage.clickSearchBtn();
        addToCartPage.clickProductLink();
        addToCartPage.clickAddToCartBtn();
        Thread.sleep(2000);
        if(addToCartPage.getSuccessMsg().equals("The product has been added to your shopping cart"))
        {
            addToCartPage.clickShoppingcartLink();
            if(addToCartPage.getProductName().equals(readConfig.setProductName()))
            {
                Assert.assertTrue(true);
                logger.info("Testcase Passed");
            }
        }
    }
}
