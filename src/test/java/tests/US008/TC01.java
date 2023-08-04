package tests.US008;



import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



public class TC01 extends TestBaseRapor{

    //    Ana sayfaya git.
//    Register a tıkla
//    Username gir
//    Geçerli e-mail adresi gir
//    Kucuk harf, büyük harf, rakam ve special karakter içeren Password gir
//    "I agree to the privacy policy" tıklanmadan kayıt olunmamalı
//    SIGN UP butonuna tıklayarak kayıt yapılmalı
//    Arama butonundan ürün ara.
//    Gelen ürünlerden herhangi birini seç.
    // Sosyal medya ikonlarının yanında bulunan kalp ikonuna tıkla
    // Arama butonunun yanında bulunan kalp ikonuna tıklayıp ürünün wishlist'e eklendiğini doğrula


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
        page.userName1.sendKeys("Aysun", Keys.TAB, ConfigReader.getProperty("email1"),
                Keys.TAB, ConfigReader.getProperty("password1"),Keys.ENTER);
        extentTest.info("Username, email address ve password girildi");

//        "I agree to the privacy policy" tıklanmadan kayıt olunmadigini dogrula
        Assert.assertTrue(page.tickBoxAlert.isDisplayed());
        ReusableMethods.bekle(5);
        extentTest.info("I agree to the privacy policy tıklanmadan kayıt olunmadigini dogrulandi");

//        SIGN UP butonuna tıklayarak kayıt yap
        page.tickBox.click();
        page.singUp.click();
        ReusableMethods.bekle(8);
        extentTest.info("SIGN UP butonuna tıklayarak kayıt yapildi");
        ReusableMethods.bekle(2);

//        Arama butonundan ürün ara. "macbook"
        //page.searchBox.sendKeys("macbook",Keys.ENTER);
        ReusableMethods.sendKeysJS(page.searchBoxy,"macbook");
        ReusableMethods.click(page.searchBoxy);

        extentTest.info("Registera tiklandi");


//        Gelen ürünlerden herhangi birini seç.
        ReusableMethods.bekle(2);
        ReusableMethods.click(page.ilkUrun);
        extentTest.info("Gelen ürünlerden herhangi biri secildi");

        // Sosyal medya ikonlarının yanında bulunan kalp ikonuna tıkla
          ReusableMethods.bekle(2);
          ReusableMethods.click(page.kalpFavori);
          extentTest.info("Sosyal medya ikonlarının yanında bulunan kalp ikonuna tıklandı");
          ReusableMethods.bekle(2);


        // Arama butonunun yanında bulunan kalp ikonuna tıklayıp ürünün wishlist'e eklendiğini doğrula
         ReusableMethods.click(page.wishListFav);
        Assert.assertTrue(page.wishListUrun.isDisplayed());
        ReusableMethods.bekle(5);
        extentTest.info(" Arama butonunun yanında bulunan kalp ikonuna tıklayıp ürünün wishlist'e eklendiğini doğrulandı ");
    }
}