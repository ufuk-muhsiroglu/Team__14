package tests.US004;


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


public class TC01 extends ExtentReport {

//    go to the home page
//    log in your account
//    Go to "myAccount" and Click the "Addresses"
//    Click the shipping address "ADD->" button under the shipping address
//    do not enter your first name on "First name * " section
//    enter your lastname on "Last name * " section
//    Select your contry/region on "Country/Region *" selection or Write your Country by hand
//    enter your street addres on "Street address " section
//    enter your town  on "Town/City" section
//    select your State on "State *" section
//    enter your Zip Code on "Postcode/Zip*" section
//    Click the "SAVE ADDRESS" button
//    Make sure that user can see the "First name is a required field." after click the save address button

    @Test
    public void test01() {
        extentTest = extentReports.createTest("Add Shipping Address 01", "Test Raporu");

//    go to the website

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        extentTest.info("Web sitesine giris yapildi. ");

//    Sign in your account

        Page page = new Page();
        page.signIn.click();
        page.userName.sendKeys(ConfigReader.getProperty("alloverUserName"),
                Keys.TAB, ConfigReader.getProperty("alloverPassword"), Keys.TAB, Keys.ENTER);
        extentTest.info("sign in yapildi. ");


//    Go to "myAccount"

        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
        ReusableMethods.click(page.myAccountButton);
        extentTest.info("My account a tiklandi. ");

//    Make sure that user see the "Addresses" and Click the "Addresses

        Assert.assertTrue(page.addressesButton.isDisplayed());
        page.addressesButton.click();
        extentTest.info("Address butonu goruldugu dogrulandi ve tiklandi. ");

//    Make sure you have an "ADD->" button under Shipping Address

        Assert.assertTrue(page.shippingAddButton.isDisplayed());
        page.shippingAddButton.click();
        extentTest.info("Shipping Add butonu goruldugu dogrulandi ve tiklandi. ");

//    Make sure that user can see the "Shipping address" writing on the page

        Assert.assertTrue(page.shippingStreetBox.isDisplayed());
        extentTest.info("Shipping address sayfasinda olundugu dogrulandi. ");

//    enter yor first name on "First name " section
//    enter your lastname on "Last name " section
//    enter your street addres on "Street address " section
//    enter your town  on "Town/City" section
//    enter your Zip Code on "Postcode/Zip*" section

        page.shippingFirstName.sendKeys("ali", Keys.TAB, "kerim", Keys.TAB,
                Keys.TAB, Keys.TAB, "fgdshjsdk", Keys.TAB, Keys.TAB, "gfdkkj", Keys.TAB, Keys.TAB + "1234");
        extentTest.info("First name, Last name, Street address, Town, Postcode ve Phone bilgileri girildi.");

//    Select your country/region on "Country/Region " selection
        WebElement countrySelect = page.shippingCountrySelect;
        Select select = new Select(countrySelect);
        select.selectByVisibleText("Australia");
        extentTest.info("Country secildi. ");

//    select your State on "State " section

        WebElement stateSelect = page.shippingStateSelect;
        Select select1 = new Select(stateSelect);
        select1.selectByIndex(4);
        ReusableMethods.bekle(2);
        extentTest.info("State secildi. ");

//    Click the "SAVE ADDRESS" button

        page.shippingSubmit.click();
        ReusableMethods.bekle(2);
        extentTest.info("Save address butonuna tiklandi. ");

//    Make sure that user can see the "Address changed successfully." after click the save address button
        Assert.assertTrue(page.shippingAlert.getText().contains("Address changed successfully."));
        extentTest.info("Shipping address basariyla kaydedildigi dogrulandi.");

        ReusableMethods.tumSayfaResmi("04", "Shipping Adress eklendi. ");

    }
}

