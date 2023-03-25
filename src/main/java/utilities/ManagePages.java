package utilities;

import pageObjects.nonCommerce.LogOut;
import pageObjects.nonCommerce.LoginPage;
import pageObjects.nonCommerce.Product4;
import org.openqa.selenium.support.PageFactory;
import pageObjects.nonCommerce.*;
import pageObjects.spotify.*;
import pageObjects.todoList.MainPage;


public class ManagePages extends Base{

    public static void initNonCommerce(){
        nonRegister = PageFactory.initElements(driver,Register.class);
        login = PageFactory.initElements(driver, LoginPage.class);
        searchPage = PageFactory.initElements(driver, Search.class);
        lenovo_item1 =PageFactory.initElements(driver, Lenovo_Item1.class);
        coin= PageFactory.initElements(driver, Coin.class);
        categories = PageFactory.initElements(driver, Categories.class);
        logOut = PageFactory.initElements(driver, LogOut.class);
        cellPhones = PageFactory.initElements(driver,CellPhones.class);
        youtubeIcon = PageFactory.initElements(driver, YoutubeIcon.class);
        socialMedia = PageFactory.initElements(driver,SocialMedia.class);
        survey = PageFactory.initElements(driver,Survey.class);
        products = PageFactory.initElements(driver,Products.class);
        computers = PageFactory.initElements(driver,Computers.class);
        contactUs = PageFactory.initElements(driver,ContactUs.class);
        top_products =PageFactory.initElements(driver,Top_Products.class);
        product1 = PageFactory.initElements(driver,Product1.class);
        product2 = PageFactory.initElements(driver,Product2.class);
        product3 = PageFactory.initElements(driver,Product3.class);
        product4 = PageFactory.initElements(driver, Product4.class);

    }

    public static void initFinancialApp(){
        tvmCalc = new  pageObjects.FinancialCalc.TvmCalc(mobileDriver);
        currencyPage = new pageObjects.FinancialCalc.CurrencyPage(mobileDriver);
        loanCalc = new pageObjects.FinancialCalc.LoanCalc(mobileDriver);
        retirement = new pageObjects.FinancialCalc.Retirement(mobileDriver);
        search = new pageObjects.FinancialCalc.Search(mobileDriver);
        settings = new pageObjects.FinancialCalc.Settings(mobileDriver);
        roiCalc = new pageObjects.FinancialCalc.RoiCalc(mobileDriver);
        irrCalc =  new pageObjects.FinancialCalc.IRRCalc(mobileDriver);
        miscellaneousCalc =  new pageObjects.FinancialCalc.MiscellaneousCalc(mobileDriver);
        discountCalc =   new pageObjects.FinancialCalc.DiscountCalc(mobileDriver);
        pivot =  new pageObjects.FinancialCalc.Pivot(mobileDriver);
    }

    public static void initToDOListApp(){
        todoMain = PageFactory.initElements(driver, MainPage.class);
    }

    public static void initSpotifyApp(){
        loginPage = PageFactory.initElements(driver,pageObjects.spotify.LoginPage.class);
        mainSpotify = PageFactory.initElements(driver, MainSpotify.class);
        searchSong = PageFactory.initElements(driver, SearchSong.class);
        yourLibrary = PageFactory.initElements(driver, YourLibrary.class);
        createPlaylist = PageFactory.initElements(driver, CreatePlaylist.class);
        yourEpisodes =  PageFactory.initElements(driver, YourEpisodes.class);
        home =  PageFactory.initElements(driver, Home.class);
        userIcon = PageFactory.initElements(driver, UserIcon.class);
        privateSession = PageFactory.initElements(driver, PrivateSession.class);
        settingsApp = PageFactory.initElements(driver, SettingsApp.class);
        logOutSpotify =  PageFactory.initElements(driver, LogOutSpotify.class);
        sikuliElements =  PageFactory.initElements(driver, SikuliElements.class);
    }

}
