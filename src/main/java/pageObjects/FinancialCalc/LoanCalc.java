package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoanCalc {

    private final AppiumDriver mobileDriver;

    public LoanCalc(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='Loan Calculator']")
    public AndroidElement btn_loan;

    @AndroidFindBy(id = "loanAmount")
    public AndroidElement txt_loanAmount;


    @AndroidFindBy(id = "interestRate")
    public AndroidElement txt_loanRate;


    @AndroidFindBy(id = "loanYear")
    public AndroidElement txt_TermYears;


    @AndroidFindBy(id = "loanMonth")
    public AndroidElement txt_TermMonths;

    @AndroidFindBy(id = "extraPerMonth")
    public AndroidElement txt_extraMonth;

    @AndroidFindBy(id = "calcAmount")
    public AndroidElement btn_calcValue;

    @AndroidFindBy(xpath = "//*[@text='Property price']")
    public AndroidElement txt_propertyPrice;

    @AndroidFindBy(xpath = "//*[@text='Down payment']")
    public AndroidElement txt_downPayment;

    @AndroidFindBy(id = "rbAmount")
    public AndroidElement btn_amount;

    @AndroidFindBy(id = "button1")
    public AndroidElement btn_confirm;

    @AndroidFindBy(id = "calc")
    public AndroidElement btn_calculator;

    @AndroidFindBy(xpath = "//*[@text='ADVANCED']")
    public AndroidElement btn_advanced;

    @AndroidFindBy(id = "propertyTax")
    public AndroidElement btn_tax;

    @AndroidFindBy(id = "insurance")
    public AndroidElement btn_insurance;

    @AndroidFindBy(id = "pmi")
    public AndroidElement btn_pmi;

    @AndroidFindBy(xpath = "//*[@text='BASIC']")
    public AndroidElement btn_basic;

}
