package tests.US013;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC01_VendorAdresKaydi extends ExtentReport {

    @Test
    public void AddAddressAsVendor() throws IOException {
        extentTest = extentReports.createTest("US13_TC01","Addphotoproducts ");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Page page = new Page();
        Driver.getDriver().findElement(By.xpath("//span[text()='Sign In']")).click();
        ReusableMethods.bekle(2);
        page.signInUsername.sendKeys(ConfigReader.getProperty("sabitEmail"));
        page.signInPassword.sendKeys(ConfigReader.getProperty("sabitPassword"));
        page.signInSubmit.click();
      // extentTest.info("Siteye Vendor olarak giris yapildi");
        page.signOutButton.click();
        page.adresler.click();
      //  extentTest.info("Addresses butonu tıklandı.");
        ReusableMethods.scroll(page.editShipping);
        page.editShipping.click();
        extentTest.info("Shipping Address butonu tıklandı.");
        page.firstName.clear();
        page.firstName.sendKeys("Kate", Keys.TAB);
       // extentTest.info("First Name alanına Kate yazildi.");
        ReusableMethods.bekle(2);
        page.lastName.clear();
        page.lastName.sendKeys("Brown", Keys.TAB, Keys.TAB);
        //extentTest.info("Last Name alanına Brown yazild.");
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(page.countryDdm);
        ReusableMethods.bekle(2);
        Select select=new Select(page.countryDdm);
        select.selectByVisibleText("United Kingdom (UK)");
       // extentTest.info("Country/Region alanında'United Kingdom (UK)' secildi.");
        ReusableMethods.bekle(2);
        page.numStreet.clear();
        page.numStreet.sendKeys("16 Queen Street", Keys.TAB, Keys.TAB);
        //extentTest.info("Street address alanına '16 Queen Street' yazildi.");
        ReusableMethods.bekle(2);
        page.townCity.clear();
        page.townCity.sendKeys("London",Keys.TAB ,Keys.TAB);
        //extentTest.info("Town/City alanına 'London' yazildi.");
        ReusableMethods.bekle(2);
        page.postcode.clear();
        page.postcode.click();
        page.postcode.sendKeys("WC2N 5DU");
        //extentTest.info("ZIP Code alanına 'WC2N 5DU' olarak dolduruldu.");
        ReusableMethods.bekle(2);
        page.saveAddress.click();
        ReusableMethods.bekle(2);
      //  Driver.getDriver().switchTo().alert().getText();
        ReusableMethods.tumSayfaResmi("Address saved successfully.");
        Assert.assertTrue(page.editAddress.isDisplayed());

    }

    }

