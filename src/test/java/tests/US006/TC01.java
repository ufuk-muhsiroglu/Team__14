package tests.US006;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;
public class TC01 extends ExtentReport {
    @Test
    public void birinci() {
        extentTest=extentReports.createTest("Extent Report","Test Raporu");
        //1 Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl")) ;
        extentTest.info("allovercommerce sitesine gidildi");
        //2 Arama kutusuna tıklanır
        Page page =new Page();
        page.searchBox.click();
        extentTest.info("Arama kutusuna tıklandi");
        //3 kazak aratılır
        page.searchBox.sendKeys("Kazak", Keys.ENTER);
        extentTest.info("kazak aratıldi");
        //4 resim tıklanir
        ReusableMethods.click(page.resimSec);
        extentTest.info("resim tıklandi");
        //5 add to cart tıklanır
        ReusableMethods.scroll(page.addToCartButton);
        ReusableMethods.bekle(3);
        ReusableMethods.click(page.addToCartButton);
        extentTest.info("add to cart tıklandi");
        //6 cart butonu tıklanır
        ReusableMethods.click(page.cartIcon);
        extentTest.info("cart butonu tıklandi");
        //7 view Chart butonu tıklanir
        ReusableMethods.click(page.viewChart);
        extentTest.info("view Chart butonu tıkladi");
        //8 plus butonu tiklanir
        ReusableMethods.bekle(3);
        ReusableMethods.click(page.quantityPlusInPage);
        extentTest.info("plus butonu tiklandi");
        //9 update butonu tiklanir
        ReusableMethods.bekle(3);
        ReusableMethods.click(page.updateCart);
        extentTest.info("update butonu tiklandi");
        //10 cart butonu tiklanir ve arttigi dogrulanir
        ReusableMethods.bekle(3);
        System.out.println(page.cartIcon.getText());
        ReusableMethods.bekle(5);
        //Assert.assertTrue(page.cartIcon.getText().contains("2"));
        extentTest.info("cart butonu tiklandi");
        //11 minus butonu tıklanir
        ReusableMethods.bekle(3);
        ReusableMethods.click(page.minus);
        extentTest.info("minus butonu tıklandi");
        //12 update cart butonuna tıklanır
        ReusableMethods.click(page.updateCart);
        extentTest.info("update cart butonuna tıklandi");
        ReusableMethods.bekle(5);
        //13 cart butonuna azaldigi dogrulanir
        ReusableMethods.bekle(3);
        System.out.println(page.cartIcon.getText());
        ReusableMethods.bekle(5);
        Assert.assertTrue(page.cartIcon.getText().contains("1"));
        extentTest.info("cart butonuna azaldigi dogrulandi");
        //14 proceed checkout tıklanir
        ReusableMethods.scroll(page.proceedCheckout);
        ReusableMethods.click(page.proceedCheckout);
        extentTest.info("proceed checkout tıklandi");
        //15-16 Name ve Last name gir
        ReusableMethods.bekle(2);
        page.billingName.click();
        page.billingName.sendKeys(ConfigReader.getProperty("addresseName"), Keys.TAB,ConfigReader.getProperty("addresseLastName"));
        extentTest.info("Name ve Last name girildi");
        //17 contry secilir
        ReusableMethods.ddmValue(page.billingCountry,"DE");
        extentTest.info(" contry secildi");
        //18 Adres  gir
        page.billingStreet.sendKeys(ConfigReader.getProperty("addresseStreet"));
        extentTest.info("Adres  girildi");
        //19 ZIP Code gir
        page.billingZIP.sendKeys(ConfigReader.getProperty("billingZIP"));
        extentTest.info("ZIP Code girildi");
        //20 Town girilir
        page.billingTown.sendKeys(ConfigReader.getProperty("addresseTown"));
        extentTest.info("Town girildi");
        //21 fone girilir
        page.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
        extentTest.info("fone girildi");
        ReusableMethods.bekle(2);
        //22 email girilir
        page.billingEmail1.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("email girildi");
        //23 payment tıklanir
        page.paymentMethods.click();
        extentTest.info(" payment tıklandi");
        //24 place order butonu tıklanir
        page.placEOrder.click();
        extentTest.info("place order butonu tıklandi");
        //25 ALisveris tamamlanigini test  eder
        System.out.println(page.thanks.getText());
        Assert.assertTrue(page.thanks.getText().contains("Thank you. Your order has been received."));
        extentTest.info("ALisveris tamamlandi");
    }
}
