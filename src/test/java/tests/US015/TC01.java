package tests.US015;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.List;
import static utilities.ReusableMethods.ddmVisibleText;


public class TC01 {

    Page page = new Page();
    Actions actions = new Actions(Driver.getDriver());
    String dosyaYolu = System.getProperty("user.home") + "/Desktop/indir.jpg";

    @Test
    public void testCase01() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.signIn.click();
        page.usernameV.sendKeys(ConfigReader.getProperty("vendorEmail"));
        page.signPassword.sendKeys(ConfigReader.getProperty("vendorpassword"));
        page.signInButton.click();
        page.out.click();
        Assert.assertTrue(page.storeManager.isDisplayed());
        page.storeManager.click();
        Assert.assertTrue(page.products.isDisplayed());
        ReusableMethods.scroll(page.products);
        ReusableMethods.bekle(1);
        actions.moveToElement(page.products).perform();
        page.addNew.click();
        Assert.assertTrue(page.inventory.isDisplayed());
        ReusableMethods.tumSayfaResmi("TC01-01");
        Assert.assertTrue(page.shipping.isDisplayed());
        ReusableMethods.tumSayfaResmi("TC01-02");
        Assert.assertTrue(page.attributes.isDisplayed());
        ReusableMethods.tumSayfaResmi("TC01-03");
        Assert.assertTrue(page.linked.isDisplayed());
        ReusableMethods.tumSayfaResmi("TC01-04");
        Assert.assertTrue(page.seo.isDisplayed());
        ReusableMethods.tumSayfaResmi("TC01-05");
        Assert.assertTrue(page.advanced.isDisplayed());
        ReusableMethods.tumSayfaResmi("TC01-06");


    }

    @Test
    public void testCase02() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.signIn.sendKeys(ConfigReader.getProperty("vendorEmail"));
        page.signIn.sendKeys(ConfigReader.getProperty("vendorpassword"));
        page.signInButton.click();
        page.out.click();
        Assert.assertTrue(page.myAccountYazisi.isDisplayed());
        Assert.assertTrue(page.storeManager.isDisplayed());
        page.storeManager.click();
        Assert.assertTrue(page.products.isDisplayed());
        actions.moveToElement(page.products).perform();
        page.addNew.click();
        page.ProductTitle.sendKeys("canta");
        page.PictureAdd.click();
        page.selectFilesbutton.click();
        page.selectFilesbutton.sendKeys(dosyaYolu);
        page.pictureAdd2.click();
        page.librarypicture.click();
        page.addToGalleryButton.click();
        ReusableMethods.tumSayfaResmi("TC02-01");


        page.bags.click();
        ReusableMethods.scroll(page.inventory);
        page.sku.sendKeys("10");
        page.managestockbutton.click();
        page.stockQty.sendKeys("20");
        page.soldIndividuallybutton.click();
        page.submitButton.click();
        page.allowBackordersAllow.click();
        page.soldIndividuallybutton.click();
        page.submitButton.click();
        page.products.click();
        Assert.assertTrue(page.urun1.isDisplayed());
        ReusableMethods.tumSayfaResmi("TC02-02");
    }

    @Test
    public void testCase03() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.signIn.click();
        page.usernameV.sendKeys(ConfigReader.getProperty("vendorEmail"));
        page.signPassword.sendKeys(ConfigReader.getProperty("vendorpassword"));
        page.signInButton.click();
        page.out.click();
        Assert.assertTrue(page.myAccountYazisi.isDisplayed());
        Assert.assertTrue(page.storeManager.isDisplayed());
        page.storeManager.click();
        ReusableMethods.scroll(page.products);
        Assert.assertTrue(page.products.isDisplayed());
        page.products.click();
        ReusableMethods.bekle(3);
        ReusableMethods.scroll(page.addNew);
        page.addNew.click();
        ReusableMethods.scroll(page.scroll7Things);
        ReusableMethods.bekle(3);
        Driver.getDriver().findElement(By.xpath("//*[@id='sku']")).sendKeys("rümeysa0125462");
        page.managestockbutton.click();
        page.stockQty.sendKeys("4562");
        Select select = new Select(page.allowBackordersAllow);
        select.selectByIndex(2);
        page.soldIndividuallybutton.click();
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("TC_03_01");
        page.submitButton.click();
        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi("TC_03_02");
        actions.moveToElement(page.addNew).perform();
        page.productTitle.sendKeys("ayakkabı", Keys.ENTER);
        page.resimEkle.click();
        page.ayakkabiResmi.click();
        page.selectButonu.click();
        page.katagoriAyakkabi.click();
        page.inventory.click();
        page.sku.sendKeys("256");
        Select select1 = new Select(page.stockStatus);
        select1.selectByVisibleText("onbackorder");
        page.submitButton.click();
        ReusableMethods.scroll(page.products);
        page.products.click();
        Assert.assertTrue(page.productAyakkabiResmi.isDisplayed());
        Assert.assertTrue(page.productStokDurumu.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Test
    public void TestCase04() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        page.signIn.click();
        page.usernameV.sendKeys(ConfigReader.getProperty("vendorEmail"));
        page.signPassword.sendKeys(ConfigReader.getProperty("vendorpassword"));
        page.signInButton.click();
        page.out.click();
        Assert.assertTrue(page.myAccountYazisi.isDisplayed());
        Assert.assertTrue(page.storeManager.isDisplayed());
        page.products.click();
        page.addNew.click();
        page.scroll7Things.click();
        ReusableMethods.bekle(3);
        page.shipping.click();
        page.shippingWeight.sendKeys("90");
        page.shippingdimensionsLength.sendKeys("120");
        page.shippingdimensionswidth.sendKeys("45");
        page.shippingdimensionsHeight.sendKeys("35");
        String expectedddm="No shipping class";
        String actualddm = page.ddmShippingShippingClass.getText();
        Assert.assertEquals(actualddm,expectedddm);
        Select select2=new Select(page.ddmShippingProcessingTime);
        List<WebElement> times = select2.getOptions();
        for (WebElement time:times) {
            ddmVisibleText(page.ddmShippingProcessingTime, time.getText());
        }
        ddmVisibleText(page.ddmShippingProcessingTime,"1-2 weeks");
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("TC04-01");

    }
}
