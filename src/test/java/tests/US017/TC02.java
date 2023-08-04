package tests.US017;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC02 extends ExtentReport {
    Page page=new Page();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US17_TC02","Vendor olarak Alisveris Yapma_Negatif Senaryo");

        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

        //sing in ol
        page.signInY.click();
        page.usernameV.sendKeys(ConfigReader.getProperty("emailAll"), Keys.TAB, ConfigReader.getProperty("passwordAll"));
        page.login.click();
        extentTest.info("allovercommerce sitesine Vendor olarak giris yapildi");
        ReusableMethods.bekle(2);

        //arama alanina aranacak urunu yaz, Arama ikonuna tikla
        page.searchBox.sendKeys(ConfigReader.getProperty("product"));
        ReusableMethods.bekle(2);
        page.searchIconY.click();
        extentTest.info("allovercommerce sitesinde pencil ürünü aratildi");
        ReusableMethods.bekle(2);

        //listelenen urunlerden birini sec
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.visibleWait(page.secilecekUrun,3);
        page.secilecekUrun.click();
        String secilenUrun=page.productNameBefore.getText();
        extentTest.info("Listenen ürünlerden biri secildi");
        ReusableMethods.bekle(2);

        //miktar sec
        page.quantityPlusInPage.click();
        extentTest.info("Secilen ürünün miktari arttirildi");
        //"add to cart" butonuna tikla
        page.addToCartButton.click();
        extentTest.info("Ürünler sepete eklendi");

        //cart'a tikla
        page.cartIcon.click();
        ReusableMethods.bekle(2);

        //"view cart" butonuna tikla
        page.viewChart.click();
        ReusableMethods.bekle(2);

        //sepeti goruntule
        //urunlerin gorundugunu dogrula
        Assert.assertEquals(secilenUrun,page.productName.getText());
        extentTest.pass("Secilen ürünlerin sepette oldugu dogrulandi");
        ReusableMethods.bekle(2);

        //Proceed to checkout butonuna tikla
        ReusableMethods.scroll(page.proceedCheckout);
        ReusableMethods.bekle(2);
        page.proceedCheckout.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.productName.isDisplayed());
        ReusableMethods.webElementResmi(page.productName);
        ReusableMethods.bekle(2);
        extentTest.pass("Cart-Checkout yapilarak alinacak ürünler görüntülendi");

        //Fatura icin doldurulmasi gereken alanlardan birini doldurup digerlerini bos birak
        page.firstNameY.clear();
        page.firstNameY.sendKeys(ConfigReader.getProperty("firstNameY"));
        page.lastNameY.clear();
        page.streetY.clear();
        page.cityY.clear();
        page.emailAdressY.clear();
        page.phoneNumY.clear();
        extentTest.info("Fatura ayrıntıları (BILLING DETAILS) kisminda sadece bir alan (First Name) dolduruldu");

        //Wire transfer/EFT veya Pay at the door seçeneklerinden birini sec
        ReusableMethods.bekle(6);
        if (page.wireEftY.isSelected()) {
            page.payAtDoorY.click();
        }
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.wireEftY.isEnabled() || page.payAtDoorY.isEnabled());
        ReusableMethods.tumSayfaResmi("Billing");
        extentTest.pass("Wire transfer/EFT veya Pay at the door seçeneklerinin secilebildigi dogrulandi");

        //place order butonuna tikla
        actions.keyDown(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(3);
        page.placeOrderY.click();
        extentTest.info("Place Order butonuna tiklandi");

        //islemin tamamlanmadigini dogrula
        //Zorunlu alanlarin her biri icin uyari yazisi göründügünü dogrula
        for (WebElement w:page.alertsList) {
            Assert.assertTrue(w.isDisplayed());
            System.out.println(w.getText());
        }
        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi("Uyarilar");
        extentTest.info("Zorunlu alanlardan doldurulmayan alanlar icin uyari yazilari görüntülendi");
        ReusableMethods.visibleWait(page.placeOrderY,6);
        Assert.assertTrue(page.placeOrderY.isEnabled());
        extentTest.pass("Zorunlu alanlarin hepsi doldurulmadigi icin alışverişin tamamlanamadigi dogrulandi");



    }


}
