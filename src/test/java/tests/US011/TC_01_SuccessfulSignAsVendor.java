package tests.US011;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_SuccessfulSignAsVendor {
    @Test
    public void test01() {
        Page page =new Page();
        //go to home page
        //click to sign in button
        //Write User e-mail and password
        //Click sign in button
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"),ConfigReader.getProperty("sabitPassword"));

        //Control the Store manager, orders, downloads, addresses , account details,
        // wishlist, Support tickets, followings and  log out buttons is displyed
        ReusableMethods.visibleWait(page.signOutButton,10);
        page.signOutButton.click();
        Assert.assertEquals(page.dashboard.getText(),"Dashboard\n" +
                "Store Manager\n" +
                "Orders\n" +
                "Downloads\n" +
                "Addresses\n" +
                "Account details\n" +
                "Wishlist\n" +
                "Support Tickets\n" +
                "Followings\n" +
                "Logout");
    }
}
