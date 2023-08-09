package tests.US011;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC_02_NegativeTests extends ExtentReport {
    @Test
    public void invalidEmail() {
        extentTest = extentReports.createTest("US_11","Wrong email sign in as vendor");
        Page page = new Page();

        //go to homepage
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        extentTest.info("The homepage opened");

        //Click sign in button on the homepage
        page.homePageSignIn.click();
        extentTest.info("Clicked the sign in button on the homepage");
        ReusableMethods.visibleWait(page.signUsername,5);

        //do not enter email or enter a wrong email
        page.signUsername.sendKeys(ConfigReader.getProperty("wrongEmail"));
        extentTest.info("Entered a wrong email in the username field");

        //enter the password
        page.signPassword.sendKeys(ConfigReader.getProperty("sabitPassword"));
        extentTest.info("Entered a password in the password area");

        //click sign in button
        page.signInButton.click();
        ReusableMethods.bekle(2);
        extentTest.info("Clicked sign in button");

        //Check error message("Wrong username or password.")
        Assert.assertEquals(page.invalidMailError.getText(),"Wrong username or password.");
        extentTest.info("'Wrong username or password.' text is displayed");

        //Check the Vendor could not sign in as a Vendor.
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.signInButton.isDisplayed());
        extentTest.info("Vendor could not signed in as a Vendor");
        ReusableMethods.tumSayfaResmi("US_11");
    }

    @Test
    public void invalidPassword() {
        extentTest = extentReports.createTest("US_11","Wrong password sign in as vendor");
        Page page = new Page();

        //go to homepage
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        extentTest.info("The homepage opened");

        //Click sign in button on the homepage
        page.homePageSignIn.click();
        extentTest.info("Clicked the sign in button on the homepage");

        //Enter a registered email
        ReusableMethods.visibleWait(page.signUsername,5);
        page.signUsername.sendKeys(ConfigReader.getProperty("sabitEmail"));
        extentTest.info("Entered the Vendor's email in the username field");

        //Enter wrong password
        page.signPassword.sendKeys(ConfigReader.getProperty("wrongPassword"));
        extentTest.info("Entered a wrong password in the password area");

        //Click sign in button
        page.signInButton.click();
        ReusableMethods.bekle(2);
        extentTest.info("Clicked sign in button");

        //Check error message("Wrong username or password.")
        Assert.assertEquals(page.invalidMailError.getText(),"Wrong username or password.");
        extentTest.info("'Wrong username or password.' text is displayed");

        //Check the Vendor could not sign in as a Vendor.
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.signInButton.isDisplayed());
        extentTest.info("Vendor could not signed in as a Vendor");
        ReusableMethods.tumSayfaResmi("US_11");
    }
}
