package tests.US011;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC_01_SuccessfulSignAsVendor extends ExtentReport {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("US_11","Sign in as a Vendor");
        Page page =new Page();
        SoftAssert softAssert=new SoftAssert();
        //go to home page
        //click to sign in button
        //Write User e-mail and password
        //Click sign in button
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"),ConfigReader.getProperty("sabitPassword"));
        extentTest.info("The homepage is opened");
        extentTest.info("Signed in as a Vendor");
        ReusableMethods.bekle(3);
        ReusableMethods.scrollEnd();

        ReusableMethods.click(page.myAccountButtonUS11);
        softAssert.assertTrue(page.myAccountCheck.isDisplayed());
        extentTest.info("'My Account' text is displayed");

        //Control the Store manager, orders, downloads, addresses , account details,
        // wishlist, Support tickets, followings and  log out buttons is displayed
        ReusableMethods.bekle(2);
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
        extentTest.info("Checked that all buttons are displayed.");

        //Store Manager sayfasina gidildigini dogrular
        page.storeMangerUS11.click();
        softAssert.assertTrue(page.storeManagerUS11Check.isDisplayed());
        extentTest.info("Store Manager button is clickable");

        //Bir onceki sayfaya gecmek icin geri tusuna tiklar
        Driver.getDriver().navigate().back();

        //Orders yazisina tiklar
        page.ordersUS11.click();
        extentTest.info("Orders button is clickable");

        //Orders sekmesine gecildigini dogrular
        softAssert.assertEquals(page.checkButtons.getText(),"Orders");

        //Downloads'a tiklar
        page.downloadsUS11.click();
        extentTest.info("Downloads button is clickable");

        //Downloads sekmesine gecildigini dogrular
        softAssert.assertEquals(page.checkButtons.getText(),"Downloads");

        //Addreses yazisina tiklar
        page.addressesButton.click();
        extentTest.info("Addresses button is clickable");

        //Addreses sekmesine gecildigini dogrular
        softAssert.assertEquals(page.checkButtons.getText(),"Addreses");

        //Account details'i tiklar
        page.accountDetailsUS11.click();
        extentTest.info("Account details button is clickable");

        //Account details sekmesine gecildigini dogrular
        softAssert.assertEquals(page.checkButtons.getText(),"Account details");

        //Wishlist'i tiklar
        ReusableMethods.click(page.wishlistUS11);
        extentTest.info("Wishlist button is clickable");

        //Wishlist sekmesine gecildigini dogrular
        softAssert.assertTrue(page.wishlistUS11Check.isDisplayed());

        //Bir onceki sayfaya gecmek icin geri tusuna basar
        Driver.getDriver().navigate().back();

        //Support tickets'a tiklar
        ReusableMethods.click(page.supportTicketsUS11);
        extentTest.info("Support Tickets button is clickable");

        //Support tickets sekmesine gecildigini dogrular
        softAssert.assertTrue(page.supportTicketsUS11Check.isDisplayed());

        //Followings'e tiklar
        ReusableMethods.click(page.followingsUS11);
        extentTest.info("Followings button is clickable");

        //Followings sekmesine gecildigini dogrular
        softAssert.assertTrue(page.followingsUS11Check.isDisplayed());

        //Log out 'a tiklar
        ReusableMethods.click(page.logoutUS11);
        extentTest.info("Log out button is clickable");

        //Log out sekmesine gecildigini dogrular
        softAssert.assertTrue(page.homePageSignIn.isDisplayed());
        extentTest.info("Log out button is clickable");

        softAssert.assertAll();
    }
}
