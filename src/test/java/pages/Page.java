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
    @FindBy(xpath="//a[@class='logo']") public WebElement AlloverLogo;
    @FindBy(xpath = "//div[@class='account']//a[contains(.,'Register')]")  public WebElement Register;
    @FindBy(xpath = "//div[@class='wcfmmp_become_vendor_link']")  public WebElement BecameVendor;
    @FindBy(xpath = "//div[@class='page-title-wrap']//h2[contains(.,'Vendor Registration')]")  public WebElement VisibleRegistration;
    @FindBy(xpath ="//input[@id='user_email']" )  public WebElement Email;
    @FindBy(name="wcfm_email_verified_input")    public WebElement VerificationCode;
    @FindBy(name="wcfm_email_verified_button")    public WebElement ReSendCode;
    @FindBy(xpath = "//input[@id='passoword']")    public WebElement Password;
    @FindBy(xpath = "//input[@id='confirm_pwd']")    public WebElement ConfirmPassword;
    @FindBy(id="wcfm_membership_register_button")    public WebElement RegisterButton;
    @FindBy(xpath = "//h1[contains(.,'Welcome to Allover Commerce!')]")    public WebElement VisibleWelcometoAllover;
    @FindBy(xpath = "//a[@class='button button-large']")    public WebElement NotRightNow;
    @FindBy(xpath = "//h2[contains(.,'Store Manager')]")    public WebElement StoreManager;
    @FindBy(xpath = "//div[@id='wcfm_menu']//span[contains(.,'Products')]")    public WebElement products;
    @FindBy(xpath = "//span[contains(text(),'Add New')]")    public WebElement AddNew;
    // String sTop_SayfaAltLit_Menu="//div[@class='page_collapsible_content_holder'][contains(.,'%s')]";
    //String Top_SayfaAltList_MenuVisible="//div[@class='wcfm-content']//strong[contains(.,'%s')]";
    @FindBy(id="pro_title")    public WebElement ProductTitle;
    @FindBy(id = "featured_img_display")    public WebElement PictureAdd;
    @FindBy(id = "gallery_img_gimage_0_display")    public WebElement GaleriImgpictureAdd;
    @FindBy(xpath = "(//button[contains(@type,'button')])[75]")    public WebElement MediaLibary;
    @FindBy(xpath = "(//button[contains(.,'Select')])[6]")    public WebElement Select;
    @FindBy(xpath = "//input[contains(@value,'549')]")    public WebElement Categories;
    @FindBy(xpath = "//input[@id='sku']")    public WebElement Sku;
    @FindBy(xpath = "//input[@id='manage_stock']")    public WebElement ManageStock;
    @FindBy(xpath = "//input[@id='stock_qty']")    public WebElement StockQty;
    @FindBy(xpath = "//input[@id='sold_individually']")    public WebElement SoldIndividually;
    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")    public WebElement SubmitButton;

    @FindBy(xpath = "//div[contains(@id,'wcfm_products_manage_form_inventory_head')]")    public WebElement inventory;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_shipping_head']")    public WebElement shipping;
    @FindBy(xpath = "//div[@class='page_collapsible_content_holder'][contains(.,'Attributes')]")    public WebElement attributes;
    @FindBy(xpath = "//div[@class='page_collapsible_content_holder'][contains(.,'Linked')]")    public WebElement linked;
    @FindBy(xpath = "//div[@class='page_collapsible_content_holder'][contains(.,'SEO')]")    public WebElement seo;
    @FindBy(xpath = "//div[@class='page_collapsible_content_holder'][contains(.,'Advanced')]")    public WebElement advanced;
    @FindBy(xpath = "//*[@id='__wp-uploader-id-7']")    public WebElement selectFilesbutton;
    @FindBy(xpath = "(//input[@name='product_cats[]'])[22]")    public WebElement bags;
    @FindBy(xpath = "//*[@id='sku']")    public WebElement sku;
    @FindBy(xpath = "//*[@id='manage_stock']")    public WebElement managestockbutton;
    @FindBy(xpath = "//*[@id='stock_qty']")    public WebElement stockQty;
    @FindBy(xpath = "//*[@id='sold_individually']")    public WebElement soldIndividuallybutton;
    @FindBy(xpath = "//*[@id='wcfm_products_simple_submit_button']")    public WebElement submitButton;
    @FindBy(xpath = "(//*[@value='yes'])[2]")    public WebElement allowBackordersAllow;
    @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")    public WebElement pictureAdd2;
    @FindBy(xpath = "(//*[@class='thumbnail'])[7]")    public WebElement librarypicture;

    @FindBy(xpath = "(//*[@id='menu-item-upload'])[2]")    public WebElement addToGalleryButton;
    @FindBy(xpath = "//a[@class='wcfm_product_title']")    public WebElement urun1;
    @FindBy(xpath = "//*[@class='login logout inline-type']")    public WebElement out;
      @FindBy(xpath = "//*[@class='page-title']")    public WebElement myAccountYazisi;
    @FindBy(xpath = "//*[@id='pro_title']")    public WebElement productTitle;
    @FindBy(xpath = "//*[@id='featured_img_display']")    public WebElement resimEkle;
    @FindBy(xpath = "(//*[@class='thumbnail'])[6]")    public WebElement ayakkabiResmi;
    @FindBy(xpath = "//*[@id='insert-media-button']")    public WebElement selectButonu;
    @FindBy(xpath = "//*[text()='Ayakkabı']")    public WebElement katagoriAyakkabi;
    @FindBy(xpath = "//*[@id='stock_status']")    public WebElement stockStatus;
    @FindBy(xpath = "//*[@class='attachment-thumbnail size-thumbnail']")    public WebElement productAyakkabiResmi;
    @FindBy(xpath = "//*[@class='instock']")    public WebElement productStokDurumu;
    @FindBy(xpath = "//div[@class='wcfm-tabWrap']")    public WebElement scroll7Things;
    @FindBy(xpath = "//input[@id='weight']")    public WebElement shippingWeight;
    @FindBy(xpath = "//input[@id='length']")    public WebElement shippingdimensionsLength;
    @FindBy(xpath = "//input[@id='width']")    public WebElement shippingdimensionswidth;
    @FindBy(xpath = "//input[@id='height']")    public WebElement shippingdimensionsHeight;
    @FindBy(xpath = "//select[@id='shipping_class']")    public WebElement ddmShippingShippingClass;
    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']")    public WebElement ddmShippingProcessingTime;




















































    // Yasemin Eric 414-464 arası
  //  @FindBy(xpath ="(//i[@class='w-icon-account'])[1]") public WebElement signIn;
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