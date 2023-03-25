package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Product2 extends CommonOps {

    @FindBy(xpath = "//div[@class='overview']")
    public WebElement nav_prod2;

    @FindBy(id = "product_enteredQuantity_4")
    public   WebElement txt_quantity2;

    @FindBy(id= "add-to-wishlist-button-4")
    public   WebElement btn_addWish;

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    public WebElement btn_check;

    @FindBy(xpath = "//button[@class='remove-btn']")
    public WebElement btn_remove;

    @FindBy(xpath = "//div[@class='page-body']/div")
    public WebElement txt_empty;

}
