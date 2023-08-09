package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;





public class Page {

    public Page() {
        PageFactory.initElements(Driver.getDriver(), this);

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
    @FindBy(xpath = "//*[text()='An account is already registered with your email address. ']")
    public WebElement alreadyRegisteredEmailMessage;
    @FindBy(xpath = "(//p[@class='submit-status'])[2]")
    public WebElement validAccountUsernameAllert;
    @FindBy(xpath = "//*[text()='An account is already registered with that username. Please choose another.']")
    public WebElement alreadyRegisteredUsernameMessage;









   
  
  
  
  
  
  
  
  
  
  
  
   // Fatma Banu Güler 64-114 arası

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;
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
    @FindBy(xpath = "(//img)[7]")
    public WebElement resimSec;
    @FindBy(xpath = "//*[@name='update_cart']")
    public  WebElement updateCart;
    @FindBy(xpath = "//*[@title='Minus']")
    public WebElement minus;
    @FindBy(xpath = "(//*[@type=\"radio\"])[2]")
    public WebElement paymentMethods;
    @FindBy(xpath = "(//*[@type=\"submit\"])[4]")
    public  WebElement placEOrder;
    @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
    public  WebElement thanks;





































    // Gönül Obuz 164-214 arası
    @FindBy(xpath= "//*[@class='register inline-type']")    public WebElement registerClick;
    @FindBy(xpath= "(//*[@name='username'])[2]")    public WebElement userName1;
    @FindBy(xpath= "(//*[@id='register-policy'])[1]")    public WebElement tickBox;
    @FindBy(xpath= "//*[@class='login-popup']")    public WebElement tickBoxAlert;
    @FindBy(xpath= "(//*[@value='Sign Up'])[1]")    public WebElement singUp;
    @FindBy(xpath= "(//*[@type='search'])[1]")    public WebElement searchBoxy;
    @FindBy(xpath= "(//*[@type='search'])[1]")    public WebElement searchBoxAgain;
    @FindBy(xpath= "(//h3)[2]")    public WebElement ilkUrun;
    @FindBy(xpath= "//*[text()='Start Compare !']")    public WebElement startCompareButton;
    @FindBy(xpath= "//*[@class='product-title']")    public WebElement fotoIcinLocation;
    @FindBy(xpath= "(//h3)[3]")    public WebElement ikinciUrun;
    @FindBy(xpath= "(//*[@href='#'])[4]")    public WebElement scaleIkon;
    @FindBy(xpath= "(//h3)[4]") public WebElement ucuncuUrun;
    @FindBy(xpath = "//a[contains(@data-title,'Browse wishlist...')]") public WebElement wishListFav ;
    @FindBy(xpath = "(//*[@data-title='Add to wishlist'])[1]")   public WebElement kalpFavori;
    @FindBy(xpath = " (//td)[1]") public WebElement wishListUrun;
    @FindBy(xpath = "//button[contains(@title,'Quick View')]") public WebElement quickView;
    @FindBy(xpath = "(//h2)[1]") public WebElement quickViewUrun;
    @FindBy(xpath = "//a[contains(@class,'compare-clean')]") public WebElement clearAll;
    @FindBy(xpath = "(//*[@data-product-type='simple'])[1]") public WebElement firstWishUrun;
    @FindBy(xpath = "(//*[@data-product-type='simple'])[2]") public WebElement secondWishUrun;
    @FindBy(xpath = "//*[@class='w-icon-heart']") public WebElement wishListButton;
    @FindBy(xpath = "//*[@id='payment_method_cod']") public WebElement payAtTheDoor;
    @FindBy(xpath = "(//*[@type='submit'])[3]") public WebElement placeOrderButton;
    @FindBy(xpath = "(//p)[3]") public WebElement thankYouYazisi;
    @FindBy(xpath = "//h2[@class='page-title'][contains(.,'Compare')]") public WebElement  comparekarsılastırma;
    @FindBy(xpath= "//*[.='Wishlist']") public WebElement wishListDashboard;
    @FindBy(xpath= "//*[@class='woocommerce-Button button']") public WebElement goShopButton;
    @FindBy(xpath= "(//*[.='Add to cart'])[1]") public WebElement addToCart;
    @FindBy(xpath= "(//*[@class='w-icon-cart'])[1]") public WebElement cartButton;
    @FindBy(xpath= "//*[.='Checkout']") public WebElement checkoutButton;
    @FindBy(xpath= "//*[@id='billing_first_name']") public WebElement checkoutFirstName;














      
      
      
      
      
      

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
    @FindBy(xpath = "//*[@class='login inline-type']")  public WebElement homePageSignIn;
    @FindBy(xpath = "(//input)[1]")   public WebElement signUsername;
    @FindBy(xpath = "(//input)[2]")   public WebElement signPassword;
    @FindBy(xpath = "(//button)[1]")  public WebElement signInButton;
    @FindBy(xpath = "//*[@class='login logout inline-type']")  public WebElement signOutButton;
    @FindBy(xpath = "//a[@href='https://allovercommerce.com/my-account-2/']")  public WebElement myAccountButtonUS11;
    @FindBy(xpath = "//h2[text()='My Account']") public WebElement myAccountCheck;
    @FindBy(xpath = "//nav[contains(@class,'woocommerce-MyAccount-navigation col-md-3')]")  public WebElement dashboard;
    @FindBy(linkText = "Store Manager")  public WebElement storeMangerUS11;
    @FindBy(xpath = "//h2[text()='Store Manager']") public WebElement storeManagerUS11Check;
    @FindBy(xpath = "//h2[text()='Wishlist']") public WebElement wishlistUS11Check;
    @FindBy(xpath = "(//li[@class='delimiter']/following-sibling::li)[3]") public WebElement checkButtons;
    @FindBy(linkText = "Orders")  public WebElement ordersUS11;
    @FindBy(linkText = "Downloads")  public WebElement downloadsUS11;
    @FindBy(linkText = "Account details")  public WebElement accountDetailsUS11;
    @FindBy(xpath = "(//a[@href='https://allovercommerce.com/wishlist/'])[2]")  public WebElement wishlistUS11;
    @FindBy(linkText = "Support Tickets")  public WebElement supportTicketsUS11;
    @FindBy(xpath = "(//span[@class='nobr'])[2]") public WebElement supportTicketsUS11Check;
    @FindBy(linkText = "Followings")  public WebElement followingsUS11;
    @FindBy(xpath = "//td[@colspan='2']") public WebElement followingsUS11Check;
    @FindBy(linkText = "Logout")  public WebElement logoutUS11;
    @FindBy(xpath = "(//*[@class='submit-status'])[1]")  public WebElement invalidMailError;

    @FindBy(linkText = "Addresses")  public WebElement addressesButton;
    @FindBy(xpath = "//a[contains(@class,'edit btn')]")  public WebElement billingAdd;
    @FindBy(xpath = "//*[@id='billing_first_name']")  public WebElement billingName;
    @FindBy(xpath = "//p[@data-priority='10']") public WebElement billingNameArea;
    @FindBy(xpath = "//p[@data-priority='20']") public WebElement billingSurnameArea;
    @FindBy(xpath = "//*[@id='billing_country']")  public WebElement billingCountry;
    @FindBy (id = "billing_address_1")  public WebElement billingStreet;
    @FindBy(xpath = "//input[@name='billing_postcode']")  public WebElement billingZIP;
    @FindBy(id = "billing_state")  public WebElement billingState;
    @FindBy(xpath = "//*[@id='billing_city']")  public WebElement billingTown;
    @FindBy(xpath = "//*[@type='tel']")  public WebElement billingPhone;
    @FindBy(id = "billing_email")  public WebElement billingEmail;
    @FindBy(xpath = "//button[@value='Save address']")  public WebElement saveBillingAddress;
    @FindBy(xpath = "//*[@role='alert']")  public WebElement checkAddAddress;
    @FindBy(xpath = "(//*[@type='text'])[2]")  public WebElement billingLastname;
    @FindBy(xpath = "//*[@role='alert']")  public WebElement alertBillingAddress;





   
   // Bergüzar Zeynep Ölmez 314-364 arası
    // US13
    @FindBy(xpath = "(//input)[1]") public WebElement signInUsername;
    @FindBy(xpath = "(//input)[2]") public WebElement signinPassword;
    @FindBy(xpath = "(//button)[1]") public WebElement signInSubmit;
    @FindBy(xpath = "//*[@class='login logout inline-type']") public WebElement signOutAgain;
    //US14
    @FindBy(xpath = "//*[text()='Edit Your Shipping Address']") public WebElement editShipping;
    @FindBy(xpath = "//*[@id='main']/div/div/div/div/div/div/nav/ul/li[5]/a") public WebElement adresler;
    @FindBy(xpath ="//*[@class='edit btn btn-link btn-primary btn-underline mb-4']") public WebElement AddShippingAddr;
    @FindBy(xpath = "//input[@id='shipping_first_name']") public WebElement firstName;
    @FindBy(xpath ="//input[@id='shipping_last_name']") public WebElement lastName;
    @FindBy(xpath ="//select[@id='shipping_country']") public WebElement countryDdm;
    @FindBy(xpath ="//input[@id='shipping_address_1']") public WebElement numStreet;
    @FindBy(xpath = "//select[@id='shipping_state']") public WebElement province;
    @FindBy(xpath ="//input[@id='shipping_postcode']") public WebElement postcode;
    @FindBy(xpath ="//input[@id='shipping_city']") public WebElement townCity;
    @FindBy(xpath ="//button[@name='save_address']") public WebElement saveAddress;
    @FindBy(xpath ="(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]") public WebElement editAddress;
    @FindBy(xpath = "//*[text()='Store Manager']") public WebElement storeManagerButton;
    @FindBy(xpath = "//select[@id='product_type']") public WebElement ProductType;
    @FindBy(xpath = "(//span[@class='text'])[4]") public WebElement productsButonu;
    @FindBy(xpath = "//*[text()='Add New']") public WebElement addNewButonu;
    @FindBy(xpath = "//input[@id='pro_title']") public WebElement productTitleBox;
    @FindBy(xpath = "(//body[@id='tinymce'])[1]") public WebElement shortDescriptionBox;
    @FindBy(xpath = "(//body[@id='tinymce'])[1]") public WebElement descriptionBox;
    @FindBy(xpath = "//iframe[@id='description_ifr']") public WebElement iframe;
    @FindBy(xpath = "//iframe[@id='excerpt_ifr']") public WebElement shortDecrIframe;
    @FindBy(xpath = "//input[@value='645']") public WebElement aaaTikla;
    @FindBy(xpath = "(//p[@class='description wcfm_full_ele wcfm_side_add_new_category wcfm_add_new_category wcfm_add_new_taxonomy'])[1]") public WebElement addNewCategoryButonu;
    @FindBy(xpath = "//input[@id='wcfm_new_cat']") public WebElement categoryNameKutusu;
    @FindBy(xpath = "//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt']") public WebElement addButonu1;
    @FindBy(xpath = "//p[text()='+Add new Product brands']") public WebElement addNewProductBrandsbutonu;
    @FindBy(xpath = "//*[@id='wcfm_new_product_brand']") public WebElement brandNameKutusu;
    @FindBy(xpath = "//input[@value='837']") public WebElement baslikTikla;
    @FindBy(xpath = "(//button[text()='Add'])[2]") public WebElement addButonu2;
    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']") public WebElement submitButonu;
    @FindBy(xpath = "//img[@id='featured_img_display']") public WebElement buyukResim;
    @FindBy(xpath = "//button[@id='menu-item-upload']") public WebElement uploadFile;
    @FindBy(xpath = "//img[@id='gallery_img_gimage_0_display']") public WebElement kucukResim;
    @FindBy(xpath = "//button[@class='browser button button-hero']") public WebElement selectFilesButonu;
    @FindBy(xpath = "(//button[text()='Add'])[2]") public WebElement selectButonu1;
    @FindBy(xpath = "//button[text()='Load more']") public WebElement loadMore;
    @FindBy(xpath = "//button[text()='Select']") public  WebElement selectBuyukResim;
    @FindBy(xpath = "//*[@id='__attachments-view-138']/li[3]/div") public  WebElement kucukResimSec;
    @FindBy(xpath = "(//button[text()='Add to Gallery'])[2]") public WebElement addGalery2;
    @FindBy(xpath ="(//*[text()='Categories'])[1]") public WebElement kucukResimScroll;

  
  
    //Rümeysa Olgun 364-414 arası
    @FindBy(xpath = "(//input[@type='password'])[1]")  public WebElement password;
    @FindBy(xpath = "//*[@href='https://allovercommerce.com/store-manager/products-manage/']")  public WebElement productsAddNew;
    @FindBy(xpath = "(//*[@class='wcfm_menu_item '])[3]")  public WebElement products;
    @FindBy(xpath = "(//*[@class='text'])[4]")  public WebElement products1;
    @FindBy(xpath = "//*[@id='catalog_visibility']")  public WebElement sku;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[1]")  public WebElement inventory;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[4]")  public WebElement shipping;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[5]")  public WebElement attributes;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[7]")  public WebElement linked;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[8]")  public WebElement seo;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[10]")  public WebElement advanced;
    @FindBy(xpath = "//*[@id='sku']")  public WebElement skuBox;
    @FindBy(xpath = "//input[@id='manage_stock']")  public WebElement manageStock;
    @FindBy(xpath = "//input[@id='stock_qty']")  public WebElement stockQty;
    @FindBy(xpath = "//input[@id='sold_individually']")  public WebElement soldIndividually;
    @FindBy(xpath = "//*[@id='weight']")  public WebElement weight;
    @FindBy(xpath = "//*[@id='length']")  public WebElement lenght;
    @FindBy(xpath = "//*[@id='width']")  public WebElement widht;
    @FindBy(xpath = "//*[@id='height']")  public WebElement height;
    @FindBy(xpath = "//*[@id='backorders']")  public WebElement backordersBox;
    @FindBy(xpath = "//*[@id='product_type']")  public WebElement simpleProductBox;
    @FindBy(xpath = "//*[@id='is_virtual']")  public WebElement virtualBox;
    @FindBy(xpath = "//*[@id='is_downloadable']")  public WebElement downloadableBox;
    @FindBy(xpath = "//*[@id='pro_title']")  public WebElement productTitle;
    @FindBy(xpath = "//*[@id='regular_price']")  public WebElement priceBox;
    @FindBy(xpath = "//*[@id='sale_price']")  public WebElement salePriceBox;
    @FindBy(xpath = "//*[@id='_wcfmmp_processing_time']")  public WebElement processing;
    @FindBy(xpath = "//*[@id='attributes_is_active_1']")  public WebElement attributesColor;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")  public WebElement colorbox;
    @FindBy(xpath = "//*[@id='attributes_is_active_2']")  public WebElement size;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]")  public WebElement sizeBox;
    @FindBy(xpath = "(//*[@class='wcfmfa fa-eye text_tip'])[3]")  public WebElement viewButton;
    @FindBy(xpath = "//*[@id='wcfm_products_simple_draft_button']")  public WebElement draftButton;
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form']")  public WebElement inventoryMenu;
    @FindBy(xpath = "//*[@class='summary entry-summary']")  public WebElement productDetails;
    @FindBy(xpath = "//*[@href='#tab-additional_information']")  public WebElement specificationButton;
    @FindBy(xpath = "//*[@class='woocommerce-tabs wc-tabs-wrapper tab tab-nav-simple']")  public WebElement specificationDetails;
    @FindBy(xpath = "(//*[@class='wcfm_title wcfm_full_ele'])[1]")  public WebElement categoriesBox;
    @FindBy(xpath = "(//*[@name='product_cats[]'])[1]")  public WebElement categoriesFirstBox;
    @FindBy(xpath = "//*[@id='wcfm-products_wrapper']")  public WebElement productDetails1;
    @FindBy(css = "[id=username]")  public WebElement signInUserNameOrEmaill;
    @FindBy(css = "[id=password]")  public WebElement signInPassword1;
    @FindBy(xpath = "(//*[@href='https://allovercommerce.com/my-account-2/'])[1]")  public WebElement myAccount;
    @FindBy(xpath = "(//*[@href='https://allovercommerce.com/store-manager/'])")  public WebElement storeManager1;



  

    // Yasemin Eric 414-464 arası
    @FindBy(xpath ="(//i[@class='w-icon-account'])[1]") public WebElement signInY;
    @FindBy(xpath = "(//input[@name='username'])[1]") public WebElement usernameV;
    @FindBy(xpath = "//button[@name='login']") public WebElement login;
    @FindBy(xpath = "(//input[@class='form-control'])[1]") public WebElement searchBox;
    @FindBy(xpath = "(//figure[@class='product-media'])[2]") public WebElement secilecekUrun;
    @FindBy(xpath = "//button[@name='add-to-cart']") public WebElement addToCartButton;
    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]") public WebElement cartIcon;
    @FindBy(xpath = "//a[@class='button wc-forward']") public WebElement viewChart;
    @FindBy(xpath = "//h1[@class='product_title entry-title']") public WebElement productNameBefore;
    @FindBy(xpath = "//a[@href='https://allovercommerce.com/checkout-2/' and @class='checkout-button button alt wc-forward']") public WebElement proceedCheckout;
    @FindBy (xpath = "//button[@class='quantity-plus w-icon-plus']") public WebElement quantityPlusInPage;
    @FindBy(xpath = "//td[@class='product-name']") public WebElement productName;
    @FindBy(id = "billing_first_name") public WebElement firstNameY;
    @FindBy(xpath = "//input[@id='billing_last_name']") public WebElement lastNameY;
    @FindBy(id = "billing_country") public WebElement countryY;
    @FindBy(xpath = "//input[@id='billing_address_1']") public WebElement streetY;
    @FindBy(xpath = "//input[@id='billing_city']") public WebElement cityY;
    @FindBy(id = "billing_state") public WebElement provinceY;
    @FindBy(id = "billing_phone") public WebElement phoneNumY;
    @FindBy (xpath = "//input[@id='billing_email']") public WebElement emailAdressY;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[6]") public WebElement totalY;
    @FindBy(xpath = "//input[@id='payment_method_bacs']") public WebElement wireEftY;
    @FindBy(xpath = "//input[@id='payment_method_cod']") public WebElement payAtDoorY;
    @FindBy(xpath = "(//button[@type='submit'])[3]") public WebElement placeOrderY;
    @FindBy(xpath = "//*[.='Thank you. Your order has been received.']") public WebElement succesOrder;
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']") public WebElement ordersY;
    @FindBy(xpath = "(//a[@class='woocommerce-button btn btn-default btn-rounded btn-outline btn-sm btn-block view'])[1]") public WebElement viewY;
    @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content col-md-9 pt-2']") public WebElement orderDetailsPage;
    @FindBy(xpath = "//div[@class='account']") public WebElement signOutY;
    @FindBy(xpath = "//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']") public List<WebElement> alertsList;
    @FindBy(xpath = "//*[.='Store Manager']") public WebElement storeManagerY;
    @FindBy(xpath = "//*[@class='wcfmfa fa-gift']") public WebElement couponsY;
    @FindBy(xpath = "//a[@data-tip='Add New Coupon']") public WebElement addNewY;
    @FindBy(xpath = "//*[@id='title']") public WebElement codeTitle;
    @FindBy(xpath = "//*[@id='description']") public WebElement descriptionTitle;
    @FindBy(xpath = "//select[@id='discount_type']") public  WebElement discountType;
    @FindBy (xpath = "//input[@id='expiry_date']") public WebElement expiryDate;
    @FindBy(xpath = "//select[@class='ui-datepicker-month']") public  WebElement month;
    @FindBy(xpath = "//select[@class='ui-datepicker-year']") public  WebElement year;
    @FindBy(xpath = "//a[@data-date='31']") public WebElement day;
    @FindBy(xpath = "//input[@id='free_shipping']") public WebElement freeshipY;
    @FindBy(xpath = "//input[@id='show_on_store']") public WebElement showOnStoreY;
    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']") public WebElement couponSubmitY;
    @FindBy(xpath = "//div[@class='wcfm-message wcfm-success']") public WebElement couponSuccesY;
    @FindBy(xpath = "//a[text()='ab13Ac45']") public WebElement couponCodeY;
    @FindBy(xpath = "(//button[@class='btn btn-search'])[1]") public WebElement searchIconY;



    // Ufuk Muhsiroğlu 464-514 arası
    @FindBy(xpath = "//*[@class='login inline-type']") public WebElement Us1920HomePagesignIn;
    @FindBy(xpath = "(//input)[1]") public WebElement Us1920UserName;
    @FindBy(xpath = "(//input)[2]") public WebElement Us1920UserPassword;
    @FindBy(xpath = "(//button)[1]") public WebElement Us1920signInButton;
    @FindBy(xpath = "//*[@class='form-control']") public WebElement Us1920SearchButton;
    @FindBy(xpath = "//*[@name='add-to-cart']") public WebElement Us1920UrunEkleButton;
    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-btn alert-success']") public WebElement Us1920ItemVerification;
    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]") public WebElement Us1920CartButton;
    @FindBy(xpath = "//*[@class='button wc-forward']") public WebElement Us1920ViewCartButton;
    @FindBy(xpath = "//*[@class='quantity-plus w-icon-plus']") public WebElement Us1920PlusItemButton;
    @FindBy(xpath = "//*[@name='update_cart']") public WebElement Us1920UpdateCartButton;
    @FindBy(xpath = "//*[@value='2']") public WebElement Us1920QuantityButton;
    @FindBy(xpath = "//*[@class='quantity-minus w-icon-minus']") public WebElement Us1920MinusItemButton;
    @FindBy(xpath = "//*[@name='coupon_code']") public WebElement Us1920EnterCoupon;
    @FindBy(xpath = "//*[@name='apply_coupon']") public WebElement Us1920ApplyCouponButton;
    @FindBy(xpath = "//*[@class='woocommerce-notices-wrapper']") public WebElement Us1920CouponVerification;
    @FindBy(xpath = "//*[@class='woocommerce-remove-coupon']") public WebElement Us1920RemoveCouponButton;
    @FindBy(xpath = "//*[@role='alert']") public WebElement Us1920RemoveCouponVerification;
    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']") public WebElement Us1920CheckoutButton;
    @FindBy(xpath = "(//*[@class='input-radio'])[2]") public WebElement Us1920PaymentClick;
    @FindBy(xpath = "//*[@class='col-lg-8 pr-lg-4']") public WebElement Us1920EmptyClick;
    @FindBy(xpath = "//*[@id='place_order']") public WebElement Us1920PlaceOrderButton;
    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']") public WebElement Us1920OrderVerify;
    @FindBy(xpath = "//*[@class='login inline-type']") public WebElement SignIn1;
    @FindBy(xpath = "//*[@name='username']") public WebElement SignInUserName;
    @FindBy(xpath = "(//*[@name='password'])[1]") public WebElement SignInEmail;
    @FindBy(xpath = "//*[@name='login']") public WebElement SubmitSignIn;
    @FindBy(xpath = "(//*[@class='form-control'])[1]") public WebElement SearchBox;
    @FindBy(xpath = "//*[@class='quantity-plus w-icon-plus']") public WebElement Arti1;
    @FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']") public WebElement AddToCartButton;
    @FindBy(xpath = "//*[@class='cart-label']") public WebElement CartBox;
    @FindBy(xpath = "//*[@class='button checkout wc-forward']") public WebElement CheckoutButton;
    @FindBy(xpath = "//*[@id=\"customer_details\"]/div[1]/h3") public WebElement Billing;
    @FindBy(xpath = "//*[@class='showcoupon']") public WebElement EnterYourCodeClick;
    @FindBy(xpath = "//*[@class='input-text form-control mr-0 mr-sm-1 mb-4 mb-sm-0']") public WebElement EnterYourCode;
    @FindBy(xpath = "//*[@class='btn button btn-rounded btn-default']") public WebElement ApplyCouponButton;
    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']") public WebElement ApplyCouponSubmit;
    @FindBy(xpath = "//*[@class='woocommerce-remove-coupon']") public WebElement RemoveCouponButton;
    @FindBy(xpath = "//*[@class='button alt']") public WebElement PlaceOrderClick;
    @FindBy(xpath = "//*[@class='woocommerce-order-overview woocommerce-thankyou-order-details order_details']") public WebElement ThankYouVerify;
    @FindBy(xpath = "//*[@href='/my-account-2/orders/']") public WebElement MyOrderClick;
    @FindBy(xpath = "//*[@class='woocommerce-button btn btn-default btn-rounded btn-outline btn-sm btn-block view']") public WebElement ViewClick;
    @FindBy(xpath = "//*[@class='woocommerce-order-details__title']") public WebElement OrderDetail;




}