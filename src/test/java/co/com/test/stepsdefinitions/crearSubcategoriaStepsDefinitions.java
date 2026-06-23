package co.com.test.stepsdefinitions;


import org.example.tasks.CrearSubcategoria;
import org.example.models.CredencialesCrearSubcategoria;
import cucumber.api.DataTable;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import org.example.questions.ValidacionCrearSubcategoria;
import org.example.utils.hooks.SesionVariable;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.Matchers.is;


public class crearSubcategoriaStepsDefinitions {

    private List<CredencialesCrearSubcategoria> credenciales;





    @Cuando("^se ingresan los datos de la subcategoria$")
    public void seIngresanLosDatosDeLaSubcategoria(
            List<CredencialesCrearSubcategoria> credenciales) {

        theActorInTheSpotlight()
                .attemptsTo(CrearSubcategoria.crearSubcategoria(credenciales));
    }

    @Entonces("^el sistema confirma que la subcategoria fue creada correctamente$")
    public void elSistemaConfirmaQueLaSubcategoriaFueCreadaCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight()
                .should(seeThat(ValidacionCrearSubcategoria.validarCrearSubcategoria(), is(true)));

    }

    @Entonces("^la subcategoria deberia aparecer en la lista de subcategorias ya creadas$")
    public void laSubcategoriaDeberiaAparecerEnLaListaDeSubcategoriasYaCreadas() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight()
                .should(seeThat(ValidacionCrearSubcategoria.validarCrearSubcategoria(), is(true)));

    }


}