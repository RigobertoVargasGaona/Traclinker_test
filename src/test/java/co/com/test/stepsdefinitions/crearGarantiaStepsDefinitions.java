package co.com.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import org.example.models.DatosGarantias;
import org.example.tasks.CrearGarantia;
import org.example.userinterfaces.garantias;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class crearGarantiaStepsDefinitions {

    @Dado("^que el usuario está en el módulo de garantías$")
    public void queElUsuarioEstáEnElMóduloDeGarantías(){

    }

    @Cuando("^el usuario selecciona la opción \"([^\"]*)\"$")
    public void elUsuarioSeleccionaLaOpción(String opcion,List<DatosGarantias> registros) {
        theActorInTheSpotlight()
                .attemptsTo(CrearGarantia.data(registros));
    }

    @Entonces("^el sistema debe mostrar el mensaje \"([^\"]*)\"$")
    public void elSistemaDebeMostrarElMensaje() {
        // Write code here that turns the phrase above into concrete actions

    }


}




