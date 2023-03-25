package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Top_Products extends CommonOps {

    @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']")
    public WebElement nav;

    @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div[2]/div[1]")
    public WebElement btn_prod1;

    @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div[2]/div[2]")
    public WebElement btn_prod2;

    @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div[2]/div[3]")
    public WebElement btn_prod3;

    @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div[2]/div[4]")
    public WebElement btn_prod4;
}
