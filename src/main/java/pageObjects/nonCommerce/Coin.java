package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Coin extends CommonOps {

    @FindBy(id = "customerCurrency")
    public WebElement type_coin;
}
