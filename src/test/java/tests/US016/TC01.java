package tests.US016;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01 {
    @Test
    public void test01() {
        //Go to websıte
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        Page page = new Page();
        //Clıck the SıgnIn
        page.signIn.click();
        ReusableMethods.bekle(2);

        page.signInUserNameOrEmaill.sendKeys(ConfigReader.getProperty("emailAddress"));
        page.signinPassword.sendKeys(ConfigReader.getProperty("gecerliPassword"));
        page.signInButton.click();
        ReusableMethods.bekle(2);

        //Click the My Account field at the bottom of the page
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.click(page.myAccount);
        ReusableMethods.bekle(2);

        //Click the Store Manager
        ReusableMethods.click(page.storeManager1);
        ReusableMethods.bekle(2);

        //Click the Products-Add New button
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(page.products).perform();
        ReusableMethods.click(page.productsAddNew);
        ReusableMethods.bekle(3);

        //Verify that Simple Product comes by default
        Assert.assertTrue(page.simpleProductBox.isDisplayed());

        //Check the virtual box
        ReusableMethods.click(page.virtualBox);

        //Check the downloadable box
        page.downloadableBox.click();

        //Enter a title in the Product Title field
        //Write Price and Sale Price
        page.productTitle.sendKeys("phone",Keys.TAB,"10",Keys.TAB,"30");

        //Select Categories
        ReusableMethods.scroll(page.categoriesBox);
        ReusableMethods.click(page.categoriesFirstBox);

        //Click the Draft button
        ReusableMethods.click(page.draftButton);
        ReusableMethods.bekle(3);

        //Click the Products button
        ReusableMethods.click(page.products1);
        ReusableMethods.bekle(3);

        //Verify product visibility in Products
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi("name");
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.productDetails1.isDisplayed());


    }

}
