package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.AutomationConstants;
import lippia.web.services.AutomationHomeService;

public class AutomationWebSteps extends PageSteps {


    @Given("The user is in Bookshelf page")
    public void theUserIsInBookshelfPage() {
        AutomationHomeService.navegarWeb();
    }

    @When("The user click the Add book button")
    public void theUserClickTheAddBookButton() {
        AutomationHomeService.clickAddBook();
    }





    @And("The user select the Format option")
    public void theUserSelectTheFormatOption() {
        AutomationHomeService.setSelectFormat();

    }

    @And("The user select the Languages option")
    public void theUserSelectTheLanguagesOption() {
        AutomationHomeService.setSelectLanguage();

    }




    @And("The  user select the Rating")
    public void theUserSelectTheRating() {
        AutomationHomeService.setRating();

    }

    @And("The user clicks the ADD button")
    public void theUserClicksTheADDButton() {
        AutomationHomeService.clickAdd();

    }

    @Then("The user verify that the data is correctly saved")
    public void theUserVerifyThatTheDataIsCorrectlySaved() {
        AutomationHomeService.verifyAdd();
    }

    @And("The user fill the Title")
    public void theUserFillTheTitle() {
        AutomationHomeService.setTitle();

    }

    @And("The user fill the Author")
    public void theUserFillTheAuthor() {
        AutomationHomeService.setAuthor();

    }

    @And("The user fill the Publication Year option")
    public void theUserFillThePublicationYearOption() {
        AutomationHomeService.setYearPubl();

    }

    @And("The user fill the Description")
    public void theUserFillTheDescription() {
        AutomationHomeService.setDescription();
    }

    @And("press Enter")
    public void pressEnter() {
        AutomationHomeService.searchBook();

    }



    @When("The user click the Search books button")
    public void theUserClickTheSearchBooksButton() {
        AutomationHomeService.clickSearchButton();
    }

    @Then("The user verify that the data is correctly shown")
    public void theUserVerifyThatTheDataIsCorrectlyShown() {
        AutomationHomeService.verifySearch();
    }



    @And("The user fill in the input a Title or Author and press Enter")
    public void theUserFillInTheInputATitleOrAuthorAndPressEnter() {
        AutomationHomeService.setSearch();
    }




    @And("The user fill in the input a title or Author and press Enter button.")
    public void theUserFillInTheInputATitleOrAuthorAndPressEnterButton() {
        AutomationHomeService.setSearch();
        AutomationHomeService.verifySearch();

    }

    @And("The user click in the result row")
    public void theUserClickInTheResultRow() {
        AutomationHomeService.clickResult();
    }

    @And("The user modify the rating")
    public void theUserModifyTheRating() {
        AutomationHomeService.modifyRating();
    }

    @And("The user click SAVE button")
    public void theUserClickSAVEButton() {
        AutomationHomeService.saveUpdate();
    }




    @And("The user click DELETE button")
    public void theUserClickDELETEButton() {
        AutomationHomeService.deleteRecord();
    }

    @Then("The user verify the data is updated")
    public void theUserVerifyTheDataIsUpdated() {
        AutomationHomeService.verifyUpdate();
    }

    @Then("The user verify the data is deleted")
    public void theUserVerifyTheDataIsDeleted() {

        AutomationHomeService.verifyDelete();
    }

    @And("The user click the confirmation button")
    public void theUserClickTheConfirmationButton() {
        AutomationHomeService.confirmDeleted();
    }
}
