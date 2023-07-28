package tests.US011;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_SuccessfulSignAsVendor {
    @Test
    public void test01() {
        //go to home page
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //click to register button
        Page page =new Page();
        page.homePageSignIn.click();

        //Write User e-mail and password
        ReusableMethods.bekle(2);
        page.signUsername.sendKeys(ConfigReader.getProperty("sabitEmail"));
        page.signPassword.sendKeys(ConfigReader.getProperty("sabitPassword"));

        //Click sign in button
        page.signInButton.click();

        //Control the Store manager, orders, downloads, addresses , account details,
        // wishlist, Support tickets, followings and  log out buttons is displyed
        ReusableMethods.visibleWait(page.signOutButton,10);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(page.signOutButton.isDisplayed());
        page.signOutButton.click();
        softAssert.assertEquals(page.dashboard.getText(),"Dashboard\n" +
                "Store Manager\n" +
                "Orders\n" +
                "Downloads\n" +
                "Addresses\n" +
                "Account details\n" +
                "Wishlist\n" +
                "Support Tickets\n" +
                "Followings\n" +
                "Logout");
        softAssert.assertAll();
    }
}
