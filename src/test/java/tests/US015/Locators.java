package ffff;

import org.openqa.selenium.By;

public interface Locators {
    String urlAllover="https://allovercommerce.com";
    By lAlloverLogo= By.xpath("//a[@class='logo']");
    By lRegister=By.xpath("//div[@class='account']//a[contains(.,'Register')]");
    By lBecameVendor=By.xpath("//div[@class='wcfmmp_become_vendor_link']");
    By lVisibleRegistration=By.xpath("//div[@class='page-title-wrap']//h2[contains(.,'Vendor Registration')]");
    By lEmail=By.xpath("//input[@id='user_email']");
    By lVerificationCode=By.name("wcfm_email_verified_input");       //input[@name='wcfm_email_verified_input']
    By lReSendCode=By.name("wcfm_email_verified_button");
    By lPassword=By.xpath("//input[@id='passoword']");
    By lConfirmPassword=By.xpath("//input[@id='confirm_pwd']");
    By lRegisterButton=By.id("wcfm_membership_register_button");
    By lVisibleWelcometoAllover=By.xpath("//h1[contains(.,'Welcome to Allover Commerce!')]");
    By lNotRightNow=By.xpath("//a[@class='button button-large']");
    By lStoreManager=By.xpath("//h2[contains(.,'Store Manager')]");
    By lProducts=By.xpath("//div[@id='wcfm_menu']//span[contains(.,'Products')]");
    By lAddNew=By.xpath("//div[@id='wcfm_menu']//span/a[contains(.,'Add New')]");
    String sTop_SayfaAltLit_Menu="//div[@class='page_collapsible_content_holder'][contains(.,'%s')]";
    String Top_SayfaAltList_MenuVisible="//div[@class='wcfm-content']//strong[contains(.,'%s')]";
    By lProductTitle = By.id("pro_title");
    By lPictureAdd = By.id("featured_img_display");
    By lGaleriImgpictureAdd=By.id("gallery_img_gimage_0_display");
    By lMediaLibary=By.xpath("(//button[contains(@type,'button')])[75]");
    By lSelect=By.xpath("(//button[contains(.,'Select')])[6]");
    By lCategories=By.xpath("//input[contains(@value,'549')]");
    By lSku=By.xpath("//input[@id='sku']");
    By lManageStock=By.xpath("//input[@id='manage_stock']");
    By lStockQty=By.xpath("//input[@id='stock_qty']");
    By lSoldIndividually=By.xpath("//input[@id='sold_individually']");
    By lSubmitButton=By.xpath("//input[@id='wcfm_products_simple_submit_button']");
    By lUrunEkleGor=By.xpath("//tr[@class='odd']");
    By lSkuDegerGor=By.xpath("//tr[@class='odd']//td[contains(.,'15')]");
    By lStockDurumuGor=By.xpath("//span[@class='instock']");







}
