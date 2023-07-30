package tests.US001;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC06_InvalidRegister {
    Page page = new Page();
    Faker faker = new Faker();

    @Test
    public void testCase06() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.registerButton.click();
        page.usernameArea.sendKeys(faker.name().username());
        page.emailArea.sendKeys(faker.internet().emailAddress());
        page.agreeButton.click();
        page.signUpButton.click();
        String message = page.passwordArea.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Lütfen bu alanı doldurun"));
        Driver.closeDriver();
    }
}
