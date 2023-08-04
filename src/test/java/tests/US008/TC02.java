package tests.US008;


import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OpenSourcePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ExtentReport.extentTest;


public class TC02 extends TestBaseRapor{

    //    Ana sayfaya git.
//    Register a tıkla
//    Username gir
//    Geçerli e-mail adresi gir
//    Kucuk harf, büyük harf, rakam ve special karakter içeren Password gir
//    "I agree to the privacy policy" tıklanmadan kayıt olunmamalı
//    SIGN UP butonuna tıklayarak kayıt yapılmalı
   // QUICK VIEW butonuna tıkla.
   // Gelen pencerede ürün özelliklerini doğrula.


    @Test
    public void testName() {
        extentTest = extentReports.createTest("Add Billing Address 01", "Test Raporu");
        OpenSourcePage page = new OpenSourcePage();

//        Ana sayfaya git.
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Ana sayfaya gidildi");

//        Register a tıkla
        page.registerClick.click();
        extentTest.info("Registera tiklandi");

//        Username gir
//        Geçerli e-mail adresi gir
//        Kucuk harf, büyük harf, rakam ve special karakter içeren Password gir
        page.userName1.sendKeys("Ayp", Keys.TAB, ConfigReader.getProperty("email1"),
                Keys.TAB, ConfigReader.getProperty("password1"),Keys.ENTER);
        extentTest.info("Username, email address ve password girildi");

//        "I agree to the privacy policy" tıklanmadan kayıt olunmadigini dogrula
        Assert.assertTrue(page.tickBoxAlert.isDisplayed());
        ReusableMethods.bekle(5);
        extentTest.info("\"I agree to the privacy policy\" tıklanmadan kayıt olunmadigini dogrulandi");

//        SIGN UP butonuna tıklayarak kayıt yap
        page.tickBox.click();
        page.singUp.click();
        ReusableMethods.bekle(8);
        extentTest.info("SIGN UP butonuna tıklayarak kayıt yapildi");


        // QUICK VIEW butonuna tıkla.



        // Gelen pencerede ürün özelliklerini doğrula.



    }
}