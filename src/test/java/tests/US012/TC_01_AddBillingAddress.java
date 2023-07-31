package tests.US012;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_01_AddBillingAddress {
    @Test
    public void test01() {
        //Go to homepage and sign in Vendor account
        Page page =new Page();
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"),ConfigReader.getProperty("sabitPassword"));
        ReusableMethods.visibleWait(page.signOutButton,10);
        page.signOutButton.click();

        //Click addresses button
        page.addressesButton.click();

        //Click add billing button
        page.billingAdd.click();

        //Fill all required fields
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"), Keys.TAB,ConfigReader.getProperty("addresseLastName"));
        ReusableMethods.ddmValue(page.billingCountry,"DE");
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));

        //Check Vendor's email is there
        Assert.assertEquals(page.billingEmail.getAttribute("value"),ConfigReader.getProperty("sabitEmail"));
        ReusableMethods.bekle(2);

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        ReusableMethods.visibleWait(page.checkAddAddress, 10);

        //Check the address has been added
        ReusableMethods.scroll(page.checkAddAddress);
        Assert.assertEquals(page.checkAddAddress.getText(),"EDIT YOUR BILLING ADDRESS");
    }
}