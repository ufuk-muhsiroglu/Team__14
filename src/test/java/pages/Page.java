package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
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


    @FindBy(xpath = "//*[text()='Sign In']") public WebElement signIn;
    @FindBy(xpath = "//*[@id='username']") public WebElement userName;
    @FindBy(xpath = "//*[@id='menu-item-1079']") public WebElement myAccountButton;
    @FindBy(xpath = "//a[text()='Addresses']") public WebElement addressesButton1;
    @FindBy(xpath = "(//h3)[1]") public WebElement billingAddressWriting;
    @FindBy(xpath= "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement billingAddButton;
    @FindBy(xpath="//*[@name='billing_first_name']") public WebElement billingFirstName;
    @FindBy(xpath="//*[@name='billing_last_name']") public WebElement billingLastName;
    @FindBy(xpath= "(//select)[1]") public WebElement billingCountrySelect;
    @FindBy(xpath="//*[@name='billing_address_1']") public WebElement billingStreet1;
    @FindBy(xpath ="//*[@name='billing_city']") public WebElement billingCityTown;
    @FindBy(xpath= "(//select)[2]") public WebElement billingStateSelect;
    @FindBy(xpath = "//*[@name='billing_postcode']") public WebElement billingPostCode;
    @FindBy(xpath= "//*[@name='billing_phone']") public WebElement billingPhone1;
    @FindBy(xpath= "//*[@name='billing_email']") public WebElement billingEmail1;
    @FindBy(xpath= "//*[@name='save_address']") public WebElement billingSubmit;
    @FindBy(xpath= "//*[text()='Address changed successfully.']") public WebElement billingAllert;
    @FindBy(xpath= "//*[@data-id='billing_first_name']") public WebElement billingFirstNameAllert;
    @FindBy(xpath= "//*[@data-id='billing_last_name']") public WebElement billingLastNameAllert;
    @FindBy(xpath= "//*[@data-id='billing_address_1']") public WebElement billingStreetAddressAllert;
    @FindBy(xpath= "//*[@data-id='billing_city']") public WebElement billingCityAdressAllert;
    @FindBy(xpath= "//*[@data-id='billing_postcode']") public WebElement billingPostcodeAllert;
    @FindBy(xpath= "//*[text()='Phone is a required field.']") public WebElement billingPhoneAllert;
    @FindBy(xpath= "//*[text()=' is not a valid phone number.']") public WebElement billingPhoneInValidAllert;
    @FindBy(xpath= "//*[@class='edit btn btn-link btn-primary btn-underline mb-4']") public WebElement editBillingAddress;



    @FindBy(xpath= "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]") public WebElement shippingAddButton;
    @FindBy(xpath= "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]") public WebElement editShippingAddress;
    @FindBy(xpath= "//*[@name='shipping_first_name']") public WebElement shippingFirstName;
    @FindBy(xpath= "//*[@name='shipping_last_name']") public WebElement shippingLastName;
    @FindBy(xpath= "//*[@name='shipping_address_1']") public WebElement shippingStreetBox;
    @FindBy(xpath= "//*[@name='shipping_city']") public WebElement shippingTownBox;
    @FindBy(xpath= "//*[@name='shipping_postcode']") public WebElement shippingZipCode;
    @FindBy(xpath= "(//select)[1]") public WebElement shippingCountrySelect;
    @FindBy(xpath= "(//select)[2]") public WebElement shippingStateSelect;
    @FindBy(xpath= "//*[@name='save_address']") public WebElement shippingSubmit;
    @FindBy(xpath= "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']") public WebElement shippingAlert;
    @FindBy(xpath= "//*[@data-id='shipping_first_name']") public WebElement shippingFirstNameAllert;
    @FindBy(xpath= "//*[@data-id='shipping_last_name']") public WebElement shippingLastNameAllert;
    @FindBy(xpath= "//*[@data-id='shipping_address_1']") public WebElement shippingAddressAllert;
    @FindBy(xpath= "//*[@data-id='shipping_city']") public WebElement shippingCityAdressAllert;
    @FindBy(xpath= "//*[@data-id='shipping_postcode']") public WebElement shippingPostcodeAllert;



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
    @FindBy(xpath ="(//i[@class='w-icon-account'])[1]") public WebElement signIn;
    @FindBy(xpath = "(//input[@name='username'])[1]") public WebElement usernameV;
    @FindBy(xpath = "//button[@name='login']") public WebElement login;
    @FindBy(xpath = "(//input[@class='form-control'])[1]") public WebElement searchBox;
    @FindBy(xpath = "(//figure[@class='product-media'])[1]") public WebElement secilecekUrun;
    @FindBy(xpath = "//button[@name='add-to-cart']") public WebElement addToCartButton;
    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]") public WebElement cartIcon;
    @FindBy(xpath = "//a[@class='button wc-forward']") public WebElement viewChart;
    @FindBy(xpath = "//h1[@class='product_title entry-title']") public WebElement productNameBefore;
    @FindBy(xpath = "//a[@href='https://allovercommerce.com/checkout-2/' and @class='checkout-button button alt wc-forward']") public WebElement proceedCheckout;
    @FindBy (xpath = "//button[@class='quantity-plus w-icon-plus']") public WebElement quantityPlusInPage;
    @FindBy(xpath = "//td[@class='product-name']") public WebElement productName;
    @FindBy(id = "billing_first_name") public WebElement firstName;
    @FindBy(xpath = "//input[@id='billing_last_name']") public WebElement lastName;
    @FindBy(id = "billing_country") public WebElement country;
    @FindBy(xpath = "//input[@id='billing_address_1']") public WebElement street;
    @FindBy(xpath = "//input[@id='billing_city']") public WebElement city;
    @FindBy(id = "billing_state") public WebElement province;
    @FindBy(id = "billing_phone") public WebElement phoneNum;
    @FindBy (xpath = "//input[@id='billing_email']") public WebElement emailAdress;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[6]") public WebElement total;
    @FindBy(xpath = "//input[@id='payment_method_bacs']") public WebElement wireEft;
    @FindBy(xpath = "//input[@id='payment_method_cod']") public WebElement payAtDoor;
    @FindBy(xpath = "(//button[@type='submit'])[3]") public WebElement placeOrder;
    @FindBy(xpath = "//*[.='Thank you. Your order has been received.']") public WebElement succesOrder;
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']") public WebElement orders;
    @FindBy(xpath = "(//a[@class='woocommerce-button btn btn-default btn-rounded btn-outline btn-sm btn-block view'])[1]") public WebElement view;
    @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content col-md-9 pt-2']") public WebElement orderDetailsPage;
    @FindBy(xpath = "//div[@class='account']") public WebElement signOut;
    @FindBy(xpath = "//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']") public List<WebElement> alertsList;
    @FindBy(xpath = "//*[.='Store Manager']") public WebElement storeManager;
    @FindBy(xpath = "//*[@class='wcfmfa fa-gift']") public WebElement coupons;
    @FindBy(xpath = "//a[@data-tip='Add New Coupon']") public WebElement addNew;
    @FindBy(xpath = "//*[@id='title']") public WebElement codeTitle;
    @FindBy(xpath = "//*[@id='description']") public WebElement descriptionTitle;
    @FindBy(xpath = "//select[@id='discount_type']") public  WebElement discountType;
    @FindBy (xpath = "//input[@id='expiry_date']") public WebElement expiryDate;
    @FindBy(xpath = "//select[@class='ui-datepicker-month']") public  WebElement month;
    @FindBy(xpath = "//select[@class='ui-datepicker-year']") public  WebElement year;
    @FindBy(xpath = "//a[@data-date='31']") public WebElement day;
    @FindBy(xpath = "//input[@id='free_shipping']") public WebElement freeship;
    @FindBy(xpath = "//input[@id='show_on_store']") public WebElement showOnStore;
    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']") public WebElement couponSubmit;
    @FindBy(xpath = "//div[@class='wcfm-message wcfm-success']") public WebElement couponSucces;
    @FindBy(xpath = "//a[text()='ab13Ac45']") public WebElement couponCode;




    // Ufuk Muhsiroğlu 464-514 arası





























































































































































































































































}