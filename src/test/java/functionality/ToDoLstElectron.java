package functionality;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ToDoListFlows;

@Listeners(utilities.Listeners.class)
public class ToDoLstElectron extends CommonOps {

    @Test(description = "Test 001 - Add And Verify New Task")
    @Description("This Test Verifies adds a new task and verifies it in the list in tasks")
    public static void test01_addAndVerifyNewTask(){
        ToDoListFlows.addNewTask("SQL SERVER Course");
        Verifications.verifyNumber(ToDoListFlows.getNumberOfTask(),1);
    }

    @Test(description = "Test 002 - Add 3 Tasks And Verify News Tasks")
    @Description("This Test Verifies adds a Tasks and verifies it in the list in tasks")
    public static void test02_addAndVerifyNewsTasks(){
        ToDoListFlows.addNewTask("Jira Course");
        ToDoListFlows.addNewTask("Java Course");
        ToDoListFlows.addNewTask("Selenium Course");
        Verifications.verifyNumber(ToDoListFlows.getNumberOfTask(),3);
    }

    @Test(description = "Test 003 Verify Add & VerifyTask Nme ")
    @Description("This Test Add New Task And Verify Task Name ")
    public static void test03_verifyTaskName(){
        ToDoListFlows.addNewTask("Appium Course");
        Verifications.verifyTextInElement(todoMain. text_firstCourse, "Appium Course");
    }


    @Test(description = "Test 004 Verify The Task Is Empty")
    @Description("This Test Verifies The Task List Is Empty ")
    public static void test04_verifyEmptyTask(){
        ToDoListFlows.addNewTask("Jenkins Course");
        UIActions.insertKey(todoMain.text_create, Keys.ENTER);
        UIActions.click(todoMain.btn_x);
        Verifications.verifyTextInElement(todoMain.text_emptyTask, "There's no task");
    }

    @Test(description = "Test 005 Verify The Toggle Button Is Displayed ")
    @Description("This Test Verifies The Toggle Button Is Displayed ")
    public static void test05_verifyToggle(){
        ToDoListFlows.addNewTask("Rest API Course");
        Verifications.visibilityOfElement(todoMain.text_Toggle);
    }

    @Test(description = "Test 006 Verify Update Task Name")
    @Description("This Test Update Task Name And Verify The New Task Name ")
    public static void test06_verifyNewTaskName(){
        ToDoListFlows.updateTask("Java Course", todoMain.text_firstCourse,"Python Course");
        Verifications.verifyTextInElement(todoMain.text_firstCourse, "Python Course");
    }

    @Test(description = "Test 006 Verify Mark Color To Green")
    @Description("This Test  Change Mark Color From Default To Green And Verify Enable On Screen")
    public static void test07_verifyEnableColor(){
   ToDoListFlows.markTask("JS COURSE");
    Verifications.enableElement(todoMain.btn_greenColor);
    }

    @Test(description = "Test 008 Verify Add 3 Tasks",dataProvider = "data-provider-tasks",dataProviderClass = utilities.ManageDDT.class)
    @Description("This Test  verifies Adding 3 Tasks In List (Using Date Driven Testing)")
    public static void test08_verifyAddTasks(String taskName,String expected){
      ToDoListFlows.addDDTask(taskName,expected);
    }

    @Test(description = "Test 009 Verify Change Header Color")
    @Description("This Test Change Header Color From Blue To Black")
    public static void test09_verifyHeaderColor(){
      ToDoListFlows.changeHeaderColor();
      Verifications.enableElement(todoMain.header_color);
   }

    @Test(description = "Tess 010 Verify Date Picker ")
    @Description("This Test Verifies The Date Picker Chose From Date List")
    public static void test10_verifyDate(){
          ToDoListFlows.date();
          Verifications.verifyTextInElement(todoMain.text_dateHeader, getData("datePick"));
    }

    @Test(description = "Tess 011 Verify The  Number Of Remaining Tasks In List")
    @Description("This Test Verifies There Are 3 Remaining Tasks In List ")
    public static void test11_verifyNumberRemainingTasks(){
        ToDoListFlows.togglePanel("GitHub","Selenium Grid","Docker");
        Verifications.verifyTextInElement(todoMain.text_remainingTasks,getData("remainingTasks"));
    }

    @Test(description = "Tess 012 Verify Clear Tasks ")
    @Description("This Test Clean Remaining Tasks From List And Verify The List Is Empty")
    public static void test12_verifyClearTasks(){
        ToDoListFlows.togglePanel("GitHub","Selenium Grid","Docker");
        UIActions.click(todoMain.btn_filters);
        Verifications.verifyTextInElement(todoMain.text_emptyTask,"There's no task" );
    }
    @Test(description = "Tess 013 Verify Return Cleaned  Tasks ")
    @Description("This Test Return Cleaned  Tasks From List And Verify That Are Have 3 Remaining Tasks In List ")
    public static void test13_verifyReturnTasks(){
        ToDoListFlows.togglePanel("GitHub","Selenium Grid","Docker");
        UIActions.click(todoMain.btn_filters);
        UIActions.click(todoMain.btn_filterDefaults);
        Verifications.verifyNumber(ToDoListFlows.getNumberOfTask(),3);
    }

    @Test(description = "Tess 014 Verify All Status Tasks ")
    @Description("This Test verifies The All Status Tasks ")
    public static void test14_verifyAllStatus(){
        ToDoListFlows.togglePanel("JavaScript","Selenium","C++");
      Verifications.verifyNumber(ToDoListFlows.getNumberOfTask(),3);
    }

    @Test(description = "Tess 015 Verify To Do Status Tasks ")
    @Description("This Test verifies The To Do Status Tasks  ")
    public static void test15_verifyCompletedStatus(){
        ToDoListFlows.togglePanel("JavaScript","Selenium","C++");
        UIActions.updateText(todoMain.text_create, "Docker");
        UIActions.insertKey(todoMain.text_create, Keys.ENTER);
        UIActions.click(todoMain.btn_filterToDoStatus);
        Verifications.verifyNumber(ToDoListFlows.getNumberOfTask(),4);
    }

    @Test(description = "Tess 016 Verify Completed Status Tasks ")
    @Description("This Test verifies The CompletedStatus Tasks  ")
    public static void test16_verifyCompletedStatus(){
        ToDoListFlows.togglePanel("JavaScript","Selenium","C++");
        UIActions.click(todoMain.btn_filterCompletedStatus);
        Verifications.verifyTextInElement(todoMain.text_emptyTask,"There's no task" );
    }

    @Test(description = "Tess 017 drag Task And Drop From The List")
    @Description("This Test drag Task And Drop From The List And Verifies The List Is Empty  ")
    public static void test17_verifyDragAndDrop(){
        ToDoListFlows.dragAndDrop("Full Stack Automation Test");
        Verifications.verifyTextInElement(todoMain.text_empty, "There's no task");
    }

    @Test(description = "Tess 018 Created New Task ")
    @Description("This Test verifies Created New Task (--Using Sikuli Tool)  ")
    public static void test18_verifyCreateTask() throws FindFailed {
        ToDoListFlows.createdSikuli();
        Verifications.verifyNumber(ToDoListFlows.getNumberOfTask(),5);
    }

    @Test(description = "Tess 019 Replaces  Tasks In The List")
    @Description("This Test verifies Replaces Tasks In The List (--Using Sikuli Tool)  ")
    public static void test19_verifyDragAndDropTasks() throws FindFailed{
        ToDoListFlows.dragAnDropSikuli();
        Verifications.verifyTextInElement(todoMain.text_one, "Jenkins");
    }

    @Test(description = "Tess 020 Change Color")
    @Description("This Test verifies Change Color To Yellow(--Using Sikuli Tool)  ")
    public static void test20_verifyDeletedTasks() throws FindFailed{
    ToDoListFlows.changeColorSikuli();
        Verifications.enableElement(todoMain.header_color);
    }




}
