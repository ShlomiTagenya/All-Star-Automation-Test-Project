package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class SocialMedia extends CommonOps {

    @FindBy(xpath = "//div[@class='footer-block follow-us']")
    public WebElement follows_us;

    @FindBy(xpath = "//div[@class='footer-block follow-us']/div/ul/li[1]")
    public WebElement facebook_icon;

    @FindBy(xpath = "//div[@class='footer-block follow-us']/div/ul/li[2]")
    public WebElement twitter_icon;

    @FindBy(xpath = "//div[@class='footer-block follow-us']/div/ul/li[4]")
    public WebElement youtube_icon;
}
