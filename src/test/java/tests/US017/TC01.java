package tests.US017;

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
        extentTest = extentReports.createTest("US17_TC01","Vendor olarak Alisveris Yapma");
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
        page.searchIcon.click();
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
        extentTest.info("Checkout yapildi");
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.productName.isDisplayed());
        ReusableMethods.webElementResmi(page.productName);
        ReusableMethods.bekle(2);
        extentTest.pass("Cart-Checkout yapilarak alinacak ürünlerin görüntülendigi dogrulandi");

        //Fatura ayrıntıları (BILLING DETAILS) doldurulabilmeli
        //"first name" alanina first name gir
        //"last name" alanina last name gir
        page.firstName.clear();
        page.firstName.sendKeys(ConfigReader.getProperty("firstNameY"),Keys.TAB, ConfigReader.getProperty("lastNameY"),Keys.TAB,Keys.TAB);

        //"country/region" alanina country gir
        Select select=new Select(page.country);
        select.selectByVisibleText("Turkey");

        //"Street address" alanina address gir
        //"Town/city" alanina city gir
        //"Zip code" alanina Zip code gir
        page.street.clear();
        page.street.sendKeys(ConfigReader.getProperty("streetAdress"), Keys.TAB,Keys.TAB,
                ConfigReader.getProperty("postCode"), Keys.TAB, ConfigReader.getProperty("cityName"),Keys.TAB);

        //"Province " alanina province gir
        Select select2=new Select(page.province);
        select2.selectByVisibleText(ConfigReader.getProperty("provinceName"));
        //"Phone" alanina phone gir
        page.phoneNum.clear();
        page.phoneNum.sendKeys(ConfigReader.getProperty("phone"));
        ReusableMethods.bekle(2);
        //"Email " alanina email gir
        page.emailAdress.clear();
        page.emailAdress.sendKeys(ConfigReader.getProperty("emailAll"));
        extentTest.info("Fatura ayrıntıları (BILLING DETAILS) dolduruldu");

        //toplam rakamin gorundugunu dogrula
        Assert.assertTrue(page.total.isDisplayed());
        ReusableMethods.webElementResmi(page.total);
        extentTest.pass("Toplam ödenecek rakamin görüntülenebildigi dogrulandi");

        //Wire transfer/EFT veya Pay at the door seçeneklerinden birini sec
        ReusableMethods.bekle(3);
        page.payAtDoor.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.wireEft.isEnabled() || page.payAtDoor.isEnabled());
        ReusableMethods.tumSayfaResmi("Billing");
        extentTest.pass("Wire transfer/EFT veya Pay at the door seçeneklerinin secilebildigi dogrulandi");

        //Place Ordera tikla
        actions.keyDown(Keys.PAGE_DOWN);
        ReusableMethods.bekle(3);
        page.placeOrder.click();
        ReusableMethods.bekle(15);
        //islemin tamamlandigini dogrula
        Assert.assertTrue(page.succesOrder.isDisplayed());
        ReusableMethods.webElementResmi(page.succesOrder);
        extentTest.pass("Place Order'a tıklanarak alışverişin basarili bir sekilde tamamlandigi dogrulandi");

        //SignOut/MyAccount butonuna tikla
        page.signOut.click();
        ReusableMethods.bekle(5);
        //orders butonuna tikla
        ReusableMethods.visibleWait(page.orders,5);
        page.orders.click();
        ReusableMethods.bekle(2);
        //alisverise ait view butonuna tikla
        page.view.click();
        ReusableMethods.bekle(2);
        //bilgilerin goruntulendigini dogrula
        ReusableMethods.scroll(page.orderDetailsPage);
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.orderDetailsPage.isDisplayed());
        extentTest.pass("My Account -Orders ile yapılan alışverişin ayrıntılarınin görüntülendigi dogrulandi");
        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.tumSayfaResmi("OrderDetails");

        //Assert.assertEquals(alloverPage.total.getText(),alloverPage.lastTotal.getText());











    }

}
