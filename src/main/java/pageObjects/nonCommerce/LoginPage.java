package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class LoginPage extends CommonOps {

    @FindBy(linkText = "Log in")
    public WebElement btn_logIn;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement btn_submit;

    @FindBy(linkText= "Log out")
    public WebElement btn_logOut;


}
