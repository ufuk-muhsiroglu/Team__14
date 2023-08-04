package tests.US008;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



public class TC03 extends TestBaseRapor{

   //    Ana sayfaya git.
  //   Register a tıkla
  //   Username gir
  //   Geçerli e-mail adresi gir
  //   Kucuk harf, büyük harf, rakam ve special karakter içeren Password gir
  //   "I agree to the privacy policy" tıklanmadan kayıt olunmamalı
  //   SIGN UP butonuna tıklayarak kayıt yapılmalı
  //  Wishlist deki beğenilen ürünün en sağ kısmındaki ADD TO CARD butonuna tıkla.
  //  Arama butonun sağ kısmında bulunan Cart butonuna tıkla.
  //  Açılan Pencerede CHECKOUT butonuna tıkla.
  //  Açılan yeni sayfada fatura bilgilerini doldur
  //  Aynı sayfada PLACE ORDER butonuna tıkla.
  //  Sayfada Thank you. Your order has been received. yazısının göründüğünü doğrula.

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
        extentTest.info("\"I agree to the privacy policy\" tıklanmadan kayıt olunmadigini dogrulandi");

//        SIGN UP butonuna tıklayarak kayıt yap
        page.tickBox.click();
        page.singUp.click();
        ReusableMethods.bekle(8);
        extentTest.info("SIGN UP butonuna tıklayarak kayıt yapildi");

       //  Wishlist deki beğenilen ürünün en sağ kısmındaki ADD TO CARD butonuna tıkla.


 //  Arama butonun sağ kısmında bulunan Cart butonuna tıkla.



//      Açılan Pencerede CHECKOUT butonuna tıkla.




        //FAtura bilgileri
       //   check yor first name on "First name" section

        String ddmFirstName = ReusableMethods.getValueByJSR("billing_first_name","value");
        Assert.assertEquals(ConfigReader.getProperty("firstName"),ddmFirstName);
        extentTest.info("Fist name otomatik geldigi dogrulandi. ");

//    check your lastname on "Last name" section

        String ddmLastName = ReusableMethods.getValueByJSR("billing_last_name","value");
        Assert.assertEquals(ConfigReader.getProperty("lastName"),ddmLastName);
        extentTest.info("Last name otomatik geldigi dogrulandi. ");

//    enter your street address on "Street address " section
//    enter your town  on "Town/City" section
//    enter your Zip Code on "Postcode/Zip*" section

        page.billingStreet.sendKeys("fgdshjsdk", Keys.TAB, Keys.TAB, "gfdkkj",
                Keys.TAB, Keys.TAB+ "1234", Keys.TAB, "123456789");
        extentTest.info("Street address, Town, Postcode ve Phone bilgileri girildi.");
        ReusableMethods.bekle(2);

//    Select your contry/region on "Country/Region" selection
        WebElement countrySelect = page.billingCountrySelect;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Australia");
        extentTest.info("Country secildi. ");

//    select your State on "State" section

        WebElement stateSelect = page.billingStateSelect;
        Select select1 = new Select(stateSelect);
        select1.selectByIndex(4);
        ReusableMethods.bekle(2);
        extentTest.info("State secildi. ");


//   Make sure that the email address has no '@'

        ReusableMethods.sendKeysJS(page.billingEmail, ConfigReader.getProperty("wrongEmailAddress"));
        ReusableMethods.bekle(2);

//    Click the "SAVE ADDRESS" button

        page.billingSubmit.click();
        ReusableMethods.bekle(2);
        extentTest.info("Save address butonuna tiklandi. ");

        //  Aynı sayfada PLACE ORDER butonuna tıkla.



        //  Sayfada Thank you. Your order has been received. yazısının göründüğünü doğrula.
    }
}