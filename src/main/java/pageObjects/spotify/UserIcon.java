package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class UserIcon extends CommonOps {

    @FindBy(name = "Profile")
    public WebElement btn_profile;

    @FindBy(name = "Shlomitagenya")
    public WebElement btn_profileName;

}
