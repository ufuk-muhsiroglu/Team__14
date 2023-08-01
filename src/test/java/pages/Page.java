package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }












    //Beyza Çolak 24-64 satır arası
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