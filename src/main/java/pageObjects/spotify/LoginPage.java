package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;


public class LoginPage extends CommonOps {

    @FindBy(name = "Email or username")
    public WebElement text_userName;

    @FindBy(name = "Password")
    public WebElement text_password;

    @FindBy(name = "LOG IN")
    public WebElement btn_login;
}
