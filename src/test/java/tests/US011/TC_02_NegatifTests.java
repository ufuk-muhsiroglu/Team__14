package tests.US011;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02_NegatifTests {
    @Test
    public void invalidEmail() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        Page page = new Page();
        page.homePageSignIn.click();
        ReusableMethods.visibleWait(page.signUsername,5);
        page.signUsername.sendKeys(ConfigReader.getProperty("wrongEmail"));
        page.signPassword.sendKeys(ConfigReader.getProperty("sabitPassword"));
        page.signInButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.invalidMailError.isDisplayed());
        Assert.assertEquals(page.invalidMailError.getText(),"Wrong username or password.");
    }

    @Test
    public void invalidPassword() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        Page page = new Page();
        page.homePageSignIn.click();
        ReusableMethods.visibleWait(page.signUsername,5);
        page.signUsername.sendKeys(ConfigReader.getProperty("sabitEmail"));
        page.signPassword.sendKeys(ConfigReader.getProperty("wrongPassword"));
        page.signInButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.invalidMailError.isDisplayed());
        Assert.assertEquals(page.invalidMailError.getText(),"Wrong username or password.");
    }
}
