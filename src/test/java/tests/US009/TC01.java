package tests.US009;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class TC01 extends ExtentReport {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("url"));
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver after the test is finished
        Driver.quitDriver();
    }

    @Test
    public void vendorRegistrationTest() {
        extentTest = extentReports.createTest("Team14" , "Allovercommerce Test Edilebilmeli");
        String allovercommerceHandle = Driver.getDriver().getWindowHandle();
        Page page = new Page();

        // Click on the "Register" button

        page.registerButonu.click();
        ReusableMethods.bekle(3);
        extentTest.info( "Register Butonu click edildi.");


        // Click on "Sign up as a vendor" link or click on "Become A Vendor" link
        //vendorRegistrationPage.asVendor.click();
        page.becomeAVendor.click();
        ReusableMethods.bekle(3);


        // Find the verification code in the email
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.fakemail.net/");
        ReusableMethods.bekle(2);
        page.cookiesFakeMail.click();
        String fakeMailHandle = Driver.getDriver().getWindowHandle();
        extentTest.info("Fake Email islemi gerceklestirildi.");

        page.copyFakeMailAli.click();
        ReusableMethods.bekle(3);

        Driver.getDriver().switchTo().window(allovercommerceHandle);
        ReusableMethods.bekle(3);
        page.userNameEmailAddressAli.sendKeys(Keys.CONTROL, "v", Keys.ENTER);
        ReusableMethods.bekle(2);

        //vendorRegistrationPage.vendorverificationCode.click();
        page.boslukVcode.click();
        extentTest.info("Vendor RegistrationPage click edildi.");

        Driver.getDriver().switchTo().window(fakeMailHandle);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(15);
        page.fMailPasswordButton.click();
        ReusableMethods.bekle(5);

        WebElement verificationIframe = Driver.getDriver().findElement(By.xpath("//iframe[@id='iframeMail']"));
        Driver.getDriver().switchTo().frame(verificationIframe);
        String passwordAlma =   page.fmailVerifacitionAlma.getText();
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().window(allovercommerceHandle);
        page.vendorverificationCodeAli.sendKeys(passwordAlma);

        Assert.assertTrue(  page.verificationYazisi.isDisplayed());

        //Hatalı password:Küçük harf ve special karakter içermeyen bir şifre girer
        page.vendorPasswordAli.sendKeys(ConfigReader.getProperty("password_fake"), Keys.TAB, ConfigReader.getProperty("password_fake"), Keys.ENTER);


        //Scroll and click on the final "Register" button
        scrollAndClick(  page.SonRegisterButonu);
        ReusableMethods.bekle(3);
        extentTest.info("Scroll islemi yapildi.");
        //Verify the success message
        Assert.assertEquals("Welcome to Allover Commerce!",   page.WelcomeMesaj.getText());
        extentTest.info("Verify the sucess message goruldu.");

        //ReusableMethods.bekle(2);
    }

    // Custom method to scroll and click on an element using ReusableMethods
    private void scrollAndClick(WebElement element) {
        ReusableMethods.scroll(element);
        ReusableMethods.visibleWait(element, 10);
        ReusableMethods.click(element);
        extentTest.info("US09 Test Edildi");

    }
}