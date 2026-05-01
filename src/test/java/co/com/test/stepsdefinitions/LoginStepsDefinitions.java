package co.com.test.stepsdefinitions;

import co.com.test.tasks.AbrirPagina;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public  class LoginStepsDefinitions {

    @Given("^the user is on login page$")
    public void theUserIsOnLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.laPagina());
    }
}