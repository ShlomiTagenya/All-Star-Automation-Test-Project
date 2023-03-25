package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

import java.util.List;

public class Survey extends CommonOps {

    @FindBy(xpath = "//div[@class='home-page-polls']/div/ul")
    public WebElement get_survey;

    @FindBy(xpath = "//div[@class='home-page-polls']/div/ul")
    public List<WebElement> list_survey;

    @FindBy(xpath = "//div[@class='home-page-polls']/div/ul/li[1]")
    public WebElement answer_1;

    @FindBy(xpath = "//div[@class='home-page-polls']/div/ul/li[2]")
    public WebElement answer_2;

    @FindBy(xpath = "//div[@class='home-page-polls']/div/ul/li[3]")
    public WebElement answer_3;

    @FindBy(xpath = "//div[@class='home-page-polls']/div/ul/li[4]")
    public WebElement answer_4;

    @FindBy(id = "vote-poll-1")
    public WebElement btn_vote;

    @FindBy(id = "pollanswers-1")
    public WebElement checkbox_1;

    @FindBy(id = "pollanswers-2")
    public WebElement checkbox_2;

    @FindBy(id = "pollanswers-3")
    public WebElement checkbox_3;

    @FindBy(id = "pollanswers-4")
    public WebElement checkbox_4;

    @FindBy(xpath = "//div[@class='poll-vote-error']")
    public WebElement txt_error;


}
