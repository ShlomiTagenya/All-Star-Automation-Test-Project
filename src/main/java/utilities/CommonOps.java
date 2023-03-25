package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import workflows.ToDoListFlows;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base{

    @BeforeClass
    @Parameters({"PlatformName"})
    public static void startSession(String PlatformName){
        platform = PlatformName;
        if (platform.equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
        else if (platform.equalsIgnoreCase("mobile"))
            initMobile();
        else if (platform.equalsIgnoreCase("api"))
            initAPI();
        else if (platform.equalsIgnoreCase("electron"))
            initElectron();
        else if (platform.equalsIgnoreCase("desktop"))
            initDesktop();
        else
            throw new RuntimeException("Invalid platform name");
        softAssert = new SoftAssert();
        screen = new Screen();

    }


    public static void   initBrowser(String browserType){
       if (browserType.equalsIgnoreCase("chrome"))
           driver = initChromeDriver();
       else
           throw new RuntimeException("Invalid Browser Type");
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")),TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,Long.parseLong(getData("TimeOut")));
        driver.get(getData("url"));
        driver.manage().window().maximize();
        ManagePages.initNonCommerce();
       screen = new Screen();
        actions = new Actions(driver);

        }

       public static void initMobile() {
           dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
           dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("AppPackage"));
           dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("AppActivity"));
           try {
               mobileDriver = new AndroidDriver(new URL(getData("AppiumServer")), dc);
           } catch (Exception e) {
               System.out.println("Cn Not Connect To Appium Server , See Details " +e) ;
           }
           ManagePages.initFinancialApp();
           mobileDriver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")),TimeUnit.SECONDS);
           wait = new WebDriverWait(mobileDriver,Long.parseLong(getData("TimeOut")));
       }

       public static void initAPI(){
           RestAssured.baseURI = getData("urlAPI");
           httpRequest = RestAssured.given();
       }

    public static void initElectron(){
   System.setProperty("webdriver.chrome.driver", getData("ElectronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary(getData("ElectronPath"));
        dc.setCapability("chromeOptions", opt);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        ManagePages.initToDOListApp();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")),TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,Long.parseLong(getData("TimeOut")));
        actions = new Actions(driver);
    }

    public static void initDesktop(){
        dc.setCapability("app", getData("spotify"));
        try {
            driver = new WindowsDriver(new URL(getData("AppiumServerDesktop")), dc);
        } catch (Exception e) {
            System.out.println("Can Not Connect To Appium Server , See Details " + e);
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")),TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,Long.parseLong(getData("TimeOut")));
        ManagePages.initSpotifyApp();
    }

    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @AfterMethod
    public void afterMethod(){
        if (platform.equalsIgnoreCase("web"))
            driver.get(getData("url"));
        else  if (platform.equalsIgnoreCase("mobile"))
            mobileDriver.launchApp();
        else if (platform.equalsIgnoreCase("electron"))
            initElectron();
    }


    @AfterClass
    public void closeSession() {
        if (!platform.equalsIgnoreCase("api")) {
            if (!platform.equalsIgnoreCase("mobile"))
                driver.quit();
            else
                mobileDriver.quit();
        }
    }




    public static String getData(String nodeName) {
        DocumentBuilder dBuilder;
        Document doc = null;
        File Fxmlfile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(Fxmlfile);
        }
        catch (Exception e){
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }
}
