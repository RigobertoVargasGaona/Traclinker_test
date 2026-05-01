package co.com.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createUserStepsDefinitions {


    @Given("^the administrator is authenticated in the system$")
    public void theAdministratorIsAuthenticatedInTheSystem(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Given("^is on the users page and clicks the Add User button$")
    public void isOnTheUsersPageAndClicksTheAddUserButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter the user's data:$")
    public void iEnterTheUserSData(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @When("^I click \"([^\"]*)\"$")
    public void iClick(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^it should be verified that the user \"([^\"]*)\" was created successfully$")
    public void itShouldBeVerifiedThatTheUserWasCreatedSuccessfully(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user should appear in the list with the role \"([^\"]*)\"$")
    public void theUserShouldAppearInTheListWithTheRole(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
