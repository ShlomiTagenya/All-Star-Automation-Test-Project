package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

import java.util.List;

public class SettingsApp extends CommonOps {

    @FindBy(name = "Settings")
    public WebElement btn_settings;

    @FindBy(name = "Streaming quality")
    public WebElement btn_streamingQuality;

    @FindBy(name = "Streaming quality")
    public List<WebElement> row_streamingQuality;
}
