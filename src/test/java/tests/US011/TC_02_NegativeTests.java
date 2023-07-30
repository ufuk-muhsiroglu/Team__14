package tests.US011;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02_NegativeTests {
    @Test
    public void invalidEmail() {
        //go to homepage
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        Page page = new Page();
        page.homePageSignIn.click();
        ReusableMethods.visibleWait(page.signUsername,5);

        //do not enter email or enter a wrong email
        page.signUsername.sendKeys(ConfigReader.getProperty("wrongEmail"));

        //enter the password
        page.signPassword.sendKeys(ConfigReader.getProperty("sabitPassword"));

        //click sign in button
        page.signInButton.click();
        ReusableMethods.bekle(2);

        //Check error message("Wrong username or password.")
        Assert.assertEquals(page.invalidMailError.getText(),"Wrong username or password.");
    }

    @Test
    public void invalidPassword() {
        //go to homepage
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        Page page = new Page();
        page.homePageSignIn.click();

        //Enter a registered email
        ReusableMethods.visibleWait(page.signUsername,5);
        page.signUsername.sendKeys(ConfigReader.getProperty("sabitEmail"));

        //Enter wrong password
        page.signPassword.sendKeys(ConfigReader.getProperty("wrongPassword"));

        //Click sign in button
        page.signInButton.click();
        ReusableMethods.bekle(2);

        //Check error message("Wrong username or password.")
        Assert.assertEquals(page.invalidMailError.getText(),"Wrong username or password.");
    }
}
