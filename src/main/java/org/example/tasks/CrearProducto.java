package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.CrearProductoModelo;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.PaginaProductos.*;

public class CrearProducto implements Task {

    private List<CrearProductoModelo> datos;

    public CrearProducto(List<CrearProductoModelo> datos) {
        this.datos = datos;
    }

    public static CrearProducto crearProducto(List<CrearProductoModelo> datos) {
        return new CrearProducto(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(BOTON_MODULO_PRODUCTOS, isVisible())
                    .forNoMoreThan(1).seconds(),
            Click.on(BOTON_MODULO_PRODUCTOS),

            WaitUntil.the(BOTON_CREAR_PRODUCTO, isVisible())
                    .forNoMoreThan(15).seconds(),
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
            Enter.theValue(datos.get(0).getSerial()).into(CAMPO_SERIALES).thenHit(Keys.ENTER),

            Click.on(MENU_TIEMPOS_DE_GARANTIA),
            Click.on(OPCION_MENU_TIEMPOS_DE_GARANTIA),

            Click.on(BOTON_CONFIRMAR)
        );
    }
}
