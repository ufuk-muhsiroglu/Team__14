package tests.US004;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class TC02 extends ExtentReport {

//    Ana sayfaya git
//    Sign In butonuna tıkla
//    Username ve password girip giriş yap
//   "My Account" buttonunu tıkla
//   "Addresses" seçeneğini seç
//   "Shipping Adresses" bölümünün altındaki "ADD" butonunu tıkla
//   "Shipping Adresses", "First Name"kısmını boş bırak
//   "Shipping Adresses" , "Last Name" kısmını boş bırak
//   "Shipping Adresses" kısmından "Country" seçme
//   "Shipping Adresses", "Street Address" kısmını boş bırak
//   "Shipping Adresses", "Town / City" kısmını boş bırak
//   "Shipping Adresses", "State" seçme
//   "Shipping Adresses" , "Zip Code" kısmını boş bırak
//   "Shipping Adress"i kaydetmek için "Save Address" düğmesine tıkla
//   "Shipping Adress" bilgilerinin girilmeden "adres kaydedilmeyeceğini doğrula

    @Test
    public void test01() {
        extentTest = extentReports.createTest("Add Shipping Address 02", "Test Raporu");

//    go to the website

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        extentTest.info("Web sitesine giris yapildi. ");

//    Sign in your account

        Page page = new Page();
        page.signIn.click();
        page.userName.sendKeys(ConfigReader.getProperty("alloverUserName"),
                Keys.TAB, ConfigReader.getProperty("alloverPassword"), Keys.TAB, Keys.ENTER);
        extentTest.info("sing in yapildi. ");

//    Go to "myAccount"

        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        ReusableMethods.click(page.myAccountButton);
        extentTest.info("My account a tiklandi. ");

//    Make sure that user see the "Addresses" and Click the "Addresses

        Assert.assertTrue(page.addressesButton.isDisplayed());
        page.addressesButton.click();
        extentTest.info("Address butonu goruldugu dogrulandi ve tiklandi. ");

//    Click the shipping address "Edit" button under the shipping address

        WebElement yazi2 =page.editShippingAddress;
        ReusableMethods.scroll(yazi2);
        ReusableMethods.bekle(2);
        page.editShippingAddress.click();
        extentTest.info("Shipping Edit butonu goruldu ve tiklandi. ");

//    clear your first name on "First name " section

        page.shippingFirstName.clear();
        ReusableMethods.bekle(2);
        extentTest.info("First name blogu temizledi. ");

//    clear your lastname on "Last name " section

        page.shippingLastName.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Last name blogu temizlendi. ");

//    clear your street addres on "Street address " section

        page.shippingStreetBox.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Street adres blogu temizlendi. ");

//    clear your town  on "Town/City" section
        page.shippingTownBox.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Town blogu temizlendi. ");

//    enter your Zip Code on "Postcode/Zip*" section
        page.shippingZipCode.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Postcode blogu temizlendi. ");

//    Click the "SAVE ADDRESS" button

        WebElement shippingAddress = page.shippingSubmit;
        ReusableMethods.click(shippingAddress);
        ReusableMethods.bekle(2);
        extentTest.info("Save address butonuna tuklandi. ");


//    Make sure that user can see the "Mistake Reports" after click the save address button

        ReusableMethods.scroll(page.shippingFirstNameAllert);
        Assert.assertTrue(page.shippingFirstNameAllert.isDisplayed());
        Assert.assertTrue(page.shippingLastNameAllert.isDisplayed());
        Assert.assertTrue(page.shippingAddressAllert.isDisplayed());
        Assert.assertTrue(page.shippingCityAdressAllert.isDisplayed());
        Assert.assertTrue(page.shippingPostcodeAllert.isDisplayed());

        extentTest.info("Mistake raports alindindigi dogrulandi. ");

        ReusableMethods.tumSayfaResmi("04", "Shipping Adress zorunlu doldurulmasi gereken bilgiler girilmeden kayıt yapılamadi. ");

    }
}

