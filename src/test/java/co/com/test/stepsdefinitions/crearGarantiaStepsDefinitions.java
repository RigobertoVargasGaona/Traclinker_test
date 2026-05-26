package co.com.test.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class crearGarantiaStepsDefinitions {

    @Dado("^que el usuario está en el módulo de garantías$")
    public void queElUsuarioEstáEnElMóduloDeGarantías() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^el usuario selecciona la opción \"([^\"]*)\"$")
    public void elUsuarioSeleccionaLaOpción(String arg1, DataTable arg2) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
        throw new PendingException();
    }

    @Entonces("^el sistema debe mostrar el mensaje \"([^\"]*)\"$")
    public void elSistemaDebeMostrarElMensaje(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
