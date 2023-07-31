package pages;

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
    @FindBy(linkText = "Addresses")
    public WebElement addressesButton;
    @FindBy(xpath = "//a[contains(@class,'edit btn')]")
    public WebElement billingAdd;
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement billingName;
    @FindBy(xpath = "//*[@id='billing_country']")
    public WebElement billingCountry;
    @FindBy (id = "billing_address_1")
    public WebElement billingStreet;
    @FindBy(xpath = "//input[@name='billing_postcode']")
    public WebElement billingZIP;
    @FindBy(id = "billing_state")
    public WebElement billingState;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement billingTown;
    @FindBy(xpath = "//*[@type='tel']")
    public WebElement billingPhone;
    @FindBy(id = "billing_email")
    public WebElement billingEmail;
    @FindBy(xpath = "//button[@value='Save address']")
    public WebElement saveBillingAddress;
    @FindBy(xpath = "//div[@class='woocommerce-Address']//a")
    public WebElement checkAddAddress;
    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement billingLastname;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement alertBillingAddress;







    // Bergüzar Zeynep Ölmez 314-364 arası

















































    //Rümeysa Olgun 364-414 arası

















































    // Yasemin Eric 414-464 arası

















































    // Ufuk Muhsiroğlu 464-514 arası












































































































}