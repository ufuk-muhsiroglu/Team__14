package tests.US001;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC07_InvalidRegister extends ExtentReport {
    Page page = new Page();
    Faker faker = new Faker();

    @Test
    public void testCase07() {
        extentTest = extentReports.createTest("Kayıt İşlemi Başarısız", "Test Raporu");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Anasayfaya gidildi.");

        page.registerButton.click();
        extentTest.info("Register butonuna tıklandı.");

        page.usernameArea.sendKeys(faker.name().username());
        extentTest.info("Username girildi.");

        page.emailArea.sendKeys(faker.internet().emailAddress());
        extentTest.info("Email girildi.");

        page.passwordArea.sendKeys(ConfigReader.getProperty("eksikPassword"));
        extentTest.info("3 karakterden oluşan eksik bir password girildi.");
        extentTest.fail("Sign Up butonu tıklanamaz oldu.");

        page.agreeButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("I agree to the privacy policy butonu onaylandı.");
        Assert.assertFalse(page.signUpButton.isEnabled());

        ReusableMethods.tumSayfaResmi("01","Kayıt işlemi başarısız");
        Driver.closeDriver();
    }
}
