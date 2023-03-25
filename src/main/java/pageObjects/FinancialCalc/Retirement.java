package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class Retirement {

    public final AppiumDriver mobileDriver;

    public Retirement(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@text='Retirement/401K Calculator']")
    public AndroidElement btn_retirement;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
    public List<AndroidElement> list_retirement;

    @AndroidFindBy(xpath = "//*[@text='College Savings Calculator']")
    public AndroidElement btn_college;
}
