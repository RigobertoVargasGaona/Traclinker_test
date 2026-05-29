package co.com.test.stepsdefinitions;


import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import org.example.models.EditarProductoModelo;
import org.example.questions.ValidacionProductoEditado;
import org.example.tasks.EditarProducto;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class editarProductoStepDefinitions {

    @Cuando("^que el usuario está en la pagina o modulo de productos y hace click en el boton de editar producto se ingresan los datos del producto$")
    public void seIngresanLosDatosDelProducto(List<EditarProductoModelo> datos) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        theActorInTheSpotlight().attemptsTo(
                EditarProducto.editarProducto(datos)
        );
    }

    @Entonces("^se deberia ver el producto en la lista con el nuevo serial editado$")
    public void seDeberiaVerElProductoEnLaListaConElNuevoSerialEditado() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(ValidacionProductoEditado.validarProductoEditado()));
    }

}
