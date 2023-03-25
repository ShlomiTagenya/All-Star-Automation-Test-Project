package functionality;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.NonCommerceFlow;



@Listeners(utilities.Listeners.class)
public class NonCommerce extends CommonOps {

    @Test(description = "Test001- Verify Register New User ")
    @Description("This Test Verifies Created New User To Website NonCommerce")
    public static void test01_new_user() {
        NonCommerceFlow.register();
        Verifications.verifyTextInElement(nonRegister.txt_msgError, getData("msgError"));
    }

    @Test(description = "Test002 - Verify Login User")
    @Description("This Test Verify User Login To Web")
    public static void test02_loginWeb() {
        NonCommerceFlow.login();
        Verifications.verifyTextInElement(login.btn_logOut, getData("logOut"));
    }

    @Test(description = "Test003- Verify Logout User ")
    @Description("This Test Verifies Log Out From Website")
    public static void test03_logout() {
        NonCommerceFlow.LogOut();
    }

    @Test(description = "Test004 - Verify Search Item")
    @Description("This Test Search Computer Lenovo And Verify Found Item")
    public static void test04_searchItem() {
        NonCommerceFlow.searchComputer();
        Verifications.verifyTextInElement(searchPage.Product_name, getData("productName"));
        NonCommerceFlow.addCart();
        Verifications.verifyTextInElement(lenovo_item1.txt_cart, getData("addToCart"));
        Verifications.visibilityOfElement(lenovo_item1.btn_shop);
    }

    @Test(description = "Test005 - Verify Type Coin")
    @Description("This Test Verifies The Types Of  Coin")
    public static void test05_verifyCoin() {
        NonCommerceFlow.typeIcon();
    }

    @Test(description = "Test006 - Verify Number Of Categories ")
    @Description("This Test Verifies The Number Of Categories")
    public static void test06_verifyCategories() {
        Verifications.numberOfElements(categories.nav_categories, 8);
    }

    @Test(description = "Test07 - verify To Low To High Price")
    @Description("This Test Verifies The Price  Present Is From Low To High ")
    public static void test07_verifyPrice(){
        NonCommerceFlow.cellPhones();
       Verifications.visibilityText(cellPhones.txt_price,getData("phonePrice"));
    }

    @Test(description = "Test008 - verify The Name Of Phone")
    @Description("This Test Verifies  The Name Of Phone  ")
    public static void test08_verifyNamePhone(){
        NonCommerceFlow.cellPhones();
        Verifications.verifyTextInElement(cellPhones.txt_details,getData("phoneName"));
    }

    @Test(description = "Test009 - Verify YouTube Icon ")
    @Description("This Test Verifies The YouTube  Icon Image (Sikuli-Tool) ")
    public static void test09_verifyFaceBookIcon(){
      UIActions.scrollDown(youtubeIcon.fb_icon);
       Verifications.visualElement("youTube");
    }

    @Test(description = "Test010 - Verify 4 Social Media Icons Open ")
    @Description("This Test Verifies The 4 Social Media Icons Is Open's ")
    public static void test10_openTabs(){
        NonCommerceFlow.open_New_Tab();
        Verifications.newTab(getData("facebook"));
        Verifications.newTab(getData("twitter"));
        Verifications.newTab(getData("youtube"));

    }

    @Test(description = "Test011 - Verify Radio Button Survey Answer Options  ")
    @Description("This Test Verifies The Radio Button Survey Answer Options Exists ")
    public static void test11_verifyCheckboxOptions(){
        NonCommerceFlow.survey_vote();
        UIActions.click(survey.checkbox_1);
        Verifications.checkBoxOptions(survey.list_survey,getData("answer4"));
        UIActions.click(survey.btn_vote);
        Verifications.verifyTextInElement(survey.txt_error,getData("errorMsg"));
    }

    @Test(description = "Test012 - Verify Survey Answer Text ")
    @Description("This Test Verifies Survey Answer Text Exists ")
    public static void test12_verifySurvey(){
        UIActions.scrollDown(survey.get_survey);
        Verifications.visibilityText(survey.list_survey,getData("answerOptions"));
    }

    @Test(description = "Test013 - Product Name ", dataProvider = "data-provider-products", dataProviderClass = utilities.ManageDDT.class)
    @Description("This Test Verifies Exits Of Products (Use- Data Driven Testing )")
    public static void test13_productsFromCsvFile(String prodName,String shouldExist){
        NonCommerceFlow.products(prodName,shouldExist);
    }


    @Test(description = "test014",dataProvider = "data-provider-computers",dataProviderClass = utilities.ManageDDT.class)
    @Description("this This Test Verifies Exits Of List Computers Category (Use- Data Driven Testing )")
    public static void test14_computers(String computerName,String expected){
     NonCommerceFlow.list_computer(computerName,expected);
    }

    @Test(description = "Test015 - Verify Contact Us Form  ")
    @Description("This Test Verifies Contact Us Page And Confirm Form ")
    public static void test15_contactUsPage(){
        NonCommerceFlow.contactUs();
    }



    @Test(description = "Test016 - Verify CheckOut Icon ")
    @Description("This Test Verifies The CheckOut Icon In ShopCart ( Used Sikuli-Tool) ")
    public static void test16_verifyIcons()throws FindFailed {
        NonCommerceFlow.nokia();
        Verifications.visualElement("checkout");
    }

    @Test(description = "Test017 - Verify Add Product & Clear Quantity & Update Cart  & Price")
    @Description("This Test Verifies Add Product &  Clear And Update Cart & Verify Price ")
    public static void test17_topProduct1(){
      NonCommerceFlow.topProduct1();
      Verifications.verifyTextInElement(product1.txt_total, getData("total"));
    }

    @Test(description = "Test018 - Verify Add Product To Wishlist & Remove ")
    @Description("This Test Verifies  Add Product To Wishlist & Remove From List WishList ")
    public static void test18_topProduct2(){
        NonCommerceFlow.topProduct2();
        Verifications.verifyTextInElement(product2.txt_empty, getData("empty"));
    }

    @Test(description = "Test019 - Verify Send Product To Email Friend Options ")
    @Description("This Test Verifies  The Product Send To Email & Massage  ")
    public static void test19_topProduct3(){
        NonCommerceFlow.topProduct3();
        Verifications.verifyTextInElement(product3.txt_errorMsg, getData("errorMsg2"));
    }

    @Test(description = "Test020 - Verify  Gift Card Send Friends In Email")
    @Description("This Test Verifies  The Gift Card Send Friends In Email @ Price Before And After ")
    public static void test20_topProduct4(){
      NonCommerceFlow.topProduct4();
        Verifications.verifyTextInElement(product4.txt_totalInCart, getData("totalInCart"));
    }


}
