package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class IRRCalc {

    public final AppiumDriver mobileDriver;

    public IRRCalc(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='IRR NPV Calculator']")
    public AndroidElement btn_irr;

    @AndroidFindBy(id = "note")
    public AndroidElement btn_note;

    @AndroidFindBy(xpath = "//*[@id='message']")
    public AndroidElement txt_noteMsg;

    @AndroidFindBy(id = "button1")
    public AndroidElement btn_ok;

    @AndroidFindBy(id = "delete")
    public List<AndroidElement> list_cash;

    @AndroidFindBy(id = "delete")
    public AndroidElement btn_delete;

    @AndroidFindBy(id = "add")
    public AndroidElement btn_add;

    @AndroidFindBy(id = "reset")
    public AndroidElement btn_reset;
}
