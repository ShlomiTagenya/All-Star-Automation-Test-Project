package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class SearchSong extends CommonOps {

    @FindBy(name = "What do you want to listen to?")
    public WebElement text_search;

    @FindBy(name = "Diamonds")
    public WebElement text_nameSong;

    @FindBy(name = "John Lennon")
    public WebElement btn_artist;

    @FindBy(name = "Save to Your Library")
    public WebElement btn_saveToLibrary;

    @FindBy(name = "By John Lennon")
    public WebElement text_add;

    @FindBy(name = "Remove from Your Library")
    public WebElement btn_removeFromLibrary;







}
