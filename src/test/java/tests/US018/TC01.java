package tests.US018;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01 extends ExtentReport {
    Page page=new Page();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US18_TC01", "Vendor olarak Coupon olusturma");
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        page.signIn.click();
        page.usernameV.sendKeys(ConfigReader.getProperty("emailAll"), Keys.TAB, ConfigReader.getProperty("passwordAll"));
        page.login.click();
        extentTest.info("allovercommerce sitesine Vendor olarak giris yapildi");
        ReusableMethods.bekle(2);

        //SignOut/MyAccount butonuna tikla
        page.signOut.click();
        ReusableMethods.bekle(2);
        extentTest.info("My account sayfasina gidildi");

        //Store Manager Butonuna tikla
        page.storeManager.click();
        ReusableMethods.bekle(2);
        extentTest.info("Store Manager alanina gidildi");

        //coupons butonuna tikla
        Actions actions=new Actions(Driver.getDriver());
        //actions.keyDown(Keys.PAGE_DOWN).perform();
        //ReusableMethods.visibleWait(alloverPage.coupons, 5);
        // alloverPage.coupons.click();
        ReusableMethods.scroll(page.coupons);
        ReusableMethods.bekle(2);
        page.coupons.click();
        ReusableMethods.bekle(2);
        extentTest.info("Coupon olusturmak icin coupon butonuna tiklandi");

        //"add new" butonuna tikla
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.addNew.click();
        ReusableMethods.bekle(2);
        extentTest.info("Add New butonuna tiklandi");


        //code alanina kodu gir
        ReusableMethods.scroll(page.codeTitle);
        ReusableMethods.bekle(2);
        page.codeTitle.sendKeys(ConfigReader.getProperty("code"));
        Assert.assertEquals(page.codeTitle.getAttribute("value"), ConfigReader.getProperty("code"));
        ReusableMethods.webElementResmi(page.codeTitle);
        ReusableMethods.bekle(2);
        extentTest.pass("Code alanina code girilebildigi dogrulandi");

        //Description alanina description gir
        page.descriptionTitle.sendKeys(ConfigReader.getProperty("description"));
        Assert.assertEquals(page.descriptionTitle.getAttribute("value"), ConfigReader.getProperty("description"));
        ReusableMethods.webElementResmi(page.descriptionTitle);
        ReusableMethods.bekle(2);
        extentTest.pass("Description alanina description girilebildigi dogrulandi");

        //Discount Type alanina gel
        Select select1=new Select(page.discountType);
        Assert.assertTrue(page.discountType.isEnabled());
        extentTest.pass("Discount Type alaninin secilebilir oldugu dogrulandi");

        //Percentage discount alaninin veya Fixed Product Discount'dan birini sec
        select1.selectByIndex(0);
        Assert.assertEquals(select1.getFirstSelectedOption().getText(),"Percentage discount");
        extentTest.pass("Discount Type alaninda Percentage discount secilebildigi dogrulandi");
        select1.selectByIndex(1);
        Assert.assertEquals(select1.getFirstSelectedOption().getText(),"Fixed Product Discount");
        extentTest.pass("Discount Type alaninda Fixed Product Discount secilebildigi dogrulandi");
        ReusableMethods.webElementResmi(page.discountType);

        //Coupon Amount alanina deger gir
        actions.sendKeys(Keys.TAB,ConfigReader.getProperty("couponAmount"),Keys.TAB).perform();
        extentTest.info("Coupon amount alanina deger girildi");
        ReusableMethods.tumSayfaResmi("CouponAmount");

        //Coupon expiry date alanina tarih gir
        Select select2 =new Select(page.month);
        select2.selectByIndex(7);
        Select select3 =new Select(page.year);
        select3.selectByVisibleText("2023");
        page.day.click();
        Assert.assertEquals(page.expiryDate.getAttribute("value"), "2023-08-31");
        extentTest.pass("Coupon expiry date alanina tarih girilebildigi dogrulandi");
        ReusableMethods.webElementResmi(page.expiryDate);

        //Allow free shipping, Show on store kutularini sec
        Assert.assertTrue(page.freeship.isEnabled());
        extentTest.pass("Allow free shipping alaninin secilebilir oldugu dogrulandi");
        page.freeship.click();
        Assert.assertTrue(page.showOnStore.isEnabled());
        extentTest.pass("Show on store alaninin secilebilir oldugu dogrulandi");
        page.showOnStore.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);

        //Submit butonuna tikla
        page.couponSubmit.click();
        extentTest.info("Coupon olusturmak icin submit butonuna tiklandi");
        ReusableMethods.tumSayfaResmi("Coupon_Basarili_Yazisi");
        Assert.assertEquals(page.couponSucces.getText(),"Coupon Successfully Published.");
        extentTest.pass(" 'Coupon Successfully Published.' yazisinin görüldügü dogrulandi.");
        ReusableMethods.bekle(5);

        //Coupons butonuna tikla
        ReusableMethods.scroll(page.coupons);
        ReusableMethods.bekle(2);
        page.coupons.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);

        //Coupons olusturuldugu dogrulanmali
        Assert.assertEquals(page.couponCode.getText(),ConfigReader.getProperty("code"));
        extentTest.pass("Coupon listesinde ayni code ile coupon oldugu dogrulandi");
        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi("Coupon_Listesi");
        ReusableMethods.bekle(2);






    }

}
