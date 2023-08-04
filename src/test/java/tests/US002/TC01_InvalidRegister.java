package tests.US002;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01_InvalidRegister extends ExtentReport {
    Page page = new Page();
    Faker faker = new Faker();

    @Test
    public void testCase01() {
        extentTest = extentReports.createTest("Kayıt İşlemi Başarısız", "Test Raporu");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Anasayfaya gidildi.");

        page.registerButton.click();
        extentTest.info("Register butonuna tıklandı.");

        page.usernameArea.sendKeys(ConfigReader.getProperty("username"));
        extentTest.info("Daha önceden kayıtlı bir username girildi.");

        page.emailArea.sendKeys(faker.internet().emailAddress());
        extentTest.info("Daha önceden kayıtlı olmayan bir email girildi.");

        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Password girildi.");

        page.agreeButton.click();
        extentTest.info("I agree to the privacy policy butonu onaylandı.");

        page.signUpButton.click();
        extentTest.info("Sign Up butonuna tıklandı.");

        Assert.assertEquals(page.alreadyRegisteredUsernameMessage.getText(),"An account is already registered with that username. Please choose another.");
        extentTest.info("An account is already registered with that username. Please choose another. uyarısı alındı.");
        extentTest.info("Kayıt İşlemi başarısız.");
        ReusableMethods.tumSayfaResmi("02","Kayıt işlemi başarısız");

        Driver.closeDriver();
    }
}
