package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLauchApplication();
    }



    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {

        sendText(loginPage.usernameBox, ConfigReader.getPropertyValue("username"));

        sendText(loginPage.passwordBox, ConfigReader.getPropertyValue("password"));

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        click(loginPage.loginBtn);

    }
    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {

            Assert.assertTrue(loginPage.welcomeMessage.isDisplayed());
    }

}
