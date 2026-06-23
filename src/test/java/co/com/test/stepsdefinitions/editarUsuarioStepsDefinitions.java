package co.com.test.stepsdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import org.example.models.EditarUsuarioModelo;
import org.example.questions.ValidacionEditarUsuario;
import org.example.tasks.EditarUsuario;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class editarUsuarioStepsDefinitions {

    @Cuando("^el usuario se encuentra en la página o módulo de usuarios y da clic en el botón de editar usuario se ingresan los datos a editar del usuario$")
    public void seIngresanLosDatosAEditarDelUsuario(List<EditarUsuarioModelo> datos) {
        theActorInTheSpotlight().attemptsTo(
                EditarUsuario.editarUsuario(datos)
        );
    }

    @Entonces("^se debe verificar que el usuario fue editado correctamente$")
    public void seDebeVerificarQueElUsuarioFueEditadoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(
                ValidacionEditarUsuario.validacionEditarUsuario()
        ));
    }
}
