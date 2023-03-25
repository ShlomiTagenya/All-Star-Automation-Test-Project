package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class Search {

    public final AppiumDriver mobileDriver;

    public Search(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(id = "search")
    public AndroidElement btn_search;

    @AndroidFindBy(xpath = "//*[@id='search_src_text']")
    public AndroidElement txt_search;

    @AndroidFindBy(xpath = "//*[@id='search_go_btn']")
    public AndroidElement btn_go;

    @AndroidFindBy(xpath = "//*[@text='TVM Calculator']")
    public AndroidElement txt_tvm;

    @AndroidFindBy(xpath = "//*[@text='Credit Card Payoff Calculator']")
    public AndroidElement txt_credit;

    @AndroidFindBy(xpath = "//*[@text='ROI Calculator']")
    public AndroidElement txt_roi;

    @AndroidFindBy(xpath = "//*[@id='text1']")
    public List<AndroidElement> rows;
}
