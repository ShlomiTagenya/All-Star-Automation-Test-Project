package pageObjects.spotify;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class PrivateSession extends CommonOps {

    @FindBy(name = "Private session")
    public WebElement btn_privateSession;
}
