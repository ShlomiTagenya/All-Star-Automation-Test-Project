package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Product4 extends CommonOps {

    @FindBy(xpath = "//div[@class='overview']")
    public WebElement nav_prod4;

    @FindBy(id = "giftcard_43_RecipientName")
    public WebElement txt_recipientName;

    @FindBy(id = "giftcard_43_RecipientEmail")
    public WebElement txt_recipientEmail;

    @FindBy(id = "giftcard_43_RecipientName")
    public WebElement name;

    @FindBy(id = "giftcard_43_SenderName")
    public WebElement txt_name;

    @FindBy(id = "giftcard_43_SenderEmail")
    public WebElement txt_email;

    @FindBy(id = "giftcard_43_Message")
    public WebElement txt_msg;

    @FindBy(xpath = "//div[@class='product-price']/span")
    public WebElement txt_price;

    @FindBy(id = "product_enteredQuantity_43")
    public WebElement btn_quantity;

    @FindBy(id = "add-to-cart-button-43")
    public WebElement btn_addToCart;

    @FindBy(xpath = "//div[@id='bar-notification']/div/span")
    public WebElement btn_x;

    @FindBy(xpath = "//div[@class='table-wrapper']/table/tbody/tr/td[3]/a")
    public WebElement pro_name;

    @FindBy(xpath = "//div[@class='table-wrapper']/table/tbody/tr/td[4]/span")
    public WebElement txt_priceInCart;

    @FindBy(xpath = "//input[@value='2']")
    public WebElement txt_quantityInCart;

    @FindBy(xpath = "//div[@class='table-wrapper']/table/tbody/tr/td[6]/span")
    public WebElement txt_totalInCart;




}
