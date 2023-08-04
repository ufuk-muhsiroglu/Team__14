package tests.US007;

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


public class TC05 extends TestBaseRapor{

        //    Ana sayfaya git.
//    Register a tıkla
//    Username gir
//    Geçerli e-mail adresi gir
//    Kucuk harf, büyük harf, rakam ve special karakter içeren Password gir
//    "I agree to the privacy policy" tıklanmadan kayıt olunmamalı
//    SIGN UP butonuna tıklayarak kayıt yapılmalı
//    Arama butonundan ürün ara.
//    Gelen ürünlerden herhangi birini seç.
//    Click on the scale icon on the opened page
//    Compare Products alanında 1 ürün varken Start Compare butonuna tıkla.
//    Tek ürünü karşılaştırma yapmadığını doğrula
//    Aynı sayfada arama butonundan ürün ara.
//    Gelen ürünlerden herhangi birini seç.
//    Click on the scale icon on the opened page
//    Compare Products alanında 2 ürün varken Start Compare butonuna tıkla.
//    2 ürünü karşılaştırma yapabildiğini doğrula
//    Aynı sayfada arama butonundan ürün ara.
//    Gelen ürünlerden herhangi birini seç.
//    Click on the scale icon on the opened page
//    Compare Products alanında 3 ürün varken Start Compare butonuna tıkla.
//    3 ürünü karşılaştırma yapabildiğini doğrula

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

//        Arama butonundan ürün ara. "macbook"
        page.searchBox.sendKeys("macbook",Keys.ENTER);
        extentTest.info("Registera tiklandi");


//        Gelen ürünlerden herhangi birini seç.
        ReusableMethods.bekle(2);
        page.ilkUrun.click();
        extentTest.info("Gelen ürünlerden herhangi biri secildi");

//        Click on the scale icon on the opened page
        ReusableMethods.bekle(2);
        page.scaleIkon.click();
        extentTest.info("Scale icon una tiklandi");

//        Compare Products alanında 1 ürün varken Start Compare butonuna tıkla.
        ReusableMethods.click(page.startCompareButton);
        ReusableMethods.bekle(3);
        extentTest.info("Compare Products alanında 1 ürün varken Start Compare butonuna tıklandi");

//        Tek ürünü karşılaştırma yapamadığını doğrula
        ReusableMethods.scroll(page.fotoIcinLocation);
        ReusableMethods.tumSayfaResmi("07","Tek urun karsilastirma yapamadigi dogrulandi");
        ReusableMethods.bekle(3);
        extentTest.info(" Tek ürünü karşılaştırma yapamadığı doğrulandi");

//        Aynı sayfada arama butonundan ürün ara.
        page.searchBoxAgain.sendKeys("iphone,",Keys.ENTER);
        ReusableMethods.bekle(3);
        extentTest.info("Aynı sayfada arama butonundan ürün arandi");

//        Gelen ürünlerden herhangi birini seç.
        page.ikinciUrun.click();
        ReusableMethods.bekle(3);
        extentTest.info("Gelen ürünlerden herhangi biri seçildi");

//        Click on the scale icon on the opened page
        page.scaleIkon.click();
        ReusableMethods.bekle(3);
        extentTest.info("Scale icon una tiklandi");


//        Compare Products alanında 2 ürün varken Start Compare butonuna tıkla.
        ReusableMethods.click(page.startCompareButton);
        ReusableMethods.bekle(3);
        extentTest.info("Compare Products alanında 2 ürün varken Start Compare butonuna tıklandi");

//        2 ürünü karşılaştırma yapabildiğini doğrula
        ReusableMethods.scroll(page.fotoIcinLocation);
        ReusableMethods.tumSayfaResmi("07","Iki urun ile karsilastirma yapabildigi dogrulandi");
        ReusableMethods.bekle(3);
        extentTest.info("Iki ürünü karşılaştırma yapabilabildigi doğrulandi");

//        Aynı sayfada arama butonundan ürün ara. "iphone"
        page.searchBoxAgain.sendKeys("iphone",Keys.ENTER);
        ReusableMethods.bekle(3);
        extentTest.info(" Aynı sayfada arama butonundan ürün arandi");

//        Gelen ürünlerden herhangi birini seç.
        page.ucuncuUrun.click();
        ReusableMethods.bekle(3);
        extentTest.info("Gelen ürünlerden herhangi biri seçildi");

//        Click on the scale icon on the opened page
        page.scaleIkon.click();
        ReusableMethods.bekle(3);
        extentTest.info("Scale icon una tiklandi");

//        Compare Products alanında 3 ürün varken Start Compare butonuna tıkla.
        page.startCompareButton.click();
        ReusableMethods.bekle(3);
        extentTest.info(" Compare Products alanında 3 ürün varken Start Compare butonuna tıklandi");

//        3 ürünü karşılaştırma yapabildiğini doğrula
        ReusableMethods.scroll(page.fotoIcinLocation);
        ReusableMethods.tumSayfaResmi("07","Uc urun ile karsilastirma yapilabildigi dogrulandi");
        ReusableMethods.bekle(3);
        extentTest.info("Uc ürünü karşılaştırma yapilabildiği doğrulandi");

    }
}