package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class YourEpisodes extends CommonOps {

    @FindBy(name = "Your Episodes")
    public WebElement btn_YourEpisodes;

    @FindBy(name = "Search in playlist")
    public WebElement btn_SearchInPlaylist;
}
