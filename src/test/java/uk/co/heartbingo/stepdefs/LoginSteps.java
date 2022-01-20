package uk.co.heartbingo.stepdefs;

/*
 * Created By: Hiren Patel
 * Project Name: VirginGames_Assignment_Cucumber
 */

import uk.co.heartbingo.pages.HomePage;
import uk.co.heartbingo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        new HomePage().verifyHomePage();
    }

    @Then("^I verify Login link displayed on Homepage$")
    public void iVerifyLoginLinkDisplayedOnHomepage() {
        new HomePage().verifyLoginText("Log In");
    }

    @When("^I click login link$")
    public void iClickLoginLink() {
        new HomePage().clickLoginLink();
    }

    @Then("^I navigate to Login page and verify HeartBingo logo$")
    public void iNavigateToLoginPageAndVerifyVirginGameLogo()  throws InterruptedException {
        new LoginPage().verifyTitleOfPage();
        new LoginPage().verifyLogo();
    }

    @And("^I add \"([^\"]*)\" in username field$")
    public void iAddInUsernameField(String userName) {
        new LoginPage().sendTextToUserNameField(userName);
    }

    @And("^I add \"([^\"]*)\" in password field$")
    public void iAddInPasswordField(String password)  {
        new LoginPage().sendTextToPasswordField(password);
    }


    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }


    @And("^I should see \"([^\"]*)\" message and verify it$")
    public void iShouldSeeMessageAndVerifyIt(String error) {
        new LoginPage().verifyErrorMessage(error);
    }

    @And("^I close Login frame$")
    public void iClickOnXSignAtPopup() {
        new LoginPage().closeLoginWindow();
    }

    @Then("^I should back on Homepage and verify that i am on Homepage$")
    public void iShouldBackOnHomepage() {
        new HomePage().verifyUserIsOnHomePage();
    }

}
