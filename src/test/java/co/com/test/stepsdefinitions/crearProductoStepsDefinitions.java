package co.com.test.stepsdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.example.models.CrearProductoModelo;
import org.example.questions.ValidacionProductoCreado;
import org.example.tasks.CrearProducto;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class crearProductoStepsDefinitions {

    @Cuando("^el usuario está en la página o módulo de productos y hace click en agregar producto se ingresan los datos del producto que se va a agregar$")
    public void seIngresanLosDatosDelProductoQueSeVaAAgregar(List<CrearProductoModelo> datos) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        theActorInTheSpotlight().attemptsTo(
                CrearProducto.crearProducto(datos)
        );
    }

    @Entonces("^se debe verificar que el producto se haya creado correctamente$")
    public void seDebeVerificarQueElProductoSeHayaCreadoCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(ValidacionProductoCreado.validarProductoCreado()));
    }

}
