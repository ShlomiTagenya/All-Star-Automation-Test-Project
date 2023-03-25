package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

import java.util.List;

public class CellPhones extends CommonOps {

    @FindBy(xpath = "//div[@class='header-menu']/ul/li[2]")
    public WebElement btn_elect;

    @FindBy(xpath = "//div[@class='header-menu']/ul/li[2]/ul/li[2]")
    public WebElement cell_phones;

    @FindBy(id = "products-orderby")
    public WebElement sort_by;

    @FindBy(xpath= "//div[@class='item-grid']//div//div[3]/div")
    public List<WebElement> txt_price;

    @FindBy(xpath = "//div[@class='prices']")
    public WebElement txt_details;

}
