package co.com.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public  class LoginStepsDefinitions {

@Given("^the user is on login page$")
public void theUserIsOnLoginPage() {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^user enter valid credentials \\(email and password\\)$")
public void userEnterValidCredentialsEmailAndPassword(DataTable arg1) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc).
    // Field names for YourType must match the column names in
    // your feature file (except for spaces and capitalization).
    throw new PendingException();
}

@Then("^the user should be successfully authenticated$")
public void theUserShouldBeSuccessfullyAuthenticated() {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
}