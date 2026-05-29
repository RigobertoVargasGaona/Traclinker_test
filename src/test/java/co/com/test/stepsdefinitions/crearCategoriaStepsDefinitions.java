package co.com.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class crearCategoriaStepsDefinitions {

    @Dado("^que el usuario está en el módulo de categorías y hace click en crear categoría$")
    public void queElUsuarioEstaEnElModuloDeCategoriasYHaceClickEnCrearCategoria() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^se ingresan los datos de la categoría$")
    public void seIngresanLosDatosDeLaCategoria(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Entonces("^el sistema confirma que la categoría fue creada correctamente$")
    public void elSistemaConfirmaQueLaCategoriaFueCreadaCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^la categoría debería aparecer en la lista junto con las demás categorías$")
    public void laCategoriaDeberiaAparecerEnLaListaJuntoConLasDemasCategorias() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}