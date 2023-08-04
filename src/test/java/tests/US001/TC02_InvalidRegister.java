package tests.US001;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC02_InvalidRegister extends ExtentReport {
    Page page = new Page();
    Faker faker = new Faker();
    @Test
    public void testCase02() {
        extentTest = extentReports.createTest("Kayıt İşlemi Başarısız", "Test Raporu");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Anasayfaya gidildi.");

        page.registerButton.click();
        extentTest.info("Register butonuna tıklandı.");

        page.usernameArea.sendKeys(faker.name().username());
        extentTest.info("Username girildi.");

        page.emailArea.sendKeys(faker.internet().emailAddress());
        extentTest.info("Email adres girildi.");

        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Password girildi.");
        extentTest.info("I agree to the privacy policy butonu onaylanmadı.");

        page.signUpButton.click();
        extentTest.info("Sign Up butonuna tıklandı.");

        String message = page.agreeButton.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("İlerlemek istiyorsanız lütfen bu kutuyu işaretleyin"));
        extentTest.info("İlerlemek istiyorsanız lütfen bu kutuyu işaretleyin uyarısı alındı.");

        extentTest.info("Kayıt işlemi başarısız.");
        ReusableMethods.tumSayfaResmi("01","Kayıt işlemi başarısız.");
        Driver.closeDriver();
    }
}
