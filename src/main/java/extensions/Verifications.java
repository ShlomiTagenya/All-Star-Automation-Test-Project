package extensions;

import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    @Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("Verify Text In Element")
    public static void verifyTextInElement2(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getAttribute("value"), expected);
    }


    @Step("Element Disabled")
    public static void visibilityOfElement(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isDisplayed());
    }

    @Step("Element Not Disabled")
    public static void enableElement(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isEnabled());
    }




    @Step("Verify Visibility Of Elements")
    public static void visibilityOfElements(List<WebElement> elems){
        for (WebElement elem : elems){
            assertTrue(elem.isDisplayed(),"Sorry " + elem.getText() + "Not Displayed");
        }
    }


    @Step("verify Number Of Elements")
    public static void  numberOfElements(List<WebElement> elems, int expected){
        for (WebElement elem : elems){
            assertEquals(elems.size(), expected);
        }
    }

    @Step("verify Names Of Elements")
    public static void  visibilityText(List<WebElement> elems, String expected){
        for (WebElement elem : elems){
            assertEquals(elem.getText(), expected);
        }
    }

    @Step("verify Text And Click")
    public static void  visibilityTextAndClick(List<WebElement> elems, String expected){
        for (WebElement elem : elems){
           if (elem.getText().equalsIgnoreCase(expected))
               elem.click();
           break;
        }
    }


    @Step("Verify Element Visually")
    public static void visualElement(String expectedImageName){
     try {
         screen.find(getData("ImageRepo")+expectedImageName+".png");
     }
     catch (FindFailed findFailed){
         System.out.println("Error Comparing Image File:"+findFailed);
         fail("Error Comparing Image File:" +findFailed);
     }
    }

    @Step("Focus On New Tab")
    public static void newTab(String expected){
        Set<String> winHandles = driver.getWindowHandles();
        for (String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            if (driver.getCurrentUrl().equals(expected))
                break;
        }
    }

    @Step("Radio Button Options")
    public static void checkBoxOptions(List<WebElement> elems,String expected) {
        for (WebElement elem : elems) {
            if (elem.getText().equals(expected))
                elem.click();
            break;
        }
    }

  ////*************---------------------------------------------------------Mobile--------------------------------------------------------------------------------**************
    @Step("verify Number Of Elements")
    public static void  numberOfElementsAndroid(List<AndroidElement> elems, int expected){
        for (WebElement elem : elems){
            assertEquals(elems.size(), expected);
        }
    }

    @Step("verify Text And Click")
    public static void  visibilityTextAndClickAndroid(List<AndroidElement> elems, String expected){
        for (WebElement elem : elems){
            if (elem.getText().equalsIgnoreCase(expected))
                elem.click();
            break;
        }
    }

    @Step("Verify Visibility Of Elements")
    public static void visibilityOfAndroidElements(List<AndroidElement> elems){
        for (WebElement elem : elems){
            assertTrue(elem.isDisplayed(),"Sorry " + elem.getText() + "Not Displayed");
        }
    }



    ////*************---------------------------------------------------------REST API--------------------------------------------------------------------------------**************
    @Step("Verify Text Actual with Text Expected ")
    public static void verifyText(String actual,String expected){
        assertEquals(actual,expected);
    }

    @Step("Verify Number Actual with Number Expected")
    public static void verifyNumber(int actual, int expected){
        assertEquals(actual,expected);
    }



}
