package org.example.tasks;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.models.DatosGarantias;
import java.util.List;

import static org.example.userinterfaces.garantias.*;

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

         try {
             actor.attemptsTo(Click.on(BTN_GARANTIAS));
             Thread.sleep(2000);
             actor.attemptsTo(
                     Click.on(BTN_AGREGAR_GARANTIA),
                     Click.on(INPUT_SERIAL),
                      Enter.theValue(registros.get(0).getSerial())
                      .into(INPUT_SERIAL),
                     Click.on(INPUT_CLIENTE),
                     Enter.theValue(registros.get(0).getCliente())
                             .into(INPUT_CLIENTE),
                     Click.on(INPUT_TELEFONO),
                     Enter.theValue(registros.get(0).getTelefono())
                             .into(INPUT_TELEFONO),
                     Click.on(INPUT_DIRECCCION),
                     Enter.theValue(registros.get(0).getDireccion())
                             .into(INPUT_DIRECCCION),
                     /*
                     Click.on(INPUT_CIUDAD),
                     Enter.theValue(registros.get(0).getCuidad())
                             .into(INPUT_CIUDAD),*/
                     Click.on(INPUT_DESCRIPCION),
                     Enter.theValue(registros.get(0).getDescripcion())
                             .into(INPUT_DESCRIPCION),
                     Click.on(INPUT_ADJUNTOS),
                     Enter.theValue(registros.get(0).getAdjuntos())
                             .into(INPUT_ADJUNTOS),
                     Click.on(BTN_CREAR)
             );

         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         };


     }
}
