package tests.US010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01_PasswordSituation extends ExtentReport {
    //https://allovercommerce.com/ adresine gidin

    @Test
    public void passwordLevelsTest() {
        //  https://allovercommerce.com/ website
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("Team14" , "Allovercommerce WebSitesine gidildi.");
        // Register butonuna tiklayin
        Page Page = new Page();
        Page.registerButonu.click();
        ReusableMethods.bekle(3);
        extentTest.info( "Register Buttonu click edildi.");
        // Username alanina bir username girin
        Page.firstUsernameBox.sendKeys(ConfigReader.getProperty("vendor_username"));
        extentTest.info( "Vendor olarak Username girildi..");

        // Kucuk harf, büyük harf, rakam ve special karakter içeren gecerli bir e-posta adresi girin
        Page.firstEmailBox.sendKeys(ConfigReader.getProperty("vendor_email"));
        extentTest.info( "Gecerli bir E-Mail girildi.");

        // Gecerli bir sifre girin
        Page.firstPasswordBox.sendKeys(ConfigReader.getProperty("vendor_password"));
        extentTest.info( "Gecerli bir Password girildi.");

        // Sign up as a vendor baglantisini tiklayin
        Page.asVendor.click();
        ReusableMethods.bekle(2);
        extentTest.info( "Sign up Vendor olarak tiklandi.");
        // Kucuk harf, büyük harf, rakam ve special karakter içeren gecerli bir e-posta adresi girin
        Page.secondEmailBox.sendKeys(ConfigReader.getProperty("vendor_email"));
        extentTest.info( "Gecerli bir E-Mail girildi.");

        // "verification code sent to your email" mesajini bekleyin.
        // (verification code mesaji gec geldiginden bekle methodu kullanilmali)
        ReusableMethods.bekle(3);


        // Verification code'unu Verification code alanina girin.
        Page.verificationcodeBox.sendKeys(
                ConfigReader.getProperty("verification_code"));
        ReusableMethods.bekle(2);

        extentTest.info( "Dogrulama Code girildi.");
        // Enter a password with less than 5 characters and assert the message
        Page.secondPasswordBox.sendKeys(ConfigReader.getProperty("password_too_short"));
        ReusableMethods.bekle(2);
        Assert.assertEquals(Page.shortPassword.getText(), "Too short");
        ReusableMethods.bekle(2);

        extentTest.info( "5 karakterden az bir sifre girildi.");
        // Enter a password with 5 characters (only letters) and assert the message
        Page.secondPasswordBox.clear();
        ReusableMethods.bekle(2);
        extentTest.info( "Sadece harflerden olusan 5 karakterden az bir sifre girildi.");

        Page.secondPasswordBox.sendKeys(ConfigReader.getProperty("password_weak"));
        ReusableMethods.bekle(2);
        Assert.assertEquals(Page.weakPassword.getText(), "Weak");
        ReusableMethods.bekle(2);
        // Enter a password with 8 characters (letters and numbers) and assert the message
        Page.secondPasswordBox.clear();
        Page.secondPasswordBox.sendKeys(ConfigReader.getProperty("password_good"));
        ReusableMethods.bekle(2);
        Assert.assertEquals(Page.goodPassword.getText(), "Good");

        // Enter a password with 8 characters (letters, numbers, and special characters) and assert the message
        Page.secondPasswordBox.clear();
        Page.secondPasswordBox.sendKeys(ConfigReader.getProperty("password_strong"));
        ReusableMethods.bekle(2);
        Assert.assertEquals(Page.strongPassword.getText(), "Strong");

        // Enter a strong password with more than 8 characters and assert the message
        Page.secondPasswordBox.clear();
        Page.secondPasswordBox.sendKeys(ConfigReader.getProperty("strong_password_with_special_chars"));
        ReusableMethods.bekle(2);
        Assert.assertEquals(Page.strongPassword.getText(), "Strong");
        extentTest.info( "Guclu ve ozel karakter iceren bir sifre girildi.");


        Driver.closeDriver();
    }
}

