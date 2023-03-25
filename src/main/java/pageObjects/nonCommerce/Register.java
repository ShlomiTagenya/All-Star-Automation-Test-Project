package pageObjects.nonCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

public class Register extends CommonOps {

   @FindBy(xpath = "//a[@class='ico-register']")
    public WebElement btn_register;

    @FindBy(id = "gender-male")
    public WebElement btn_gender;

   @FindBy(id = "FirstName")
    public WebElement txt_fName;

   @FindBy(id = "LastName")
    public WebElement txt_lLame;

   @FindBy(name = "DateOfBirthDay")
   public WebElement btn_day;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement btn_month;

    @FindBy(name = "DateOfBirthYear")
    public WebElement btn_year;

    @FindBy(id = "Company")
    public WebElement txt_company;

    @FindBy(id = "Email")
    public WebElement txt_email;

    @FindBy(id = "Password")
    public WebElement txt_pass;

    @FindBy(id = "ConfirmPassword")
    public WebElement txt_confirmPass;

    @FindBy(id = "register-button")
    public WebElement btn_submit;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement txt_msgError;



}
