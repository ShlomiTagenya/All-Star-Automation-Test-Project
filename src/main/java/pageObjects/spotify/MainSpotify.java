package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;


public class MainSpotify extends CommonOps {

    @FindBy(name = "Main")
    public WebElement left_menu;


    @FindBy(name = "Search")
    public WebElement btn_search;



}
