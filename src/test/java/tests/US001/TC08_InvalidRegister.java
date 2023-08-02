package tests.US001;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC08_InvalidRegister extends ExtentReport {
    Page page = new Page();
    Faker faker = new Faker();

    @Test
    public void testCase08() {
        extentTest = extentReports.createTest("Kayıt İşlemi Başarısız", "Test Raporu");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Anasayfaya gidildi.");

        page.registerButton.click();
        extentTest.info("Register butonuna tıklandı.");

        String fakeUsername = faker.name().username();
        page.usernameArea.sendKeys(fakeUsername+"+123");
        extentTest.info("Username+123 şeklinde username girildi.");

        page.emailArea.sendKeys(faker.internet().emailAddress());
        extentTest.info("Email girildi.");

        page.passwordArea.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Password girildi.");

        page.agreeButton.click();
        extentTest.info("I agree to the privacy policy butonu onaylandı.");

        page.signUpButton.click();
        extentTest.info("Sign Up butonuna tıklandı.");

        Assert.assertEquals(page.validAccountUsernameAllert.getText(),"Please enter a valid account username.");
        extentTest.info("Please enter a valid account username uyarısı alındı.");
        extentTest.info("Kayıt İşlemi başarısız.");
        ReusableMethods.tumSayfaResmi("01","Kayıt işlemi başarısız");
        Driver.closeDriver();
    }
}
