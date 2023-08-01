package tests.US012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_08_NegativeTestPhone {
    @Test
    public void alertPhone() {
        //Go to homepage and sign in Vendor account
        Page page =new Page();
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"),ConfigReader.getProperty("sabitPassword"));
        ReusableMethods.visibleWait(page.signOutButton,10);
        page.signOutButton.click();

        //Click addresses button
        page.addressesButton.click();

        //Click add billing button
        page.billingAdd.click();

        //Enter a name
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"));

        //Enter a surname
        page.billingLastname.sendKeys(ConfigReader.getProperty("addresseLastName"));

        //Select a country from Country field
        ReusableMethods.ddmValue(page.billingCountry,"DE");

        //Enter a Street address
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));

        //Enter Zip Code
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));

        //Enter a Town
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);

        //Check the street alert message
        Assert.assertEquals(page.alertBillingAddress.getText(),"Phone is a required field.");
    }
}
