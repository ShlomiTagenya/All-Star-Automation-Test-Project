package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class Pivot {

    private final AppiumDriver mobileDriver;

    public Pivot(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='Stock Calculator']")
    public AndroidElement btn_stockCalc;

    @AndroidFindBy(xpath = "//*[@text='Pivot Point Calculator']")
    public AndroidElement btn_pivotPage;

    @AndroidFindBy(id = "dayHigh")
    public AndroidElement txt_dayHigh;

    @AndroidFindBy(id = "dayLow")
    public AndroidElement txt_dayLow;

    @AndroidFindBy(id = "prevOpen")
    public AndroidElement txt_prevOpen;

    @AndroidFindBy(id = "calc")
    public AndroidElement btn_calculator;

    @AndroidFindBy(xpath = "//*[@resource-id='com.financial.calculator:id/text1']")
    public List<AndroidElement> rows_textResult;

    @AndroidFindBy(xpath = "//*[@resource-id='com.financial.calculator:id/text2']")
    public List<AndroidElement> rows_numResult;
}
