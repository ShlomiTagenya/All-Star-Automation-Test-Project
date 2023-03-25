package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

import java.util.List;

public class Categories extends CommonOps {

    @FindBy(xpath = "//div[@class='header-menu']//ul")
    public List<WebElement> nav_categories;
}
