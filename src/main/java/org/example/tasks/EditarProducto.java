package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.EditarProductoModelo;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.PaginaProductos.*;

public class EditarProducto implements Task {

    private List<EditarProductoModelo> datos;

    public EditarProducto(List<EditarProductoModelo> datos) {
        this.datos = datos;
    }

    public static EditarProducto editarProducto(List<EditarProductoModelo> datos) {
        return new EditarProducto(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(BOTON_MODULO_PRODUCTOS, isVisible())
                    .forNoMoreThan(1).seconds(),
            Click.on(BOTON_MODULO_PRODUCTOS),

            WaitUntil.the(BOTON_EDITAR_PRODUCTO, isVisible())
                    .forNoMoreThan(15).seconds(),
            Click.on(BOTON_EDITAR_PRODUCTO),

            Click.on(CAMPO_SERIAL),
            Enter.theValue(datos.get(0).getSerial()).into(CAMPO_SERIAL),

            Click.on(BOTON_CONFIRMAR)
        );
    }
}
