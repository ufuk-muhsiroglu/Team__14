package tests.US019;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01_Musteri_Coupon_AlisVeris_Testi extends ExtentReport {

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US19_TC01", "Müsteri olarak Alisveris Yapma");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Page page = new Page();
        Actions actions = new Actions(Driver.getDriver());
        page.Us1920HomePagesignIn.click();
        ReusableMethods.bekle(2);
        page.Us1920UserName.sendKeys(ConfigReader.getProperty("Us1920CustomerEmail"));
        page.Us1920UserPassword.sendKeys(ConfigReader.getProperty("Us1920CustomerSifre"));
        page.Us1920signInButton.click();
        extentTest.info("allovercommerce sitesine Musteri olarak giris yapildi");
        ReusableMethods.bekle(3);
        page.Us1920SearchButton.sendKeys(ConfigReader.getProperty("Us1920VendorUrun"), Keys.ENTER);
        extentTest.info("allovercommerce sitesinde NEW CODE ürünü aratildi");
        page.Us1920UrunEkleButton.click();
        extentTest.info("Urun sepete eklendi");
        ReusableMethods.bekle(2);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(page.Us1920ItemVerification.isDisplayed());
        extentTest.info("Urun sepete eklendigi dogrulandi");
        ReusableMethods.webElementResmi(page.Us1920ItemVerification);
        page.Us1920CartButton.click();
        page.Us1920ViewCartButton.click();
        page.Us1920PlusItemButton.click();
        page.Us1920UpdateCartButton.click();
        softAssert.assertTrue(page.Us1920QuantityButton.getText().contains("2"));
        ReusableMethods.webElementResmi(page.Us1920QuantityButton);
        extentTest.info("Urun miktari arttigi dogrulandi");
        ReusableMethods.bekle(4);
        page.Us1920MinusItemButton.click();
        page.Us1920UpdateCartButton.click();
        softAssert.assertTrue(page.Us1920QuantityButton.getText().contains("1"));
        ReusableMethods.webElementResmi(page.Us1920QuantityButton);
        extentTest.info("Urun mitari azaldigi dogrulandi");
        ReusableMethods.bekle(4);
        page.Us1920EnterCoupon.sendKeys(ConfigReader.getProperty("Us1920CouponCode"));
        ReusableMethods.click (page.Us1920ApplyCouponButton);
        softAssert.assertTrue(page.Us1920CouponVerification.isDisplayed());
        extentTest.info("Kupon eklendigi dogrulandi");
        ReusableMethods.webElementResmi(page.Us1920CouponVerification);
        ReusableMethods.bekle(2);
        ReusableMethods.click (page.Us1920RemoveCouponButton);
        ReusableMethods.webElementResmi(page.RemoveCouponButton);
        ReusableMethods.bekle(2);
        softAssert.assertTrue(page.Us1920RemoveCouponVerification.isDisplayed());
        extentTest.info("Kupon cikarildigi dogrulandi");
        ReusableMethods.webElementResmi(page.Us1920RemoveCouponVerification);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click (page.Us1920CheckoutButton);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click (page.Us1920PaymentClick);
        ReusableMethods.webElementResmi(page.Us1920PaymentClick);
        extentTest.info("Odeme sayfasi dogrulandi");
        ReusableMethods.bekle(2);
        ReusableMethods.click (page.Us1920PlaceOrderButton);
        ReusableMethods.webElementResmi(page.Us1920PlaceOrderButton);
        extentTest.info("Siparis sayfasi dogrulandi");
        ReusableMethods.bekle(6);
        softAssert.assertTrue(page.Us1920OrderVerify.isDisplayed());
        extentTest.info("Siparis verildigi dogrulandi");
        ReusableMethods.webElementResmi(page.Us1920OrderVerify);

    }
}