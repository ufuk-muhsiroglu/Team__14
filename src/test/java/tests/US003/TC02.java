package tests.US003;


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
//    "My Account" buttonunu tıkla
//    "Addresses" seçeneğini seç
//    "Billing Adresses" bölümünün altındaki "ADD" butonunu tıkla
//    "Billing Adresses", "First Name"kısmını boş bırak
//    "Billing Adresses" , "Last Name" kısmını boş bırak
//    "Billing Adresses" kısmından "Country" seçme
//    "Billing Adresses", "Street Address" kısmını boş bırak
//    "Billing Adresses", "Town / City" kısmını boş bırak
//    "Billing Adresses", "State" seçme
//    "Billing Adresses" , "Zip Code" kısmını boş bırak
//    "Billing Adresses" ,"Phone"gir kısmını boş bırak
//    Kayıtlı e-posta adresini otomatik olarak görüntüle
//    "Billing Adress"i kaydetmek için "Save Address" düğmesine tıkla
//    "Billing Adress" bilgilerinin girilmeden "adres kaydedilmeyeceğini doğrula


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

//    Make sure that user see the "Addresses" and Click the "Addresses"

        Assert.assertTrue(page.addressesButton.isDisplayed());
        page.addressesButton.click();
        extentTest.info("Adres butonu goruldugu dogrulandi ve tiklandi. ");

//    Click the shipping address "Edit" button under the shipping address

        WebElement yazi = page.editBillingAddress;
        ReusableMethods.scroll(yazi);
        ReusableMethods.bekle(2);
        page.editBillingAddress.click();
        extentTest.info("Billing Edit butonuna tiklandi. ");

//    clear first name on "First name " section

        page.billingFirstName.clear();
        ReusableMethods.bekle(2);
        extentTest.info("First name blogu temizledi. ");

//    clear lastname on "Last name * " section

        page.billingLastName.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Last name blogu temizlendi. ");

//    clear street addres on "Street address " section

        page.billingStreet.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Street adres blogu temizlendi. ");

//    clear town  on "Town/City" section

        page.billingCityTown.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Town blogu temizlendi. ");

//    clear Zip Code on "Postcode/Zip" section

        page.billingPostCode.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Postcode blogu temizlendi. ");

//     clear phone number on "Phone number" section

        page.billingPhone.clear();
        ReusableMethods.bekle(2);
        extentTest.info("Phone number blogu temizlendi. ");

//    Click the "SAVE ADDRESS" button

        WebElement billingAddressEnter = page.billingSubmit;
        ReusableMethods.click(billingAddressEnter);
        ReusableMethods.bekle(2);
        extentTest.info("Save address butonuna tuklandi. ");


//    Make sure that user can see the "Mistake Reports" after click the save address button

        ReusableMethods.scroll(page.billingFirstNameAllert);
        Assert.assertTrue(page.billingFirstNameAllert.isDisplayed());
        Assert.assertTrue(page.billingLastNameAllert.isDisplayed());
        Assert.assertTrue(page.billingStreetAddressAllert.isDisplayed());
        Assert.assertTrue(page.billingCityAdressAllert.isDisplayed());
        Assert.assertTrue(page.billingPostcodeAllert.isDisplayed());
        Assert.assertTrue(page.billingPhoneAllert.isDisplayed());
        extentTest.info("Mistake raports alindindigi dogrulandi. ");

        ReusableMethods.tumSayfaResmi("03", "Billing Adress bilgileri girilmeden kayıt yapılamadi. ");


    }
}