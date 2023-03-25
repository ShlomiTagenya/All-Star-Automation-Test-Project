package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class YourLibrary extends CommonOps {

    @FindBy(name = "Your Library")
    public WebElement btn_yourLibrary;

    @FindBy(name = "Playlists")
    public WebElement btn_playlist;

    @FindBy(name = "Artists")
    public WebElement btn_artists;

    @FindBy(name = "Recently added")
    public WebElement btn_recently;

    @FindBy(name = "Alphabetical")
    public WebElement btn_alphabetical;
}
