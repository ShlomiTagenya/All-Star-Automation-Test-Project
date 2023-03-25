package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Search extends CommonOps {


    @FindBy(xpath= "//input[@id='small-searchterms']")
    public WebElement txt_search;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btn_search;

    @FindBy(linkText = "Lenovo IdeaCentre 600 All-in-One PC")
    public WebElement product_item;

    @FindBy(xpath = "//div[@class='product-name']")
    public WebElement Product_name;
}
