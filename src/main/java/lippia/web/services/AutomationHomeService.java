package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.sun.tools.javac.comp.TypeEnter;
import lippia.web.constants.AutomationConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import org.openqa.selenium.Keys;


public class AutomationHomeService extends ActionManager {



    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }



    public static void clickSearchButton() {
        click(AutomationConstants.SEARCH_BUTTON_NAME);
    }


    public static void clickAddBook() {
        click(AutomationConstants.BUTTON_ADD_BOOK);
    }

    public static void setTitle() {
        setInput(AutomationConstants.INPUT_TITLE, AutomationConstants.INPUT_TITLE_TEXT);
    }

    public static void setAuthor() {
        setInput(AutomationConstants.INPUT_AUTHOR, AutomationConstants.INPUT_AUTHOR_TEXT);

    }

    public static void setDescription() {
        setInput(AutomationConstants.INPUT_DESCRIPTION, AutomationConstants.INPUT_DESCRIPTION_TEXT);


    }

    public static void setSelectFormat() {
        click(AutomationConstants.SELECT_FORMAT);
        click(AutomationConstants.SELECT_FORMAT_OPTION);

    }

    public static void setSelectLanguage() {
        click(AutomationConstants.SELECT_LANG);
        click(AutomationConstants.SELEC_LANG_OPTION);
    }

    public static void setYearPubl() {
        setInput(AutomationConstants.INPUT_YEAR_PUBL, "1998");
    }

    public static void setRating() {
        click(AutomationConstants.RATING);
    }

    public static void clickAdd() {
        click(AutomationConstants.BUTTON_ADD);
    }

    public static void verifyAdd() {
        waitVisibility(AutomationConstants.SAVED_MESAGE);
        Assert.assertTrue(isVisible(AutomationConstants.SAVED_MESAGE));    }

    public static void searchBook() {


    }

    public static void setSearch() {
        setInput(AutomationConstants.SEARCH_INPUT,AutomationConstants.INPUT_AUTHOR_TEXTT);
           }

    public static void verifySearch() {
        waitVisibility(AutomationConstants.SEARCH_RESULT);
        Assert.assertTrue(isVisible(AutomationConstants.SEARCH_RESULT));
    }

    public static void clickResult() {
        click(AutomationConstants.SEARCH_RESULT);

    }

    public static void modifyRating() {
        waitVisibility(AutomationConstants.MODIFY_RATING);
        click(AutomationConstants.MODIFY_RATING);
    }

    public static void saveUpdate() {
        click(AutomationConstants.UPDATE_ADD);
    }

    public static void verifyUpdate() {
        waitVisibility(AutomationConstants.UPDATE_MESAGE);
        Assert.assertTrue(isVisible(AutomationConstants.UPDATE_MESAGE));
    }

    public static void deleteRecord() {
        click(AutomationConstants.DELETE_BUTTON);
    }

    public static void verifyDelete() {
        waitVisibility(AutomationConstants.DELETE_MESAGE);
        Assert.assertTrue(isVisible(AutomationConstants.DELETE_MESAGE));
    }

    public static void confirmDeleted() {
        waitVisibility(AutomationConstants.DELETE_COFIRMATION);
        click(AutomationConstants.DELETE_COFIRMATION);
    }
}
