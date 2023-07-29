package tests.US012;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01 {
    @Test
    public void test01() {
        //Go to homepage
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        Page page =new Page();
        //Sign in User account
        page.homePageSignIn.click();
        ReusableMethods.bekle(2);
        page.signUsername.sendKeys(ConfigReader.getProperty("sabitEmail"));
        page.signPassword.sendKeys(ConfigReader.getProperty("sabitPassword"));
        page.signInButton.click();
        ReusableMethods.visibleWait(page.signOutButton,10);
        page.signOutButton.click();

        //Click addresses button
        page.addressesButton.click();

        //Click add billing button
        page.billingAdd.click();

        //Fill all field
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"), Keys.TAB,ConfigReader.getProperty("addresseLastName"));
        ReusableMethods.ddmValue(page.billingCountry,"DE");
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));

        //Check the email is already exist
        Assert.assertEquals(page.billingEmail.getAttribute("value"),ConfigReader.getProperty("sabitEmail"));
        ReusableMethods.bekle(2);
        //Click the Save Address button
        WebElement element = page.saveBillingAddress;
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }
}
