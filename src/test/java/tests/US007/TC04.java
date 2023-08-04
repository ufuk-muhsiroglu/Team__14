package tests.US007;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



public class TC04 extends TestBaseRapor{

    //    Ana sayfaya git.
//    Register a tıkla
//    Username gir
//    Geçerli e-mail adresi gir
//    Kucuk harf, büyük harf, rakam ve special karakter içeren Password gir
//    "I agree to the privacy policy" tıklanmadan kayıt olunmamalı
//    SIGN UP butonuna tıklayarak kayıt yapılmalı
//    Arama butonundan ürün ara.
//    Gelen ürünlerden herhangi birini seç.
//    Compare Products alanında toplam 4 ürün seçili olduğunu değrula.
//Compare Products alanındaki ürünleri silmek için Clean All butonuna tıkla.

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
        page.userName1.sendKeys("Alp", Keys.TAB, ConfigReader.getProperty("email1"),
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

//       Compare Products alanında toplam 2 ürün seçin.
        page.searchBoxy.sendKeys("macbook",Keys.ENTER);
        page.ilkUrun.click();
        ReusableMethods.click(page.scaleIkon);
        extentTest.info("Ilk urun secıldı ve aklendı");



//        Gelen ürünlerden ıkıncı urun ekle
        page.searchBoxy.sendKeys("macbook",Keys.ENTER);
        ReusableMethods.click(page.ikinciUrun);
        ReusableMethods.click(page.scaleIkon);
        ReusableMethods.bekle(3);
        extentTest.info(" Compare Products alanında toplam 2 ürün seçildı");


//       Compare Products alanındaki ürünleri silmek için Clean All butonuna tıkla ve sılındıgını dogrula.
        page.clearAll.click();
        extentTest.info(" Compare Products alanındaki ürünleri silındı ");
        ReusableMethods.bekle(3);

        ReusableMethods.tumSayfaResmi("07","Compare Products alanındaki ürünleri silındıgı goruldu");


    }
}