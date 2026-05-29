package co.com.test.stepsdefinitions;


import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import org.example.models.EditarGarantiaModelo;
import org.example.tasks.EditarGarantia;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class editarGarantiaStepsDefinitions {
    @Cuando("^el usuario selecciona una incidencia para editar$")
    public void elUsuarioSeleccionaUnaIncidenciaParaEditar(List<EditarGarantiaModelo> registro) {
        theActorInTheSpotlight()
                .attemptsTo(EditarGarantia.data(registro));
    }

    @Entonces("^el sistema debe mostrar el mensaje Garantía registrada exitosamente$")
    public void elSistemaDebeMostrarElMensajeGarantíaRegistradaExitosamente() {
        // Write code here that turns the phrase above into concrete actions

    }


}
