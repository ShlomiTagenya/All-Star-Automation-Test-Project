package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Lenovo_Item1 extends CommonOps {

    @FindBy(id = "product_enteredQuantity_3")
    public WebElement btn_quantity;

    @FindBy(id = "add-to-cart-button-3")
    public  WebElement btn_add;

    @FindBy(xpath = "//div[@class='bar-notification success']")
    public WebElement txt_cart;

    @FindBy(xpath = "//span[@title='Close']")
    public WebElement btn_close;

    @FindBy(xpath = "//span[@title='Close']")
    public WebElement btn_shop;


}
