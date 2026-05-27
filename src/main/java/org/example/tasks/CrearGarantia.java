package org.example.tasks;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.models.DatosGarantias;
import java.util.List;

import static java.lang.Thread.holdsLock;
import static java.lang.Thread.sleep;
import static org.example.userinterfaces.autenticacion.*;
import static org.example.userinterfaces.garantias.BTN_AGREGAR_GARANTIA;
import static org.example.userinterfaces.garantias.BTN_GARANTIAS;

public class CrearGarantia implements Task {
    private List<DatosGarantias> registros;
    public CrearGarantia(List<DatosGarantias>registros) {
         this.registros = registros;
    }

    public static CrearGarantia data(List<DatosGarantias>registros) {
        return Instrumented.instanceOf(CrearGarantia.class)
                .withProperties(registros);
    }
     @Override

     public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Click.on(BTN_GARANTIAS));
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         };
         actor.attemptsTo(Click.on(BTN_AGREGAR_GARANTIA));
     }
}
