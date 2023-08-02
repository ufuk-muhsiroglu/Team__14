package tests.US012;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC_02_NegativeTests extends ExtentReport {
    @Test(priority = -3)
    public void alertName() {
        extentTest = extentReports.createTest("US_12_Name", "Alert of First Name Field");
        Page page = new Page();
        //Go to homepage and sign in Vendor account
        extentTest.info("The homepage is opened");
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"), ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Signed in as a Vendor");

        //Click 'my account' button
        ReusableMethods.visibleWait(page.signOutButton, 10);
        page.signOutButton.click();
        extentTest.info("Clicked the my account button");

        //Click addresses button
        page.addressesButton.click();
        extentTest.info("Clicked adresses button");

        //Click add billing button
        page.billingAdd.click();
        extentTest.info("Clicked add billing button");

        //Enter a surname
        page.billingLastname.sendKeys(ConfigReader.getProperty("addresseLastName"));
        extentTest.info("Entered a last name");

        //Select a country from Country field
        ReusableMethods.ddmValue(page.billingCountry, "DE");
        extentTest.info("Selected a country");

        //Enter a Street address
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        extentTest.info("Entered a Street address");

        //Enter Zip Code
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        extentTest.info("Entered a Postcode/Zip");

        //Enter a Town
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        extentTest.info("Entered a town");

        //Enter a phone number
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
        extentTest.info("Entered a phone number");

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        extentTest.info("Clicked the save address button");

        //Check the alert message
        Assert.assertEquals(page.alertBillingAddress.getText(), "First name is a required field.");
        ReusableMethods.webElementResmi(page.alertBillingAddress);
        extentTest.info("Check the alert message is 'First name is a required field.'");
    }

    @Test(priority = -2)
    public void alertSurname() {
        extentTest = extentReports.createTest("US_12_Surname", "Alert of Last Name Field");
        Page page = new Page();
        //Go to homepage and sign in Vendor account
        extentTest.info("The homepage is opened");
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"), ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Signed in as a Vendor");

        //Click 'my account' button
        ReusableMethods.visibleWait(page.signOutButton, 10);
        page.signOutButton.click();
        extentTest.info("Clicked the my account button");

        //Click addresses button
        page.addressesButton.click();
        extentTest.info("Clicked adresses button");

        //Click add billing button
        page.billingAdd.click();
        extentTest.info("Clicked add billing button");

        //Enter a name
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"));
        extentTest.info("Entered a first name");

        //Select a country from Country field
        ReusableMethods.ddmValue(page.billingCountry, "DE");
        extentTest.info("Selected a country");

        //Enter a Street address
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        extentTest.info("Entered a Street address");

        //Enter Zip Code
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        extentTest.info("Entered a Postcode/Zip");

        //Enter a Town
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        extentTest.info("Entered a town");

        //Enter a phone number
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
        extentTest.info("Entered a phone number");

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        extentTest.info("Clicked the save address button");

        //Check the alert message
        Assert.assertEquals(page.alertBillingAddress.getText(), "Last name is a required field.");
        ReusableMethods.webElementResmi(page.alertBillingAddress);
        extentTest.info("Check the alert message is 'Last name is a required field.'");
    }

    @Test(priority = -1)
    public void alertCountry() {
        extentTest = extentReports.createTest("US_12_Country", "Alert of Country Field");
        Page page = new Page();
        //Go to homepage and sign in Vendor account
        extentTest.info("The homepage is opened");
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"), ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Signed in as a Vendor");

        //Click 'my account' button
        ReusableMethods.visibleWait(page.signOutButton, 10);
        page.signOutButton.click();
        extentTest.info("Clicked the my account button");

        //Click addresses button
        page.addressesButton.click();
        extentTest.info("Clicked adresses button");

        //Click add billing button
        page.billingAdd.click();
        extentTest.info("Clicked add billing button");

        //Enter a name
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"));
        extentTest.info("Entered a first name");

        //Enter a surname
        page.billingLastname.sendKeys(ConfigReader.getProperty("addresseLastName"));
        extentTest.info("Entered a last name");

        //Enter a Street address
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        extentTest.info("Entered a Street address");

        //Enter Zip Code
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        extentTest.info("Entered a Postcode/Zip");

        //Enter a State
        ReusableMethods.ddmIndex(page.billingState, 3);
        extentTest.info("Entered a State");

        //Enter a Town
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        extentTest.info("Entered a town");

        //Enter a phone number
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
        extentTest.info("Entered a phone number");

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        extentTest.info("Clicked the save address button");

        //Check the alert message
        Assert.assertEquals(page.alertBillingAddress.getText(), "Country / Region is a required field.");
        ReusableMethods.webElementResmi(page.alertBillingAddress);
        extentTest.info("Check the alert message is 'Country / Region is a required field.'");
    }

    @Test
    public void alertStreet() {
        extentTest = extentReports.createTest("US_12_Street", "Alert of Street Field");
        Page page = new Page();
        //Go to homepage and sign in Vendor account
        extentTest.info("The homepage is opened");
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"), ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Signed in as a Vendor");

        //Click 'my account' button
        ReusableMethods.visibleWait(page.signOutButton, 10);
        page.signOutButton.click();
        extentTest.info("Clicked the my account button");

        //Click addresses button
        page.addressesButton.click();
        extentTest.info("Clicked adresses button");

        //Click add billing button
        page.billingAdd.click();
        extentTest.info("Clicked add billing button");

        //Enter a name
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"));
        extentTest.info("Entered a first name");

        //Enter a surname
        page.billingLastname.sendKeys(ConfigReader.getProperty("addresseLastName"));
        extentTest.info("Entered a last name");

        //Select a country from Country field
        ReusableMethods.ddmValue(page.billingCountry, "DE");
        extentTest.info("Selected a country");

        //Enter Zip Code
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        extentTest.info("Entered a Postcode/Zip");

        //Enter a Town
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        extentTest.info("Entered a town");

        //Enter a phone number
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
        extentTest.info("Entered a phone number");

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        extentTest.info("Clicked the save address button");

        //Check the alert message
        Assert.assertEquals(page.alertBillingAddress.getText(), "Street address is a required field.");
        extentTest.info("Check the alert message is 'Street address is a required field.'");
    }

    @Test(priority = 1)
    public void alertZIP() {
        extentTest = extentReports.createTest("US_12_ZIP", "Alert of Postcode/ZIP Field");
        Page page = new Page();
        //Go to homepage and sign in Vendor account
        extentTest.info("The homepage is opened");
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"), ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Signed in as a Vendor");

        //Click 'my account' button
        ReusableMethods.visibleWait(page.signOutButton, 10);
        page.signOutButton.click();
        extentTest.info("Clicked the my account button");

        //Click addresses button
        page.addressesButton.click();
        extentTest.info("Clicked adresses button");

        //Click add billing button
        page.billingAdd.click();
        extentTest.info("Clicked add billing button");

        //Enter a name
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"));
        extentTest.info("Entered a first name");

        //Enter a surname
        page.billingLastname.sendKeys(ConfigReader.getProperty("addresseLastName"));
        extentTest.info("Entered a last name");

        //Select a country from Country field
        ReusableMethods.ddmValue(page.billingCountry, "DE");
        extentTest.info("Selected a country");

        //Enter a Street address
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        extentTest.info("Entered a Street address");

        //Enter a Town
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        extentTest.info("Entered a town");

        //Enter a phone number
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
        extentTest.info("Entered a phone number");

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        extentTest.info("Clicked the save address button");

        //Check the alert message
        Assert.assertEquals(page.alertBillingAddress.getText(), "Postcode / ZIP is a required field.");
        extentTest.info("Check the alert message is 'Postcode / ZIP is a required field.'");
    }

    @Test(priority = 2)
    public void alertTown() {
        extentTest = extentReports.createTest("US_12_Town", "Alert of City/Town Field");
        Page page = new Page();
        //Go to homepage and sign in Vendor account
        extentTest.info("The homepage is opened");
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"), ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Signed in as a Vendor");

        //Click 'my account' button
        ReusableMethods.visibleWait(page.signOutButton, 10);
        page.signOutButton.click();
        extentTest.info("Clicked the my account button");

        //Click addresses button
        page.addressesButton.click();
        extentTest.info("Clicked adresses button");

        //Click add billing button
        page.billingAdd.click();
        extentTest.info("Clicked add billing button");

        //Enter a name
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"));
        extentTest.info("Entered a first name");

        //Enter a surname
        page.billingLastname.sendKeys(ConfigReader.getProperty("addresseLastName"));
        extentTest.info("Entered a last name");

        //Select a country from Country field
        ReusableMethods.ddmValue(page.billingCountry, "DE");
        extentTest.info("Selected a country");

        //Enter a Street address
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        extentTest.info("Entered a Street address");

        //Enter Zip Code
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        extentTest.info("Entered a Postcode/Zip");

        //Enter a phone number
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
        extentTest.info("Entered a phone number");

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        extentTest.info("Clicked the save address button");

        //Check the alert message
        Assert.assertEquals(page.alertBillingAddress.getText(), "Town / City is a required field.");
        extentTest.info("Check the alert message is 'Town / City is a required field.'");
    }

    @Test(priority = 3)
    public void alertPhone() {
        extentTest = extentReports.createTest("US_12_Phone", "Alert of Phone Field");
        Page page = new Page();
        //Go to homepage and sign in Vendor account
        extentTest.info("The homepage is opened");
        ReusableMethods.signInMethod(ConfigReader.getProperty("sabitEmail"), ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Signed in as a Vendor");

        //Click 'my account' button
        ReusableMethods.visibleWait(page.signOutButton, 10);
        page.signOutButton.click();
        extentTest.info("Clicked the my account button");

        //Click addresses button
        page.addressesButton.click();
        extentTest.info("Clicked adresses button");

        //Click add billing button
        page.billingAdd.click();
        extentTest.info("Clicked add billing button");

        //Enter a name
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"));
        extentTest.info("Entered a first name");

        //Enter a surname
        page.billingLastname.sendKeys(ConfigReader.getProperty("addresseLastName"));
        extentTest.info("Entered a last name");

        //Select a country from Country field
        ReusableMethods.ddmValue(page.billingCountry, "DE");
        extentTest.info("Selected a country");

        //Enter a Street address
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        extentTest.info("Entered a Street address");

        //Enter Zip Code
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        extentTest.info("Entered a Postcode/Zip");

        //Enter a Town
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        extentTest.info("Entered a town");

        //Click the Save Address button
        ReusableMethods.click(page.saveBillingAddress);
        extentTest.info("Clicked the save address button");

        //Check the alert message
        Assert.assertEquals(page.alertBillingAddress.getText(), "Phone is a required field.");
        extentTest.info("Check the alert message is 'Phone is a required field.'");

    }

}
