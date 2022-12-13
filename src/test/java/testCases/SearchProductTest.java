package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SearchPage;
import utilities.ReadConfig;

public class SearchProductTest extends BaseClass{

    @Test
    public void TC_Search_001(){
        SearchPage sp = new SearchPage(driver);
        ReadConfig readConfig = new ReadConfig();
        sp.setTxtSearchbox(readConfig.setProductName());
        sp.clickSearchLink();
        if(sp.getProductName().equals(readConfig.setProductName()))
        {
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
            System.out.println(sp.getProductName());
        }

    }
    @Test
    public void TC_InvalidSearchPrduct_002()
    {
        SearchPage sp = new SearchPage(driver);
        ReadConfig readConfig = new ReadConfig();
        sp.setTxtSearchbox(readConfig.setInvalidProductName());
        sp.clickSearchLink();
        if(driver.getPageSource().contains("No products were found that matched your criteria."))
            Assert.assertTrue(true);
        else {
            Assert.assertTrue(false);
        }
    }

    @Test
    public void TC_WithoutEnter_003() throws InterruptedException {
        SearchPage sp = new SearchPage(driver);
        ReadConfig readConfig = new ReadConfig();
        sp.setTxtSearchbox("");
        sp.clickSearchLink();
        Thread.sleep(2000);
        if(driver.switchTo().alert().getText().equals("Please enter some search keyword"))
            Assert.assertTrue(true);
        else {
            Assert.assertTrue(false);
        }
    }


}
