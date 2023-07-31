package tests.US003;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class TC04 extends ExtentReport {

//    Ana sayfaya git
//    Sign In butonuna tıkla
//    Username ve password girip giriş yap
//    "My Account" buttonunu tıkla
//    "Addresses" seçeneğini seç
//    "Billing Adresses" bölümünün altındaki "ADD" butonunu tıkla
//    "Billing Adresses" kısmına "First Name"in otomatik geldiğini doğrula
//    "Billing Adresses" kısmına "Last Name"in otomatik geldiğini doğrula
//    "Billing Adresses" kısmından "Country"seç
//    "Billing Adresses" kısmına "Street address"gir
//    "Billing Adresses" kısmına "Town / City"gir
//    "Billing Adresses" kısmına "State"gir
//    "Billing Adresses" kısmına "Zip Code"gir
//    "Billing Adresses" kısmına "Phone" gir
//    Kayıtlı e-posta adresini boş bırak veya mail adresine uygun olmayan veri gir
//    "Billing Adress"i kaydetmek için "Save Address" düğmesine tıkla
//    Geçerli mail adresi girilmeden "Billing Adress" kaydedilmeyeceğini doğrula


    @Test
    public void test01() {

        extentTest = extentReports.createTest("Add Shipping Address 03", "Test Raporu");


//    go to the website

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        extentTest.info("Web sitesine giris yapildi. ");

//    Sing in your account

        Page sourcePage = new Page();
        sourcePage.signIn.click();
        sourcePage.userName.sendKeys(ConfigReader.getProperty("alloverUserName"),
                Keys.TAB, ConfigReader.getProperty("alloverPassword"), Keys.TAB, Keys.ENTER);
        extentTest.info("sing in yapildi. ");

//    Go to "myAccount"

        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        ReusableMethods.click(sourcePage.myAccountButton);
        extentTest.info("My account a tiklandi. ");

//    Make sure that user see the "Addresses" and Click the "Addresses

        Assert.assertTrue(sourcePage.addressesButton.isDisplayed());
        sourcePage.addressesButton.click();
        extentTest.info("My account a tiklandi. ");
        extentTest.info("Adres butonu goruldugu dogrulandi ve tiklandi. ");

//    Make sure you have an "ADD->" button under Billing Address

        Assert.assertTrue(sourcePage.billingAddButton.isDisplayed());
        sourcePage.billingAddButton.click();
        extentTest.info("Billing Add butonu goruldugu dogrulandi ve tiklandi. ");

//    Make sure that user can see the "Billing address" writing on the page

        Assert.assertTrue(sourcePage.billingAddressWriting.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Billing address sayfasinda olundugu dogrulandi. ");

//    check yor first name on "First name" section

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

        sourcePage.billingStreet.sendKeys("fgdshjsdk", Keys.TAB, Keys.TAB, "gfdkkj",
                Keys.TAB, Keys.TAB+ "1234", Keys.TAB, "123456789");
        extentTest.info("Street address, Town, Postcode ve Phone bilgileri girildi.");
        ReusableMethods.bekle(2);

//    Select your contry/region on "Country/Region" selection
        WebElement countrySelect = sourcePage.billingCountrySelect;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Australia");
        extentTest.info("Country secildi. ");

//    select your State on "State" section

        WebElement stateSelect = sourcePage.billingStateSelect;
        Select select1 = new Select(stateSelect);
        select1.selectByIndex(4);
        ReusableMethods.bekle(2);
        extentTest.info("State secildi. ");


//   Make sure that the email address has no '@'

        ReusableMethods.sendKeysJS(sourcePage.billingEmail, ConfigReader.getProperty("wrongEmailAddress"));
        ReusableMethods.bekle(2);

//    Click the "SAVE ADDRESS" button

        sourcePage.billingSubmit.click();
        ReusableMethods.bekle(2);
        extentTest.info("Save address butonuna tiklandi. ");

//    Make sure that user can see the "Mistake Reports" after click the save address button

        ReusableMethods.tumSayfaResmi("03","Email adresi invalid uyarisi alindi. ");

    }
}