package tests.US001;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC03_InvalidRegister extends ExtentReport {
    Page page = new Page();
    Faker faker = new Faker();
    @Test
    public void testCase03() {
        extentTest = extentReports.createTest("Kayıt İşlemi Başarısız", "Test Raporu");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Anasayfaya gidildi.");

        page.registerButton.click();
        extentTest.info("Register butonuna tıklandı.");
        extentTest.info("Username alanı boş bırakıldı.");

        page.emailArea.sendKeys(faker.internet().emailAddress());
        extentTest.info("Email adres girildi.");

        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Password girildi.");

        page.agreeButton.click();
        extentTest.info("I agree to the privacy policy butonu onaylandı.");

        page.signUpButton.click();
        extentTest.info("Sign Up butonuna tıklandı.");

        String message = page.usernameArea.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Lütfen bu alanı doldurun"));
        extentTest.info("Kayıt İşlemi başarısız.");
        ReusableMethods.tumSayfaResmi("01","Kayıt işlemi başarısız");
        Driver.closeDriver();
    }
}
