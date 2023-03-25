package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class ContactUs extends CommonOps {


    @FindBy(xpath = "//div[@class='footer-upper']//ul/li[6]/a")
    public WebElement btn_contactUs;

    @FindBy(id = "FullName")
    public WebElement txt_fullName;

    @FindBy(id = "Email")
    public WebElement txt_email;

    @FindBy(id = "Enquiry")
    public WebElement txt_enquiry;

    @FindBy(xpath = "//button[@name='send-email']")
    public WebElement btn_submit;

    @FindBy(xpath = "//div[@class='page-body']//div[2]")
    public WebElement txt_msg;


}
