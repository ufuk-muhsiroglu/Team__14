package tests.US15;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        //Verify the visibility of the menus
        ReusableMethods.scroll(page.draftButton);
        ReusableMethods.tumSayfaResmi("linked");



    }
}
