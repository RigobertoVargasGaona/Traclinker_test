package co.com.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createProductStepsDefinitions {



    @Given("^is on the products page and clicks the Add Product button$")
    public void isOnTheProductsPageAndClicksTheAddProductButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter the product's data:$")
    public void iEnterTheProductSData(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Then("^it should be verified that the product \"([^\"]*)\" was created successfully$")
    public void itShouldBeVerifiedThatTheProductWasCreatedSuccessfully(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the product should appear in the list with the other products$")
    public void theProductShouldAppearInTheListWithTheOtherProducts() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
