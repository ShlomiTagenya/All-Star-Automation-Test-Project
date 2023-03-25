package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Product1 extends CommonOps {

    @FindBy(xpath = "//div[@class='overview']/div[6]")
    public WebElement nav_prod1;

    @FindBy(id = "product_attribute_1")
    public WebElement btn_processor;

    @FindBy(id = "//div[@class='attributes']/dl/dd[2]")
    public WebElement btn_ram;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    public WebElement btn_hdd;

    @FindBy(id = "product_attribute_4_9")
    public WebElement btn_vista;

    @FindBy(id = "add-to-cart-button-1")
    public WebElement btn_addCart;

    @FindBy(xpath = "//td[@class='quantity']/input")
    public WebElement btn_quantity;

    @FindBy(id = "updatecart")
    public WebElement btn_updateCartt;

    @FindBy(id = "checkout")
    public WebElement btn_checkout;

    @FindBy(id = "termsofservice")
    public WebElement btn_agree;

    @FindBy(xpath = "//div[@class='cart-footer']/div[2]/div/table/tbody/tr[4]/td[2]")
    public WebElement txt_total;
}
