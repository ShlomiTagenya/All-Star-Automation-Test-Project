package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class YoutubeIcon extends CommonOps {

    @FindBy(xpath = "//div[@class='footer-block follow-us']/div/ul/li[4]")
    public WebElement fb_icon;
}
