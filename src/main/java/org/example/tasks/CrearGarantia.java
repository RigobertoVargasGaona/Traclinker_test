package org.example.tasks;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.DatosGarantias;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.PaginaProductos.*;
import static org.example.userinterfaces.garantias.*;
import static org.example.userinterfaces.garantias.BOTON_CONFIRMAR;

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
        String suffix =
                System.currentTimeMillis() + String.format("%03d", ThreadLocalRandom.current().nextInt(1000));
        String serialUnico = registros.get(0).getSerial() + suffix;
        String telefonoUnico = registros.get(0).getTelefono() + suffix;

        try {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_MODULO_PRODUCTOS, isVisible()).forNoMoreThan(1).seconds(),
                    Click.on(BOTON_MODULO_PRODUCTOS),

                    WaitUntil.the(BOTON_CREAR_PRODUCTO, isVisible()).forNoMoreThan(15).seconds(),
                    Click.on(BOTON_CREAR_PRODUCTO),

                    Click.on(MENU_ORDENES_DE_ENTRADA),
                    Click.on(OPCION_MENU_ORDENES_DE_ENTRADA),

                    Click.on(MENU_SUBCATEGORIAS),
                    Click.on(OPCION_MENU_SUBCATEGORIAS),

                    Click.on(MENU_MARCAS),
                    Click.on(OPCION_MENU_MARCAS),

                    Click.on(MENU_MODELOS),
                    Click.on(OPCION_MENU_MODELOS),

                    Click.on(CAMPO_SERIALES),
                    Enter.theValue(serialUnico).into(CAMPO_SERIALES).thenHit(Keys.ENTER),

                    Click.on(MENU_TIEMPOS_DE_GARANTIA),
                    Click.on(OPCION_MENU_TIEMPOS_DE_GARANTIA),

                    Click.on(BOTON_CONFIRMAR),
                    WaitUntil.the(BOTON_VOLVER_PAGINA, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(BOTON_VOLVER_PAGINA)
            );

            Thread.sleep(10000);

            actor.attemptsTo(Click.on(BTN_GARANTIAS));
            Thread.sleep(2000);

            actor.attemptsTo(
                    Click.on(BTN_AGREGAR_GARANTIA),

                    Click.on(INPUT_SERIAL),
                    Enter.theValue(serialUnico)
                            .into(INPUT_SERIAL),

                    Click.on(MENU_CLIENTE),
                    Click.on(OPCION_MENU_CLIENTE),

                    Click.on(INPUT_TELEFONO),
                    Enter.theValue(telefonoUnico)
                            .into(INPUT_TELEFONO),

                    Click.on(INPUT_DIRECCCION),
                    Enter.theValue(registros.get(0).getDireccion())
                            .into(INPUT_DIRECCCION),

                    Click.on(INPUT_CIUDAD),
                    Click.on(BTN_ITEM_CIUDAD(registros.get(0).getCiudad())),

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
        }
    }
}
