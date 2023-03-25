package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class MiscellaneousCalc {

    private final AppiumDriver mobileDriver;

    public MiscellaneousCalc(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    ///Annual Rate ;
    @AndroidFindBy(xpath = "//*[@text='Miscellaneous Calculation']")
    public AndroidElement btn_miscCalc;

    @AndroidFindBy(xpath = "//*[@text='Effective Rate Calculator']")
    public AndroidElement btn_effective;

    @AndroidFindBy(id = "nominalAnnualRate")
    public AndroidElement btn_nominal;

    @AndroidFindBy(id = "compoundSpinner")
    public AndroidElement btn_compoundSpinner;

    @AndroidFindBy(xpath = "//*[@text='Semi-Monthly (24/yr)']")
    public AndroidElement btn_SemiMonthly ;

    @AndroidFindBy(id = "effectiveAnnualRate")
    public AndroidElement btn_result ;

    @AndroidFindBy(id = "reset")
    public AndroidElement btn_reset ;

    //Effective Rate:

    @AndroidFindBy(xpath = "//*[@text='EFFECTIVE RATE']")
    public AndroidElement btn_effectivePage ;

    @AndroidFindBy(id = "nominalRate")
    public AndroidElement btn_nominal2 ;

    @AndroidFindBy(id = "compoundingPerPeriod")
    public AndroidElement btn_compounding;

    @AndroidFindBy(id = "periods")
    public AndroidElement btn_numOfPeriods;

    @AndroidFindBy(id = "calc")
    public AndroidElement btn_calculator;

    @AndroidFindBy(id = "effectiveRatePerPeriod")
    public AndroidElement txt_result1;

    @AndroidFindBy(id = "effectiveRatePeriods")
    public AndroidElement txt_result2;

    @AndroidFindBy(id = "effectiveRateCompoundPeriod")
    public AndroidElement txt_result3;

    //nominal Rate:
    @AndroidFindBy(xpath = "//*[@text='NOMINAL RATE']")
    public AndroidElement btn_nominalPage ;

    @AndroidFindBy(id = "effectiveRate")
    public AndroidElement txt_effectiveRate;

    @AndroidFindBy(id = "compoundingPerPeriod")
    public AndroidElement txt_compounding;

    @AndroidFindBy(id = "periods")
    public AndroidElement txt_periods;

    @AndroidFindBy(id = "calc")
    public AndroidElement btn_calc2;

    @AndroidFindBy(xpath = "//*[@text=' Nominal Rate per Period: ']")
    public AndroidElement btn_nominalResult ;

    @AndroidFindBy(xpath = "//*[@text='Effective Rate for 1 Periods: ']")
    public AndroidElement btn_effectivResult ;

    @AndroidFindBy(xpath = "//*[@text=' Rate per Compounding Period: ']")
    public AndroidElement btn_ratePerResult ;



}
