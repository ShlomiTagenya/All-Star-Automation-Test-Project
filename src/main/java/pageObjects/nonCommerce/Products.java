package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Products extends CommonOps {

    @FindBy(xpath = "//div[@class='products-wrapper']")
    public WebElement products;
}
