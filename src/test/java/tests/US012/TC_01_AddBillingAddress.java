package tests.US012;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Page;
import utilities.ConfigReader;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class TC_01_AddBillingAddress extends ExtentReport {
    @Test
    public void test01() {
        //Go to homepage and sign in Vendor account
        Page page =new Page();
        SoftAssert softAssert =new SoftAssert();
        extentTest = extentReports.createTest("US_12","Add Vendor's Billing Address");
        extentTest.info("The homepage is opened");
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"),ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Signed in as a Vendor");

        //Click 'my account' button
        ReusableMethods.visibleWait(page.signOutButton,10);
        page.signOutButton.click();
        extentTest.info("Clicked the my account button");

        //Click addresses button
        page.addressesButton.click();
        extentTest.info("Clicked adresses button");

        //Click add billing button
        page.billingAdd.click();
        extentTest.info("Clicked add billing button");

        //Are the Name, Surname and Email fields filled in automatically?
        softAssert.assertTrue(page.billingName.getText().isEmpty());
        extentTest.info("The Vendor's Name automatically is not there");
        ReusableMethods.webElementResmi(page.billingNameArea);
        softAssert.assertTrue(page.billingLastname.getText().isEmpty());
        extentTest.info("The Vendor's Last Name automatically is not there");
        ReusableMethods.bekle(1);
        ReusableMethods.webElementResmi(page.billingSurnameArea);
        softAssert.assertEquals(page.billingEmail.getAttribute("value"),ConfigReader.getProperty("sabitEmail"));
        extentTest.info("Checked the Vendor's email automatically is there");

        //Fill all required fields
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"), Keys.TAB,ConfigReader.getProperty("addresseLastName"));
        extentTest.info("Entered a name and surname");

        ReusableMethods.ddmValue(page.billingCountry,"DE");
        extentTest.info("Selected a country");

        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        extentTest.info("Entered a Street");

        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        extentTest.info("Entered a ZIP number");

        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        extentTest.info("Entered a town");

        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
        extentTest.info("Entered a phone number");

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        ReusableMethods.visibleWait(page.checkAddAddress, 10);
        extentTest.info("Clicked the save address button");

        //Check the address has been added
        softAssert.assertTrue(page.checkAddAddress.isDisplayed());
        extentTest.info("Checked that the address has been added");
        softAssert.assertAll();
    }
}