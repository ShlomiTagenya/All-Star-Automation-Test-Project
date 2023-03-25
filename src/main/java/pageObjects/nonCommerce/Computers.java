package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Computers extends CommonOps {

    @FindBy(xpath = "//div[@class='header-menu']/ul/li")
    public WebElement btn_computers;

    @FindBy(xpath = "//div[@class='header-menu']/ul/li[1]/ul/li[1]/a")
    public WebElement txt_desktops;

    @FindBy(xpath = "//div[@class='header-menu']/ul/li[1]/ul/li[2]/a")
    public WebElement txt_notbooks;

    @FindBy(xpath = "//div[@class='header-menu']/ul/li[1]/ul/li[2]/a")
    public WebElement txt_software;
}
