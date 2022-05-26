package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import static steps.PageInitializers.addLanguagesPage;
import static utils.CommonMethods.click;
import static utils.CommonMethods.sendText;

public class AddLanguagesSteps extends CommonMethods {


    @When("user clicks on Admin option")
    public void user_clicks_on_admin_option() {
        click(addLanguagesPage.adminOption);

    }

    @When("user clicks on Qualification option")
    public void user_clicks_on_qualification_option() {
        click(addLanguagesPage.qualificationOption);
    }

    @When("user clicks on languages in drop down list")
    public void user_clicks_on_languages_in_drop_down_list() {
        click(addLanguagesPage.langList);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(addLanguagesPage.addBttn);
    }

    @When("user enters a 1st language")
    public void user_enters_a_1st_language() {
        sendText(addLanguagesPage.langField, "Italian");
        click(addLanguagesPage.saveBtn);
    }


    @Then("language added successfully 1st language")
    public void language_added_successfully_1st_language() {
        getText(addLanguagesPage.listTable);


    }

    @When("user enters a 2nd language")
    public void user_enters_a_2nd_language() {
        sendText(addLanguagesPage.langField, "Russian");
        click(addLanguagesPage.saveBtn);

    }

    @Then("language added successfully 2nd language")
    public void language_added_successfully_2nd_language() {
        getText(addLanguagesPage.listTable);

    }
}