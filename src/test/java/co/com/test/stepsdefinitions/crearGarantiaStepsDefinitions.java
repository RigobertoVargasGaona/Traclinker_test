package co.com.test.stepsdefinitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import org.example.models.DatosGarantias;
import org.example.questions.ValidacionGarantiaCreada;
import org.example.tasks.CrearGarantia;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class crearGarantiaStepsDefinitions {

    @Cuando("^el usuario selecciona la opción Nueva Garantía$")
    public void elUsuarioSeleccionaLaOpciónNuevaGarantía(List<DatosGarantias> registros) {
        theActorInTheSpotlight()
                .attemptsTo(CrearGarantia.data(registros));
    }


    @Entonces("^el sistema debe mostrar el mensaje Garantia registrada con éxito$")
    public void elSistemaDebeMostrarElMensajeGarantiaRegistradaConÉxito() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight()
                .should(seeThat(ValidacionGarantiaCreada.validacionGarantiaCreada()));
    }

}