package tests.US014;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static utilities.Driver.driver;


public class TC01_AddNewProductsPhoto extends ExtentReport {
    private JavascriptExecutor js;

    @Test
    public void Test01() throws IOException {

        //AlloverCommerce sayfasina git
        Driver.getDriver().get(ConfigReader.getProperty("url")); //https://allovercommerce.com/
        Page page = new Page();
        Driver.getDriver().findElement(By.xpath("//span[text()='Sign In']")).click();
        ReusableMethods.bekle(2);
        //Sign in ol
        page.signInUsername.sendKeys(ConfigReader.getProperty("emailSabit"));
        page.signInPassword.sendKeys(ConfigReader.getProperty("passwordSabit"));
        page.signInSubmit.click();
        //  extentTest.info("Siteye Vendor olarak giris yapildi");
        //Sirasi ile StoreManager, Products, Add New butonuna tikla
        ReusableMethods.bekle(2);
        page.signOutButonu.sendKeys(Keys.ENTER);
        page.storeManagerButton.click();
        ReusableMethods.bekle(2);
        page.productsButonu.click();
        ReusableMethods.bekle(2);
        page.addNewButonu.click();


        // Siteye urun fotografi ekle
        page.buyukResim.click();
        String dosyaYolu ="C:\\Users\\ENVY\\OneDrive\\Desktop\\topuklu ayakkabi.jpeg";
        File file = new File(dosyaYolu);
     //   String dosyaYolu2="C:\\Users\\ENVY\\OneDrive\\Desktop\\topuklu ayakkabi.jpeg";
      //  File file1= new File(dosyaYolu2);
        ReusableMethods.click(page.selectFilesButonu);
        ReusableMethods.uploadFile(dosyaYolu);
        ReusableMethods.bekle(10);
        ReusableMethods.tumSayfaResmi("buyukResim");
        page.selectBuyukResim.click();
       // ReusableMethods.alertAccept();
      Assert.assertTrue(page.buyukResim.isDisplayed());


     // ReusableMethods.bekle(2);
        page.kucukResim.click();
        page.kucukResimSec.click();
        page.addGalery2.click();

        //Simple Product, Variable Product, Grouped Product, External
        // - Affiliate Product seçenekleri gorunur oldugunu dogrula
        List<WebElement> allOptions =    driver.findElements(By.xpath("//select[@id='product_type']"));
        allOptions.stream().forEach(t-> System.out.println(t.getText()));
        //'Product Title' kutusuna ' topuklu ayakkabi' yaz
        ReusableMethods.scroll(page.productTitleBox);
        page.productTitleBox.sendKeys("Topuklu ayakkabi");
       ReusableMethods.bekle(2);
       //'Short Description' kutusuna "8 cm topuklu ayakkabi" yaz
        driver.switchTo().frame(page.shortDecrIframe);
       page.descriptionBox.sendKeys("8 cm topuklu ayakkabi", Keys.ENTER);
        driver.switchTo().defaultContent();
       // Description kisina aciklama yaz
        driver.switchTo().frame(page.iframe);
        page.descriptionBox.sendKeys("Bu topuklu ayakkabı günlük, ofis, Düğün, Kına, Nişan," +
            " Mezuniyet ve özel günlerinizde kombinlerinizi tamamlayarak size şıklığı sunuyor.",Keys.ENTER);
        driver.switchTo().parentFrame();
        ReusableMethods.bekle(3);
        //aaa' secenegine tikla,Category name' bolumune 'High Heel Shoes' ekle
        page.aaaTikla.click();
        page.addNewCategoryButonu.click();
        page.categoryNameKutusu.sendKeys("High Heel Shoes");
        page.addButonu1.click();
        ReusableMethods.bekle(2);
        ReusableMethods.alertAccept();
        ReusableMethods.bekle(2);
        // Baslik1' secenegine tikla, 'Products brand name' bolumune 'TopShoes' secenegini ekle
        page.baslikTikla.click();
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(page.addNewProductBrandsbutonu);
        ReusableMethods.bekle(2);
        page.addNewProductBrandsbutonu.click();
        page.brandNameKutusu.sendKeys("TopShoes", Keys.ENTER, Keys.CONTROL);
        page.addButonu2.click();
        ReusableMethods.bekle(2);
        ReusableMethods.alertAccept();
        //Yeni Urunun eklendigini dogrula
        ReusableMethods.scroll(page.submitButonu);
        page.submitButonu.click();

    }
}