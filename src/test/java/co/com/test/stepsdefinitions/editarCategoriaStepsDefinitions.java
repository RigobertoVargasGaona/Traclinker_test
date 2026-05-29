package co.com.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class editarCategoriaStepsDefinitions {

    @Dado("^que el usuario está en el módulo de categorías y selecciona una categoría para editar$")
    public void queElUsuarioEstaEnElModuloDeCategoriasYSeleccionaUnaCategoriaParaEditar() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^se modifican los datos de la categoría$")
    public void seModificanLosDatosDeLaCategoria(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Entonces("^el sistema confirma que la categoría fue editada correctamente$")
    public void elSistemaConfirmaQueLaCategoriaFueEditadaCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^la categoría actualizada debería aparecer en la lista de categorías$")
    public void laCategoriaActualizadaDeberiaAparecerEnLaListaDeCategorias() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}