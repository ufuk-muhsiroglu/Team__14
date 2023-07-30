package tests.US001;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC03_InvalidRegister {
    Page page = new Page();
    Faker faker = new Faker();
    @Test
    public void testCase03() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.registerButton.click();
        page.emailArea.sendKeys(faker.internet().emailAddress());
        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        page.agreeButton.click();
        page.signUpButton.click();
        String message = page.usernameArea.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Lütfen bu alanı dolduru"));
        Driver.closeDriver();
    }
}
