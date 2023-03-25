package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RoiCalc {

    private final AppiumDriver mobileDriver;

    public RoiCalc(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='ROI Calculator']")
    public AndroidElement btn_roiCalc;

    @AndroidFindBy(id = "originalInvestment")
    public AndroidElement txt_originalInv;

    @AndroidFindBy(id = "investmentReturn" )
    public AndroidElement txt_endingInv;

    @AndroidFindBy(id = "year" )
    public AndroidElement txt_termYear;

    @AndroidFindBy(id = "month" )
    public AndroidElement txt_terMonth;

    @AndroidFindBy(id = "cbInvestmentPeriod" )
    public AndroidElement btn_selectInv;

    @AndroidFindBy(id = "fromDate" )
    public AndroidElement btn_fromDate;

    @AndroidFindBy(id = "prev" )
    public AndroidElement btn_prev;

    @AndroidFindBy(xpath = "//*[@text='10']")
    public AndroidElement btn_10Aug;

    @AndroidFindBy(id = "button1" )
    public AndroidElement btn_confirm;

    @AndroidFindBy(id = "toDate" )
    public AndroidElement btn_toDate;

    @AndroidFindBy(id = "next" )
    public AndroidElement btn_next;

    @AndroidFindBy(xpath = "//*[@text='25']")
    public AndroidElement btn_25mMay;

    @AndroidFindBy(id = "calc" )
    public AndroidElement btn_calc;

    @AndroidFindBy(id = "compoundAnnualizedROI" )
    public AndroidElement txt_compoundRoi;

    @AndroidFindBy(id = "reset" )
    public AndroidElement btn_reset;
}
