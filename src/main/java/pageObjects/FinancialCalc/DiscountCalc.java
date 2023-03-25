package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class DiscountCalc {

    private final AppiumDriver mobileDriver;

    public DiscountCalc(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='Discount and Tax Calculator']")
    public AndroidElement btn_discountCalc;

    @AndroidFindBy(id = "priceInput")
    public AndroidElement txt_priceInput;

    @AndroidFindBy(id = "percentOffResult")
    public AndroidElement txt_percentOffResult;

    @AndroidFindBy(id = "taxInput")
    public AndroidElement txt_taxInput;

    @AndroidFindBy(id = "percentOffInput")
    public AndroidElement txt_percentOffInput;

    @AndroidFindBy(id = "originalPrice")
    public AndroidElement txt_originalPrice;

    @AndroidFindBy(id = "taxResult")
    public AndroidElement txt_taxResult;

    @AndroidFindBy(id = "youPaidResult")
    public AndroidElement txt_youPaidResult;

    @AndroidFindBy(id = "youSaveResult")
    public AndroidElement txt_youSaveResult;

    @AndroidFindBy(id = "additionalDiscount")
    public AndroidElement btn_additionalDiscount;

    @AndroidFindBy(id = "additionalDiscountInput")
    public AndroidElement btn_additionalUpdate;

    @AndroidFindBy(id = "additionalOffResult")
    public AndroidElement btn_additionalOffResult;





}
