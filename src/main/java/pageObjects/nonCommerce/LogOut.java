package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class LogOut extends CommonOps {

    @FindBy(xpath = "//div[@class='header-links']//ul//li[1]")
    public WebElement btn_register;

    @FindBy(xpath = "//div[@class='header-links']//ul//li[2]")
    public WebElement btn_logout;

    @FindBy(xpath = "//div[@class='header-links']//ul//li[3]")
    public WebElement btn_wishlist;

    @FindBy(xpath = "//div[@class='header-links']//ul//li[4]")
    public WebElement btn_shop;
}
