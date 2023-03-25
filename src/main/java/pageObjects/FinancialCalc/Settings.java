package pageObjects.FinancialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class Settings {

    private final AppiumDriver mobileDriver;

    public Settings(AppiumDriver mobileDriver){
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageButton']" )
    public AndroidElement left_Menu;

    @AndroidFindBy(xpath = "//*[@text='Settings']" )
    public AndroidElement btn_settings;

    @AndroidFindBy(xpath = "//*[@text='Green']" )
    public AndroidElement txt_green;

    @AndroidFindBy(xpath = "//*[@text='Toolbar color for white background']" )
    public AndroidElement btn_color;

    @AndroidFindBy(xpath = "//*[@text='Blue']" )
    public AndroidElement btn_blue;

    @AndroidFindBy(xpath = "//*[@text='Blue']" )
    public AndroidElement txt_blue;

    @AndroidFindBy(id = "text")
    public List<AndroidElement> rows_settings;

    @AndroidFindBy(xpath = "//*[@text='Grid']")
    public AndroidElement btn_grid;

    @AndroidFindBy(id = "text1")
    public List<AndroidElement> row_grid;

    @AndroidFindBy(xpath = "//*[@text='Grid']" )
    public AndroidElement txt_grid;


}
