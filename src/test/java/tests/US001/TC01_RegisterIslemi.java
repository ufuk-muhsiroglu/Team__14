package tests.US001;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;
import com.github.javafaker.Faker;


public class TC01_RegisterIslemi extends ExtentReport {
Faker faker = new Faker();
Page page = new Page();

    @Test
    public void testCase01(){
        extentTest = extentReports.createTest("Kayıt İşlemi Gerçekleşti", "Test Raporu");
        ReusableMethods.registerMethod(faker.name().username(),faker.internet().emailAddress(),ConfigReader.getProperty("password"));
        extentTest.info("Ana sayfaya gidildi.");
        extentTest.info("Register butonuna basıldı.");
        extentTest.info("Username girildi.");
        extentTest.info("Email adresi girildi.");
        extentTest.info("Password girildi.");
        extentTest.info("I agree to the privacy policy butonu onaylandı.");
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.signOutButton.isDisplayed());
        extentTest.info("Kayıt işlemi başarıyla gerçekleşti.");
        ReusableMethods.tumSayfaResmi("01","Kayıt İşlemi başarıyla gerçekleşti.");
    }
}
