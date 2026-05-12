package co.com.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class editarUsuarioStepsDefinitions {


    @Given("^The user is on the profile screen\\.$")
    public void theUserIsOnTheProfileScreen() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Enter the personal data you wish to edit\\.$")
    public void enterThePersonalDataYouWishToEdit(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @When("^i click save$")
    public void iClickSave() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^It is verified that the information has been updated correctly\\.$")
    public void itIsVerifiedThatTheInformationHasBeenUpdatedCorrectly() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
