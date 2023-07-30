package tests.US001;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC02_InvalidRegister {
    Page page = new Page();
    Faker faker = new Faker();
    @Test
    public void testCase02() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.registerButton.click();
        page.usernameArea.sendKeys(faker.name().username());
        page.emailArea.sendKeys(faker.internet().emailAddress());
        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        page.signUpButton.click();
        String message = page.agreeButton.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("İlerlemek istiyorsanız lütfen bu kutuyu işaretleyin"));
        Driver.closeDriver();
    }
}
