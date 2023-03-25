package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class TvmCalc {

    private final AppiumDriver mobileDriver;

    public TvmCalc(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='TVM Calculator']")
    public AndroidElement tvm_icon;

    @AndroidFindBy(id = "pvInput")
    public AndroidElement field_pv;

    @AndroidFindBy(id = "pmtInput")
    public AndroidElement field_pmt;

    @AndroidFindBy(id = "fvInput")
    public AndroidElement field_fv;

    @AndroidFindBy(id = "rateInput")
    public AndroidElement field_rate;

    @AndroidFindBy(id = "periodInput")
    public AndroidElement field_period;

    @AndroidFindBy(id = "rbBegin")
    public AndroidElement btn_beginning;

    @AndroidFindBy(id = "rbThree")
    public AndroidElement btn_monthly;

    @AndroidFindBy(id = "PV")
    public AndroidElement btn_pv;

    @AndroidFindBy(id = "PMT")
    public AndroidElement btn_pmt;

    @AndroidFindBy(id = "FV")
    public AndroidElement btn_fv;

    @AndroidFindBy(id = "rate")
    public AndroidElement btn_rate;

    @AndroidFindBy(id = "periods")
    public AndroidElement btn_period;

    @AndroidFindBy(id = "save")
    public AndroidElement btn_save;

    @AndroidFindBy(id = "history")
    public AndroidElement btn_history;

    @AndroidFindBy(xpath = "//*[@class='android.widget.LinearLayout' and ./*[@id='colorStrip']]")
    public List<AndroidElement> list_history;

    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageButton']")
    public AndroidElement btn_back;

    @AndroidFindBy(xpath = "//*[@text='PV=3; PMT=6; FV=22; I/YR=10; N=5; Compound=Monthly; mode=Beginning']")
    public AndroidElement btn_tvm;

    @AndroidFindBy(xpath = "//*[@text='Delete']")
    public AndroidElement btn_delete;

    @AndroidFindBy(id = "reset")
    public AndroidElement btn_reset;





}
