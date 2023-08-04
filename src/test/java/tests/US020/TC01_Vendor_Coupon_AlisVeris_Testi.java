package tests.US020;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01_Vendor_Coupon_AlisVeris_Testi extends ExtentReport {

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US20_TC01", "Vendor olarak Alisveris Yapma");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Page page = new Page();
        Actions actions = new Actions(Driver.getDriver());
        page.SignIn1.click();
        ReusableMethods.bekle(2);
        page.SignInUserName.sendKeys(ConfigReader.getProperty("Email1"));
        page.SignInEmail.sendKeys(ConfigReader.getProperty("Sire1"));
        page.SubmitSignIn.click();
        extentTest.info("allovercommerce sitesine Vendor olarak giris yapildi");
        ReusableMethods.bekle(2);
        page.SearchBox.sendKeys(ConfigReader.getProperty("Urn1"), Keys.ENTER);
        extentTest.info("allovercommerce sitesinde NEW CODE ürünü aratildi");
        page.Arti1.click();
        ReusableMethods.bekle(2);
        page.AddToCartButton.click();
        extentTest.info("Urun sepete eklendi");
        ReusableMethods.webElementResmi(page.AddToCartButton);
        ReusableMethods.bekle(2);
        page.CartBox.click();
        ReusableMethods.bekle(2);
        page.CheckoutButton.click();
        extentTest.info("Sepet Guncellendi");
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.Billing.isDisplayed());
        ReusableMethods.webElementResmi(page.Billing);
        extentTest.info("Fatura Bilgileri dogrulandi");
        ReusableMethods.bekle(2);
        page.EnterYourCodeClick.click();
        ReusableMethods.bekle(2);
        page.EnterYourCode.sendKeys(ConfigReader.getProperty("Coupon1"));
        page.ApplyCouponButton.click();
        extentTest.info("Kupon eklendi");
        ReusableMethods.webElementResmi(page.ApplyCouponButton);
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.ApplyCouponSubmit.isDisplayed());
        ReusableMethods.bekle(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click (page.RemoveCouponButton);
        extentTest.info("Kupon cikarildi");
        ReusableMethods.webElementResmi(page.RemoveCouponButton);
        Assert.assertTrue(page.ApplyCouponSubmit.isDisplayed());
        ReusableMethods.webElementResmi(page.ApplyCouponSubmit);
        extentTest.info("Kupon tekrar eklendi");
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.click (page.PlaceOrderClick);
        ReusableMethods.bekle(6);
        Assert.assertTrue(page.ThankYouVerify.isDisplayed());
        ReusableMethods.webElementResmi(page.ThankYouVerify);
        extentTest.info("Siparis alindigi dogrulandi");
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.click (page.MyOrderClick);
        ReusableMethods.bekle(2);
        ReusableMethods.click (page.ViewClick);
        Assert.assertTrue(page.OrderDetail.isDisplayed());
        ReusableMethods.webElementResmi(page.OrderDetail);
        extentTest.info("Siparis detayi dogrulandi");


    }
}
