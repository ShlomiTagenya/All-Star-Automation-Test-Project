package extensions;


import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class UIActions extends CommonOps {

    @Step("Click On Element")
    public static void click(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Clear TextOn Element")
    public static void clear(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.clear();
    }

    @Step("Update Text Element")
    public static void updateText(WebElement elem,String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Insert Key")
    public static void insertKey(WebElement elem, Keys value){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step("Update Text Element As Human")
    public static void updateTextHuman(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch : text.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch+ "");
        }
    }




    @Step("Update DropDown Element")
    public static void updateDropDown(WebElement elem,String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }




    @Step("Mouse Hover Element")
    public static void mouseHover(WebElement elem1, WebElement elem2){
        actions.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }


    @Step("Mouse Hover Element")
    public static void mouseHoverNoClick(WebElement elem1){
        actions.moveToElement((elem1)).build().perform();
    }

    @Step("Mouse Hover Element")
    public static void mouseHoverClick(WebElement elem1){
        actions.moveToElement(elem1).click().build().perform();
    }


    @Step("Scroll Down")

    public static void scrollDown(WebElement elem) {
        ((JavascriptExecutor) driver).executeScript("scrollTo(0,5000);");
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public static void scrollDownMiddlePage(WebElement elem) {
        ((JavascriptExecutor) driver).executeScript("scrollTo(0,1200);");
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public static void doubleClick(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        actions.doubleClick(elem).build().perform();
    }

    public static void dragAndDrop(WebElement elem1,WebElement elem2) {
        wait.until(ExpectedConditions.visibilityOf(elem1));
        actions.dragAndDrop(elem1,elem2).build().perform();
    }

    @Step(" Date Picker")
    public static void datePicker(WebElement elem1,WebElement elem2,String tagName,String expected){
        wait.until(ExpectedConditions.elementToBeClickable(elem1));
        elem1.click();
        wait.until(ExpectedConditions.elementToBeClickable(elem2));
        elem2.click();
        List<WebElement> cells = elem2.findElements(By.tagName(tagName));
        for (WebElement cell : cells){
            if (cell.getText().equalsIgnoreCase(expected))
                cell.click();
            break;
        }
    }








}
