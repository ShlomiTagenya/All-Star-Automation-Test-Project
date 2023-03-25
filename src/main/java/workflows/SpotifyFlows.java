package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.sikuli.script.FindFailed;

import utilities.CommonOps;

public class SpotifyFlows extends CommonOps {

    @Step("Business Flow : Login App")
    public static void loginToApp()  {
        UIActions.clear(loginPage.text_userName);
       UIActions.updateText(loginPage.text_userName, getData("spotifyUser"));
        UIActions.updateText(loginPage.text_password, getData("spotifyPass"));
        UIActions.click(loginPage.btn_login);
    }

    @Step("Business Flow : Search Artist")
    public static void search(){
        UIActions.click(mainSpotify.btn_search);
        UIActions.updateText(searchSong.text_search, "Rihanna");
    }


    @Step("Business Flow : Order By Artist")
    public static void orderByOptions(){
        UIActions.click(yourLibrary.btn_yourLibrary);
        UIActions.click(yourLibrary.btn_artists);
        UIActions.click(yourLibrary.btn_recently);
    }

    @Step("Business Flow : Profile Name")
    public static void profileName(){
        UIActions.click(home.btn_Home);
        UIActions.click(home.btn_userIcon);
        UIActions.click(userIcon.btn_profile);

    }

    @Step("Business Flow : Private Session")
    public static void addPrivateSession(){
        UIActions.click(home.btn_Home);
        UIActions.click(home.btn_userIcon);
        UIActions.click(privateSession.btn_privateSession);
    }

    @Step("Business Flow : Settings App")
    public static void settingsApp(){
        UIActions.click(home.btn_Home);
        UIActions.click(home.btn_userIcon);
        UIActions.click(settingsApp.btn_settings);
    }


    @Step("Business Flow : Log Out")
    public static void logOut(){
        UIActions.click(home.btn_Home);
        UIActions.click(home.btn_userIcon);
        UIActions.click(logOutSpotify.btn_logOutApp);
    }

    @Step("Business Flow : Log In (Use Sikuli Tool)")
    public static void loginSikuli() throws FindFailed {
        screen.type(getData("ImageRepo")+"Password.png",getData("spotifyPass"));
        screen.click(getData("ImageRepo")+"logApp.png");

    }


    @Step("Business Flow : Edit Profile Name (Use Sikuli Tool)")
    public static void logoOutSikuli() throws FindFailed {
        screen.click(getData("ImageRepo")+"userIcon.png");
        screen.click(getData("ImageRepo")+"logOutApp.png");
    }






}
