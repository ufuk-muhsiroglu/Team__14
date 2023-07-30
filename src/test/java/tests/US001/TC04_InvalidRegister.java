package tests.US001;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC04_InvalidRegister {
    Page page = new Page();
    Faker faker = new Faker();

    @Test
    public void testCase04() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.registerButton.click();
        page.usernameArea.sendKeys(faker.name().username());
        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        page.agreeButton.click();
        page.signUpButton.click();
        ReusableMethods.bekle(2);
        String message = page.emailArea.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Lütfen bu alanı doldurun"));
        Driver.closeDriver();
    }
}
