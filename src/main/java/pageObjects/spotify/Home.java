package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Home extends CommonOps {

    @FindBy(name = "Home")
    public WebElement btn_Home;

    @FindBy(name = "Shlomitagenya Shlomitagenya")
    public WebElement btn_userIcon;
}
