package tests.US002;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_InvalidRegister {
    Page page = new Page();
    Faker faker = new Faker();

    @Test
    public void testCase01() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.registerButton.click();
        page.usernameArea.sendKeys(ConfigReader.getProperty("username"));
        page.emailArea.sendKeys(faker.internet().emailAddress());
        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        page.agreeButton.click();
        page.signUpButton.click();
        Assert.assertTrue(page.alreadyRegisteredMessage.isDisplayed());
        Driver.closeDriver();
    }
}
