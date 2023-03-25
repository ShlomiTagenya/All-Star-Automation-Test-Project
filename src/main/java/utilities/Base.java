package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;
import pageObjects.nonCommerce.Product4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import pageObjects.nonCommerce.*;
import pageObjects.spotify.LogOutSpotify;
import pageObjects.spotify.SikuliElements;

public class Base {

    // General :

    protected static WebDriverWait wait;
    protected static Actions actions;
    protected static Screen screen;
    protected static SoftAssert softAssert;
    protected static String platform;

   // Web :
   protected  static WebDriver driver;

    // Rest API:
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp;




    // Web Page Objects :
    protected static pageObjects.nonCommerce.Register nonRegister;
    protected static LoginPage login;
    protected static Search searchPage;
    protected static Lenovo_Item1 lenovo_item1;
    protected static Coin coin;
    protected static Categories categories;
    protected static LogOut logOut;
    protected static CellPhones cellPhones;
    protected static  YoutubeIcon youtubeIcon;
    protected  static SocialMedia socialMedia;
    protected static Survey survey;
    protected static Products products;
    protected static Computers computers;
    protected static ContactUs contactUs;
    protected static Top_Products top_products;
    protected static Product1 product1;
    protected static Product2 product2;
    protected static Product3 product3;
    protected static Product4 product4;

    // Mobile:
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    // Mobile Page Objects :
    protected static pageObjects.FinancialCalc.TvmCalc tvmCalc;
    protected static pageObjects.FinancialCalc.CurrencyPage currencyPage;
    protected static  pageObjects.FinancialCalc.LoanCalc loanCalc;
    protected static  pageObjects.FinancialCalc.Retirement retirement;
    protected static  pageObjects.FinancialCalc.Search search;
    protected static  pageObjects.FinancialCalc.Settings settings;
    protected static  pageObjects.FinancialCalc.RoiCalc roiCalc;
    protected static  pageObjects.FinancialCalc.IRRCalc irrCalc;
    protected static  pageObjects.FinancialCalc.MiscellaneousCalc miscellaneousCalc;
    protected static  pageObjects.FinancialCalc.DiscountCalc discountCalc;
    protected static  pageObjects.FinancialCalc.Pivot pivot;

    // Electron Page Objects :
    protected static  pageObjects.todoList.MainPage todoMain;


   // Desktop Page Objects :
     protected static pageObjects.spotify.LoginPage loginPage;
     protected static pageObjects.spotify.MainSpotify mainSpotify;
     protected static pageObjects.spotify.SearchSong searchSong;
     protected static pageObjects.spotify.YourLibrary yourLibrary;
     protected static pageObjects.spotify.CreatePlaylist createPlaylist;
     protected static pageObjects.spotify.YourEpisodes yourEpisodes;
     protected static pageObjects.spotify.Home home;
     protected static pageObjects.spotify.UserIcon userIcon;
     protected static pageObjects.spotify.PrivateSession privateSession;
     protected static pageObjects.spotify.SettingsApp settingsApp;
     protected static LogOutSpotify logOutSpotify;
     protected static SikuliElements sikuliElements;









}
