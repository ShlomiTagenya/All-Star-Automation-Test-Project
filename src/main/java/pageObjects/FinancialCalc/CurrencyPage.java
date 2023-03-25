package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CurrencyPage {

    private final AppiumDriver mobileDriver;

    public CurrencyPage(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver,Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='Currency Converter']")
    public AndroidElement btn_currency;

    @AndroidFindBy(id = "fromCurrencySpinner")
    public AndroidElement btn_from;

    @AndroidFindBy(xpath = "//*[@text='South African Rand:ZAR']")
    public AndroidElement btn_rand;

    @AndroidFindBy(id = "ToCurrencySpinner")
    public AndroidElement btn_to;

    @AndroidFindBy(xpath = "//*[@text='Russian Roubel:RUB']")
    public AndroidElement btn_rubel;

    @AndroidFindBy(id = "exchRateInput")
    public AndroidElement btn_rate;

    @AndroidFindBy(id = "amountInput")
    public AndroidElement btn_amount;

    @AndroidFindBy(id = "converterResult")
    public AndroidElement txt_covert;

    @AndroidFindBy(id = "reverseResult")
    public AndroidElement txt_reverse;

    @AndroidFindBy(id = "switcher")
    public AndroidElement btn_switcher;

}
