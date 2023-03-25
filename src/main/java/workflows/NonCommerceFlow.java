package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;


public class NonCommerceFlow extends CommonOps {

    @Step("Business Flow : Register")
    public static void register() {
        UIActions.click(nonRegister.btn_register);
        UIActions.click(nonRegister.btn_gender);
        UIActions.updateText(nonRegister.txt_fName, getData("firstName"));
        UIActions.updateText(nonRegister.txt_lLame, getData("lastName"));
        UIActions.updateDropDown(nonRegister.btn_day, getData("birthDay"));
        UIActions.updateDropDown(nonRegister.btn_month, getData("birthMonth"));
        UIActions.updateDropDown(nonRegister.btn_year, getData("birthYear"));
        UIActions.updateText(nonRegister.txt_email, getData("email"));
        UIActions.updateText(nonRegister.txt_company, getData("companyName"));
        UIActions.updateText(nonRegister.txt_pass, getData("password"));
        UIActions.updateText(nonRegister.txt_confirmPass, getData("confirmPass"));
        UIActions.click(nonRegister.btn_submit);
    }

    @Step("Business Flow : LogOut")
    public static void LogOut() {
        UIActions.click(logOut.btn_logout);
    }

    @Step("Business Flow : Login")
    public static void login() {
        UIActions.click(login.btn_logIn);
        UIActions.updateText(nonRegister.txt_email, getData("email"));
        UIActions.updateText(nonRegister.txt_pass, getData("password"));
        UIActions.click(login.btn_submit);

    }

    @Step("Business Flow : Search Computer")
    public static void searchComputer() {
        UIActions.updateText(searchPage.txt_search, getData("item"));
        UIActions.click(searchPage.btn_search);
        UIActions.click(searchPage.product_item);
    }

    @Step("Business Flow Product : Add To Cart")
    public static void addCart() {
        UIActions.clear(lenovo_item1.btn_quantity);
        UIActions.updateText(lenovo_item1.btn_quantity, getData("quantity"));
        UIActions.click(lenovo_item1.btn_add);
        UIActions.click(lenovo_item1.btn_close);
        UIActions.click(lenovo_item1.btn_shop);
    }

    @Step("Business Flow : Coin  Type")
    public static void typeIcon() {
        UIActions.updateDropDown(coin.type_coin, getData("coinType"));
    }

    @Step("Business Flow : Cell Phones")
    public static void cellPhones() {
        UIActions.mouseHover(cellPhones.btn_elect, cellPhones.cell_phones);
        UIActions.updateDropDown(cellPhones.sort_by, getData("sortBy"));
    }

    @Step("Business Flow : Open New Tab")
    public static void open_New_Tab() {
        UIActions.scrollDown(socialMedia.follows_us);
        UIActions.click(socialMedia.facebook_icon);
        UIActions.scrollDown(socialMedia.follows_us);
        UIActions.click(socialMedia.twitter_icon);
        UIActions.scrollDown(socialMedia.follows_us);
        UIActions.click(youtubeIcon.fb_icon);
    }

    @Step("Business Flow : Search Options")
    public static void survey_vote() {
        UIActions.scrollDown(survey.get_survey);
    }

    @Step("Business Flow : Product Exist")
    public static void products(String prodName, String shouldExist) {
        UIActions.updateText(searchPage.txt_search, prodName);
        UIActions.click(searchPage.btn_search);
        if (shouldExist.equalsIgnoreCase(getData("product1")))
            Verifications.visibilityOfElement(products.products);
        else if (shouldExist.equalsIgnoreCase(getData("product2"))) {
            Verifications.visibilityOfElement(products.products);
        } else if (shouldExist.equalsIgnoreCase(getData("product3"))) {
            Verifications.visibilityOfElement(products.products);
        } else
            throw new RuntimeException("Invalid Product Name Not Exist");
    }

    @Step("Business Flow : Computers List ")
    public static void list_computer(String computerName, String expected) {
        UIActions.mouseHoverNoClick(computers.btn_computers);
        if (expected.equalsIgnoreCase(getData("computerName1")))
            Verifications.visibilityOfElement(computers.txt_desktops);
        else if (expected.equalsIgnoreCase(getData("computerName2")))
            Verifications.visibilityOfElement(computers.txt_notbooks);
        else if (expected.equalsIgnoreCase(getData("computerName3")))
            Verifications.visibilityOfElement(computers.txt_software);
        else
            throw new RuntimeException("Invalid Expected");
    }

    @Step("Business Flow : Contact Us Page")
    public static void contactUs() {
      UIActions.scrollDown(contactUs.btn_contactUs);
      UIActions.click(contactUs.btn_contactUs);
      UIActions.updateText(contactUs.txt_fullName, getData("fullName"));
      UIActions.updateText(contactUs.txt_email, getData("emailAdd"));
      UIActions.updateText(contactUs.txt_enquiry, getData("enquiry"));
      UIActions.click(contactUs.btn_submit);
      Verifications.verifyTextInElement(contactUs.txt_msg, getData("msg"));

    }


    @Step("Business Flow : Sikuli Actions")
    public static void nokia() throws FindFailed {
        screen.type(getData("ImageRepo")+"searchStore.png","Nokia");
        screen.click(getData("ImageRepo")+"searchBtn.png");
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
        screen.click(getData("ImageRepo")+"addToCart.png");
        screen.click(getData("ImageRepo")+"up.png");
        screen.click(getData("ImageRepo")+"up.png");
        screen.click(getData("ImageRepo")+"up.png");
        screen.click(getData("ImageRepo")+"up.png");
        screen.click(getData("ImageRepo")+"up.png");
        screen.click(getData("ImageRepo")+"up.png");
        screen.click(getData("ImageRepo")+"up.png");
        screen.click(getData("ImageRepo")+"x.png");
        Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
        screen.hover(getData("ImageRepo")+"shop.png");
        screen.click(getData("ImageRepo")+"shop.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
        screen.type(getData("ImageRepo")+"quantity.png","2");
        screen.click(getData("ImageRepo")+"updateCart.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
        screen.click(getData("ImageRepo")+"down.png");
    }

    @Step("Business Flow : Top Products - Product 1")
    public static void topProduct1() {
    UIActions.scrollDownMiddlePage(top_products.nav);
    UIActions.click(top_products.btn_prod1);
    UIActions.scrollDownMiddlePage(product1.nav_prod1);
    UIActions.updateDropDown(product1.btn_processor, getData("processor"));
    UIActions.updateDropDown(product1.btn_ram, getData("ram"));
    UIActions.click(product1.btn_hdd);
    UIActions.click(product1.btn_vista);
    UIActions.click(product1.btn_addCart);
    UIActions.click(product1.nav_prod1);
    UIActions.click(logOut.btn_shop);
    UIActions.clear(product1.btn_quantity);
    UIActions.updateText(product1.btn_quantity, "2");
    UIActions.click(product1.btn_updateCartt);
    UIActions.scrollDown(product1.btn_checkout);
    UIActions.click(product1.btn_agree);
    }
    @Step("Business Flow : Top Products - Product 2")
    public static void topProduct2() {
        UIActions.scrollDownMiddlePage(top_products.nav);
        UIActions.click(top_products.btn_prod2);
        UIActions.scrollDownMiddlePage(product2.nav_prod2);
        UIActions.clear(product2.txt_quantity2);
        UIActions.updateText(product2.txt_quantity2, "3");
        UIActions.click(product2.btn_addWish);
        UIActions.click(logOut.btn_wishlist);
        UIActions.click(product2.btn_check);
        UIActions.click(product2.btn_remove);
    }
    @Step("Business Flow : Top Products - Product 3")
    public static void topProduct3() {
        UIActions.scrollDownMiddlePage(top_products.nav);
        UIActions.click(top_products.btn_prod3);
        UIActions.click(product3.nav_prod3);
        UIActions.click(product3.btn_emailFriend);
        UIActions.updateText(product3.txt_FriendsEmail, getData("emailFriend"));
        UIActions.updateText(product3.txt_myEmail, getData("myEmail"));
        UIActions.updateText(product3.btn_massage, getData("massage"));
        UIActions.click(product3.btn_send);
    }

    @Step("Business Flow  : Top Products - Product 4")
    public static void topProduct4() {
        UIActions.scrollDownMiddlePage(top_products.nav);
        UIActions.click(top_products.btn_prod4);
        UIActions.scrollDownMiddlePage(product4.nav_prod4);
        UIActions.updateText(product4.txt_recipientName, getData("RecipientName"));
        UIActions.updateText(product4.txt_recipientEmail, getData("RecipientEmail"));
        UIActions.updateText(product4.txt_name, getData("myName"));
        UIActions.updateText(product4.txt_email, getData("myEmail"));
        UIActions.updateText(product4.txt_msg, getData("msg2"));
        Verifications.verifyTextInElement(product4.txt_price, getData("giftPrice"));
        UIActions.clear(product4.btn_quantity);
        UIActions.updateText(product4.btn_quantity, "2");
        UIActions.click(product4.btn_addToCart);
        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
        UIActions.click(product4.btn_x);
        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
        UIActions.click(logOut.btn_shop);
     //  Verifications.verifyTextInElement(product4.pro_name, getData("proName"));
      // Verifications.verifyTextInElement(product4.txt_priceInCart, getData("giftPrice"));
      // Verifications.verifyTextInElement2(product4.txt_quantityInCart, "2");
       Verifications.verifyTextInElement(product4.txt_totalInCart, getData("totalInCart"));
    }

}










