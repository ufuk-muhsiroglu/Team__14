package tests.US001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import com.github.javafaker.Faker;

public class TC01_RegisterIslemi {
Faker faker = new Faker();
Page page = new Page();

    @Test
    public void testCase01() {
        ReusableMethods.registerMethod(faker.name().username(),faker.internet().emailAddress(),ConfigReader.getProperty("password"));
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.signOutButton.isDisplayed());
    }
}
