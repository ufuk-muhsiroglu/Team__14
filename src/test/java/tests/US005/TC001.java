package tests.US005;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;
import utilities.*;
import java.io.IOException;
public class TC001 extends ExtentReport {
    Faker faker=new Faker();
    String rastgeleKelime = faker.lorem().word();
    String rastgeleSayi = faker.number().digits(8);
    String sifre = rastgeleKelime + rastgeleSayi;
    @Test
    public void test01() throws IOException {
        extentTest=extentReports.createTest("Extent Report","Test Raporu");
        //Kullanıcı https://allovercommerce.com sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("allovercommerce sitesine gidildi");
        //signin butonuna tıklar
        Page page= new Page();
        page.signInButton.click();
        ReusableMethods.bekle(1);
        extentTest.info("Anasayfadaki signin butonuna tıklandı");
        //dataları excel tablosundan alacağız
        String dosyaYolu ="src/test/java/testngTeam05/musteriBilgileri.xlsx";
        String sayfaIsmi ="Sayfa1";
        ExcelReader reader = new ExcelReader(dosyaYolu,sayfaIsmi);
        System.out.println(reader.getCellData(1, 0));
        //kullanıcıadı ve sifre alanlarına mevcut isim ve sifre bilgilerini girer
        page.emailArea.sendKeys(reader.getCellData(1,2));
        ReusableMethods.bekle(1);
        page.passwordArea.sendKeys(reader.getCellData(1,1));
        extentTest.info("Kullanıcı adı ve şifre alanlarına kayıtlı username ve password girildi");
        ReusableMethods.bekle(2);
        //signin butonuna tıkla
        page.signIn.click();
        page.signInButton.click();
        extentTest.info("Sayfaya giriş için signin e tıklandı");
        ReusableMethods.bekle(2);
        //sayfaya girdiğini doğrula
        extentTest.pass("Sayfaya giriş yapıldığı doğrulandı");
        //My Account sayfasına git ve gittiğini doğrula(Signout tıkladığımızda my account sayfası geliyor)

        Assert.assertTrue(page.myAccountButton.isDisplayed());
        extentTest.info("My Account gorunur oldugu dogrulandı");
        ReusableMethods.bekle(2);
        //My Account sayfasının açıldığını sayfa title ile doğrula
        String expectedTitle="My Account - Allover Commerce";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("My Account sayfasının açıldığı doğrulandı");
        //Account details menüsüne tıkla
        ReusableMethods.click(page.myAccountButton);
        extentTest.info("Account details'e tıklandı");
        //Account details görünür oldugunu doğrula
        //   Assert.assertTrue(page.accountDetailsSayfaYazısı.isDisplayed());
        extentTest.pass("Account details'in görünür oldugu doğrulandı");
        //Kullanıcı hesap detaylarını görebilmeli
        ReusableMethods.bekle(2);
        //name,lastname,email,displayedname alanlarındaki bilgileri yeni bilgiler ile değiştir
        faker=new Faker();
        String newName=faker.name().firstName();
        System.out.println("newName = " + newName);
        String newLastName=faker.name().lastName();
        System.out.println("newLastName = " + newLastName);
        String newDisplayedName= faker.name().username();
        System.out.println("newDisplayedName = " + newDisplayedName);
        //Mevcut bilgileri temizleyip yeni bilgiler gönder
        //   page.accountFirstName.clear();
        //   page.accountLastName.clear();
        //email değişmemeli!!!!!!!!!!!!!!!!!
        //   page.accountFirstName.sendKeys(newName, Keys.TAB,newLastName,
        //           Keys.TAB,newDisplayedName,Keys.TAB,reader.getCellData(1,2);
        extentTest.info("firstname,lastname,displayedname,email alanlarına değiştirilmek istenilen bilgiler girildi");
        //Biography alanına text gir
        Driver.getDriver().switchTo().frame(0);
        //  page.biography.clear();
        //  page.biography.sendKeys(ConfigReader.getProperty("biography"));
        Driver.getDriver().switchTo().defaultContent();
        extentTest.info("Biography alanına text girildi");
        ReusableMethods.bekle(2);
        //Change password alanındaki mevcut şifre, yeni şifre ve yeni şifrenin doğrulaması alanlarını doldur
        //   page.currentPassword.sendKeys(reader.getCellData(1,1));
        //   page.newPassword.sendKeys(sifre,Keys.TAB,sifre);
        System.out.println(sifre);
        //yeni sifre ve kullanici ismi bilgilerini mevcut excele yazdım
        //   reader.writeCell(1,1,dosyaYolu,sifre);
        //   reader.writeCell(1,0,dosyaYolu,newDisplayedName);
        extentTest.info("Change password alanındaki mevcut şifre, yeni şifre ve yeni şifrenin doğrulaması alanları dolduruldu");
        ReusableMethods.bekle(2);
        //save changes butonuna tıkla
        //    ReusableMethods.click(page.saveChangesButton);
        ReusableMethods.bekle(3);
        extentTest.info("Save butonuna tıklandı");
        //"Account details changed successfully" mesajının görünür oldugunu doğrula
        //     Assert.assertTrue(page.accountDetailsChangedMessage.isDisplayed());
        //screenshot ekle
        //siteden signout ardından logout tıkla
        ReusableMethods.scrollHome();
       // ReusableMethods.click(page.signOut);
        ReusableMethods.bekle(3);
        //   page.logOut.click();
        ReusableMethods.bekle(2);
    }
}
