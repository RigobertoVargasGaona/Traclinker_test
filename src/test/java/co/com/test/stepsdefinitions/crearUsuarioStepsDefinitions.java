package co.com.test.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.example.models.CrearUsuarioModelo;
import org.example.questions.ValidacionCrearUsuario;
import org.example.tasks.CrearUsuario;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class crearUsuarioStepsDefinitions {


    @Cuando("^el usuario se encuentra en la página o módulo de usuarios y da clic en el botón de crear usuario se ingresan los datos del usuario$")
    public void seIngresanLosDatosDelUsuario(List<CrearUsuarioModelo> datos) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        theActorInTheSpotlight().attemptsTo(
                CrearUsuario.crearUsuario(datos)
        );
    }

    @Entonces("^se debe verificar que el usuario fue creado correctamente$")
    public void seDebeVerificarQueElUsuarioFueCreadoCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(
                ValidacionCrearUsuario.validacionCrearUsuario()
        ));
    }


}
