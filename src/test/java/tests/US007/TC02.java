package tests.US007;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



public class TC02 extends TestBaseRapor{

    //    Ana sayfaya git.
//    Register a tıkla
//    Username gir
//    Geçerli e-mail adresi gir
//    Kucuk harf, büyük harf, rakam ve special karakter içeren Password gir
//    "I agree to the privacy policy" tıklanmadan kayıt olunmamalı
//    SIGN UP butonuna tıklayarak kayıt yapılmalı
//  "Compare Products alanındaki ürünlerin sağ üst kısmında bulunan
//“X” ikonuna tıklayıp ürünleri teker teker sil."
//Tüm ürünlerin silindiğini doğrula.
//Arama butonundan farklı ürünleri seç.
//Toplamda 4 ürün seçildiğini doğrula.

    @Test
    public void testName() {
        extentTest = extentReports.createTest("Add Billing Address 01", "Test Raporu");
        Page page = new Page();

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
        extentTest.info("I agree to the privacy policy box tıklanmadan kayıt olunmadigini dogrulandi");

//        SIGN UP butonuna tıklayarak kayıt yap
        page.tickBox.click();
        page.singUp.click();
        ReusableMethods.bekle(8);
        extentTest.info("SIGN UP butonuna tıklayarak kayıt yapildi");

//  "Compare Products alanındaki ürünlerin sağ üst kısmında bulunan
//“X” ikonuna tıklayıp ürünleri teker teker sil.

//Tüm ürünlerin silindiğini doğrula

//Arama butonundan farklı ürünleri seç.

//Toplamda 4 ürün seçildiğini doğrula.


    }
}