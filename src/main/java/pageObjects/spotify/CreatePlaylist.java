package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class CreatePlaylist extends CommonOps {

    @FindBy(name = "Create Playlist")
    public WebElement btn_createPlaylist;

    @FindBy(name = "Choose photo")
    public WebElement btn_mainCreate;

    @FindBy(name = "Search for songs or episodes")
    public WebElement btn_search2;

    @FindBy(name = "God's Plan")
    public WebElement btn_song1;

    @FindBy(name = "Date added")
    public WebElement btn_dateAdded;
}
