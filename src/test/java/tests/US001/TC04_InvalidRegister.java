package tests.US001;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC04_InvalidRegister extends ExtentReport {
    Page page = new Page();
    Faker faker = new Faker();

    @Test
    public void testCase04() {
        extentTest = extentReports.createTest("Kayıt İşlemi Başarısız", "Test Raporu");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Anasayfaya gidildi.");

        page.registerButton.click();
        extentTest.info("Register butonuna tıklandı.");

        page.usernameArea.sendKeys(faker.name().username());
        extentTest.info("Username girildi.");

        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Password girildi.");

        page.agreeButton.click();
        extentTest.info("I agree to the privacy policy butonu onaylandı.");

        page.signUpButton.click();
        extentTest.info("Sign Up butonuna tıklandı.");

        ReusableMethods.bekle(2);
        String message = page.emailArea.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Lütfen bu alanı doldurun"));
        extentTest.info("Kayıt İşlemi başarısız.");
        ReusableMethods.tumSayfaResmi("01","Kayıt işlemi başarısız");

        Driver.closeDriver();
    }
}
