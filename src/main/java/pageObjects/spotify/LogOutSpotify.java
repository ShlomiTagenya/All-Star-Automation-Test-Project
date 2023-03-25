package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;


public class LogOutSpotify extends CommonOps {

    @FindBy(name = "Log out")
    public WebElement btn_logOutApp;
}
