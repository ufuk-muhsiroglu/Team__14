package tests.US002;

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
        extentTest.info("Daha önceden kayıtlı olmayan bir username girildi.");

        page.emailArea.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("Daha önceden kayıtlı bir email girildi.");

        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Password girildi.");

        page.agreeButton.click();
        extentTest.info("I agree to the privacy policy butonu onaylandı.");

        page.signUpButton.click();
        extentTest.info("Sign Up butonuna tıklandı.");

        Assert.assertEquals(page.alreadyRegisteredEmailMessage.getText(),"An account is already registered with your email address. Please log in.");
        extentTest.info("An account is already registered with your email address. Please log in. uyarısı alındı.");
        extentTest.info("Kayıt İşlemi başarısız.");
        ReusableMethods.tumSayfaResmi("02","Kayıt işlemi başarısız");
        Driver.closeDriver();

    }
}
