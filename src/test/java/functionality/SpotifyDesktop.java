package functionality;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.SpotifyFlows;


@Listeners(utilities.Listeners.class)
public class SpotifyDesktop extends CommonOps {


    @Test(description = "Test 001 - Login To Spotify App")
    @Description("This Test Verifies Login To Spotify App")
    public static void test01_verifyLogin() {
        SpotifyFlows.loginToApp();
        Verifications.visibilityOfElement(mainSpotify.left_menu);
    }

    @Test(description = "Test 002 - search Song By Name Artist ")
    @Description("This Test Verifies  Search & Find Song By Name Artist")
    public static void test02_verifySearch() {
        SpotifyFlows.search();
        Verifications.verifyTextInElement(searchSong.text_nameSong, "Diamonds");
    }

    @Test(description = "Test 003 - Verify Your Library Icon ")
    @Description("This Test Verifies Open  Your Library Icon")
    public static void test03_verifyLibraryPage() {
        UIActions.click(yourLibrary.btn_yourLibrary);
        Verifications.visibilityOfElement(yourLibrary.btn_playlist);
    }

    @Test(description = "Test 004 - Verify Options  Order By Alphabetical ")
    @Description("This Test Verifies  Options  Order By Alphabetical")
    public static void test04_verifyOrderByButton() {
        SpotifyFlows.orderByOptions();
       Verifications.enableElement(yourLibrary.btn_alphabetical);
    }

    @Test(description = "Test 005 - Verify Open Created Playlist Icon  ")
    @Description("This Test Verifies Open  Created Playlist Icon l")
    public static void test05_verifyOpenCreatedPlaylistPage() {
        UIActions.click(createPlaylist.btn_createPlaylist);
        Verifications.visibilityOfElement(createPlaylist.btn_mainCreate);
    }

    @Test(description = "Test 006 - Verify Name Song one In The List Playlist  ")
    @Description("This Test Search Artist Name And Verifies The Name Of Song One In Playlist")
    public static void test06_verifySongOneNameInPlaylist() {
        UIActions.click(createPlaylist.btn_createPlaylist);
        UIActions.updateText(createPlaylist.btn_search2, "Drake");
        Verifications.verifyTextInElement(createPlaylist.btn_song1, "God's Plan");
    }

    @Test(description = "Test 007 - Verify Open Your Episodes Icon  ")
    @Description("This Test Open Your Episodes Icon End Verify The Page Is Appeared")
    public static void test07_verifyOpenYourEpisodesIcon() {
        UIActions.click(yourEpisodes.btn_YourEpisodes);
        Verifications.visibilityOfElement(yourEpisodes.btn_YourEpisodes);
    }

    @Test(description = "Test 008 - Verify User Name Icon  ")
    @Description("This Test verifies The User Name Icon ")
    public static void test08_verifyUserIcon() {
        UIActions.click(home.btn_Home);
        Verifications.verifyTextInElement(home.btn_userIcon, getData("UserIcon"));
    }

    @Test(description = "Test 011 - Verify The Profile Name  ")
    @Description("This Test Open Profile And verifies The Profile Name ")
    public static void test09_verifyProfileName() {
       SpotifyFlows.profileName();
       Verifications.visibilityOfElement(userIcon.btn_profileName);
    }

    @Test(description = "Test 012 - Verify Add Private Session ")
    @Description("This Test Add Private Session And Verifies Is Displayed ")
    public static void test10_verifyAddPrivateSession() {
        SpotifyFlows.addPrivateSession();
     Verifications.visibilityOfElement(privateSession.btn_privateSession);
    }

    @Test(description = "Test 013 - Verify Open Settings Page ")
    @Description("This Test verifies The Settings App Page Is Open ")
    public static void test11_verifySettingsApp() {
        SpotifyFlows.settingsApp();
        Verifications.visibilityOfElement(settingsApp.btn_streamingQuality);
    }

    @Test(description = "Test 014 - Verify Number Of Streaming Quality In List  ")
    @Description("This Test verifies The Number In Streaming Quality List")
    public static void test12_verifyNumberOfStreamingQualityList() {
        SpotifyFlows.settingsApp();
        Verifications.numberOfElements(settingsApp.row_streamingQuality,2);
    }

    @Test(description = "Test 015 - Verify Log Out From App ")
    @Description("This Test verifies Log Out Applications")
    public static void test13_verifyLogOut() {
    SpotifyFlows.logOut();
     Verifications.visibilityOfElement(loginPage.text_userName);
    }

    @Test(description = "Test 016 - Verify Log In App ")
    @Description("This Test verifies Log In Application (--Use Sikuli Tool)")
    public static void test14_verifyLogInSikuli() throws FindFailed {
    SpotifyFlows.loginSikuli();
        Verifications.visibilityOfElement(mainSpotify.left_menu);
    }


    @Test(description = "Test 018- Verify Log Out App ")
    @Description("This Test Log Out And verifies LogIn Page Appeared (--Use Sikuli Tool)")
    public static void test15_verifyLogOut() throws FindFailed {
     SpotifyFlows.logoOutSikuli();
     Verifications.visibilityOfElement(loginPage.btn_login);
    }



}
