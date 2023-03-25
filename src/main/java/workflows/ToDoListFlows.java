package workflows;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import utilities.CommonOps;


public class ToDoListFlows extends CommonOps {

    @Step("Business Flow : Count and Return Number Of Tasks In List")
    public static int getNumberOfTask() {
        return  todoMain.list_tasks.size();

    }

    @Step("Empty Lists From Tasks")
    public static void emptyList() {
        for (int i=0; i<getNumberOfTask(); i++){
            UIActions.mouseHoverClick(todoMain.btn_x);
        }

    }

    @Step("Business Flow : addNewTask To The List")
    public static void addNewTask(String taskName) {
        UIActions.updateText(todoMain.text_create,taskName);
        UIActions.insertKey(todoMain.text_create, Keys.RETURN);
    }

    @Step("Business Flow : Update Text Name In  New Task")
    public static void updateTask(String taskName, WebElement elem,String newTask) {
        UIActions.updateText(todoMain.text_create,taskName);
        UIActions.insertKey(todoMain.text_create, Keys.ENTER);
        UIActions.doubleClick(elem);
        UIActions.clear(todoMain.btn_clear);
        UIActions.updateText(todoMain.text_create,newTask );
        UIActions.insertKey(todoMain.text_create, Keys.ENTER);
    }

    @Step("Business Flow : Order Task")
    public static void orderTask(String taskName1,String taskName2) {
     UIActions.updateText(todoMain.text_create, taskName1);
     UIActions.insertKey(todoMain.text_create, Keys.ENTER);
     UIActions.updateText(todoMain.text_create, taskName2);
     UIActions.insertKey(todoMain.text_create, Keys.ENTER);
    }

    @Step("Business Flow : Mark Task")
    public static void markTask(String taskName1) {
        UIActions.updateText(todoMain.text_create, taskName1);
        UIActions.insertKey(todoMain.text_create, Keys.ENTER);
        UIActions.click(todoMain.btn_MenuColor);
        UIActions.click(todoMain.btn_greenColor);

    }

    @Step("Business Flow : Add Tasks")
    public static void addDDTask(String taskName,String expected) {
     UIActions.updateText(todoMain.text_create, taskName);
     UIActions.insertKey(todoMain.text_create, Keys.ENTER);
     if (expected.equalsIgnoreCase("Java"))
         Verifications.verifyTextInElement(todoMain.text_firstTask, "Java");
     else if (expected.equalsIgnoreCase("Python")){
         Verifications.verifyTextInElement(todoMain.text_firstTask, "Python");
     }
     else if (expected.equalsIgnoreCase("C++")){
         Verifications.verifyTextInElement(todoMain.text_firstTask, "C++");
     }
     else
        throw   new RuntimeException("Filed");

    }

    @Step("Business Flow : Nav Color")
    public static void changeHeaderColor() {
        UIActions.click(todoMain.header_color);
        UIActions.click(todoMain.btn_blackColor);
        UIActions.click(todoMain.btn_save);
    }

    @Step("Business Flow : Date")
    public static void date() {
        UIActions.click(todoMain.btn_date);
        UIActions.click(todoMain.btn_datePicker);
    }

    @Step("Business Flow : Toggle Panel")
    public static void togglePanel(String taskName1,String taskName2,String taskName3) {
        UIActions.updateText(todoMain.text_create,taskName1 );
        UIActions.insertKey(todoMain.text_create,Keys.ENTER );
        UIActions.updateText(todoMain.text_create,taskName2 );
        UIActions.insertKey(todoMain.text_create,Keys.ENTER );
        UIActions.updateText(todoMain.text_create,taskName3);
        UIActions.insertKey(todoMain.text_create,Keys.ENTER );
        UIActions.click(todoMain.btn_panel);
    }

    @Step("Business Flow : Drag And Drop")
    public static void dragAndDrop(String taskName) {
    UIActions.updateText(todoMain.text_create,taskName );
    UIActions.insertKey(todoMain.text_create, Keys.ENTER);
    UIActions.dragAndDrop(todoMain.btn_drag, todoMain.btn_drop);
    }

    @Step("Business Flow : Created Task Using Sikuli")
    public static void createdSikuli() throws FindFailed {
        screen.type(getData("ImageRepo")+"createdTask.png","Java"+ Key.ENTER);
        screen.type(getData("ImageRepo")+"createdTask.png","Selenium"+ Key.ENTER);
        screen.type(getData("ImageRepo")+"createdTask.png","Appium"+ Key.ENTER);
        screen.type(getData("ImageRepo")+"createdTask.png","Rest API"+ Key.ENTER);
        screen.type(getData("ImageRepo")+"createdTask.png","Electron"+ Key.ENTER);
    }

    @Step("Business Flow : Drag & Drop Using Sikuli")
    public static void dragAnDropSikuli() throws FindFailed {
        screen.type(getData("ImageRepo")+"createdTask.png","Desktop App"+ Key.ENTER);
        screen.type(getData("ImageRepo")+"createdTask.png","MySQL"+ Key.ENTER);
        screen.type(getData("ImageRepo")+"createdTask.png","Jenkins"+ Key.ENTER);
        screen.type(getData("ImageRepo")+"createdTask.png","Docker"+ Key.ENTER);
        screen.dragDrop(getData("ImageRepo")+"drag.png",getData("ImageRepo")+"drop.png");
    }

    @Step("Business Flow : Change Color Using Sikuli")
    public static void changeColorSikuli() throws FindFailed {
        screen.click(getData("ImageRepo")+"pen.png");
        screen.click(getData("ImageRepo")+"yellow.png");
        screen.click(getData("ImageRepo")+"save.png");


    }



}
