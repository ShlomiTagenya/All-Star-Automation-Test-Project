package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Product3 extends CommonOps {

    @FindBy(xpath = "//div[@class='product-essential']")
    public WebElement nav_prod3;

    @FindBy(xpath = "//button[@class='button-2 email-a-friend-button']")
    public WebElement btn_emailFriend;

    @FindBy(className = "friend-email")
    public WebElement  txt_FriendsEmail;

    @FindBy(id = "YourEmailAddress")
    public WebElement txt_myEmail;

    @FindBy(id = "PersonalMessage")
    public WebElement btn_massage;

    @FindBy(name = "send-email")
    public WebElement btn_send;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement txt_errorMsg;
}
