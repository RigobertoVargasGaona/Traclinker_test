package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.models.CategoriaData;
import org.example.userinterfaces.CategoriaPage;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CrearCategoria implements Task {

    private List<CategoriaData> datos;

    public CrearCategoria(List<CategoriaData> datos) {
        this.datos = datos;
    }

    public static CrearCategoria crearCategoria(List<CategoriaData> datos) {
        return new CrearCategoria(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String suffix =
                System.currentTimeMillis() + String.format("%03d", ThreadLocalRandom.current().nextInt(1000));
        String nombreUnico = datos.get(0).getNombreCategoria() + suffix;

        actor.attemptsTo(
                Click.on(CategoriaPage.BOTON_CATEGORIAS),

                Click.on(CategoriaPage.BOTON_CREAR_CATEGORIA),

                Click.on(CategoriaPage.INPUT_NOMBRE_CATEGORIA),
                Enter.theValue(nombreUnico)
                        .into(CategoriaPage.INPUT_NOMBRE_CATEGORIA),

                Click.on(CategoriaPage.INPUT_DESCRIPCION_CATEGORIA),
                Enter.theValue(nombreUnico)
                        .into(CategoriaPage.INPUT_DESCRIPCION_CATEGORIA),

                Click.on(CategoriaPage.BTN_GUARDAR_CATEGORIA)

        );

    }

}