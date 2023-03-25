package pageObjects.todoList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonOps;

import java.util.List;


public class MainPage extends CommonOps {


    @FindBy(css = "input[placeholder='Create a task']")
    public WebElement text_create;

    @FindBy(className = "view_2Ow90")
    public List<WebElement> list_tasks;

    @FindBy(className = "destroy_19w1q")
    public WebElement btn_x;

    @FindBy(xpath = "//div[@class='view_2Ow90']/div/label")
    public WebElement text_firstCourse;

    @FindBy(xpath = "//div[@class='taskList_1-1Yq'][2]/h2")
    public WebElement text_emptyTask;

    @FindBy(className = "wrapper_3d2O3")
    public WebElement text_Toggle;


    @FindBy(className = "view_2Ow90")
    public WebElement btn_1;

    @FindBy(className = "editingTextInput_2-zuQ")
    public WebElement btn_clear;

    @FindBy(xpath = "//div[@class='tagSelector_1mhz5']//div//span")
    public WebElement btn_MenuColor;

    @FindBy(xpath = "//span[@style='background: rgb(114, 204, 87);']")
    public WebElement btn_greenColor;

    @FindBy(xpath = "//div[@class='draggableList_DX-a1']//div[1]//div//div/div/label")
    public WebElement text_firstTask;

    @FindBy(className = "icon_2XXYL")
    public WebElement header_color;

    @FindBy(xpath = "//div[@role='group']/div[12]")
    public WebElement btn_blackColor;

    @FindBy(xpath = "//button[@class='wrapper_1SRLB']")
    public WebElement btn_save;

    @FindBy(xpath = "//header[@class='wrapper_2r1C1']")
    public WebElement style_HeaderColor;

    @FindBy(className = "dateFormatted_3GjaR")
    public WebElement btn_date;

    @FindBy(xpath = "//div[@class='daysWrapper_3SMBJ'][2]/div[12]")
    public WebElement btn_datePicker;

    @FindBy(xpath = "//header[@class='wrapper_2r1C1']/div/span")
    public WebElement text_dateHeader;

    @FindBy(className = "toggleVisibilityPanel_hNPyc")
    public WebElement btn_panel;

    @FindBy(xpath = "//div[@class='content_2SEBz']/span")
    public WebElement text_remainingTasks;

    @FindBy(xpath = "//div[@class='wrapper_3Kpfj tagsWrapper_jJPK-']/span[2]")
    public WebElement btn_filters;

    @FindBy(xpath = "//div[@class='wrapper_3Kpfj tagsWrapper_jJPK-']/span[1]")
    public WebElement btn_filterDefaults;

    @FindBy(xpath = "//div[@class='statusWrapper_fkjww']/button[1]")
    public WebElement btn_filterAllStatus;

    @FindBy(xpath = "//div[@class='statusWrapper_fkjww']/button[2]")
    public WebElement btn_filterToDoStatus;

    @FindBy(xpath = "//div[@class='statusWrapper_fkjww']/button[3]")
    public WebElement btn_filterCompletedStatus;

    @FindBy(className = "textWrapper_X9gil")
    public WebElement btn_drag;

    @FindBy(className = "destroy_19w1q")
    public WebElement btn_drop;

    @FindBy(xpath = "//div[@class='textWrapper_X9gil']/label")
    public WebElement text_one;

    @FindBy(xpath = "//div[@class='wrapper_DtvJU']/div/h2")
    public WebElement text_empty;

















}
