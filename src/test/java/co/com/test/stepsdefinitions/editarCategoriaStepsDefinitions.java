package co.com.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.example.models.EditarCategoriaData;
import org.example.questions.ValidacionEditarCategoria;
import org.example.tasks.EditarCategoria;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class editarCategoriaStepsDefinitions {
    @Cuando("el usuario está en el módulo de categorías y selecciona una categoría para editar y se modifican los datos de la categoría$")
    public void seModificanLosDatosDeLaCategoria(List<EditarCategoriaData> data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        theActorInTheSpotlight().attemptsTo(
                EditarCategoria.editarCategoria(data)
        );
    }

    @Entonces("^el sistema confirma que la categoría fue editada correctamente\\$$")
    public void elSistemaConfirmaQueLaCategoríaFueEditadaCorrectamente$() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(
                seeThat(ValidacionEditarCategoria.validacionEditarCategoria())
        );
    }

}