package tests.US15;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC02 {
    Faker faker=new Faker();
    @Test
public void test01() {
    //Go to websıte
    Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
    Page page = new Page();
    //Clıck the SıgnIn
    page.signIn.click();
    ReusableMethods.bekle(2);

    page.signInUserNameOrEmaill.sendKeys(ConfigReader.getProperty("emailAddress"));
    page.signInPassword.sendKeys(ConfigReader.getProperty("gecerliPassword"));
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

    //Enter a title in the Product Title field
    page.productTitle.sendKeys("clothes");

    //Do inventory processes
    ReusableMethods.scroll(page.inventory);
    ReusableMethods.bekle(5);
    page.inventory.click();
    page.skuBox.sendKeys(faker.name().name());
    page.manageStock.click();
    page.stockQty.sendKeys(Keys.DELETE,"3");
    ReusableMethods.ddmIndex(page.backordersBox,2);
    page.soldIndividually.click();

    //Do Shipping processes
    page.shipping.click();
    page.weight.sendKeys("1",Keys.TAB,"30",Keys.TAB,"20",Keys.TAB,"5");
    ReusableMethods.ddmIndex(page.processing,1);

    //Do Attributes processes
    page.attributes.click();
    ReusableMethods.bekle(3);
    page.attributesColor.click();
    page.colorbox.click();
    actions.sendKeys(Keys.TAB).perform();
    Assert.assertTrue(page.colorbox.isDisplayed());
    page.size.click();
    page.sizeBox.click();
    actions.sendKeys(Keys.TAB).perform();
    Assert.assertTrue(page.sizeBox.isDisplayed());
    ReusableMethods.bekle(2);

    //Click the Draft button
    ReusableMethods.click(page.draftButton);
    ReusableMethods.bekle(3);

    //Click the Products button
    ReusableMethods.click(page.products1);
    ReusableMethods.bekle(3);

    //Click the view button
    ReusableMethods.click(page.viewButton);
    ReusableMethods.switchToWindow(1);
    ReusableMethods.webElementResmi(page.productDetails);

    //Verify that inventory processes are done
    Assert.assertTrue(page.productDetails.isDisplayed());

    //Verify that shipping and attributes processes are done
    ReusableMethods.click(page.specificationButton);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    ReusableMethods.bekle(2);
    ReusableMethods.webElementResmi(page.specificationDetails);
    Assert.assertTrue(page.specificationDetails.isDisplayed());


}

}
