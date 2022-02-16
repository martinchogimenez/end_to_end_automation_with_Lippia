package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class AutomationConstants {

    public static final String SEARCH_BUTTON_NAME = "xpath://*[@id=\"root\"]/div/div/div/ul/li[3]/a";
    public static final String BUTTON_ADD_BOOK = "xpath://*[@id=\"root\"]/div/div/div/ul/li[2]/a";
    public static final String INPUT_TITLE_TEXT = "The lord of the rings";
    public static final String INPUT_TITLE = "id:Title *";
    public static final String INPUT_AUTHOR = "id:Author *" ;
    public static final String INPUT_AUTHOR_TEXT = "J.K.ROWLING";
    public static final String INPUT_DESCRIPTION = "id:outlined-multiline-static";
    public static final String INPUT_DESCRIPTION_TEXT = "This book is about a ring and his power";
    public static final String SELECT_FORMAT = "xpath://*[@id=\"demo-simple-select\"]";
    public static final String SELECT_FORMAT_OPTION = "xpath://*[@id=\"menu-format\"]/div[3]/ul/li[2]";
    public static final String SELECT_LANG = "xpath://html/body/div/div/main/div/div[1]/form/div[4]/div/div";
    public static final String SELEC_LANG_OPTION = "xpath://*[@id=\"menu-language\"]/div[3]/ul/li[3]";
    public static final String RATING = "xpath://*[@id=\"root\"]/div/main/div/div[1]/form/div[7]/span/label[4]";
    public static final String BUTTON_ADD = "xpath://*[@id=\"root\"]/div/main/div/div[2]/button[1]";
    public static final String SAVED_MESAGE = "xpath://*[text()='Record has been successfully added.']";
    public static final String SEARCH_INPUT = "xpath://*[@id=\"root\"]/div/main/div/div[1]/header/div/div/div[2]/input";
    public static final String INPUT_AUTHOR_TEXTT = "Edgar Allan Poe\ue007";
    public static final String INPUT_YEAR_PUBL = "id:Publication Year";
    public static final String SEARCH_RESULT = "xpath://*[text()='The Complete Poetry Of Edgar Allan Poe']";
    public static final String MODIFY_RATING = "xpath://html/body/div[2]/div[3]/div/div[1]/form/div[7]/span/label[1]";
    public static final String UPDATE_ADD = "xpath://html/body/div[2]/div[3]/div/div[2]/button[2]";
    public static final String UPDATE_MESAGE = "xpath://*[text()='Record has been successfully updated.']";
    public static final String DELETE_BUTTON = "xpath://html/body/div[2]/div[3]/div/div[2]/button[3]";
    public static final String DELETE_MESAGE = "xpath://*[text()='Record has been successfully deleted.']";
    public static final String DELETE_COFIRMATION = "xpath://html/body/div[3]/div[3]/div/div[3]/button[2]";
}
