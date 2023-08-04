package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //Beyza Çolak 14-64 satır arası
    @FindBy(xpath = "//a[@class='register inline-type']")
    public WebElement registerButton;
    @FindBy(xpath = "//input[@id='reg_username']")
    public WebElement usernameArea;
    @FindBy(xpath = "//input[@id='reg_email']")
    public WebElement emailArea;
    @FindBy(xpath = "//input[@id='reg_password']")
    public WebElement passwordArea;
    @FindBy(xpath = "//input[@id='register-policy']")
    public WebElement agreeButton;
    @FindBy(xpath = "//button[@name='register']")
    public WebElement signUpButton;
    @FindBy(xpath = "(//p[@class='submit-status'])[2]")
    public WebElement alreadyRegisteredMessage;



































    // Fatma Banu Güler 64-114 arası

















































// Mustafa Çelik 114-164 arası

















































    // Gönül Obuz 164-214 arası









































    // Ali İsaoğlu 214-264 arası
    @FindBy(xpath ="//span[text()='Register']")  public WebElement registerButonu;
    //Register'a tikladiktan sonra acilan ilk sayfadaki WebElementler
    @FindBy(xpath="//input[@id='reg_username']") public WebElement firstUsernameBox;
    @FindBy(xpath="//input[@name='email'] ") public WebElement firstEmailBox;
    @FindBy(xpath="//input[@id='reg_password'] ") public WebElement firstPasswordBox;
    //sign up as a vendor? yazisi locate'i
    @FindBy(xpath="//a[@class='register_as_vendor'] ") public WebElement asVendor;
    @FindBy(xpath = "(//*[.='Become a Vendor'])[2]") public WebElement becomeAVendor;
    @FindBy(xpath = "//*[@class='color cetc']") public WebElement copyFakeMailAli; //fake mail
    @FindBy(xpath="//p[text()='Consent']") public WebElement cookiesFakeMail;
    @FindBy(xpath = "//*[@id='user_email']")  public WebElement userNameEmailAddressAli;
    @FindBy(xpath = "(//*[@type='text'])[2]") public WebElement verificationCodeSG;
    @FindBy(xpath="//div[@class='wcfm-content']") public WebElement boslukVcode;
    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-success']") public WebElement verificationYazisi;
    @FindBy(xpath = "(//h2)[1]") public WebElement vendorYazisiBosTiklama;
    @FindBy(xpath = "(//*[@class='from'])[1]") public WebElement fMailPasswordButton;
    @FindBy(tagName = "b")//fakemail sitesinden verifaction şifresini alma
    public WebElement fmailVerifacitionAlma;
    @FindBy(xpath = "//*[@name='wcfm_email_verified_input']")
    public WebElement vendorverificationCodeAli; // sayfasindaki verification code'un girilecegi
    @FindBy(id = "passoword") public WebElement vendorPasswordAli; //vendor sayfasindaki Password

    //Vendor registration sayfasi locate'leri
    @FindBy(xpath="//input[@id='user_email'] ") public WebElement secondEmailBox;
    @FindBy(xpath="//input[@value='Re-send Code'] ")//Re-send Code butonu
    public WebElement resendCodeButonu;
    @FindBy(xpath="//div[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement codeMessage;
    @FindBy(xpath="//h2[text()='[Allover Commerce] Email Verification Code - 582595']")
    public WebElement sendedCode;
    @FindBy(xpath="//iframe[@role='presentation']") public WebElement iframeElement;
    @FindBy(xpath="(//p[@style='margin:0 0 16px'])[2]") public WebElement innerIframeText;
    @FindBy(xpath="//input[@placeholder='Verification Code']") public WebElement verificationcodeBox;
    @FindBy(xpath="//input[@id='passoword']")
    public WebElement secondPasswordBox;
    //@FindBy(xpath="//input[@id='confirm_pwd']")
    @FindBy(xpath="//input[@name='confirm_pwd']") public WebElement confirmPasswordKutusu;
    @FindBy(xpath="//input[@id='wcfm_membership_register_button']")
    public WebElement SonRegisterButonu;
    //Kayit sonrasi acilan ucuncu sayfa
    @FindBy(xpath="//h1[text()='Welcome to Allover Commerce!']") public WebElement WelcomeMesaj;
    @FindBy(xpath="//span[text()='Sign Out'] ") public WebElement signOutButonu;
    @FindBy(xpath="//div[@class='wcfm-message wcfm-error']") //kayitli email ile giris sonrasi uyari mesaji
    public WebElement existEmailUyarisi;
    @FindBy(xpath="//div[text()='Too short'] ") public WebElement shortPassword;
    @FindBy(xpath="//div[@id='password_strength']") public WebElement weakPassword;
    @FindBy(xpath="//div[text()='Good']") public WebElement goodPassword;
    @FindBy(xpath="//div[text()='Strong']") public WebElement strongPassword;




























































    // Ahmet Bedir 264-314 arası
    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement homePageSignIn;
    @FindBy(xpath = "(//input)[1]")
    public WebElement signUsername;
    @FindBy(xpath = "(//input)[2]")
    public WebElement signPassword;
    @FindBy(xpath = "(//button)[1]")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOutButton;
    @FindBy(xpath = "(//ul)[3]")
    public WebElement dashboard;
    @FindBy(xpath = "(//*[@class='submit-status'])[1]")
    public WebElement invalidMailError;
    @FindBy(xpath = "(//ul/li)[9]")
    public WebElement addressesButton;
    @FindBy(xpath = "(//div/a)[13]")
    public WebElement billingAdd;
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement billingName;
    @FindBy(xpath = "//*[@id='billing_country']")
    public WebElement billingCountry;
    @FindBy (xpath = "(//*[@type='text'])[4]")
    public WebElement billingStreet;
    @FindBy(xpath = "(//*[@type='text'])[6]")
    public WebElement billingZIP;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement billingTown;
    @FindBy(xpath = "//*[@type='tel']")
    public WebElement billingPhone;
    @FindBy(xpath = "(//*[@class='input-text '])[9]")
    public WebElement billingEmail;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/form/div/p/button")
    public WebElement saveBillingAddress;
    @FindBy(xpath = "(//div/a)[13]")
    public WebElement checkAddAddress;
    @FindBy(xpath = "//*[@data-id='billing_first_name']")
    public WebElement alertName;
    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement billingLastname;
    @FindBy(xpath = "//*[@data-id='billing_last_name']")
    public WebElement alertSurname;







    // Bergüzar Zeynep Ölmez 314-364 arası

















































    //Rümeysa Olgun 364-414 arası

















































    // Yasemin Eric 414-464 arası

















































    // Ufuk Muhsiroğlu 464-514 arası












































































































}